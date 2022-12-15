package gen.calc

data class ParserNode(
    val tokenName: String,
    var value: Int = 0,
    val tokenChildren: MutableList<ParserNode> = mutableListOf(),
    var tokenValue: String = "")