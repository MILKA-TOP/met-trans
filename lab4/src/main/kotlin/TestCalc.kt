import gen.calc.CalculatorLexer
import gen.calc.CalculatorParser

fun main() {
    correctParserTests()
    errorParserTest()
}

private fun correctParserTests() {
    completeParserTest("0", 0)
    completeParserTest(" 0   ", 0)
    completeParserTest("1+1", 2)
    completeParserTest("1-2-3", -4)
    completeParserTest("1-2*3+4", -1)
    completeParserTest("2*3*4", 24)
    completeParserTest("(0)", 0)
    completeParserTest("(((((((((0)))))))))", 0)
    completeParserTest("2/(2-1)", 2)
    completeParserTest("2/(2-1)/(2)", 1)
}

private fun errorParserTest() {
    completeParserTest("", isError = true)
    completeParserTest("+", isError = true)
    completeParserTest("1+", isError = true)
    completeParserTest("1/", isError = true)
    completeParserTest("1//", isError = true)
    completeParserTest("1/*", isError = true)
    completeParserTest("1/0", isError = true)
    completeParserTest("(()", isError = true)
    completeParserTest("2+3((4)+1))", isError = true)
}

private fun completeParserTest(expression: String, value: Int = 0, isError: Boolean = false) {
    if (isError) {
        try {
            CalculatorParser(CalculatorLexer(expression)).eState()
            println("!!!! CANT FIND ERROR: `$expression`")
        } catch (e: Exception) {
            println("COMPLETE ERROR PARSER TEST: `$expression` : ${e.message}")
            return
        }
    } else {
        if (value == CalculatorParser(CalculatorLexer(expression)).eState().value) {
            println("COMPLETE PARSER TEST: `$expression = $value`")
        } else {
            throw Exception("ERROR IN THE `$expression`")
        }
    }
}

