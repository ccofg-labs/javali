grammar Javali;

prog: (statement)* EOF;
statement
    : varibleDeclarationStatement SEMICOLUN
    ;
varibleDeclarationStatement
    : integerDeclationStatement
    | realDeclarationStatement
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
    LESS_THAN : '<';
    GREATER_THAN : '>';
    LESSEQUAL : '<=';
    GREATEREQUAL: '>=';
    EQUALTO : '==';
    NOTEQUALTO: '!=';

/*
* Operadores Logico
*/

    AND: 'and';
    OR: 'or';
    NOT: 'not';

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


