package gen.calc

data class ParserNode(
    val tokenName: String,
    var value: Double = 0.0,
    val tokenChildren: MutableList<ParserNode> = mutableListOf(),
    var tokenValue: String = "")