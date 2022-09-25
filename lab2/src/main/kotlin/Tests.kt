import analyzer.LexicalAnalyzer
import analyzer.Parser
import models.Token
import models.exceptions.TestException
import util.draw

fun main() {
    correctLexicalAnalyzerTest()
    correctParserTests()
    errorParserTests()
}

private fun correctParserTests() {
    completeParserTest("", "empty-input.png")
    completeParserTest("()", "empty-brackets.png")
    completeParserTest("a", "single-symbol.png")
    completeParserTest("ab", "concat-easy.png")
    completeParserTest("a()", "concat-brackets.png")
    completeParserTest("a(b)", "concat-symbol-brackets.png")
    completeParserTest("a(b)*", "kleene-brackets.png")
    completeParserTest("ab*", "kleene-symbol.png")
    completeParserTest("a|b", "or-easy.png")
    completeParserTest("a|b*", "or-with-kleene.png")
    completeParserTest("(a|b)*", "or-kleene-brackets.png")
    completeParserTest("(a|b)*()", "concat-double-brackets.png")
    completeParserTest("(a|b)*()(())", "concat-triple-brackets.png")
    completeParserTest("((abc*b|a)*ab(aa|b*)b)*", "variant-test.png")
    completeParserTest("(((((((((((((((((((((((((())))))))))))))))))))))))))", "a-lot-of-brackets.png")
}

private fun errorParserTests() {
    completeParserTest("1", "unknown-symbol-single.png", true)
    completeParserTest("a1", "unknown-symbol.png", true)
    completeParserTest("a**", "double-kleene.png", true)
    completeParserTest("a||", "double-or.png", true)
    completeParserTest("a(", "opened-bracket.png", true)
    completeParserTest("a())", "more-close-brackets.png", true)
    completeParserTest("a((((())", "strange-brackets.png", true)
    completeParserTest("a(*)", "kleene-int-brackets.png", true)
}

private fun correctLexicalAnalyzerTest() {
    completeAnalyzerTest("", listOf(Token.END))
    completeAnalyzerTest("()", listOf(Token.LPAREN, Token.RPAREN, Token.END))
    completeAnalyzerTest("a", listOf(Token.SYMBOL, Token.END))
    completeAnalyzerTest("a*", listOf(Token.SYMBOL, Token.KLEENE, Token.END))
    completeAnalyzerTest("a*|b", listOf(Token.SYMBOL, Token.KLEENE, Token.OR_OPERATION, Token.SYMBOL, Token.END))
    completeAnalyzerTest("(())", listOf(Token.LPAREN, Token.LPAREN, Token.RPAREN, Token.RPAREN, Token.END))
    completeAnalyzerTest(
        "a(b)*", listOf(Token.SYMBOL, Token.LPAREN, Token.SYMBOL, Token.RPAREN, Token.KLEENE, Token.END)
    )
}

private fun completeAnalyzerTest(regString: String, checkList: List<Token>) {
    val analyzer = LexicalAnalyzer(regString.byteInputStream()).also { it.nextToken() }
    checkList.forEach {
        if (analyzer.currElement.token != it)
            throw TestException(regString, it.toString(), analyzer.currElement.token.toString())

        analyzer.nextToken()
    }
    println("COMPLETE ANALYZER TEST: $regString")
}

private fun completeParserTest(regString: String, filePath: String, isWithError: Boolean = false) {
    val testAction: () -> Unit = { Parser().parse(regString).draw("$TEST_DIR$filePath") }

    if (isWithError) {
        try {
            testAction()
        } catch (e: Exception) {
            println("Exception caught: $e")
        }
    } else {
        testAction()
    }

    println("COMPLETE PARSER TEST: $regString")
}

const val TEST_DIR = "tests/"