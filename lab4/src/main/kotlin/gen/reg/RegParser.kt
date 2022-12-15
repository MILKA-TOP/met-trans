package gen.reg


import java.text.ParseException

class RegParser(val lexer: RegLexer) {

	fun eState(): ParserNode {
		var res = ParserNode("e", tokenValue = lexer.currentToken().termValue)
		
		when (lexer.currentToken()) {
			RegToken.ALP -> {
				var t = tState()
				res.tokenChildren.add(t)
				
				var e = eState()
				res.tokenChildren.add(e)
				
			}
			RegToken.LB -> {
				var t = tState()
				res.tokenChildren.add(t)
				
				var e = eState()
				res.tokenChildren.add(e)
				
			}
			RegToken.RB -> {
			}
			RegToken.END -> {
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

	fun tState(): ParserNode {
		var res = ParserNode("t", tokenValue = lexer.currentToken().termValue)
		
		when (lexer.currentToken()) {
			RegToken.ALP -> {
				var d = dState()
				res.tokenChildren.add(d)
				
				var tPoint = tPointState()
				res.tokenChildren.add(tPoint)
				
			}
			RegToken.LB -> {
				var d = dState()
				res.tokenChildren.add(d)
				
				var tPoint = tPointState()
				res.tokenChildren.add(tPoint)
				
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

	fun tPointState(): ParserNode {
		var res = ParserNode("tPoint", tokenValue = lexer.currentToken().termValue)
		
		when (lexer.currentToken()) {
			RegToken.OR -> {
				var OR = ParserNode("OR", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(OR)
				lexer.nextToken()
				
				var d = dState()
				res.tokenChildren.add(d)
				
			}
			RegToken.RB -> {
			}
			RegToken.END -> {
			}
			RegToken.ALP -> {
			}
			RegToken.LB -> {
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

	fun dState(): ParserNode {
		var res = ParserNode("d", tokenValue = lexer.currentToken().termValue)
		
		when (lexer.currentToken()) {
			RegToken.ALP -> {
				var f = fState()
				res.tokenChildren.add(f)
				
				var dPoint = dPointState()
				res.tokenChildren.add(dPoint)
				
			}
			RegToken.LB -> {
				var f = fState()
				res.tokenChildren.add(f)
				
				var dPoint = dPointState()
				res.tokenChildren.add(dPoint)
				
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

	fun dPointState(): ParserNode {
		var res = ParserNode("dPoint", tokenValue = lexer.currentToken().termValue)
		
		when (lexer.currentToken()) {
			RegToken.MULT -> {
				var MULT = ParserNode("MULT", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(MULT)
				lexer.nextToken()
				
			}
			RegToken.PLUS -> {
				var PLUS = ParserNode("PLUS", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(PLUS)
				lexer.nextToken()
				
			}
			RegToken.QUESTION -> {
				var QUESTION = ParserNode("QUESTION", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(QUESTION)
				lexer.nextToken()
				
			}
			RegToken.RB -> {
			}
			RegToken.OR -> {
			}
			RegToken.END -> {
			}
			RegToken.ALP -> {
			}
			RegToken.LB -> {
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

	fun fState(): ParserNode {
		var res = ParserNode("f", tokenValue = lexer.currentToken().termValue)
		
		when (lexer.currentToken()) {
			RegToken.LB -> {
				var LB = ParserNode("LB", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(LB)
				lexer.nextToken()
				
				var e = eState()
				res.tokenChildren.add(e)
				
				var RB = ParserNode("RB", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(RB)
				lexer.nextToken()
				
			}
			RegToken.ALP -> {
				var ALP = ParserNode("ALP", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(ALP)
				lexer.nextToken()
				
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

}