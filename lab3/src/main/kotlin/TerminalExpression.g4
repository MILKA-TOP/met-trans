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
    | res1=multDivOp {$res = $res1.res;} (MINUS res2=expr {$res -= $res2.res;})*
    | res1=multDivOp {$res = $res1.res;};

multDivOp returns [Integer res] :
      res1=term POW  res2=multDivOp {
      Integer r1 = $res1.res;
      Integer r2 = $res2.res;
      Integer powResult = (int) Math.pow(r1, r2);
      if (powResult == Integer.MAX_VALUE) {
          System.out.println("Integer overflow after operation: " + String.valueOf(r1) + "**" + String.valueOf(r2) + "; returns Integer.MAX_VALUE");
      }
      $res = (int) Math.pow($res1.res, $res2.res);
     }
    | res1=term MULT res2=multDivOp {$res = $res1.res * $res2.res;}
    | res1=term DIV  res2=multDivOp {
    Integer resultA = $res1.res;
    if ($res2.res == 0) {
        System.out.println("Devision by zero: [" + String.valueOf(resultA) + " / 0]");
        $res = 0;
    } else {
        $res = $res1.res / $res2.res;
    }
}
    | res1=term {$res = $res1.res;};

term returns [Integer res] :
      LB res1=expr RB {$res = $res1.res;}
    | LB MINUS res1=expr RB {
        Integer r1 = $res1.res;
        if (r1 == -r1) {
            System.out.println("Integer overflow after operation: -" + String.valueOf(r1) + "; returns Integer.MAXVALUE");
            $res = Integer.MAX_VALUE;
        } else {
            $res = -r1;
        }
    }
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
POW     : '**';

LB      : '(' ;
RB      : ')' ;

INT     : [0-9]+ ;
ALPS    : [a-zA-Z]+;
WS      : [ \r\t\n]+ -> skip;