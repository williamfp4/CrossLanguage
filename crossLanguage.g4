grammar crossLanguage;

@header {
    import java.util.*;
}

@members {
	Variavel novaVariavel = new Variavel();
	ControleVariavel cv = new ControleVariavel();
	String codigoJava = "";
    String ifText, atribText, printText = "";
    String nome;
	int escopo, tipo;
}

vai:    { 
            escopo = 0;
		    codigoJava += "public class Codigo{\n";
		}
		declare
		'X+'
        { 	
            escopo = 1;
            codigoJava += "\tpublic static void main(String args[]){\n"; 
        }
		declare
		expr
	    'X-'
        {
            codigoJava += "\n\t}\n}";
            System.out.println(codigoJava);
        }
   ;

declare:    (
                tipo atrib (','{codigoJava += ",";}  atrib)* PV {codigoJava += ";\n";}  
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
        }
        (OP_ATRIB primary)? 
        {
            if($primary.text != null)
                codigoJava += $OP_ATRIB.text+$primary.text;
            if(novaVariavel.getTipo() == 2)
                codigoJava += "f";
        }
    ;

tipo:   (
            'integer'   {	tipo = 0;
                            if(escopo == 1){
                                codigoJava += "\t";
                            }
							codigoJava += "\tint "; 
						} |
            'text'      {	tipo = 1;
                            if(escopo == 1){
                                codigoJava += "\t";
                            }
							codigoJava += "\tString ";
						} |
            'decimal'   {	tipo = 2;
                            if(escopo == 1){
                                codigoJava += "\t";
                            }
							codigoJava += "\tfloat ";
						} |
        )
   ;

expr:    (print | cond | atrib)*
    ;

mathExpr: (ID | NUM | DEC) OPMAT (ID | NUM | DEC) (PV)?
    ;

cond:   'se' AP comp FP AC expr FC   
        {
            codigoJava += "\t\tif ("+$comp.text+") {"+printText+"\n\t\t}";
        }
		(
            'senao' AC expr FC 
            {
                codigoJava += " else{\n\t\t\t"+$expr.text+"\n\t\t}";
            }
        )?
	;

print: 'print' printTypes PV
        {
            printText += "\n\t\t\tSystem.out.println("+$printTypes.text+");";
        }
    ;

comp:   (ID | NUM | DEC) OPREL (ID | NUM | DEC)
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
PV: ';' ;
AC: '{' ;
FC: '}' ;
AP: '(' ;
FP: ')' ;
OP_ATRIB: '=';
WS: [ \t\r\n]+ -> skip;