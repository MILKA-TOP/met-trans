import analyzer.Parser
import util.draw


fun main() {

    val line = "((abc*b|a)*ab(aa|b*)b)*"
    Parser().parse(line).draw()
}