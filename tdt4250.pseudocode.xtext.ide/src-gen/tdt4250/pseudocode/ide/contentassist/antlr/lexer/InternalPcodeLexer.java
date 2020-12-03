package tdt4250.pseudocode.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPcodeLexer extends Lexer {
    public static final int Add=29;
    public static final int New=32;
    public static final int RULE_BEGIN=60;
    public static final int Stop=24;
    public static final int Break=14;
    public static final int True=27;
    public static final int Index=16;
    public static final int Remove=11;
    public static final int False=15;
    public static final int LessThanSign=51;
    public static final int Print=18;
    public static final int LeftParenthesis=44;
    public static final int Decimal=8;
    public static final int List=22;
    public static final int Then=26;
    public static final int To=41;
    public static final int Plus=23;
    public static final int RightSquareBracket=55;
    public static final int ExclamationMark=43;
    public static final int GreaterThanSign=53;
    public static final int RULE_ID=64;
    public static final int For=31;
    public static final int RightParenthesis=45;
    public static final int GreaterThanSignEqualsSign=37;
    public static final int Exchange=6;
    public static final int EqualsSignEqualsSign=36;
    public static final int And=30;
    public static final int PlusSign=47;
    public static final int RULE_INT=62;
    public static final int Contains=4;
    public static final int RULE_ML_COMMENT=66;
    public static final int LeftSquareBracket=54;
    public static final int If=39;
    public static final int Minus=17;
    public static final int Interval=7;
    public static final int A=57;
    public static final int RULE_END=61;
    public static final int VerticalLineVerticalLine=42;
    public static final int Is=40;
    public static final int RULE_STRING=65;
    public static final int Continue=5;
    public static final int With=28;
    public static final int RULE_SL_COMMENT=67;
    public static final int Comma=48;
    public static final int EqualsSign=52;
    public static final int HyphenMinus=49;
    public static final int At=38;
    public static final int Number=10;
    public static final int AmpersandAmpersand=34;
    public static final int RULE_DOUBLE=63;
    public static final int LessThanSignEqualsSign=35;
    public static final int Solidus=50;
    public static final int RightCurlyBracket=59;
    public static final int EOF=-1;
    public static final int Asterisk=46;
    public static final int Return=12;
    public static final int Table=19;
    public static final int RULE_WS=68;
    public static final int LeftCurlyBracket=58;
    public static final int Text=25;
    public static final int While=20;
    public static final int RULE_ANY_OTHER=69;
    public static final int CircumflexAccent=56;
    public static final int Array=13;
    public static final int Equals=9;
    public static final int Else=21;
    public static final int ExclamationMarkEqualsSign=33;

    // delegates
    // delegators

    public InternalPcodeLexer() {;} 
    public InternalPcodeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPcodeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPcodeLexer.g"; }

    // $ANTLR start "Contains"
    public final void mContains() throws RecognitionException {
        try {
            int _type = Contains;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:14:10: ( 'contains' )
            // InternalPcodeLexer.g:14:12: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Contains"

    // $ANTLR start "Continue"
    public final void mContinue() throws RecognitionException {
        try {
            int _type = Continue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:16:10: ( 'continue' )
            // InternalPcodeLexer.g:16:12: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Continue"

    // $ANTLR start "Exchange"
    public final void mExchange() throws RecognitionException {
        try {
            int _type = Exchange;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:18:10: ( 'exchange' )
            // InternalPcodeLexer.g:18:12: 'exchange'
            {
            match("exchange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exchange"

    // $ANTLR start "Interval"
    public final void mInterval() throws RecognitionException {
        try {
            int _type = Interval;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:20:10: ( 'interval' )
            // InternalPcodeLexer.g:20:12: 'interval'
            {
            match("interval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interval"

    // $ANTLR start "Decimal"
    public final void mDecimal() throws RecognitionException {
        try {
            int _type = Decimal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:22:9: ( 'decimal' )
            // InternalPcodeLexer.g:22:11: 'decimal'
            {
            match("decimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Decimal"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:24:8: ( 'equals' )
            // InternalPcodeLexer.g:24:10: 'equals'
            {
            match("equals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:26:8: ( 'number' )
            // InternalPcodeLexer.g:26:10: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Remove"
    public final void mRemove() throws RecognitionException {
        try {
            int _type = Remove;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:28:8: ( 'remove' )
            // InternalPcodeLexer.g:28:10: 'remove'
            {
            match("remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Remove"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:30:8: ( 'return' )
            // InternalPcodeLexer.g:30:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:32:7: ( 'array' )
            // InternalPcodeLexer.g:32:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array"

    // $ANTLR start "Break"
    public final void mBreak() throws RecognitionException {
        try {
            int _type = Break;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:34:7: ( 'break' )
            // InternalPcodeLexer.g:34:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Break"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:36:7: ( 'false' )
            // InternalPcodeLexer.g:36:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Index"
    public final void mIndex() throws RecognitionException {
        try {
            int _type = Index;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:38:7: ( 'index' )
            // InternalPcodeLexer.g:38:9: 'index'
            {
            match("index"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Index"

    // $ANTLR start "Minus"
    public final void mMinus() throws RecognitionException {
        try {
            int _type = Minus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:40:7: ( 'minus' )
            // InternalPcodeLexer.g:40:9: 'minus'
            {
            match("minus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Minus"

    // $ANTLR start "Print"
    public final void mPrint() throws RecognitionException {
        try {
            int _type = Print;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:42:7: ( 'print' )
            // InternalPcodeLexer.g:42:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Print"

    // $ANTLR start "Table"
    public final void mTable() throws RecognitionException {
        try {
            int _type = Table;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:44:7: ( 'table' )
            // InternalPcodeLexer.g:44:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Table"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:46:7: ( 'while' )
            // InternalPcodeLexer.g:46:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:48:6: ( 'else' )
            // InternalPcodeLexer.g:48:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "List"
    public final void mList() throws RecognitionException {
        try {
            int _type = List;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:50:6: ( 'list' )
            // InternalPcodeLexer.g:50:8: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "List"

    // $ANTLR start "Plus"
    public final void mPlus() throws RecognitionException {
        try {
            int _type = Plus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:52:6: ( 'plus' )
            // InternalPcodeLexer.g:52:8: 'plus'
            {
            match("plus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Plus"

    // $ANTLR start "Stop"
    public final void mStop() throws RecognitionException {
        try {
            int _type = Stop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:54:6: ( 'stop' )
            // InternalPcodeLexer.g:54:8: 'stop'
            {
            match("stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stop"

    // $ANTLR start "Text"
    public final void mText() throws RecognitionException {
        try {
            int _type = Text;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:56:6: ( 'text' )
            // InternalPcodeLexer.g:56:8: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Text"

    // $ANTLR start "Then"
    public final void mThen() throws RecognitionException {
        try {
            int _type = Then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:58:6: ( 'then' )
            // InternalPcodeLexer.g:58:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Then"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:60:6: ( 'true' )
            // InternalPcodeLexer.g:60:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "With"
    public final void mWith() throws RecognitionException {
        try {
            int _type = With;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:62:6: ( 'with' )
            // InternalPcodeLexer.g:62:8: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "With"

    // $ANTLR start "Add"
    public final void mAdd() throws RecognitionException {
        try {
            int _type = Add;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:64:5: ( 'add' )
            // InternalPcodeLexer.g:64:7: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Add"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:66:5: ( 'and' )
            // InternalPcodeLexer.g:66:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:68:5: ( 'for' )
            // InternalPcodeLexer.g:68:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:70:5: ( 'new' )
            // InternalPcodeLexer.g:70:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:72:27: ( '!=' )
            // InternalPcodeLexer.g:72:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "AmpersandAmpersand"
    public final void mAmpersandAmpersand() throws RecognitionException {
        try {
            int _type = AmpersandAmpersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:74:20: ( '&&' )
            // InternalPcodeLexer.g:74:22: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AmpersandAmpersand"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:76:24: ( '<=' )
            // InternalPcodeLexer.g:76:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:78:22: ( '==' )
            // InternalPcodeLexer.g:78:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:80:27: ( '>=' )
            // InternalPcodeLexer.g:80:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "At"
    public final void mAt() throws RecognitionException {
        try {
            int _type = At;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:82:4: ( 'at' )
            // InternalPcodeLexer.g:82:6: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "At"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:84:4: ( 'if' )
            // InternalPcodeLexer.g:84:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Is"
    public final void mIs() throws RecognitionException {
        try {
            int _type = Is;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:86:4: ( 'is' )
            // InternalPcodeLexer.g:86:6: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Is"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:88:4: ( 'to' )
            // InternalPcodeLexer.g:88:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "VerticalLineVerticalLine"
    public final void mVerticalLineVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLineVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:90:26: ( '||' )
            // InternalPcodeLexer.g:90:28: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLineVerticalLine"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:92:17: ( '!' )
            // InternalPcodeLexer.g:92:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:94:17: ( '(' )
            // InternalPcodeLexer.g:94:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:96:18: ( ')' )
            // InternalPcodeLexer.g:96:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:98:10: ( '*' )
            // InternalPcodeLexer.g:98:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:100:10: ( '+' )
            // InternalPcodeLexer.g:100:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:102:7: ( ',' )
            // InternalPcodeLexer.g:102:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:104:13: ( '-' )
            // InternalPcodeLexer.g:104:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:106:9: ( '/' )
            // InternalPcodeLexer.g:106:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:108:14: ( '<' )
            // InternalPcodeLexer.g:108:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:110:12: ( '=' )
            // InternalPcodeLexer.g:110:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:112:17: ( '>' )
            // InternalPcodeLexer.g:112:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:114:19: ( '[' )
            // InternalPcodeLexer.g:114:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:116:20: ( ']' )
            // InternalPcodeLexer.g:116:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "CircumflexAccent"
    public final void mCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:118:18: ( '^' )
            // InternalPcodeLexer.g:118:20: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccent"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            int _type = A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:120:3: ( 'a' )
            // InternalPcodeLexer.g:120:5: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:122:18: ( '{' )
            // InternalPcodeLexer.g:122:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:124:19: ( '}' )
            // InternalPcodeLexer.g:124:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalPcodeLexer.g:126:21: ()
            // InternalPcodeLexer.g:126:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalPcodeLexer.g:128:19: ()
            // InternalPcodeLexer.g:128:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:130:13: ( RULE_INT '.' RULE_INT )
            // InternalPcodeLexer.g:130:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:132:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPcodeLexer.g:132:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPcodeLexer.g:132:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPcodeLexer.g:132:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPcodeLexer.g:132:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPcodeLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:134:10: ( ( '0' .. '9' )+ )
            // InternalPcodeLexer.g:134:12: ( '0' .. '9' )+
            {
            // InternalPcodeLexer.g:134:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPcodeLexer.g:134:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:136:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPcodeLexer.g:136:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPcodeLexer.g:136:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPcodeLexer.g:136:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPcodeLexer.g:136:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPcodeLexer.g:136:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPcodeLexer.g:136:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPcodeLexer.g:136:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPcodeLexer.g:136:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPcodeLexer.g:136:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPcodeLexer.g:136:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:138:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPcodeLexer.g:138:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPcodeLexer.g:138:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPcodeLexer.g:138:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:140:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPcodeLexer.g:140:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPcodeLexer.g:140:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPcodeLexer.g:140:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPcodeLexer.g:140:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPcodeLexer.g:140:41: ( '\\r' )? '\\n'
                    {
                    // InternalPcodeLexer.g:140:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPcodeLexer.g:140:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:142:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPcodeLexer.g:142:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPcodeLexer.g:142:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPcodeLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:144:16: ( . )
            // InternalPcodeLexer.g:144:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPcodeLexer.g:1:8: ( Contains | Continue | Exchange | Interval | Decimal | Equals | Number | Remove | Return | Array | Break | False | Index | Minus | Print | Table | While | Else | List | Plus | Stop | Text | Then | True | With | Add | And | For | New | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | At | If | Is | To | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | A | LeftCurlyBracket | RightCurlyBracket | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=64;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPcodeLexer.g:1:10: Contains
                {
                mContains(); 

                }
                break;
            case 2 :
                // InternalPcodeLexer.g:1:19: Continue
                {
                mContinue(); 

                }
                break;
            case 3 :
                // InternalPcodeLexer.g:1:28: Exchange
                {
                mExchange(); 

                }
                break;
            case 4 :
                // InternalPcodeLexer.g:1:37: Interval
                {
                mInterval(); 

                }
                break;
            case 5 :
                // InternalPcodeLexer.g:1:46: Decimal
                {
                mDecimal(); 

                }
                break;
            case 6 :
                // InternalPcodeLexer.g:1:54: Equals
                {
                mEquals(); 

                }
                break;
            case 7 :
                // InternalPcodeLexer.g:1:61: Number
                {
                mNumber(); 

                }
                break;
            case 8 :
                // InternalPcodeLexer.g:1:68: Remove
                {
                mRemove(); 

                }
                break;
            case 9 :
                // InternalPcodeLexer.g:1:75: Return
                {
                mReturn(); 

                }
                break;
            case 10 :
                // InternalPcodeLexer.g:1:82: Array
                {
                mArray(); 

                }
                break;
            case 11 :
                // InternalPcodeLexer.g:1:88: Break
                {
                mBreak(); 

                }
                break;
            case 12 :
                // InternalPcodeLexer.g:1:94: False
                {
                mFalse(); 

                }
                break;
            case 13 :
                // InternalPcodeLexer.g:1:100: Index
                {
                mIndex(); 

                }
                break;
            case 14 :
                // InternalPcodeLexer.g:1:106: Minus
                {
                mMinus(); 

                }
                break;
            case 15 :
                // InternalPcodeLexer.g:1:112: Print
                {
                mPrint(); 

                }
                break;
            case 16 :
                // InternalPcodeLexer.g:1:118: Table
                {
                mTable(); 

                }
                break;
            case 17 :
                // InternalPcodeLexer.g:1:124: While
                {
                mWhile(); 

                }
                break;
            case 18 :
                // InternalPcodeLexer.g:1:130: Else
                {
                mElse(); 

                }
                break;
            case 19 :
                // InternalPcodeLexer.g:1:135: List
                {
                mList(); 

                }
                break;
            case 20 :
                // InternalPcodeLexer.g:1:140: Plus
                {
                mPlus(); 

                }
                break;
            case 21 :
                // InternalPcodeLexer.g:1:145: Stop
                {
                mStop(); 

                }
                break;
            case 22 :
                // InternalPcodeLexer.g:1:150: Text
                {
                mText(); 

                }
                break;
            case 23 :
                // InternalPcodeLexer.g:1:155: Then
                {
                mThen(); 

                }
                break;
            case 24 :
                // InternalPcodeLexer.g:1:160: True
                {
                mTrue(); 

                }
                break;
            case 25 :
                // InternalPcodeLexer.g:1:165: With
                {
                mWith(); 

                }
                break;
            case 26 :
                // InternalPcodeLexer.g:1:170: Add
                {
                mAdd(); 

                }
                break;
            case 27 :
                // InternalPcodeLexer.g:1:174: And
                {
                mAnd(); 

                }
                break;
            case 28 :
                // InternalPcodeLexer.g:1:178: For
                {
                mFor(); 

                }
                break;
            case 29 :
                // InternalPcodeLexer.g:1:182: New
                {
                mNew(); 

                }
                break;
            case 30 :
                // InternalPcodeLexer.g:1:186: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 31 :
                // InternalPcodeLexer.g:1:212: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 32 :
                // InternalPcodeLexer.g:1:231: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 33 :
                // InternalPcodeLexer.g:1:254: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 34 :
                // InternalPcodeLexer.g:1:275: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 35 :
                // InternalPcodeLexer.g:1:301: At
                {
                mAt(); 

                }
                break;
            case 36 :
                // InternalPcodeLexer.g:1:304: If
                {
                mIf(); 

                }
                break;
            case 37 :
                // InternalPcodeLexer.g:1:307: Is
                {
                mIs(); 

                }
                break;
            case 38 :
                // InternalPcodeLexer.g:1:310: To
                {
                mTo(); 

                }
                break;
            case 39 :
                // InternalPcodeLexer.g:1:313: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 40 :
                // InternalPcodeLexer.g:1:338: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 41 :
                // InternalPcodeLexer.g:1:354: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 42 :
                // InternalPcodeLexer.g:1:370: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 43 :
                // InternalPcodeLexer.g:1:387: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 44 :
                // InternalPcodeLexer.g:1:396: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 45 :
                // InternalPcodeLexer.g:1:405: Comma
                {
                mComma(); 

                }
                break;
            case 46 :
                // InternalPcodeLexer.g:1:411: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 47 :
                // InternalPcodeLexer.g:1:423: Solidus
                {
                mSolidus(); 

                }
                break;
            case 48 :
                // InternalPcodeLexer.g:1:431: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 49 :
                // InternalPcodeLexer.g:1:444: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 50 :
                // InternalPcodeLexer.g:1:455: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 51 :
                // InternalPcodeLexer.g:1:471: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 52 :
                // InternalPcodeLexer.g:1:489: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 53 :
                // InternalPcodeLexer.g:1:508: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 54 :
                // InternalPcodeLexer.g:1:525: A
                {
                mA(); 

                }
                break;
            case 55 :
                // InternalPcodeLexer.g:1:527: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 56 :
                // InternalPcodeLexer.g:1:544: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 57 :
                // InternalPcodeLexer.g:1:562: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 58 :
                // InternalPcodeLexer.g:1:574: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 59 :
                // InternalPcodeLexer.g:1:582: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 60 :
                // InternalPcodeLexer.g:1:591: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 61 :
                // InternalPcodeLexer.g:1:603: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 62 :
                // InternalPcodeLexer.g:1:619: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 63 :
                // InternalPcodeLexer.g:1:635: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 64 :
                // InternalPcodeLexer.g:1:643: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\6\51\1\70\10\51\1\111\1\47\1\114\1\116\1\120\1\47\6\uffff\1\132\2\uffff\1\135\2\uffff\1\140\1\uffff\2\47\2\uffff\1\51\1\uffff\4\51\1\153\1\154\7\51\1\165\1\uffff\12\51\1\u0080\4\51\32\uffff\1\140\2\uffff\6\51\2\uffff\2\51\1\u008d\3\51\1\u0091\1\u0092\1\uffff\2\51\1\u0095\7\51\1\uffff\7\51\1\u00a5\4\51\1\uffff\3\51\2\uffff\2\51\1\uffff\2\51\1\u00b1\1\51\1\u00b3\1\u00b4\1\u00b5\1\51\1\u00b7\1\u00b8\1\u00b9\4\51\1\uffff\1\51\1\u00bf\4\51\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\uffff\1\u00c9\3\uffff\1\u00ca\3\uffff\3\51\1\u00ce\1\51\1\uffff\1\51\1\u00d1\1\u00d2\1\u00d3\7\uffff\3\51\1\uffff\1\51\1\u00d8\3\uffff\1\u00d9\1\u00da\1\u00db\1\u00dc\5\uffff";
    static final String DFA12_eofS =
        "\u00dd\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\1\154\1\146\3\145\1\60\1\162\1\141\1\151\1\154\1\141\1\150\1\151\1\164\1\75\1\46\3\75\1\174\6\uffff\1\52\2\uffff\1\101\2\uffff\1\56\1\uffff\2\0\2\uffff\1\156\1\uffff\1\143\1\165\1\163\1\144\2\60\1\143\1\155\1\167\1\155\1\162\2\144\1\60\1\uffff\1\145\1\154\1\162\1\156\1\151\1\165\1\142\1\170\1\145\1\165\1\60\1\151\1\164\1\163\1\157\32\uffff\1\56\2\uffff\1\164\1\150\1\141\3\145\2\uffff\1\151\1\142\1\60\1\157\1\165\1\141\2\60\1\uffff\1\141\1\163\1\60\1\165\1\156\1\163\1\154\1\164\1\156\1\145\1\uffff\1\154\1\150\1\164\1\160\2\141\1\154\1\60\1\162\1\170\1\155\1\145\1\uffff\1\166\1\162\1\171\2\uffff\1\153\1\145\1\uffff\1\163\1\164\1\60\1\145\3\60\1\145\3\60\1\151\2\156\1\163\1\uffff\1\166\1\60\1\141\1\162\1\145\1\156\5\60\1\uffff\1\60\3\uffff\1\60\3\uffff\1\156\1\165\1\147\1\60\1\141\1\uffff\1\154\3\60\7\uffff\1\163\2\145\1\uffff\1\154\1\60\3\uffff\4\60\5\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\170\1\163\1\145\1\165\1\145\1\172\1\162\1\157\1\151\2\162\2\151\1\164\1\75\1\46\3\75\1\174\6\uffff\1\57\2\uffff\1\172\2\uffff\1\71\1\uffff\2\uffff\2\uffff\1\156\1\uffff\1\143\1\165\1\163\1\164\2\172\1\143\1\155\1\167\1\164\1\162\2\144\1\172\1\uffff\1\145\1\154\1\162\1\156\1\151\1\165\1\142\1\170\1\145\1\165\1\172\1\151\1\164\1\163\1\157\32\uffff\1\71\2\uffff\1\164\1\150\1\141\3\145\2\uffff\1\151\1\142\1\172\1\157\1\165\1\141\2\172\1\uffff\1\141\1\163\1\172\1\165\1\156\1\163\1\154\1\164\1\156\1\145\1\uffff\1\154\1\150\1\164\1\160\1\151\1\141\1\154\1\172\1\162\1\170\1\155\1\145\1\uffff\1\166\1\162\1\171\2\uffff\1\153\1\145\1\uffff\1\163\1\164\1\172\1\145\3\172\1\145\3\172\1\151\2\156\1\163\1\uffff\1\166\1\172\1\141\1\162\1\145\1\156\5\172\1\uffff\1\172\3\uffff\1\172\3\uffff\1\156\1\165\1\147\1\172\1\141\1\uffff\1\154\3\172\7\uffff\1\163\2\145\1\uffff\1\154\1\172\3\uffff\4\172\5\uffff";
    static final String DFA12_acceptS =
        "\26\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\uffff\1\63\1\64\1\uffff\1\67\1\70\1\uffff\1\72\2\uffff\1\77\1\100\1\uffff\1\72\16\uffff\1\66\17\uffff\1\36\1\50\1\37\1\40\1\60\1\41\1\61\1\42\1\62\1\47\1\51\1\52\1\53\1\54\1\55\1\56\1\75\1\76\1\57\1\63\1\64\1\65\1\67\1\70\1\73\1\71\1\uffff\1\74\1\77\6\uffff\1\44\1\45\10\uffff\1\43\12\uffff\1\46\14\uffff\1\35\3\uffff\1\32\1\33\2\uffff\1\34\17\uffff\1\22\13\uffff\1\24\1\uffff\1\26\1\27\1\30\1\uffff\1\31\1\23\1\25\5\uffff\1\15\4\uffff\1\12\1\13\1\14\1\16\1\17\1\20\1\21\3\uffff\1\6\2\uffff\1\7\1\10\1\11\4\uffff\1\5\1\1\1\2\1\3\1\4";
    static final String DFA12_specialS =
        "\1\2\43\uffff\1\0\1\1\u00b7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\20\1\44\3\47\1\21\1\45\1\26\1\27\1\30\1\31\1\32\1\33\1\47\1\34\12\42\2\47\1\22\1\23\1\24\2\47\32\43\1\35\1\47\1\36\1\37\1\43\1\47\1\7\1\10\1\1\1\4\1\2\1\11\2\43\1\3\2\43\1\16\1\12\1\5\1\43\1\13\1\43\1\6\1\17\1\14\2\43\1\15\3\43\1\40\1\25\1\41\uff82\47",
            "\1\50",
            "\1\54\4\uffff\1\53\6\uffff\1\52",
            "\1\56\7\uffff\1\55\4\uffff\1\57",
            "\1\60",
            "\1\62\17\uffff\1\61",
            "\1\63",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\3\51\1\65\11\51\1\66\3\51\1\64\1\51\1\67\6\51",
            "\1\71",
            "\1\72\15\uffff\1\73",
            "\1\74",
            "\1\76\5\uffff\1\75",
            "\1\77\3\uffff\1\100\2\uffff\1\101\6\uffff\1\103\2\uffff\1\102",
            "\1\104\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\112",
            "\1\113",
            "\1\115",
            "\1\117",
            "\1\121",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130\4\uffff\1\131",
            "",
            "",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\141\1\uffff\12\142",
            "",
            "\0\143",
            "\0\143",
            "",
            "",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\152\17\uffff\1\151",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160\6\uffff\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141\1\uffff\12\142",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0093",
            "\1\u0094",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1\7\uffff\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Contains | Continue | Exchange | Interval | Decimal | Equals | Number | Remove | Return | Array | Break | False | Index | Minus | Print | Table | While | Else | List | Plus | Stop | Text | Then | True | With | Add | And | For | New | ExclamationMarkEqualsSign | AmpersandAmpersand | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | At | If | Is | To | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | A | LeftCurlyBracket | RightCurlyBracket | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) ) {s = 99;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( ((LA12_37>='\u0000' && LA12_37<='\uFFFF')) ) {s = 99;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='e') ) {s = 2;}

                        else if ( (LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='d') ) {s = 4;}

                        else if ( (LA12_0=='n') ) {s = 5;}

                        else if ( (LA12_0=='r') ) {s = 6;}

                        else if ( (LA12_0=='a') ) {s = 7;}

                        else if ( (LA12_0=='b') ) {s = 8;}

                        else if ( (LA12_0=='f') ) {s = 9;}

                        else if ( (LA12_0=='m') ) {s = 10;}

                        else if ( (LA12_0=='p') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='w') ) {s = 13;}

                        else if ( (LA12_0=='l') ) {s = 14;}

                        else if ( (LA12_0=='s') ) {s = 15;}

                        else if ( (LA12_0=='!') ) {s = 16;}

                        else if ( (LA12_0=='&') ) {s = 17;}

                        else if ( (LA12_0=='<') ) {s = 18;}

                        else if ( (LA12_0=='=') ) {s = 19;}

                        else if ( (LA12_0=='>') ) {s = 20;}

                        else if ( (LA12_0=='|') ) {s = 21;}

                        else if ( (LA12_0=='(') ) {s = 22;}

                        else if ( (LA12_0==')') ) {s = 23;}

                        else if ( (LA12_0=='*') ) {s = 24;}

                        else if ( (LA12_0=='+') ) {s = 25;}

                        else if ( (LA12_0==',') ) {s = 26;}

                        else if ( (LA12_0=='-') ) {s = 27;}

                        else if ( (LA12_0=='/') ) {s = 28;}

                        else if ( (LA12_0=='[') ) {s = 29;}

                        else if ( (LA12_0==']') ) {s = 30;}

                        else if ( (LA12_0=='^') ) {s = 31;}

                        else if ( (LA12_0=='{') ) {s = 32;}

                        else if ( (LA12_0=='}') ) {s = 33;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 34;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 35;}

                        else if ( (LA12_0=='\"') ) {s = 36;}

                        else if ( (LA12_0=='\'') ) {s = 37;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 38;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='%')||LA12_0=='.'||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}