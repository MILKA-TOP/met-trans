import gen.calc.CalculatorLexer
import gen.calc.CalculatorParser
import java.util.Scanner

fun main() {
    var inp = ""
    var sc = Scanner(System.`in`)
    while (inp != "q") {
        inp = sc.nextLine()
        println(CalculatorParser(CalculatorLexer(inp)).eState().value)
    }
}