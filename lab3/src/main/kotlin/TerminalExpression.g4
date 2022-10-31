grammar TerminalExpression;

@header {
import java.util.HashMap;
import java.util.Map;
}

@members {
Map<String, Integer> expressionValues = new HashMap<>();
String currentVar = "";
}

prog returns [String out]
@init {
    $out = "";
}: (resl+=line)* EOF
    {
    for (int i = 0; i < $resl.size(); i++) {
        $out += $resl.get(i).res;
    }
    }
    ;

line returns [String res]
@init {
     $res = "";
}:   ALPS EQUAL res1=expr LINE_END
     {
     String output = "";
     String name = $ALPS.text;
     currentVar = name;
     try {
        Integer result = $res1.res;
        output = name + " = " + String.valueOf(result);
        expressionValues.put(name, result);
     } catch (Exception e) {
         output = "Error with this variable: " + name;
     }
     System.out.println(output);
     $res = output + "\n";
     }
     ;

expr returns [Integer res] :
      res1=multDivOp PLUS  res2=expr {$res = $res1.res + $res2.res;}
    | res1=multDivOp MINUS res2=expr {$res = $res1.res - $res2.res;}
    | res1=multDivOp {$res = $res1.res;};

multDivOp returns [Integer res] :
      res1=term MULT res2=multDivOp {$res = $res1.res * $res2.res;}
    | res1=term DIV  res2=multDivOp {
    if ($res2.res == 0) {
        System.out.println("Devision by zero in the variable " + currentVar);
        $res = 0;
    } else {
        $res = $res1.res / $res2.res;
    }
}
    | res1=term {$res = $res1.res;};

term returns [Integer res] :
      LB res1=expr RB {$res = $res1.res;}
    | INT  {$res = Integer.parseInt($INT.text);}
    | ALPS {
        if (!expressionValues.containsKey($ALPS.text)) {
            System.out.println($ALPS.text + " set as default value '0'");
            expressionValues.put($ALPS.text, 0);
        }
        $res = expressionValues.get($ALPS.text);
    }
    ;

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