grammar JAJ;

parse
 : block
 ;

block
 : stat*
 ;

stat
 : assignment
 | if_stat
 | while_stat
 | log
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 | functionDefinition
 | functionCall SCOL
 | return_stat SCOL
 | print
 | stack_init
 | stack_operations
 | global_scope
 | block_scope
 ;
 
global_scope
 : '<' block '>'
 ;
 
block_scope
 : '[' block ']'
 ; 
return_stat
 : 'return' expr SCOL
 ;

stack_init
 : 'stack' ID SCOL
 ;
 
stack_operations
 : 'spush' '(' ID ',' INT ')' SCOL
 | 'spop' '(' ID ')' SCOL
 | 'empty' '(' ID ')' SCOL
 ;

print
	:	'print' ID SCOL
	|   'print' STRING SCOL
	;	

functionDefinition
    :   ID '(' (ID (','ID)*)*  ')' OBRACE block CBRACE
    ;

functionCall
 : ID '(' paramDefs ')' 
 ;

paramDefs
 : (ID ',')* ID
 ;

assignment
 : ID ASSIGN expr SCOL
 | ID ASSIGN functionCall SCOL
 | ID ASSIGN stack_top SCOL
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : expr stat_block
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

while_stat
 : WHILE expr stat_block
 ;

log
 : LOG expr SCOL
 ;

expr
 : expr POW<assoc=right> expr           #powExpr
 | MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 ;

stack_top
 : 'top' '(' ID ')' 
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 ;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
LOG : 'log';
PRINT	:	'print';
ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]* 
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : . 
 ;
