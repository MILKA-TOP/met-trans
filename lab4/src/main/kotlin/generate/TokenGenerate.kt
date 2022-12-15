package generate

import models.GrammarData
import java.io.File

class TokenGenerate {

    fun createTokenClass(data: GrammarData, path: String, packageName: String) {
        if (!File(path).exists()) {
            File(path).createNewFile()
        }

        val className = "${data.name}Token"
        val writePath = "$path$className.kt"

        var enumText = ""
        var compObject = ""

        for (term in data.terminalList) {
            val currName = term.name
            val currValue = term.value
            enumText += "\t$currName(\"$currName\", \"$currValue\", Regex(\"$currValue\")),\n"
            compObject += "\t\t\tPair(Regex(\"$currValue\"), $currName),\n"
        }

        val fileText = "package $packageName\n\n" +
                "enum class $className(\n" +
                "    var termName: String = \"\",\n" +
                "    var termValue: String = \"\",\n" +
                "    termRegexp: Regex = Regex(\"\")) {\n$enumText" +
                "    END(\"END\",\"\",Regex(\"\"))\n" +
                "    ;\n" +
                "\n" +
                "    companion object {\n" +
                "        val TOKEN_LIST = listOf<Pair<Regex, $className >>(\n$compObject" +
                "        )\n" +
                "    }\n" +
                "}"

        File(writePath).writeText(fileText)
    }
}