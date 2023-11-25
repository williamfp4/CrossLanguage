grammar crossLanguage;

@header {
    import java.util.*;
}

@members {
	Variavel novaVariavel = new Variavel();
	ControleVariavel cv = new ControleVariavel();
	String codigoJava = "";
    String ifText, forText, atribText, printText = "";
    String nome;
	int escopo, tipo;
    boolean hasScan, insideFor = false;
}

vai:    
        'X+'
        { 
            escopo = 0;
		    codigoJava += "public class Codigo{\n";
		}
		declare
        'START'
        { 	
            escopo = 1;
            codigoJava += "\tpublic static void main(String args[]){\n"; 
        }
		declare
		expr
	    'END'
        {
            codigoJava += "\n\t}\n}";
            System.out.println(codigoJava);
        }
        'X-'
   ;

declare:    (
                tipo atrib (','{codigoJava += ",";}  atrib)* (OP_INPUT {codigoJava += " = ";} scanf )? 
                {
                    if(!insideFor)
                        codigoJava += ";\n";
                }  
		    )*
    ;

atrib:  ID 
        { 
            novaVariavel = new Variavel($ID.text, tipo, escopo);
            boolean declarado = cv.adiciona(novaVariavel);
            if(!declarado){
                System.err.println("Variavel "+$ID.text+" ja foi declarada!!!");
                System.exit(0);
            }
            codigoJava += $ID.text;
            if(insideFor){
                forText = $ID.text;
            }
        }
        (OP_ATRIB primary)? 
        {
            if($primary.text != null)
                codigoJava += " = "+$primary.text;
            if(novaVariavel.getTipo() == 2)
                codigoJava += "f";
        }
    ;

tipo:   (
            'nat'   {	tipo = 0;
                        if(insideFor){
                            codigoJava += "int ";
                        } else {
                            if(escopo == 0){
                                codigoJava += "\tint ";
                            } else {
                                codigoJava += "\t\tint ";
                            }
                        }
                    } |
            'text'  {	tipo = 1;
                        if(insideFor){
                            codigoJava += "String ";
                        } else {
                            if(escopo == 0){
                                codigoJava += "\tString ";
                            } else {
                                codigoJava += "\t\tString ";
                            }
                        }
                    } |
            'dec'   {	tipo = 2;
                        if(insideFor){
                            codigoJava += "float ";
                        } else {
                            if(escopo == 0){
                                codigoJava += "\tfloat ";
                            } else {
                                codigoJava += "\t\tfloat ";
                            }
                        }
                    } |
        )
   ;

expr:    (printf | scanf | cond | atrib | for | while)*
    ;

mathExpr: (ID | NUM | DEC) OPMAT (ID | NUM | DEC)
    ;

comp:   (ID | NUM | DEC) OPREL (ID | NUM | DEC)
    ;

cond:   'when' AP comp FP 'do'
        AC  
        {
            codigoJava += "\t\tif ("+$comp.text+") {";
        }
        expr 
        {
            codigoJava += "\t\t}";
        }
        FC   
		(
            'else' {codigoJava += " else ";}('when' AP comp FP {codigoJava += "if ("+$comp.text+")";})? 
            AC 
            {
                codigoJava += "{";
            }
            expr 
            {
                codigoJava += "\t\t}";
            }
            FC 
        )*
	;

printf: 'outX' AP printTypes FP
        {
            codigoJava += "\n\t\t\tSystem.out.println("+$printTypes.text+");\n";
        }
    ;

scanf:   'inX' AP FP
        {
            //if(hasScan == false){
            //    if(escopo == 1)
            //        codigoJava += "\t";
            //    codigoJava += "\tScanner scan = new Scanner(System.in);\n";
            //}
            if(hasScan == false){
                hasScan = true;
            }
        }
        {
            codigoJava += "scan.nextLine()";
        }
    ;

for:    'iterate' AP
        { insideFor = true; }
        { 
            if(escopo == 1){
                codigoJava += "\n\t";
            } else {
                codigoJava += "\n";
            }
            codigoJava += "\tfor(";
        }
        (ID {forText = $ID.text;} | declare) 
        
        { codigoJava += "; "+forText; }

        (LOOP primary)? 
        {
            codigoJava += " < "+$primary.text+"; "+forText+"++)";
        }
        
        FP

        AC {codigoJava+="{";} 
        expr 
        FC {codigoJava+="\t\t}";}

        {insideFor = false;}
    ;

while:  LOOP 
        { 
            if(escopo == 1){
                codigoJava += "\n\t";
            } else {
                codigoJava += "\n";
            }
            codigoJava += "\twhile";
        }
        AP comp FP {codigoJava += "("+$comp.text+"){";}
        AC
        expr 
        FC 
        {
            if(escopo == 1){
                codigoJava += "\t";
            }
            codigoJava += "\t}";
        }
    ;

printTypes: 
    STRING |
    |   primary
    |   mathExpr
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
OPMAT: '+' | '-' | '*' | '/' | '%' ;
OPREL: '>' | '<' | '>=' | '<=' | '==' | '!=' ;
LOOP: '->';
AC: '{' ;
FC: '}' ;
AP: '(' ;
FP: ')' ;
OP_ATRIB: '>>';
OP_INPUT: '<<';
WS: [ \t\r\n]+ -> skip;