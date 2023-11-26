grammar Javali;

programa
    : estrutura*
    ;

estrutura
    :  ABRE_CHAVE estrutura* FECHA_CHAVE
    | tipoPrimitivo
    | COMENTARIO
    | LINHA_COMENTARIO
    ;

tipoPrimitivo
    : inteiroDeclaracao
    | realDeclaracao
    | cadeiaDeclaracao
    | listaDeclaracao
    | matrizDeclaracao
    | boleanaDeclaracao
    ;
inteiroDeclaracao
    : INT IDENTIFICADOR IGUAL expressaoAritmetricaInteiro PONTO_E_VIRGULA
    | IDENTIFICADOR IGUAL expressaoAritmetricaInteiro PONTO_E_VIRGULA
    ;

expressaoAritmetricaInteiro:
    | IDENTIFICADOR
    | SOMA IDENTIFICADOR
    | SUBTRACAO IDENTIFICADOR
    | IDENTIFICADOR MULTIPLICACAO IDENTIFICADOR
    | IDENTIFICADOR DIVISAO IDENTIFICADOR
    ;
expressaoAritmetrica:
    |
    ;
realDeclaracao
    : REAL IDENTIFICADOR IGUAL (IDENTIFICADOR | REAL_LITERAL)* PONTO_E_VIRGULA
    ;
cadeiaDeclaracao
    : CADEIA IDENTIFICADOR IGUAL (IDENTIFICADOR | CADEIA_LITERAL)* PONTO_E_VIRGULA
    ;
listaDeclaracao
    : LISTA_UNIFORME IDENTIFICADOR IGUAL (lista)* PONTO_E_VIRGULA
    ;
matrizDeclaracao
    : LISTA_DIVERSA IDENTIFICADOR IGUAL (matrizExpressao)* PONTO_E_VIRGULA
    ;

boleanaDeclaracao
    : BOLEANA IDENTIFICADOR IGUAL PONTO_E_VIRGULA
    ;


matrizExpressao
    : ABRE_CHAVE matrizEstrutura (VIRGULA matrizEstrutura)* FECHA_CHAVE
    ;
matrizEstrutura
    : matrizExpressao
    | DIGITO_LITERAL
    | REAL_LITERAL
    | BOLEANA_LITERAL
    | CADEIA_LITERAL
    | IDENTIFICADOR
    ;
lista
    : ABRE_COLCHETE DIGITO_LITERAL(VIRGULA DIGITO_LITERAL)* FECHA_COLCHETE
    | ABRE_COLCHETE REAL_LITERAL(VIRGULA REAL_LITERAL)* FECHA_COLCHETE
    | ABRE_COLCHETE BOLEANA_LITERAL(VIRGULA BOLEANA_LITERAL)* FECHA_COLCHETE
    | ABRE_COLCHETE CADEIA_LITERAL(VIRGULA CADEIA_LITERAL)* FECHA_COLCHETE
    | matrizExpressao
    | IDENTIFICADOR
    ;
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