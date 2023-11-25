grammar Javali;

program
    : statement+ EOF
    ;

statement
    :  ABRE_CHAVE statement* FECHA_CHAVE
    | tipoPrimitivo
    ;

tipoPrimitivo
    : INT IDENTIFICADOR IGUAL (IDENTIFICADOR | DIGITO_LITERAL)* PONTO_E_VIRGULA
    | REAL IDENTIFICADOR IGUAL (IDENTIFICADOR | REAL_LITERAL)* PONTO_E_VIRGULA
    | CADEIA IDENTIFICADOR IGUAL (IDENTIFICADOR | CADEIA_LITERAL) PONTO_E_VIRGULA
    | LISTA_UNIFORME
    | LISTA_DIVERSA IDENTIFICADOR IGUAL matriz PONTO_E_VIRGULA
    | BOLEANA
    ;
matriz
    : ABRE_CHAVE matrizEstrutura (VIRGULA matrizEstrutura)* FECHA_CHAVE ;
matrizEstrutura
    : matriz
    | DIGITO_LITERAL
    | REAL_LITERAL
    | BOLEANA_LITERAL
    | CADEIA_LITERAL
    | IDENTIFICADOR
    ;

    WS: [ \n\t\r]+ -> skip;
/*
* Lexer Rules
*/

DIGITO_LITERAL : DIGITO+ ;
REAL_LITERAL : DIGITO+'.'DIGITO+ ;
BOLEANA_LITERAL : TRUE| FALSE ;
CADEIA_LITERAL: '"'(~["\\\r\n])* '"';

/*
* variables
*/
    INT:  'inteiro';
    REAL: 'real';
    CADEIA: 'cadeia';
    LISTA_UNIFORME: 'lista';
    LISTA_DIVERSA: 'matriz';
    BOLEANA: 'boleana';

/*
* operadores aritmetricos
*/
    SOMA: '+';
    SUBTRACAO: '-';
    DIVISAO: '/';
    MULTIPLICACAO: '*';

/*
* operadores atribuicao
*/

    IGUAL: '=';
    DIFERENTE: '!=';
    MENOR_IGUAL: '<=';
    MAIOR_IGUAL: '>=';
/*
* Operadores Logico
*/

    E_LOGICO: 'and';
    OU_LOGICO: 'or';
    NEGACAO_LOGICA: 'not';

/*
* Delimitadores
*/

    ABRE_CHAVE: '{';
    FECHA_CHAVE: '}';
    ABRE_COLCHETE: '[';
    FECHA_COLCHETE: ']';
    ABRE_PARENTESE: '(';
    FECHA_PARENTESE: ')';
    PONTO_E_VIRGULA: ';';
    ASPAS_DUPLAS: '"';
    DOIS_PONTOS: ':';
    PONTO: '.';
    VIRGULA: ',';

/*
*   Idenficadores
*/
IDENTIFICADOR : [A-Za-z][0-9A-Za-z]*;
fragment DIGITO: [0-9];
fragment TRUE: 'true';
fragment FALSE: 'false';