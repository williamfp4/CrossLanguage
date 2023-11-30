grammar crossLanguage;

@header {
    import java.util.*;
}

@members {
	Variable newVariable = new Variable();
	VariableController vc = new VariableController();
	String javaCode = "";
    String name, mathText, ifText, forText, atribText, printText = "";
	int value, type, insideExpr, numInt, numFloat;
    boolean notDeclared, hasScan = false, initScan = false, initFor = false, insideFor = false, insideDeclare = false;

    private void tab(){
        if(insideExpr > 0){
            for(int i=0; i<insideExpr; i++){
                javaCode += "\t";
            }
        }
        javaCode += "\t\t";
    } 

    private void isDeclared(String text){
        try {
            if(vc.exists(text) == false){
                throw new Exception("Variable "+text+" is not declared!");
            }
        } catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
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

start:    
        'X+'
        { 
            javaCode += "import java.util.*;\n\n";
		    javaCode += "public class Main{\n";
            javaCode += "\tpublic static void main(String args[]){\n"; 
		}
		expr
        {
            javaCode += "\n\t}\n}";
            System.out.println(javaCode);
        }
        'X-'
   ;

declare:    (
                type atrib (','{javaCode += ",";}  atrib)*
                {
                    try{
                        int index = $atrib.text.indexOf('>');
                        if(!notDeclared){
                            throw new Exception("Variable '"+$atrib.text.substring(0, index)+"' has been declared!");
                        }
                    } catch(Exception e){
                        e.printStackTrace();
                        System.exit(1);
                    }
                    
                    if(!initScan && !initFor){
                        javaCode += ";\n";
                    }
                }  
		    )+
    ;

atrib:  ID 
        {   
            String name = $ID.text;
            newVariable = new Variable(name, type, value);
            notDeclared = vc.add(newVariable);
            if(!notDeclared){
                newVariable = vc.search(name);
                type = newVariable.getType();
            }
            javaCode += name;
            if(insideFor){
                forText = name;
            }
        }
        (
            OP_ATRIB 
            (
                mathExpr
                {
                    try {
                        if(numFloat > 0 && type == 0){
                            throw new Exception(mathText + " is not a valid Natural number expression");
                        } else if(numInt > 0 && type == 2){
                            throw new Exception(mathText + " is not a valid Decimal number expression");
                        }

                        if(type == 2){
                            javaCode += " = (float)("+mathText+")";
                        } else{
                            javaCode += " = " + mathText;
                        }
                    } catch(Exception e){
                        e.printStackTrace();
                        System.exit(1);
                    }
                }
                |
                primary 
                {
                    if($primary.text != null){
                        javaCode += " = "+$primary.text;
                    }
                    try {
                        switch(type){
                            case 0: if(isInteger($primary.text) == false){
                                        throw new Exception("Not a natural number!");
                                    } 
                                break;

                            case 2: if(isFloat($primary.text) == false){
                                        throw new Exception("Not a decimal number!");
                                    } 
                                    { javaCode += "f";} 
                                break;

                            default: throw new Exception("Variable type invalid!"); 
                        }
                    } catch(Exception e){
                        e.printStackTrace();
                        System.exit(1);
                    }
                }
                |
                STRING
                {
                    javaCode += " = "+$STRING.text;
                }
            )
        )? 
    ;

type:   (
            'nat'   {	type = 0;
                        if(!initFor){
                            tab();
                        }
                        javaCode += "int ";
                    } |
            'txt'  {	type = 1;
                        if(!initFor){
                            tab();
                        }
                        javaCode += "String ";
                    } |
            'dec'   {	type = 2;
                        if(!initFor){
                            tab();
                        }
                        javaCode += "float ";
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
            | {tab();} increment
            | {tab();} break
            | atrib
            | declare
            | mathExpr
        )*
    ;

mathExpr:   OPMAT mathAdd 
            {
                numInt = numFloat = 0;

                mathText = $mathAdd.text;
                String operation = mathText.replace("(", "").replace(")", "");

                String[] operands = operation.split("[+\\-*/\\s]+");

                try {
                    for (String o : operands) {
                        if(o.matches(".*\\d+.*")){
                            if (isInteger(o)) {
                                numInt+=1;
                            } else if (isFloat(o)) {
                                numFloat+=1;
                            } else {
                                throw new Exception(o + " is not a valid operand\n");
                            }
                        }else{
                            if(vc.exists(o) == false){
                                throw new Exception("Variable "+o+" is not declared!");
                            }
                            Variable variable = vc.search(o);
                            switch(variable.getType()){
                                case 0: numInt+=1; break;
                                case 1: throw new Exception("Can't use Text in a mathematical operation");
                                case 2: numFloat+=1; break;
                                default: throw new Exception(variable.getValue() + " is not a valid operand\n");
                            }
                        }
                    }

                    if (!((numInt > 0 && numFloat == 0) || (numInt == 0 && numFloat > 0))) {
                        throw new Exception("Only one variable type is supported during math expressions");
                    }
                } catch(Exception e){
                    e.printStackTrace();
                    System.exit(1);
                }
            } 
    ;

mathAdd: mathMul (('+' | '-') mathMul)* ;

mathMul: unaryExpr (('*' | '/' | '%') unaryExpr)* ;

unaryExpr: ('+' | '-')? (primary | '(' mathAdd ')') ;

comp:   primary 
        {
            String op_1 = "";
            if(isInteger($primary.text)){
                op_1 = "int";
            }else if(isFloat($primary.text)){
                op_1 = "float";
            }else{
                isDeclared($primary.text);
                Variable var_1 = vc.search($primary.text);
                if(var_1.getType() == 0){
                    op_1 = "int";
                }else if(var_1.getType() == 1){
                    op_1 = "String";
                }else{
                    op_1 = "float";
                }
            }
        }
        (OPREL | '==') 
        primary
        {
            String op_2 = "";
            if(isInteger($primary.text)){
                op_2 = "int";
            }else if(isFloat($primary.text)){
                op_2 = "float";
            }else{
                isDeclared($primary.text);
                Variable var_2 = vc.search($primary.text);
                if(var_2.getType() == 0){
                    op_2 = "int";
                }else if(var_2.getType() == 1){
                    op_2 = "String";
                }else{
                    op_2 = "float";
                }
            }
        }
        {
            try{
                if(op_1 != op_2){
                    throw new Exception("You can't compare variables with different types");
                }
            } catch (Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        }
        ( ( '||' | '&&' ) (comp | comptext))*
    ;

comptext:   STRING ('==') STRING ( ( '||' | '&&' ) (comp | comptext))*;

cond:   'when' AP (comp|comptext) FP 'do'
        AC  
        {
            javaCode += "if ("+$comp.text+") {\n";
            insideExpr ++;
        }
        expr 
        {
            javaCode += "\t";
            if(insideExpr > 1){
                for(int i=0; i<insideExpr; i++){
                    javaCode += "\t";
                }
                javaCode += "}";
            } else{
                javaCode += "\t}";
            }
        }
        FC   
		(
            'else' 'when' AP (comp|comptext) FP {javaCode += " else if ("+$comp.text+")";}
            AC 
            {
                javaCode += "{\n";
            }
            expr 
            {
                javaCode += "\t";
                if(insideExpr > 1){
                    for(int i=0; i<insideExpr; i++){
                        javaCode += "\t";
                    }
                    javaCode += "}";
                } else{
                    javaCode += "\t}";
                }
            }
            FC 
        )*
        (
            'else' {javaCode += " else ";}
            AC 
            {
                javaCode += "{\n";
            }
            expr 
            {
                javaCode += "\t";
                if(insideExpr > 1){
                    for(int i=0; i<insideExpr; i++){
                        javaCode += "\t";
                    }
                    javaCode += "}";
                } else{
                    javaCode += "\t}";
                }
            }
            FC 
        )?
        {javaCode += "\n";}
        {insideExpr --;}
	;

printf: 'outX' 
        AP 
        (
            printTypes { javaCode += "System.out.println("+$printTypes.text; }
            ('+' printTypes { javaCode += " + "+$printTypes.text; } )*
            { javaCode += ");\n"; }
            | 
            mathExpr { javaCode += "System.out.println("+mathText+");\n"; }
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
                    for(int i=1; i<insideExpr; i++){
                        javaCode += "\t";
                    }
                }
                javaCode += "Scanner scan = new Scanner(System.in);\n";
                tab();
            }
        }
        (
            ID
            {
                Variable var = vc.search($ID.text);
                javaCode += var.getName();
                switch(var.getType()){
                    case 0: javaCode += " = Integer.parseInt(scan.nextLine());\n"; break;
                    case 1: javaCode += " = scan.nextLine();\n"; break;
                    case 2: javaCode += " = Float.parseFloat(scan.nextLine());\n"; break;
                    default: System.out.println("Unknown error while declaring variable " + var.getName()); break;
                }
                initScan = false;
            }
            |
            declare 
            {
                Variable var = vc.search($declare.text.substring(3));
                switch(var.getType()){
                    case 0: javaCode += " = Integer.parseInt(scan.nextLine());\n"; break;
                    case 1: javaCode += " = scan.nextLine();\n"; break;
                    case 2: javaCode += " = Float.parseFloat(scan.nextLine());\n"; break;
                    default: System.out.println("Unknown error while declaring variable " + var.getName()); break;
                }
                initScan = false;
            }
        )
        FP
    ;

for:    'iterate' AP
        { 
            javaCode += "for(";
            insideExpr ++;
            initFor = insideFor = true;
        }
        (ID {forText = $ID.text;} | atrib | declare) 
        
        { 
            javaCode += "; "+forText; 
            initFor = false;
        }

        LOOP primary
        {
            javaCode += " < "+$primary.text+"; "+forText+"++)";
        }
        
        FP

        AC {javaCode+="{\n";} 
        expr 
        FC 
        {
            insideExpr --;
            if(insideExpr > 0){
                for(int i=0; i<insideExpr; i++){
                    javaCode+="\t";
                }
            }
            javaCode+="\t\t}\n";
            insideFor = false;
        }
    ;

while:  LOOP 
        { 
            javaCode += "while";
            insideExpr++;
        }
        AP 
        (
            comp {javaCode += "("+$comp.text+"){\n";} 
            |comptext {javaCode += "("+$comptext.text+"){\n";}
        ) 
        FP

        AC
        expr
        FC 
        {
            insideExpr--;
            tab();
            javaCode += "}";
        }
    ;

increment:  ID OP_INC
            { 
                javaCode += $ID.text; 
                if($OP_INC.text.equals(">+")){
                    javaCode += "++;\n"; 
                }else{
                    javaCode += "--;\n";
                }
            }
    ;

break:  'break'
        { 
            try{
                if(insideFor){
                    throw new Exception("Break outside of a loop!");
                }
                javaCode += "break;\n"; 
            } catch(Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        }
    ;

printTypes: 
    STRING |
    |   primary
    |   '(' mathAdd ')'
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
OPREL: '>' | '<' | '>=' | '<=' | '!=';
LOOP: '->';
AC: '{' ;
FC: '}' ;
AP: '(' ;
FP: ')' ;
OP_ATRIB: '>>';
OP_INC: '>+' | '>-';
WS: [ \t\r\n]+ -> skip;