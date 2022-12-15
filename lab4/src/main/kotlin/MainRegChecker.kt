import gen.reg.RegLexer
import gen.reg.RegParser

fun main() {
    val line = "a"
    val lexer = RegLexer(line)
    println(RegParser(lexer).eState().value)
}