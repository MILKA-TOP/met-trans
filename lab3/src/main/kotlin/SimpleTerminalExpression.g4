grammar SimpleTerminalExpression;

prog:   (line)* EOF;
line:   ALPS EQUAL expr LINE_END;

expr   : multDivOp (PLUS|MINUS) expr
       | multDivOp;

multDivOp   : term (MULT|DIV) multDivOp
            | term;

term   : LB expr RB
       | ALPS
       | INT;


EQUAL   : '=' ;
LINE_END: ';' ;

PLUS    : '+' ;
MINUS   : '-' ;

MULT    : '*' ;
DIV     : '/' ;

LB      : '(' ;
RB      : ')' ;

INT     : [0-9]+ ;
ALPS    : [a-zA-Z]+;
WS      : [ \r\t\n]+ -> skip;