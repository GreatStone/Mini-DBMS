grammar sql;

start: (sqls ';')+ EOF;

sqls
	:	sql_use
	|	sql_drop_table
	|	sql_drop_database
	|	sql_create_database
	|	sql_create_table
	|	sql_select
	|	sql_insert
	|	sql_update
	|	sql_delete
	;


sql_use
	:	KEY_USE database_name;

sql_drop_table
	:	KEY_DROP KEY_TABLE table_name;

sql_drop_database
	:	KEY_DROP database_name;

sql_create_database
	:	KEY_CREATE database_name;

sql_create_table
	:	KEY_CREATE KEY_TABLE table_name '('
		colomn_name types ((KEY_NOT)? KEY_NULL)? (',' colomn_name types ((KEY_NOT)? KEY_NULL)? )*
		(',' KEY_PRIMARY KEY_KEY ('('colomn_name (',' colomn_name)* ')'))?
		(',' KEY_FOREIGN KEY_KEY colomn_name KEY_REFERENCES database_name colomn_name)?
		')';

sql_select
	:	KEY_SELECT colomns (',' colomns)* 
		KEY_FROM tables  (',' tables)*
		(KEY_WHERE expr (',' expr)*)?;

sql_insert
	:	KEY_INSERT KEY_INTO tables KEY_VALUES
		'(' consts (',' consts)* ')';

sql_update
	:	KEY_INSERT KEY_SET colomns '=' expr (',' colomns '=' expr)
		(KEY_WHERE expr (',' expr)*)?;

sql_delete
	:	KEY_DELETE KEY_FROM tables
		(KEY_WHERE expr (',' expr)*)?;

tables
	:	table_name (KEY_AS table_alias_name)?;

colomns
         :	colomn_name (KEY_AS colomn_alias_name)?;

consts returns[Object value]
	:	x=type_int {$value = $x.value; }|
                y=type_double {$value = $y.value;} |
                z=type_string {$value = $z.value;};

types
	:	(KEY_INT|KEY_DOUBLE|KEY_STRING);

compare
	:	LT|LT_EQ|GT|GT_EQ|EQ|NOT_EQ;

bool_op
	:	AMP|PIPE;
op
	:	PLUS|MINUS|STAR|DIV;

select_or_set
	:	'(' sql_select ')'
	|	( '(' (type_int|type_double|type_string) ( ',' (type_int|type_double|type_string))* ')');

subval
    :   (((colomn_name|colomn_alias_name)|(consts)) op ((colomn_name|colomn_alias_name)|(consts))) | (colomn_name|colomn_alias_name) | (consts);

val
    :   (subval) | (subval op subval);

sub_bool_val
    :   (val compare val);

bool_val
    :   (sub_bool_val) | (sub_bool_val bool_op val);

expr
	:	((KEY_NOT)? KEY_EXISTS select_or_set)
        |	(val (KEY_NOT)? KEY_IN select_or_set)
	|	val
	|	(val op val)
	|	(val compare val)
	|	(val bool_op val)
    ;

colomn_name : IDENTIFIER;
colomn_alias_name : IDENTIFIER;
table_name : IDENTIFIER;
table_alias_name : IDENTIFIER;
database_name : IDENTIFIER;
type_int returns[Integer value] : x=INTIDENTI {$value = new Integer($x.text);};
type_double returns [Double value] : x=DOUBLEIDENTI{$value=new Double($x.text);};
type_string returns [String value] : x=STRINGIDENTI {$value = new String($x.text);};

KEY_ALTER : A L T E R;
KEY_AS : A S;
KEY_CREATE: C R E A T E;
KEY_DATABASE : D A T A B A S E;
KEY_DELETE : D E L E T E;
KEY_DOUBLE : D O U B L E;
KEY_DROP : D R O P;
KEY_EXISTS : E X I S T S;
KEY_FOREIGN : F O R E I G N;
KEY_FROM : F R O M;
KEY_IF : I F;
KEY_IN : I N;
KEY_INSERT : I N S E R T;
KEY_INT : I N T;
KEY_INTO : I N T O;
KEY_KEY : K E Y;
KEY_NOT : N O T;
KEY_NULL : N U L L;
KEY_ON : O N;
KEY_PRIMARY : P R I M A R Y;
KEY_REFERENCES : R E F E R E N C E S;
KEY_SELECT : S E L E C T;
KEY_SET : S E T;
KEY_STRING : S T R I N G;
KEY_TABLE : T A B L E;
KEY_UPDATE : U P D A T E;
KEY_USE : U S E;
KEY_VALUES : V A L U E S;
KEY_WHERE : W H E R E;

IDENTIFIER
	: [a-zA-Z_][a-zA-Z_0-9]*;
INTIDENTI
    : [0-9]+;
DOUBLEIDENTI
    :  ([O-9]+('.'[0-9])?)|(([0-9])*'.'[0-9]);
STRINGIDENTI
    : '\''[^']*'\'';

SINGLE_LINE_COMMENT
	: '--' ~[\r\n]* -> channel(HIDDEN);

MULTILINE_COMMENT
	: '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN);

SPACES
	: [ \t\u000B\t\r\n] -> channel(HIDDEN);

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '=';
NOT_EQ : '<>';