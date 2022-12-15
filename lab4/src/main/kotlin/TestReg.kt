import gen.reg.RegLexer
import gen.reg.RegParser

fun main() {
    correctParserTests()
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

private fun completeParserTest(regString: String, filePath: String, isWithError: Boolean = false) {
    val testAction: () -> Unit = {
        val resultTree = RegParser(RegLexer(regString)).eState()
        resultTree.draw("$TEST_DIR$filePath")
    }

    testAction()
    println("COMPLETE PARSER TEST: $regString")
}

const val TEST_DIR = "tests/reg/"