import analyzer.LexicalAnalyzer
import analyzer.Parser
import models.Token
import models.Tree
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

    completeParserTest("a(b)+", "plus-brackets.png")
    completeParserTest("a(b)?", "ques-brackets.png")
    completeParserTest("a|b+", "or-with-plus.png")
    completeParserTest("a|b?", "or-with-ques.png")
    completeParserTest("(a|b)+", "or-plus-brackets.png")
    completeParserTest("(a|b)?", "or-ques-brackets.png")
    completeParserTest("(a|b)+()", "concat-double-brackets-plus.png")
    completeParserTest("(a|b)?()", "concat-double-brackets-quest.png")
}

private fun errorParserTests() {
    completeParserTest("1", "unknown-symbol-single.png", true)
    completeParserTest("a1", "unknown-symbol.png", true)
    completeParserTest("a**", "double-kleene.png", true)
    completeParserTest("a++", "double-plus.png", true)
    completeParserTest("a??", "double-quest.png", true)
    completeParserTest("a||", "double-or.png", true)
    completeParserTest("a(", "opened-bracket.png", true)
    completeParserTest("a())", "more-close-brackets.png", true)
    completeParserTest("a((((())", "strange-brackets.png", true)
    completeParserTest("a(*)", "kleene-int-brackets.png", true)
    completeParserTest("a(+)", "plus-int-brackets.png", true)
    completeParserTest("a(?)", "quest-int-brackets.png", true)
}

private fun correctLexicalAnalyzerTest() {
    completeAnalyzerTest("", listOf(Token.END))
    completeAnalyzerTest("()", listOf(Token.LPAREN, Token.RPAREN, Token.END))
    completeAnalyzerTest("a", listOf(Token.SYMBOL, Token.END))
    completeAnalyzerTest("a*", listOf(Token.SYMBOL, Token.KLEENE, Token.END))
    completeAnalyzerTest("a+", listOf(Token.SYMBOL, Token.PLUS, Token.END))
    completeAnalyzerTest("a?", listOf(Token.SYMBOL, Token.QUESTION, Token.END))
    completeAnalyzerTest("a*|b", listOf(Token.SYMBOL, Token.KLEENE, Token.OR_OPERATION, Token.SYMBOL, Token.END))
    completeAnalyzerTest("a+|b", listOf(Token.SYMBOL, Token.PLUS, Token.OR_OPERATION, Token.SYMBOL, Token.END))
    completeAnalyzerTest("a?|b", listOf(Token.SYMBOL, Token.QUESTION, Token.OR_OPERATION, Token.SYMBOL, Token.END))
    completeAnalyzerTest("(())", listOf(Token.LPAREN, Token.LPAREN, Token.RPAREN, Token.RPAREN, Token.END))
    completeAnalyzerTest(
        "a(b)*", listOf(Token.SYMBOL, Token.LPAREN, Token.SYMBOL, Token.RPAREN, Token.KLEENE, Token.END)
    )
    completeAnalyzerTest(
        "a(b)+", listOf(Token.SYMBOL, Token.LPAREN, Token.SYMBOL, Token.RPAREN, Token.PLUS, Token.END)
    )
    completeAnalyzerTest(
        "a(b)?", listOf(Token.SYMBOL, Token.LPAREN, Token.SYMBOL, Token.RPAREN, Token.QUESTION, Token.END)
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
    val testAction: () -> Unit = {
        val resultTree = Parser().parse(regString)

        val resultSb = StringBuilder()
        updateSb(resultTree, resultSb)
        val resultWithoutEps = resultSb.toString().replace(Parser.EPS, "")
        if (resultWithoutEps != regString) throw Exception("Excepted `$regString, but caught $resultWithoutEps")

        resultTree.draw("$TEST_DIR$filePath")
    }

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

private fun updateSb(currentNode: Tree, sb: StringBuilder) {
    if (currentNode.children.isEmpty()) sb.append(currentNode.node)
    else currentNode.children.forEach { updateSb(it, sb) }
}

const val TEST_DIR = "tests/"