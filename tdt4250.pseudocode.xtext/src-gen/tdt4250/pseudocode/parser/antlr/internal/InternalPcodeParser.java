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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Contains", "Continue", "Exchange", "Interval", "Decimal_1", "Equals", "Number_1", "Remove", "Return", "Array_1", "Break", "False", "Index", "Minus", "Print", "Table_1", "While", "Else", "List_1", "Plus", "Stop", "Text_1", "Then", "True", "With", "Add", "And", "For", "New", "ExclamationMarkEqualsSign", "AmpersandAmpersand", "PlusSignPlusSign", "PlusSignEqualsSign", "HyphenMinusHyphenMinus", "HyphenMinusEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "At", "If", "Is", "To", "VerticalLineVerticalLine", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "A", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Add=29;
    public static final int HyphenMinusHyphenMinus=37;
    public static final int New=32;
    public static final int RULE_BEGIN=64;
    public static final int Stop=24;
    public static final int Break=14;
    public static final int True=27;
    public static final int Index=16;
    public static final int Remove=11;
    public static final int False=15;
    public static final int LessThanSign=55;
    public static final int Print=18;
    public static final int LeftParenthesis=48;
    public static final int Then=26;
    public static final int To=45;
    public static final int Plus=23;
    public static final int RightSquareBracket=59;
    public static final int ExclamationMark=47;
    public static final int Text_1=25;
    public static final int GreaterThanSign=57;
    public static final int RULE_ID=68;
    public static final int For=31;
    public static final int RightParenthesis=49;
    public static final int GreaterThanSignEqualsSign=41;
    public static final int Exchange=6;
    public static final int EqualsSignEqualsSign=40;
    public static final int Number_1=10;
    public static final int And=30;
    public static final int PlusSign=51;
    public static final int RULE_INT=66;
    public static final int Contains=4;
    public static final int RULE_ML_COMMENT=70;
    public static final int LeftSquareBracket=58;
    public static final int If=43;
    public static final int Minus=17;
    public static final int Interval=7;
    public static final int A=61;
    public static final int RULE_END=65;
    public static final int Decimal_1=8;
    public static final int VerticalLineVerticalLine=46;
    public static final int Table_1=19;
    public static final int Is=44;
    public static final int RULE_STRING=69;
    public static final int Continue=5;
    public static final int With=28;
    public static final int RULE_SL_COMMENT=71;
    public static final int Comma=52;
    public static final int EqualsSign=56;
    public static final int HyphenMinus=53;
    public static final int At=42;
    public static final int AmpersandAmpersand=34;
    public static final int RULE_DOUBLE=67;
    public static final int Array_1=13;
    public static final int HyphenMinusEqualsSign=38;
    public static final int LessThanSignEqualsSign=39;
    public static final int Solidus=54;
    public static final int RightCurlyBracket=63;
    public static final int EOF=-1;
    public static final int List_1=22;
    public static final int Asterisk=50;
    public static final int PlusSignEqualsSign=36;
    public static final int Return=12;
    public static final int RULE_WS=72;
    public static final int LeftCurlyBracket=62;
    public static final int While=20;
    public static final int RULE_ANY_OTHER=73;
    public static final int CircumflexAccent=60;
    public static final int Equals=9;
    public static final int PlusSignPlusSign=35;
    public static final int Else=21;
    public static final int ExclamationMarkEqualsSign=33;

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
    // InternalPcodeParser.g:64:1: ruleModel returns [EObject current=null] : ( () ( (lv_functions_1_0= ruleFunction ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:70:2: ( ( () ( (lv_functions_1_0= ruleFunction ) )* ) )
            // InternalPcodeParser.g:71:2: ( () ( (lv_functions_1_0= ruleFunction ) )* )
            {
            // InternalPcodeParser.g:71:2: ( () ( (lv_functions_1_0= ruleFunction ) )* )
            // InternalPcodeParser.g:72:3: () ( (lv_functions_1_0= ruleFunction ) )*
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

            // InternalPcodeParser.g:79:3: ( (lv_functions_1_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPcodeParser.g:80:4: (lv_functions_1_0= ruleFunction )
            	    {
            	    // InternalPcodeParser.g:80:4: (lv_functions_1_0= ruleFunction )
            	    // InternalPcodeParser.g:81:5: lv_functions_1_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_functions_1_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"functions",
            	      						lv_functions_1_0,
            	      						"tdt4250.pseudocode.Pcode.Function");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleIdentifier"
    // InternalPcodeParser.g:102:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalPcodeParser.g:102:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalPcodeParser.g:103:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalPcodeParser.g:109:1: ruleIdentifier returns [EObject current=null] : (this_Function_0= ruleFunction | this_TypeLiteral_1= ruleTypeLiteral ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_TypeLiteral_1 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:115:2: ( (this_Function_0= ruleFunction | this_TypeLiteral_1= ruleTypeLiteral ) )
            // InternalPcodeParser.g:116:2: (this_Function_0= ruleFunction | this_TypeLiteral_1= ruleTypeLiteral )
            {
            // InternalPcodeParser.g:116:2: (this_Function_0= ruleFunction | this_TypeLiteral_1= ruleTypeLiteral )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                alt2=1;
            }
            else if ( (LA2_0==Decimal_1||LA2_0==Number_1||LA2_0==Array_1||LA2_0==Table_1||LA2_0==List_1||LA2_0==Text_1) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPcodeParser.g:117:3: this_Function_0= ruleFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIdentifierAccess().getFunctionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Function_0=ruleFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Function_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:126:3: this_TypeLiteral_1= ruleTypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIdentifierAccess().getTypeLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeLiteral_1=ruleTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteral_1;
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleFunction"
    // InternalPcodeParser.g:138:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalPcodeParser.g:138:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalPcodeParser.g:139:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalPcodeParser.g:145:1: ruleFunction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )* otherlv_6= RightParenthesis this_BEGIN_7= RULE_BEGIN ( (lv_features_8_0= ruleFeature ) )* this_END_9= RULE_END ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_features_8_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:151:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )* otherlv_6= RightParenthesis this_BEGIN_7= RULE_BEGIN ( (lv_features_8_0= ruleFeature ) )* this_END_9= RULE_END ) )
            // InternalPcodeParser.g:152:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )* otherlv_6= RightParenthesis this_BEGIN_7= RULE_BEGIN ( (lv_features_8_0= ruleFeature ) )* this_END_9= RULE_END )
            {
            // InternalPcodeParser.g:152:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )* otherlv_6= RightParenthesis this_BEGIN_7= RULE_BEGIN ( (lv_features_8_0= ruleFeature ) )* this_END_9= RULE_END )
            // InternalPcodeParser.g:153:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )* otherlv_6= RightParenthesis this_BEGIN_7= RULE_BEGIN ( (lv_features_8_0= ruleFeature ) )* this_END_9= RULE_END
            {
            // InternalPcodeParser.g:153:3: ()
            // InternalPcodeParser.g:154:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionAccess().getFunctionAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:160:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPcodeParser.g:161:4: (lv_name_1_0= ruleEString )
            {
            // InternalPcodeParser.g:161:4: (lv_name_1_0= ruleEString )
            // InternalPcodeParser.g:162:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"tdt4250.pseudocode.Pcode.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPcodeParser.g:183:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Decimal_1||LA4_0==Number_1||LA4_0==Array_1||LA4_0==Table_1||LA4_0==List_1||LA4_0==Text_1||(LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPcodeParser.g:184:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )*
            	    {
            	    // InternalPcodeParser.g:184:4: ( (lv_parameters_3_0= ruleParameter ) )
            	    // InternalPcodeParser.g:185:5: (lv_parameters_3_0= ruleParameter )
            	    {
            	    // InternalPcodeParser.g:185:5: (lv_parameters_3_0= ruleParameter )
            	    // InternalPcodeParser.g:186:6: lv_parameters_3_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_parameters_3_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFunctionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_3_0,
            	      							"tdt4250.pseudocode.Pcode.Parameter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalPcodeParser.g:203:4: (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==Comma) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalPcodeParser.g:204:5: otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
            	    	      				
            	    	    }
            	    	    // InternalPcodeParser.g:208:5: ( (lv_parameters_5_0= ruleParameter ) )
            	    	    // InternalPcodeParser.g:209:6: (lv_parameters_5_0= ruleParameter )
            	    	    {
            	    	    // InternalPcodeParser.g:209:6: (lv_parameters_5_0= ruleParameter )
            	    	    // InternalPcodeParser.g:210:7: lv_parameters_5_0= ruleParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_3_1_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_parameters_5_0=ruleParameter();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"parameters",
            	    	      								lv_parameters_5_0,
            	    	      								"tdt4250.pseudocode.Pcode.Parameter");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
              		
            }
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_7, grammarAccess.getFunctionAccess().getBEGINTerminalRuleCall_5());
              		
            }
            // InternalPcodeParser.g:237:3: ( (lv_features_8_0= ruleFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=Continue && LA5_0<=Exchange)||LA5_0==Return||LA5_0==Break||LA5_0==Print||LA5_0==While||LA5_0==Stop||LA5_0==For||LA5_0==If||LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPcodeParser.g:238:4: (lv_features_8_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:238:4: (lv_features_8_0= ruleFeature )
            	    // InternalPcodeParser.g:239:5: lv_features_8_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFunctionAccess().getFeaturesFeatureParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_features_8_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"features",
            	      						lv_features_8_0,
            	      						"tdt4250.pseudocode.Pcode.Feature");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_9, grammarAccess.getFunctionAccess().getENDTerminalRuleCall_7());
              		
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFeature"
    // InternalPcodeParser.g:264:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalPcodeParser.g:264:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalPcodeParser.g:265:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalPcodeParser.g:271:1: ruleFeature returns [EObject current=null] : (this_Statement_0= ruleStatement | this_Expression_1= ruleExpression ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_0 = null;

        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:277:2: ( (this_Statement_0= ruleStatement | this_Expression_1= ruleExpression ) )
            // InternalPcodeParser.g:278:2: (this_Statement_0= ruleStatement | this_Expression_1= ruleExpression )
            {
            // InternalPcodeParser.g:278:2: (this_Statement_0= ruleStatement | this_Expression_1= ruleExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Continue||LA6_0==Return||LA6_0==Break||LA6_0==While||LA6_0==Stop||LA6_0==For||LA6_0==If) ) {
                alt6=1;
            }
            else if ( (LA6_0==Exchange||LA6_0==Print||LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPcodeParser.g:279:3: this_Statement_0= ruleStatement
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
                    // InternalPcodeParser.g:288:3: this_Expression_1= ruleExpression
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
    // InternalPcodeParser.g:300:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalPcodeParser.g:300:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalPcodeParser.g:301:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalPcodeParser.g:307:1: ruleStatement returns [EObject current=null] : (this_IfExpression_0= ruleIfExpression | this_ForExpression_1= ruleForExpression | this_WhileExpression_2= ruleWhileExpression | this_Stop_3= ruleStop ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfExpression_0 = null;

        EObject this_ForExpression_1 = null;

        EObject this_WhileExpression_2 = null;

        EObject this_Stop_3 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:313:2: ( (this_IfExpression_0= ruleIfExpression | this_ForExpression_1= ruleForExpression | this_WhileExpression_2= ruleWhileExpression | this_Stop_3= ruleStop ) )
            // InternalPcodeParser.g:314:2: (this_IfExpression_0= ruleIfExpression | this_ForExpression_1= ruleForExpression | this_WhileExpression_2= ruleWhileExpression | this_Stop_3= ruleStop )
            {
            // InternalPcodeParser.g:314:2: (this_IfExpression_0= ruleIfExpression | this_ForExpression_1= ruleForExpression | this_WhileExpression_2= ruleWhileExpression | this_Stop_3= ruleStop )
            int alt7=4;
            switch ( input.LA(1) ) {
            case If:
                {
                alt7=1;
                }
                break;
            case For:
                {
                alt7=2;
                }
                break;
            case While:
                {
                alt7=3;
                }
                break;
            case Continue:
            case Return:
            case Break:
            case Stop:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPcodeParser.g:315:3: this_IfExpression_0= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfExpression_0=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:324:3: this_ForExpression_1= ruleForExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForExpression_1=ruleForExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:333:3: this_WhileExpression_2= ruleWhileExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileExpression_2=ruleWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:342:3: this_Stop_3= ruleStop
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
    // InternalPcodeParser.g:354:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPcodeParser.g:354:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPcodeParser.g:355:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalPcodeParser.g:361:1: ruleExpression returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Print_1= rulePrint | this_CollectionAdd_2= ruleCollectionAdd | this_CollectionRemove_3= ruleCollectionRemove | this_ValueExchange_4= ruleValueExchange ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Print_1 = null;

        EObject this_CollectionAdd_2 = null;

        EObject this_CollectionRemove_3 = null;

        EObject this_ValueExchange_4 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:367:2: ( (this_Variable_0= ruleVariable | this_Print_1= rulePrint | this_CollectionAdd_2= ruleCollectionAdd | this_CollectionRemove_3= ruleCollectionRemove | this_ValueExchange_4= ruleValueExchange ) )
            // InternalPcodeParser.g:368:2: (this_Variable_0= ruleVariable | this_Print_1= rulePrint | this_CollectionAdd_2= ruleCollectionAdd | this_CollectionRemove_3= ruleCollectionRemove | this_ValueExchange_4= ruleValueExchange )
            {
            // InternalPcodeParser.g:368:2: (this_Variable_0= ruleVariable | this_Print_1= rulePrint | this_CollectionAdd_2= ruleCollectionAdd | this_CollectionRemove_3= ruleCollectionRemove | this_ValueExchange_4= ruleValueExchange )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case Remove:
                    {
                    alt8=4;
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
                    alt8=1;
                    }
                    break;
                case Add:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

                }
                break;
            case Print:
                {
                alt8=2;
                }
                break;
            case Exchange:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPcodeParser.g:369:3: this_Variable_0= ruleVariable
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
                    // InternalPcodeParser.g:378:3: this_Print_1= rulePrint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getPrintParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Print_1=rulePrint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Print_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:387:3: this_CollectionAdd_2= ruleCollectionAdd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getCollectionAddParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionAdd_2=ruleCollectionAdd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionAdd_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:396:3: this_CollectionRemove_3= ruleCollectionRemove
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getCollectionRemoveParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionRemove_3=ruleCollectionRemove();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionRemove_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalPcodeParser.g:405:3: this_ValueExchange_4= ruleValueExchange
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getValueExchangeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ValueExchange_4=ruleValueExchange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValueExchange_4;
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
    // InternalPcodeParser.g:417:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPcodeParser.g:417:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPcodeParser.g:418:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalPcodeParser.g:424:1: ruleVariable returns [EObject current=null] : ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) ) ;
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
            // InternalPcodeParser.g:430:2: ( ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) ) )
            // InternalPcodeParser.g:431:2: ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) )
            {
            // InternalPcodeParser.g:431:2: ( () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) ) )
            // InternalPcodeParser.g:432:3: () ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) )
            {
            // InternalPcodeParser.g:432:3: ()
            // InternalPcodeParser.g:433:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVariableAccess().getVariableAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:439:3: ( ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==PlusSignPlusSign||LA11_1==HyphenMinusHyphenMinus) ) {
                    alt11=2;
                }
                else if ( (LA11_1==Equals||LA11_1==PlusSignEqualsSign||LA11_1==HyphenMinusEqualsSign||LA11_1==Is||LA11_1==EqualsSign) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPcodeParser.g:440:4: ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    {
                    // InternalPcodeParser.g:440:4: ( ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) ) )
                    // InternalPcodeParser.g:441:5: ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) ) ( (lv_value_3_0= ruleLiteralExpression ) )
                    {
                    // InternalPcodeParser.g:441:5: ( (lv_name_1_0= RULE_ID ) )
                    // InternalPcodeParser.g:442:6: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPcodeParser.g:442:6: (lv_name_1_0= RULE_ID )
                    // InternalPcodeParser.g:443:7: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

                    // InternalPcodeParser.g:459:5: ( ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) ) )
                    // InternalPcodeParser.g:460:6: ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) )
                    {
                    // InternalPcodeParser.g:460:6: ( (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign ) )
                    // InternalPcodeParser.g:461:7: (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign )
                    {
                    // InternalPcodeParser.g:461:7: (lv_op_2_1= EqualsSign | lv_op_2_2= Equals | lv_op_2_3= Is | lv_op_2_4= PlusSignEqualsSign | lv_op_2_5= HyphenMinusEqualsSign )
                    int alt9=5;
                    switch ( input.LA(1) ) {
                    case EqualsSign:
                        {
                        alt9=1;
                        }
                        break;
                    case Equals:
                        {
                        alt9=2;
                        }
                        break;
                    case Is:
                        {
                        alt9=3;
                        }
                        break;
                    case PlusSignEqualsSign:
                        {
                        alt9=4;
                        }
                        break;
                    case HyphenMinusEqualsSign:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalPcodeParser.g:462:8: lv_op_2_1= EqualsSign
                            {
                            lv_op_2_1=(Token)match(input,EqualsSign,FOLLOW_11); if (state.failed) return current;
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
                            // InternalPcodeParser.g:473:8: lv_op_2_2= Equals
                            {
                            lv_op_2_2=(Token)match(input,Equals,FOLLOW_11); if (state.failed) return current;
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
                            // InternalPcodeParser.g:484:8: lv_op_2_3= Is
                            {
                            lv_op_2_3=(Token)match(input,Is,FOLLOW_11); if (state.failed) return current;
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
                            // InternalPcodeParser.g:495:8: lv_op_2_4= PlusSignEqualsSign
                            {
                            lv_op_2_4=(Token)match(input,PlusSignEqualsSign,FOLLOW_11); if (state.failed) return current;
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
                            // InternalPcodeParser.g:506:8: lv_op_2_5= HyphenMinusEqualsSign
                            {
                            lv_op_2_5=(Token)match(input,HyphenMinusEqualsSign,FOLLOW_11); if (state.failed) return current;
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

                    // InternalPcodeParser.g:519:5: ( (lv_value_3_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:520:6: (lv_value_3_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:520:6: (lv_value_3_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:521:7: lv_value_3_0= ruleLiteralExpression
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
                    // InternalPcodeParser.g:540:4: ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) )
                    {
                    // InternalPcodeParser.g:540:4: ( ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) ) )
                    // InternalPcodeParser.g:541:5: ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) )
                    {
                    // InternalPcodeParser.g:541:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalPcodeParser.g:542:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalPcodeParser.g:542:6: (lv_name_4_0= RULE_ID )
                    // InternalPcodeParser.g:543:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

                    // InternalPcodeParser.g:559:5: ( ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) ) )
                    // InternalPcodeParser.g:560:6: ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) )
                    {
                    // InternalPcodeParser.g:560:6: ( (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus ) )
                    // InternalPcodeParser.g:561:7: (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus )
                    {
                    // InternalPcodeParser.g:561:7: (lv_op_5_1= PlusSignPlusSign | lv_op_5_2= HyphenMinusHyphenMinus )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==PlusSignPlusSign) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==HyphenMinusHyphenMinus) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPcodeParser.g:562:8: lv_op_5_1= PlusSignPlusSign
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
                            // InternalPcodeParser.g:573:8: lv_op_5_2= HyphenMinusHyphenMinus
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
    // InternalPcodeParser.g:592:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPcodeParser.g:592:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPcodeParser.g:593:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalPcodeParser.g:599:1: ruleParameter returns [EObject current=null] : ( () ( (lv_type_1_0= ruleIdentifier ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:605:2: ( ( () ( (lv_type_1_0= ruleIdentifier ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPcodeParser.g:606:2: ( () ( (lv_type_1_0= ruleIdentifier ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPcodeParser.g:606:2: ( () ( (lv_type_1_0= ruleIdentifier ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalPcodeParser.g:607:3: () ( (lv_type_1_0= ruleIdentifier ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalPcodeParser.g:607:3: ()
            // InternalPcodeParser.g:608:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterAccess().getVariableAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:614:3: ( (lv_type_1_0= ruleIdentifier ) )
            // InternalPcodeParser.g:615:4: (lv_type_1_0= ruleIdentifier )
            {
            // InternalPcodeParser.g:615:4: (lv_type_1_0= ruleIdentifier )
            // InternalPcodeParser.g:616:5: lv_type_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_type_1_0=ruleIdentifier();

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
              						"tdt4250.pseudocode.Pcode.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPcodeParser.g:633:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPcodeParser.g:634:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPcodeParser.g:634:4: (lv_name_2_0= RULE_ID )
            // InternalPcodeParser.g:635:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleIfExpression"
    // InternalPcodeParser.g:655:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalPcodeParser.g:655:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalPcodeParser.g:656:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalPcodeParser.g:662:1: ruleIfExpression returns [EObject current=null] : ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END ( ( ( Else )=>otherlv_7= Else ) this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
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
            // InternalPcodeParser.g:668:2: ( ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END ( ( ( Else )=>otherlv_7= Else ) this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? ) )
            // InternalPcodeParser.g:669:2: ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END ( ( ( Else )=>otherlv_7= Else ) this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? )
            {
            // InternalPcodeParser.g:669:2: ( () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END ( ( ( Else )=>otherlv_7= Else ) this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )? )
            // InternalPcodeParser.g:670:3: () ( (lv_name_1_0= If ) ) ( (lv_condition_2_0= ruleLiteralExpression ) ) (otherlv_3= Then )? this_BEGIN_4= RULE_BEGIN ( (lv_then_5_0= ruleFeature ) )* this_END_6= RULE_END ( ( ( Else )=>otherlv_7= Else ) this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )?
            {
            // InternalPcodeParser.g:670:3: ()
            // InternalPcodeParser.g:671:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfExpressionAccess().getIfExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:677:3: ( (lv_name_1_0= If ) )
            // InternalPcodeParser.g:678:4: (lv_name_1_0= If )
            {
            // InternalPcodeParser.g:678:4: (lv_name_1_0= If )
            // InternalPcodeParser.g:679:5: lv_name_1_0= If
            {
            lv_name_1_0=(Token)match(input,If,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getIfExpressionAccess().getNameIfKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIfExpressionRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_1_0, "if");
              				
            }

            }


            }

            // InternalPcodeParser.g:691:3: ( (lv_condition_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:692:4: (lv_condition_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:692:4: (lv_condition_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:693:5: lv_condition_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_condition_2_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
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

            // InternalPcodeParser.g:710:3: (otherlv_3= Then )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Then) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPcodeParser.g:711:4: otherlv_3= Then
                    {
                    otherlv_3=(Token)match(input,Then,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getThenKeyword_3());
                      			
                    }

                    }
                    break;

            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_4, grammarAccess.getIfExpressionAccess().getBEGINTerminalRuleCall_4());
              		
            }
            // InternalPcodeParser.g:720:3: ( (lv_then_5_0= ruleFeature ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=Continue && LA13_0<=Exchange)||LA13_0==Return||LA13_0==Break||LA13_0==Print||LA13_0==While||LA13_0==Stop||LA13_0==For||LA13_0==If||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPcodeParser.g:721:4: (lv_then_5_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:721:4: (lv_then_5_0= ruleFeature )
            	    // InternalPcodeParser.g:722:5: lv_then_5_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenFeatureParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_then_5_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
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
            	    break loop13;
                }
            } while (true);

            this_END_6=(Token)match(input,RULE_END,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_6, grammarAccess.getIfExpressionAccess().getENDTerminalRuleCall_6());
              		
            }
            // InternalPcodeParser.g:743:3: ( ( ( Else )=>otherlv_7= Else ) this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Else) && (synpred1_InternalPcodeParser())) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPcodeParser.g:744:4: ( ( Else )=>otherlv_7= Else ) this_BEGIN_8= RULE_BEGIN ( (lv_otherwise_9_0= ruleFeature ) )* this_END_10= RULE_END
                    {
                    // InternalPcodeParser.g:744:4: ( ( Else )=>otherlv_7= Else )
                    // InternalPcodeParser.g:745:5: ( Else )=>otherlv_7= Else
                    {
                    otherlv_7=(Token)match(input,Else,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getElseKeyword_7_0());
                      				
                    }

                    }

                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getIfExpressionAccess().getBEGINTerminalRuleCall_7_1());
                      			
                    }
                    // InternalPcodeParser.g:755:4: ( (lv_otherwise_9_0= ruleFeature ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=Continue && LA14_0<=Exchange)||LA14_0==Return||LA14_0==Break||LA14_0==Print||LA14_0==While||LA14_0==Stop||LA14_0==For||LA14_0==If||LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalPcodeParser.g:756:5: (lv_otherwise_9_0= ruleFeature )
                    	    {
                    	    // InternalPcodeParser.g:756:5: (lv_otherwise_9_0= ruleFeature )
                    	    // InternalPcodeParser.g:757:6: lv_otherwise_9_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfExpressionAccess().getOtherwiseFeatureParserRuleCall_7_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_otherwise_9_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIfExpressionRule());
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
                    	    break loop14;
                        }
                    } while (true);

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_10, grammarAccess.getIfExpressionAccess().getENDTerminalRuleCall_7_3());
                      			
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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleForExpression"
    // InternalPcodeParser.g:783:1: entryRuleForExpression returns [EObject current=null] : iv_ruleForExpression= ruleForExpression EOF ;
    public final EObject entryRuleForExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForExpression = null;


        try {
            // InternalPcodeParser.g:783:54: (iv_ruleForExpression= ruleForExpression EOF )
            // InternalPcodeParser.g:784:2: iv_ruleForExpression= ruleForExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForExpression=ruleForExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForExpression; 
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
    // $ANTLR end "entryRuleForExpression"


    // $ANTLR start "ruleForExpression"
    // InternalPcodeParser.g:790:1: ruleForExpression returns [EObject current=null] : ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END ) ;
    public final EObject ruleForExpression() throws RecognitionException {
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
            // InternalPcodeParser.g:796:2: ( ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END ) )
            // InternalPcodeParser.g:797:2: ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END )
            {
            // InternalPcodeParser.g:797:2: ( () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END )
            // InternalPcodeParser.g:798:3: () otherlv_1= For (otherlv_2= Interval )? ( (lv_from_3_0= ruleArithmeticExpression ) ) otherlv_4= To ( (lv_to_5_0= ruleArithmeticExpression ) ) this_BEGIN_6= RULE_BEGIN ( (lv_block_7_0= ruleFeature ) )* this_END_8= RULE_END
            {
            // InternalPcodeParser.g:798:3: ()
            // InternalPcodeParser.g:799:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForExpressionAccess().getForExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,For,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForExpressionAccess().getForKeyword_1());
              		
            }
            // InternalPcodeParser.g:809:3: (otherlv_2= Interval )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Interval) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPcodeParser.g:810:4: otherlv_2= Interval
                    {
                    otherlv_2=(Token)match(input,Interval,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getForExpressionAccess().getIntervalKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalPcodeParser.g:815:3: ( (lv_from_3_0= ruleArithmeticExpression ) )
            // InternalPcodeParser.g:816:4: (lv_from_3_0= ruleArithmeticExpression )
            {
            // InternalPcodeParser.g:816:4: (lv_from_3_0= ruleArithmeticExpression )
            // InternalPcodeParser.g:817:5: lv_from_3_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForExpressionAccess().getFromArithmeticExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_from_3_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForExpressionRule());
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

            otherlv_4=(Token)match(input,To,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForExpressionAccess().getToKeyword_4());
              		
            }
            // InternalPcodeParser.g:838:3: ( (lv_to_5_0= ruleArithmeticExpression ) )
            // InternalPcodeParser.g:839:4: (lv_to_5_0= ruleArithmeticExpression )
            {
            // InternalPcodeParser.g:839:4: (lv_to_5_0= ruleArithmeticExpression )
            // InternalPcodeParser.g:840:5: lv_to_5_0= ruleArithmeticExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForExpressionAccess().getToArithmeticExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_to_5_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForExpressionRule());
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

            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_6, grammarAccess.getForExpressionAccess().getBEGINTerminalRuleCall_6());
              		
            }
            // InternalPcodeParser.g:861:3: ( (lv_block_7_0= ruleFeature ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=Continue && LA17_0<=Exchange)||LA17_0==Return||LA17_0==Break||LA17_0==Print||LA17_0==While||LA17_0==Stop||LA17_0==For||LA17_0==If||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPcodeParser.g:862:4: (lv_block_7_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:862:4: (lv_block_7_0= ruleFeature )
            	    // InternalPcodeParser.g:863:5: lv_block_7_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getForExpressionAccess().getBlockFeatureParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_block_7_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getForExpressionRule());
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
            	    break loop17;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_8, grammarAccess.getForExpressionAccess().getENDTerminalRuleCall_8());
              		
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
    // $ANTLR end "ruleForExpression"


    // $ANTLR start "entryRuleWhileExpression"
    // InternalPcodeParser.g:888:1: entryRuleWhileExpression returns [EObject current=null] : iv_ruleWhileExpression= ruleWhileExpression EOF ;
    public final EObject entryRuleWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileExpression = null;


        try {
            // InternalPcodeParser.g:888:56: (iv_ruleWhileExpression= ruleWhileExpression EOF )
            // InternalPcodeParser.g:889:2: iv_ruleWhileExpression= ruleWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileExpression=ruleWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileExpression; 
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
    // $ANTLR end "entryRuleWhileExpression"


    // $ANTLR start "ruleWhileExpression"
    // InternalPcodeParser.g:895:1: ruleWhileExpression returns [EObject current=null] : ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END ) ;
    public final EObject ruleWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:901:2: ( ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END ) )
            // InternalPcodeParser.g:902:2: ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END )
            {
            // InternalPcodeParser.g:902:2: ( () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END )
            // InternalPcodeParser.g:903:3: () otherlv_1= While ( (lv_condition_2_0= ruleLiteralExpression ) ) this_BEGIN_3= RULE_BEGIN ( (lv_block_4_0= ruleFeature ) )* this_END_5= RULE_END
            {
            // InternalPcodeParser.g:903:3: ()
            // InternalPcodeParser.g:904:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWhileExpressionAccess().getWhileExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,While,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileExpressionAccess().getWhileKeyword_1());
              		
            }
            // InternalPcodeParser.g:914:3: ( (lv_condition_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:915:4: (lv_condition_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:915:4: (lv_condition_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:916:5: lv_condition_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileExpressionAccess().getConditionLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_condition_2_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getWhileExpressionAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalPcodeParser.g:937:3: ( (lv_block_4_0= ruleFeature ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=Continue && LA18_0<=Exchange)||LA18_0==Return||LA18_0==Break||LA18_0==Print||LA18_0==While||LA18_0==Stop||LA18_0==For||LA18_0==If||LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPcodeParser.g:938:4: (lv_block_4_0= ruleFeature )
            	    {
            	    // InternalPcodeParser.g:938:4: (lv_block_4_0= ruleFeature )
            	    // InternalPcodeParser.g:939:5: lv_block_4_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileExpressionAccess().getBlockFeatureParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_block_4_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileExpressionRule());
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
            	    break loop18;
                }
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_5, grammarAccess.getWhileExpressionAccess().getENDTerminalRuleCall_5());
              		
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
    // $ANTLR end "ruleWhileExpression"


    // $ANTLR start "entryRuleStop"
    // InternalPcodeParser.g:964:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalPcodeParser.g:964:45: (iv_ruleStop= ruleStop EOF )
            // InternalPcodeParser.g:965:2: iv_ruleStop= ruleStop EOF
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
    // InternalPcodeParser.g:971:1: ruleStop returns [EObject current=null] : ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleType ) ) ) ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        Token lv_type_2_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:977:2: ( ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleType ) ) ) ) ) )
            // InternalPcodeParser.g:978:2: ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleType ) ) ) ) )
            {
            // InternalPcodeParser.g:978:2: ( () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleType ) ) ) ) )
            // InternalPcodeParser.g:979:3: () ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleType ) ) ) )
            {
            // InternalPcodeParser.g:979:3: ()
            // InternalPcodeParser.g:980:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStopAccess().getStopAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:986:3: ( ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) ) | ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleType ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Continue||LA20_0==Break||LA20_0==Stop) ) {
                alt20=1;
            }
            else if ( (LA20_0==Return) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPcodeParser.g:987:4: ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) )
                    {
                    // InternalPcodeParser.g:987:4: ( ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) ) )
                    // InternalPcodeParser.g:988:5: ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) )
                    {
                    // InternalPcodeParser.g:988:5: ( (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue ) )
                    // InternalPcodeParser.g:989:6: (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue )
                    {
                    // InternalPcodeParser.g:989:6: (lv_type_1_1= Stop | lv_type_1_2= Break | lv_type_1_3= Continue )
                    int alt19=3;
                    switch ( input.LA(1) ) {
                    case Stop:
                        {
                        alt19=1;
                        }
                        break;
                    case Break:
                        {
                        alt19=2;
                        }
                        break;
                    case Continue:
                        {
                        alt19=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // InternalPcodeParser.g:990:7: lv_type_1_1= Stop
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
                            // InternalPcodeParser.g:1001:7: lv_type_1_2= Break
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
                            // InternalPcodeParser.g:1012:7: lv_type_1_3= Continue
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
                    // InternalPcodeParser.g:1026:4: ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleType ) ) )
                    {
                    // InternalPcodeParser.g:1026:4: ( ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleType ) ) )
                    // InternalPcodeParser.g:1027:5: ( (lv_type_2_0= Return ) ) ( (lv_value_3_0= ruleType ) )
                    {
                    // InternalPcodeParser.g:1027:5: ( (lv_type_2_0= Return ) )
                    // InternalPcodeParser.g:1028:6: (lv_type_2_0= Return )
                    {
                    // InternalPcodeParser.g:1028:6: (lv_type_2_0= Return )
                    // InternalPcodeParser.g:1029:7: lv_type_2_0= Return
                    {
                    lv_type_2_0=(Token)match(input,Return,FOLLOW_18); if (state.failed) return current;
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

                    // InternalPcodeParser.g:1041:5: ( (lv_value_3_0= ruleType ) )
                    // InternalPcodeParser.g:1042:6: (lv_value_3_0= ruleType )
                    {
                    // InternalPcodeParser.g:1042:6: (lv_value_3_0= ruleType )
                    // InternalPcodeParser.g:1043:7: lv_value_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getStopAccess().getValueTypeParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleType();

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
                      								"tdt4250.pseudocode.Pcode.Type");
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
    // InternalPcodeParser.g:1066:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalPcodeParser.g:1066:46: (iv_rulePrint= rulePrint EOF )
            // InternalPcodeParser.g:1067:2: iv_rulePrint= rulePrint EOF
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
    // InternalPcodeParser.g:1073:1: rulePrint returns [EObject current=null] : ( ( (lv_name_0_0= Print ) ) ( (lv_value_1_0= ruleLiteralExpression ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1079:2: ( ( ( (lv_name_0_0= Print ) ) ( (lv_value_1_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1080:2: ( ( (lv_name_0_0= Print ) ) ( (lv_value_1_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1080:2: ( ( (lv_name_0_0= Print ) ) ( (lv_value_1_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1081:3: ( (lv_name_0_0= Print ) ) ( (lv_value_1_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1081:3: ( (lv_name_0_0= Print ) )
            // InternalPcodeParser.g:1082:4: (lv_name_0_0= Print )
            {
            // InternalPcodeParser.g:1082:4: (lv_name_0_0= Print )
            // InternalPcodeParser.g:1083:5: lv_name_0_0= Print
            {
            lv_name_0_0=(Token)match(input,Print,FOLLOW_11); if (state.failed) return current;
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

            // InternalPcodeParser.g:1095:3: ( (lv_value_1_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1096:4: (lv_value_1_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1096:4: (lv_value_1_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1097:5: lv_value_1_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintAccess().getValueLiteralExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrintRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
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
    // InternalPcodeParser.g:1118:1: entryRuleCollectionAdd returns [EObject current=null] : iv_ruleCollectionAdd= ruleCollectionAdd EOF ;
    public final EObject entryRuleCollectionAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionAdd = null;


        try {
            // InternalPcodeParser.g:1118:54: (iv_ruleCollectionAdd= ruleCollectionAdd EOF )
            // InternalPcodeParser.g:1119:2: iv_ruleCollectionAdd= ruleCollectionAdd EOF
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
    // InternalPcodeParser.g:1125:1: ruleCollectionAdd returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleCollectionAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1131:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1132:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1132:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1133:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Add ( (lv_value_3_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1133:3: ()
            // InternalPcodeParser.g:1134:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionAddAccess().getCollectionAddAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1140:3: ( (otherlv_1= RULE_ID ) )
            // InternalPcodeParser.g:1141:4: (otherlv_1= RULE_ID )
            {
            // InternalPcodeParser.g:1141:4: (otherlv_1= RULE_ID )
            // InternalPcodeParser.g:1142:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCollectionAddRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getCollectionAddAccess().getCollectionVariableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Add,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCollectionAddAccess().getAddKeyword_2());
              		
            }
            // InternalPcodeParser.g:1157:3: ( (lv_value_3_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1158:4: (lv_value_3_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1158:4: (lv_value_3_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1159:5: lv_value_3_0= ruleLiteralExpression
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
    // InternalPcodeParser.g:1180:1: entryRuleCollectionRemove returns [EObject current=null] : iv_ruleCollectionRemove= ruleCollectionRemove EOF ;
    public final EObject entryRuleCollectionRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionRemove = null;


        try {
            // InternalPcodeParser.g:1180:57: (iv_ruleCollectionRemove= ruleCollectionRemove EOF )
            // InternalPcodeParser.g:1181:2: iv_ruleCollectionRemove= ruleCollectionRemove EOF
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
    // InternalPcodeParser.g:1187:1: ruleCollectionRemove returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleCollectionRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1193:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1194:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1194:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1195:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Remove ( (lv_value_3_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1195:3: ()
            // InternalPcodeParser.g:1196:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionRemoveAccess().getCollectionRemoveAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1202:3: ( (otherlv_1= RULE_ID ) )
            // InternalPcodeParser.g:1203:4: (otherlv_1= RULE_ID )
            {
            // InternalPcodeParser.g:1203:4: (otherlv_1= RULE_ID )
            // InternalPcodeParser.g:1204:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCollectionRemoveRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getCollectionRemoveAccess().getCollectionVariableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Remove,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCollectionRemoveAccess().getRemoveKeyword_2());
              		
            }
            // InternalPcodeParser.g:1219:3: ( (lv_value_3_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1220:4: (lv_value_3_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1220:4: (lv_value_3_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1221:5: lv_value_3_0= ruleLiteralExpression
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
    // InternalPcodeParser.g:1242:1: entryRuleValueExchange returns [EObject current=null] : iv_ruleValueExchange= ruleValueExchange EOF ;
    public final EObject entryRuleValueExchange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExchange = null;


        try {
            // InternalPcodeParser.g:1242:54: (iv_ruleValueExchange= ruleValueExchange EOF )
            // InternalPcodeParser.g:1243:2: iv_ruleValueExchange= ruleValueExchange EOF
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
    // InternalPcodeParser.g:1249:1: ruleValueExchange returns [EObject current=null] : ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleValueExchange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_collection_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1255:2: ( ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) ) )
            // InternalPcodeParser.g:1256:2: ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) )
            {
            // InternalPcodeParser.g:1256:2: ( () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) ) )
            // InternalPcodeParser.g:1257:3: () otherlv_1= Exchange ( (lv_collection_2_0= ruleLiteralExpression ) ) otherlv_3= With ( (lv_value_4_0= ruleLiteralExpression ) )
            {
            // InternalPcodeParser.g:1257:3: ()
            // InternalPcodeParser.g:1258:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getValueExchangeAccess().getValueExchangeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Exchange,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getValueExchangeAccess().getExchangeKeyword_1());
              		
            }
            // InternalPcodeParser.g:1268:3: ( (lv_collection_2_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1269:4: (lv_collection_2_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1269:4: (lv_collection_2_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1270:5: lv_collection_2_0= ruleLiteralExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValueExchangeAccess().getCollectionLiteralExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            otherlv_3=(Token)match(input,With,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getValueExchangeAccess().getWithKeyword_3());
              		
            }
            // InternalPcodeParser.g:1291:3: ( (lv_value_4_0= ruleLiteralExpression ) )
            // InternalPcodeParser.g:1292:4: (lv_value_4_0= ruleLiteralExpression )
            {
            // InternalPcodeParser.g:1292:4: (lv_value_4_0= ruleLiteralExpression )
            // InternalPcodeParser.g:1293:5: lv_value_4_0= ruleLiteralExpression
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


    // $ANTLR start "entryRuleFunctionCall"
    // InternalPcodeParser.g:1314:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalPcodeParser.g:1314:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalPcodeParser.g:1315:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalPcodeParser.g:1321:1: ruleFunctionCall returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= RightParenthesis ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1327:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= RightParenthesis ) )
            // InternalPcodeParser.g:1328:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= RightParenthesis )
            {
            // InternalPcodeParser.g:1328:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= RightParenthesis )
            // InternalPcodeParser.g:1329:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= LeftParenthesis ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= RightParenthesis
            {
            // InternalPcodeParser.g:1329:3: ()
            // InternalPcodeParser.g:1330:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1336:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPcodeParser.g:1337:4: (lv_name_1_0= ruleEString )
            {
            // InternalPcodeParser.g:1337:4: (lv_name_1_0= ruleEString )
            // InternalPcodeParser.g:1338:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionCallAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"tdt4250.pseudocode.Pcode.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPcodeParser.g:1359:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Decimal_1||LA22_0==Number_1||LA22_0==Array_1||LA22_0==Table_1||LA22_0==List_1||LA22_0==Text_1||(LA22_0>=RULE_ID && LA22_0<=RULE_STRING)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPcodeParser.g:1360:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalPcodeParser.g:1360:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalPcodeParser.g:1361:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalPcodeParser.g:1361:5: (lv_parameters_3_0= ruleParameter )
                    // InternalPcodeParser.g:1362:6: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"tdt4250.pseudocode.Pcode.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPcodeParser.g:1379:4: (otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==Comma) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1380:5: otherlv_4= Comma ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalPcodeParser.g:1384:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalPcodeParser.g:1385:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalPcodeParser.g:1385:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalPcodeParser.g:1386:7: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"tdt4250.pseudocode.Pcode.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
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


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalPcodeParser.g:1413:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalPcodeParser.g:1413:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalPcodeParser.g:1414:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalPcodeParser.g:1420:1: ruleLiteralExpression returns [EObject current=null] : (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Collection_0 = null;

        EObject this_CollectionAccessor_1 = null;

        EObject this_BooleanExpression_2 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1426:2: ( (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression ) )
            // InternalPcodeParser.g:1427:2: (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression )
            {
            // InternalPcodeParser.g:1427:2: (this_Collection_0= ruleCollection | this_CollectionAccessor_1= ruleCollectionAccessor | this_BooleanExpression_2= ruleBooleanExpression )
            int alt23=3;
            switch ( input.LA(1) ) {
            case New:
            case LeftSquareBracket:
            case A:
            case LeftCurlyBracket:
                {
                alt23=1;
                }
                break;
            case RULE_ID:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==At||LA23_2==LeftSquareBracket) ) {
                    alt23=2;
                }
                else if ( (LA23_2==EOF||(LA23_2>=Continue && LA23_2<=Exchange)||LA23_2==Return||LA23_2==Break||(LA23_2>=Minus && LA23_2<=Print)||LA23_2==While||(LA23_2>=Plus && LA23_2<=Stop)||LA23_2==Then||LA23_2==With||LA23_2==For||(LA23_2>=ExclamationMarkEqualsSign && LA23_2<=AmpersandAmpersand)||(LA23_2>=LessThanSignEqualsSign && LA23_2<=GreaterThanSignEqualsSign)||LA23_2==If||LA23_2==VerticalLineVerticalLine||(LA23_2>=LeftParenthesis && LA23_2<=LessThanSign)||LA23_2==GreaterThanSign||LA23_2==RightSquareBracket||(LA23_2>=RightCurlyBracket && LA23_2<=RULE_END)||LA23_2==RULE_ID) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case False:
            case Minus:
            case True:
            case ExclamationMark:
            case LeftParenthesis:
            case HyphenMinus:
            case RULE_INT:
            case RULE_STRING:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalPcodeParser.g:1428:3: this_Collection_0= ruleCollection
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
                    // InternalPcodeParser.g:1437:3: this_CollectionAccessor_1= ruleCollectionAccessor
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
                    // InternalPcodeParser.g:1446:3: this_BooleanExpression_2= ruleBooleanExpression
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
    // InternalPcodeParser.g:1458:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // InternalPcodeParser.g:1458:51: (iv_ruleCollection= ruleCollection EOF )
            // InternalPcodeParser.g:1459:2: iv_ruleCollection= ruleCollection EOF
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
    // InternalPcodeParser.g:1465:1: ruleCollection returns [EObject current=null] : (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLitteral_0 = null;

        EObject this_List_1 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1471:2: ( (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList ) )
            // InternalPcodeParser.g:1472:2: (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList )
            {
            // InternalPcodeParser.g:1472:2: (this_CollectionLitteral_0= ruleCollectionLitteral | this_List_1= ruleList )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftSquareBracket||LA24_0==LeftCurlyBracket) ) {
                alt24=1;
            }
            else if ( (LA24_0==New||LA24_0==A) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPcodeParser.g:1473:3: this_CollectionLitteral_0= ruleCollectionLitteral
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
                    // InternalPcodeParser.g:1482:3: this_List_1= ruleList
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
    // InternalPcodeParser.g:1494:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalPcodeParser.g:1494:45: (iv_ruleList= ruleList EOF )
            // InternalPcodeParser.g:1495:2: iv_ruleList= ruleList EOF
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
    // InternalPcodeParser.g:1501:1: ruleList returns [EObject current=null] : ( () (otherlv_1= A )? otherlv_2= New ( ( (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 ) ) ) (otherlv_4= Array_1 | otherlv_5= List_1 | otherlv_6= Table_1 ) (otherlv_7= And otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_elements_9_0 = null;

        EObject lv_elements_11_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1507:2: ( ( () (otherlv_1= A )? otherlv_2= New ( ( (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 ) ) ) (otherlv_4= Array_1 | otherlv_5= List_1 | otherlv_6= Table_1 ) (otherlv_7= And otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? ) )
            // InternalPcodeParser.g:1508:2: ( () (otherlv_1= A )? otherlv_2= New ( ( (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 ) ) ) (otherlv_4= Array_1 | otherlv_5= List_1 | otherlv_6= Table_1 ) (otherlv_7= And otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? )
            {
            // InternalPcodeParser.g:1508:2: ( () (otherlv_1= A )? otherlv_2= New ( ( (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 ) ) ) (otherlv_4= Array_1 | otherlv_5= List_1 | otherlv_6= Table_1 ) (otherlv_7= And otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )? )
            // InternalPcodeParser.g:1509:3: () (otherlv_1= A )? otherlv_2= New ( ( (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 ) ) ) (otherlv_4= Array_1 | otherlv_5= List_1 | otherlv_6= Table_1 ) (otherlv_7= And otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )?
            {
            // InternalPcodeParser.g:1509:3: ()
            // InternalPcodeParser.g:1510:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListAccess().getListAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1516:3: (otherlv_1= A )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==A) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPcodeParser.g:1517:4: otherlv_1= A
                    {
                    otherlv_1=(Token)match(input,A,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getListAccess().getAKeyword_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,New,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getListAccess().getNewKeyword_2());
              		
            }
            // InternalPcodeParser.g:1526:3: ( ( (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 ) ) )
            // InternalPcodeParser.g:1527:4: ( (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 ) )
            {
            // InternalPcodeParser.g:1527:4: ( (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 ) )
            // InternalPcodeParser.g:1528:5: (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 )
            {
            // InternalPcodeParser.g:1528:5: (lv_type_3_1= Text_1 | lv_type_3_2= Number_1 | lv_type_3_3= Decimal_1 )
            int alt26=3;
            switch ( input.LA(1) ) {
            case Text_1:
                {
                alt26=1;
                }
                break;
            case Number_1:
                {
                alt26=2;
                }
                break;
            case Decimal_1:
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
                    // InternalPcodeParser.g:1529:6: lv_type_3_1= Text_1
                    {
                    lv_type_3_1=(Token)match(input,Text_1,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_3_1, grammarAccess.getListAccess().getTypeTextKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getListRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_3_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1540:6: lv_type_3_2= Number_1
                    {
                    lv_type_3_2=(Token)match(input,Number_1,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_3_2, grammarAccess.getListAccess().getTypeNumberKeyword_3_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getListRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_3_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:1551:6: lv_type_3_3= Decimal_1
                    {
                    lv_type_3_3=(Token)match(input,Decimal_1,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_3_3, grammarAccess.getListAccess().getTypeDecimalKeyword_3_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getListRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_3_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalPcodeParser.g:1564:3: (otherlv_4= Array_1 | otherlv_5= List_1 | otherlv_6= Table_1 )
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
                    // InternalPcodeParser.g:1565:4: otherlv_4= Array_1
                    {
                    otherlv_4=(Token)match(input,Array_1,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getListAccess().getArrayKeyword_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1570:4: otherlv_5= List_1
                    {
                    otherlv_5=(Token)match(input,List_1,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getListAccess().getListKeyword_4_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:1575:4: otherlv_6= Table_1
                    {
                    otherlv_6=(Token)match(input,Table_1,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getListAccess().getTableKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalPcodeParser.g:1580:3: (otherlv_7= And otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==And) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPcodeParser.g:1581:4: otherlv_7= And otherlv_8= Contains ( (lv_elements_9_0= ruleLiteralExpression ) ) (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )*
                    {
                    otherlv_7=(Token)match(input,And,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getListAccess().getAndKeyword_5_0());
                      			
                    }
                    otherlv_8=(Token)match(input,Contains,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getListAccess().getContainsKeyword_5_1());
                      			
                    }
                    // InternalPcodeParser.g:1589:4: ( (lv_elements_9_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1590:5: (lv_elements_9_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1590:5: (lv_elements_9_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1591:6: lv_elements_9_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListAccess().getElementsLiteralExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
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

                    // InternalPcodeParser.g:1608:4: (otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==Comma) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1609:5: otherlv_10= Comma ( (lv_elements_11_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_10=(Token)match(input,Comma,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getListAccess().getCommaKeyword_5_3_0());
                    	      				
                    	    }
                    	    // InternalPcodeParser.g:1613:5: ( (lv_elements_11_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1614:6: (lv_elements_11_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1614:6: (lv_elements_11_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1615:7: lv_elements_11_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListAccess().getElementsLiteralExpressionParserRuleCall_5_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
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
    // InternalPcodeParser.g:1638:1: entryRuleCollectionLitteral returns [EObject current=null] : iv_ruleCollectionLitteral= ruleCollectionLitteral EOF ;
    public final EObject entryRuleCollectionLitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLitteral = null;


        try {
            // InternalPcodeParser.g:1638:59: (iv_ruleCollectionLitteral= ruleCollectionLitteral EOF )
            // InternalPcodeParser.g:1639:2: iv_ruleCollectionLitteral= ruleCollectionLitteral EOF
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
    // InternalPcodeParser.g:1645:1: ruleCollectionLitteral returns [EObject current=null] : (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral ) ;
    public final EObject ruleCollectionLitteral() throws RecognitionException {
        EObject current = null;

        EObject this_SetLitteral_0 = null;

        EObject this_ListLitteral_1 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1651:2: ( (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral ) )
            // InternalPcodeParser.g:1652:2: (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral )
            {
            // InternalPcodeParser.g:1652:2: (this_SetLitteral_0= ruleSetLitteral | this_ListLitteral_1= ruleListLitteral )
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
                    // InternalPcodeParser.g:1653:3: this_SetLitteral_0= ruleSetLitteral
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
                    // InternalPcodeParser.g:1662:3: this_ListLitteral_1= ruleListLitteral
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
    // InternalPcodeParser.g:1674:1: entryRuleSetLitteral returns [EObject current=null] : iv_ruleSetLitteral= ruleSetLitteral EOF ;
    public final EObject entryRuleSetLitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLitteral = null;


        try {
            // InternalPcodeParser.g:1674:52: (iv_ruleSetLitteral= ruleSetLitteral EOF )
            // InternalPcodeParser.g:1675:2: iv_ruleSetLitteral= ruleSetLitteral EOF
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
    // InternalPcodeParser.g:1681:1: ruleSetLitteral returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleSetLitteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1687:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalPcodeParser.g:1688:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalPcodeParser.g:1688:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalPcodeParser.g:1689:3: () otherlv_1= LeftCurlyBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalPcodeParser.g:1689:3: ()
            // InternalPcodeParser.g:1690:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSetLitteralAccess().getSetLitteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSetLitteralAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalPcodeParser.g:1700:3: ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==False||LA32_0==Minus||LA32_0==True||LA32_0==New||(LA32_0>=ExclamationMark && LA32_0<=LeftParenthesis)||LA32_0==HyphenMinus||LA32_0==LeftSquareBracket||(LA32_0>=A && LA32_0<=LeftCurlyBracket)||LA32_0==RULE_INT||(LA32_0>=RULE_ID && LA32_0<=RULE_STRING)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPcodeParser.g:1701:4: ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )*
                    {
                    // InternalPcodeParser.g:1701:4: ( (lv_elements_2_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1702:5: (lv_elements_2_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1702:5: (lv_elements_2_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1703:6: lv_elements_2_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSetLitteralAccess().getElementsLiteralExpressionParserRuleCall_2_0_0());
                      					
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

                    // InternalPcodeParser.g:1720:4: (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1721:5: otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSetLitteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalPcodeParser.g:1725:5: ( (lv_elements_4_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1726:6: (lv_elements_4_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1726:6: (lv_elements_4_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1727:7: lv_elements_4_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSetLitteralAccess().getElementsLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSetLitteralAccess().getRightCurlyBracketKeyword_3());
              		
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
    // InternalPcodeParser.g:1754:1: entryRuleListLitteral returns [EObject current=null] : iv_ruleListLitteral= ruleListLitteral EOF ;
    public final EObject entryRuleListLitteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLitteral = null;


        try {
            // InternalPcodeParser.g:1754:53: (iv_ruleListLitteral= ruleListLitteral EOF )
            // InternalPcodeParser.g:1755:2: iv_ruleListLitteral= ruleListLitteral EOF
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
    // InternalPcodeParser.g:1761:1: ruleListLitteral returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleListLitteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1767:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalPcodeParser.g:1768:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalPcodeParser.g:1768:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalPcodeParser.g:1769:3: () otherlv_1= LeftSquareBracket ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalPcodeParser.g:1769:3: ()
            // InternalPcodeParser.g:1770:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListLitteralAccess().getListLitteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListLitteralAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalPcodeParser.g:1780:3: ( ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==False||LA34_0==Minus||LA34_0==True||LA34_0==New||(LA34_0>=ExclamationMark && LA34_0<=LeftParenthesis)||LA34_0==HyphenMinus||LA34_0==LeftSquareBracket||(LA34_0>=A && LA34_0<=LeftCurlyBracket)||LA34_0==RULE_INT||(LA34_0>=RULE_ID && LA34_0<=RULE_STRING)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPcodeParser.g:1781:4: ( (lv_elements_2_0= ruleLiteralExpression ) ) (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )*
                    {
                    // InternalPcodeParser.g:1781:4: ( (lv_elements_2_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1782:5: (lv_elements_2_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1782:5: (lv_elements_2_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1783:6: lv_elements_2_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListLitteralAccess().getElementsLiteralExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
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

                    // InternalPcodeParser.g:1800:4: (otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==Comma) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1801:5: otherlv_3= Comma ( (lv_elements_4_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListLitteralAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalPcodeParser.g:1805:5: ( (lv_elements_4_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1806:6: (lv_elements_4_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1806:6: (lv_elements_4_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1807:7: lv_elements_4_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListLitteralAccess().getElementsLiteralExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_32);
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


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getListLitteralAccess().getRightSquareBracketKeyword_3());
              		
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
    // InternalPcodeParser.g:1834:1: entryRuleCollectionAccessor returns [EObject current=null] : iv_ruleCollectionAccessor= ruleCollectionAccessor EOF ;
    public final EObject entryRuleCollectionAccessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionAccessor = null;


        try {
            // InternalPcodeParser.g:1834:59: (iv_ruleCollectionAccessor= ruleCollectionAccessor EOF )
            // InternalPcodeParser.g:1835:2: iv_ruleCollectionAccessor= ruleCollectionAccessor EOF
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
    // InternalPcodeParser.g:1841:1: ruleCollectionAccessor returns [EObject current=null] : ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) ) ;
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
            // InternalPcodeParser.g:1847:2: ( ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) ) )
            // InternalPcodeParser.g:1848:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) )
            {
            // InternalPcodeParser.g:1848:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) ) )
            // InternalPcodeParser.g:1849:3: () ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) )
            {
            // InternalPcodeParser.g:1849:3: ()
            // InternalPcodeParser.g:1850:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCollectionAccessorAccess().getCollectionAccessorAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:1856:3: ( ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ ) | ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==At) ) {
                    alt38=2;
                }
                else if ( (LA38_1==LeftSquareBracket) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalPcodeParser.g:1857:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ )
                    {
                    // InternalPcodeParser.g:1857:4: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+ )
                    // InternalPcodeParser.g:1858:5: ( (otherlv_1= RULE_ID ) ) (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+
                    {
                    // InternalPcodeParser.g:1858:5: ( (otherlv_1= RULE_ID ) )
                    // InternalPcodeParser.g:1859:6: (otherlv_1= RULE_ID )
                    {
                    // InternalPcodeParser.g:1859:6: (otherlv_1= RULE_ID )
                    // InternalPcodeParser.g:1860:7: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCollectionAccessorRule());
                      							}
                      						
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_1, grammarAccess.getCollectionAccessorAccess().getCollectionVariableCrossReference_1_0_0_0());
                      						
                    }

                    }


                    }

                    // InternalPcodeParser.g:1871:5: (otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==LeftSquareBracket) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1872:6: otherlv_2= LeftSquareBracket ( (lv_accessor_3_0= ruleLiteralExpression ) ) otherlv_4= RightSquareBracket
                    	    {
                    	    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getCollectionAccessorAccess().getLeftSquareBracketKeyword_1_0_1_0());
                    	      					
                    	    }
                    	    // InternalPcodeParser.g:1876:6: ( (lv_accessor_3_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1877:7: (lv_accessor_3_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1877:7: (lv_accessor_3_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1878:8: lv_accessor_3_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCollectionAccessorAccess().getAccessorLiteralExpressionParserRuleCall_1_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_34);
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

                    	    otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getCollectionAccessorAccess().getRightSquareBracketKeyword_1_0_1_2());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:1902:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* )
                    {
                    // InternalPcodeParser.g:1902:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )* )
                    // InternalPcodeParser.g:1903:5: ( (otherlv_5= RULE_ID ) ) otherlv_6= At (otherlv_7= Index )? ( (lv_accessor_8_0= ruleLiteralExpression ) ) (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )*
                    {
                    // InternalPcodeParser.g:1903:5: ( (otherlv_5= RULE_ID ) )
                    // InternalPcodeParser.g:1904:6: (otherlv_5= RULE_ID )
                    {
                    // InternalPcodeParser.g:1904:6: (otherlv_5= RULE_ID )
                    // InternalPcodeParser.g:1905:7: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCollectionAccessorRule());
                      							}
                      						
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_5, grammarAccess.getCollectionAccessorAccess().getCollectionVariableCrossReference_1_1_0_0());
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,At,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getCollectionAccessorAccess().getAtKeyword_1_1_1());
                      				
                    }
                    // InternalPcodeParser.g:1920:5: (otherlv_7= Index )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==Index) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalPcodeParser.g:1921:6: otherlv_7= Index
                            {
                            otherlv_7=(Token)match(input,Index,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getCollectionAccessorAccess().getIndexKeyword_1_1_2());
                              					
                            }

                            }
                            break;

                    }

                    // InternalPcodeParser.g:1926:5: ( (lv_accessor_8_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:1927:6: (lv_accessor_8_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:1927:6: (lv_accessor_8_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:1928:7: lv_accessor_8_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCollectionAccessorAccess().getAccessorLiteralExpressionParserRuleCall_1_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_28);
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

                    // InternalPcodeParser.g:1945:5: (otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==Comma) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalPcodeParser.g:1946:6: otherlv_9= Comma ( (lv_accessor_10_0= ruleLiteralExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getCollectionAccessorAccess().getCommaKeyword_1_1_4_0());
                    	      					
                    	    }
                    	    // InternalPcodeParser.g:1950:6: ( (lv_accessor_10_0= ruleLiteralExpression ) )
                    	    // InternalPcodeParser.g:1951:7: (lv_accessor_10_0= ruleLiteralExpression )
                    	    {
                    	    // InternalPcodeParser.g:1951:7: (lv_accessor_10_0= ruleLiteralExpression )
                    	    // InternalPcodeParser.g:1952:8: lv_accessor_10_0= ruleLiteralExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCollectionAccessorAccess().getAccessorLiteralExpressionParserRuleCall_1_1_4_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_28);
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
                    	    break loop37;
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
    // InternalPcodeParser.g:1976:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalPcodeParser.g:1976:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalPcodeParser.g:1977:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalPcodeParser.g:1983:1: ruleBooleanExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:1989:2: ( (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalPcodeParser.g:1990:2: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalPcodeParser.g:1990:2: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalPcodeParser.g:1991:3: this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:1999:3: ( ( () ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==AmpersandAmpersand||LA40_0==VerticalLineVerticalLine) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPcodeParser.g:2000:4: ( () ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalPcodeParser.g:2000:4: ( () ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) ) )
            	    // InternalPcodeParser.g:2001:5: () ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) )
            	    {
            	    // InternalPcodeParser.g:2001:5: ()
            	    // InternalPcodeParser.g:2002:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2008:5: ( ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) ) )
            	    // InternalPcodeParser.g:2009:6: ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) )
            	    {
            	    // InternalPcodeParser.g:2009:6: ( (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand ) )
            	    // InternalPcodeParser.g:2010:7: (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand )
            	    {
            	    // InternalPcodeParser.g:2010:7: (lv_op_2_1= VerticalLineVerticalLine | lv_op_2_2= AmpersandAmpersand )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==VerticalLineVerticalLine) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==AmpersandAmpersand) ) {
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
            	            // InternalPcodeParser.g:2011:8: lv_op_2_1= VerticalLineVerticalLine
            	            {
            	            lv_op_2_1=(Token)match(input,VerticalLineVerticalLine,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getBooleanExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getBooleanExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPcodeParser.g:2022:8: lv_op_2_2= AmpersandAmpersand
            	            {
            	            lv_op_2_2=(Token)match(input,AmpersandAmpersand,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getBooleanExpressionAccess().getOpAmpersandAmpersandKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getBooleanExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalPcodeParser.g:2036:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalPcodeParser.g:2037:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalPcodeParser.g:2037:5: (lv_right_3_0= ruleComparison )
            	    // InternalPcodeParser.g:2038:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop40;
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


    // $ANTLR start "entryRuleComparison"
    // InternalPcodeParser.g:2060:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalPcodeParser.g:2060:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalPcodeParser.g:2061:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalPcodeParser.g:2067:1: ruleComparison returns [EObject current=null] : (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Equals_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2073:2: ( (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* ) )
            // InternalPcodeParser.g:2074:2: (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* )
            {
            // InternalPcodeParser.g:2074:2: (this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* )
            // InternalPcodeParser.g:2075:3: this_Equals_0= ruleEquals ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getEqualsParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_Equals_0=ruleEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equals_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2083:3: ( ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleEquals ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LessThanSign||LA42_0==GreaterThanSign) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPcodeParser.g:2084:4: ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleEquals ) )
            	    {
            	    // InternalPcodeParser.g:2084:4: ( () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) ) )
            	    // InternalPcodeParser.g:2085:5: () ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) )
            	    {
            	    // InternalPcodeParser.g:2085:5: ()
            	    // InternalPcodeParser.g:2086:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2092:5: ( ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) ) )
            	    // InternalPcodeParser.g:2093:6: ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) )
            	    {
            	    // InternalPcodeParser.g:2093:6: ( (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign ) )
            	    // InternalPcodeParser.g:2094:7: (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign )
            	    {
            	    // InternalPcodeParser.g:2094:7: (lv_op_2_1= LessThanSign | lv_op_2_2= GreaterThanSign )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==LessThanSign) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==GreaterThanSign) ) {
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
            	            // InternalPcodeParser.g:2095:8: lv_op_2_1= LessThanSign
            	            {
            	            lv_op_2_1=(Token)match(input,LessThanSign,FOLLOW_11); if (state.failed) return current;
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
            	            // InternalPcodeParser.g:2106:8: lv_op_2_2= GreaterThanSign
            	            {
            	            lv_op_2_2=(Token)match(input,GreaterThanSign,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getComparisonRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalPcodeParser.g:2120:4: ( (lv_right_3_0= ruleEquals ) )
            	    // InternalPcodeParser.g:2121:5: (lv_right_3_0= ruleEquals )
            	    {
            	    // InternalPcodeParser.g:2121:5: (lv_right_3_0= ruleEquals )
            	    // InternalPcodeParser.g:2122:6: lv_right_3_0= ruleEquals
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightEqualsParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
    // InternalPcodeParser.g:2144:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // InternalPcodeParser.g:2144:47: (iv_ruleEquals= ruleEquals EOF )
            // InternalPcodeParser.g:2145:2: iv_ruleEquals= ruleEquals EOF
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
    // InternalPcodeParser.g:2151:1: ruleEquals returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) ;
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
            // InternalPcodeParser.g:2157:2: ( (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // InternalPcodeParser.g:2158:2: (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // InternalPcodeParser.g:2158:2: (this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            // InternalPcodeParser.g:2159:3: this_Addition_0= ruleAddition ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualsAccess().getAdditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Addition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2167:3: ( ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==ExclamationMarkEqualsSign||(LA44_0>=LessThanSignEqualsSign && LA44_0<=GreaterThanSignEqualsSign)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPcodeParser.g:2168:4: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // InternalPcodeParser.g:2168:4: ( () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) ) )
            	    // InternalPcodeParser.g:2169:5: () ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) )
            	    {
            	    // InternalPcodeParser.g:2169:5: ()
            	    // InternalPcodeParser.g:2170:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2176:5: ( ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) ) )
            	    // InternalPcodeParser.g:2177:6: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) )
            	    {
            	    // InternalPcodeParser.g:2177:6: ( (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign ) )
            	    // InternalPcodeParser.g:2178:7: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign )
            	    {
            	    // InternalPcodeParser.g:2178:7: (lv_op_2_1= EqualsSignEqualsSign | lv_op_2_2= LessThanSignEqualsSign | lv_op_2_3= GreaterThanSignEqualsSign | lv_op_2_4= ExclamationMarkEqualsSign )
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
            	            // InternalPcodeParser.g:2179:8: lv_op_2_1= EqualsSignEqualsSign
            	            {
            	            lv_op_2_1=(Token)match(input,EqualsSignEqualsSign,FOLLOW_11); if (state.failed) return current;
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
            	            // InternalPcodeParser.g:2190:8: lv_op_2_2= LessThanSignEqualsSign
            	            {
            	            lv_op_2_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_11); if (state.failed) return current;
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
            	            // InternalPcodeParser.g:2201:8: lv_op_2_3= GreaterThanSignEqualsSign
            	            {
            	            lv_op_2_3=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_11); if (state.failed) return current;
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
            	            // InternalPcodeParser.g:2212:8: lv_op_2_4= ExclamationMarkEqualsSign
            	            {
            	            lv_op_2_4=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_11); if (state.failed) return current;
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

            	    // InternalPcodeParser.g:2226:4: ( (lv_right_3_0= ruleAddition ) )
            	    // InternalPcodeParser.g:2227:5: (lv_right_3_0= ruleAddition )
            	    {
            	    // InternalPcodeParser.g:2227:5: (lv_right_3_0= ruleAddition )
            	    // InternalPcodeParser.g:2228:6: lv_right_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualsAccess().getRightAdditionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
    // InternalPcodeParser.g:2250:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalPcodeParser.g:2250:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalPcodeParser.g:2251:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
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
    // InternalPcodeParser.g:2257:1: ruleArithmeticExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2263:2: (this_Addition_0= ruleAddition )
            // InternalPcodeParser.g:2264:2: this_Addition_0= ruleAddition
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
    // InternalPcodeParser.g:2275:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalPcodeParser.g:2275:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalPcodeParser.g:2276:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalPcodeParser.g:2282:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ) ( (lv_right_6_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2288:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ) ( (lv_right_6_0= ruleMultiplication ) ) )* ) )
            // InternalPcodeParser.g:2289:2: (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ) ( (lv_right_6_0= ruleMultiplication ) ) )* )
            {
            // InternalPcodeParser.g:2289:2: (this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ) ( (lv_right_6_0= ruleMultiplication ) ) )* )
            // InternalPcodeParser.g:2290:3: this_Multiplication_0= ruleMultiplication ( ( ( () rulePlusOperator ) | ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ) ( (lv_right_6_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2298:3: ( ( ( () rulePlusOperator ) | ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ) ( (lv_right_6_0= ruleMultiplication ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Minus||LA47_0==Plus||LA47_0==PlusSign||LA47_0==HyphenMinus) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPcodeParser.g:2299:4: ( ( () rulePlusOperator ) | ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ) ( (lv_right_6_0= ruleMultiplication ) )
            	    {
            	    // InternalPcodeParser.g:2299:4: ( ( () rulePlusOperator ) | ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) )
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
            	            // InternalPcodeParser.g:2300:5: ( () rulePlusOperator )
            	            {
            	            // InternalPcodeParser.g:2300:5: ( () rulePlusOperator )
            	            // InternalPcodeParser.g:2301:6: () rulePlusOperator
            	            {
            	            // InternalPcodeParser.g:2301:6: ()
            	            // InternalPcodeParser.g:2302:7: 
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
            	            pushFollow(FOLLOW_11);
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
            	            // InternalPcodeParser.g:2317:5: ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) )
            	            {
            	            // InternalPcodeParser.g:2317:5: ( () (otherlv_4= HyphenMinus | otherlv_5= Minus ) )
            	            // InternalPcodeParser.g:2318:6: () (otherlv_4= HyphenMinus | otherlv_5= Minus )
            	            {
            	            // InternalPcodeParser.g:2318:6: ()
            	            // InternalPcodeParser.g:2319:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalPcodeParser.g:2325:6: (otherlv_4= HyphenMinus | otherlv_5= Minus )
            	            int alt45=2;
            	            int LA45_0 = input.LA(1);

            	            if ( (LA45_0==HyphenMinus) ) {
            	                alt45=1;
            	            }
            	            else if ( (LA45_0==Minus) ) {
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
            	                    // InternalPcodeParser.g:2326:7: otherlv_4= HyphenMinus
            	                    {
            	                    otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_11); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      							newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1_0());
            	                      						
            	                    }

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalPcodeParser.g:2331:7: otherlv_5= Minus
            	                    {
            	                    otherlv_5=(Token)match(input,Minus,FOLLOW_11); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      							newLeafNode(otherlv_5, grammarAccess.getAdditionAccess().getMinusKeyword_1_0_1_1_1());
            	                      						
            	                    }

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPcodeParser.g:2338:4: ( (lv_right_6_0= ruleMultiplication ) )
            	    // InternalPcodeParser.g:2339:5: (lv_right_6_0= ruleMultiplication )
            	    {
            	    // InternalPcodeParser.g:2339:5: (lv_right_6_0= ruleMultiplication )
            	    // InternalPcodeParser.g:2340:6: lv_right_6_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_6_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_6_0,
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
    // InternalPcodeParser.g:2362:1: entryRulePlusOperator returns [String current=null] : iv_rulePlusOperator= rulePlusOperator EOF ;
    public final String entryRulePlusOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusOperator = null;


        try {
            // InternalPcodeParser.g:2362:52: (iv_rulePlusOperator= rulePlusOperator EOF )
            // InternalPcodeParser.g:2363:2: iv_rulePlusOperator= rulePlusOperator EOF
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
    // InternalPcodeParser.g:2369:1: rulePlusOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= Plus ) ;
    public final AntlrDatatypeRuleToken rulePlusOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2375:2: ( (kw= PlusSign | kw= Plus ) )
            // InternalPcodeParser.g:2376:2: (kw= PlusSign | kw= Plus )
            {
            // InternalPcodeParser.g:2376:2: (kw= PlusSign | kw= Plus )
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
                    // InternalPcodeParser.g:2377:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPlusOperatorAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2383:3: kw= Plus
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


    // $ANTLR start "entryRuleMultiplication"
    // InternalPcodeParser.g:2392:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalPcodeParser.g:2392:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalPcodeParser.g:2393:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalPcodeParser.g:2399:1: ruleMultiplication returns [EObject current=null] : (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Prefixed_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2405:2: ( (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) )
            // InternalPcodeParser.g:2406:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            {
            // InternalPcodeParser.g:2406:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            // InternalPcodeParser.g:2407:3: this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_Prefixed_0=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Prefixed_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPcodeParser.g:2415:3: ( ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==Asterisk||LA50_0==Solidus) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPcodeParser.g:2416:4: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) ) ( (lv_right_3_0= rulePrefixed ) )
            	    {
            	    // InternalPcodeParser.g:2416:4: ( () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) ) )
            	    // InternalPcodeParser.g:2417:5: () ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) )
            	    {
            	    // InternalPcodeParser.g:2417:5: ()
            	    // InternalPcodeParser.g:2418:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalPcodeParser.g:2424:5: ( ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) ) )
            	    // InternalPcodeParser.g:2425:6: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) )
            	    {
            	    // InternalPcodeParser.g:2425:6: ( (lv_op_2_1= Asterisk | lv_op_2_2= Solidus ) )
            	    // InternalPcodeParser.g:2426:7: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus )
            	    {
            	    // InternalPcodeParser.g:2426:7: (lv_op_2_1= Asterisk | lv_op_2_2= Solidus )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==Asterisk) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==Solidus) ) {
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
            	            // InternalPcodeParser.g:2427:8: lv_op_2_1= Asterisk
            	            {
            	            lv_op_2_1=(Token)match(input,Asterisk,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMultiplicationRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPcodeParser.g:2438:8: lv_op_2_2= Solidus
            	            {
            	            lv_op_2_2=(Token)match(input,Solidus,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMultiplicationRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalPcodeParser.g:2452:4: ( (lv_right_3_0= rulePrefixed ) )
            	    // InternalPcodeParser.g:2453:5: (lv_right_3_0= rulePrefixed )
            	    {
            	    // InternalPcodeParser.g:2453:5: (lv_right_3_0= rulePrefixed )
            	    // InternalPcodeParser.g:2454:6: lv_right_3_0= rulePrefixed
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
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


    // $ANTLR start "entryRulePrefixed"
    // InternalPcodeParser.g:2476:1: entryRulePrefixed returns [EObject current=null] : iv_rulePrefixed= rulePrefixed EOF ;
    public final EObject entryRulePrefixed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixed = null;


        try {
            // InternalPcodeParser.g:2476:49: (iv_rulePrefixed= rulePrefixed EOF )
            // InternalPcodeParser.g:2477:2: iv_rulePrefixed= rulePrefixed EOF
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
    // InternalPcodeParser.g:2483:1: rulePrefixed returns [EObject current=null] : ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ( HyphenMinus | Minus ) )=> (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ( (lv_expression_6_0= ruleAtomic ) ) ) | this_Atomic_7= ruleAtomic ) ;
    public final EObject rulePrefixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_6_0 = null;

        EObject this_Atomic_7 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2489:2: ( ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ( HyphenMinus | Minus ) )=> (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ( (lv_expression_6_0= ruleAtomic ) ) ) | this_Atomic_7= ruleAtomic ) )
            // InternalPcodeParser.g:2490:2: ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ( HyphenMinus | Minus ) )=> (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ( (lv_expression_6_0= ruleAtomic ) ) ) | this_Atomic_7= ruleAtomic )
            {
            // InternalPcodeParser.g:2490:2: ( ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( ( HyphenMinus | Minus ) )=> (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ( (lv_expression_6_0= ruleAtomic ) ) ) | this_Atomic_7= ruleAtomic )
            int alt52=3;
            switch ( input.LA(1) ) {
            case ExclamationMark:
                {
                alt52=1;
                }
                break;
            case Minus:
            case HyphenMinus:
                {
                alt52=2;
                }
                break;
            case False:
            case True:
            case LeftParenthesis:
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
                {
                alt52=3;
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
                    // InternalPcodeParser.g:2491:3: ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    {
                    // InternalPcodeParser.g:2491:3: ( () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    // InternalPcodeParser.g:2492:4: () ( ( ExclamationMark )=>otherlv_1= ExclamationMark ) ( (lv_expression_2_0= ruleAtomic ) )
                    {
                    // InternalPcodeParser.g:2492:4: ()
                    // InternalPcodeParser.g:2493:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedAccess().getBooleanNegationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2499:4: ( ( ExclamationMark )=>otherlv_1= ExclamationMark )
                    // InternalPcodeParser.g:2500:5: ( ExclamationMark )=>otherlv_1= ExclamationMark
                    {
                    otherlv_1=(Token)match(input,ExclamationMark,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getPrefixedAccess().getExclamationMarkKeyword_0_1());
                      				
                    }

                    }

                    // InternalPcodeParser.g:2506:4: ( (lv_expression_2_0= ruleAtomic ) )
                    // InternalPcodeParser.g:2507:5: (lv_expression_2_0= ruleAtomic )
                    {
                    // InternalPcodeParser.g:2507:5: (lv_expression_2_0= ruleAtomic )
                    // InternalPcodeParser.g:2508:6: lv_expression_2_0= ruleAtomic
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
                    // InternalPcodeParser.g:2527:3: ( () ( ( ( HyphenMinus | Minus ) )=> (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ( (lv_expression_6_0= ruleAtomic ) ) )
                    {
                    // InternalPcodeParser.g:2527:3: ( () ( ( ( HyphenMinus | Minus ) )=> (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ( (lv_expression_6_0= ruleAtomic ) ) )
                    // InternalPcodeParser.g:2528:4: () ( ( ( HyphenMinus | Minus ) )=> (otherlv_4= HyphenMinus | otherlv_5= Minus ) ) ( (lv_expression_6_0= ruleAtomic ) )
                    {
                    // InternalPcodeParser.g:2528:4: ()
                    // InternalPcodeParser.g:2529:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedAccess().getArithmeticSignedAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2535:4: ( ( ( HyphenMinus | Minus ) )=> (otherlv_4= HyphenMinus | otherlv_5= Minus ) )
                    // InternalPcodeParser.g:2536:5: ( ( HyphenMinus | Minus ) )=> (otherlv_4= HyphenMinus | otherlv_5= Minus )
                    {
                    // InternalPcodeParser.g:2542:5: (otherlv_4= HyphenMinus | otherlv_5= Minus )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==HyphenMinus) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==Minus) ) {
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
                            // InternalPcodeParser.g:2543:6: otherlv_4= HyphenMinus
                            {
                            otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getPrefixedAccess().getHyphenMinusKeyword_1_1_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalPcodeParser.g:2548:6: otherlv_5= Minus
                            {
                            otherlv_5=(Token)match(input,Minus,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getPrefixedAccess().getMinusKeyword_1_1_0_1());
                              					
                            }

                            }
                            break;

                    }


                    }

                    // InternalPcodeParser.g:2554:4: ( (lv_expression_6_0= ruleAtomic ) )
                    // InternalPcodeParser.g:2555:5: (lv_expression_6_0= ruleAtomic )
                    {
                    // InternalPcodeParser.g:2555:5: (lv_expression_6_0= ruleAtomic )
                    // InternalPcodeParser.g:2556:6: lv_expression_6_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_6_0,
                      							"tdt4250.pseudocode.Pcode.Atomic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:2575:3: this_Atomic_7= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_7=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_7;
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
    // InternalPcodeParser.g:2587:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalPcodeParser.g:2587:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalPcodeParser.g:2588:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalPcodeParser.g:2594:1: ruleAtomic returns [EObject current=null] : ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_9_1= True | lv_value_9_2= False ) ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ) | this_FunctionCall_12= ruleFunctionCall ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_1=null;
        Token lv_value_9_2=null;
        Token otherlv_11=null;
        EObject lv_expression_2_0 = null;

        EObject this_FunctionCall_12 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2600:2: ( ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_9_1= True | lv_value_9_2= False ) ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ) | this_FunctionCall_12= ruleFunctionCall ) )
            // InternalPcodeParser.g:2601:2: ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_9_1= True | lv_value_9_2= False ) ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ) | this_FunctionCall_12= ruleFunctionCall )
            {
            // InternalPcodeParser.g:2601:2: ( ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_9_1= True | lv_value_9_2= False ) ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ) | this_FunctionCall_12= ruleFunctionCall )
            int alt54=6;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt54=1;
                }
                break;
            case RULE_INT:
                {
                alt54=2;
                }
                break;
            case RULE_STRING:
                {
                int LA54_3 = input.LA(2);

                if ( (LA54_3==EOF||(LA54_3>=Continue && LA54_3<=Exchange)||LA54_3==Return||LA54_3==Break||(LA54_3>=Minus && LA54_3<=Print)||LA54_3==While||(LA54_3>=Plus && LA54_3<=Stop)||LA54_3==Then||LA54_3==With||LA54_3==For||(LA54_3>=ExclamationMarkEqualsSign && LA54_3<=AmpersandAmpersand)||(LA54_3>=LessThanSignEqualsSign && LA54_3<=GreaterThanSignEqualsSign)||LA54_3==If||(LA54_3>=To && LA54_3<=VerticalLineVerticalLine)||(LA54_3>=RightParenthesis && LA54_3<=LessThanSign)||LA54_3==GreaterThanSign||LA54_3==RightSquareBracket||(LA54_3>=RightCurlyBracket && LA54_3<=RULE_END)||LA54_3==RULE_ID) ) {
                    alt54=3;
                }
                else if ( (LA54_3==LeftParenthesis) ) {
                    alt54=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 3, input);

                    throw nvae;
                }
                }
                break;
            case False:
            case True:
                {
                alt54=4;
                }
                break;
            case RULE_ID:
                {
                int LA54_5 = input.LA(2);

                if ( (LA54_5==EOF||(LA54_5>=Continue && LA54_5<=Exchange)||LA54_5==Return||LA54_5==Break||(LA54_5>=Minus && LA54_5<=Print)||LA54_5==While||(LA54_5>=Plus && LA54_5<=Stop)||LA54_5==Then||LA54_5==With||LA54_5==For||(LA54_5>=ExclamationMarkEqualsSign && LA54_5<=AmpersandAmpersand)||(LA54_5>=LessThanSignEqualsSign && LA54_5<=GreaterThanSignEqualsSign)||LA54_5==If||(LA54_5>=To && LA54_5<=VerticalLineVerticalLine)||(LA54_5>=RightParenthesis && LA54_5<=LessThanSign)||LA54_5==GreaterThanSign||LA54_5==RightSquareBracket||(LA54_5>=RightCurlyBracket && LA54_5<=RULE_END)||LA54_5==RULE_ID) ) {
                    alt54=5;
                }
                else if ( (LA54_5==LeftParenthesis) ) {
                    alt54=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 5, input);

                    throw nvae;
                }
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
                    // InternalPcodeParser.g:2602:3: ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis )
                    {
                    // InternalPcodeParser.g:2602:3: ( () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis )
                    // InternalPcodeParser.g:2603:4: () otherlv_1= LeftParenthesis ( (lv_expression_2_0= ruleLiteralExpression ) ) otherlv_3= RightParenthesis
                    {
                    // InternalPcodeParser.g:2603:4: ()
                    // InternalPcodeParser.g:2604:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getParenthesizedExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalPcodeParser.g:2614:4: ( (lv_expression_2_0= ruleLiteralExpression ) )
                    // InternalPcodeParser.g:2615:5: (lv_expression_2_0= ruleLiteralExpression )
                    {
                    // InternalPcodeParser.g:2615:5: (lv_expression_2_0= ruleLiteralExpression )
                    // InternalPcodeParser.g:2616:6: lv_expression_2_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getExpressionLiteralExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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
                    // InternalPcodeParser.g:2639:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalPcodeParser.g:2639:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalPcodeParser.g:2640:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalPcodeParser.g:2640:4: ()
                    // InternalPcodeParser.g:2641:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2647:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalPcodeParser.g:2648:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalPcodeParser.g:2648:5: (lv_value_5_0= RULE_INT )
                    // InternalPcodeParser.g:2649:6: lv_value_5_0= RULE_INT
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
                    // InternalPcodeParser.g:2667:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalPcodeParser.g:2667:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalPcodeParser.g:2668:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalPcodeParser.g:2668:4: ()
                    // InternalPcodeParser.g:2669:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2675:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalPcodeParser.g:2676:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalPcodeParser.g:2676:5: (lv_value_7_0= RULE_STRING )
                    // InternalPcodeParser.g:2677:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:2695:3: ( () ( ( (lv_value_9_1= True | lv_value_9_2= False ) ) ) )
                    {
                    // InternalPcodeParser.g:2695:3: ( () ( ( (lv_value_9_1= True | lv_value_9_2= False ) ) ) )
                    // InternalPcodeParser.g:2696:4: () ( ( (lv_value_9_1= True | lv_value_9_2= False ) ) )
                    {
                    // InternalPcodeParser.g:2696:4: ()
                    // InternalPcodeParser.g:2697:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBooleanLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2703:4: ( ( (lv_value_9_1= True | lv_value_9_2= False ) ) )
                    // InternalPcodeParser.g:2704:5: ( (lv_value_9_1= True | lv_value_9_2= False ) )
                    {
                    // InternalPcodeParser.g:2704:5: ( (lv_value_9_1= True | lv_value_9_2= False ) )
                    // InternalPcodeParser.g:2705:6: (lv_value_9_1= True | lv_value_9_2= False )
                    {
                    // InternalPcodeParser.g:2705:6: (lv_value_9_1= True | lv_value_9_2= False )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==True) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==False) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalPcodeParser.g:2706:7: lv_value_9_1= True
                            {
                            lv_value_9_1=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_9_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_9_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalPcodeParser.g:2717:7: lv_value_9_2= False
                            {
                            lv_value_9_2=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_9_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_9_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPcodeParser.g:2732:3: ( () ( (otherlv_11= RULE_ID ) ) )
                    {
                    // InternalPcodeParser.g:2732:3: ( () ( (otherlv_11= RULE_ID ) ) )
                    // InternalPcodeParser.g:2733:4: () ( (otherlv_11= RULE_ID ) )
                    {
                    // InternalPcodeParser.g:2733:4: ()
                    // InternalPcodeParser.g:2734:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableReferenceAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPcodeParser.g:2740:4: ( (otherlv_11= RULE_ID ) )
                    // InternalPcodeParser.g:2741:5: (otherlv_11= RULE_ID )
                    {
                    // InternalPcodeParser.g:2741:5: (otherlv_11= RULE_ID )
                    // InternalPcodeParser.g:2742:6: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getAtomicAccess().getRefVariableCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPcodeParser.g:2755:3: this_FunctionCall_12= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getFunctionCallParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_12=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_12;
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


    // $ANTLR start "entryRuleType"
    // InternalPcodeParser.g:2767:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalPcodeParser.g:2767:44: (iv_ruleType= ruleType EOF )
            // InternalPcodeParser.g:2768:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
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
    // InternalPcodeParser.g:2774:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalPcodeParser.g:2780:2: ( (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) )
            // InternalPcodeParser.g:2781:2: (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            {
            // InternalPcodeParser.g:2781:2: (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            int alt55=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt55=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt55=2;
                }
                break;
            case RULE_INT:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalPcodeParser.g:2782:3: this_EString_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getEStringParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EString_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EString_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2793:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DOUBLE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DOUBLE_1, grammarAccess.getTypeAccess().getDOUBLETerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:2801:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_2, grammarAccess.getTypeAccess().getINTTerminalRuleCall_2());
                      		
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeLiteral"
    // InternalPcodeParser.g:2812:1: entryRuleTypeLiteral returns [EObject current=null] : iv_ruleTypeLiteral= ruleTypeLiteral EOF ;
    public final EObject entryRuleTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteral = null;


        try {
            // InternalPcodeParser.g:2812:52: (iv_ruleTypeLiteral= ruleTypeLiteral EOF )
            // InternalPcodeParser.g:2813:2: iv_ruleTypeLiteral= ruleTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteral=ruleTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteral; 
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
    // InternalPcodeParser.g:2819:1: ruleTypeLiteral returns [EObject current=null] : ( () ( ( (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 ) ) ) ) ;
    public final EObject ruleTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;
        Token lv_name_1_5=null;
        Token lv_name_1_6=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2825:2: ( ( () ( ( (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 ) ) ) ) )
            // InternalPcodeParser.g:2826:2: ( () ( ( (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 ) ) ) )
            {
            // InternalPcodeParser.g:2826:2: ( () ( ( (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 ) ) ) )
            // InternalPcodeParser.g:2827:3: () ( ( (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 ) ) )
            {
            // InternalPcodeParser.g:2827:3: ()
            // InternalPcodeParser.g:2828:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTypeLiteralAccess().getTypeLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalPcodeParser.g:2834:3: ( ( (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 ) ) )
            // InternalPcodeParser.g:2835:4: ( (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 ) )
            {
            // InternalPcodeParser.g:2835:4: ( (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 ) )
            // InternalPcodeParser.g:2836:5: (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 )
            {
            // InternalPcodeParser.g:2836:5: (lv_name_1_1= Text_1 | lv_name_1_2= Number_1 | lv_name_1_3= Decimal_1 | lv_name_1_4= Array_1 | lv_name_1_5= List_1 | lv_name_1_6= Table_1 )
            int alt56=6;
            switch ( input.LA(1) ) {
            case Text_1:
                {
                alt56=1;
                }
                break;
            case Number_1:
                {
                alt56=2;
                }
                break;
            case Decimal_1:
                {
                alt56=3;
                }
                break;
            case Array_1:
                {
                alt56=4;
                }
                break;
            case List_1:
                {
                alt56=5;
                }
                break;
            case Table_1:
                {
                alt56=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalPcodeParser.g:2837:6: lv_name_1_1= Text_1
                    {
                    lv_name_1_1=(Token)match(input,Text_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_1, grammarAccess.getTypeLiteralAccess().getNameTextKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeLiteralRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2848:6: lv_name_1_2= Number_1
                    {
                    lv_name_1_2=(Token)match(input,Number_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_2, grammarAccess.getTypeLiteralAccess().getNameNumberKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeLiteralRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalPcodeParser.g:2859:6: lv_name_1_3= Decimal_1
                    {
                    lv_name_1_3=(Token)match(input,Decimal_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_3, grammarAccess.getTypeLiteralAccess().getNameDecimalKeyword_1_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeLiteralRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalPcodeParser.g:2870:6: lv_name_1_4= Array_1
                    {
                    lv_name_1_4=(Token)match(input,Array_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_4, grammarAccess.getTypeLiteralAccess().getNameArrayKeyword_1_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeLiteralRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_4, null);
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalPcodeParser.g:2881:6: lv_name_1_5= List_1
                    {
                    lv_name_1_5=(Token)match(input,List_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_5, grammarAccess.getTypeLiteralAccess().getNameListKeyword_1_0_4());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeLiteralRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_5, null);
                      					
                    }

                    }
                    break;
                case 6 :
                    // InternalPcodeParser.g:2892:6: lv_name_1_6= Table_1
                    {
                    lv_name_1_6=(Token)match(input,Table_1,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_6, grammarAccess.getTypeLiteralAccess().getNameTableKeyword_1_0_5());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeLiteralRule());
                      						}
                      						setWithLastConsumed(current, "name", lv_name_1_6, null);
                      					
                    }

                    }
                    break;

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
    // $ANTLR end "ruleTypeLiteral"


    // $ANTLR start "entryRuleEString"
    // InternalPcodeParser.g:2909:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPcodeParser.g:2909:47: (iv_ruleEString= ruleEString EOF )
            // InternalPcodeParser.g:2910:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPcodeParser.g:2916:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPcodeParser.g:2922:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPcodeParser.g:2923:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPcodeParser.g:2923:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalPcodeParser.g:2924:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPcodeParser.g:2932:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleEString"

    // $ANTLR start synpred1_InternalPcodeParser
    public final void synpred1_InternalPcodeParser_fragment() throws RecognitionException {   
        // InternalPcodeParser.g:745:5: ( Else )
        // InternalPcodeParser.g:745:6: Else
        {
        match(input,Else,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalPcodeParser

    // Delegated rules

    public final boolean synpred1_InternalPcodeParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPcodeParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000002482500L,0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0012000002482500L,0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002482500L,0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080081145060L,0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0100105000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x6421800108028000L,0x0000000000000034L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x6421800108028080L,0x0000000000000034L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003CL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000500L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000482000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xE421800108028000L,0x0000000000000034L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x6C21800108028000L,0x0000000000000034L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0810000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x6421800108038000L,0x0000000000000034L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400400000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0280000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000038200000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0028000000820002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});

}