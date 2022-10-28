grammar TerminalExpression;

@header {
import java.util.HashMap;
import java.util.Map;
}

@members {
Map<String, Integer> expressionValues = new HashMap<>();
}

prog : (line)* EOF;

line :   ALPS EQUAL res1=expr LINE_END
     {
     String name = $ALPS.text;
     Integer result = $res1.res;
     System.out.println(name + " = " + String.valueOf(result));
     expressionValues.put(name, result);
     }
     ;

expr returns [Integer res] :
      res1=multDivOp PLUS  res2=expr {$res = $res1.res + $res2.res;}
    | res1=multDivOp MINUS res2=expr {$res = $res1.res - $res2.res;}
    | res1=multDivOp {$res = $res1.res;};

multDivOp returns [Integer res] :
      res1=term MULT res2=multDivOp {$res = $res1.res * $res2.res;}
    | res1=term DIV  res2=multDivOp {$res = $res1.res / $res2.res;}
    | res1=term {$res = $res1.res;};

term returns [Integer res] :
      LB res1=expr RB {$res = $res1.res;}
    | ALPS {$res = expressionValues.get($ALPS.text);}
    | INT  {$res = Integer.parseInt($INT.text);};


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