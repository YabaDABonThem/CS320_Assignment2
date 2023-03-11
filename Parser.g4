grammar Parser;

// Lexer Rules
program : (declaration | statement | clazz)* ;

clazz : 'class' identifier '{' body '}' ;
body : (statement | block | clazz)+ ;
block : '{' (block | statement) '}' ;

method : 'int' identifier '(' ')' block ;
declaration : 'int' STRING ';' ; // NOTE: We can only declare ints as variables but it's fine

term : integer | identifier ; // NOTE: prof's notes has "integer" in lowercase
integer : INT ;
identifier : NAME | STRING ;
expression : term | (term '+' term) | (term '*' term) ;

statement : (assignstmt | printstmt | returnstmt | ifstmt) ;
assignstmt : (STRING assignstmt) | STRING '=' expression ';';
printstmt : 'print' term ';' ;
returnstmt : 'return' expression ';' ;
ifstmt : 'if' '(' identifier '==' expression ')' statement* 'endif';

// Terminals
NAME : [A-Za-z]+ ;
STRING : '"' [A-Za-z0-9.]+ '"' ;
INT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines