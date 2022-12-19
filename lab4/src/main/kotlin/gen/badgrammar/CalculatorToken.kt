package gen.badgrammar

enum class CalculatorToken(
    var termName: String = "",
    var termValue: String = "",
    termRegexp: Regex = Regex("")) {
	A("A", "a", Regex("a")),
	B("B", "b", Regex("b")),
	EPS("EPS", "_EPS_", Regex("_EPS_")),
    END("END","",Regex(""))
    ;

    companion object {
        val TOKEN_LIST = listOf<Pair<Regex, CalculatorToken >>(
			Pair(Regex("a"), A),
			Pair(Regex("b"), B),
			Pair(Regex("_EPS_"), EPS),
        )
    }
}