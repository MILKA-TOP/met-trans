package gen.reg

enum class RegToken(
    var termName: String = "",
    var termValue: String = "",
    termRegexp: Regex = Regex("")) {
	OR("OR", "\\|", Regex("\\|")),
	PLUS("PLUS", "\\+", Regex("\\+")),
	QUESTION("QUESTION", "\\?", Regex("\\?")),
	MINUS("MINUS", "-", Regex("-")),
	MULT("MULT", "\\*", Regex("\\*")),
	LB("LB", "\\(", Regex("\\(")),
	RB("RB", "\\)", Regex("\\)")),
	ALP("ALP", "[a-z]", Regex("[a-z]")),
	EPS("EPS", "_EPS_", Regex("_EPS_")),
    END("END","",Regex(""))
    ;

    companion object {
        val TOKEN_LIST = listOf<Pair<Regex, RegToken >>(
			Pair(Regex("\\|"), OR),
			Pair(Regex("\\+"), PLUS),
			Pair(Regex("\\?"), QUESTION),
			Pair(Regex("-"), MINUS),
			Pair(Regex("\\*"), MULT),
			Pair(Regex("\\("), LB),
			Pair(Regex("\\)"), RB),
			Pair(Regex("[a-z]"), ALP),
			Pair(Regex("_EPS_"), EPS),
        )
    }
}