/*
 * generated by Xtext 2.22.0
 */
lexer grammar InternalPcodeLexer;

@header {
package tdt4250.pseudocode.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Executable : ('E'|'e')('X'|'x')('E'|'e')('C'|'c')('U'|'u')('T'|'t')('A'|'a')('B'|'b')('L'|'l')('E'|'e');

Contains : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('S'|'s');

Continue : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('I'|'i')('N'|'n')('U'|'u')('E'|'e');

Exchange : ('E'|'e')('X'|'x')('C'|'c')('H'|'h')('A'|'a')('N'|'n')('G'|'g')('E'|'e');

Interval : ('I'|'i')('N'|'n')('T'|'t')('E'|'e')('R'|'r')('V'|'v')('A'|'a')('L'|'l');

Decimal : ('D'|'d')('E'|'e')('C'|'c')('I'|'i')('M'|'m')('A'|'a')('L'|'l');

Package : ('P'|'p')('A'|'a')('C'|'c')('K'|'k')('A'|'a')('G'|'g')('E'|'e');

Number : ('N'|'n')('U'|'u')('M'|'m')('B'|'b')('E'|'e')('R'|'r');

Equals : ('E'|'e')('Q'|'q')('U'|'u')('A'|'a')('L'|'l')('S'|'s');

Remove : ('R'|'r')('E'|'e')('M'|'m')('O'|'o')('V'|'v')('E'|'e');

Return : ('R'|'r')('E'|'e')('T'|'t')('U'|'u')('R'|'r')('N'|'n');

Array_1 : ('A'|'a')('R'|'r')('R'|'r')('A'|'a')('Y'|'y');

Break : ('B'|'b')('R'|'r')('E'|'e')('A'|'a')('K'|'k');

False : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

Index : ('I'|'i')('N'|'n')('D'|'d')('E'|'e')('X'|'x');

Minus : ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('S'|'s');

Print : ('P'|'p')('R'|'r')('I'|'i')('N'|'n')('T'|'t');

Table_1 : ('T'|'t')('A'|'a')('B'|'b')('L'|'l')('E'|'e');

While : ('W'|'w')('H'|'h')('I'|'i')('L'|'l')('E'|'e');

Text : ('T'|'t')('E'|'e')('X'|'x')('T'|'t');

Else : ('E'|'e')('L'|'l')('S'|'s')('E'|'e');

Line : ('L'|'l')('I'|'i')('N'|'n')('E'|'e');

List_1 : ('L'|'l')('I'|'i')('S'|'s')('T'|'t');

Plus : ('P'|'p')('L'|'l')('U'|'u')('S'|'s');

Stop : ('S'|'s')('T'|'t')('O'|'o')('P'|'p');

That : ('T'|'t')('H'|'h')('A'|'a')('T'|'t');

Then : ('T'|'t')('H'|'h')('E'|'e')('N'|'n');

True : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

With : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');

Add : ('A'|'a')('D'|'d')('D'|'d');

For : ('F'|'f')('O'|'o')('R'|'r');

New : ('N'|'n')('E'|'e')('W'|'w');

ExclamationMarkEqualsSign : '!''=';

AmpersandAmpersand : '&''&';

PlusSignPlusSign : '+''+';

PlusSignEqualsSign : '+''=';

HyphenMinusHyphenMinus : '-''-';

HyphenMinusEqualsSign : '-''=';

LessThanSignEqualsSign : '<''=';

EqualsSignEqualsSign : '=''=';

GreaterThanSignEqualsSign : '>''=';

At : ('A'|'a')('T'|'t');

If : ('I'|'i')('F'|'f');

Is : ('I'|'i')('S'|'s');

To : ('T'|'t')('O'|'o');

VerticalLineVerticalLine : '|''|';

ExclamationMark : '!';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

CircumflexAccent : '^';

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
