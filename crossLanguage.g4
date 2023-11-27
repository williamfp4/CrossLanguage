grammar crossLanguage;

@header {
    import java.util.*;
    import java.util.ArrayList;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
}

@members {
	Variavel novaVariavel = new Variavel();
	ControleVariavel cv = new ControleVariavel();
	String codigoJava = "";
    String mathText, ifText, forText, atribText, printText = "";
    String nome;
	int valor, tipo, insideExpr, numInt, numFloat;;
    boolean hasScan = false, initScan = false, initFor = false;
    private void tab(){
        if(insideExpr > 0){
            for(int i=0; i<insideExpr; i++){
                codigoJava += "\t";
            }
        }
        codigoJava += "\t\t";
    } 

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isFloat(String s) {
        if (isValidFloat(s)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValidFloat(String s) {
        try {
            float f = Float.parseFloat(s);
            return s.contains(".") && s.indexOf('.') < s.length() - 1;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

vai:    
        'X+'
        { 
            codigoJava += "import java.util.*;\n\n";
		    codigoJava += "public class Codigo{\n";
            codigoJava += "\tpublic static void main(String args[]){\n"; 
		}
		expr
        {
            codigoJava += "\n\t}\n}";
            System.out.println(codigoJava);
        }
        'X-'
   ;

declare:    
            (
                tipo atrib (','{codigoJava += ",";}  atrib)*
                {
                    if(!initScan && !initFor){
                        codigoJava += ";\n";
                    }
                }  
		    )+
    ;

atrib:  ID 
        { 
            novaVariavel = new Variavel($ID.text, tipo, valor);
            boolean declarado = cv.adiciona(novaVariavel);
            if(!declarado){
                novaVariavel = cv.busca($ID.text);
                tipo = novaVariavel.getTipo();
            }
            codigoJava += $ID.text;
            if(insideExpr > 0){
                forText = $ID.text;
            }
        }
        (
            OP_ATRIB 
            (
                mathExpr
                {
                    if(numFloat > 0 && tipo == 0){
                        System.out.println(mathText + " is not a valid Natural number expression");
                        System.exit(1);
                    }
                    
                    if(numInt > 0 && tipo == 2){
                        System.out.println(mathText + " is not a valid Decimal number expression");
                        System.exit(1);
                    }
                    codigoJava += " = " + mathText;
                }
                |
                primary 
                {
                    if($primary.text != null){
                        codigoJava += " = "+$primary.text;
                    }
                    switch(tipo){
                        case 0: if(isInteger($primary.text) == false){System.out.println("Not a natural number!"); System.exit(1);} break;
                        case 2: if(isFloat($primary.text) == false){System.out.println("Not a decimal number!"); System.exit(1);} if(!initFor){ codigoJava += "f";} break;
                        default: System.out.println("Variable type invalid!"); break;
                    }
                }
                |
                STRING
                {
                    codigoJava += " = "+$STRING.text;
                }
            )
        )? 
    ;

tipo:   (
            'nat'   {	tipo = 0;
                        if(!initFor){
                            tab();
                        }
                        codigoJava += "int ";
                    } |
            'txt'  {	tipo = 1;
                        if(!initFor){
                            tab();
                        }
                        codigoJava += "String ";
                    } |
            'dec'   {	tipo = 2;
                        if(!initFor){
                            tab();
                        }
                        codigoJava += "float ";
                    } |
        )
   ;

expr:   (  
            {tab();} printf  
            | {tab();} scanf 
            | {tab();} cond 
            | {tab();} atrib 
            | {tab();} for 
            | {tab();} while
            | declare
            | mathExpr
        )*
    ;

mathExpr:   OPMAT mathAdd 
            {
                numInt = numFloat = 0;

                String var = "[a-zA-Z_]+";
                String num = "[0-9]+";

                Pattern regVar = Pattern.compile(var);
                Pattern regNum = Pattern.compile(num);

                mathText = $mathAdd.text;

                Matcher matchVar = regVar.matcher(mathText);
                Matcher matchNum = regNum.matcher(mathText);

                ArrayList<String> tokens = new ArrayList<>();
                ArrayList<String> numbers = new ArrayList<>();

                while (matchVar.find()) {
                    tokens.add(matchVar.group());
                }
                while (matchNum.find()) {
                    numbers.add(matchNum.group());
                }

                for (String t : tokens) {
                    Variavel variable = cv.busca(t);
                    switch(variable.getTipo()){
                        case 0: numInt+=1; break;
                        case 1: System.out.println("Can't use Text in a mathematical operation"); System.exit(1);
                        case 2: numFloat+=1; break;
                        default: System.out.println(variable.getValor() + " is not a valid operand\n"); System.exit(1);
                    }
                }
                for (String n : numbers) {
                    if (isInteger(n)) {
                        numInt+=1;
                    } else if (isFloat(n)) {
                        numFloat+=1;
                    } else {
                        System.out.println(n + " is not a valid operand\n");
                        System.exit(1);
                    }
                }

                if (!((numInt > 0 && numFloat == 0) || (numInt == 0 && numFloat > 0))) {
                    System.out.println("Only one variable type is supported during math expressions");
                    System.exit(1);
                }
            } 
    ;

mathAdd: mathMul (('+' | '-') mathMul)* ;

mathMul: unaryExpr (('*' | '/' | '%') unaryExpr)* ;

unaryExpr: ('+' | '-')? (primary | '(' mathAdd ')') ;

comp:   primary (OPREL | '==') primary ;

comptext:   STRING ('==') STRING ;

cond:   'when' AP (comp|comptext) FP 'do'
        AC  
        {
            codigoJava += "if ("+$comp.text+") {\n";
            insideExpr ++;
        }
        expr 
        {
            codigoJava += "\t";
            if(insideExpr > 1){
                for(int i=0; i<insideExpr; i++){
                    codigoJava += "\t";
                }
                codigoJava += "}";
            } else{
                codigoJava += "\t}";
            }
        }
        FC   
		(
            'else' 'when' AP (comp|comptext) FP {codigoJava += " else if ("+$comp.text+")";}
            AC 
            {
                codigoJava += "{\n";
            }
            expr 
            {
                codigoJava += "\t";
                if(insideExpr > 1){
                    for(int i=0; i<insideExpr; i++){
                        codigoJava += "\t";
                    }
                    codigoJava += "}";
                } else{
                    codigoJava += "\t}";
                }
            }
            FC 
        )*
        (
            'else' {codigoJava += " else ";}
            AC 
            {
                codigoJava += "{\n";
            }
            expr 
            {
                codigoJava += "\t";
                if(insideExpr > 1){
                    for(int i=0; i<insideExpr; i++){
                        codigoJava += "\t";
                    }
                    codigoJava += "}";
                } else{
                    codigoJava += "\t}";
                }
            }
            FC 
        )?
        {codigoJava += "\n";}
        {insideExpr --;}
	;

printf: 'outX' 
        AP 
        (
            printTypes { codigoJava += "System.out.println("+$printTypes.text+");\n"; }
            | 
            mathExpr { codigoJava += "System.out.println("+mathText+");\n"; }
        ) 
        FP
    ;

scanf:  'inX' 
        AP 
        {
            initScan = true;
            if(hasScan == false){
                hasScan = true;
                if(insideExpr > 0){
                    for(int i=0; i<insideExpr; i++){
                        codigoJava += "\t";
                    }
                }
                codigoJava += "Scanner scan = new Scanner(System.in);\n";
            }
        }
        declare 
        {
            Variavel var = cv.busca($declare.text.substring(3));
            switch(var.getTipo()){
                case 0: codigoJava += " = Integer.parseInt(scan.nextLine());\n"; break;
                case 1: codigoJava += " = scan.nextLine();\n"; break;
                case 2: codigoJava += " = Float.parseFloat(scan.nextLine());\n"; break;
                default: System.out.println("Unknown error while declaring variable " + var.getNome()); break;
            }
            initScan = false;
        }
        FP
    ;

for:    'iterate' AP
        { 
            codigoJava += "for(";
            insideExpr ++;
            initFor = true;
        }
        (ID {forText = $ID.text;} | declare | atrib) 
        
        { 
            codigoJava += "; "+forText; 
            initFor = false;
        }

        LOOP primary
        {
            codigoJava += " < "+$primary.text+"; "+forText+"++)";
        }
        
        FP

        AC {codigoJava+="{\n";} 
        expr 
        FC 
        {
            insideExpr --;
            if(insideExpr > 0){
                for(int i=0; i<insideExpr; i++){
                    codigoJava+="\t";
                }
            }
            codigoJava+="\t\t}\n";
        }
    ;

while:  LOOP 
        { 
            codigoJava += "while";
            insideExpr++;
        }
        AP comp FP {codigoJava += "("+$comp.text+"){\n";}
        AC
        expr 
        FC 
        {
            codigoJava += "\t\t}";
            insideExpr--;
        }
    ;

printTypes: 
    STRING |
    |   primary
    ;

primary: 
    ID |
    |   NUM
    |   DEC   
    ;

ID: [A-Za-z]+;
STRING: '"' .*? '"';
NUM: [0-9]+;
DEC: [0-9]+ '.' [0-9]+;
OPMAT: ':' ;
OPREL: '>' | '<' | '>=' | '<=' | '!=' ;
LOOP: '->';
AC: '{' ;
FC: '}' ;
AP: '(' ;
FP: ')' ;
OP_ATRIB: '>>';
OP_INPUT: '<<';
WS: [ \t\r\n]+ -> skip;