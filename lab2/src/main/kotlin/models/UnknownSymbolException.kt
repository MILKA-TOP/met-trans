package models

class UnknownSymbolException(
    private val s: String? = null,
    private val symbol: Char? = null
) : Exception(s) {

    override val message: String
        get() = "${s?.let { "$s\n" }.orEmpty()}Caught unknown symbol ${symbol?.let { ": $it" }}"

}