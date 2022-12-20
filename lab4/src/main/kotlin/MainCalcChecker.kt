import gen.calc.*

fun main() {
    val line = "8//(2)"
    val lexer = CalculatorLexer(line)
    println(CalculatorParser(lexer).eState().value)
}