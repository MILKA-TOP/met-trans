package models.exceptions

class ParserStateException(private val currToken: String, private val currState: String, s: String? = null) :
    Exception(s) {
    override val message: String
        get() = "Illegal token `$currToken` in this state: $currState"
}