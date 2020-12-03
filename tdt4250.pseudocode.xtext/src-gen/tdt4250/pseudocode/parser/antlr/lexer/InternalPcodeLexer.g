/*
 * generated by Xtext 2.22.0
 */
lexer grammar InternalPcodeLexer;

@header {
package tdt4250.pseudocode.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Contains : 'contains';

Continue : 'continue';

Exchange : 'exchange';

Interval : 'interval';

Decimal : 'decimal';

Equals : 'equals';

Number : 'number';

Remove : 'remove';

Return : 'return';

Array : 'array';

Break : 'break';

False : 'false';

Index : 'index';

Minus : 'minus';

Print : 'print';

Table : 'table';

While : 'while';

Else : 'else';

List : 'list';

Plus : 'plus';

Stop : 'stop';

Text : 'text';

Then : 'then';

True : 'true';

With : 'with';

Add : 'add';

And : 'and';

For : 'for';

New : 'new';

ExclamationMarkEqualsSign : '!=';

AmpersandAmpersand : '&&';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

At : 'at';

If : 'if';

Is : 'is';

To : 'to';

VerticalLineVerticalLine : '||';

ExclamationMark : '!';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

Solidus : '/';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

CircumflexAccent : '^';

A : 'a';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_DOUBLE : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
