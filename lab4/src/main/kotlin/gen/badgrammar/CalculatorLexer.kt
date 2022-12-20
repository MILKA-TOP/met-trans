package gen.badgrammar

import java.text.ParseException
class CalculatorLexer(private val text: String) {

    private val tokenRegex = "a|b|_EPS_".toRegex()

    private lateinit var tokens: CalculatorToken
    private var matcher: MatchResult? = null
    private var pos: Int = 0
    private lateinit var currToken: CalculatorToken

    init {
        matcher = tokenRegex.find(text, 0)
        nextToken()
    }


    fun nextToken(): CalculatorToken {
        if (matcher == null) {
           currToken = CalculatorToken.END
           return CalculatorToken.END
        }
        while (pos < text.length && text[pos].isWhitespace()) pos++
        if (matcher!!.range.first != pos) throw ParseException(text, pos)

        var currentValue = matcher!!.value
        for (checkedToken in CalculatorToken.TOKEN_LIST) {
            if (checkedToken.first.matches(currentValue)) {
                val matchedText = matcher!!.value
                pos += currentValue.length
                matcher = matcher!!.next()
                currToken = CalculatorToken.valueOf(checkedToken.second.termName).apply { termValue = matchedText }
                return currToken
            }
        }
        throw ParseException(text, pos)
    }
    fun currentToken(): CalculatorToken = currToken
    fun currentPos(): Int = pos
}