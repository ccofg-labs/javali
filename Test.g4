grammar Test;

program: statement + EOF;

statement
    : '{'statement*'}'                                  # block
    | primitiveType IDENTIFIER (',' IDENTIFIER)* ES     # declaration
    | IF '('expression')' statement (ELSE statement)?   # if
    | WHILE '('expression')' statement                  # while
    | expression ES                                     # statementExpression
    | READ IDENTIFIER (',' IDENTIFIER)* ES              # read
    | WRITE expression (',' expression)* ES             # write
    | ES                                                # empty
    ;

primitiveType
    : BOOL
    | INT
    | FLOAT
    | STRING
    ;

expression
    : primary                                           #value
    | prefix='-' expression                             #unaryMinus
    | prefix='!' expression                             #not
    | expression bop=(MUL|DIV|MOD) expression           #mul
    | expression bop=(ADD|SUB|DOT) expression           #add
    | expression bop=(GT|LT) expression                 #relational
    | expression bop=(EQ|NEQ) expression                #equality
    | expression bop= AND expression                    #and
    | expression bop= OR expression                     #or
    | <assoc=right> IDENTIFIER ASS expression           #assignment
    ;

primary
    : '(' expression ')'                                #primaryExpression
    | DECIMAL_LITERAL                                   #primaryDecimal
    | FLOAT_LITERAL                                     #primaryFloat
    | STRING_LITERAL                                    #primaryString
    | BOOL_LITERAL                                      #primaryBool
    | IDENTIFIER                                        #primaryIdentifier
    ;

//KW
BOOL:               'bool';
ELSE:               'else';
FLOAT:              'float';
IF:                 'if';
INT:                'int';
STRING:             'string';
WHILE:              'while';
READ :              'read';
WRITE :             'write';

//LIT
DECIMAL_LITERAL :       [0-9]+ ;
FLOAT_LITERAL :         [0-9]+'.'[0-9]+ ;
BOOL_LITERAL :          'true'
                       |'false' ;
STRING_LITERAL: '"'(~["\\\r\n])* '"';

IDENTIFIER : [A-Za-z][0-9A-Za-z]*;

//OP
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
ASS: '=';

MOD:'%';
DOT:'.';

GT:'>';
LT:'<';
EQ:'==';
NEQ:'!=';

NOT: '!';
AND: '&&';
OR: '||';


ES: ';';

WS : [ \r\t\n]+ -> skip ;