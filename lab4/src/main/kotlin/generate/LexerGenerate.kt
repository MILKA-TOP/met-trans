package generate

import models.GrammarData
import java.io.File

class LexerGenerate {

    fun createLexerClass(data: GrammarData, path: String, packageName: String) {
        if (!File(path).exists()) {
            File(path).mkdir()
        }

        val lexerName = "${data.name}Lexer"
        val tokenName = "${data.name}Token"
        val writePath = "$path$lexerName.kt"

        var regText = ""

        for (term in data.terminalList) {
            val currValue = term.value
            regText += "$currValue|"
        }
        if (regText.isNotEmpty()) regText = regText.removeSuffix("|")

        val fileText = "package $packageName\n\n" +
                "import java.text.ParseException\n" +
                "class $lexerName(private val text: String) {\n" +
                "\n" +
                "    private val tokenRegex = \"$regText\".toRegex()\n" +
                "\n" +
                "    private lateinit var tokens: $tokenName\n" +
                "    private var matcher: MatchResult? = null\n" +
                "    private var pos: Int = 0\n" +
                "    private lateinit var currToken: $tokenName\n" +
                "\n" +
                "    init {\n" +
                "        matcher = tokenRegex.find(text, 0)\n" +
                "        nextToken()\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    fun nextToken(): $tokenName {\n" +
                "        if (matcher == null) {\n" +
                "           currToken = $tokenName.END\n" +
                "           return $tokenName.END\n" +
                "        }\n" +
                "        while (pos < text.length && text[pos].isWhitespace()) pos++\n" +
                "        if (matcher!!.range.first != pos) throw ParseException(text, pos)\n" +
                "\n" +
                "        var currentValue = matcher!!.value\n" +
                "        var currentPushed = currentValue\n" +
                "        /*while (tokenRegex.matches(currentPushed)) {\n" +
                "            matcher = matcher!!.next()\n" +
                "            if (matcher == null) break\n" +
                "\n" +
                "            val deltaText = matcher!!.value\n" +
                "            currentValue = currentPushed\n" +
                "            currentPushed += deltaText\n" +
                "        }*/\n" +
                "        for (checkedToken in $tokenName.TOKEN_LIST) {\n" +
                "            if (checkedToken.first.matches(currentValue)) {\n" +
                "                val matchedText = matcher!!.value\n" +
                "                pos += currentValue.length\n" +
                "                matcher = matcher!!.next()\n" +
                "                currToken = $tokenName.valueOf(checkedToken.second.termName).apply { termValue = matchedText }\n" +
                "                return currToken\n" +
                "            }\n" +
                "        }\n" +
                "        throw ParseException(text, pos)\n" +
                "    }\n" +
                "    fun currentToken(): $tokenName = currToken\n" +
                "    fun currentPos(): Int = pos\n" +
                "}"

        File(writePath).writeText(fileText)
    }
}