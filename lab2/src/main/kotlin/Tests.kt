import analyzer.Parser
import util.draw

fun main() {
    completeTest("", "empty-input.png")
    completeTest("()", "empty-brackets.png")
    completeTest("a", "single-symbol.png")
    completeTest("ab", "concat-easy.png")
    completeTest("a()", "concat-brackets.png")
    completeTest("a(b)", "concat-symbol-brackets.png")
    completeTest("a(b)*", "kleene-brackets.png")
    completeTest("ab*", "kleene-symbol.png")
    completeTest("a|b", "or-easy.png")
    completeTest("a|b*", "or-with-kleene.png")
    completeTest("(a|b)*", "or-kleene-brackets.png")
    completeTest("(a|b)*()", "concat-double-brackets.png")
    completeTest("(a|b)*()(())", "concat-triple-brackets.png")
    completeTest("((abc*b|a)*ab(aa|b*)b)*", "variant-test.png")
    completeTest("(((((((((((((((((((((((((())))))))))))))))))))))))))", "a-lot-of-brackets.png")

    completeTest("1", "unknown-symbol-single.png", true)
    completeTest("a1", "unknown-symbol.png", true)
    completeTest("a**", "double-kleene.png", true)
    completeTest("a||", "double-or.png", true)
    completeTest("a(", "opened-bracket.png", true)
    completeTest("a())", "more-close-brackets.png", true)
    completeTest("a((((())", "strange-brackets.png", true)
    completeTest("a(*)", "kleene-int-brackets.png", true)
}

private fun completeTest(regString: String, filePath: String, isWithError: Boolean = false) {
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

    println("COMPLETE: $regString")
}

const val TEST_DIR = "tests/"