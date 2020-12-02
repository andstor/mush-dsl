package tdt4250.pseudocode.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPcodeLexer extends Lexer {
    public static final int All=13;
    public static final int HyphenMinusHyphenMinus=18;
    public static final int RULE_BEGIN=42;
    public static final int Stop=11;
    public static final int Break=7;
    public static final int True=12;
    public static final int False=8;
    public static final int LessThanSign=36;
    public static final int LeftParenthesis=27;
    public static final int To=24;
    public static final int ExclamationMark=26;
    public static final int GreaterThanSign=38;
    public static final int RULE_ID=44;
    public static final int For=14;
    public static final int RightParenthesis=28;
    public static final int GreaterThanSignEqualsSign=21;
    public static final int EqualsSignEqualsSign=20;
    public static final int PlusSign=30;
    public static final int RULE_INT=40;
    public static final int RULE_ML_COMMENT=46;
    public static final int If=22;
    public static final int Interval=5;
    public static final int RULE_END=43;
    public static final int In=23;
    public static final int VerticalLineVerticalLine=25;
    public static final int RULE_STRING=45;
    public static final int Continue=4;
    public static final int RULE_SL_COMMENT=47;
    public static final int Comma=31;
    public static final int EqualsSign=37;
    public static final int HyphenMinus=32;
    public static final int AmpersandAmpersand=16;
    public static final int RULE_DOUBLE=41;
    public static final int LessThanSignEqualsSign=19;
    public static final int Solidus=33;
    public static final int Colon=34;
    public static final int EOF=-1;
    public static final int Asterisk=29;
    public static final int Return=6;
    public static final int RULE_WS=48;
    public static final int While=9;
    public static final int RULE_ANY_OTHER=49;
    public static final int CircumflexAccent=39;
    public static final int Semicolon=35;
    public static final int PlusSignPlusSign=17;
    public static final int Else=10;
    public static final int ExclamationMarkEqualsSign=15;

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

    // $ANTLR start "Continue"
    public final void mContinue() throws RecognitionException {
        try {
            int _type = Continue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:14:10: ( 'continue' )
            // InternalPcodeLexer.g:14:12: 'continue'
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

    // $ANTLR start "Interval"
    public final void mInterval() throws RecognitionException {
        try {
            int _type = Interval;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:16:10: ( 'interval' )
            // InternalPcodeLexer.g:16:12: 'interval'
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

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:18:8: ( 'return' )
            // InternalPcodeLexer.g:18:10: 'return'
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

    // $ANTLR start "Break"
    public final void mBreak() throws RecognitionException {
        try {
            int _type = Break;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:20:7: ( 'break' )
            // InternalPcodeLexer.g:20:9: 'break'
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
            // InternalPcodeLexer.g:22:7: ( 'false' )
            // InternalPcodeLexer.g:22:9: 'false'
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

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:24:7: ( 'while' )
            // InternalPcodeLexer.g:24:9: 'while'
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
            // InternalPcodeLexer.g:26:6: ( 'else' )
            // InternalPcodeLexer.g:26:8: 'else'
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

    // $ANTLR start "Stop"
    public final void mStop() throws RecognitionException {
        try {
            int _type = Stop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:28:6: ( 'stop' )
            // InternalPcodeLexer.g:28:8: 'stop'
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

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:30:6: ( 'true' )
            // InternalPcodeLexer.g:30:8: 'true'
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

    // $ANTLR start "All"
    public final void mAll() throws RecognitionException {
        try {
            int _type = All;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:32:5: ( 'all' )
            // InternalPcodeLexer.g:32:7: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "All"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:34:5: ( 'for' )
            // InternalPcodeLexer.g:34:7: 'for'
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

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:36:27: ( '!=' )
            // InternalPcodeLexer.g:36:29: '!='
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
            // InternalPcodeLexer.g:38:20: ( '&&' )
            // InternalPcodeLexer.g:38:22: '&&'
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

    // $ANTLR start "PlusSignPlusSign"
    public final void mPlusSignPlusSign() throws RecognitionException {
        try {
            int _type = PlusSignPlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:40:18: ( '++' )
            // InternalPcodeLexer.g:40:20: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignPlusSign"

    // $ANTLR start "HyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:42:24: ( '--' )
            // InternalPcodeLexer.g:42:26: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinus"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:44:24: ( '<=' )
            // InternalPcodeLexer.g:44:26: '<='
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
            // InternalPcodeLexer.g:46:22: ( '==' )
            // InternalPcodeLexer.g:46:24: '=='
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
            // InternalPcodeLexer.g:48:27: ( '>=' )
            // InternalPcodeLexer.g:48:29: '>='
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

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:50:4: ( 'if' )
            // InternalPcodeLexer.g:50:6: 'if'
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

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:52:4: ( 'in' )
            // InternalPcodeLexer.g:52:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:54:4: ( 'to' )
            // InternalPcodeLexer.g:54:6: 'to'
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
            // InternalPcodeLexer.g:56:26: ( '||' )
            // InternalPcodeLexer.g:56:28: '||'
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
            // InternalPcodeLexer.g:58:17: ( '!' )
            // InternalPcodeLexer.g:58:19: '!'
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
            // InternalPcodeLexer.g:60:17: ( '(' )
            // InternalPcodeLexer.g:60:19: '('
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
            // InternalPcodeLexer.g:62:18: ( ')' )
            // InternalPcodeLexer.g:62:20: ')'
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
            // InternalPcodeLexer.g:64:10: ( '*' )
            // InternalPcodeLexer.g:64:12: '*'
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
            // InternalPcodeLexer.g:66:10: ( '+' )
            // InternalPcodeLexer.g:66:12: '+'
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
            // InternalPcodeLexer.g:68:7: ( ',' )
            // InternalPcodeLexer.g:68:9: ','
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
            // InternalPcodeLexer.g:70:13: ( '-' )
            // InternalPcodeLexer.g:70:15: '-'
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
            // InternalPcodeLexer.g:72:9: ( '/' )
            // InternalPcodeLexer.g:72:11: '/'
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

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:74:7: ( ':' )
            // InternalPcodeLexer.g:74:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:76:11: ( ';' )
            // InternalPcodeLexer.g:76:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:78:14: ( '<' )
            // InternalPcodeLexer.g:78:16: '<'
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
            // InternalPcodeLexer.g:80:12: ( '=' )
            // InternalPcodeLexer.g:80:14: '='
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
            // InternalPcodeLexer.g:82:17: ( '>' )
            // InternalPcodeLexer.g:82:19: '>'
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

    // $ANTLR start "CircumflexAccent"
    public final void mCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:84:18: ( '^' )
            // InternalPcodeLexer.g:84:20: '^'
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

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:86:13: ( RULE_INT '.' RULE_INT )
            // InternalPcodeLexer.g:86:15: RULE_INT '.' RULE_INT
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

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalPcodeLexer.g:88:21: ()
            // InternalPcodeLexer.g:88:23: 
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
            // InternalPcodeLexer.g:90:19: ()
            // InternalPcodeLexer.g:90:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcodeLexer.g:92:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPcodeLexer.g:92:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPcodeLexer.g:92:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPcodeLexer.g:92:11: '^'
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

            // InternalPcodeLexer.g:92:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalPcodeLexer.g:94:10: ( ( '0' .. '9' )+ )
            // InternalPcodeLexer.g:94:12: ( '0' .. '9' )+
            {
            // InternalPcodeLexer.g:94:12: ( '0' .. '9' )+
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
            	    // InternalPcodeLexer.g:94:13: '0' .. '9'
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
            // InternalPcodeLexer.g:96:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPcodeLexer.g:96:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPcodeLexer.g:96:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPcodeLexer.g:96:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPcodeLexer.g:96:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalPcodeLexer.g:96:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPcodeLexer.g:96:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPcodeLexer.g:96:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPcodeLexer.g:96:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalPcodeLexer.g:96:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPcodeLexer.g:96:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPcodeLexer.g:98:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPcodeLexer.g:98:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPcodeLexer.g:98:24: ( options {greedy=false; } : . )*
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
            	    // InternalPcodeLexer.g:98:52: .
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
            // InternalPcodeLexer.g:100:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPcodeLexer.g:100:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPcodeLexer.g:100:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPcodeLexer.g:100:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalPcodeLexer.g:100:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPcodeLexer.g:100:41: ( '\\r' )? '\\n'
                    {
                    // InternalPcodeLexer.g:100:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPcodeLexer.g:100:41: '\\r'
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
            // InternalPcodeLexer.g:102:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPcodeLexer.g:102:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPcodeLexer.g:102:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalPcodeLexer.g:104:16: ( . )
            // InternalPcodeLexer.g:104:18: .
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
        // InternalPcodeLexer.g:1:8: ( Continue | Interval | Return | Break | False | While | Else | Stop | True | All | For | ExclamationMarkEqualsSign | AmpersandAmpersand | PlusSignPlusSign | HyphenMinusHyphenMinus | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | If | In | To | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | CircumflexAccent | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=44;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPcodeLexer.g:1:10: Continue
                {
                mContinue(); 

                }
                break;
            case 2 :
                // InternalPcodeLexer.g:1:19: Interval
                {
                mInterval(); 

                }
                break;
            case 3 :
                // InternalPcodeLexer.g:1:28: Return
                {
                mReturn(); 

                }
                break;
            case 4 :
                // InternalPcodeLexer.g:1:35: Break
                {
                mBreak(); 

                }
                break;
            case 5 :
                // InternalPcodeLexer.g:1:41: False
                {
                mFalse(); 

                }
                break;
            case 6 :
                // InternalPcodeLexer.g:1:47: While
                {
                mWhile(); 

                }
                break;
            case 7 :
                // InternalPcodeLexer.g:1:53: Else
                {
                mElse(); 

                }
                break;
            case 8 :
                // InternalPcodeLexer.g:1:58: Stop
                {
                mStop(); 

                }
                break;
            case 9 :
                // InternalPcodeLexer.g:1:63: True
                {
                mTrue(); 

                }
                break;
            case 10 :
                // InternalPcodeLexer.g:1:68: All
                {
                mAll(); 

                }
                break;
            case 11 :
                // InternalPcodeLexer.g:1:72: For
                {
                mFor(); 

                }
                break;
            case 12 :
                // InternalPcodeLexer.g:1:76: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 13 :
                // InternalPcodeLexer.g:1:102: AmpersandAmpersand
                {
                mAmpersandAmpersand(); 

                }
                break;
            case 14 :
                // InternalPcodeLexer.g:1:121: PlusSignPlusSign
                {
                mPlusSignPlusSign(); 

                }
                break;
            case 15 :
                // InternalPcodeLexer.g:1:138: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 16 :
                // InternalPcodeLexer.g:1:161: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 17 :
                // InternalPcodeLexer.g:1:184: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 18 :
                // InternalPcodeLexer.g:1:205: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 19 :
                // InternalPcodeLexer.g:1:231: If
                {
                mIf(); 

                }
                break;
            case 20 :
                // InternalPcodeLexer.g:1:234: In
                {
                mIn(); 

                }
                break;
            case 21 :
                // InternalPcodeLexer.g:1:237: To
                {
                mTo(); 

                }
                break;
            case 22 :
                // InternalPcodeLexer.g:1:240: VerticalLineVerticalLine
                {
                mVerticalLineVerticalLine(); 

                }
                break;
            case 23 :
                // InternalPcodeLexer.g:1:265: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 24 :
                // InternalPcodeLexer.g:1:281: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 25 :
                // InternalPcodeLexer.g:1:297: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 26 :
                // InternalPcodeLexer.g:1:314: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 27 :
                // InternalPcodeLexer.g:1:323: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 28 :
                // InternalPcodeLexer.g:1:332: Comma
                {
                mComma(); 

                }
                break;
            case 29 :
                // InternalPcodeLexer.g:1:338: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 30 :
                // InternalPcodeLexer.g:1:350: Solidus
                {
                mSolidus(); 

                }
                break;
            case 31 :
                // InternalPcodeLexer.g:1:358: Colon
                {
                mColon(); 

                }
                break;
            case 32 :
                // InternalPcodeLexer.g:1:364: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 33 :
                // InternalPcodeLexer.g:1:374: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 34 :
                // InternalPcodeLexer.g:1:387: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 35 :
                // InternalPcodeLexer.g:1:398: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 36 :
                // InternalPcodeLexer.g:1:414: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 37 :
                // InternalPcodeLexer.g:1:431: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 38 :
                // InternalPcodeLexer.g:1:443: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalPcodeLexer.g:1:451: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // InternalPcodeLexer.g:1:460: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // InternalPcodeLexer.g:1:472: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // InternalPcodeLexer.g:1:488: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // InternalPcodeLexer.g:1:504: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalPcodeLexer.g:1:512: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\12\42\1\60\1\40\1\63\1\65\1\67\1\71\1\73\1\40\4\uffff\1\103\2\uffff\1\106\1\107\1\uffff\2\40\2\uffff\1\42\1\uffff\1\116\1\117\10\42\1\130\1\42\32\uffff\1\107\2\uffff\2\42\2\uffff\3\42\1\137\4\42\1\uffff\1\144\5\42\1\uffff\1\42\1\153\1\154\1\155\1\uffff\3\42\1\161\1\162\1\163\3\uffff\2\42\1\166\3\uffff\2\42\1\uffff\1\171\1\172\2\uffff";
    static final String DFA12_eofS =
        "\173\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\1\146\1\145\1\162\1\141\1\150\1\154\1\164\1\157\1\154\1\75\1\46\1\53\1\55\3\75\1\174\4\uffff\1\52\2\uffff\1\101\1\56\1\uffff\2\0\2\uffff\1\156\1\uffff\2\60\1\164\1\145\1\154\1\162\1\151\1\163\1\157\1\165\1\60\1\154\32\uffff\1\56\2\uffff\1\164\1\145\2\uffff\1\165\1\141\1\163\1\60\1\154\1\145\1\160\1\145\1\uffff\1\60\1\151\2\162\1\153\1\145\1\uffff\1\145\3\60\1\uffff\1\156\1\166\1\156\3\60\3\uffff\1\165\1\141\1\60\3\uffff\1\145\1\154\1\uffff\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\156\1\145\1\162\1\157\1\150\1\154\1\164\1\162\1\154\1\75\1\46\1\53\1\55\3\75\1\174\4\uffff\1\57\2\uffff\1\172\1\71\1\uffff\2\uffff\2\uffff\1\156\1\uffff\2\172\1\164\1\145\1\154\1\162\1\151\1\163\1\157\1\165\1\172\1\154\32\uffff\1\71\2\uffff\1\164\1\145\2\uffff\1\165\1\141\1\163\1\172\1\154\1\145\1\160\1\145\1\uffff\1\172\1\151\2\162\1\153\1\145\1\uffff\1\145\3\172\1\uffff\1\156\1\166\1\156\3\172\3\uffff\1\165\1\141\1\172\3\uffff\1\145\1\154\1\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\23\uffff\1\30\1\31\1\32\1\34\1\uffff\1\37\1\40\2\uffff\1\46\2\uffff\1\53\1\54\1\uffff\1\46\14\uffff\1\14\1\27\1\15\1\16\1\33\1\17\1\35\1\20\1\41\1\21\1\42\1\22\1\43\1\26\1\30\1\31\1\32\1\34\1\51\1\52\1\36\1\37\1\40\1\44\1\47\1\45\1\uffff\1\50\1\53\2\uffff\1\24\1\23\10\uffff\1\25\6\uffff\1\13\4\uffff\1\12\6\uffff\1\7\1\10\1\11\3\uffff\1\4\1\5\1\6\2\uffff\1\3\2\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\1\0\34\uffff\1\1\1\2\134\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\13\1\35\3\40\1\14\1\36\1\23\1\24\1\25\1\15\1\26\1\16\1\40\1\27\12\33\1\30\1\31\1\17\1\20\1\21\2\40\32\34\3\40\1\32\1\34\1\40\1\12\1\4\1\1\1\34\1\7\1\5\2\34\1\2\10\34\1\3\1\10\1\11\2\34\1\6\3\34\1\40\1\22\uff83\40",
            "\1\41",
            "\1\44\7\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47\15\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\55\2\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\61",
            "\1\62",
            "\1\64",
            "\1\66",
            "\1\70",
            "\1\72",
            "\1\74",
            "",
            "",
            "",
            "",
            "\1\101\4\uffff\1\102",
            "",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\110\1\uffff\12\111",
            "",
            "\0\112",
            "\0\112",
            "",
            "",
            "\1\114",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\115\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\131",
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
            "\1\110\1\uffff\12\111",
            "",
            "",
            "\1\132",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\164",
            "\1\165",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\167",
            "\1\170",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
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
            return "1:1: Tokens : ( Continue | Interval | Return | Break | False | While | Else | Stop | True | All | For | ExclamationMarkEqualsSign | AmpersandAmpersand | PlusSignPlusSign | HyphenMinusHyphenMinus | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | If | In | To | VerticalLineVerticalLine | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | CircumflexAccent | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='i') ) {s = 2;}

                        else if ( (LA12_0=='r') ) {s = 3;}

                        else if ( (LA12_0=='b') ) {s = 4;}

                        else if ( (LA12_0=='f') ) {s = 5;}

                        else if ( (LA12_0=='w') ) {s = 6;}

                        else if ( (LA12_0=='e') ) {s = 7;}

                        else if ( (LA12_0=='s') ) {s = 8;}

                        else if ( (LA12_0=='t') ) {s = 9;}

                        else if ( (LA12_0=='a') ) {s = 10;}

                        else if ( (LA12_0=='!') ) {s = 11;}

                        else if ( (LA12_0=='&') ) {s = 12;}

                        else if ( (LA12_0=='+') ) {s = 13;}

                        else if ( (LA12_0=='-') ) {s = 14;}

                        else if ( (LA12_0=='<') ) {s = 15;}

                        else if ( (LA12_0=='=') ) {s = 16;}

                        else if ( (LA12_0=='>') ) {s = 17;}

                        else if ( (LA12_0=='|') ) {s = 18;}

                        else if ( (LA12_0=='(') ) {s = 19;}

                        else if ( (LA12_0==')') ) {s = 20;}

                        else if ( (LA12_0=='*') ) {s = 21;}

                        else if ( (LA12_0==',') ) {s = 22;}

                        else if ( (LA12_0=='/') ) {s = 23;}

                        else if ( (LA12_0==':') ) {s = 24;}

                        else if ( (LA12_0==';') ) {s = 25;}

                        else if ( (LA12_0=='^') ) {s = 26;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 27;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='d'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='q')||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 28;}

                        else if ( (LA12_0=='\"') ) {s = 29;}

                        else if ( (LA12_0=='\'') ) {s = 30;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 31;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='%')||LA12_0=='.'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 74;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 74;}

                        else s = 32;

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