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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BiggerThen", "Executable", "Contains", "Continue", "Exchange", "Interval", "LessThen", "Decimal", "Package", "Number", "Divide", "Equals", "Modulo", "Remove", "Return", "Array_1", "Break", "False", "Index", "Minus", "Print", "Table_1", "Times", "While", "Text", "Else", "Line", "List_1", "Plus", "Size", "Stop", "That", "Then", "True", "With", "Add", "And", "For", "New", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "PlusSignPlusSign", "PlusSignEqualsSign", "HyphenMinusHyphenMinus", "HyphenMinusEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "At", "If", "Is", "Of", "Or", "To", "VerticalLineVerticalLine", "ExclamationMark", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Add=39;
    public static final int HyphenMinusHyphenMinus=47;
    public static final int New=42;
    public static final int Or=56;
    public static final int RULE_BEGIN=79;
    public static final int Stop=34;
    public static final int Size=33;
    public static final int Break=20;
    public static final int True=37;
    public static final int Index=22;
    public static final int Remove=17;
    public static final int False=21;
    public static final int LessThanSign=70;
    public static final int Divide=14;
    public static final int Print=24;
    public static final int PercentSign=60;
    public static final int LeftParenthesis=62;
    public static final int Decimal=11;
    public static final int Then=36;
    public static final int Ampersand=61;
    public static final int To=57;
    public static final int Executable=5;
    public static final int Plus=32;
    public static final int LessThen=10;
    public static final int RightSquareBracket=74;
    public static final int ExclamationMark=59;
    public static final int GreaterThanSign=72;
    public static final int RULE_ID=83;
    public static final int Modulo=16;
    public static final int For=41;
    public static final int RightParenthesis=63;
    public static final int GreaterThanSignEqualsSign=51;
    public static final int Exchange=8;
    public static final int Line=30;
    public static final int EqualsSignEqualsSign=50;
    public static final int BiggerThen=4;
    public static final int VerticalLine=77;
    public static final int And=40;
    public static final int PlusSign=65;
    public static final int RULE_INT=81;
    public static final int Contains=6;
    public static final int RULE_ML_COMMENT=85;
    public static final int LeftSquareBracket=73;
    public static final int Package=12;
    public static final int If=53;
    public static final int Minus=23;
    public static final int Interval=9;
    public static final int RULE_END=80;
    public static final int VerticalLineVerticalLine=58;
    public static final int Table_1=25;
    public static final int Is=54;
    public static final int RULE_STRING=84;
    public static final int Continue=7;
    public static final int With=38;
    public static final int RULE_SL_COMMENT=86;
    public static final int Comma=66;
    public static final int EqualsSign=71;
    public static final int HyphenMinus=67;
    public static final int At=52;
    public static final int Number=13;
    public static final int AmpersandAmpersand=44;
    public static final int RULE_DOUBLE=82;
    public static final int Array_1=19;
    public static final int HyphenMinusEqualsSign=48;
    public static final int LessThanSignEqualsSign=49;
    public static final int Solidus=69;
    public static final int RightCurlyBracket=78;
    public static final int EOF=-1;
    public static final int List_1=31;
    public static final int Asterisk=64;
    public static final int PlusSignEqualsSign=46;
    public static final int That=35;
    public static final int FullStop=68;
    public static final int Return=18;
    public static final int RULE_WS=87;
    public static final int LeftCurlyBracket=76;
    public static final int Text=28;
    public static final int While=27;
    public static final int RULE_ANY_OTHER=88;
    public static final int CircumflexAccent=75;
    public static final int Equals=15;
    public static final int PlusSignPlusSign=45;
    public static final int Times=26;
    public static final int Of=55;
    public static final int Else=29;
    public static final int ExclamationMarkEqualsSign=43;

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
    // InternalPcodeParser.g:405:1: ruleExpression returns [EObject current=null] : (this_Variable_0= ruleVariable | this_FunctionCall_1= ruleFunctionCall | this_Print_2= rulePrint | this_CollectionAdd_3= ruleCollectionAdd | this_CollectionRemove_4= ruleCollectionRemove | this_ValueExchange_5= ruleValueExchange ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_FunctionCall_1 = null;

        EObject this_Print_2 = null;

        EObject this_CollectionAdd_3 = null;

        EObject this_CollectionRemove_4 = null;

        EObject this_ValueExchange_5 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:411:2: ( (this_Variable_0= ruleVariable | this_FunctionCall_1= ruleFunctionCall | this_Print_2= rulePrint | this_CollectionAdd_3= ruleCollectionAdd | this_CollectionRemove_4= ruleCollectionRemove | this_ValueExchange_5= ruleValueExchange ) )
            // InternalPcodeParser.g:412:2: (this_Variable_0= ruleVariable | this_FunctionCall_1= ruleFunctionCall | this_Print_2= rulePrint | this_CollectionAdd_3= ruleCollectionAdd | this_CollectionRemove_4= ruleCollectionRemove | this_ValueExchange_5= ruleValueExchange )
            {
            // InternalPcodeParser.g:412:2: (this_Variable_0= ruleVariable | this_FunctionCall_1= ruleFunctionCall | this_Print_2= rulePrint | this_CollectionAdd_3= ruleCollectionAdd | this_CollectionRemove_4= ruleCollectionRemove | this_ValueExchange_5= ruleValueExchange )
            int alt11=6;
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
                alt11=6;
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
                    // InternalPcodeParser.g:458:3: this_ValueExchange_5= ruleValueExchange
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getValueExchangeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ValueExchange_5=ruleValueExchange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValueExchange_5;
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
    // InternalPcodeParser.g:470:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPcodeParser.g:470:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPcodeParser.g:471:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalPcodeParser.g:477:1: ruleVariable returns [EObject current=null] : ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) ) ;
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
            // InternalPcodeParser.g:483:2: ( ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) ) )
            // InternalPcodeParser.g:484:2: ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) )
            {
            // InternalPcodeParser.g:484:2: ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) )
            // InternalPcodeParser.g:485:3: () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) )
            {
            // InternalPcodeParser.g:485:3: ()
            // InternalPcodeParser.g:486:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVariableAccess().getVariableAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:492:3: ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==Equals||LA14_1==PlusSignEqualsSign||LA14_1==HyphenMinusEqualsSign||LA14_1==Is||LA14_1==EqualsSign) ) {
                    alt14=1;
                }
                else if ( (LA14_1==PlusSignPlusSign||LA14_1==HyphenMinusHyphenMinus) ) {
                    alt14=2;
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
                    // InternalPcodeParser.g:493:4: ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    {
                    // InternalPcodeParser.g:493:4: ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    // InternalPcodeParser.g:494:5: ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) )
                    {
                    // InternalPcodeParser.g:494:5: ( (lv_name_1_0= RULE_ID ) )
                    // InternalPcodeParser.g:495:6: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPcodeParser.g:495:6: (lv_name_1_0= RULE_ID )
                    // InternalPcodeParser.g:496:7: lv_name_1_0= RULE_ID
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

                    // InternalPcodeParser.g:512:5: ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) )
                    // InternalPcodeParser.g:513:6: ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) )
                    {
                    // InternalPcodeParser.g:513:6: ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) )
                    // InternalPcodeParser.g:514:7: (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign )
                    {
                    // InternalPcodeParser.g:514:7: (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign )
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
                            // InternalPcodeParser.g:515:8: lv_op_2_1= EqualsSign
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
                            // InternalPcodeParser.g:526:8: lv_op_2_2= Equals
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
                            // InternalPcodeParser.g:537:8: lv_op_2_3= Is
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
                            // InternalPcodeParser.g:548:8: lv_op_2_4= PlusSignEqualsSign
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
                            // InternalPcodeParser.g:559:8: lv_op_2_5= HyphenMinusEqualsSign
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

                    // InternalPcodeParser.g:572:5: ( (lv_value_3_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:573:6: (lv_value_3_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:573:6: (lv_value_3_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:574:7: lv_value_3_0= ruleLiteralExpression
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
                    // InternalPcodeParser.g:593:4: ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) )
                    {
                    // InternalPcodeParser.g:593:4: ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) )
                    // InternalPcodeParser.g:594:5: ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) )
                    {
                    // InternalPcodeParser.g:594:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalPcodeParser.g:595:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalPcodeParser.g:595:6: (lv_name_4_0= RULE_ID )
                    // InternalPcodeParser.g:596:7: lv_name_4_0= RULE_ID
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

                    // InternalPcodeParser.g:612:5: ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) )
                    // InternalPcodeParser.g:613:6: ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) )
                    {
                    // InternalPcodeParser.g:613:6: ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) )
                    // InternalPcodeParser.g:614:7: (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus )
                    {
                    // InternalPcodeParser.g:614:7: (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus )
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
                            // InternalPcodeParser.g:615:8: lv_op_5_1= PlusSignPlusSign
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
                            // InternalPcodeParser.g:626:8: lv_op_5_2= HyphenMinusHyphenMinus
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
    // InternalPcodeParser.g:645:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPcodeParser.g:645:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPcodeParser.g:646:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalPcodeParser.g:652:1: ruleParameter returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:658:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPcodeParser.g:659:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPcodeParser.g:659:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalPcodeParser.g:660:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalPcodeParser.g:660:3: ()
            // InternalPcodeParser.g:661:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterAccess().getVariableAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:667:3: ( (lv_type_1_0= ruleType ) )
            // InternalPcodeParser.g:668:4: (lv_type_1_0= ruleType )
            {
            // InternalPcodeParser.g:668:4: (lv_type_1_0= ruleType )
            // InternalPcodeParser.g:669:5: lv_type_1_0= ruleType
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

            // InternalPcodeParser.g:686:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPcodeParser.g:687:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPcodeParser.g:687:4: (lv_name_2_0= RULE_ID )
            // InternalPcodeParser.g:688:5: lv_name_2_0= RULE_ID
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
    // InternalPcodeParser.g:708:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalPcodeParser.g:708:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalPcodeParser.g:709:2: iv_ruleIfStatement= ruleIfStatement EOF
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
    // InternalPcodeParser.g:715:1: ruleIfStatement returns [EObject current=null] : ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? ) ;
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
            // InternalPcodeParser.g:721:2: ( ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? ) )
            // InternalPcodeParser.g:722:2: ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? )
            {
            // InternalPcodeParser.g:722:2: ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? )
            // InternalPcodeParser.g:723:3: () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )?
            {
            // InternalPcodeParser.g:723:3: ()
            // InternalPcodeParser.g:724:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfStatementAccess().getIfStatementAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:730:3: ( (lv_name_1_0= If ) )
            // InternalPcodeParser.g:731:4: (lv_name_1_0= If )
            {
            // InternalPcodeParser.g:731:4: (lv_name_1_0= If )
            // InternalPcodeParser.g:732:5: lv_name_1_0= If
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

            // InternalPcodeParser.g:744:3: ( (lv_condition_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:745:4: (lv_condition_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:745:4: (lv_condition_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:746:5: lv_condition_2_0= ruleLiteralExpression
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

            // InternalPcodeParser.g:763:3: (otherlv_3= Then )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Then) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPcodeParser.g:764:4: otherlv_3= Then
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
            // InternalPcodeParser.g:773:3: ( (lv_then_5_0= ruleFeature ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=Continue && LA16_0<=Exchange)||LA16_0==Return||LA16_0==Break||LA16_0==Print||LA16_0==While||LA16_0==Stop||LA16_0==For||LA16_0==If||LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPcodeParser.g:774:4: (lv_then_5_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:774:4: (lv_then_5_0= ruleFeature )
            	    // InternalPcodeParser.g:775:5: lv_then_5_0= ruleFeature
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
            // InternalPcodeParser.g:796:3: (otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Else) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPcodeParser.g:797:4: otherlv_7= Else this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END
                    {
                    otherlv_7=(Token)match(input,Else,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getIfStatementAccess().getElseKeyword_7_0());
                      			
                    }
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getIfStatementAccess().getBEGINTerminalRuleCall_7_1());
                      			
                    }
                    // InternalPcodeParser.g:805:4: ( (lv_otherwise_9_0= ruleFeature ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=Continue && LA17_0<=Exchange)||LA17_0==Return||LA17_0==Break||LA17_0==Print||LA17_0==While||LA17_0==Stop||LA17_0==For||LA17_0==If||LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalPcodeParser.g:806:5: (lv_otherwise_9_0= ruleFeature )
                    	    {
                    	    // InternalPcodeParser.g:806:5: (lv_otherwise_9_0= ruleFeature )
                    	    // InternalPcodeParser.g:807:6: lv_otherwise_9_0= ruleFeature
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
    // InternalPcodeParser.g:833:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalPcodeParser.g:833:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalPcodeParser.g:834:2: iv_ruleForStatement= ruleForStatement EOF
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
    // InternalPcodeParser.g:840:1: ruleForStatement returns [EObject current=null] : ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END ) ;
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
            // InternalPcodeParser.g:846:2: ( ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END ) )
            // InternalPcodeParser.g:847:2: ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END )
            {
            // InternalPcodeParser.g:847:2: ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END )
            // InternalPcodeParser.g:848:3: () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END
            {
            // InternalPcodeParser.g:848:3: ()
            // InternalPcodeParser.g:849:4: 
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
            // InternalPcodeParser.g:859:3: (otherlv_2= Interval )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Interval) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPcodeParser.g:860:4: otherlv_2= Interval
                    {
                    otherlv_2=(Token)match(input,Interval,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getIntervalKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalPcodeParser.g:865:3: ( (lv_from_3_0= ruleArithmeticExpression ) )
            // InternalPcodeParser.g:866:4: (lv_from_3_0= ruleArithmeticExpression )
            {
            // InternalPcodeParser.g:866:4: (lv_from_3_0= ruleArithmeticExpression )
            // InternalPcodeParser.g:867:5: lv_from_3_0= ruleArithmeticExpression
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
            // InternalPcodeParser.g:888:3: ( (lv_to_5_0= ruleArithmeticExpression ) )
            // InternalPcodeParser.g:889:4: (lv_to_5_0= ruleArithmeticExpression )
            {
            // InternalPcodeParser.g:889:4: (lv_to_5_0= ruleArithmeticExpression )
            // InternalPcodeParser.g:890:5: lv_to_5_0= ruleArithmeticExpression
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
            // InternalPcodeParser.g:911:3: ( (lv_block_7_0= ruleFeature ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=Continue && LA20_0<=Exchange)||LA20_0==Return||LA20_0==Break||LA20_0==Print||LA20_0==While||LA20_0==Stop||LA20_0==For||LA20_0==If||LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPcodeParser.g:912:4: (lv_block_7_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:912:4: (lv_block_7_0= ruleFeature )
            	    // InternalPcodeParser.g:913:5: lv_block_7_0= ruleFeature
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
    // InternalPcodeParser.g:938:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalPcodeParser.g:938:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalPcodeParser.g:939:2: iv_ruleWhileStatement= ruleWhileStatement EOF
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
    // InternalPcodeParser.g:945:1: ruleWhileStatement returns [EObject current=null] : ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:951:2: ( ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END ) )
            // InternalPcodeParser.g:952:2: ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END )
            {
            // InternalPcodeParser.g:952:2: ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END )
            // InternalPcodeParser.g:953:3: () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END
            {
            // InternalPcodeParser.g:953:3: ()
            // InternalPcodeParser.g:954:4: 
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
            // InternalPcodeParser.g:964:3: ( (lv_condition_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:965:4: (lv_condition_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:965:4: (lv_condition_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:966:5: lv_condition_2_0= ruleLiteralExpression
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
            // InternalPcodeParser.g:987:3: ( (lv_block_4_0= ruleFeature ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=Continue && LA21_0<=Exchange)||LA21_0==Return||LA21_0==Break||LA21_0==Print||LA21_0==While||LA21_0==Stop||LA21_0==For||LA21_0==If||LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPcodeParser.g:988:4: (lv_block_4_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:988:4: (lv_block_4_0= ruleFeature )
            	    // InternalPcodeParser.g:989:5: lv_block_4_0= ruleFeature
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
    // InternalPcodeParser.g:1014:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalPcodeParser.g:1014:45: (iv_ruleStop= ruleStop EOF )
            // InternalPcodeParser.g:1015:2: iv_ruleStop= ruleStop EOF
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
    // InternalPcodeParser.g:1021:1: ruleStop returns [EObject current=null] : ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        Token lv_type_2_0=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1027:2: ( ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) ) ) )
            // InternalPcodeParser.g:1028:2: ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) ) )
            {
            // InternalPcodeParser.g:1028:2: ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) ) )
            // InternalPcodeParser.g:1029:3: () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
            {
            // InternalPcodeParser.g:1029:3: ()
            // InternalPcodeParser.g:1030:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStopAccess().getStopAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1036:3: ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
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
                    // InternalPcodeParser.g:1037:4: ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) )
                    {
                    // InternalPcodeParser.g:1037:4: ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) )
                    // InternalPcodeParser.g:1038:5: ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) )
                    {
                    // InternalPcodeParser.g:1038:5: ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) )
                    // InternalPcodeParser.g:1039:6: (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue )
                    {
                    // InternalPcodeParser.g:1039:6: (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue )
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
                            // InternalPcodeParser.g:1040:7: lv_type_1_1= Stop
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
                            // InternalPcodeParser.g:1051:7: lv_type_1_2= Break
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
                            // InternalPcodeParser.g:1062:7: lv_type_1_3= Continue
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
                    // InternalPcodeParser.g:1076:4: ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    {
                    // InternalPcodeParser.g:1076:4: ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    // InternalPcodeParser.g:1077:5: ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleLiteralExpression ) )
                    {
                    // InternalPcodeParser.g:1077:5: ( (lv_type_2_0= Return ) )
                    // InternalPcodeParser.g:1078:6: (lv_type_2_0= Return )
                    {
                    // InternalPcodeParser.g:1078:6: (lv_type_2_0= Return )
                    // InternalPcodeParser.g:1079:7: lv_type_2_0= Return
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

                    // InternalPcodeParser.g:1091:5: ( (lv_value_3_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1092:6: (lv_value_3_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1092:6: (lv_value_3_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1093:7: lv_value_3_0= ruleLiteralExpression
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
    // InternalPcodeParser.g:1116:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalPcodeParser.g:1116:46: (iv_rulePrint= rulePrint EOF )
            // InternalPcodeParser.g:1117:2: iv_rulePrint= rulePrint EOF
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
    // InternalPcodeParser.g:1123:1: rulePrint returns [EObject current=null] : ( ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_newline_1_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1129:2: ( ( ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1130:2: ( ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1130:2: ( ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1131:3: ( (lv_name_0_0= Print ) ) ( (lv_newline_1_0= Line ) )? ( (lv_value_2_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1131:3: ( (lv_name_0_0= Print ) )
            // InternalPcodeParser.g:1132:4: (lv_name_0_0= Print )
            {
            // InternalPcodeParser.g:1132:4: (lv_name_0_0= Print )
            // InternalPcodeParser.g:1133:5: lv_name_0_0= Print
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

            // InternalPcodeParser.g:1145:3: ( (lv_newline_1_0= Line ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Line) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPcodeParser.g:1146:4: (lv_newline_1_0= Line )
                    {
                    // InternalPcodeParser.g:1146:4: (lv_newline_1_0= Line )
                    // InternalPcodeParser.g:1147:5: lv_newline_1_0= Line
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

            // InternalPcodeParser.g:1159:3: ( (lv_value_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1160:4: (lv_value_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1160:4: (lv_value_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1161:5: lv_value_2_0= ruleLiteralExpression
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
    // InternalPcodeParser.g:1182:1: entryRuleCollectionAdd returns [EObject current=null] : iv_ruleCollectionAdd= ruleCollectionAdd EOF ;
    public final EObject entryRuleCollectionAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionAdd = null;


        try {
            // InternalPcodeParser.g:1182:54: (iv_ruleCollectionAdd= ruleCollectionAdd EOF )
            // InternalPcodeParser.g:1183:2: iv_ruleCollectionAdd= ruleCollectionAdd EOF
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
    // InternalPcodeParser.g:1189:1: ruleCollectionAdd returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleCollectionAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1195:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1196:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1196:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1197:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1197:3: ()
            // InternalPcodeParser.g:1198:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionAddAccess().getCollectionAddAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1204:3: ( (otherlv_1= RULE_ID ) )
            // InternalPcodeParser.g:1205:4: (otherlv_1= RULE_ID )
            {
            // InternalPcodeParser.g:1205:4: (otherlv_1= RULE_ID )
            // InternalPcodeParser.g:1206:5: otherlv_1= RULE_ID
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
            // InternalPcodeParser.g:1221:3: ( (lv_value_3_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1222:4: (lv_value_3_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1222:4: (lv_value_3_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1223:5: lv_value_3_0= ruleLiteralExpression
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
    // InternalPcodeParser.g:1244:1: entryRuleCollectionRemove returns [EObject current=null] : iv_ruleCollectionRemove= ruleCollectionRemove EOF ;
    public final EObject entryRuleCollectionRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionRemove = null;


        try {
            // InternalPcodeParser.g:1244:57: (iv_ruleCollectionRemove= ruleCollectionRemove EOF )
            // InternalPcodeParser.g:1245:2: iv_ruleCollectionRemove= ruleCollectionRemove EOF
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
    // InternalPcodeParser.g:1251:1: ruleCollectionRemove returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleCollectionRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1257:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1258:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1258:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1259:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1259:3: ()
            // InternalPcodeParser.g:1260:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionRemoveAccess().getCollectionRemoveAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1266:3: ( (otherlv_1= RULE_ID ) )
            // InternalPcodeParser.g:1267:4: (otherlv_1= RULE_ID )
            {
            // InternalPcodeParser.g:1267:4: (otherlv_1= RULE_ID )
            // InternalPcodeParser.g:1268:5: otherlv_1= RULE_ID
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
            // InternalPcodeParser.g:1283:3: ( (lv_value_3_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1284:4: (lv_value_3_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1284:4: (lv_value_3_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1285:5: lv_value_3_0= ruleLiteralExpression
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


    // $ANTLR start "entryRuleValueExchange"
    // InternalPcodeParser.g:1306:1: entryRuleValueExchange returns [EObject current=null] : iv_ruleValueExchange= ruleValueExchange EOF ;
    public final EObject entryRuleValueExchange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExchange = null;


        try {
            // InternalPcodeParser.g:1306:54: (iv_ruleValueExchange= ruleValueExchange EOF )
            // InternalPcodeParser.g:1307:2: iv_ruleValueExchange= ruleValueExchange EOF
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
    // InternalPcodeParser.g:1313:1: ruleValueExchange returns [EObject current=null] : ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleValueExchange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_collection_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1319:2: ( ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1320:2: ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1320:2: ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1321:3: () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1321:3: ()
            // InternalPcodeParser.g:1322:4: 
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
            // InternalPcodeParser.g:1332:3: ( (lv_collection_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1333:4: (lv_collection_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1333:4: (lv_collection_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1334:5: lv_collection_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValueExchangeAccess().getCollectionLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_23);
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
            // InternalPcodeParser.g:1355:3: ( (lv_value_4_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1356:4: (lv_value_4_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1356:4: (lv_value_4_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1357:5: lv_value_4_0= ruleLiteralExpression
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
    // InternalPcodeParser.g:1378:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalPcodeParser.g:1378:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalPcodeParser.g:1379:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalPcodeParser.g:1385:1: ruleLiteralExpression returns [EObject current=null] : (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Collection_0 = null;

        EObject this_CollectionAccessor_1 = null;

        EObject this_BooleanExpression_2 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1391:2: ( (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression ) )
            // InternalPcodeParser.g:1392:2: (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression )
            {
            // InternalPcodeParser.g:1392:2: (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression )
            int alt25=3;
            switch ( input.LA(1) ) {
            case New:
            case LeftSquareBracket:
            case LeftCurlyBracket:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==At||LA25_2==LeftSquareBracket) ) {
                    alt25=2;
                }
                else if ( (LA25_2==EOF||LA25_2==BiggerThen||(LA25_2>=Continue && LA25_2<=Exchange)||LA25_2==LessThen||LA25_2==Divide||LA25_2==Modulo||LA25_2==Return||LA25_2==Break||(LA25_2>=Minus && LA25_2<=Print)||(LA25_2>=Times && LA25_2<=While)||LA25_2==Plus||LA25_2==Stop||LA25_2==Then||LA25_2==With||(LA25_2>=And && LA25_2<=For)||LA25_2==ExclamationMarkEqualsSign||(LA25_2>=LessThanSignEqualsSign && LA25_2<=GreaterThanSignEqualsSign)||LA25_2==If||LA25_2==Or||(LA25_2>=PercentSign && LA25_2<=HyphenMinus)||(LA25_2>=Solidus && LA25_2<=LessThanSign)||LA25_2==GreaterThanSign||LA25_2==RightSquareBracket||(LA25_2>=VerticalLine && LA25_2<=RULE_END)||LA25_2==RULE_ID) ) {
                    alt25=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

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
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalPcodeParser.g:1393:3: this_Collection_0= ruleCollection
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
                    // InternalPcodeParser.g:1402:3: this_CollectionAccessor_1= ruleCollectionAccessor
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
                    // InternalPcodeParser.g:1411:3: this_BooleanExpression_2= ruleBooleanExpression
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
    // InternalPcodeParser.g:1423:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalPcodeParser.g:1423:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalPcodeParser.g:1424:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalPcodeParser.g:1430:1: ruleCollection returns [EObject current=null] : (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLitteral_0 = null;

        EObject this_List_1 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1436:2: ( (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList ) )
            // InternalPcodeParser.g:1437:2: (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList )
            {
            // InternalPcodeParser.g:1437:2: (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LeftSquareBracket||LA26_0==LeftCurlyBracket) ) {
                alt26=1;
            }
            else if ( (LA26_0==New) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPcodeParser.g:1438:3: this_CollectionLitteral_0= ruleCollectionLitteral
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
                    // InternalPcodeParser.g:1447:3: this_List_1= ruleList
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
    // InternalPcodeParser.g:1459:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalPcodeParser.g:1459:45: (iv_ruleList= ruleList EOF )
            // InternalPcodeParser.g:1460:2: iv_ruleList= ruleList EOF
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
    // InternalPcodeParser.g:1466:1: ruleList returns [EObject current=null] : ( () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? ) ;
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
            // InternalPcodeParser.g:1472:2: ( ( () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? ) )
            // InternalPcodeParser.g:1473:2: ( () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? )
            {
            // InternalPcodeParser.g:1473:2: ( () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? )
            // InternalPcodeParser.g:1474:3: () otherlv_1= New (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 ) otherlv_5= With ( (lv_type_6_0= ruleType ) ) (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )?
            {
            // InternalPcodeParser.g:1474:3: ()
            // InternalPcodeParser.g:1475:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListAccess().getListAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,New,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListAccess().getNewKeyword_1());
              		
            }
            // InternalPcodeParser.g:1485:3: (otherlv_2= Array_1 | otherlv_3= List_1 | otherlv_4= Table_1 )
            int alt27=3;
            switch ( input.LA(1) ) {
            case Array_1:
                {
                alt27=1;
                }
                break;
            case List_1:
                {
                alt27=2;
                }
                break;
            case Table_1:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalPcodeParser.g:1486:4: otherlv_2= Array_1
                    {
                    otherlv_2=(Token)match(input,Array_1,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getListAccess().getArrayKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1491:4: otherlv_3= List_1
                    {
                    otherlv_3=(Token)match(input,List_1,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getListAccess().getListKeyword_2_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:1496:4: otherlv_4= Table_1
                    {
                    otherlv_4=(Token)match(input,Table_1,FOLLOW_23); if (state.failed) return current;
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
            // InternalPcodeParser.g:1505:3: ( (lv_type_6_0= ruleType ) )
            // InternalPcodeParser.g:1506:4: (lv_type_6_0= ruleType )
            {
            // InternalPcodeParser.g:1506:4: (lv_type_6_0= ruleType )
            // InternalPcodeParser.g:1507:5: lv_type_6_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListAccess().getTypeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            // InternalPcodeParser.g:1524:3: (otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==That) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPcodeParser.g:1525:4: otherlv_7= That otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )*
                    {
                    otherlv_7=(Token)match(input,That,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getListAccess().getThatKeyword_5_0());
                      			
                    }
                    otherlv_8=(Token)match(input,Contains,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getListAccess().getContainsKeyword_5_1());
                      			
                    }
                    // InternalPcodeParser.g:1533:4: ( (lv_elements_9_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1534:5: (lv_elements_9_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1534:5: (lv_elements_9_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1535:6: lv_elements_9_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListAccess().getElementsLiteralExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    // InternalPcodeParser.g:1552:4: (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==Comma) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1553:5: otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_10=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getListAccess().getCommaKeyword_5_3_0());
                    	      				
                    	    }
                    	    // InternalPcodeParser.g:1557:5: ( (lv_elements_11_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1558:6: (lv_elements_11_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1558:6: (lv_elements_11_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1559:7: lv_elements_11_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListAccess().getElementsLiteralExpressionParserRuleCall_5_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop28;
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
    // InternalPcodeParser.g:1582:1: entryRuleCollectionLitteral returns [EObject current=null] : iv_ruleCollectionLitteral= ruleCollectionLitteral EOF ;
    public final EObject entryRuleCollectionLitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLitteral = null;


        try {
            // InternalPcodeParser.g:1582:59: (iv_ruleCollectionLitteral= ruleCollectionLitteral EOF )
            // InternalPcodeParser.g:1583:2: iv_ruleCollectionLitteral= ruleCollectionLitteral EOF
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
    // InternalPcodeParser.g:1589:1: ruleCollectionLitteral returns [EObject current=null] : (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral ) ;
    public final EObject ruleCollectionLitteral() throws RecognitionException {
        EObject current = null;

        EObject this_SetLitteral_0 = null;

        EObject this_ListLitteral_1 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1595:2: ( (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral ) )
            // InternalPcodeParser.g:1596:2: (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral )
            {
            // InternalPcodeParser.g:1596:2: (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LeftCurlyBracket) ) {
                alt30=1;
            }
            else if ( (LA30_0==LeftSquareBracket) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPcodeParser.g:1597:3: this_SetLitteral_0= ruleSetLitteral
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
                    // InternalPcodeParser.g:1606:3: this_ListLitteral_1= ruleListLitteral
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
    // InternalPcodeParser.g:1618:1: entryRuleSetLitteral returns [EObject current=null] : iv_ruleSetLitteral= ruleSetLitteral EOF ;
    public final EObject entryRuleSetLitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLitteral = null;


        try {
            // InternalPcodeParser.g:1618:52: (iv_ruleSetLitteral= ruleSetLitteral EOF )
            // InternalPcodeParser.g:1619:2: iv_ruleSetLitteral= ruleSetLitteral EOF
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
    // InternalPcodeParser.g:1625:1: ruleSetLitteral returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleSetLitteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1631:2: ( ( () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket ) )
            // InternalPcodeParser.g:1632:2: ( () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket )
            {
            // InternalPcodeParser.g:1632:2: ( () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket )
            // InternalPcodeParser.g:1633:3: () otherlv_1= LeftCurlyBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightCurlyBracket
            {
            // InternalPcodeParser.g:1633:3: ()
            // InternalPcodeParser.g:1634:4: 
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
            // InternalPcodeParser.g:1644:3: ( (lv_elements_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1645:4: (lv_elements_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1645:4: (lv_elements_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1646:5: lv_elements_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSetLitteralAccess().getElementsLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalPcodeParser.g:1663:3: (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPcodeParser.g:1664:4: otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getSetLitteralAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalPcodeParser.g:1668:4: ( (lv_elements_4_0= ruleLiteralExpression ) )
            	    // InternalPcodeParser.g:1669:5: (lv_elements_4_0= ruleLiteralExpression )
            	    {
            	    // InternalPcodeParser.g:1669:5: (lv_elements_4_0= ruleLiteralExpression )
            	    // InternalPcodeParser.g:1670:6: lv_elements_4_0= ruleLiteralExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSetLitteralAccess().getElementsLiteralExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    break loop31;
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
    // InternalPcodeParser.g:1696:1: entryRuleListLitteral returns [EObject current=null] : iv_ruleListLitteral= ruleListLitteral EOF ;
    public final EObject entryRuleListLitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLitteral = null;


        try {
            // InternalPcodeParser.g:1696:53: (iv_ruleListLitteral= ruleListLitteral EOF )
            // InternalPcodeParser.g:1697:2: iv_ruleListLitteral= ruleListLitteral EOF
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
    // InternalPcodeParser.g:1703:1: ruleListLitteral returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleListLitteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1709:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalPcodeParser.g:1710:2: ( () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalPcodeParser.g:1710:2: ( () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket )
            // InternalPcodeParser.g:1711:3: () otherlv_1= LeftSquareBracket ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalPcodeParser.g:1711:3: ()
            // InternalPcodeParser.g:1712:4: 
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
            // InternalPcodeParser.g:1722:3: ( (lv_elements_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1723:4: (lv_elements_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1723:4: (lv_elements_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1724:5: lv_elements_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListLitteralAccess().getElementsLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalPcodeParser.g:1741:3: (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPcodeParser.g:1742:4: otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getListLitteralAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalPcodeParser.g:1746:4: ( (lv_elements_4_0= ruleLiteralExpression ) )
            	    // InternalPcodeParser.g:1747:5: (lv_elements_4_0= ruleLiteralExpression )
            	    {
            	    // InternalPcodeParser.g:1747:5: (lv_elements_4_0= ruleLiteralExpression )
            	    // InternalPcodeParser.g:1748:6: lv_elements_4_0= ruleLiteralExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getListLitteralAccess().getElementsLiteralExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop32;
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
    // InternalPcodeParser.g:1774:1: entryRuleCollectionAccessor returns [EObject current=null] : iv_ruleCollectionAccessor= ruleCollectionAccessor EOF ;
    public final EObject entryRuleCollectionAccessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionAccessor = null;


        try {
            // InternalPcodeParser.g:1774:59: (iv_ruleCollectionAccessor= ruleCollectionAccessor EOF )
            // InternalPcodeParser.g:1775:2: iv_ruleCollectionAccessor= ruleCollectionAccessor EOF
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
    // InternalPcodeParser.g:1781:1: ruleCollectionAccessor returns [EObject current=null] : ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) ) ;
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
            // InternalPcodeParser.g:1787:2: ( ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) ) )
            // InternalPcodeParser.g:1788:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) )
            {
            // InternalPcodeParser.g:1788:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) )
            // InternalPcodeParser.g:1789:3: () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) )
            {
            // InternalPcodeParser.g:1789:3: ()
            // InternalPcodeParser.g:1790:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionAccessorAccess().getCollectionAccessorAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1796:3: ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==LeftSquareBracket) ) {
                    alt36=1;
                }
                else if ( (LA36_1==At) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPcodeParser.g:1797:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ )
                    {
                    // InternalPcodeParser.g:1797:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ )
                    // InternalPcodeParser.g:1798:5: ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+
                    {
                    // InternalPcodeParser.g:1798:5: ( (otherlv_1= RULE_ID ) )
                    // InternalPcodeParser.g:1799:6: (otherlv_1= RULE_ID )
                    {
                    // InternalPcodeParser.g:1799:6: (otherlv_1= RULE_ID )
                    // InternalPcodeParser.g:1800:7: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCollectionAccessorRule());
                      							}
                      						
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_1, grammarAccess.getCollectionAccessorAccess().getCollectionVariableCrossReference_1_0_0_0());
                      						
                    }

                    }


                    }

                    // InternalPcodeParser.g:1811:5: (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==LeftSquareBracket) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1812:6: otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket
                    	    {
                    	    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getCollectionAccessorAccess().getLeftSquareBracketKeyword_1_0_1_0());
                    	      					
                    	    }
                    	    // InternalPcodeParser.g:1816:6: ( (lv_accessor_3_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1817:7: (lv_accessor_3_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1817:7: (lv_accessor_3_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1818:8: lv_accessor_3_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCollectionAccessorAccess().getAccessorLiteralExpressionParserRuleCall_1_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_31);
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

                    	    otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_32); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getCollectionAccessorAccess().getRightSquareBracketKeyword_1_0_1_2());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1842:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* )
                    {
                    // InternalPcodeParser.g:1842:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* )
                    // InternalPcodeParser.g:1843:5: ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )*
                    {
                    // InternalPcodeParser.g:1843:5: ( (otherlv_5= RULE_ID ) )
                    // InternalPcodeParser.g:1844:6: (otherlv_5= RULE_ID )
                    {
                    // InternalPcodeParser.g:1844:6: (otherlv_5= RULE_ID )
                    // InternalPcodeParser.g:1845:7: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCollectionAccessorRule());
                      							}
                      						
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_5, grammarAccess.getCollectionAccessorAccess().getCollectionVariableCrossReference_1_1_0_0());
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,At,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getCollectionAccessorAccess().getAtKeyword_1_1_1());
                      				
                    }
                    // InternalPcodeParser.g:1860:5: (otherlv_7= Index )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==Index) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalPcodeParser.g:1861:6: otherlv_7= Index
                            {
                            otherlv_7=(Token)match(input,Index,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getCollectionAccessorAccess().getIndexKeyword_1_1_2());
                              					
                            }

                            }
                            break;

                    }

                    // InternalPcodeParser.g:1866:5: ( (lv_accessor_8_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1867:6: (lv_accessor_8_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1867:6: (lv_accessor_8_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1868:7: lv_accessor_8_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCollectionAccessorAccess().getAccessorLiteralExpressionParserRuleCall_1_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_27);
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

                    // InternalPcodeParser.g:1885:5: (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==Comma) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1886:6: otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getCollectionAccessorAccess().getCommaKeyword_1_1_4_0());
                    	      					
                    	    }
                    	    // InternalPcodeParser.g:1890:6: ( (lv_accessor_10_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1891:7: (lv_accessor_10_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1891:7: (lv_accessor_10_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1892:8: lv_accessor_10_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCollectionAccessorAccess().getAccessorLiteralExpressionParserRuleCall_1_1_4_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop35;
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
    // InternalPcodeParser.g:1916:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalPcodeParser.g:1916:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalPcodeParser.g:1917:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalPcodeParser.g:1923:1: ruleBooleanExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        AntlrDatatypeRuleToken lv_op_2_1 = null;

        AntlrDatatypeRuleToken lv_op_2_2 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1929:2: ( (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalPcodeParser.g:1930:2: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalPcodeParser.g:1930:2: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalPcodeParser.g:1931:3: this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:1939:3: ( ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==And||LA38_0==Or||LA38_0==Ampersand||LA38_0==VerticalLine) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPcodeParser.g:1940:4: ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalPcodeParser.g:1940:4: ( () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) ) )
            	    // InternalPcodeParser.g:1941:5: () ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) )
            	    {
            	    // InternalPcodeParser.g:1941:5: ()
            	    // InternalPcodeParser.g:1942:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:1948:5: ( ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) ) )
            	    // InternalPcodeParser.g:1949:6: ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) )
            	    {
            	    // InternalPcodeParser.g:1949:6: ( (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator ) )
            	    // InternalPcodeParser.g:1950:7: (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator )
            	    {
            	    // InternalPcodeParser.g:1950:7: (lv_op_2_1= ruleOrOperator | lv_op_2_2= ruleAndOperator )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==Or||LA37_0==VerticalLine) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==And||LA37_0==Ampersand) ) {
            	        alt37=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalPcodeParser.g:1951:8: lv_op_2_1= ruleOrOperator
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
            	            // InternalPcodeParser.g:1967:8: lv_op_2_2= ruleAndOperator
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

            	    // InternalPcodeParser.g:1986:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalPcodeParser.g:1987:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalPcodeParser.g:1987:5: (lv_right_3_0= ruleComparison )
            	    // InternalPcodeParser.g:1988:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    break loop38;
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
    // InternalPcodeParser.g:2010:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalPcodeParser.g:2010:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalPcodeParser.g:2011:2: iv_ruleOrOperator= ruleOrOperator EOF
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
    // InternalPcodeParser.g:2017:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= VerticalLine | kw= Or ) ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2023:2: ( (kw= VerticalLine | kw= Or ) )
            // InternalPcodeParser.g:2024:2: (kw= VerticalLine | kw= Or )
            {
            // InternalPcodeParser.g:2024:2: (kw= VerticalLine | kw= Or )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==VerticalLine) ) {
                alt39=1;
            }
            else if ( (LA39_0==Or) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPcodeParser.g:2025:3: kw= VerticalLine
                    {
                    kw=(Token)match(input,VerticalLine,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2031:3: kw= Or
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
    // InternalPcodeParser.g:2040:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalPcodeParser.g:2040:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalPcodeParser.g:2041:2: iv_ruleAndOperator= ruleAndOperator EOF
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
    // InternalPcodeParser.g:2047:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Ampersand | kw= And ) ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2053:2: ( (kw= Ampersand | kw= And ) )
            // InternalPcodeParser.g:2054:2: (kw= Ampersand | kw= And )
            {
            // InternalPcodeParser.g:2054:2: (kw= Ampersand | kw= And )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Ampersand) ) {
                alt40=1;
            }
            else if ( (LA40_0==And) ) {
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
                    // InternalPcodeParser.g:2055:3: kw= Ampersand
                    {
                    kw=(Token)match(input,Ampersand,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2061:3: kw= And
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
    // InternalPcodeParser.g:2070:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalPcodeParser.g:2070:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalPcodeParser.g:2071:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalPcodeParser.g:2077:1: ruleComparison returns [EObject current=null] : (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* ) ;
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
            // InternalPcodeParser.g:2083:2: ( (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* ) )
            // InternalPcodeParser.g:2084:2: (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* )
            {
            // InternalPcodeParser.g:2084:2: (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* )
            // InternalPcodeParser.g:2085:3: this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getEqualsParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_Equals_0=ruleEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equals_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2093:3: ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==BiggerThen||LA42_0==LessThen||LA42_0==LessThanSign||LA42_0==GreaterThanSign) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPcodeParser.g:2094:4: ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) ) ( (lv_right_3_0= ruleEquals ) )
            	    {
            	    // InternalPcodeParser.g:2094:4: ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) ) )
            	    // InternalPcodeParser.g:2095:5: () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) )
            	    {
            	    // InternalPcodeParser.g:2095:5: ()
            	    // InternalPcodeParser.g:2096:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2102:5: ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) ) )
            	    // InternalPcodeParser.g:2103:6: ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) )
            	    {
            	    // InternalPcodeParser.g:2103:6: ( (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen ) )
            	    // InternalPcodeParser.g:2104:7: (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen )
            	    {
            	    // InternalPcodeParser.g:2104:7: (lv_op_2_1= LessThanSign | lv_op_2_2= LessThen | lv_op_2_3= GreaterThanSign | lv_op_2_4= BiggerThen )
            	    int alt41=4;
            	    switch ( input.LA(1) ) {
            	    case LessThanSign:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case LessThen:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case GreaterThanSign:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    case BiggerThen:
            	        {
            	        alt41=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // InternalPcodeParser.g:2105:8: lv_op_2_1= LessThanSign
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
            	            // InternalPcodeParser.g:2116:8: lv_op_2_2= LessThen
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
            	            // InternalPcodeParser.g:2127:8: lv_op_2_3= GreaterThanSign
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
            	            // InternalPcodeParser.g:2138:8: lv_op_2_4= BiggerThen
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

            	    // InternalPcodeParser.g:2152:4: ( (lv_right_3_0= ruleEquals ) )
            	    // InternalPcodeParser.g:2153:5: (lv_right_3_0= ruleEquals )
            	    {
            	    // InternalPcodeParser.g:2153:5: (lv_right_3_0= ruleEquals )
            	    // InternalPcodeParser.g:2154:6: lv_right_3_0= ruleEquals
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightEqualsParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop42;
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
    // InternalPcodeParser.g:2176:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // InternalPcodeParser.g:2176:47: (iv_ruleEquals= ruleEquals EOF )
            // InternalPcodeParser.g:2177:2: iv_ruleEquals= ruleEquals EOF
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
    // InternalPcodeParser.g:2183:1: ruleEquals returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) ;
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
            // InternalPcodeParser.g:2189:2: ( (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // InternalPcodeParser.g:2190:2: (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // InternalPcodeParser.g:2190:2: (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            // InternalPcodeParser.g:2191:3: this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualsAccess().getAdditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Addition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2199:3: ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==ExclamationMarkEqualsSign||(LA44_0>=LessThanSignEqualsSign && LA44_0<=GreaterThanSignEqualsSign)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPcodeParser.g:2200:4: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // InternalPcodeParser.g:2200:4: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) )
            	    // InternalPcodeParser.g:2201:5: () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) )
            	    {
            	    // InternalPcodeParser.g:2201:5: ()
            	    // InternalPcodeParser.g:2202:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2208:5: ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) )
            	    // InternalPcodeParser.g:2209:6: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalPcodeParser.g:2209:6: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) )
            	    // InternalPcodeParser.g:2210:7: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign )
            	    {
            	    // InternalPcodeParser.g:2210:7: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign )
            	    int alt43=4;
            	    switch ( input.LA(1) ) {
            	    case EqualsSignEqualsSign:
            	        {
            	        alt43=1;
            	        }
            	        break;
            	    case LessThanSignEqualsSign:
            	        {
            	        alt43=2;
            	        }
            	        break;
            	    case GreaterThanSignEqualsSign:
            	        {
            	        alt43=3;
            	        }
            	        break;
            	    case ExclamationMarkEqualsSign:
            	        {
            	        alt43=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt43) {
            	        case 1 :
            	            // InternalPcodeParser.g:2211:8: lv_op_2_1= EqualsSignEqualsSign
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
            	            // InternalPcodeParser.g:2222:8: lv_op_2_2= LessThanSignEqualsSign
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
            	            // InternalPcodeParser.g:2233:8: lv_op_2_3= GreaterThanSignEqualsSign
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
            	            // InternalPcodeParser.g:2244:8: lv_op_2_4= ExclamationMarkEqualsSign
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

            	    // InternalPcodeParser.g:2258:4: ( (lv_right_3_0= ruleAddition ) )
            	    // InternalPcodeParser.g:2259:5: (lv_right_3_0= ruleAddition )
            	    {
            	    // InternalPcodeParser.g:2259:5: (lv_right_3_0= ruleAddition )
            	    // InternalPcodeParser.g:2260:6: lv_right_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualsAccess().getRightAdditionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop44;
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
    // InternalPcodeParser.g:2282:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalPcodeParser.g:2282:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalPcodeParser.g:2283:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
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
    // InternalPcodeParser.g:2289:1: ruleArithmeticExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2295:2: (this_Addition_0= ruleAddition )
            // InternalPcodeParser.g:2296:2: this_Addition_0= ruleAddition
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
    // InternalPcodeParser.g:2307:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalPcodeParser.g:2307:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalPcodeParser.g:2308:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalPcodeParser.g:2314:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2320:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalPcodeParser.g:2321:2: (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalPcodeParser.g:2321:2: (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalPcodeParser.g:2322:3: this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2330:3: ( ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==Minus||LA46_0==Plus||LA46_0==PlusSign||LA46_0==HyphenMinus) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPcodeParser.g:2331:4: ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalPcodeParser.g:2331:4: ( ( () rulePlusOperator ) | ( () ruleMinusOperator ) )
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==Plus||LA45_0==PlusSign) ) {
            	        alt45=1;
            	    }
            	    else if ( (LA45_0==Minus||LA45_0==HyphenMinus) ) {
            	        alt45=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 45, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalPcodeParser.g:2332:5: ( () rulePlusOperator )
            	            {
            	            // InternalPcodeParser.g:2332:5: ( () rulePlusOperator )
            	            // InternalPcodeParser.g:2333:6: () rulePlusOperator
            	            {
            	            // InternalPcodeParser.g:2333:6: ()
            	            // InternalPcodeParser.g:2334:7: 
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
            	            // InternalPcodeParser.g:2349:5: ( () ruleMinusOperator )
            	            {
            	            // InternalPcodeParser.g:2349:5: ( () ruleMinusOperator )
            	            // InternalPcodeParser.g:2350:6: () ruleMinusOperator
            	            {
            	            // InternalPcodeParser.g:2350:6: ()
            	            // InternalPcodeParser.g:2351:7: 
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

            	    // InternalPcodeParser.g:2366:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalPcodeParser.g:2367:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalPcodeParser.g:2367:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalPcodeParser.g:2368:6: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop46;
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
    // InternalPcodeParser.g:2390:1: entryRulePlusOperator returns [String current=null] : iv_rulePlusOperator= rulePlusOperator EOF ;
    public final String entryRulePlusOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusOperator = null;


        try {
            // InternalPcodeParser.g:2390:52: (iv_rulePlusOperator= rulePlusOperator EOF )
            // InternalPcodeParser.g:2391:2: iv_rulePlusOperator= rulePlusOperator EOF
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
    // InternalPcodeParser.g:2397:1: rulePlusOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= Plus ) ;
    public final AntlrDatatypeRuleToken rulePlusOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2403:2: ( (kw= PlusSign | kw= Plus ) )
            // InternalPcodeParser.g:2404:2: (kw= PlusSign | kw= Plus )
            {
            // InternalPcodeParser.g:2404:2: (kw= PlusSign | kw= Plus )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==PlusSign) ) {
                alt47=1;
            }
            else if ( (LA47_0==Plus) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalPcodeParser.g:2405:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2411:3: kw= Plus
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
    // InternalPcodeParser.g:2420:1: entryRuleMinusOperator returns [String current=null] : iv_ruleMinusOperator= ruleMinusOperator EOF ;
    public final String entryRuleMinusOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinusOperator = null;


        try {
            // InternalPcodeParser.g:2420:53: (iv_ruleMinusOperator= ruleMinusOperator EOF )
            // InternalPcodeParser.g:2421:2: iv_ruleMinusOperator= ruleMinusOperator EOF
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
    // InternalPcodeParser.g:2427:1: ruleMinusOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= HyphenMinus | kw= Minus ) ;
    public final AntlrDatatypeRuleToken ruleMinusOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2433:2: ( (kw= HyphenMinus | kw= Minus ) )
            // InternalPcodeParser.g:2434:2: (kw= HyphenMinus | kw= Minus )
            {
            // InternalPcodeParser.g:2434:2: (kw= HyphenMinus | kw= Minus )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==HyphenMinus) ) {
                alt48=1;
            }
            else if ( (LA48_0==Minus) ) {
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
                    // InternalPcodeParser.g:2435:3: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMinusOperatorAccess().getHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2441:3: kw= Minus
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
    // InternalPcodeParser.g:2450:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalPcodeParser.g:2450:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalPcodeParser.g:2451:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalPcodeParser.g:2457:1: ruleMultiplication returns [EObject current=null] : (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_Prefixed_0 = null;

        AntlrDatatypeRuleToken lv_op_2_1 = null;

        AntlrDatatypeRuleToken lv_op_2_2 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2463:2: ( (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) )
            // InternalPcodeParser.g:2464:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            {
            // InternalPcodeParser.g:2464:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            // InternalPcodeParser.g:2465:3: this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_Prefixed_0=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Prefixed_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2473:3: ( ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==Divide||LA50_0==Modulo||LA50_0==Times||LA50_0==PercentSign||LA50_0==Asterisk||LA50_0==Solidus) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPcodeParser.g:2474:4: ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) ) ( (lv_right_3_0= rulePrefixed ) )
            	    {
            	    // InternalPcodeParser.g:2474:4: ( () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) ) )
            	    // InternalPcodeParser.g:2475:5: () ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) )
            	    {
            	    // InternalPcodeParser.g:2475:5: ()
            	    // InternalPcodeParser.g:2476:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2482:5: ( ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) ) )
            	    // InternalPcodeParser.g:2483:6: ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) )
            	    {
            	    // InternalPcodeParser.g:2483:6: ( (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator ) )
            	    // InternalPcodeParser.g:2484:7: (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator )
            	    {
            	    // InternalPcodeParser.g:2484:7: (lv_op_2_1= ruleTimesOperator | lv_op_2_2= ruleDivideOperator )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==Times||LA49_0==Asterisk) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==Divide||LA49_0==Modulo||LA49_0==PercentSign||LA49_0==Solidus) ) {
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
            	            // InternalPcodeParser.g:2485:8: lv_op_2_1= ruleTimesOperator
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
            	            // InternalPcodeParser.g:2501:8: lv_op_2_2= ruleDivideOperator
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

            	    // InternalPcodeParser.g:2520:4: ( (lv_right_3_0= rulePrefixed ) )
            	    // InternalPcodeParser.g:2521:5: (lv_right_3_0= rulePrefixed )
            	    {
            	    // InternalPcodeParser.g:2521:5: (lv_right_3_0= rulePrefixed )
            	    // InternalPcodeParser.g:2522:6: lv_right_3_0= rulePrefixed
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop50;
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
    // InternalPcodeParser.g:2544:1: entryRuleTimesOperator returns [String current=null] : iv_ruleTimesOperator= ruleTimesOperator EOF ;
    public final String entryRuleTimesOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimesOperator = null;


        try {
            // InternalPcodeParser.g:2544:53: (iv_ruleTimesOperator= ruleTimesOperator EOF )
            // InternalPcodeParser.g:2545:2: iv_ruleTimesOperator= ruleTimesOperator EOF
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
    // InternalPcodeParser.g:2551:1: ruleTimesOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Asterisk | kw= Times ) ;
    public final AntlrDatatypeRuleToken ruleTimesOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2557:2: ( (kw= Asterisk | kw= Times ) )
            // InternalPcodeParser.g:2558:2: (kw= Asterisk | kw= Times )
            {
            // InternalPcodeParser.g:2558:2: (kw= Asterisk | kw= Times )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Asterisk) ) {
                alt51=1;
            }
            else if ( (LA51_0==Times) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalPcodeParser.g:2559:3: kw= Asterisk
                    {
                    kw=(Token)match(input,Asterisk,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTimesOperatorAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2565:3: kw= Times
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
    // InternalPcodeParser.g:2574:1: entryRuleDivideOperator returns [String current=null] : iv_ruleDivideOperator= ruleDivideOperator EOF ;
    public final String entryRuleDivideOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDivideOperator = null;


        try {
            // InternalPcodeParser.g:2574:54: (iv_ruleDivideOperator= ruleDivideOperator EOF )
            // InternalPcodeParser.g:2575:2: iv_ruleDivideOperator= ruleDivideOperator EOF
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
    // InternalPcodeParser.g:2581:1: ruleDivideOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Solidus | kw= Divide | kw= PercentSign | kw= Modulo ) ;
    public final AntlrDatatypeRuleToken ruleDivideOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2587:2: ( (kw= Solidus | kw= Divide | kw= PercentSign | kw= Modulo ) )
            // InternalPcodeParser.g:2588:2: (kw= Solidus | kw= Divide | kw= PercentSign | kw= Modulo )
            {
            // InternalPcodeParser.g:2588:2: (kw= Solidus | kw= Divide | kw= PercentSign | kw= Modulo )
            int alt52=4;
            switch ( input.LA(1) ) {
            case Solidus:
                {
                alt52=1;
                }
                break;
            case Divide:
                {
                alt52=2;
                }
                break;
            case PercentSign:
                {
                alt52=3;
                }
                break;
            case Modulo:
                {
                alt52=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalPcodeParser.g:2589:3: kw= Solidus
                    {
                    kw=(Token)match(input,Solidus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDivideOperatorAccess().getSolidusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2595:3: kw= Divide
                    {
                    kw=(Token)match(input,Divide,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDivideOperatorAccess().getDivideKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:2601:3: kw= PercentSign
                    {
                    kw=(Token)match(input,PercentSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDivideOperatorAccess().getPercentSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:2607:3: kw= Modulo
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
    // InternalPcodeParser.g:2616:1: entryRulePrefixed returns [EObject current=null] : iv_rulePrefixed= rulePrefixed EOF ;
    public final EObject entryRulePrefixed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixed = null;


        try {
            // InternalPcodeParser.g:2616:49: (iv_rulePrefixed= rulePrefixed EOF )
            // InternalPcodeParser.g:2617:2: iv_rulePrefixed= rulePrefixed EOF
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
    // InternalPcodeParser.g:2623:1: rulePrefixed returns [EObject current=null] : ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrefixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2629:2: ( ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalPcodeParser.g:2630:2: ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalPcodeParser.g:2630:2: ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
            int alt53=3;
            switch ( input.LA(1) ) {
            case ExclamationMark:
                {
                alt53=1;
                }
                break;
            case Minus:
            case HyphenMinus:
                {
                alt53=2;
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
                alt53=3;
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
                    // InternalPcodeParser.g:2631:3: ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    {
                    // InternalPcodeParser.g:2631:3: ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    // InternalPcodeParser.g:2632:4: () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) )
                    {
                    // InternalPcodeParser.g:2632:4: ()
                    // InternalPcodeParser.g:2633:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedAccess().getBooleanNegationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2639:4: ( ( ExclamationMark )=>otherlv_1= ExclamationMark )
                    // InternalPcodeParser.g:2640:5: ( ExclamationMark )=>otherlv_1= ExclamationMark
                    {
                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getPrefixedAccess().getExclamationMarkKeyword_0_1());
                      				
                    }

                    }

                    // InternalPcodeParser.g:2646:4: ( (lv_expression_2_0= ruleAtomic ) )
                    // InternalPcodeParser.g:2647:5: (lv_expression_2_0= ruleAtomic )
                    {
                    // InternalPcodeParser.g:2647:5: (lv_expression_2_0= ruleAtomic )
                    // InternalPcodeParser.g:2648:6: lv_expression_2_0= ruleAtomic
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
                    // InternalPcodeParser.g:2667:3: ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    {
                    // InternalPcodeParser.g:2667:3: ( () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    // InternalPcodeParser.g:2668:4: () ( ( ruleMinusOperator )=> ruleMinusOperator ) ( (lv_expression_5_0= ruleAtomic ) )
                    {
                    // InternalPcodeParser.g:2668:4: ()
                    // InternalPcodeParser.g:2669:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedAccess().getArithmeticSignedAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2675:4: ( ( ruleMinusOperator )=> ruleMinusOperator )
                    // InternalPcodeParser.g:2676:5: ( ruleMinusOperator )=> ruleMinusOperator
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

                    // InternalPcodeParser.g:2685:4: ( (lv_expression_5_0= ruleAtomic ) )
                    // InternalPcodeParser.g:2686:5: (lv_expression_5_0= ruleAtomic )
                    {
                    // InternalPcodeParser.g:2686:5: (lv_expression_5_0= ruleAtomic )
                    // InternalPcodeParser.g:2687:6: lv_expression_5_0= ruleAtomic
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
                    // InternalPcodeParser.g:2706:3: this_Atomic_6= ruleAtomic
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
    // InternalPcodeParser.g:2718:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalPcodeParser.g:2718:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalPcodeParser.g:2719:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalPcodeParser.g:2725:1: ruleAtomic returns [EObject current=null] : ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression ) ;
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
            // InternalPcodeParser.g:2731:2: ( ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression ) )
            // InternalPcodeParser.g:2732:2: ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression )
            {
            // InternalPcodeParser.g:2732:2: ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression )
            int alt55=8;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalPcodeParser.g:2733:3: ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis )
                    {
                    // InternalPcodeParser.g:2733:3: ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis )
                    // InternalPcodeParser.g:2734:4: () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis
                    {
                    // InternalPcodeParser.g:2734:4: ()
                    // InternalPcodeParser.g:2735:5: 
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
                    // InternalPcodeParser.g:2745:4: ( (lv_expression_2_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:2746:5: (lv_expression_2_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:2746:5: (lv_expression_2_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:2747:6: lv_expression_2_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getExpressionLiteralExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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
                    // InternalPcodeParser.g:2770:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalPcodeParser.g:2770:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalPcodeParser.g:2771:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalPcodeParser.g:2771:4: ()
                    // InternalPcodeParser.g:2772:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2778:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalPcodeParser.g:2779:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalPcodeParser.g:2779:5: (lv_value_5_0= RULE_INT )
                    // InternalPcodeParser.g:2780:6: lv_value_5_0= RULE_INT
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
                    // InternalPcodeParser.g:2798:3: ( () ( (lv_value_7_0= RULE_DOUBLE ) ) )
                    {
                    // InternalPcodeParser.g:2798:3: ( () ( (lv_value_7_0= RULE_DOUBLE ) ) )
                    // InternalPcodeParser.g:2799:4: () ( (lv_value_7_0= RULE_DOUBLE ) )
                    {
                    // InternalPcodeParser.g:2799:4: ()
                    // InternalPcodeParser.g:2800:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDoubleLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2806:4: ( (lv_value_7_0= RULE_DOUBLE ) )
                    // InternalPcodeParser.g:2807:5: (lv_value_7_0= RULE_DOUBLE )
                    {
                    // InternalPcodeParser.g:2807:5: (lv_value_7_0= RULE_DOUBLE )
                    // InternalPcodeParser.g:2808:6: lv_value_7_0= RULE_DOUBLE
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
                    // InternalPcodeParser.g:2826:3: ( () ( (lv_value_9_0= RULE_STRING ) ) )
                    {
                    // InternalPcodeParser.g:2826:3: ( () ( (lv_value_9_0= RULE_STRING ) ) )
                    // InternalPcodeParser.g:2827:4: () ( (lv_value_9_0= RULE_STRING ) )
                    {
                    // InternalPcodeParser.g:2827:4: ()
                    // InternalPcodeParser.g:2828:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2834:4: ( (lv_value_9_0= RULE_STRING ) )
                    // InternalPcodeParser.g:2835:5: (lv_value_9_0= RULE_STRING )
                    {
                    // InternalPcodeParser.g:2835:5: (lv_value_9_0= RULE_STRING )
                    // InternalPcodeParser.g:2836:6: lv_value_9_0= RULE_STRING
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
                    // InternalPcodeParser.g:2854:3: ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) )
                    {
                    // InternalPcodeParser.g:2854:3: ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) )
                    // InternalPcodeParser.g:2855:4: () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) )
                    {
                    // InternalPcodeParser.g:2855:4: ()
                    // InternalPcodeParser.g:2856:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBooleanLiteralAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2862:4: ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) )
                    // InternalPcodeParser.g:2863:5: ( (lv_value_11_1= True | lv_value_11_2= False ) )
                    {
                    // InternalPcodeParser.g:2863:5: ( (lv_value_11_1= True | lv_value_11_2= False ) )
                    // InternalPcodeParser.g:2864:6: (lv_value_11_1= True | lv_value_11_2= False )
                    {
                    // InternalPcodeParser.g:2864:6: (lv_value_11_1= True | lv_value_11_2= False )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==True) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==False) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalPcodeParser.g:2865:7: lv_value_11_1= True
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
                            // InternalPcodeParser.g:2876:7: lv_value_11_2= False
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
                    // InternalPcodeParser.g:2891:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalPcodeParser.g:2891:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalPcodeParser.g:2892:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalPcodeParser.g:2892:4: ()
                    // InternalPcodeParser.g:2893:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableReferenceAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2899:4: ( (otherlv_13= RULE_ID ) )
                    // InternalPcodeParser.g:2900:5: (otherlv_13= RULE_ID )
                    {
                    // InternalPcodeParser.g:2900:5: (otherlv_13= RULE_ID )
                    // InternalPcodeParser.g:2901:6: otherlv_13= RULE_ID
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
                    // InternalPcodeParser.g:2914:3: this_FunctionCall_14= ruleFunctionCall
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
                    // InternalPcodeParser.g:2923:3: this_SizeExpression_15= ruleSizeExpression
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
    // InternalPcodeParser.g:2935:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalPcodeParser.g:2935:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalPcodeParser.g:2936:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalPcodeParser.g:2942:1: ruleFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis ) ;
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
            // InternalPcodeParser.g:2948:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis ) )
            // InternalPcodeParser.g:2949:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis )
            {
            // InternalPcodeParser.g:2949:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis )
            // InternalPcodeParser.g:2950:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )? otherlv_6= RightParenthesis
            {
            // InternalPcodeParser.g:2950:3: ()
            // InternalPcodeParser.g:2951:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:2957:3: ( (otherlv_1= RULE_ID ) )
            // InternalPcodeParser.g:2958:4: (otherlv_1= RULE_ID )
            {
            // InternalPcodeParser.g:2958:4: (otherlv_1= RULE_ID )
            // InternalPcodeParser.g:2959:5: otherlv_1= RULE_ID
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

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPcodeParser.g:2974:3: ( ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==False||LA57_0==Minus||LA57_0==Size||LA57_0==True||LA57_0==New||LA57_0==ExclamationMark||LA57_0==LeftParenthesis||LA57_0==HyphenMinus||LA57_0==LeftSquareBracket||LA57_0==LeftCurlyBracket||(LA57_0>=RULE_INT && LA57_0<=RULE_STRING)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalPcodeParser.g:2975:4: ( (lv_arguments_3_0= ruleLiteralExpression ) ) (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )*
                    {
                    // InternalPcodeParser.g:2975:4: ( (lv_arguments_3_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:2976:5: (lv_arguments_3_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:2976:5: (lv_arguments_3_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:2977:6: lv_arguments_3_0= ruleLiteralExpression
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

                    // InternalPcodeParser.g:2994:4: (otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==Comma) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalPcodeParser.g:2995:5: otherlv_4= Comma ( (lv_arguments_5_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalPcodeParser.g:2999:5: ( (lv_arguments_5_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:3000:6: (lv_arguments_5_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:3000:6: (lv_arguments_5_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:3001:7: lv_arguments_5_0= ruleLiteralExpression
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
                    	    break loop56;
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
    // InternalPcodeParser.g:3028:1: entryRuleSizeExpression returns [EObject current=null] : iv_ruleSizeExpression= ruleSizeExpression EOF ;
    public final EObject entryRuleSizeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeExpression = null;


        try {
            // InternalPcodeParser.g:3028:55: (iv_ruleSizeExpression= ruleSizeExpression EOF )
            // InternalPcodeParser.g:3029:2: iv_ruleSizeExpression= ruleSizeExpression EOF
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
    // InternalPcodeParser.g:3035:1: ruleSizeExpression returns [EObject current=null] : ( () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) ) ) ;
    public final EObject ruleSizeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:3041:2: ( ( () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) ) ) )
            // InternalPcodeParser.g:3042:2: ( () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) ) )
            {
            // InternalPcodeParser.g:3042:2: ( () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) ) )
            // InternalPcodeParser.g:3043:3: () otherlv_1= Size otherlv_2= Of ( (lv_value_3_0= ruleAtomic ) )
            {
            // InternalPcodeParser.g:3043:3: ()
            // InternalPcodeParser.g:3044:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSizeExpressionAccess().getSizeExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Size,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSizeExpressionAccess().getSizeKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Of,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSizeExpressionAccess().getOfKeyword_2());
              		
            }
            // InternalPcodeParser.g:3058:3: ( (lv_value_3_0= ruleAtomic ) )
            // InternalPcodeParser.g:3059:4: (lv_value_3_0= ruleAtomic )
            {
            // InternalPcodeParser.g:3059:4: (lv_value_3_0= ruleAtomic )
            // InternalPcodeParser.g:3060:5: lv_value_3_0= ruleAtomic
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
    // InternalPcodeParser.g:3081:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalPcodeParser.g:3081:45: (iv_ruleType= ruleType EOF )
            // InternalPcodeParser.g:3082:2: iv_ruleType= ruleType EOF
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
    // InternalPcodeParser.g:3088:1: ruleType returns [EObject current=null] : ( () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_types_1_0 = null;

        AntlrDatatypeRuleToken lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:3094:2: ( ( () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* ) ) )
            // InternalPcodeParser.g:3095:2: ( () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* ) )
            {
            // InternalPcodeParser.g:3095:2: ( () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* ) )
            // InternalPcodeParser.g:3096:3: () ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* )
            {
            // InternalPcodeParser.g:3096:3: ()
            // InternalPcodeParser.g:3097:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTypeAccess().getTypeAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:3103:3: ( ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )* )
            // InternalPcodeParser.g:3104:4: ( (lv_types_1_0= ruleTypeLiteral ) ) (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )*
            {
            // InternalPcodeParser.g:3104:4: ( (lv_types_1_0= ruleTypeLiteral ) )
            // InternalPcodeParser.g:3105:5: (lv_types_1_0= ruleTypeLiteral )
            {
            // InternalPcodeParser.g:3105:5: (lv_types_1_0= ruleTypeLiteral )
            // InternalPcodeParser.g:3106:6: lv_types_1_0= ruleTypeLiteral
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getTypeAccess().getTypesTypeLiteralParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_43);
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

            // InternalPcodeParser.g:3123:4: (otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==With) ) {
                    int LA58_2 = input.LA(2);

                    if ( (LA58_2==Decimal||LA58_2==Number||LA58_2==Array_1||LA58_2==Table_1||LA58_2==Text||LA58_2==List_1) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // InternalPcodeParser.g:3124:5: otherlv_2= With ( (lv_types_3_0= ruleTypeLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,With,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getWithKeyword_1_1_0());
            	      				
            	    }
            	    // InternalPcodeParser.g:3128:5: ( (lv_types_3_0= ruleTypeLiteral ) )
            	    // InternalPcodeParser.g:3129:6: (lv_types_3_0= ruleTypeLiteral )
            	    {
            	    // InternalPcodeParser.g:3129:6: (lv_types_3_0= ruleTypeLiteral )
            	    // InternalPcodeParser.g:3130:7: lv_types_3_0= ruleTypeLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getTypeAccess().getTypesTypeLiteralParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_43);
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
            	    break loop58;
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
    // InternalPcodeParser.g:3153:1: entryRuleTypeLiteral returns [String current=null] : iv_ruleTypeLiteral= ruleTypeLiteral EOF ;
    public final String entryRuleTypeLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLiteral = null;


        try {
            // InternalPcodeParser.g:3153:51: (iv_ruleTypeLiteral= ruleTypeLiteral EOF )
            // InternalPcodeParser.g:3154:2: iv_ruleTypeLiteral= ruleTypeLiteral EOF
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
    // InternalPcodeParser.g:3160:1: ruleTypeLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Text | kw= Number | kw= Decimal | kw= Array_1 | kw= List_1 | kw= Table_1 ) ;
    public final AntlrDatatypeRuleToken ruleTypeLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:3166:2: ( (kw= Text | kw= Number | kw= Decimal | kw= Array_1 | kw= List_1 | kw= Table_1 ) )
            // InternalPcodeParser.g:3167:2: (kw= Text | kw= Number | kw= Decimal | kw= Array_1 | kw= List_1 | kw= Table_1 )
            {
            // InternalPcodeParser.g:3167:2: (kw= Text | kw= Number | kw= Decimal | kw= Array_1 | kw= List_1 | kw= Table_1 )
            int alt59=6;
            switch ( input.LA(1) ) {
            case Text:
                {
                alt59=1;
                }
                break;
            case Number:
                {
                alt59=2;
                }
                break;
            case Decimal:
                {
                alt59=3;
                }
                break;
            case Array_1:
                {
                alt59=4;
                }
                break;
            case List_1:
                {
                alt59=5;
                }
                break;
            case Table_1:
                {
                alt59=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalPcodeParser.g:3168:3: kw= Text
                    {
                    kw=(Token)match(input,Text,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getTextKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:3174:3: kw= Number
                    {
                    kw=(Token)match(input,Number,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getNumberKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:3180:3: kw= Decimal
                    {
                    kw=(Token)match(input,Decimal,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getDecimalKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:3186:3: kw= Array_1
                    {
                    kw=(Token)match(input,Array_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getArrayKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPcodeParser.g:3192:3: kw= List_1
                    {
                    kw=(Token)match(input,List_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeLiteralAccess().getListKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalPcodeParser.g:3198:3: kw= Table_1
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


    protected DFA55 dfa55 = new DFA55(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\1\10\3\uffff";
    static final String dfa_3s = "\1\25\5\uffff\1\4\3\uffff";
    static final String dfa_4s = "\1\124\5\uffff\1\123\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\6\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\13\uffff\1\7\3\uffff\1\5\30\uffff\1\1\22\uffff\1\2\1\3\1\6\1\4",
            "",
            "",
            "",
            "",
            "",
            "\1\10\2\uffff\2\10\1\uffff\1\10\3\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\2\uffff\2\10\1\uffff\2\10\4\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff\1\10\5\uffff\3\10\1\uffff\1\10\2\uffff\2\10\2\uffff\2\10\1\11\5\10\1\uffff\2\10\1\uffff\1\10\1\uffff\1\10\2\uffff\4\10\2\uffff\1\10",
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

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2732:2: ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_9_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_11_1= True | lv_value_11_2= False ) ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | this_FunctionCall_14= ruleFunctionCall | this_SizeExpression_15= ruleSizeExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L,0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8000000092082800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000092082800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0020020409140180L,0x0000000000090000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0041400000008000L,0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x4800042200A00000L,0x00000000001E1208L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4800042200A00200L,0x00000000001E1208L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4800042240A00000L,0x00000000001E1208L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000082080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000404L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4800042200E00000L,0x00000000001E1208L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2100010000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000412L,0x0000000000000140L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000E080000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100800002L,0x000000000000000AL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000004014002L,0x0000000000000021L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xC800042200A00000L,0x00000000001E1208L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000002L});

}