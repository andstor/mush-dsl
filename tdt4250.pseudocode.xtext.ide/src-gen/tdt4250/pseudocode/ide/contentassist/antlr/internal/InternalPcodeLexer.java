package tdt4250.pseudocode.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPcodeLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalPcodeLexer() {;} 
    public InternalPcodeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPcodeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPcode.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:11:7: ( '=' )
            // InternalPcode.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:12:7: ( '+=' )
            // InternalPcode.g:12:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:13:7: ( '-=' )
            // InternalPcode.g:13:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:14:7: ( '++' )
            // InternalPcode.g:14:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:15:7: ( '--' )
            // InternalPcode.g:15:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:16:7: ( 'true' )
            // InternalPcode.g:16:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:17:7: ( 'or' )
            // InternalPcode.g:17:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:18:7: ( 'and' )
            // InternalPcode.g:18:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:19:7: ( '==' )
            // InternalPcode.g:19:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:20:7: ( '!=' )
            // InternalPcode.g:20:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:21:7: ( 'stop' )
            // InternalPcode.g:21:9: 'stop'
            {
            match("stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:22:7: ( 'break' )
            // InternalPcode.g:22:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:23:7: ( 'continue' )
            // InternalPcode.g:23:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:24:7: ( '<' )
            // InternalPcode.g:24:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:25:7: ( '<=' )
            // InternalPcode.g:25:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:26:7: ( '>' )
            // InternalPcode.g:26:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:27:7: ( '>=' )
            // InternalPcode.g:27:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:28:7: ( '+' )
            // InternalPcode.g:28:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:29:7: ( '-' )
            // InternalPcode.g:29:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:30:7: ( '*' )
            // InternalPcode.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:31:7: ( '/' )
            // InternalPcode.g:31:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:32:7: ( '%' )
            // InternalPcode.g:32:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:33:7: ( 'class' )
            // InternalPcode.g:33:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:34:7: ( 'end_class' )
            // InternalPcode.g:34:9: 'end_class'
            {
            match("end_class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:35:7: ( ')' )
            // InternalPcode.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:36:7: ( ',' )
            // InternalPcode.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:37:7: ( 'method' )
            // InternalPcode.g:37:9: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:38:7: ( '(' )
            // InternalPcode.g:38:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:39:7: ( 'end_method' )
            // InternalPcode.g:39:9: 'end_method'
            {
            match("end_method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:40:7: ( 'print' )
            // InternalPcode.g:40:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:41:7: ( '\"' )
            // InternalPcode.g:41:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:42:7: ( '_' )
            // InternalPcode.g:42:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:43:7: ( 'if' )
            // InternalPcode.g:43:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:44:7: ( 'else' )
            // InternalPcode.g:44:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:45:7: ( '!' )
            // InternalPcode.g:45:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:46:7: ( 'not' )
            // InternalPcode.g:46:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:47:7: ( 'exists' )
            // InternalPcode.g:47:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:48:7: ( 'knowing' )
            // InternalPcode.g:48:9: 'knowing'
            {
            match("knowing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:49:7: ( 'for' )
            // InternalPcode.g:49:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:50:7: ( ';' )
            // InternalPcode.g:50:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:51:7: ( ':' )
            // InternalPcode.g:51:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:52:7: ( 'all' )
            // InternalPcode.g:52:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:53:7: ( 'interval' )
            // InternalPcode.g:53:9: 'interval'
            {
            match("interval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:54:7: ( 'to' )
            // InternalPcode.g:54:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:55:7: ( 'in' )
            // InternalPcode.g:55:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:56:7: ( 'repeat' )
            // InternalPcode.g:56:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:57:7: ( 'times' )
            // InternalPcode.g:57:9: 'times'
            {
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:58:7: ( 'while' )
            // InternalPcode.g:58:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:59:7: ( 'until' )
            // InternalPcode.g:59:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:60:7: ( 'return' )
            // InternalPcode.g:60:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:61:7: ( 'total' )
            // InternalPcode.g:61:9: 'total'
            {
            match("total"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:62:7: ( 'division' )
            // InternalPcode.g:62:9: 'division'
            {
            match("division"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPcode.g:4760:13: ( RULE_INT '.' RULE_INT )
            // InternalPcode.g:4760:15: RULE_INT '.' RULE_INT
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
            // InternalPcode.g:4762:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPcode.g:4762:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPcode.g:4762:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPcode.g:4762:11: '^'
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

            // InternalPcode.g:4762:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPcode.g:
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
            // InternalPcode.g:4764:10: ( ( '0' .. '9' )+ )
            // InternalPcode.g:4764:12: ( '0' .. '9' )+
            {
            // InternalPcode.g:4764:12: ( '0' .. '9' )+
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
            	    // InternalPcode.g:4764:13: '0' .. '9'
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
            // InternalPcode.g:4766:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPcode.g:4766:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPcode.g:4766:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPcode.g:4766:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPcode.g:4766:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalPcode.g:4766:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPcode.g:4766:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPcode.g:4766:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPcode.g:4766:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalPcode.g:4766:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPcode.g:4766:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPcode.g:4768:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPcode.g:4768:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPcode.g:4768:24: ( options {greedy=false; } : . )*
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
            	    // InternalPcode.g:4768:52: .
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
            // InternalPcode.g:4770:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPcode.g:4770:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPcode.g:4770:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPcode.g:4770:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalPcode.g:4770:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPcode.g:4770:41: ( '\\r' )? '\\n'
                    {
                    // InternalPcode.g:4770:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPcode.g:4770:41: '\\r'
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
            // InternalPcode.g:4772:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPcode.g:4772:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPcode.g:4772:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalPcode.g:
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
            // InternalPcode.g:4774:16: ( . )
            // InternalPcode.g:4774:18: .
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
        // InternalPcode.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=60;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPcode.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalPcode.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalPcode.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalPcode.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalPcode.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalPcode.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalPcode.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalPcode.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalPcode.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalPcode.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalPcode.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalPcode.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalPcode.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalPcode.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalPcode.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalPcode.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalPcode.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalPcode.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalPcode.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalPcode.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalPcode.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalPcode.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalPcode.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalPcode.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalPcode.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalPcode.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalPcode.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalPcode.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalPcode.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalPcode.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalPcode.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalPcode.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalPcode.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalPcode.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalPcode.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalPcode.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalPcode.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalPcode.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalPcode.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalPcode.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalPcode.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalPcode.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalPcode.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalPcode.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalPcode.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalPcode.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalPcode.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalPcode.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalPcode.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalPcode.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalPcode.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalPcode.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalPcode.g:1:322: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 54 :
                // InternalPcode.g:1:334: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 55 :
                // InternalPcode.g:1:342: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 56 :
                // InternalPcode.g:1:351: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 57 :
                // InternalPcode.g:1:363: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 58 :
                // InternalPcode.g:1:379: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 59 :
                // InternalPcode.g:1:395: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 60 :
                // InternalPcode.g:1:403: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\51\1\54\1\57\3\63\1\70\3\63\1\76\1\100\1\uffff\1\104\1\uffff\1\63\2\uffff\1\63\1\uffff\1\63\1\117\1\120\4\63\2\uffff\4\63\1\134\1\47\1\uffff\1\47\12\uffff\1\63\1\142\1\63\1\uffff\1\144\2\63\2\uffff\4\63\11\uffff\3\63\2\uffff\1\63\1\uffff\1\63\3\uffff\1\160\1\162\3\63\2\uffff\4\63\2\uffff\1\134\1\uffff\2\63\1\uffff\1\63\1\uffff\1\176\1\177\11\63\1\uffff\1\63\1\uffff\1\u008a\1\63\1\u008c\5\63\1\u0092\2\63\2\uffff\1\u0095\4\63\1\u009b\4\63\1\uffff\1\63\1\uffff\5\63\1\uffff\1\u00a6\1\u00a7\1\uffff\1\u00a8\1\63\1\u00aa\2\63\1\uffff\2\63\1\u00af\4\63\1\u00b4\1\u00b5\1\63\3\uffff\1\63\1\uffff\2\63\1\u00ba\1\u00bb\1\uffff\2\63\1\u00be\1\u00bf\2\uffff\4\63\2\uffff\1\63\1\u00c5\2\uffff\1\63\1\u00c7\2\63\1\u00ca\1\uffff\1\u00cb\1\uffff\1\u00cc\1\63\3\uffff\1\u00ce\1\uffff";
    static final String DFA12_eofS =
        "\u00cf\uffff";
    static final String DFA12_minS =
        "\1\0\1\75\1\53\1\55\1\151\1\162\1\154\1\75\1\164\1\162\1\154\2\75\1\uffff\1\52\1\uffff\1\154\2\uffff\1\145\1\uffff\1\162\1\0\1\60\1\146\1\157\1\156\1\157\2\uffff\1\145\1\150\1\156\1\151\1\56\1\101\1\uffff\1\0\12\uffff\1\165\1\60\1\155\1\uffff\1\60\1\144\1\154\2\uffff\1\157\1\145\1\156\1\141\11\uffff\1\144\1\163\1\151\2\uffff\1\164\1\uffff\1\151\3\uffff\2\60\1\164\1\157\1\162\2\uffff\1\160\1\151\1\164\1\166\2\uffff\1\56\1\uffff\1\145\1\141\1\uffff\1\145\1\uffff\2\60\1\160\1\141\1\164\1\163\1\137\1\145\1\163\1\150\1\156\1\uffff\1\145\1\uffff\1\60\1\167\1\60\1\145\1\165\1\154\2\151\1\60\1\154\1\163\2\uffff\1\60\1\153\1\151\1\163\1\143\1\60\1\164\1\157\1\164\1\162\1\uffff\1\151\1\uffff\1\141\1\162\1\145\1\154\1\163\1\uffff\2\60\1\uffff\1\60\1\156\1\60\1\154\1\145\1\uffff\1\163\1\144\1\60\1\166\1\156\1\164\1\156\2\60\1\151\3\uffff\1\165\1\uffff\1\141\1\164\2\60\1\uffff\1\141\1\147\2\60\2\uffff\1\157\1\145\1\163\1\150\2\uffff\1\154\1\60\2\uffff\1\156\1\60\1\163\1\157\1\60\1\uffff\1\60\1\uffff\1\60\1\144\3\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\3\75\2\162\1\156\1\75\1\164\1\162\1\157\2\75\1\uffff\1\57\1\uffff\1\170\2\uffff\1\145\1\uffff\1\162\1\uffff\1\172\1\156\1\157\1\156\1\157\2\uffff\1\145\1\150\1\156\1\151\1\71\1\172\1\uffff\1\uffff\12\uffff\1\165\1\172\1\155\1\uffff\1\172\1\144\1\154\2\uffff\1\157\1\145\1\156\1\141\11\uffff\1\144\1\163\1\151\2\uffff\1\164\1\uffff\1\151\3\uffff\2\172\1\164\1\157\1\162\2\uffff\1\164\1\151\1\164\1\166\2\uffff\1\71\1\uffff\1\145\1\141\1\uffff\1\145\1\uffff\2\172\1\160\1\141\1\164\1\163\1\137\1\145\1\163\1\150\1\156\1\uffff\1\145\1\uffff\1\172\1\167\1\172\1\145\1\165\1\154\2\151\1\172\1\154\1\163\2\uffff\1\172\1\153\1\151\1\163\1\155\1\172\1\164\1\157\1\164\1\162\1\uffff\1\151\1\uffff\1\141\1\162\1\145\1\154\1\163\1\uffff\2\172\1\uffff\1\172\1\156\1\172\1\154\1\145\1\uffff\1\163\1\144\1\172\1\166\1\156\1\164\1\156\2\172\1\151\3\uffff\1\165\1\uffff\1\141\1\164\2\172\1\uffff\1\141\1\147\2\172\2\uffff\1\157\1\145\1\163\1\150\2\uffff\1\154\1\172\2\uffff\1\156\1\172\1\163\1\157\1\172\1\uffff\1\172\1\uffff\1\172\1\144\3\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\15\uffff\1\24\1\uffff\1\26\1\uffff\1\31\1\32\1\uffff\1\34\7\uffff\1\50\1\51\6\uffff\1\66\1\uffff\1\73\1\74\1\11\1\1\1\2\1\4\1\22\1\3\1\5\1\23\3\uffff\1\66\3\uffff\1\12\1\43\4\uffff\1\17\1\16\1\21\1\20\1\24\1\71\1\72\1\25\1\26\3\uffff\1\31\1\32\1\uffff\1\34\1\uffff\1\70\1\37\1\40\5\uffff\1\50\1\51\4\uffff\1\67\1\65\1\uffff\1\73\2\uffff\1\54\1\uffff\1\7\13\uffff\1\41\1\uffff\1\55\13\uffff\1\10\1\52\12\uffff\1\44\1\uffff\1\47\5\uffff\1\6\2\uffff\1\13\5\uffff\1\42\12\uffff\1\63\1\57\1\14\1\uffff\1\27\4\uffff\1\36\4\uffff\1\60\1\61\4\uffff\1\45\1\33\2\uffff\1\56\1\62\5\uffff\1\46\1\uffff\1\15\2\uffff\1\53\1\64\1\30\1\uffff\1\35";
    static final String DFA12_specialS =
        "\1\0\25\uffff\1\2\16\uffff\1\1\u00a9\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\7\1\26\2\47\1\17\1\47\1\45\1\24\1\21\1\15\1\2\1\22\1\3\1\47\1\16\12\42\1\35\1\34\1\13\1\1\1\14\2\47\32\44\3\47\1\43\1\27\1\47\1\6\1\11\1\12\1\41\1\20\1\33\2\44\1\30\1\44\1\32\1\44\1\23\1\31\1\5\1\25\1\44\1\36\1\10\1\4\1\40\1\44\1\37\3\44\uff85\47",
            "\1\50",
            "\1\53\21\uffff\1\52",
            "\1\56\17\uffff\1\55",
            "\1\62\5\uffff\1\61\2\uffff\1\60",
            "\1\64",
            "\1\66\1\uffff\1\65",
            "\1\67",
            "\1\71",
            "\1\72",
            "\1\74\2\uffff\1\73",
            "\1\75",
            "\1\77",
            "",
            "\1\102\4\uffff\1\103",
            "",
            "\1\107\1\uffff\1\106\11\uffff\1\110",
            "",
            "",
            "\1\113",
            "",
            "\1\115",
            "\0\116",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\121\7\uffff\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\135\1\uffff\12\136",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\0\116",
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
            "\1\140",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\141\6\63",
            "\1\143",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\145",
            "\1\146",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\1\156",
            "",
            "\1\157",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\23\63\1\161\6\63",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "\1\166\3\uffff\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\135\1\uffff\12\136",
            "",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u008b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099\11\uffff\1\u009a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b6",
            "",
            "",
            "",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "\1\u00c4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u00c6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c8",
            "\1\u00c9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00cd",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='=') ) {s = 1;}

                        else if ( (LA12_0=='+') ) {s = 2;}

                        else if ( (LA12_0=='-') ) {s = 3;}

                        else if ( (LA12_0=='t') ) {s = 4;}

                        else if ( (LA12_0=='o') ) {s = 5;}

                        else if ( (LA12_0=='a') ) {s = 6;}

                        else if ( (LA12_0=='!') ) {s = 7;}

                        else if ( (LA12_0=='s') ) {s = 8;}

                        else if ( (LA12_0=='b') ) {s = 9;}

                        else if ( (LA12_0=='c') ) {s = 10;}

                        else if ( (LA12_0=='<') ) {s = 11;}

                        else if ( (LA12_0=='>') ) {s = 12;}

                        else if ( (LA12_0=='*') ) {s = 13;}

                        else if ( (LA12_0=='/') ) {s = 14;}

                        else if ( (LA12_0=='%') ) {s = 15;}

                        else if ( (LA12_0=='e') ) {s = 16;}

                        else if ( (LA12_0==')') ) {s = 17;}

                        else if ( (LA12_0==',') ) {s = 18;}

                        else if ( (LA12_0=='m') ) {s = 19;}

                        else if ( (LA12_0=='(') ) {s = 20;}

                        else if ( (LA12_0=='p') ) {s = 21;}

                        else if ( (LA12_0=='\"') ) {s = 22;}

                        else if ( (LA12_0=='_') ) {s = 23;}

                        else if ( (LA12_0=='i') ) {s = 24;}

                        else if ( (LA12_0=='n') ) {s = 25;}

                        else if ( (LA12_0=='k') ) {s = 26;}

                        else if ( (LA12_0=='f') ) {s = 27;}

                        else if ( (LA12_0==';') ) {s = 28;}

                        else if ( (LA12_0==':') ) {s = 29;}

                        else if ( (LA12_0=='r') ) {s = 30;}

                        else if ( (LA12_0=='w') ) {s = 31;}

                        else if ( (LA12_0=='u') ) {s = 32;}

                        else if ( (LA12_0=='d') ) {s = 33;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 34;}

                        else if ( (LA12_0=='^') ) {s = 35;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||(LA12_0>='g' && LA12_0<='h')||LA12_0=='j'||LA12_0=='l'||LA12_0=='q'||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {s = 36;}

                        else if ( (LA12_0=='\'') ) {s = 37;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 38;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='&'||LA12_0=='.'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( ((LA12_37>='\u0000' && LA12_37<='\uFFFF')) ) {s = 78;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 78;}

                        else s = 79;

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