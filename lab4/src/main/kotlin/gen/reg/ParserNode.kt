package gen.reg

data class ParserNode(
    val tokenName: String,
    var value: String = "",
    val tokenChildren: MutableList<ParserNode> = mutableListOf(),
    var tokenValue: String = "")