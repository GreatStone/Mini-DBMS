grammar sql;

@header{
import java.util.*;
import com.db.minidb.data.value.*;
import com.db.minidb.dict.type.*;
import DBMS.execute.*;
}
           

start: (sqls ';')* EOF;

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


sql_use returns [ValueBase value]
	:	KEY_USE database_name;

sql_drop_table returns [ValueBase value]
	:	KEY_DROP KEY_TABLE table_name{System.out.println("sql_drop_table");};

sql_drop_database returns [ValueBase value]
	:	KEY_DROP database_name {System.out.println("sql_drop_database");};

sql_create_database returns [ValueBase value]
	:	KEY_CREATE database_name {System.out.println("SQLCREATEDATABASE");};

sql_create_table returns [ValueBase value]
	:	KEY_CREATE KEY_TABLE table_name '('
		col_type (',' col_type )*
		(',' primary_col)?
		(',' foreign_col)*
		')' {System.out.println("SQL_CREATE_TABLE");};

col_type
	:	colomn_name types ((KEY_NOT)? KEY_NULL)?;

primary_col
	: 	KEY_PRIMARY KEY_KEY ('('colomn_name (',' colomn_name)* ')');

foreign_col
	:	KEY_FOREIGN KEY_KEY colomn_name KEY_REFERENCES table_name colomn_name;

sql_select returns [SelectSet value]
	:	KEY_SELECT colomns (',' colomns)* 
		KEY_FROM tables  (',' tables)*
		sql_where? {System.out.println("SQL_SELECT");};

sql_insert returns [ValueBase value]
	:	KEY_INSERT KEY_INTO tables KEY_VALUES
		'(' consts (',' consts)* ')' {System.out.println("SQL_INSERT");};

sql_update returns [ValueBase value]
	:	KEY_INSERT KEY_SET colomns '=' expr (',' colomns '=' expr)
		sql_where?{System.out.println("SQL_UPDATE");};

sql_delete returns [ValueBase value]
	:	KEY_DELETE KEY_FROM tables
		sql_where? {System.out.println("SQL_DELETE");};

sql_where returns [ValueBase value]
	:
	(KEY_WHERE expr) {System.out.println("SQL_WHERE");};

tables
	:	table_name (KEY_AS table_alias_name)?{System.out.println("TABLES");};

colomns
         :	(colomn_name (KEY_AS colomn_alias_name)?)
         |  (val KEY_AS colomn_alias_name)
         | '*';

consts returns [ValueBase value]
	:	x=type_int {$value = $x.value; }
                |y=type_double {$value = $y.value;}
                |z=type_string {$value = $z.value;};

types returns [TypeDataEnum value]
	:	KEY_INT{$value = TypeDataEnum.INT;}
	|KEY_DOUBLE{$value=TypeDataEnum.DOUBLE;}
	|KEY_STRING{$value=TypeDataEnum.STRING;};

compare
	:	LT|LT_EQ|GT|GT_EQ|EQ|NOT_EQ;

bool_op
	:	KEY_AND|KEY_OR;
op
	:	PLUS|MINUS|STAR|DIV;

select_or_set returns [SelectSet value]
	:	'(' sql_select ')'
	|	( '(' (type_int|type_double|type_string) ( ',' (type_int|type_double|type_string))* ')');

subval returns [ValueBase value]
    :   (colomn_name) | (consts)|((consts|colomn_name) op (consts|colomn_name));

val returns [ValueBase value]
    :   (subval) | (subval op subval);

sub_bool_val returns [ValueBase value]
    :   (val compare val);

bool_val returns [ValueBase value]
    :   (sub_bool_val)
        | (sub_bool_val bool_op sub_bool_val) 
        | ((KEY_NOT)? KEY_EXISTS select_or_set)
        | (val (KEY_NOT)? KEY_IN select_or_set);

expr returns [ValueBase value]
	:	val
	|	(val op val)
	|	(val compare val)
	|	(bool_val bool_op bool_val)
    ;

colomn_name returns [ValueBase value] : x=IDENTIFIER{System.out.println("COLOMN_NAME");}
                                          | (IDENTIFIER DOT IDENTIFIER);
colomn_alias_name returns [ValueBase value] : x = IDENTIFIER {System.out.println("COLOMN_ALIAS_NAME");};
table_name returns[String value] : x = IDENTIFIER{$value = new String ($x.text);};
table_alias_name returns [String value] : x = IDENTIFIER{$value = new String($x.text);};
database_name returns [String value] :  x= IDENTIFIER{$value =  new String($x.text);};
type_int returns[ValueInt value] : x=INTIDENTI {$value = new ValueInt(TypeDataEnum.INT,new Integer($x.text));};
type_double returns [ValueDouble value] : x=DOUBLEIDENTI {$value = new ValueDouble(TypeDataEnum.DOUBLE,new Double($x.text));};
type_string returns [ValueString value] : x=STRINGIDENTI {String __ = $x.text; $value = new ValueString(TypeDataEnum.STRING,__.substring(1,__.length()-1));};

KEY_ALTER : A L T E R;
KEY_AND	: A N D;
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
KEY_OR : O R;
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
    :  ([O-9]+('.'[0-9]*)?)|(([0-9])*'.'[0-9]+);
STRINGIDENTI
    :   '"'[a-zA-Z0-9`~@#$%^&*()_-=+,.<>/?;:']*'"';

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