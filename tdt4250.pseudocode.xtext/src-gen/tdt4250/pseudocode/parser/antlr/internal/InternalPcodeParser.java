package tdt4250.pseudocode.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tdt4250.pseudocode.services.PcodeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPcodeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BiggerThen", "Executable", "Contains", "Continue", "Exchange", "Interval", "LessThen", "Decimal", "Package", "Number", "Divide", "Equals", "Modulo", "Remove", "Return", "Array_1", "Break", "False", "Index", "Minus", "Print", "Table_1", "Times", "While", "Text", "Else", "Line", "List_1", "Plus", "Size", "Stop", "That", "Then", "True", "With", "Add", "And", "For", "New", "Set", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "PlusSignPlusSign", "PlusSignEqualsSign", "HyphenMinusHyphenMinus", "HyphenMinusEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "At", "If", "Is", "Of", "Or", "To", "VerticalLineVerticalLine", "ExclamationMark", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Add=39;
    public static final int HyphenMinusHyphenMinus=48;
    public static final int New=42;
    public static final int Or=57;
    public static final int RULE_BEGIN=80;
    public static final int Stop=34;
    public static final int Size=33;
    public static final int Break=20;
    public static final int True=37;
    public static final int Index=22;
    public static final int Remove=17;
    public static final int False=21;
    public static final int LessThanSign=71;
    public static final int Divide=14;
    public static final int Print=24;
    public static final int PercentSign=61;
    public static final int LeftParenthesis=63;
    public static final int Decimal=11;
    public static final int Then=36;
    public static final int Ampersand=62;
    public static final int To=58;
    public static final int Executable=5;
    public static final int Plus=32;
    public static final int LessThen=10;
    public static final int RightSquareBracket=75;
    public static final int ExclamationMark=60;
    public static final int GreaterThanSign=73;
    public static final int RULE_ID=84;
    public static final int Modulo=16;
    public static final int For=41;
    public static final int RightParenthesis=64;
    public static final int GreaterThanSignEqualsSign=52;
    public static final int Exchange=8;
    public static final int Line=30;
    public static final int EqualsSignEqualsSign=51;
    public static final int BiggerThen=4;
    public static final int VerticalLine=78;
    public static final int And=40;
    public static final int PlusSign=66;
    public static final int RULE_INT=82;
    public static final int Contains=6;
    public static final int RULE_ML_COMMENT=86;
    public static final int LeftSquareBracket=74;
    public static final int Package=12;
    public static final int If=54;
    public static final int Minus=23;
    public static final int Interval=9;
    public static final int RULE_END=81;
    public static final int Set=43;
    public static final int VerticalLineVerticalLine=59;
    public static final int Table_1=25;
    public static final int Is=55;
    public static final int RULE_STRING=85;
    public static final int Continue=7;
    public static final int With=38;
    public static final int RULE_SL_COMMENT=87;
    public static final int Comma=67;
    public static final int EqualsSign=72;
    public static final int HyphenMinus=68;
    public static final int At=53;
    public static final int Number=13;
    public static final int AmpersandAmpersand=45;
    public static final int RULE_DOUBLE=83;
    public static final int Array_1=19;
    public static final int HyphenMinusEqualsSign=49;
    public static final int LessThanSignEqualsSign=50;
    public static final int Solidus=70;
    public static final int RightCurlyBracket=79;
    public static final int EOF=-1;
    public static final int List_1=31;
    public static final int Asterisk=65;
    public static final int PlusSignEqualsSign=47;
    public static final int That=35;
    public static final int FullStop=69;
    public static final int Return=18;
    public static final int RULE_WS=88;
    public static final int LeftCurlyBracket=77;
    public static final int Text=28;
    public static final int While=27;
    public static final int RULE_ANY_OTHER=89;
    public static final int CircumflexAccent=76;
    public static final int Equals=15;
    public static final int PlusSignPlusSign=46;
    public static final int Times=26;
    public static final int Of=56;
    public static final int Else=29;
    public static final int ExclamationMarkEqualsSign=44;

    // delegates
    // delegators


        public InternalPcodeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPcodeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPcodeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPcodeParser.g"; }



     	private PcodeGrammarAccess grammarAccess;

        public InternalPcodeParser(TokenStream input, PcodeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PcodeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPcodeParser.g:57:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPcodeParser.g:57:46: (iv_ruleModel= ruleModel EOF )
            // InternalPcodeParser.g:58:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPcodeParser.g:64:1: ruleModel returns [EObject current=null] : ( () (otherlv_1= Package ( (lv_package_2_0= ruleQualifiedName ) ) )? ( (lv_functions_3_0= ruleFunction ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_package_2_0 = null;

        EObject lv_functions_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:70:2: ( ( () (otherlv_1= Package ( (lv_package_2_0= ruleQualifiedName ) ) )? ( (lv_functions_3_0= ruleFunction ) )* ) )
            // InternalPcodeParser.g:71:2: ( () (otherlv_1= Package ( (lv_package_2_0= ruleQualifiedName ) ) )? ( (lv_functions_3_0= ruleFunction ) )* )
            {
            // InternalPcodeParser.g:71:2: ( () (otherlv_1= Package ( (lv_package_2_0= ruleQualifiedName ) ) )? ( (lv_functions_3_0= ruleFunction ) )* )
            // InternalPcodeParser.g:72:3: () (otherlv_1= Package ( (lv_package_2_0= ruleQualifiedName ) ) )? ( (lv_functions_3_0= ruleFunction ) )*
            {
            // InternalPcodeParser.g:72:3: ()
            // InternalPcodeParser.g:73:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getModelAccess().getModelAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:79:3: (otherlv_1= Package ( (lv_package_2_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Package) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPcodeParser.g:80:4: otherlv_1= Package ( (lv_package_2_0= ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,Package,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getPackageKeyword_1_0());
                      			
                    }
                    // InternalPcodeParser.g:84:4: ( (lv_package_2_0= ruleQualifiedName ) )
                    // InternalPcodeParser.g:85:5: (lv_package_2_0= ruleQualifiedName )
                    {
                    // InternalPcodeParser.g:85:5: (lv_package_2_0= ruleQualifiedName )
                    // InternalPcodeParser.g:86:6: lv_package_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelAccess().getPackageQualifiedNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_package_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelRule());
                      						}
                      						set(
                      							current,
                      							"package",
                      							lv_package_2_0,
                      							"tdt4250.pseudocode.Pcode.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalPcodeParser.g:104:3: ( (lv_functions_3_0= ruleFunction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Executable||LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPcodeParser.g:105:4: (lv_functions_3_0= ruleFunction )
            	    {
            	    // InternalPcodeParser.g:105:4: (lv_functions_3_0= ruleFunction )
            	    // InternalPcodeParser.g:106:5: lv_functions_3_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_functions_3_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"functions",
            	      						lv_functions_3_0,
            	      						"tdt4250.pseudocode.Pcode.Function");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPcodeParser.g:127:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalPcodeParser.g:127:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalPcodeParser.g:128:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalPcodeParser.g:134:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:140:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalPcodeParser.g:141:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalPcodeParser.g:141:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalPcodeParser.g:142:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalPcodeParser.g:149:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==FullStop) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPcodeParser.g:150:4: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFunction"
    // InternalPcodeParser.g:167:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalPcodeParser.g:167:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalPcodeParser.g:168:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalPcodeParser.g:174:1: ruleFunction returns [EObject current=null] : ( () ( (lv_executable_1_0= Executable ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (this_BEGIN_8= RULE_BEGIN ( (lv_features_9_0= ruleFeature ) )* this_END_10= RULE_END )* ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_executable_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_features_9_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:180:2: ( ( () ( (lv_executable_1_0= Executable ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (this_BEGIN_8= RULE_BEGIN ( (lv_features_9_0= ruleFeature ) )* this_END_10= RULE_END )* ) )
            // InternalPcodeParser.g:181:2: ( () ( (lv_executable_1_0= Executable ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (this_BEGIN_8= RULE_BEGIN ( (lv_features_9_0= ruleFeature ) )* this_END_10= RULE_END )* )
            {
            // InternalPcodeParser.g:181:2: ( () ( (lv_executable_1_0= Executable ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (this_BEGIN_8= RULE_BEGIN ( (lv_features_9_0= ruleFeature ) )* this_END_10= RULE_END )* )
            // InternalPcodeParser.g:182:3: () ( (lv_executable_1_0= Executable ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= LeftParenthesis ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleParameter ) ) )* )? otherlv_7= RightParenthesis (this_BEGIN_8= RULE_BEGIN ( (lv_features_9_0= ruleFeature ) )* this_END_10= RULE_END )*
            {
            // InternalPcodeParser.g:182:3: ()
            // InternalPcodeParser.g:183:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionAccess().getFunctionAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:189:3: ( (lv_executable_1_0= Executable ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Executable) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPcodeParser.g:190:4: (lv_executable_1_0= Executable )
                    {
                    // InternalPcodeParser.g:190:4: (lv_executable_1_0= Executable )
                    // InternalPcodeParser.g:191:5: lv_executable_1_0= Executable
                    {
                    lv_executable_1_0=(Token)match(input,Executable,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_executable_1_0, grammarAccess.getFunctionAccess().getExecutableExecutableKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionRule());
                      					}
                      					setWithLastConsumed(current, "executable", lv_executable_1_0 != null, "executable");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPcodeParser.g:203:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPcodeParser.g:204:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPcodeParser.g:204:4: (lv_name_2_0= RULE_ID )
            // InternalPcodeParser.g:205:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalPcodeParser.g:225:3: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Decimal||LA6_0==Number||LA6_0==Array_1||LA6_0==Table_1||LA6_0==Text||LA6_0==List_1) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPcodeParser.g:226:4: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= Comma ( (lv_parameters_6_0= ruleParameter ) ) )*
                    {
                    // InternalPcodeParser.g:226:4: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalPcodeParser.g:227:5: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalPcodeParser.g:227:5: (lv_parameters_4_0= ruleParameter )
                    // InternalPcodeParser.g:228:6: lv_parameters_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_4_0,
                      							"tdt4250.pseudocode.Pcode.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPcodeParser.g:245:4: (otherlv_5= Comma ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPcodeParser.g:246:5: otherlv_5= Comma ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalPcodeParser.g:250:5: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalPcodeParser.g:251:6: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalPcodeParser.g:251:6: (lv_parameters_6_0= ruleParameter )
                    	    // InternalPcodeParser.g:252:7: lv_parameters_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_6_0,
                    	      								"tdt4250.pseudocode.Pcode.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalPcodeParser.g:275:3: (this_BEGIN_8= RULE_BEGIN ( (lv_features_9_0= ruleFeature ) )* this_END_10= RULE_END )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_BEGIN) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPcodeParser.g:276:4: this_BEGIN_8= RULE_BEGIN ( (lv_features_9_0= ruleFeature ) )* this_END_10= RULE_END
            	    {
            	    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_BEGIN_8, grammarAccess.getFunctionAccess().getBEGINTerminalRuleCall_6_0());
            	      			
            	    }
            	    // InternalPcodeParser.g:280:4: ( (lv_features_9_0= ruleFeature ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>=Continue && LA7_0<=Exchange)||LA7_0==Return||LA7_0==Break||LA7_0==Print||LA7_0==While||LA7_0==Stop||LA7_0==For||LA7_0==If||LA7_0==RULE_ID) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalPcodeParser.g:281:5: (lv_features_9_0= ruleFeature )
            	    	    {
            	    	    // InternalPcodeParser.g:281:5: (lv_features_9_0= ruleFeature )
            	    	    // InternalPcodeParser.g:282:6: lv_features_9_0= ruleFeature
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getFunctionAccess().getFeaturesFeatureParserRuleCall_6_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_features_9_0=ruleFeature();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"features",
            	    	      							lv_features_9_0,
            	    	      							"tdt4250.pseudocode.Pcode.Feature");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    this_END_10=(Token)match(input,RULE_END,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_END_10, grammarAccess.getFunctionAccess().getENDTerminalRuleCall_6_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFeature"
    // InternalPcodeParser.g:308:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalPcodeParser.g:308:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalPcodeParser.g:309:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalPcodeParser.g:315:1: ruleFeature returns [EObject current=null] : (this_Statement_0= ruleStatement | this_Expression_1= ruleExpression ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_0 = null;

        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:321:2: ( (this_Statement_0= ruleStatement | this_Expression_1= ruleExpression ) )
            // InternalPcodeParser.g:322:2: (this_Statement_0= ruleStatement | this_Expression_1= ruleExpression )
            {
            // InternalPcodeParser.g:322:2: (this_Statement_0= ruleStatement | this_Expression_1= ruleExpression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Continue||LA9_0==Return||LA9_0==Break||LA9_0==While||LA9_0==Stop||LA9_0==For||LA9_0==If) ) {
                alt9=1;
            }
            else if ( (LA9_0==Exchange||LA9_0==Print||LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPcodeParser.g:323:3: this_Statement_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getStatementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Statement_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Statement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:332:3: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleStatement"
    // InternalPcodeParser.g:344:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalPcodeParser.g:344:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalPcodeParser.g:345:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalPcodeParser.g:351:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_ForStatement_1= ruleForStatement | this_WhileStatement_2= ruleWhileStatement | this_Stop_3= ruleStop ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_ForStatement_1 = null;

        EObject this_WhileStatement_2 = null;

        EObject this_Stop_3 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:357:2: ( (this_IfStatement_0= ruleIfStatement | this_ForStatement_1= ruleForStatement | this_WhileStatement_2= ruleWhileStatement | this_Stop_3= ruleStop ) )
            // InternalPcodeParser.g:358:2: (this_IfStatement_0= ruleIfStatement | this_ForStatement_1= ruleForStatement | this_WhileStatement_2= ruleWhileStatement | this_Stop_3= ruleStop )
            {
            // InternalPcodeParser.g:358:2: (this_IfStatement_0= ruleIfStatement | this_ForStatement_1= ruleForStatement | this_WhileStatement_2= ruleWhileStatement | this_Stop_3= ruleStop )
            int alt10=4;
            switch ( input.LA(1) ) {
            case If:
                {
                alt10=1;
                }
                break;
            case For:
                {
                alt10=2;
                }
                break;
            case While:
                {
                alt10=3;
                }
                break;
            case Continue:
            case Return:
            case Break:
            case Stop:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPcodeParser.g:359:3: this_IfStatement_0= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:368:3: this_ForStatement_1= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStatement_1=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStatement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:377:3: this_WhileStatement_2= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_2=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileStatement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:386:3: this_Stop_3= ruleStop
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getStopParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Stop_3=ruleStop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Stop_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalPcodeParser.g:398:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPcodeParser.g:398:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPcodeParser.g:399:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalPcodeParser.g:405:1: ruleExpression returns [EObject current=null] : (this_Variable_0= ruleVariable | this_FunctionCall_1= ruleFunctionCall | this_Print_2= rulePrint | this_CollectionAdd_3= ruleCollectionAdd | this_CollectionRemove_4= ruleCollectionRemove | this_CollectionSet_5= ruleCollectionSet | this_ValueExchange_6= ruleValueExchange ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_FunctionCall_1 = null;

        EObject this_Print_2 = null;

        EObject this_CollectionAdd_3 = null;

        EObject this_CollectionRemove_4 = null;

        EObject this_CollectionSet_5 = null;

        EObject this_ValueExchange_6 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:411:2: ( (this_Variable_0= ruleVariable | this_FunctionCall_1= ruleFunctionCall | this_Print_2= rulePrint | this_CollectionAdd_3= ruleCollectionAdd | this_CollectionRemove_4= ruleCollectionRemove | this_CollectionSet_5= ruleCollectionSet | this_ValueExchange_6= ruleValueExchange ) )
            // InternalPcodeParser.g:412:2: (this_Variable_0= ruleVariable | this_FunctionCall_1= ruleFunctionCall | this_Print_2= rulePrint | this_CollectionAdd_3= ruleCollectionAdd | this_CollectionRemove_4= ruleCollectionRemove | this_CollectionSet_5= ruleCollectionSet | this_ValueExchange_6= ruleValueExchange )
            {
            // InternalPcodeParser.g:412:2: (this_Variable_0= ruleVariable | this_FunctionCall_1= ruleFunctionCall | this_Print_2= rulePrint | this_CollectionAdd_3= ruleCollectionAdd | this_CollectionRemove_4= ruleCollectionRemove | this_CollectionSet_5= ruleCollectionSet | this_ValueExchange_6= ruleValueExchange )
            int alt11=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case Add:
                    {
                    alt11=4;
                    }
                    break;
                case Equals:
                case PlusSignPlusSign:
                case PlusSignEqualsSign:
                case HyphenMinusHyphenMinus:
                case HyphenMinusEqualsSign:
                case Is:
                case EqualsSign:
                    {
                    alt11=1;
                    }
                    break;
                case Set:
                    {
                    alt11=6;
                    }
                    break;
                case LeftParenthesis:
                    {
                    alt11=2;
                    }
                    break;
                case Remove:
                    {
                    alt11=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

                }
                break;
            case Print:
                {
                alt11=3;
                }
                break;
            case Exchange:
                {
                alt11=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPcodeParser.g:413:3: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getVariableParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Variable_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:422:3: this_FunctionCall_1= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getFunctionCallParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_1=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:431:3: this_Print_2= rulePrint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getPrintParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Print_2=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Print_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:440:3: this_CollectionAdd_3= ruleCollectionAdd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getCollectionAddParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionAdd_3=ruleCollectionAdd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionAdd_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPcodeParser.g:449:3: this_CollectionRemove_4= ruleCollectionRemove
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getCollectionRemoveParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionRemove_4=ruleCollectionRemove();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionRemove_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPcodeParser.g:458:3: this_CollectionSet_5= ruleCollectionSet
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getCollectionSetParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionSet_5=ruleCollectionSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionSet_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalPcodeParser.g:467:3: this_ValueExchange_6= ruleValueExchange
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getValueExchangeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ValueExchange_6=ruleValueExchange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValueExchange_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleVariable"
    // InternalPcodeParser.g:479:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPcodeParser.g:479:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPcodeParser.g:480:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalPcodeParser.g:486:1: ruleVariable returns [EObject current=null] : ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_name_4_0=null;
        Token lv_op_5_1=null;
        Token lv_op_5_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:492:2: ( ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) ) )
            // InternalPcodeParser.g:493:2: ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) )
            {
            // InternalPcodeParser.g:493:2: ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) )
            // InternalPcodeParser.g:494:3: () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) )
            {
            // InternalPcodeParser.g:494:3: ()
            // InternalPcodeParser.g:495:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVariableAccess().getVariableAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:501:3: ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==PlusSignPlusSign||LA14_1==HyphenMinusHyphenMinus) ) {
                    alt14=2;
                }
                else if ( (LA14_1==Equals||LA14_1==PlusSignEqualsSign||LA14_1==HyphenMinusEqualsSign||LA14_1==Is||LA14_1==EqualsSign) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPcodeParser.g:502:4: ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    {
                    // InternalPcodeParser.g:502:4: ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    // InternalPcodeParser.g:503:5: ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) )
                    {
                    // InternalPcodeParser.g:503:5: ( (lv_name_1_0= RULE_ID ) )
                    // InternalPcodeParser.g:504:6: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPcodeParser.g:504:6: (lv_name_1_0= RULE_ID )
                    // InternalPcodeParser.g:505:7: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVariableRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_1_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }

                    // InternalPcodeParser.g:521:5: ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) )
                    // InternalPcodeParser.g:522:6: ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) )
                    {
                    // InternalPcodeParser.g:522:6: ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) )
                    // InternalPcodeParser.g:523:7: (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign )
                    {
                    // InternalPcodeParser.g:523:7: (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign )
                    int alt12=5;
                    switch ( input.LA(1) ) {
                    case EqualsSign:
                        {
                        alt12=1;
                        }
                        break;
                    case Equals:
                        {
                        alt12=2;
                        }
                        break;
                    case Is:
                        {
                        alt12=3;
                        }
                        break;
                    case PlusSignEqualsSign:
                        {
                        alt12=4;
                        }
                        break;
                    case HyphenMinusEqualsSign:
                        {
                        alt12=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalPcodeParser.g:524:8: lv_op_2_1= EqualsSign
                            {
                            lv_op_2_1=(Token)match(input,EqualsSign,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_1, grammarAccess.getVariableAccess().getOpEqualsSignKeyword_1_0_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getVariableRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalPcodeParser.g:535:8: lv_op_2_2= Equals
                            {
                            lv_op_2_2=(Token)match(input,Equals,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_2, grammarAccess.getVariableAccess().getOpEqualsKeyword_1_0_1_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getVariableRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_2, null);
                              							
                            }

                            }
                            break;
                        case 3 :
                            // InternalPcodeParser.g:546:8: lv_op_2_3= Is
                            {
                            lv_op_2_3=(Token)match(input,Is,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_3, grammarAccess.getVariableAccess().getOpIsKeyword_1_0_1_0_2());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getVariableRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_3, null);
                              							
                            }

                            }
                            break;
                        case 4 :
                            // InternalPcodeParser.g:557:8: lv_op_2_4= PlusSignEqualsSign
                            {
                            lv_op_2_4=(Token)match(input,PlusSignEqualsSign,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_4, grammarAccess.getVariableAccess().getOpPlusSignEqualsSignKeyword_1_0_1_0_3());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getVariableRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_4, null);
                              							
                            }

                            }
                            break;
                        case 5 :
                            // InternalPcodeParser.g:568:8: lv_op_2_5= HyphenMinusEqualsSign
                            {
                            lv_op_2_5=(Token)match(input,HyphenMinusEqualsSign,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_5, grammarAccess.getVariableAccess().getOpHyphenMinusEqualsSignKeyword_1_0_1_0_4());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getVariableRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_5, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalPcodeParser.g:581:5: ( (lv_value_3_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:582:6: (lv_value_3_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:582:6: (lv_value_3_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:583:7: lv_value_3_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getVariableAccess().getValueLiteralExpressionParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getVariableRule());
                      							}
                      							set(
                      								current,
                      								"value",
                      								lv_value_3_0,
                      								"tdt4250.pseudocode.Pcode.LiteralExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:602:4: ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) )
                    {
                    // InternalPcodeParser.g:602:4: ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) )
                    // InternalPcodeParser.g:603:5: ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) )
                    {
                    // InternalPcodeParser.g:603:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalPcodeParser.g:604:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalPcodeParser.g:604:6: (lv_name_4_0= RULE_ID )
                    // InternalPcodeParser.g:605:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_4_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVariableRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_4_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }

                    // InternalPcodeParser.g:621:5: ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) )
                    // InternalPcodeParser.g:622:6: ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) )
                    {
                    // InternalPcodeParser.g:622:6: ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) )
                    // InternalPcodeParser.g:623:7: (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus )
                    {
                    // InternalPcodeParser.g:623:7: (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==PlusSignPlusSign) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==HyphenMinusHyphenMinus) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalPcodeParser.g:624:8: lv_op_5_1= PlusSignPlusSign
                            {
                            lv_op_5_1=(Token)match(input,PlusSignPlusSign,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_5_1, grammarAccess.getVariableAccess().getOpPlusSignPlusSignKeyword_1_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getVariableRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_5_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalPcodeParser.g:635:8: lv_op_5_2= HyphenMinusHyphenMinus
                            {
                            lv_op_5_2=(Token)match(input,HyphenMinusHyphenMinus,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_5_2, grammarAccess.getVariableAccess().getOpHyphenMinusHyphenMinusKeyword_1_1_1_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getVariableRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_5_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleParameter"
    // InternalPcodeParser.g:654:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPcodeParser.g:654:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPcodeParser.g:655:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalPcodeParser.g:661:1: ruleParameter returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:667:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPcodeParser.g:668:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPcodeParser.g:668:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalPcodeParser.g:669:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalPcodeParser.g:669:3: ()
            // InternalPcodeParser.g:670:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterAccess().getVariableAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:676:3: ( (lv_type_1_0= ruleType ) )
            // InternalPcodeParser.g:677:4: (lv_type_1_0= ruleType )
            {
            // InternalPcodeParser.g:677:4: (lv_type_1_0= ruleType )
            // InternalPcodeParser.g:678:5: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"tdt4250.pseudocode.Pcode.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPcodeParser.g:695:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPcodeParser.g:696:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPcodeParser.g:696:4: (lv_name_2_0= RULE_ID )
            // InternalPcodeParser.g:697:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleIfStatement"
    // InternalPcodeParser.g:717:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalPcodeParser.g:717:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalPcodeParser.g:718:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalPcodeParser.g:724:1: ruleIfStatement returns [EObject current=null] : ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        EObject lv_condition_2_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_otherwise_9_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:730:2: ( ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? ) )
            // InternalPcodeParser.g:731:2: ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? )
            {
            // InternalPcodeParser.g:731:2: ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? )
            // InternalPcodeParser.g:732:3: () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )?
            {
            // InternalPcodeParser.g:732:3: ()
            // InternalPcodeParser.g:733:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:739:3: ( (lv_name_1_0= If ) )
            // InternalPcodeParser.g:740:4: (lv_name_1_0= If )
            {
            // InternalPcodeParser.g:740:4: (lv_name_1_0= If )
            // InternalPcodeParser.g:741:5: lv_name_1_0= If
            {
            lv_name_1_0=(Token)match(input,If,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getIfStatementAccess().getNameIfKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIfStatementRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_1_0, "if");
              				
            }

            }


            }

            // InternalPcodeParser.g:753:3: ( (lv_condition_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:754:4: (lv_condition_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:754:4: (lv_condition_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:755:5: lv_condition_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_condition_2_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPcodeParser.g:772:3: (otherlv_3= Then )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Then) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPcodeParser.g:773:4: otherlv_3= Then
                    {
                    otherlv_3=(Token)match(input,Then,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getThenKeyword_3());
                      			
                    }

                    }
                    break;

            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_4, grammarAccess.getIfStatementAccess().getBEGINTerminalRuleCall_4());
              		
            }
            // InternalPcodeParser.g:782:3: ( (lv_then_5_0= ruleFeature ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=Continue && LA16_0<=Exchange)||LA16_0==Return||LA16_0==Break||LA16_0==Print||LA16_0==While||LA16_0==Stop||LA16_0==For||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPcodeParser.g:783:4: (lv_then_5_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:783:4: (lv_then_5_0= ruleFeature )
            	    // InternalPcodeParser.g:784:5: lv_then_5_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStatementAccess().getThenFeatureParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_then_5_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"then",
            	      						lv_then_5_0,
            	      						"tdt4250.pseudocode.Pcode.Feature");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_6, grammarAccess.getIfStatementAccess().getENDTerminalRuleCall_6());
              		
            }
            // InternalPcodeParser.g:805:3: (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Else) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPcodeParser.g:806:4: otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END
                    {
                    otherlv_7=(Token)match(input,Else,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getElseKeyword_7_0());
                      			
                    }
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getIfStatementAccess().getBEGINTerminalRuleCall_7_1());
                      			
                    }
                    // InternalPcodeParser.g:814:4: ( (lv_otherwise_9_0= ruleFeature ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=Continue && LA17_0<=Exchange)||LA17_0==Return||LA17_0==Break||LA17_0==Print||LA17_0==While||LA17_0==Stop||LA17_0==For||LA17_0==If||LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalPcodeParser.g:815:5: (lv_otherwise_9_0= ruleFeature )
                    	    {
                    	    // InternalPcodeParser.g:815:5: (lv_otherwise_9_0= ruleFeature )
                    	    // InternalPcodeParser.g:816:6: lv_otherwise_9_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfStatementAccess().getOtherwiseFeatureParserRuleCall_7_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_otherwise_9_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"otherwise",
                    	      							lv_otherwise_9_0,
                    	      							"tdt4250.pseudocode.Pcode.Feature");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_10, grammarAccess.getIfStatementAccess().getENDTerminalRuleCall_7_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalPcodeParser.g:842:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalPcodeParser.g:842:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalPcodeParser.g:843:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalPcodeParser.g:849:1: ruleForStatement returns [EObject current=null] : ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        EObject lv_from_3_0 = null;

        EObject lv_to_5_0 = null;

        EObject lv_block_7_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:855:2: ( ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END ) )
            // InternalPcodeParser.g:856:2: ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END )
            {
            // InternalPcodeParser.g:856:2: ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END )
            // InternalPcodeParser.g:857:3: () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END
            {
            // InternalPcodeParser.g:857:3: ()
            // InternalPcodeParser.g:858:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForStatementAccess().getForStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,For,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getForKeyword_1());
              		
            }
            // InternalPcodeParser.g:868:3: (otherlv_2= Interval )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Interval) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPcodeParser.g:869:4: otherlv_2= Interval
                    {
                    otherlv_2=(Token)match(input,Interval,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getIntervalKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalPcodeParser.g:874:3: ( (lv_from_3_0= ruleArithmeticExpression ) )
            // InternalPcodeParser.g:875:4: (lv_from_3_0= ruleArithmeticExpression )
            {
            // InternalPcodeParser.g:875:4: (lv_from_3_0= ruleArithmeticExpression )
            // InternalPcodeParser.g:876:5: lv_from_3_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getFromArithmeticExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_from_3_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_3_0,
              						"tdt4250.pseudocode.Pcode.ArithmeticExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,To,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getToKeyword_4());
              		
            }
            // InternalPcodeParser.g:897:3: ( (lv_to_5_0= ruleArithmeticExpression ) )
            // InternalPcodeParser.g:898:4: (lv_to_5_0= ruleArithmeticExpression )
            {
            // InternalPcodeParser.g:898:4: (lv_to_5_0= ruleArithmeticExpression )
            // InternalPcodeParser.g:899:5: lv_to_5_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getToArithmeticExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_to_5_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"to",
              						lv_to_5_0,
              						"tdt4250.pseudocode.Pcode.ArithmeticExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_6, grammarAccess.getForStatementAccess().getBEGINTerminalRuleCall_6());
              		
            }
            // InternalPcodeParser.g:920:3: ( (lv_block_7_0= ruleFeature ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=Continue && LA20_0<=Exchange)||LA20_0==Return||LA20_0==Break||LA20_0==Print||LA20_0==While||LA20_0==Stop||LA20_0==For||LA20_0==If||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPcodeParser.g:921:4: (lv_block_7_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:921:4: (lv_block_7_0= ruleFeature )
            	    // InternalPcodeParser.g:922:5: lv_block_7_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForStatementAccess().getBlockFeatureParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_block_7_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"block",
            	      						lv_block_7_0,
            	      						"tdt4250.pseudocode.Pcode.Feature");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_8, grammarAccess.getForStatementAccess().getENDTerminalRuleCall_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalPcodeParser.g:947:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalPcodeParser.g:947:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalPcodeParser.g:948:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalPcodeParser.g:954:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:960:2: ( ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END ) )
            // InternalPcodeParser.g:961:2: ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END )
            {
            // InternalPcodeParser.g:961:2: ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END )
            // InternalPcodeParser.g:962:3: () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END
            {
            // InternalPcodeParser.g:962:3: ()
            // InternalPcodeParser.g:963:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWhileStatementAccess().getWhileStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,While,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getWhileKeyword_1());
              		
            }
            // InternalPcodeParser.g:973:3: ( (lv_condition_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:974:4: (lv_condition_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:974:4: (lv_condition_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:975:5: lv_condition_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_condition_2_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getWhileStatementAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalPcodeParser.g:996:3: ( (lv_block_4_0= ruleFeature ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=Continue && LA21_0<=Exchange)||LA21_0==Return||LA21_0==Break||LA21_0==Print||LA21_0==While||LA21_0==Stop||LA21_0==For||LA21_0==If||LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPcodeParser.g:997:4: (lv_block_4_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:997:4: (lv_block_4_0= ruleFeature )
            	    // InternalPcodeParser.g:998:5: lv_block_4_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileStatementAccess().getBlockFeatureParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_block_4_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"block",
            	      						lv_block_4_0,
            	      						"tdt4250.pseudocode.Pcode.Feature");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_5, grammarAccess.getWhileStatementAccess().getENDTerminalRuleCall_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleStop"
    // InternalPcodeParser.g:1023:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalPcodeParser.g:1023:45: (iv_ruleStop= ruleStop EOF )
            // InternalPcodeParser.g:1024:2: iv_ruleStop= ruleStop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalPcodeParser.g:1030:1: ruleStop returns [EObject current=null] : ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        Token lv_type_2_0=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1036:2: ( ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) ) ) )
            // InternalPcodeParser.g:1037:2: ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) ) )
            {
            // InternalPcodeParser.g:1037:2: ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) ) )
            // InternalPcodeParser.g:1038:3: () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
            {
            // InternalPcodeParser.g:1038:3: ()
            // InternalPcodeParser.g:1039:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStopAccess().getStopAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1045:3: ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Continue||LA23_0==Break||LA23_0==Stop) ) {
                alt23=1;
            }
            else if ( (LA23_0==Return) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPcodeParser.g:1046:4: ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) )
                    {
                    // InternalPcodeParser.g:1046:4: ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) )
                    // InternalPcodeParser.g:1047:5: ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) )
                    {
                    // InternalPcodeParser.g:1047:5: ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) )
                    // InternalPcodeParser.g:1048:6: (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue )
                    {
                    // InternalPcodeParser.g:1048:6: (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue )
                    int alt22=3;
                    switch ( input.LA(1) ) {
                    case Stop:
                        {
                        alt22=1;
                        }
                        break;
                    case Break:
                        {
                        alt22=2;
                        }
                        break;
                    case Continue:
                        {
                        alt22=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }

                    switch (alt22) {
                        case 1 :
                            // InternalPcodeParser.g:1049:7: lv_type_1_1= Stop
                            {
                            lv_type_1_1=(Token)match(input,Stop,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_type_1_1, grammarAccess.getStopAccess().getTypeStopKeyword_1_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getStopRule());
                              							}
                              							setWithLastConsumed(current, "type", lv_type_1_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalPcodeParser.g:1060:7: lv_type_1_2= Break
                            {
                            lv_type_1_2=(Token)match(input,Break,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_type_1_2, grammarAccess.getStopAccess().getTypeBreakKeyword_1_0_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getStopRule());
                              							}
                              							setWithLastConsumed(current, "type", lv_type_1_2, null);
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalPcodeParser.g:1071:7: lv_type_1_3= Continue
                            {
                            lv_type_1_3=(Token)match(input,Continue,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_type_1_3, grammarAccess.getStopAccess().getTypeContinueKeyword_1_0_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getStopRule());
                              							}
                              							setWithLastConsumed(current, "type", lv_type_1_3, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1085:4: ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    {
                    // InternalPcodeParser.g:1085:4: ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    // InternalPcodeParser.g:1086:5: ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) )
                    {
                    // InternalPcodeParser.g:1086:5: ( (lv_type_2_0= Return ) )
                    // InternalPcodeParser.g:1087:6: (lv_type_2_0= Return )
                    {
                    // InternalPcodeParser.g:1087:6: (lv_type_2_0= Return )
                    // InternalPcodeParser.g:1088:7: lv_type_2_0= Return
                    {
                    lv_type_2_0=(Token)match(input,Return,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_type_2_0, grammarAccess.getStopAccess().getTypeReturnKeyword_1_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getStopRule());
                      							}
                      							setWithLastConsumed(current, "type", lv_type_2_0, "return");
                      						
                    }

                    }


                    }

                    // InternalPcodeParser.g:1100:5: ( (lv_value_3_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1101:6: (lv_value_3_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1101:6: (lv_value_3_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1102:7: lv_value_3_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getStopAccess().getValueLiteralExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getStopRule());
                      							}
                      							set(
                      								current,
                      								"value",
                      								lv_value_3_0,
                      								"tdt4250.pseudocode.Pcode.LiteralExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRulePrint"
    // InternalPcodeParser.g:1125:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalPcodeParser.g:1125:46: (iv_rulePrint= rulePrint EOF )
            // InternalPcodeParser.g:1126:2: iv_rulePrint= rulePrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalPcodeParser.g:1132:1: rulePrint returns [EObject current=null] : ( ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_newline_1_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1138:2: ( ( ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1139:2: ( ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1139:2: ( ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1140:3: ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1140:3: ( (lv_name_0_0= Print ) )
            // InternalPcodeParser.g:1141:4: (lv_name_0_0= Print )
            {
            // InternalPcodeParser.g:1141:4: (lv_name_0_0= Print )
            // InternalPcodeParser.g:1142:5: lv_name_0_0= Print
            {
            lv_name_0_0=(Token)match(input,Print,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getPrintAccess().getNamePrintKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrintRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "print");
              				
            }

            }


            }

            // InternalPcodeParser.g:1154:3: ( (lv_newline_1_0= Line ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Line) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPcodeParser.g:1155:4: (lv_newline_1_0= Line )
                    {
                    // InternalPcodeParser.g:1155:4: (lv_newline_1_0= Line )
                    // InternalPcodeParser.g:1156:5: lv_newline_1_0= Line
                    {
                    lv_newline_1_0=(Token)match(input,Line,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_newline_1_0, grammarAccess.getPrintAccess().getNewlineLineKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrintRule());
                      					}
                      					setWithLastConsumed(current, "newline", lv_newline_1_0 != null, "line");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalPcodeParser.g:1168:3: ( (lv_value_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1169:4: (lv_value_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1169:4: (lv_value_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1170:5: lv_value_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintAccess().getValueLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrintRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleCollectionAdd"
    // InternalPcodeParser.g:1191:1: entryRuleCollectionAdd returns [EObject current=null] : iv_ruleCollectionAdd= ruleCollectionAdd EOF ;
    public final EObject entryRuleCollectionAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionAdd = null;


        try {
            // InternalPcodeParser.g:1191:54: (iv_ruleCollectionAdd= ruleCollectionAdd EOF )
            // InternalPcodeParser.g:1192:2: iv_ruleCollectionAdd= ruleCollectionAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionAddRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionAdd=ruleCollectionAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionAdd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionAdd"


    // $ANTLR start "ruleCollectionAdd"
    // InternalPcodeParser.g:1198:1: ruleCollectionAdd returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleCollectionAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1204:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1205:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1205:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1206:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1206:3: ()
            // InternalPcodeParser.g:1207:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionAddAccess().getCollectionAddAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1213:3: ( (otherlv_1= RULE_ID ) )
            // InternalPcodeParser.g:1214:4: (otherlv_1= RULE_ID )
            {
            // InternalPcodeParser.g:1214:4: (otherlv_1= RULE_ID )
            // InternalPcodeParser.g:1215:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCollectionAddRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getCollectionAddAccess().getCollectionVariableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Add,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCollectionAddAccess().getAddKeyword_2());
              		
            }
            // InternalPcodeParser.g:1230:3: ( (lv_value_3_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1231:4: (lv_value_3_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1231:4: (lv_value_3_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1232:5: lv_value_3_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionAddAccess().getValueLiteralExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionAddRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionAdd"


    // $ANTLR start "entryRuleCollectionRemove"
    // InternalPcodeParser.g:1253:1: entryRuleCollectionRemove returns [EObject current=null] : iv_ruleCollectionRemove= ruleCollectionRemove EOF ;
    public final EObject entryRuleCollectionRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionRemove = null;


        try {
            // InternalPcodeParser.g:1253:57: (iv_ruleCollectionRemove= ruleCollectionRemove EOF )
            // InternalPcodeParser.g:1254:2: iv_ruleCollectionRemove= ruleCollectionRemove EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRemoveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionRemove=ruleCollectionRemove();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionRemove; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionRemove"


    // $ANTLR start "ruleCollectionRemove"
    // InternalPcodeParser.g:1260:1: ruleCollectionRemove returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleCollectionRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1266:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1267:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1267:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1268:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1268:3: ()
            // InternalPcodeParser.g:1269:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionRemoveAccess().getCollectionRemoveAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1275:3: ( (otherlv_1= RULE_ID ) )
            // InternalPcodeParser.g:1276:4: (otherlv_1= RULE_ID )
            {
            // InternalPcodeParser.g:1276:4: (otherlv_1= RULE_ID )
            // InternalPcodeParser.g:1277:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCollectionRemoveRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getCollectionRemoveAccess().getCollectionVariableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Remove,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCollectionRemoveAccess().getRemoveKeyword_2());
              		
            }
            // InternalPcodeParser.g:1292:3: ( (lv_value_3_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1293:4: (lv_value_3_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1293:4: (lv_value_3_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1294:5: lv_value_3_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionRemoveAccess().getValueLiteralExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionRemoveRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionRemove"


    // $ANTLR start "entryRuleCollectionSet"
    // InternalPcodeParser.g:1315:1: entryRuleCollectionSet returns [EObject current=null] : iv_ruleCollectionSet= ruleCollectionSet EOF ;
    public final EObject entryRuleCollectionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionSet = null;


        try {
            // InternalPcodeParser.g:1315:54: (iv_ruleCollectionSet= ruleCollectionSet EOF )
            // InternalPcodeParser.g:1316:2: iv_ruleCollectionSet= ruleCollectionSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionSet=ruleCollectionSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionSet"


    // $ANTLR start "ruleCollectionSet"
    // InternalPcodeParser.g:1322:1: ruleCollectionSet returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Set ( ( (lv_left_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_left_5_0= ruleLiteralExpression ) ) )? ) otherlv_6= To ( (lv_right_7_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleCollectionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_left_3_0 = null;

        EObject lv_left_5_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1328:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Set ( ( (lv_left_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_left_5_0= ruleLiteralExpression ) ) )? ) otherlv_6= To ( (lv_right_7_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1329:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Set ( ( (lv_left_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_left_5_0= ruleLiteralExpression ) ) )? ) otherlv_6= To ( (lv_right_7_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1329:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Set ( ( (lv_left_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_left_5_0= ruleLiteralExpression ) ) )? ) otherlv_6= To ( (lv_right_7_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1330:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Set ( ( (lv_left_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_left_5_0= ruleLiteralExpression ) ) )? ) otherlv_6= To ( (lv_right_7_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1330:3: ()
            // InternalPcodeParser.g:1331:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionSetAccess().getCollectionSetAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1337:3: ( (otherlv_1= RULE_ID ) )
            // InternalPcodeParser.g:1338:4: (otherlv_1= RULE_ID )
            {
            // InternalPcodeParser.g:1338:4: (otherlv_1= RULE_ID )
            // InternalPcodeParser.g:1339:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCollectionSetRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getCollectionSetAccess().getCollectionVariableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Set,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCollectionSetAccess().getSetKeyword_2());
              		
            }
            // InternalPcodeParser.g:1354:3: ( ( (lv_left_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_left_5_0= ruleLiteralExpression ) ) )? )
            // InternalPcodeParser.g:1355:4: ( (lv_left_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_left_5_0= ruleLiteralExpression ) ) )?
            {
            // InternalPcodeParser.g:1355:4: ( (lv_left_3_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1356:5: (lv_left_3_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1356:5: (lv_left_3_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1357:6: lv_left_3_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getCollectionSetAccess().getLeftLiteralExpressionParserRuleCall_3_0_0());
              					
            }
            pushFollow(FOLLOW_24);
            lv_left_3_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getCollectionSetRule());
              						}
              						add(
              							current,
              							"left",
              							lv_left_3_0,
              							"tdt4250.pseudocode.Pcode.LiteralExpression");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalPcodeParser.g:1374:4: (otherlv_4= Comma ( (lv_left_5_0= ruleLiteralExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Comma) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPcodeParser.g:1375:5: otherlv_4= Comma ( (lv_left_5_0= ruleLiteralExpression ) )
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getCollectionSetAccess().getCommaKeyword_3_1_0());
                      				
                    }
                    // InternalPcodeParser.g:1379:5: ( (lv_left_5_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1380:6: (lv_left_5_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1380:6: (lv_left_5_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1381:7: lv_left_5_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCollectionSetAccess().getLeftLiteralExpressionParserRuleCall_3_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_19);
                    lv_left_5_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCollectionSetRule());
                      							}
                      							add(
                      								current,
                      								"left",
                      								lv_left_5_0,
                      								"tdt4250.pseudocode.Pcode.LiteralExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }
                    break;

            }


            }

            otherlv_6=(Token)match(input,To,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getCollectionSetAccess().getToKeyword_4());
              		
            }
            // InternalPcodeParser.g:1404:3: ( (lv_right_7_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1405:4: (lv_right_7_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1405:4: (lv_right_7_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1406:5: lv_right_7_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionSetAccess().getRightLiteralExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_7_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionSetRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_7_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionSet"


    // $ANTLR start "entryRuleValueExchange"
    // InternalPcodeParser.g:1427:1: entryRuleValueExchange returns [EObject current=null] : iv_ruleValueExchange= ruleValueExchange EOF ;
    public final EObject entryRuleValueExchange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExchange = null;


        try {
            // InternalPcodeParser.g:1427:54: (iv_ruleValueExchange= ruleValueExchange EOF )
            // InternalPcodeParser.g:1428:2: iv_ruleValueExchange= ruleValueExchange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueExchangeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValueExchange=ruleValueExchange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueExchange; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueExchange"


    // $ANTLR start "ruleValueExchange"
    // InternalPcodeParser.g:1434:1: ruleValueExchange returns [EObject current=null] : ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleValueExchange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_collection_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1440:2: ( ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1441:2: ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1441:2: ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1442:3: () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1442:3: ()
            // InternalPcodeParser.g:1443:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getValueExchangeAccess().getValueExchangeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Exchange,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getValueExchangeAccess().getExchangeKeyword_1());
              		
            }
            // InternalPcodeParser.g:1453:3: ( (lv_collection_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1454:4: (lv_collection_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1454:4: (lv_collection_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1455:5: lv_collection_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValueExchangeAccess().getCollectionLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_collection_2_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValueExchangeRule());
              					}
              					set(
              						current,
              						"collection",
              						lv_collection_2_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,With,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getValueExchangeAccess().getWithKeyword_3());
              		
            }
            // InternalPcodeParser.g:1476:3: ( (lv_value_4_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1477:4: (lv_value_4_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1477:4: (lv_value_4_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1478:5: lv_value_4_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValueExchangeAccess().getValueLiteralExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getValueExchangeRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueExchange"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalPcodeParser.g:1499:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalPcodeParser.g:1499:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalPcodeParser.g:1500:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalPcodeParser.g:1506:1: ruleLiteralExpression returns [EObject current=null] : (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Collection_0 = null;

        EObject this_CollectionAccessor_1 = null;

        EObject this_BooleanExpression_2 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1512:2: ( (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression ) )
            // InternalPcodeParser.g:1513:2: (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression )
            {
            // InternalPcodeParser.g:1513:2: (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression )
            int alt26=3;
            switch ( input.LA(1) ) {
            case New:
            case LeftSquareBracket:
            case LeftCurlyBracket:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==EOF||LA26_2==BiggerThen||(LA26_2>=Continue && LA26_2<=Exchange)||LA26_2==LessThen||LA26_2==Divide||LA26_2==Modulo||LA26_2==Return||LA26_2==Break||(LA26_2>=Minus && LA26_2<=Print)||(LA26_2>=Times && LA26_2<=While)||LA26_2==Plus||LA26_2==Stop||LA26_2==Then||LA26_2==With||(LA26_2>=And && LA26_2<=For)||LA26_2==ExclamationMarkEqualsSign||(LA26_2>=LessThanSignEqualsSign && LA26_2<=GreaterThanSignEqualsSign)||LA26_2==If||(LA26_2>=Or && LA26_2<=To)||(LA26_2>=PercentSign && LA26_2<=HyphenMinus)||(LA26_2>=Solidus && LA26_2<=LessThanSign)||LA26_2==GreaterThanSign||LA26_2==RightSquareBracket||(LA26_2>=VerticalLine && LA26_2<=RULE_END)||LA26_2==RULE_ID) ) {
                    alt26=3;
                }
                else if ( (LA26_2==At||LA26_2==LeftSquareBracket) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case False:
            case Minus:
            case Size:
            case True:
            case ExclamationMark:
            case LeftParenthesis:
            case HyphenMinus:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_STRING:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalPcodeParser.g:1514:3: this_Collection_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getCollectionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Collection_0=ruleCollection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Collection_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1523:3: this_CollectionAccessor_1= ruleCollectionAccessor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getCollectionAccessorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionAccessor_1=ruleCollectionAccessor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionAccessor_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:1532:3: this_BooleanExpression_2= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getBooleanExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpression_2=ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleCollection"
    // InternalPcodeParser.g:1544:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalPcodeParser.g:1544:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalPcodeParser.g:1545:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // InternalPcodeParser.g:1551:1: ruleCollection returns [EObject current=null] : (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLitteral_0 = null;

        EObject this_List_1 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1557:2: ( (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList ) )
            // InternalPcodeParser.g:1558:2: (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList )
            {
            // InternalPcodeParser.g:1558:2: (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LeftSquareBracket||LA27_0==LeftCurlyBracket) ) {
                alt27=1;
            }
            else if ( (LA27_0==New) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPcodeParser.g:1559:3: this_CollectionLitteral_0= ruleCollectionLitteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCollectionAccess().getCollectionLitteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionLitteral_0=ruleCollectionLitteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLitteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1568:3: this_List_1= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCollectionAccess().getListParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_List_1=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_List_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleList"
    // InternalPcodeParser.g:1580:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalPcodeParser.g:1580:45: (iv_ruleList= ruleList EOF )
            // InternalPcodeParser.g:1581:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalPcodeParser.g:1587:1: ruleList returns [EObject current=null] : ( () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_type_6_0 = null;

        EObject lv_elements_9_0 = null;

        EObject lv_elements_11_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1593:2: ( ( () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? ) )
            // InternalPcodeParser.g:1594:2: ( () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? )
            {
            // InternalPcodeParser.g:1594:2: ( () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? )
            // InternalPcodeParser.g:1595:3: () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )?
            {
            // InternalPcodeParser.g:1595:3: ()
            // InternalPcodeParser.g:1596:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListAccess().getListAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,New,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListAccess().getNewKeyword_1());
              		
            }
            // InternalPcodeParser.g:1606:3: (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 )
            int alt28=3;
            switch ( input.LA(1) ) {
            case Array_1:
                {
                alt28=1;
                }
                break;
            case List_1:
                {
                alt28=2;
                }
                break;
            case Table_1:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalPcodeParser.g:1607:4: otherlv_2= Array_1
                    {
                    otherlv_2=(Token)match(input,Array_1,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getListAccess().getArrayKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1612:4: otherlv_3= List_1
                    {
                    otherlv_3=(Token)match(input,List_1,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getListAccess().getListKeyword_2_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:1617:4: otherlv_4= Table_1
                    {
                    otherlv_4=(Token)match(input,Table_1,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getListAccess().getTableKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,With,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getListAccess().getWithKeyword_3());
              		
            }
            // InternalPcodeParser.g:1626:3: ( (lv_type_6_0= ruleType ) )
            // InternalPcodeParser.g:1627:4: (lv_type_6_0= ruleType )
            {
            // InternalPcodeParser.g:1627:4: (lv_type_6_0= ruleType )
            // InternalPcodeParser.g:1628:5: lv_type_6_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListAccess().getTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_type_6_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_6_0,
              						"tdt4250.pseudocode.Pcode.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPcodeParser.g:1645:3: (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==That) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPcodeParser.g:1646:4: otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )*
                    {
                    otherlv_7=(Token)match(input,That,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getListAccess().getThatKeyword_5_0());
                      			
                    }
                    otherlv_8=(Token)match(input,Contains,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getListAccess().getContainsKeyword_5_1());
                      			
                    }
                    // InternalPcodeParser.g:1654:4: ( (lv_elements_9_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1655:5: (lv_elements_9_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1655:5: (lv_elements_9_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1656:6: lv_elements_9_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListAccess().getElementsLiteralExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_elements_9_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_9_0,
                      							"tdt4250.pseudocode.Pcode.LiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPcodeParser.g:1673:4: (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==Comma) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1674:5: otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_10=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getListAccess().getCommaKeyword_5_3_0());
                    	      				
                    	    }
                    	    // InternalPcodeParser.g:1678:5: ( (lv_elements_11_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1679:6: (lv_elements_11_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1679:6: (lv_elements_11_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1680:7: lv_elements_11_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListAccess().getElementsLiteralExpressionParserRuleCall_5_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_elements_11_0=ruleLiteralExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getListRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_11_0,
                    	      								"tdt4250.pseudocode.Pcode.LiteralExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleCollectionLitteral"
    // InternalPcodeParser.g:1703:1: entryRuleCollectionLitteral returns [EObject current=null] : iv_ruleCollectionLitteral= ruleCollectionLitteral EOF ;
    public final EObject entryRuleCollectionLitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLitteral = null;


        try {
            // InternalPcodeParser.g:1703:59: (iv_ruleCollectionLitteral= ruleCollectionLitteral EOF )
            // InternalPcodeParser.g:1704:2: iv_ruleCollectionLitteral= ruleCollectionLitteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLitteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLitteral=ruleCollectionLitteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLitteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLitteral"


    // $ANTLR start "ruleCollectionLitteral"
    // InternalPcodeParser.g:1710:1: ruleCollectionLitteral returns [EObject current=null] : (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral ) ;
    public final EObject ruleCollectionLitteral() throws RecognitionException {
        EObject current = null;

        EObject this_SetLitteral_0 = null;

        EObject this_ListLitteral_1 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1716:2: ( (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral ) )
            // InternalPcodeParser.g:1717:2: (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral )
            {
            // InternalPcodeParser.g:1717:2: (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LeftCurlyBracket) ) {
                alt31=1;
            }
            else if ( (LA31_0==LeftSquareBracket) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalPcodeParser.g:1718:3: this_SetLitteral_0= ruleSetLitteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCollectionLitteralAccess().getSetLitteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SetLitteral_0=ruleSetLitteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SetLitteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1727:3: this_ListLitteral_1= ruleListLitteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCollectionLitteralAccess().getListLitteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ListLitteral_1=ruleListLitteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ListLitteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLitteral"


    // $ANTLR start "entryRuleSetLitteral"
    // InternalPcodeParser.g:1739:1: entryRuleSetLitteral returns [EObject current=null] : iv_ruleSetLitteral= ruleSetLitteral EOF ;
    public final EObject entryRuleSetLitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLitteral = null;


        try {
            // InternalPcodeParser.g:1739:52: (iv_ruleSetLitteral= ruleSetLitteral EOF )
            // InternalPcodeParser.g:1740:2: iv_ruleSetLitteral= ruleSetLitteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetLitteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSetLitteral=ruleSetLitteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetLitteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetLitteral"


    // $ANTLR start "ruleSetLitteral"
    // InternalPcodeParser.g:1746:1: ruleSetLitteral returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleSetLitteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1752:2: ( ( () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket ) )
            // InternalPcodeParser.g:1753:2: ( () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket )
            {
            // InternalPcodeParser.g:1753:2: ( () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket )
            // InternalPcodeParser.g:1754:3: () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket
            {
            // InternalPcodeParser.g:1754:3: ()
            // InternalPcodeParser.g:1755:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSetLitteralAccess().getSetLitteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSetLitteralAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalPcodeParser.g:1765:3: ( (lv_elements_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1766:4: (lv_elements_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1766:4: (lv_elements_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1767:5: lv_elements_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetLitteralAccess().getElementsLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_elements_2_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSetLitteralRule());
              					}
              					add(
              						current,
              						"elements",
              						lv_elements_2_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPcodeParser.g:1784:3: (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPcodeParser.g:1785:4: otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getSetLitteralAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalPcodeParser.g:1789:4: ( (lv_elements_4_0= ruleLiteralExpression ) )
            	    // InternalPcodeParser.g:1790:5: (lv_elements_4_0= ruleLiteralExpression )
            	    {
            	    // InternalPcodeParser.g:1790:5: (lv_elements_4_0= ruleLiteralExpression )
            	    // InternalPcodeParser.g:1791:6: lv_elements_4_0= ruleLiteralExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSetLitteralAccess().getElementsLiteralExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_elements_4_0=ruleLiteralExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSetLitteralRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_4_0,
            	      							"tdt4250.pseudocode.Pcode.LiteralExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSetLitteralAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetLitteral"


    // $ANTLR start "entryRuleListLitteral"
    // InternalPcodeParser.g:1817:1: entryRuleListLitteral returns [EObject current=null] : iv_ruleListLitteral= ruleListLitteral EOF ;
    public final EObject entryRuleListLitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLitteral = null;


        try {
            // InternalPcodeParser.g:1817:53: (iv_ruleListLitteral= ruleListLitteral EOF )
            // InternalPcodeParser.g:1818:2: iv_ruleListLitteral= ruleListLitteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListLitteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListLitteral=ruleListLitteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListLitteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListLitteral"


    // $ANTLR start "ruleListLitteral"
    // InternalPcodeParser.g:1824:1: ruleListLitteral returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleListLitteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1830:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalPcodeParser.g:1831:2: ( () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalPcodeParser.g:1831:2: ( () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket )
            // InternalPcodeParser.g:1832:3: () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalPcodeParser.g:1832:3: ()
            // InternalPcodeParser.g:1833:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListLitteralAccess().getListLitteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLitteralAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPcodeParser.g:1843:3: ( (lv_elements_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1844:4: (lv_elements_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1844:4: (lv_elements_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1845:5: lv_elements_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListLitteralAccess().getElementsLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_elements_2_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListLitteralRule());
              					}
              					add(
              						current,
              						"elements",
              						lv_elements_2_0,
              						"tdt4250.pseudocode.Pcode.LiteralExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPcodeParser.g:1862:3: (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Comma) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPcodeParser.g:1863:4: otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getListLitteralAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalPcodeParser.g:1867:4: ( (lv_elements_4_0= ruleLiteralExpression ) )
            	    // InternalPcodeParser.g:1868:5: (lv_elements_4_0= ruleLiteralExpression )
            	    {
            	    // InternalPcodeParser.g:1868:5: (lv_elements_4_0= ruleLiteralExpression )
            	    // InternalPcodeParser.g:1869:6: lv_elements_4_0= ruleLiteralExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getListLitteralAccess().getElementsLiteralExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_elements_4_0=ruleLiteralExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getListLitteralRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_4_0,
            	      							"tdt4250.pseudocode.Pcode.LiteralExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getListLitteralAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListLitteral"


    // $ANTLR start "entryRuleCollectionAccessor"
    // InternalPcodeParser.g:1895:1: entryRuleCollectionAccessor returns [EObject current=null] : iv_ruleCollectionAccessor= ruleCollectionAccessor EOF ;
    public final EObject entryRuleCollectionAccessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionAccessor = null;


        try {
            // InternalPcodeParser.g:1895:59: (iv_ruleCollectionAccessor= ruleCollectionAccessor EOF )
            // InternalPcodeParser.g:1896:2: iv_ruleCollectionAccessor= ruleCollectionAccessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionAccessorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionAccessor=ruleCollectionAccessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionAccessor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionAccessor"


    // $ANTLR start "ruleCollectionAccessor"
    // InternalPcodeParser.g:1902:1: ruleCollectionAccessor returns [EObject current=null] : ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) ) ;
    public final EObject ruleCollectionAccessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_accessor_3_0 = null;

        EObject lv_accessor_8_0 = null;

        EObject lv_accessor_10_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1908:2: ( ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) ) )
            // InternalPcodeParser.g:1909:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) )
            {
            // InternalPcodeParser.g:1909:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) )
            // InternalPcodeParser.g:1910:3: () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) )
            {
            // InternalPcodeParser.g:1910:3: ()
            // InternalPcodeParser.g:1911:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionAccessorAccess().getCollectionAccessorAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1917:3: ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==At) ) {
                    alt37=2;
                }
                else if ( (LA37_1==LeftSquareBracket) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalPcodeParser.g:1918:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ )
                    {
                    // InternalPcodeParser.g:1918:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ )
                    // InternalPcodeParser.g:1919:5: ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+
                    {
                    // InternalPcodeParser.g:1919:5: ( (otherlv_1= RULE_ID ) )
                    // InternalPcodeParser.g:1920:6: (otherlv_1= RULE_ID )
                    {
                    // InternalPcodeParser.g:1920:6: (otherlv_1= RULE_ID )
                    // InternalPcodeParser.g:1921:7: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCollectionAccessorRule());
                      							}
                      						
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_1, grammarAccess.getCollectionAccessorAccess().getCollectionVariableCrossReference_1_0_0_0());
                      						
                    }

                    }


                    }

                    // InternalPcodeParser.g:1932:5: (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==LeftSquareBracket) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1933:6: otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket
                    	    {
                    	    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getCollectionAccessorAccess().getLeftSquareBracketKeyword_1_0_1_0());
                    	      					
                    	    }
                    	    // InternalPcodeParser.g:1937:6: ( (lv_accessor_3_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1938:7: (lv_accessor_3_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1938:7: (lv_accessor_3_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1939:8: lv_accessor_3_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCollectionAccessorAccess().getAccessorLiteralExpressionParserRuleCall_1_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_accessor_3_0=ruleLiteralExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getCollectionAccessorRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"accessor",
                    	      									lv_accessor_3_0,
                    	      									"tdt4250.pseudocode.Pcode.LiteralExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }

                    	    otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getCollectionAccessorAccess().getRightSquareBracketKeyword_1_0_1_2());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1963:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* )
                    {
                    // InternalPcodeParser.g:1963:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* )
                    // InternalPcodeParser.g:1964:5: ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )*
                    {
                    // InternalPcodeParser.g:1964:5: ( (otherlv_5= RULE_ID ) )
                    // InternalPcodeParser.g:1965:6: (otherlv_5= RULE_ID )
                    {
                    // InternalPcodeParser.g:1965:6: (otherlv_5= RULE_ID )
                    // InternalPcodeParser.g:1966:7: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCollectionAccessorRule());
                      							}
                      						
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_5, grammarAccess.getCollectionAccessorAccess().getCollectionVariableCrossReference_1_1_0_0());
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,At,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getCollectionAccessorAccess().getAtKeyword_1_1_1());
                      				
                    }
                    // InternalPcodeParser.g:1981:5: (otherlv_7= Index )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==Index) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalPcodeParser.g:1982:6: otherlv_7= Index
                            {
                            otherlv_7=(Token)match(input,Index,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getCollectionAccessorAccess().getIndexKeyword_1_1_2());
                              					
                            }

                            }
                            break;

                    }

                    // InternalPcodeParser.g:1987:5: ( (lv_accessor_8_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1988:6: (lv_accessor_8_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1988:6: (lv_accessor_8_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1989:7: lv_accessor_8_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCollectionAccessorAccess().getAccessorLiteralExpressionParserRuleCall_1_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_29);
                    lv_accessor_8_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCollectionAccessorRule());
                      							}
                      							add(
                      								current,
                      								"accessor",
                      								lv_accessor_8_0,
                      								"tdt4250.pseudocode.Pcode.LiteralExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalPcodeParser.g:2006:5: (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==Comma) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalPcodeParser.g:2007:6: otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getCollectionAccessorAccess().getCommaKeyword_1_1_4_0());
                    	      					
                    	    }
                    	    // InternalPcodeParser.g:2011:6: ( (lv_accessor_10_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:2012:7: (lv_accessor_10_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:2012:7: (lv_accessor_10_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:2013:8: lv_accessor_10_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCollectionAccessorAccess().getAccessorLiteralExpressionParserRuleCall_1_1_4_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    lv_accessor_10_0=ruleLiteralExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getCollectionAccessorRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"accessor",
                    	      									lv_accessor_10_0,
                    	      									"tdt4250.pseudocode.Pcode.LiteralExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionAccessor"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalPcodeParser.g:2037:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalPcodeParser.g:2037:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalPcodeParser.g:2038:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalPcodeParser.g:2044:1: ruleBooleanExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        AntlrDatatypeRuleToken lv_op_2_1 = null;

        AntlrDatatypeRuleToken lv_op_2_2 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2050:2: ( (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalPcodeParser.g:2051:2: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalPcodeParser.g:2051:2: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalPcodeParser.g:2052:3: this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2060:3: ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==And||LA39_0==Or||LA39_0==Ampersand||LA39_0==VerticalLine) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPcodeParser.g:2061:4: ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalPcodeParser.g:2061:4: ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) )
            	    // InternalPcodeParser.g:2062:5: () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) )
            	    {
            	    // InternalPcodeParser.g:2062:5: ()
            	    // InternalPcodeParser.g:2063:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2069:5: ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) )
            	    // InternalPcodeParser.g:2070:6: ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) )
            	    {
            	    // InternalPcodeParser.g:2070:6: ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) )
            	    // InternalPcodeParser.g:2071:7: (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator )
            	    {
            	    // InternalPcodeParser.g:2071:7: (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==Or||LA38_0==VerticalLine) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==And||LA38_0==Ampersand) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalPcodeParser.g:2072:8: lv_op_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getBooleanExpressionAccess().getOpOrOperatorParserRuleCall_1_0_1_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_13);
            	            lv_op_2_1=ruleOrOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            	              								}
            	              								set(
            	              									current,
            	              									"op",
            	              									lv_op_2_1,
            	              									"tdt4250.pseudocode.Pcode.OrOperator");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPcodeParser.g:2088:8: lv_op_2_2= ruleAndOperator
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getBooleanExpressionAccess().getOpAndOperatorParserRuleCall_1_0_1_0_1());
            	              							
            	            }
            	            pushFollow(FOLLOW_13);
            	            lv_op_2_2=ruleAndOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            	              								}
            	              								set(
            	              									current,
            	              									"op",
            	              									lv_op_2_2,
            	              									"tdt4250.pseudocode.Pcode.AndOperator");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalPcodeParser.g:2107:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalPcodeParser.g:2108:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalPcodeParser.g:2108:5: (lv_right_3_0= ruleComparison )
            	    // InternalPcodeParser.g:2109:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"tdt4250.pseudocode.Pcode.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleOrOperator"
    // InternalPcodeParser.g:2131:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalPcodeParser.g:2131:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalPcodeParser.g:2132:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrOperator"


    // $ANTLR start "ruleOrOperator"
    // InternalPcodeParser.g:2138:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= VerticalLine | kw= Or ) ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2144:2: ( (kw= VerticalLine | kw= Or ) )
            // InternalPcodeParser.g:2145:2: (kw= VerticalLine | kw= Or )
            {
            // InternalPcodeParser.g:2145:2: (kw= VerticalLine | kw= Or )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==VerticalLine) ) {
                alt40=1;
            }
            else if ( (LA40_0==Or) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalPcodeParser.g:2146:3: kw= VerticalLine
                    {
                    kw=(Token)match(input,VerticalLine,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2152:3: kw= Or
                    {
                    kw=(Token)match(input,Or,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getOrKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "entryRuleAndOperator"
    // InternalPcodeParser.g:2161:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalPcodeParser.g:2161:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalPcodeParser.g:2162:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalPcodeParser.g:2168:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Ampersand | kw= And ) ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2174:2: ( (kw= Ampersand | kw= And ) )
            // InternalPcodeParser.g:2175:2: (kw= Ampersand | kw= And )
            {
            // InternalPcodeParser.g:2175:2: (kw= Ampersand | kw= And )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Ampersand) ) {
                alt41=1;
            }
            else if ( (LA41_0==And) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalPcodeParser.g:2176:3: kw= Ampersand
                    {
                    kw=(Token)match(input,Ampersand,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2182:3: kw= And
                    {
                    kw=(Token)match(input,And,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAndKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleComparison"
    // InternalPcodeParser.g:2191:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalPcodeParser.g:2191:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalPcodeParser.g:2192:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalPcodeParser.g:2198:1: ruleComparison returns [EObject current=null] : (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Equals_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2204:2: ( (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* ) )
            // InternalPcodeParser.g:2205:2: (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* )
            {
            // InternalPcodeParser.g:2205:2: (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* )
            // InternalPcodeParser.g:2206:3: this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getEqualsParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_Equals_0=ruleEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equals_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2214:3: ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==BiggerThen||LA43_0==LessThen||LA43_0==LessThanSign||LA43_0==GreaterThanSign) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPcodeParser.g:2215:4: ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) )
            	    {
            	    // InternalPcodeParser.g:2215:4: ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) )
            	    // InternalPcodeParser.g:2216:5: () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) )
            	    {
            	    // InternalPcodeParser.g:2216:5: ()
            	    // InternalPcodeParser.g:2217:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2223:5: ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) )
            	    // InternalPcodeParser.g:2224:6: ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) )
            	    {
            	    // InternalPcodeParser.g:2224:6: ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) )
            	    // InternalPcodeParser.g:2225:7: (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen )
            	    {
            	    // InternalPcodeParser.g:2225:7: (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen )
            	    int alt42=4;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt42=1;
            	        }
            	        break;
            	    case LessThen:
            	        {
            	        alt42=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt42=3;
            	        }
            	        break;
            	    case BiggerThen:
            	        {
            	        alt42=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt42) {
            	        case 1 :
            	            // InternalPcodeParser.g:2226:8: lv_op_2_1= LessThanSign
            	            {
            	            lv_op_2_1=(Token)match(input,LessThanSign,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getComparisonRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPcodeParser.g:2237:8: lv_op_2_2= LessThen
            	            {
            	            lv_op_2_2=(Token)match(input,LessThen,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThenKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getComparisonRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalPcodeParser.g:2248:8: lv_op_2_3= GreaterThanSign
            	            {
            	            lv_op_2_3=(Token)match(input,GreaterThanSign,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_0_1_0_2());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getComparisonRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalPcodeParser.g:2259:8: lv_op_2_4= BiggerThen
            	            {
            	            lv_op_2_4=(Token)match(input,BiggerThen,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpBiggerThenKeyword_1_0_1_0_3());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getComparisonRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalPcodeParser.g:2273:4: ( (lv_right_3_0= ruleEquals ) )
            	    // InternalPcodeParser.g:2274:5: (lv_right_3_0= ruleEquals )
            	    {
            	    // InternalPcodeParser.g:2274:5: (lv_right_3_0= ruleEquals )
            	    // InternalPcodeParser.g:2275:6: lv_right_3_0= ruleEquals
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightEqualsParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleEquals();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"tdt4250.pseudocode.Pcode.Equals");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleEquals"
    // InternalPcodeParser.g:2297:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // InternalPcodeParser.g:2297:47: (iv_ruleEquals= ruleEquals EOF )
            // InternalPcodeParser.g:2298:2: iv_ruleEquals= ruleEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquals=ruleEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquals; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // InternalPcodeParser.g:2304:1: ruleEquals returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) ;
    public final EObject ruleEquals() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2310:2: ( (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // InternalPcodeParser.g:2311:2: (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // InternalPcodeParser.g:2311:2: (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            // InternalPcodeParser.g:2312:3: this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualsAccess().getAdditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Addition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2320:3: ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==ExclamationMarkEqualsSign||(LA45_0>=LessThanSignEqualsSign && LA45_0<=GreaterThanSignEqualsSign)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPcodeParser.g:2321:4: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // InternalPcodeParser.g:2321:4: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) )
            	    // InternalPcodeParser.g:2322:5: () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) )
            	    {
            	    // InternalPcodeParser.g:2322:5: ()
            	    // InternalPcodeParser.g:2323:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2329:5: ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) )
            	    // InternalPcodeParser.g:2330:6: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalPcodeParser.g:2330:6: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) )
            	    // InternalPcodeParser.g:2331:7: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign )
            	    {
            	    // InternalPcodeParser.g:2331:7: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign )
            	    int alt44=4;
            	    switch ( input.LA(1) ) {
            	    case EqualsSignEqualsSign:
            	        {
            	        alt44=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt44=2;
            	        }
            	        break;
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt44=3;
            	        }
            	        break;
            	    case ExclamationMarkEqualsSign:
            	        {
            	        alt44=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt44) {
            	        case 1 :
            	            // InternalPcodeParser.g:2332:8: lv_op_2_1= EqualsSignEqualsSign
            	            {
            	            lv_op_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getEqualsAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getEqualsRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPcodeParser.g:2343:8: lv_op_2_2= LessThanSignEqualsSign
            	            {
            	            lv_op_2_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getEqualsAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getEqualsRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalPcodeParser.g:2354:8: lv_op_2_3= GreaterThanSignEqualsSign
            	            {
            	            lv_op_2_3=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_3, grammarAccess.getEqualsAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_2());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getEqualsRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalPcodeParser.g:2365:8: lv_op_2_4= ExclamationMarkEqualsSign
            	            {
            	            lv_op_2_4=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_4, grammarAccess.getEqualsAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_3());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getEqualsRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalPcodeParser.g:2379:4: ( (lv_right_3_0= ruleAddition ) )
            	    // InternalPcodeParser.g:2380:5: (lv_right_3_0= ruleAddition )
            	    {
            	    // InternalPcodeParser.g:2380:5: (lv_right_3_0= ruleAddition )
            	    // InternalPcodeParser.g:2381:6: lv_right_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualsAccess().getRightAdditionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualsRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"tdt4250.pseudocode.Pcode.Addition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalPcodeParser.g:2403:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalPcodeParser.g:2403:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalPcodeParser.g:2404:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalPcodeParser.g:2410:1: ruleArithmeticExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2416:2: (this_Addition_0= ruleAddition )
            // InternalPcodeParser.g:2417:2: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Addition_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalPcodeParser.g:2428:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalPcodeParser.g:2428:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalPcodeParser.g:2429:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalPcodeParser.g:2435:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2441:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalPcodeParser.g:2442:2: (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalPcodeParser.g:2442:2: (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalPcodeParser.g:2443:3: this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2451:3: ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Minus||LA47_0==Plus||LA47_0==PlusSign||LA47_0==HyphenMinus) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPcodeParser.g:2452:4: ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalPcodeParser.g:2452:4: ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==Plus||LA46_0==PlusSign) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==Minus||LA46_0==HyphenMinus) ) {
            	        alt46=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalPcodeParser.g:2453:5: ( () rulePlusOperator )
            	            {
            	            // InternalPcodeParser.g:2453:5: ( () rulePlusOperator )
            	            // InternalPcodeParser.g:2454:6: () rulePlusOperator
            	            {
            	            // InternalPcodeParser.g:2454:6: ()
            	            // InternalPcodeParser.g:2455:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getAdditionAccess().getPlusOperatorParserRuleCall_1_0_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_13);
            	            rulePlusOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPcodeParser.g:2470:5: ( () ruleMinusOperator )
            	            {
            	            // InternalPcodeParser.g:2470:5: ( () ruleMinusOperator )
            	            // InternalPcodeParser.g:2471:6: () ruleMinusOperator
            	            {
            	            // InternalPcodeParser.g:2471:6: ()
            	            // InternalPcodeParser.g:2472:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getAdditionAccess().getMinusOperatorParserRuleCall_1_0_1_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_13);
            	            ruleMinusOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalPcodeParser.g:2487:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalPcodeParser.g:2488:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalPcodeParser.g:2488:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalPcodeParser.g:2489:6: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"tdt4250.pseudocode.Pcode.Multiplication");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRulePlusOperator"
    // InternalPcodeParser.g:2511:1: entryRulePlusOperator returns [String current=null] : iv_rulePlusOperator= rulePlusOperator EOF ;
    public final String entryRulePlusOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusOperator = null;


        try {
            // InternalPcodeParser.g:2511:52: (iv_rulePlusOperator= rulePlusOperator EOF )
            // InternalPcodeParser.g:2512:2: iv_rulePlusOperator= rulePlusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOperator=rulePlusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOperator"


    // $ANTLR start "rulePlusOperator"
    // InternalPcodeParser.g:2518:1: rulePlusOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= Plus ) ;
    public final AntlrDatatypeRuleToken rulePlusOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2524:2: ( (kw= PlusSign | kw= Plus ) )
            // InternalPcodeParser.g:2525:2: (kw= PlusSign | kw= Plus )
            {
            // InternalPcodeParser.g:2525:2: (kw= PlusSign | kw= Plus )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==PlusSign) ) {
                alt48=1;
            }
            else if ( (LA48_0==Plus) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalPcodeParser.g:2526:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2532:3: kw= Plus
                    {
                    kw=(Token)match(input,Plus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusOperatorAccess().getPlusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOperator"


    // $ANTLR start "entryRuleMinusOperator"
    // InternalPcodeParser.g:2541:1: entryRuleMinusOperator returns [String current=null] : iv_ruleMinusOperator= ruleMinusOperator EOF ;
    public final String entryRuleMinusOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinusOperator = null;


        try {
            // InternalPcodeParser.g:2541:53: (iv_ruleMinusOperator= ruleMinusOperator EOF )
            // InternalPcodeParser.g:2542:2: iv_ruleMinusOperator= ruleMinusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinusOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMinusOperator=ruleMinusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinusOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinusOperator"


    // $ANTLR start "ruleMinusOperator"
    // InternalPcodeParser.g:2548:1: ruleMinusOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= HyphenMinus | kw= Minus ) ;
    public final AntlrDatatypeRuleToken ruleMinusOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2554:2: ( (kw= HyphenMinus | kw= Minus ) )
            // InternalPcodeParser.g:2555:2: (kw= HyphenMinus | kw= Minus )
            {
            // InternalPcodeParser.g:2555:2: (kw= HyphenMinus | kw= Minus )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==HyphenMinus) ) {
                alt49=1;
            }
            else if ( (LA49_0==Minus) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalPcodeParser.g:2556:3: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMinusOperatorAccess().getHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2562:3: kw= Minus
                    {
                    kw=(Token)match(input,Minus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMinusOperatorAccess().getMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinusOperator"


    // $ANTLR start "entryRuleMultiplication"
    // InternalPcodeParser.g:2571:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalPcodeParser.g:2571:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalPcodeParser.g:2572:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalPcodeParser.g:2578:1: ruleMultiplication returns [EObject current=null] : (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_Prefixed_0 = null;

        AntlrDatatypeRuleToken lv_op_2_1 = null;

        AntlrDatatypeRuleToken lv_op_2_2 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2584:2: ( (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) )
            // InternalPcodeParser.g:2585:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            {
            // InternalPcodeParser.g:2585:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            // InternalPcodeParser.g:2586:3: this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_Prefixed_0=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Prefixed_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2594:3: ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Divide||LA51_0==Modulo||LA51_0==Times||LA51_0==PercentSign||LA51_0==Asterisk||LA51_0==Solidus) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPcodeParser.g:2595:4: ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) )
            	    {
            	    // InternalPcodeParser.g:2595:4: ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) )
            	    // InternalPcodeParser.g:2596:5: () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) )
            	    {
            	    // InternalPcodeParser.g:2596:5: ()
            	    // InternalPcodeParser.g:2597:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2603:5: ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) )
            	    // InternalPcodeParser.g:2604:6: ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) )
            	    {
            	    // InternalPcodeParser.g:2604:6: ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) )
            	    // InternalPcodeParser.g:2605:7: (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator )
            	    {
            	    // InternalPcodeParser.g:2605:7: (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator )
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==Times||LA50_0==Asterisk) ) {
            	        alt50=1;
            	    }
            	    else if ( (LA50_0==Divide||LA50_0==Modulo||LA50_0==PercentSign||LA50_0==Solidus) ) {
            	        alt50=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalPcodeParser.g:2606:8: lv_op_2_1= ruleTimesOperator
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getMultiplicationAccess().getOpTimesOperatorParserRuleCall_1_0_1_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_13);
            	            lv_op_2_1=ruleTimesOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	              								}
            	              								set(
            	              									current,
            	              									"op",
            	              									lv_op_2_1,
            	              									"tdt4250.pseudocode.Pcode.TimesOperator");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPcodeParser.g:2622:8: lv_op_2_2= ruleDivideOperator
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getMultiplicationAccess().getOpDivideOperatorParserRuleCall_1_0_1_0_1());
            	              							
            	            }
            	            pushFollow(FOLLOW_13);
            	            lv_op_2_2=ruleDivideOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	              								}
            	              								set(
            	              									current,
            	              									"op",
            	              									lv_op_2_2,
            	              									"tdt4250.pseudocode.Pcode.DivideOperator");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalPcodeParser.g:2641:4: ( (lv_right_3_0= rulePrefixed ) )
            	    // InternalPcodeParser.g:2642:5: (lv_right_3_0= rulePrefixed )
            	    {
            	    // InternalPcodeParser.g:2642:5: (lv_right_3_0= rulePrefixed )
            	    // InternalPcodeParser.g:2643:6: lv_right_3_0= rulePrefixed
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=rulePrefixed();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"tdt4250.pseudocode.Pcode.Prefixed");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleTimesOperator"
    // InternalPcodeParser.g:2665:1: entryRuleTimesOperator returns [String current=null] : iv_ruleTimesOperator= ruleTimesOperator EOF ;
    public final String entryRuleTimesOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimesOperator = null;


        try {
            // InternalPcodeParser.g:2665:53: (iv_ruleTimesOperator= ruleTimesOperator EOF )
            // InternalPcodeParser.g:2666:2: iv_ruleTimesOperator= ruleTimesOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimesOperator=ruleTimesOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimesOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimesOperator"


    // $ANTLR start "ruleTimesOperator"
    // InternalPcodeParser.g:2672:1: ruleTimesOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Asterisk | kw= Times ) ;
    public final AntlrDatatypeRuleToken ruleTimesOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2678:2: ( (kw= Asterisk | kw= Times ) )
            // InternalPcodeParser.g:2679:2: (kw= Asterisk | kw= Times )
            {
            // InternalPcodeParser.g:2679:2: (kw= Asterisk | kw= Times )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Asterisk) ) {
                alt52=1;
            }
            else if ( (LA52_0==Times) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalPcodeParser.g:2680:3: kw= Asterisk
                    {
                    kw=(Token)match(input,Asterisk,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTimesOperatorAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2686:3: kw= Times
                    {
                    kw=(Token)match(input,Times,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTimesOperatorAccess().getTimesKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimesOperator"


    // $ANTLR start "entryRuleDivideOperator"
    // InternalPcodeParser.g:2695:1: entryRuleDivideOperator returns [String current=null] : iv_ruleDivideOperator= ruleDivideOperator EOF ;
    public final String entryRuleDivideOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDivideOperator = null;


        try {
            // InternalPcodeParser.g:2695:54: (iv_ruleDivideOperator= ruleDivideOperator EOF )
            // InternalPcodeParser.g:2696:2: iv_ruleDivideOperator= ruleDivideOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivideOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivideOperator=ruleDivideOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivideOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivideOperator"


    // $ANTLR start "ruleDivideOperator"
    // InternalPcodeParser.g:2702:1: ruleDivideOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Solidus | kw= Divide | kw= PercentSign | kw= Modulo ) ;
    public final AntlrDatatypeRuleToken ruleDivideOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2708:2: ( (kw= Solidus | kw= Divide | kw= PercentSign | kw= Modulo ) )
            // InternalPcodeParser.g:2709:2: (kw= Solidus | kw= Divide | kw= PercentSign | kw= Modulo )
            {
            // InternalPcodeParser.g:2709:2: (kw= Solidus | kw= Divide | kw= PercentSign | kw= Modulo )
            int alt53=4;
            switch ( input.LA(1) ) {
            case Solidus:
                {
                alt53=1;
                }
                break;
            case Divide:
                {
                alt53=2;
                }
                break;
            case PercentSign:
                {
                alt53=3;
                }
                break;
            case Modulo:
                {
                alt53=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalPcodeParser.g:2710:3: kw= Solidus
                    {
                    kw=(Token)match(input,Solidus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDivideOperatorAccess().getSolidusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2716:3: kw= Divide
                    {
                    kw=(Token)match(input,Divide,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDivideOperatorAccess().getDivideKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:2722:3: kw= PercentSign
                    {
                    kw=(Token)match(input,PercentSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDivideOperatorAccess().getPercentSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:2728:3: kw= Modulo
                    {
                    kw=(Token)match(input,Modulo,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDivideOperatorAccess().getModuloKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivideOperator"


    // $ANTLR start "entryRulePrefixed"
    // InternalPcodeParser.g:2737:1: entryRulePrefixed returns [EObject current=null] : iv_rulePrefixed= rulePrefixed EOF ;
    public final EObject entryRulePrefixed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixed = null;


        try {
            // InternalPcodeParser.g:2737:49: (iv_rulePrefixed= rulePrefixed EOF )
            // InternalPcodeParser.g:2738:2: iv_rulePrefixed= rulePrefixed EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixed=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixed; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixed"


    // $ANTLR start "rulePrefixed"
    // InternalPcodeParser.g:2744:1: rulePrefixed returns [EObject current=null] : ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrefixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2750:2: ( ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalPcodeParser.g:2751:2: ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalPcodeParser.g:2751:2: ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
            int alt54=3;
            switch ( input.LA(1) ) {
            case ExclamationMark:
                {
                alt54=1;
                }
                break;
            case Minus:
            case HyphenMinus:
                {
                alt54=2;
                }
                break;
            case False:
            case Size:
            case True:
            case LeftParenthesis:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_ID:
            case RULE_STRING:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalPcodeParser.g:2752:3: ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    {
                    // InternalPcodeParser.g:2752:3: ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    // InternalPcodeParser.g:2753:4: () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) )
                    {
                    // InternalPcodeParser.g:2753:4: ()
                    // InternalPcodeParser.g:2754:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedAccess().getBooleanNegationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2760:4: ( ( ExclamationMark )=>otherlv_1= ExclamationMark )
                    // InternalPcodeParser.g:2761:5: ( ExclamationMark )=>otherlv_1= ExclamationMark
                    {
                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getPrefixedAccess().getExclamationMarkKeyword_0_1());
                      				
                    }

                    }

                    // InternalPcodeParser.g:2767:4: ( (lv_expression_2_0= ruleAtomic ) )
                    // InternalPcodeParser.g:2768:5: (lv_expression_2_0= ruleAtomic )
                    {
                    // InternalPcodeParser.g:2768:5: (lv_expression_2_0= ruleAtomic )
                    // InternalPcodeParser.g:2769:6: lv_expression_2_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"tdt4250.pseudocode.Pcode.Atomic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2788:3: ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    {
                    // InternalPcodeParser.g:2788:3: ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    // InternalPcodeParser.g:2789:4: () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) )
                    {
                    // InternalPcodeParser.g:2789:4: ()
                    // InternalPcodeParser.g:2790:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedAccess().getArithmeticSignedAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2796:4: ( ( ruleMinusOperator )=> ruleMinusOperator )
                    // InternalPcodeParser.g:2797:5: ( ruleMinusOperator )=> ruleMinusOperator
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrefixedAccess().getMinusOperatorParserRuleCall_1_1());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    ruleMinusOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    // InternalPcodeParser.g:2806:4: ( (lv_expression_5_0= ruleAtomic ) )
                    // InternalPcodeParser.g:2807:5: (lv_expression_5_0= ruleAtomic )
                    {
                    // InternalPcodeParser.g:2807:5: (lv_expression_5_0= ruleAtomic )
                    // InternalPcodeParser.g:2808:6: lv_expression_5_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"tdt4250.pseudocode.Pcode.Atomic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:2827:3: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixed"


    // $ANTLR start "entryRuleAtomic"
    // InternalPcodeParser.g:2839:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalPcodeParser.g:2839:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalPcodeParser.g:2840:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalPcodeParser.g:2846:1: ruleAtomic returns [EObject current=null] : ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        Token lv_value_11_1=null;
        Token lv_value_11_2=null;
        Token otherlv_13=null;
        EObject lv_expression_2_0 = null;

        EObject this_FunctionCall_14 = null;

        EObject this_SizeExpression_15 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2852:2: ( ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression ) )
            // InternalPcodeParser.g:2853:2: ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression )
            {
            // InternalPcodeParser.g:2853:2: ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression )
            int alt56=8;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalPcodeParser.g:2854:3: ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis )
                    {
                    // InternalPcodeParser.g:2854:3: ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis )
                    // InternalPcodeParser.g:2855:4: () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis
                    {
                    // InternalPcodeParser.g:2855:4: ()
                    // InternalPcodeParser.g:2856:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getParenthesizedExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalPcodeParser.g:2866:4: ( (lv_expression_2_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:2867:5: (lv_expression_2_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:2867:5: (lv_expression_2_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:2868:6: lv_expression_2_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getExpressionLiteralExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    lv_expression_2_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"tdt4250.pseudocode.Pcode.LiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2891:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalPcodeParser.g:2891:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalPcodeParser.g:2892:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalPcodeParser.g:2892:4: ()
                    // InternalPcodeParser.g:2893:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2899:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalPcodeParser.g:2900:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalPcodeParser.g:2900:5: (lv_value_5_0= RULE_INT )
                    // InternalPcodeParser.g:2901:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:2919:3: ( () ( (lv_value_7_0= RULE_DOUBLE ) ) )
                    {
                    // InternalPcodeParser.g:2919:3: ( () ( (lv_value_7_0= RULE_DOUBLE ) ) )
                    // InternalPcodeParser.g:2920:4: () ( (lv_value_7_0= RULE_DOUBLE ) )
                    {
                    // InternalPcodeParser.g:2920:4: ()
                    // InternalPcodeParser.g:2921:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDoubleLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2927:4: ( (lv_value_7_0= RULE_DOUBLE ) )
                    // InternalPcodeParser.g:2928:5: (lv_value_7_0= RULE_DOUBLE )
                    {
                    // InternalPcodeParser.g:2928:5: (lv_value_7_0= RULE_DOUBLE )
                    // InternalPcodeParser.g:2929:6: lv_value_7_0= RULE_DOUBLE
                    {
                    lv_value_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"tdt4250.pseudocode.Pcode.DOUBLE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:2947:3: ( () ( (lv_value_9_0= RULE_STRING ) ) )
                    {
                    // InternalPcodeParser.g:2947:3: ( () ( (lv_value_9_0= RULE_STRING ) ) )
                    // InternalPcodeParser.g:2948:4: () ( (lv_value_9_0= RULE_STRING ) )
                    {
                    // InternalPcodeParser.g:2948:4: ()
                    // InternalPcodeParser.g:2949:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2955:4: ( (lv_value_9_0= RULE_STRING ) )
                    // InternalPcodeParser.g:2956:5: (lv_value_9_0= RULE_STRING )
                    {
                    // InternalPcodeParser.g:2956:5: (lv_value_9_0= RULE_STRING )
                    // InternalPcodeParser.g:2957:6: lv_value_9_0= RULE_STRING
                    {
                    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_9_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_9_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPcodeParser.g:2975:3: ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) )
                    {
                    // InternalPcodeParser.g:2975:3: ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) )
                    // InternalPcodeParser.g:2976:4: () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) )
                    {
                    // InternalPcodeParser.g:2976:4: ()
                    // InternalPcodeParser.g:2977:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBooleanLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2983:4: ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) )
                    // InternalPcodeParser.g:2984:5: ( (lv_value_11_1= True | lv_value_11_2= False ) )
                    {
                    // InternalPcodeParser.g:2984:5: ( (lv_value_11_1= True | lv_value_11_2= False ) )
                    // InternalPcodeParser.g:2985:6: (lv_value_11_1= True | lv_value_11_2= False )
                    {
                    // InternalPcodeParser.g:2985:6: (lv_value_11_1= True | lv_value_11_2= False )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==True) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==False) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalPcodeParser.g:2986:7: lv_value_11_1= True
                            {
                            lv_value_11_1=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_11_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_4_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_11_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalPcodeParser.g:2997:7: lv_value_11_2= False
                            {
                            lv_value_11_2=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_11_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_4_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_11_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPcodeParser.g:3012:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalPcodeParser.g:3012:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalPcodeParser.g:3013:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalPcodeParser.g:3013:4: ()
                    // InternalPcodeParser.g:3014:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableReferenceAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:3020:4: ( (otherlv_13= RULE_ID ) )
                    // InternalPcodeParser.g:3021:5: (otherlv_13= RULE_ID )
                    {
                    // InternalPcodeParser.g:3021:5: (otherlv_13= RULE_ID )
                    // InternalPcodeParser.g:3022:6: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getAtomicAccess().getRefVariableCrossReference_5_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPcodeParser.g:3035:3: this_FunctionCall_14= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getFunctionCallParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_14=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalPcodeParser.g:3044:3: this_SizeExpression_15= ruleSizeExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getSizeExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SizeExpression_15=ruleSizeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SizeExpression_15;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalPcodeParser.g:3056:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalPcodeParser.g:3056:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalPcodeParser.g:3057:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalPcodeParser.g:3063:1: ruleFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:3069:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis ) )
            // InternalPcodeParser.g:3070:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis )
            {
            // InternalPcodeParser.g:3070:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis )
            // InternalPcodeParser.g:3071:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis
            {
            // InternalPcodeParser.g:3071:3: ()
            // InternalPcodeParser.g:3072:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:3078:3: ( (otherlv_1= RULE_ID ) )
            // InternalPcodeParser.g:3079:4: (otherlv_1= RULE_ID )
            {
            // InternalPcodeParser.g:3079:4: (otherlv_1= RULE_ID )
            // InternalPcodeParser.g:3080:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getRefFunctionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPcodeParser.g:3095:3: ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==False||LA58_0==Minus||LA58_0==Size||LA58_0==True||LA58_0==New||LA58_0==ExclamationMark||LA58_0==LeftParenthesis||LA58_0==HyphenMinus||LA58_0==LeftSquareBracket||LA58_0==LeftCurlyBracket||(LA58_0>=RULE_INT && LA58_0<=RULE_STRING)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPcodeParser.g:3096:4: ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )*
                    {
                    // InternalPcodeParser.g:3096:4: ( (lv_arguments_3_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:3097:5: (lv_arguments_3_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:3097:5: (lv_arguments_3_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:3098:6: lv_arguments_3_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsLiteralExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_arguments_3_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_3_0,
                      							"tdt4250.pseudocode.Pcode.LiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPcodeParser.g:3115:4: (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==Comma) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalPcodeParser.g:3116:5: otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalPcodeParser.g:3120:5: ( (lv_arguments_5_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:3121:6: (lv_arguments_5_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:3121:6: (lv_arguments_5_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:3122:7: lv_arguments_5_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentsLiteralExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_arguments_5_0=ruleLiteralExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_5_0,
                    	      								"tdt4250.pseudocode.Pcode.LiteralExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleSizeExpression"
    // InternalPcodeParser.g:3149:1: entryRuleSizeExpression returns [EObject current=null] : iv_ruleSizeExpression= ruleSizeExpression EOF ;
    public final EObject entryRuleSizeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeExpression = null;


        try {
            // InternalPcodeParser.g:3149:55: (iv_ruleSizeExpression= ruleSizeExpression EOF )
            // InternalPcodeParser.g:3150:2: iv_ruleSizeExpression= ruleSizeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSizeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSizeExpression=ruleSizeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSizeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSizeExpression"


    // $ANTLR start "ruleSizeExpression"
    // InternalPcodeParser.g:3156:1: ruleSizeExpression returns [EObject current=null] : ( () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) ) ) ;
    public final EObject ruleSizeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:3162:2: ( ( () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) ) ) )
            // InternalPcodeParser.g:3163:2: ( () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) ) )
            {
            // InternalPcodeParser.g:3163:2: ( () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) ) )
            // InternalPcodeParser.g:3164:3: () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) )
            {
            // InternalPcodeParser.g:3164:3: ()
            // InternalPcodeParser.g:3165:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSizeExpressionAccess().getSizeExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Size,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSizeExpressionAccess().getSizeKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Of,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSizeExpressionAccess().getOfKeyword_2());
              		
            }
            // InternalPcodeParser.g:3179:3: ( (lv_value_3_0= ruleAtomic ) )
            // InternalPcodeParser.g:3180:4: (lv_value_3_0= ruleAtomic )
            {
            // InternalPcodeParser.g:3180:4: (lv_value_3_0= ruleAtomic )
            // InternalPcodeParser.g:3181:5: lv_value_3_0= ruleAtomic
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSizeExpressionAccess().getValueAtomicParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSizeExpressionRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"tdt4250.pseudocode.Pcode.Atomic");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSizeExpression"


    // $ANTLR start "entryRuleType"
    // InternalPcodeParser.g:3202:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalPcodeParser.g:3202:45: (iv_ruleType= ruleType EOF )
            // InternalPcodeParser.g:3203:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPcodeParser.g:3209:1: ruleType returns [EObject current=null] : ( () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_types_1_0 = null;

        AntlrDatatypeRuleToken lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:3215:2: ( ( () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* ) ) )
            // InternalPcodeParser.g:3216:2: ( () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* ) )
            {
            // InternalPcodeParser.g:3216:2: ( () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* ) )
            // InternalPcodeParser.g:3217:3: () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* )
            {
            // InternalPcodeParser.g:3217:3: ()
            // InternalPcodeParser.g:3218:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTypeAccess().getTypeAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:3224:3: ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* )
            // InternalPcodeParser.g:3225:4: ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )*
            {
            // InternalPcodeParser.g:3225:4: ( (lv_types_1_0= ruleTypeLiteral ) )
            // InternalPcodeParser.g:3226:5: (lv_types_1_0= ruleTypeLiteral )
            {
            // InternalPcodeParser.g:3226:5: (lv_types_1_0= ruleTypeLiteral )
            // InternalPcodeParser.g:3227:6: lv_types_1_0= ruleTypeLiteral
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getTypeAccess().getTypesTypeLiteralParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_45);
            lv_types_1_0=ruleTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getTypeRule());
              						}
              						add(
              							current,
              							"types",
              							lv_types_1_0,
              							"tdt4250.pseudocode.Pcode.TypeLiteral");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalPcodeParser.g:3244:4: (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==With) ) {
                    int LA59_2 = input.LA(2);

                    if ( (LA59_2==Decimal||LA59_2==Number||LA59_2==Array_1||LA59_2==Table_1||LA59_2==Text||LA59_2==List_1) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // InternalPcodeParser.g:3245:5: otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,With,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getWithKeyword_1_1_0());
            	      				
            	    }
            	    // InternalPcodeParser.g:3249:5: ( (lv_types_3_0= ruleTypeLiteral ) )
            	    // InternalPcodeParser.g:3250:6: (lv_types_3_0= ruleTypeLiteral )
            	    {
            	    // InternalPcodeParser.g:3250:6: (lv_types_3_0= ruleTypeLiteral )
            	    // InternalPcodeParser.g:3251:7: lv_types_3_0= ruleTypeLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getTypeAccess().getTypesTypeLiteralParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_types_3_0=ruleTypeLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getTypeRule());
            	      							}
            	      							add(
            	      								current,
            	      								"types",
            	      								lv_types_3_0,
            	      								"tdt4250.pseudocode.Pcode.TypeLiteral");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeLiteral"
    // InternalPcodeParser.g:3274:1: entryRuleTypeLiteral returns [String current=null] : iv_ruleTypeLiteral= ruleTypeLiteral EOF ;
    public final String entryRuleTypeLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLiteral = null;


        try {
            // InternalPcodeParser.g:3274:51: (iv_ruleTypeLiteral= ruleTypeLiteral EOF )
            // InternalPcodeParser.g:3275:2: iv_ruleTypeLiteral= ruleTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteral=ruleTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteral"


    // $ANTLR start "ruleTypeLiteral"
    // InternalPcodeParser.g:3281:1: ruleTypeLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Text | kw= Number | kw= Decimal | kw= Array_1 | kw= List_1 | kw= Table_1 ) ;
    public final AntlrDatatypeRuleToken ruleTypeLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:3287:2: ( (kw= Text | kw= Number | kw= Decimal | kw= Array_1 | kw= List_1 | kw= Table_1 ) )
            // InternalPcodeParser.g:3288:2: (kw= Text | kw= Number | kw= Decimal | kw= Array_1 | kw= List_1 | kw= Table_1 )
            {
            // InternalPcodeParser.g:3288:2: (kw= Text | kw= Number | kw= Decimal | kw= Array_1 | kw= List_1 | kw= Table_1 )
            int alt60=6;
            switch ( input.LA(1) ) {
            case Text:
                {
                alt60=1;
                }
                break;
            case Number:
                {
                alt60=2;
                }
                break;
            case Decimal:
                {
                alt60=3;
                }
                break;
            case Array_1:
                {
                alt60=4;
                }
                break;
            case List_1:
                {
                alt60=5;
                }
                break;
            case Table_1:
                {
                alt60=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalPcodeParser.g:3289:3: kw= Text
                    {
                    kw=(Token)match(input,Text,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getTextKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:3295:3: kw= Number
                    {
                    kw=(Token)match(input,Number,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getNumberKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:3301:3: kw= Decimal
                    {
                    kw=(Token)match(input,Decimal,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getDecimalKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:3307:3: kw= Array_1
                    {
                    kw=(Token)match(input,Array_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getArrayKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPcodeParser.g:3313:3: kw= List_1
                    {
                    kw=(Token)match(input,List_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getListKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPcodeParser.g:3319:3: kw= Table_1
                    {
                    kw=(Token)match(input,Table_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getTableKeyword_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteral"

    // Delegated rules


    protected DFA56 dfa56 = new DFA56(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\1\11\3\uffff";
    static final String dfa_3s = "\1\25\5\uffff\1\4\3\uffff";
    static final String dfa_4s = "\1\125\5\uffff\1\124\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\7\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\13\uffff\1\7\3\uffff\1\5\31\uffff\1\1\22\uffff\1\2\1\3\1\6\1\4",
            "",
            "",
            "",
            "",
            "",
            "\1\11\2\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\uffff\1\11\1\uffff\1\11\1\uffff\1\11\2\uffff\2\11\1\uffff\2\11\4\uffff\1\11\1\uffff\1\11\1\uffff\1\11\1\uffff\1\11\1\uffff\2\11\2\uffff\1\11\5\uffff\3\11\1\uffff\1\11\2\uffff\2\11\2\uffff\2\11\1\10\5\11\1\uffff\2\11\1\uffff\1\11\1\uffff\1\11\2\uffff\4\11\2\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2853:2: ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L,0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000092082800L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000092082800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0040020409140180L,0x0000000000120000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0082800000008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x9000042200A00000L,0x00000000003C2410L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x9000042200A00200L,0x00000000003C2410L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x9000042240A00000L,0x00000000003C2410L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000082080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008008L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x9000042200E00000L,0x00000000003C2410L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4200010000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000412L,0x0000000000000280L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x001C100000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000100800002L,0x0000000000000014L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000004014002L,0x0000000000000042L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x9000042200A00000L,0x00000000003C2411L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000000002L});

}