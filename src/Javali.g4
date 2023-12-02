grammar Javali;

prog: (statement)* EOF;
statement
    : varibleDeclarationStatement SEMICOLUN
    ;
varibleDeclarationStatement
    : integerDeclationStatement
    | realDeclarationStatement
    | booleanDeclarationStatement
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
* variables
*/
    VAR_INTEGER:  'integer';
    VAR_REAL: 'real';
    VAR_STRING: 'string';
    VAR_LIST: 'list';
    VAR_BOOLEAN: 'boolean';

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


