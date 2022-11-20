grammar SimpleTerminalExpression;

prog:   (line)* EOF;
line:   ALPS EQUAL expr LINE_END;

expr     : multDivOp exprPoint;

exprPoint:
       | PLUS multDivOp exprPoint
       | MINUS multDivOp exprPoint;

multDivOp      : powOp multDivOpPoint;

multDivOpPoint :
       | MULT powOp multDivOpPoint
       | DIV  powOp multDivOpPoint;

powOp      : term powOpPoint;

powOpPoint :
       | POW term powOpPoint;

term   : LB expr RB
       | LB MINUS expr RB
       | ALPS
       | INT;


EQUAL   : '=' ;
LINE_END: ';' ;

PLUS    : '+' ;
MINUS   : '-' ;

MULT    : '*' ;
DIV     : '/' ;

POW     : '**';

LB      : '(' ;
RB      : ')' ;

INT     : [0-9]+ ;
ALPS    : [a-zA-Z]+;
WS      : [ \r\t\n]+ -> skip;