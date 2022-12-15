package generate

import models.GrammarData
import models.NonTerminalState
import models.RuleTarget
import java.io.File

class ParserGenerate(private val firstAndFollow: FirstFollowGenerate) {

    private val sp: String = "State"

    fun createParserClass(data: GrammarData, path: String, packageName: String) {
        generateNodeFile(data, path, packageName)
        generateParserFile(data, path, packageName)
    }

    private fun generateNodeFile(data: GrammarData, path: String, packageName: String) {
        if (!File(path).exists()) {
            File(path).mkdir()
        }

        val writePath = "${path}ParserNode.kt"

        val fileText = "package $packageName\n\n" +
                "data class ParserNode(\n" +
                "    val tokenName: String,\n" +
                "    var value: ${data.defaultType} = ${data.defaultArg},\n" +
                "    val tokenChildren: MutableList<ParserNode> = mutableListOf(),\n" +
                "    var tokenValue: String = \"\"" +
                ")"

        File(writePath).writeText(fileText)
    }

    private fun generateParserFile(data: GrammarData, path: String, packageName: String) {
        if (!File(path).exists()) {
            File(path).mkdir()
        }

        val lexerName = "${data.name}Lexer"
        val tokenName = "${data.name}Token"
        val parserName = "${data.name}Parser"
        val writePath = "$path$parserName.kt"


        var fileText = ""

        fileText += getParserHead(data, lexerName, parserName, packageName)
        fileText += getFunctionsBody(data, lexerName, parserName, tokenName) + "}"

        File(writePath).writeText(fileText)
    }

    private fun getParserHead(data: GrammarData, lexerName: String, parserName: String, packageName: String): String =
        "package $packageName\n\n" +
        "${data.header}\n" +
                "import java.text.ParseException\n\n" +
                "class $parserName(val lexer: $lexerName) {\n\n"

    private fun getFunctionsBody(data: GrammarData, lexerName: String, parserName: String, tokenName: String): String {
        var outputBodies = ""

        data.nonTerminalList.forEach {
            outputBodies += generateFunctionBody(data, it, tokenName)
        }
        return outputBodies + ""
    }

    private fun generateFunctionBody(data: GrammarData, nonTerminalState: NonTerminalState, tokenName: String): String {
        var outputBody = ""
        val functionArg =
            if (nonTerminalState.argName.isNotEmpty()) "${nonTerminalState.argName} : ${nonTerminalState.argClass}" else ""

        val resSetLine =
            if (nonTerminalState.argName.isNotEmpty()) "res.value = ${nonTerminalState.argName}" else ""

        var stateInWhenLines = ""
        for (rule in nonTerminalState.targets) {
            stateInWhenLines += getStateLines(data, nonTerminalState, rule, tokenName)
        }
        return "\tfun ${nonTerminalState.name}$sp($functionArg): ParserNode {\n" +
                "\t\tvar res = ParserNode(\"${nonTerminalState.name}\", tokenValue = lexer.currentToken().termValue)\n" +
                "\t\t$resSetLine\n" +
                "\t\twhen (lexer.currentToken()) {\n" +
                "$stateInWhenLines\n" +
                "\n" +
                "\t\t\telse -> throw ParseException(\"Incorrect token: '\${lexer.currentToken().termName}'\", lexer.currentPos())\n" +
                "\t\t}\n" +
                "\t\treturn res\n" +
                "\t}\n\n"
    }

    private fun getStateLines(
        data: GrammarData,
        nonTerminalState: NonTerminalState,
        targets: RuleTarget,
        tokenName: String
    ): String {
        val nextTargetName = targets.statesList.first().name
        val first = if (data.terminalList.find { it.name == nextTargetName } != null) {
            hashSetOf(nextTargetName)
        } else {
            firstAndFollow.firstMap[nextTargetName]!!
        }
        val follow = firstAndFollow.followMap[nonTerminalState.name]!!
        var firstLines = ""
        for (currFirst in first) {
            if (currFirst == FirstFollowGenerate._EPS) continue
            val functionStateBodyRule = getFunctionStateBodyRule(data, targets)
            firstLines += "\t\t\t$tokenName.${currFirst} -> {\n$functionStateBodyRule\t\t\t}\n"
        }

        follow.removeAll { it in first }
        if (first.contains(FirstFollowGenerate._EPS)) {
            for (currFollow in follow) {
                val currTokenName = if (currFollow == FirstFollowGenerate._DOLLAR) "END" else currFollow
                val functionStateBodyRule = ""
                firstLines += "\t\t\t$tokenName.$currTokenName -> {\n$functionStateBodyRule\t\t\t}\n"
            }
        }

        return firstLines
    }

    private fun getFunctionStateBodyRule(data: GrammarData, targets: RuleTarget): String {
        var outputString = ""
        for (currTarget in targets.statesList) {
            outputString += if (data.terminalList.find { it.name == currTarget.name } != null) {
                "\t\t\t\tvar ${currTarget.name} = ParserNode(\"${currTarget.name}\", tokenValue = lexer.currentToken().termValue)\n" +
                        "\t\t\t\tres.tokenChildren.add(${currTarget.name})\n" +
                        "\t\t\t\tlexer.nextToken()\n" +
                        "\t\t\t\t${currTarget.code}\n"


            } else {
                "\t\t\t\tvar ${currTarget.name} = ${currTarget.name}$sp(${currTarget.parameter})\n" +
                        "\t\t\t\tres.tokenChildren.add(${currTarget.name})\n" +
                        "\t\t\t\t${currTarget.code}\n"
            }
        }
        return outputString
    }
}