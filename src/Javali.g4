grammar Javali;

prog: (statement)* EOF;
statement
    : varibleDeclarationStatement SEMICOLUN
    | functionStatement
    | pointerStatement SEMICOLUN
    /*| ifStatement*/
    ;
/* estrutura if */

/*ifStatement: if_s OPEN_PARENTHESES booleanExpression CLOSE_PARENTHESES OPEN_KEY statement* CLOSE_KEY ;
if_s: IF;
*/

/* variveis ponteiro */

pointerStatement
    : pointer VARIABLE EQUAL pointerExpression
    ;
pointer
    : VAR_INTEGER OP_MULTIPLICATION
    | VAR_REAL OP_MULTIPLICATION
    | VAR_LIST OP_MULTIPLICATION
    | VAR_BOOLEAN OP_MULTIPLICATION
    | VAR_STRING OP_MULTIPLICATION
    ;
pointerExpression: ADDRESS VARIABLE;
/* funcoes */
functionStatement
    : integerFunctionStatement
    | realFunctionStatement
    | stringFunctionStatement
    | booleanFunctionStatement
    | voidFunctionStatement
    | listFunctionStatement
    ;
voidFunctionStatement: VAR_VOID FUNC VARIABLE OPEN_PARENTHESES CLOSE_PARENTHESES OPEN_KEY statement* CLOSE_KEY;
integerFunctionStatement: VAR_INTEGER FUNC VARIABLE OPEN_PARENTHESES CLOSE_PARENTHESES OPEN_KEY statement* CLOSE_KEY;
realFunctionStatement: VAR_REAL FUNC VARIABLE OPEN_PARENTHESES CLOSE_PARENTHESES OPEN_KEY statement* CLOSE_KEY;
stringFunctionStatement: VAR_STRING FUNC VARIABLE OPEN_PARENTHESES CLOSE_PARENTHESES OPEN_KEY statement* CLOSE_KEY;
booleanFunctionStatement: VAR_BOOLEAN FUNC VARIABLE OPEN_PARENTHESES CLOSE_PARENTHESES OPEN_KEY statement* CLOSE_KEY;
listFunctionStatement: VAR_LIST FUNC VARIABLE OPEN_PARENTHESES CLOSE_PARENTHESES OPEN_KEY statement* CLOSE_KEY;

/* declaracoes de variaveis */
varibleDeclarationStatement
    : integerDeclationStatement
    | realDeclarationStatement
    | booleanDeclarationStatement
    | listDeclarationStatement
    | stringDeclarationStatement
    | integerDeclationStatement
    ;
/* variavel string */
stringDeclarationStatement
    : VAR_STRING VARIABLE EQUAL stringExpression
    | VARIABLE EQUAL stringExpression
    ;
stringExpression : STRING_LITERAL | VARIABLE;

/* variavel list */
listDeclarationStatement
    : VAR_LIST VARIABLE EQUAL listExpression
    | VAR_LIST VARIABLE EQUAL listExpression
    ;
listExpression
    : OPEN_BRACKET (listIntegerExpression | listBooleanExpression | listRealExpression | listStringExpression | listListExpression | VARIABLE COMMA)* CLOSE_BRACKET
    | VARIABLE
    ;
listIntegerExpression
    : NUMBER COMMA
    | VARIABLE COMMA;
listRealExpression
    : NUMBER_POINT COMMA
    | VARIABLE COMMA;
listStringExpression
    : STRING_LITERAL COMMA
    | VARIABLE COMMA;
listBooleanExpression
    : BOLEANA_LITERAL COMMA
    | VARIABLE COMMA;
listListExpression
    : listExpression COMMA
    | VARIABLE
    ;

/* variavel boleana */
booleanDeclarationStatement
    : VAR_BOOLEAN VARIABLE EQUAL booleanExpression
    | VARIABLE EQUAL booleanExpression
    ;
booleanExpression
    : OPEN_PARENTHESES booleanExpression CLOSE_PARENTHESES
    | OP_NOT booleanExpression
    | booleanExpression (logicOperator | attributeOperator ) booleanExpression
    | BOLEANA_LITERAL
    | VARIABLE
    ;
