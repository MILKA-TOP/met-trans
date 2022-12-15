import gen.calc.*

fun main() {
    val line = "1+3"
    val lexer = CalculatorLexer(line)
    println(CalculatorParser(lexer).eState().value)
}