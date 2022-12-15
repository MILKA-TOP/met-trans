package gen.reg

import java.text.ParseException
class RegLexer(private val text: String) {

    private val tokenRegex = "\\||\\+|\\?|-|\\*|\\(|\\)|[a-z]|_EPS_".toRegex()

    private lateinit var tokens: RegToken
    private var matcher: MatchResult? = null
    private var pos: Int = 0
    private lateinit var currToken: RegToken

    init {
        matcher = tokenRegex.find(text, 0)
        nextToken()
    }


    fun nextToken(): RegToken {
        if (matcher == null) {
           currToken = RegToken.END
           return RegToken.END
        }
        while (pos < text.length && text[pos].isWhitespace()) pos++
        if (matcher!!.range.first != pos) throw ParseException(text, pos)

        var currentValue = matcher!!.value
        var currentPushed = currentValue
        /*while (tokenRegex.matches(currentPushed)) {
            matcher = matcher!!.next()
            if (matcher == null) break

            val deltaText = matcher!!.value
            currentValue = currentPushed
            currentPushed += deltaText
        }*/
        for (checkedToken in RegToken.TOKEN_LIST) {
            if (checkedToken.first.matches(currentValue)) {
                val matchedText = matcher!!.value
                pos += currentValue.length
                matcher = matcher!!.next()
                currToken = RegToken.valueOf(checkedToken.second.termName).apply { termValue = matchedText }
                return currToken
            }
        }
        throw ParseException(text, pos)
    }
    fun currentToken(): RegToken = currToken
    fun currentPos(): Int = pos
}