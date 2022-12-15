package gen.calc


import java.text.ParseException

class CalculatorParser(val lexer: CalculatorLexer) {

	fun eState(): ParserNode {
		var res = ParserNode("e", tokenValue = lexer.currentToken().termValue)
		
		when (lexer.currentToken()) {
			CalculatorToken.LB -> {
				var t = tState()
				res.tokenChildren.add(t)
				
				var ePoint = ePointState(t.value)
				res.tokenChildren.add(ePoint)
				res.value = ePoint.value
			}
			CalculatorToken.INT -> {
				var t = tState()
				res.tokenChildren.add(t)
				
				var ePoint = ePointState(t.value)
				res.tokenChildren.add(ePoint)
				res.value = ePoint.value
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

	fun ePointState(count : Int): ParserNode {
		var res = ParserNode("ePoint", tokenValue = lexer.currentToken().termValue)
		res.value = count
		when (lexer.currentToken()) {
			CalculatorToken.PLUS -> {
				var PLUS = ParserNode("PLUS", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(PLUS)
				lexer.nextToken()
				
				var t = tState()
				res.tokenChildren.add(t)
				
				var ePoint = ePointState(count + t.value)
				res.tokenChildren.add(ePoint)
				res.value = ePoint.value
			}
			CalculatorToken.MINUS -> {
				var MINUS = ParserNode("MINUS", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(MINUS)
				lexer.nextToken()
				
				var t = tState()
				res.tokenChildren.add(t)
				
				var ePoint = ePointState(count - t.value)
				res.tokenChildren.add(ePoint)
				res.value = ePoint.value
			}
			CalculatorToken.RB -> {
			}
			CalculatorToken.END -> {
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

	fun tState(): ParserNode {
		var res = ParserNode("t", tokenValue = lexer.currentToken().termValue)
		
		when (lexer.currentToken()) {
			CalculatorToken.LB -> {
				var f = fState()
				res.tokenChildren.add(f)
				
				var tPoint = tPointState(f.value)
				res.tokenChildren.add(tPoint)
				res.value = tPoint.value
			}
			CalculatorToken.INT -> {
				var f = fState()
				res.tokenChildren.add(f)
				
				var tPoint = tPointState(f.value)
				res.tokenChildren.add(tPoint)
				res.value = tPoint.value
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

	fun tPointState(count : Int): ParserNode {
		var res = ParserNode("tPoint", tokenValue = lexer.currentToken().termValue)
		res.value = count
		when (lexer.currentToken()) {
			CalculatorToken.MULT -> {
				var MULT = ParserNode("MULT", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(MULT)
				lexer.nextToken()
				
				var f = fState()
				res.tokenChildren.add(f)
				
				var tPoint = tPointState(count * f.value)
				res.tokenChildren.add(tPoint)
				res.value = tPoint.value
			}
			CalculatorToken.DIV -> {
				var DIV = ParserNode("DIV", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(DIV)
				lexer.nextToken()
				
				var f = fState()
				res.tokenChildren.add(f)
				
				var tPoint = tPointState(count / f.value)
				res.tokenChildren.add(tPoint)
				res.value = tPoint.value
			}
			CalculatorToken.RB -> {
			}
			CalculatorToken.END -> {
			}
			CalculatorToken.PLUS -> {
			}
			CalculatorToken.MINUS -> {
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

	fun fState(): ParserNode {
		var res = ParserNode("f", tokenValue = lexer.currentToken().termValue)
		
		when (lexer.currentToken()) {
			CalculatorToken.LB -> {
				var LB = ParserNode("LB", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(LB)
				lexer.nextToken()
				
				var e = eState()
				res.tokenChildren.add(e)
				res.value = e.value
				var RB = ParserNode("RB", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(RB)
				lexer.nextToken()
				
			}
			CalculatorToken.INT -> {
				var INT = ParserNode("INT", tokenValue = lexer.currentToken().termValue)
				res.tokenChildren.add(INT)
				lexer.nextToken()
				res.value = INT.tokenValue.toInt()
			}


			else -> throw ParseException("Incorrect token: '${lexer.currentToken().termName}'", lexer.currentPos())
		}
		return res
	}

}