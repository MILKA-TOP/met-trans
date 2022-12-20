import gen.calc.*

fun main() {
    val line = "1-2-3"
    val lexer = CalculatorLexer(line)
    println(CalculatorParser(lexer).eState().value)
}