attributeOperator
    : OP_LESS_THAN
    | OP_GREATER_THAN
    | OP_LESSEQUAL
    | OP_GREATER_EQUAL
    | OP_EQUAL_TO
    | OP_NOT_EQUAL_TO
    ;
logicOperator
    : OP_AND
    | OP_OR
    | OP_NOT
    ;
/* varivel real */
realDeclarationStatement
    : VAR_REAL VARIABLE EQUAL realExpression
    | VARIABLE EQUAL realExpression
    ;
realExpression
    :OPEN_PARENTHESES realExpression CLOSE_PARENTHESES
    | realExpression arithmeticOperator realExpression
    | NUMBER
    | NUMBER_POINT
    | VARIABLE
    ;
/* variavel integer */
integerDeclationStatement
    : VARIABLE EQUAL integerExpression
    | VAR_INTEGER VARIABLE EQUAL integerExpression
    ;
/* expressao aritmetrica com integer */

integerExpression
    : OPEN_PARENTHESES integerExpression CLOSE_PARENTHESES
    | integerExpression arithmeticOperator integerExpression
    | VARIABLE
    | NUMBER
    ;

arithmeticOperator
    : OP_ADDITION
    | OP_SUBTRATION
    | OP_MULTIPLICATION
    | OP_DIVISION
    ;
/*--------------------------------------------------------------------------------*/
    WS
        : [ \t\r\n]+ -> channel(HIDDEN)
    ;

    COMENTARIO
        : '/*' .*? '*/' -> skip
    ;

    LINHA_COMENTARIO
        : '//' ~[\r\n]* -> skip
    ;
/*
* Lexer Rules
*/

/*
* funcaoes
*/
FUNC : 'func';

/* ponteiro */

ADDRESS: '&';

/*
* variables
*/
    VAR_INTEGER:  'integer';
    VAR_REAL: 'real';
    VAR_STRING: 'string';
    VAR_LIST: 'list';
    VAR_BOOLEAN: 'boolean';
    VAR_VOID: 'void';

/*
* operadores aritmetricos
*/
    OP_ADDITION: '+';
    OP_SUBTRATION: '-';
    OP_DIVISION: '/';
    OP_MULTIPLICATION: '*';

/*
* operadores atribuicao
*/

    EQUAL: '=';
    OP_LESS_THAN : '<';
    OP_GREATER_THAN : '>';
    OP_LESSEQUAL : '<=';
    OP_GREATER_EQUAL: '>=';
    OP_EQUAL_TO : '==';
    OP_NOT_EQUAL_TO: '!=';

/*
* Operadores Logico
*/

    OP_AND: 'and';
    OP_OR: 'or';
    OP_NOT: 'not';

/*
* Delimitadores
*/

    OPEN_KEY: '{';
    CLOSE_KEY: '}';
    OPEN_BRACKET: '[';
    CLOSE_BRACKET: ']';
    OPEN_PARENTHESES: '(';
    CLOSE_PARENTHESES: ')';
    SEMICOLUN: ';';
    DOUBLE_QUOTES: '"';
    DOIS_PONTOS: ':';
    DOT: '.';
    COMMA: ',';

/*
*   geração de variveis
*/

VARIABLE : LETTER (LETTER | DIGIT)*; // identificador
NUMBER : DIGIT+ ; // valor literal de numeros inteiros
NUMBER_POINT : DIGIT+'.'DIGIT+ ; // valor literal de real
BOLEANA_LITERAL : TRUE| FALSE ;
STRING_LITERAL: '"'(~["\\\r\n])* '"';
RETURN : 'return';

fragment LETTER : [a-zA-Z];
fragment DIGIT: [0-9];
fragment TRUE: 'true';
fragment FALSE: 'false';

/*
* Condionais
*/

IF: 'if';
ELSEIF: 'elseif';
ELSE: 'else';

/*
* Laço
*/

FOR: 'for';
WHILE: 'while';


