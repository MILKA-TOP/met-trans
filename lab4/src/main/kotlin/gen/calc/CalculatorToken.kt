package gen.calc

enum class CalculatorToken(
    var termName: String = "",
    var termValue: String = "",
    termRegexp: Regex = Regex("")) {
	EQUAL("EQUAL", "=", Regex("=")),
	LINE_END("LINE_END", ";", Regex(";")),
	PLUS("PLUS", "\\+", Regex("\\+")),
	MINUS("MINUS", "-", Regex("-")),
	MULT("MULT", "\\*", Regex("\\*")),
	POW("POW", "\\*\\*", Regex("\\*\\*")),
	DIV("DIV", "/", Regex("/")),
	LB("LB", "\\(", Regex("\\(")),
	RB("RB", "\\)", Regex("\\)")),
	INT("INT", "[0-9]+", Regex("[0-9]+")),
	ALPS("ALPS", "[a-zA-Z]+", Regex("[a-zA-Z]+")),
	EPS("EPS", "_EPS_", Regex("_EPS_")),
    END("END","",Regex(""))
    ;

    companion object {
        val TOKEN_LIST = listOf<Pair<Regex, CalculatorToken >>(
			Pair(Regex("="), EQUAL),
			Pair(Regex(";"), LINE_END),
			Pair(Regex("\\+"), PLUS),
			Pair(Regex("-"), MINUS),
			Pair(Regex("\\*"), MULT),
			Pair(Regex("\\*\\*"), POW),
			Pair(Regex("/"), DIV),
			Pair(Regex("\\("), LB),
			Pair(Regex("\\)"), RB),
			Pair(Regex("[0-9]+"), INT),
			Pair(Regex("[a-zA-Z]+"), ALPS),
			Pair(Regex("_EPS_"), EPS),
        )
    }
}