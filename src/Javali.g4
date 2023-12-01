grammar Javali;

prog: (statement)* EOF;
statement
    : varibleDeclarationStatement SEMICOLUN
    ;
varibleDeclarationStatement
    : integerDeclationStatement
    | floatDeclarationStatement
    | booleanDeclarationStatement
    | stringDeclarationStatement
    | listDeclarationStatement
    ;
/* variavel interira */
integerDeclationStatement
    : ID EQUAL integerExpression
    | INTEGER ID EQUAL integerExpression
    ;
integerExpression
    : NUMBER
    | ID
    | integerExpression ( MULTIPLICATION | DIVISION | ADDITION | SUBTRATION ) integerExpression
    | OPEN_PARENTHESES integerExpression CLOSE_PARENTHESES
    ;
/* variavel real */
floatDeclarationStatement
    : ID EQUAL floatExpression
    | DOUBLE ID EQUAL floatExpression
    ;

floatExpression
    : NUMBER_POINT
    | NUMBER
    | ID
    | floatExpression ( MULTIPLICATION | DIVISION | ADDITION | SUBTRATION ) floatExpression
    | OPEN_PARENTHESES floatExpression CLOSE_PARENTHESES
    ;
/* variveis boleana */

booleanDeclarationStatement
    : ID EQUAL booleanExpression
    | BOOLEAN ID EQUAL booleanExpression
    ;
booleanExpression
    : NOT? BOLEANA_LITERAL
    | booleanBlock
    ;
booleanBlock:
    | ID
    | NOT? BOLEANA_LITERAL
    | NOT? (ID | BOLEANA_LITERAL) (AND | OR | LESS_THAN | GREATER_THAN | LESSEQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUALTO | EQUALTO) NOT? (ID | BOLEANA_LITERAL)
    | OPEN_PARENTHESES booleanBlock CLOSE_PARENTHESES
    ;
/*
* varivel string
*/
stringDeclarationStatement
    : ID EQUAL stringExpression
    | STRING ID EQUAL stringExpression
    | STRING ID EQUAL ID
    ;
stringExpression: STRING_LITERAL;
/*
*   variavel lista
*/

listDeclarationStatement
    : LIST ID EQUAL listExpression
    | ID EQUAL listExpression
    ;
listExpression
    : OPEN_BRACKET listElement* CLOSE_BRACKET
    | OPEN_BRACKET ID CLOSE_BRACKET
    | OPEN_BRACKET ID COMMA listExpression CLOSE_BRACKET
    | listExpression COMMA listExpression
    ;
listElement
    : NUMBER COMMA
    | NUMBER_POINT COMMA
    | STRING_LITERAL COMMA
    | BOLEANA_LITERAL COMMA
    ;

ifStatement: IF OPEN_PARENTHESES booleanBlock CLOSE_PARENTHESES OPEN_KEY statement? CLOSE_KEY elseIfStatement* elseStatement?;
elseIfStatement: ELSEIF OPEN_PARENTHESES booleanBlock CLOSE_PARENTHESES OPEN_KEY statement* CLOSE_KEY;
elseStatement: ELSE OPEN_KEY statement* CLOSE_KEY;

whileStatement:   OPEN_PARENTHESES booleanBlock CLOSE_PARENTHESES OPEN_KEY statement?  CLOSE_KEY;
forStatement: FOR;
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

NUMBER : DIGIT+ ;
NUMBER_POINT : DIGIT+'.'DIGIT+ ;
BOLEANA_LITERAL : TRUE| FALSE ;
STRING_LITERAL: '"'(~["\\\r\n])* '"';

/*
* variables
*/
    INTEGER:  'integer';
    DOUBLE: 'real';
    STRING: 'string';
    LIST: 'list';
    BOOLEAN: 'boolean';

/*
* operadores aritmetricos
*/
    ADDITION: '+';
    SUBTRATION: '-';
    DIVISION: '/';
    MULTIPLICATION: '*';

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
*   Idenficadores
*/

ID : [A-Za-z][0-9A-Za-z]*;
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


