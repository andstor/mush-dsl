package tdt4250.pseudocode.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tdt4250.pseudocode.services.PcodeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPcodeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'('", "','", "')'", "'method'", "'='", "'if'", "'!'", "'not'", "'exists'", "'elseif'", "'else'", "'for'", "';'", "'++'", "'--'", "'+'", "'-'", "':'", "'all'", "'interval'", "'to'", "'in'", "'while'", "'true'", "'return'", "'stop'", "'break'", "'continue'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPcodeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPcodeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPcodeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPcode.g"; }



     	private PcodeGrammarAccess grammarAccess;

        public InternalPcodeParser(TokenStream input, PcodeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PseudoClass";
       	}

       	@Override
       	protected PcodeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePseudoClass"
    // InternalPcode.g:65:1: entryRulePseudoClass returns [EObject current=null] : iv_rulePseudoClass= rulePseudoClass EOF ;
    public final EObject entryRulePseudoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClass = null;


        try {
            // InternalPcode.g:65:52: (iv_rulePseudoClass= rulePseudoClass EOF )
            // InternalPcode.g:66:2: iv_rulePseudoClass= rulePseudoClass EOF
            {
             newCompositeNode(grammarAccess.getPseudoClassRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePseudoClass=rulePseudoClass();

            state._fsp--;

             current =iv_rulePseudoClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePseudoClass"


    // $ANTLR start "rulePseudoClass"
    // InternalPcode.g:72:1: rulePseudoClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )* ) ;
    public final EObject rulePseudoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:78:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )* ) )
            // InternalPcode.g:79:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )* )
            {
            // InternalPcode.g:79:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )* )
            // InternalPcode.g:80:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )*
            {
            // InternalPcode.g:80:3: ()
            // InternalPcode.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPseudoClassAccess().getPseudoClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPseudoClassAccess().getClassKeyword_1());
            		
            // InternalPcode.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:92:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPseudoClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPseudoClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.pseudocode.Pcode.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPcode.g:110:3: ( (lv_members_3_0= ruleConstructor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPcode.g:111:4: (lv_members_3_0= ruleConstructor )
            	    {
            	    // InternalPcode.g:111:4: (lv_members_3_0= ruleConstructor )
            	    // InternalPcode.g:112:5: lv_members_3_0= ruleConstructor
            	    {

            	    					newCompositeNode(grammarAccess.getPseudoClassAccess().getMembersConstructorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_members_3_0=ruleConstructor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPseudoClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_3_0,
            	    						"tdt4250.pseudocode.Pcode.Constructor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPcode.g:129:3: ( (lv_members_4_0= ruleMethod ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPcode.g:130:4: (lv_members_4_0= ruleMethod )
            	    {
            	    // InternalPcode.g:130:4: (lv_members_4_0= ruleMethod )
            	    // InternalPcode.g:131:5: lv_members_4_0= ruleMethod
            	    {

            	    					newCompositeNode(grammarAccess.getPseudoClassAccess().getMembersMethodParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_members_4_0=ruleMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPseudoClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_4_0,
            	    						"tdt4250.pseudocode.Pcode.Method");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRuleConstructor"
    // InternalPcode.g:152:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalPcode.g:152:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalPcode.g:153:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalPcode.g:159:1: ruleConstructor returns [EObject current=null] : ( () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:165:2: ( ( () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')' ) )
            // InternalPcode.g:166:2: ( () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')' )
            {
            // InternalPcode.g:166:2: ( () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')' )
            // InternalPcode.g:167:3: () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')'
            {
            // InternalPcode.g:167:3: ()
            // InternalPcode.g:168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            // InternalPcode.g:174:3: ( (lv_name_1_0= '(' ) )
            // InternalPcode.g:175:4: (lv_name_1_0= '(' )
            {
            // InternalPcode.g:175:4: (lv_name_1_0= '(' )
            // InternalPcode.g:176:5: lv_name_1_0= '('
            {
            lv_name_1_0=(Token)match(input,13,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstructorAccess().getNameLeftParenthesisKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructorRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "(");
            				

            }


            }

            // InternalPcode.g:188:3: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPcode.g:189:4: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
            	    {
            	    // InternalPcode.g:189:4: ( (lv_parameters_2_0= ruleParameter ) )
            	    // InternalPcode.g:190:5: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalPcode.g:190:5: (lv_parameters_2_0= ruleParameter )
            	    // InternalPcode.g:191:6: lv_parameters_2_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_2_0,
            	    							"tdt4250.pseudocode.Pcode.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPcode.g:208:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==14) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalPcode.g:209:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0());
            	    	    				
            	    	    // InternalPcode.g:213:5: ( (lv_parameters_4_0= ruleParameter ) )
            	    	    // InternalPcode.g:214:6: (lv_parameters_4_0= ruleParameter )
            	    	    {
            	    	    // InternalPcode.g:214:6: (lv_parameters_4_0= ruleParameter )
            	    	    // InternalPcode.g:215:7: lv_parameters_4_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_2_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_parameters_4_0=ruleParameter();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getConstructorRule());
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

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleMethod"
    // InternalPcode.g:242:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalPcode.g:242:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalPcode.g:243:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalPcode.g:249:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:255:2: ( ( () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) ) ) )
            // InternalPcode.g:256:2: ( () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) ) )
            {
            // InternalPcode.g:256:2: ( () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) ) )
            // InternalPcode.g:257:3: () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) )
            {
            // InternalPcode.g:257:3: ()
            // InternalPcode.g:258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
            		
            // InternalPcode.g:268:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:269:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:269:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:270:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.pseudocode.Pcode.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPcode.g:291:3: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPcode.g:292:4: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            	    {
            	    // InternalPcode.g:292:4: ( (lv_parameters_4_0= ruleParameter ) )
            	    // InternalPcode.g:293:5: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // InternalPcode.g:293:5: (lv_parameters_4_0= ruleParameter )
            	    // InternalPcode.g:294:6: lv_parameters_4_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_parameters_4_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_4_0,
            	    							"tdt4250.pseudocode.Pcode.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPcode.g:311:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==14) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalPcode.g:312:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getCommaKeyword_4_1_0());
            	    	    				
            	    	    // InternalPcode.g:316:5: ( (lv_parameters_6_0= ruleParameter ) )
            	    	    // InternalPcode.g:317:6: (lv_parameters_6_0= ruleParameter )
            	    	    {
            	    	    // InternalPcode.g:317:6: (lv_parameters_6_0= ruleParameter )
            	    	    // InternalPcode.g:318:7: lv_parameters_6_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_4_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_parameters_6_0=ruleParameter();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
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
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
            		
            // InternalPcode.g:341:3: ( (lv_body_8_0= ruleBody ) )
            // InternalPcode.g:342:4: (lv_body_8_0= ruleBody )
            {
            // InternalPcode.g:342:4: (lv_body_8_0= ruleBody )
            // InternalPcode.g:343:5: lv_body_8_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getBodyBodyParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_8_0=ruleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_8_0,
            						"tdt4250.pseudocode.Pcode.Body");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleBody"
    // InternalPcode.g:364:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalPcode.g:364:45: (iv_ruleBody= ruleBody EOF )
            // InternalPcode.g:365:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalPcode.g:371:1: ruleBody returns [EObject current=null] : ( () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) ) ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_1 = null;

        EObject lv_statements_1_2 = null;

        EObject lv_statements_1_3 = null;

        EObject lv_statements_1_4 = null;

        EObject lv_statements_1_5 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:377:2: ( ( () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) ) ) )
            // InternalPcode.g:378:2: ( () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) ) )
            {
            // InternalPcode.g:378:2: ( () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) ) )
            // InternalPcode.g:379:3: () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) )
            {
            // InternalPcode.g:379:3: ()
            // InternalPcode.g:380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            // InternalPcode.g:386:3: ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalPcode.g:387:4: ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) )
            	    {
            	    // InternalPcode.g:387:4: ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) )
            	    // InternalPcode.g:388:5: (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop )
            	    {
            	    // InternalPcode.g:388:5: (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop )
            	    int alt7=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_STRING:
            	    case RULE_ID:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt7=4;
            	        }
            	        break;
            	    case 37:
            	    case 38:
            	    case 39:
            	    case 40:
            	        {
            	        alt7=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // InternalPcode.g:389:6: lv_statements_1_1= ruleVariable
            	            {

            	            						newCompositeNode(grammarAccess.getBodyAccess().getStatementsVariableParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_9);
            	            lv_statements_1_1=ruleVariable();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBodyRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_1_1,
            	            							"tdt4250.pseudocode.Pcode.Variable");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalPcode.g:405:6: lv_statements_1_2= ruleIf
            	            {

            	            						newCompositeNode(grammarAccess.getBodyAccess().getStatementsIfParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_9);
            	            lv_statements_1_2=ruleIf();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBodyRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_1_2,
            	            							"tdt4250.pseudocode.Pcode.If");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalPcode.g:421:6: lv_statements_1_3= ruleFor
            	            {

            	            						newCompositeNode(grammarAccess.getBodyAccess().getStatementsForParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_9);
            	            lv_statements_1_3=ruleFor();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBodyRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_1_3,
            	            							"tdt4250.pseudocode.Pcode.For");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalPcode.g:437:6: lv_statements_1_4= ruleWhile
            	            {

            	            						newCompositeNode(grammarAccess.getBodyAccess().getStatementsWhileParserRuleCall_1_0_3());
            	            					
            	            pushFollow(FOLLOW_9);
            	            lv_statements_1_4=ruleWhile();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBodyRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_1_4,
            	            							"tdt4250.pseudocode.Pcode.While");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalPcode.g:453:6: lv_statements_1_5= ruleStop
            	            {

            	            						newCompositeNode(grammarAccess.getBodyAccess().getStatementsStopParserRuleCall_1_0_4());
            	            					
            	            pushFollow(FOLLOW_9);
            	            lv_statements_1_5=ruleStop();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBodyRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_1_5,
            	            							"tdt4250.pseudocode.Pcode.Stop");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalPcode.g:471:3: ( (lv_statements_2_0= ruleStop ) )
            // InternalPcode.g:472:4: (lv_statements_2_0= ruleStop )
            {
            // InternalPcode.g:472:4: (lv_statements_2_0= ruleStop )
            // InternalPcode.g:473:5: lv_statements_2_0= ruleStop
            {

            					newCompositeNode(grammarAccess.getBodyAccess().getStatementsStopParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_statements_2_0=ruleStop();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBodyRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_2_0,
            						"tdt4250.pseudocode.Pcode.Stop");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleVariable"
    // InternalPcode.g:494:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPcode.g:494:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPcode.g:495:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPcode.g:501:1: ruleVariable returns [EObject current=null] : ( () ruleEString otherlv_2= '=' ruleType ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPcode.g:507:2: ( ( () ruleEString otherlv_2= '=' ruleType ) )
            // InternalPcode.g:508:2: ( () ruleEString otherlv_2= '=' ruleType )
            {
            // InternalPcode.g:508:2: ( () ruleEString otherlv_2= '=' ruleType )
            // InternalPcode.g:509:3: () ruleEString otherlv_2= '=' ruleType
            {
            // InternalPcode.g:509:3: ()
            // InternalPcode.g:510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getVariableAccess().getEStringParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		

            			newCompositeNode(grammarAccess.getVariableAccess().getTypeParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleIf"
    // InternalPcode.g:538:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalPcode.g:538:43: (iv_ruleIf= ruleIf EOF )
            // InternalPcode.g:539:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalPcode.g:545:1: ruleIf returns [EObject current=null] : ( () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) )* (otherlv_11= 'elseif' ( (otherlv_12= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_18= 'else' )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalPcode.g:551:2: ( ( () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) )* (otherlv_11= 'elseif' ( (otherlv_12= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_18= 'else' )? ) )
            // InternalPcode.g:552:2: ( () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) )* (otherlv_11= 'elseif' ( (otherlv_12= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_18= 'else' )? )
            {
            // InternalPcode.g:552:2: ( () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) )* (otherlv_11= 'elseif' ( (otherlv_12= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_18= 'else' )? )
            // InternalPcode.g:553:3: () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) )* (otherlv_11= 'elseif' ( (otherlv_12= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_18= 'else' )?
            {
            // InternalPcode.g:553:3: ()
            // InternalPcode.g:554:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalPcode.g:564:3: ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) )*
            loop10:
            do {
                int alt10=5;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(2) ) {
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                        {
                        alt10=3;
                        }
                        break;
                    case 20:
                    case 21:
                        {
                        alt10=4;
                        }
                        break;
                    case EOF:
                    case RULE_INT:
                    case RULE_DOUBLE:
                    case RULE_STRING:
                    case RULE_ID:
                    case 18:
                    case 19:
                    case 22:
                    case 23:
                    case 24:
                    case 35:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        {
                        alt10=2;
                        }
                        break;

                    }

                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(2) ) {
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                        {
                        alt10=3;
                        }
                        break;
                    case 20:
                    case 21:
                        {
                        alt10=4;
                        }
                        break;
                    case EOF:
                    case RULE_INT:
                    case RULE_DOUBLE:
                    case RULE_STRING:
                    case RULE_ID:
                    case 18:
                    case 19:
                    case 22:
                    case 23:
                    case 24:
                    case 35:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        {
                        alt10=2;
                        }
                        break;

                    }

                    }
                    break;
                case 19:
                    {
                    alt10=1;
                    }
                    break;
                case RULE_INT:
                case RULE_DOUBLE:
                    {
                    alt10=3;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // InternalPcode.g:565:4: (otherlv_2= '!' ruleEString )
            	    {
            	    // InternalPcode.g:565:4: (otherlv_2= '!' ruleEString )
            	    // InternalPcode.g:566:5: otherlv_2= '!' ruleEString
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getIfAccess().getExclamationMarkKeyword_2_0_0());
            	    				

            	    					newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_2_0_1());
            	    				
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPcode.g:579:4: ruleEString
            	    {

            	    				newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_12);
            	    ruleEString();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalPcode.g:587:4: ( ruleType ruleEqualVariable ruleType )
            	    {
            	    // InternalPcode.g:587:4: ( ruleType ruleEqualVariable ruleType )
            	    // InternalPcode.g:588:5: ruleType ruleEqualVariable ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getTypeParserRuleCall_2_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    ruleType();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    					newCompositeNode(grammarAccess.getIfAccess().getEqualVariableParserRuleCall_2_2_1());
            	    				
            	    pushFollow(FOLLOW_11);
            	    ruleEqualVariable();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    					newCompositeNode(grammarAccess.getIfAccess().getTypeParserRuleCall_2_2_2());
            	    				
            	    pushFollow(FOLLOW_12);
            	    ruleType();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPcode.g:611:4: ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' )
            	    {
            	    // InternalPcode.g:611:4: ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' )
            	    // InternalPcode.g:612:5: ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists'
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_2_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				
            	    // InternalPcode.g:619:5: (otherlv_9= 'not' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==20) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalPcode.g:620:6: otherlv_9= 'not'
            	            {
            	            otherlv_9=(Token)match(input,20,FOLLOW_15); 

            	            						newLeafNode(otherlv_9, grammarAccess.getIfAccess().getNotKeyword_2_3_1());
            	            					

            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,21,FOLLOW_12); 

            	    					newLeafNode(otherlv_10, grammarAccess.getIfAccess().getExistsKeyword_2_3_2());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalPcode.g:631:3: (otherlv_11= 'elseif' ( (otherlv_12= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPcode.g:632:4: otherlv_11= 'elseif' ( (otherlv_12= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) )
            	    {
            	    otherlv_11=(Token)match(input,22,FOLLOW_16); 

            	    				newLeafNode(otherlv_11, grammarAccess.getIfAccess().getElseifKeyword_3_0());
            	    			
            	    // InternalPcode.g:636:4: ( (otherlv_12= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) )
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case 19:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        int LA11_2 = input.LA(2);

            	        if ( ((LA11_2>=41 && LA11_2<=46)) ) {
            	            alt11=3;
            	        }
            	        else if ( (LA11_2==EOF||(LA11_2>=RULE_STRING && LA11_2<=RULE_ID)||LA11_2==18||(LA11_2>=22 && LA11_2<=24)||LA11_2==35||(LA11_2>=37 && LA11_2<=40)) ) {
            	            alt11=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 11, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        int LA11_3 = input.LA(2);

            	        if ( (LA11_3==EOF||(LA11_3>=RULE_STRING && LA11_3<=RULE_ID)||LA11_3==18||(LA11_3>=22 && LA11_3<=24)||LA11_3==35||(LA11_3>=37 && LA11_3<=40)) ) {
            	            alt11=2;
            	        }
            	        else if ( ((LA11_3>=41 && LA11_3<=46)) ) {
            	            alt11=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 11, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_INT:
            	    case RULE_DOUBLE:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalPcode.g:637:5: (otherlv_12= '!' ruleEString )
            	            {
            	            // InternalPcode.g:637:5: (otherlv_12= '!' ruleEString )
            	            // InternalPcode.g:638:6: otherlv_12= '!' ruleEString
            	            {
            	            otherlv_12=(Token)match(input,19,FOLLOW_3); 

            	            						newLeafNode(otherlv_12, grammarAccess.getIfAccess().getExclamationMarkKeyword_3_1_0_0());
            	            					

            	            						newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_3_1_0_1());
            	            					
            	            pushFollow(FOLLOW_17);
            	            ruleEString();

            	            state._fsp--;


            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPcode.g:651:5: ruleEString
            	            {

            	            					newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_3_1_1());
            	            				
            	            pushFollow(FOLLOW_17);
            	            ruleEString();

            	            state._fsp--;


            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalPcode.g:659:5: ( ruleType ruleEqualVariable ruleType )
            	            {
            	            // InternalPcode.g:659:5: ( ruleType ruleEqualVariable ruleType )
            	            // InternalPcode.g:660:6: ruleType ruleEqualVariable ruleType
            	            {

            	            						newCompositeNode(grammarAccess.getIfAccess().getTypeParserRuleCall_3_1_2_0());
            	            					
            	            pushFollow(FOLLOW_13);
            	            ruleType();

            	            state._fsp--;


            	            						afterParserOrEnumRuleCall();
            	            					

            	            						newCompositeNode(grammarAccess.getIfAccess().getEqualVariableParserRuleCall_3_1_2_1());
            	            					
            	            pushFollow(FOLLOW_11);
            	            ruleEqualVariable();

            	            state._fsp--;


            	            						afterParserOrEnumRuleCall();
            	            					

            	            						newCompositeNode(grammarAccess.getIfAccess().getTypeParserRuleCall_3_1_2_2());
            	            					
            	            pushFollow(FOLLOW_17);
            	            ruleType();

            	            state._fsp--;


            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalPcode.g:684:3: (otherlv_18= 'else' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPcode.g:685:4: otherlv_18= 'else'
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getIfAccess().getElseKeyword_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleFor"
    // InternalPcode.g:694:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalPcode.g:694:44: (iv_ruleFor= ruleFor EOF )
            // InternalPcode.g:695:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalPcode.g:701:1: ruleFor returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_INT_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_INT_15=null;
        Token otherlv_16=null;
        Token this_INT_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token this_INT_24=null;
        Token otherlv_25=null;
        Token this_INT_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;


        	enterRule();

        try {
            // InternalPcode.g:707:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' ) )
            // InternalPcode.g:708:2: ( () otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' )
            {
            // InternalPcode.g:708:2: ( () otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' )
            // InternalPcode.g:709:3: () otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')'
            {
            // InternalPcode.g:709:3: ()
            // InternalPcode.g:710:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForAccess().getForAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getForAccess().getForKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getForAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPcode.g:724:3: ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==17) ) {
                    alt15=1;
                }
                else if ( (LA15_1==30) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==17) ) {
                    alt15=1;
                }
                else if ( (LA15_2==30) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPcode.g:725:4: ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) )
                    {
                    // InternalPcode.g:725:4: ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) )
                    // InternalPcode.g:726:5: ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) )
                    {

                    					newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_3_0_0());
                    				
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_4=(Token)match(input,17,FOLLOW_19); 

                    					newLeafNode(otherlv_4, grammarAccess.getForAccess().getEqualsSignKeyword_3_0_1());
                    				
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_20); 

                    					newLeafNode(this_INT_5, grammarAccess.getForAccess().getINTTerminalRuleCall_3_0_2());
                    				
                    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getForAccess().getSemicolonKeyword_3_0_3());
                    				

                    					newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_3_0_4());
                    				
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getForAccess().getEqualVariableParserRuleCall_3_0_5());
                    				
                    pushFollow(FOLLOW_11);
                    ruleEqualVariable();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getForAccess().getTypeParserRuleCall_3_0_6());
                    				
                    pushFollow(FOLLOW_20);
                    ruleType();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_10=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(otherlv_10, grammarAccess.getForAccess().getSemicolonKeyword_3_0_7());
                    				

                    					newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_3_0_8());
                    				
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalPcode.g:777:5: (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) )
                    int alt14=4;
                    switch ( input.LA(1) ) {
                    case 26:
                        {
                        alt14=1;
                        }
                        break;
                    case 27:
                        {
                        alt14=2;
                        }
                        break;
                    case 28:
                        {
                        alt14=3;
                        }
                        break;
                    case 29:
                        {
                        alt14=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // InternalPcode.g:778:6: otherlv_12= '++'
                            {
                            otherlv_12=(Token)match(input,26,FOLLOW_22); 

                            						newLeafNode(otherlv_12, grammarAccess.getForAccess().getPlusSignPlusSignKeyword_3_0_9_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalPcode.g:783:6: otherlv_13= '--'
                            {
                            otherlv_13=(Token)match(input,27,FOLLOW_22); 

                            						newLeafNode(otherlv_13, grammarAccess.getForAccess().getHyphenMinusHyphenMinusKeyword_3_0_9_1());
                            					

                            }
                            break;
                        case 3 :
                            // InternalPcode.g:788:6: (otherlv_14= '+' this_INT_15= RULE_INT )
                            {
                            // InternalPcode.g:788:6: (otherlv_14= '+' this_INT_15= RULE_INT )
                            // InternalPcode.g:789:7: otherlv_14= '+' this_INT_15= RULE_INT
                            {
                            otherlv_14=(Token)match(input,28,FOLLOW_19); 

                            							newLeafNode(otherlv_14, grammarAccess.getForAccess().getPlusSignKeyword_3_0_9_2_0());
                            						
                            this_INT_15=(Token)match(input,RULE_INT,FOLLOW_22); 

                            							newLeafNode(this_INT_15, grammarAccess.getForAccess().getINTTerminalRuleCall_3_0_9_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalPcode.g:799:6: (otherlv_16= '-' this_INT_17= RULE_INT )
                            {
                            // InternalPcode.g:799:6: (otherlv_16= '-' this_INT_17= RULE_INT )
                            // InternalPcode.g:800:7: otherlv_16= '-' this_INT_17= RULE_INT
                            {
                            otherlv_16=(Token)match(input,29,FOLLOW_19); 

                            							newLeafNode(otherlv_16, grammarAccess.getForAccess().getHyphenMinusKeyword_3_0_9_3_0());
                            						
                            this_INT_17=(Token)match(input,RULE_INT,FOLLOW_22); 

                            							newLeafNode(this_INT_17, grammarAccess.getForAccess().getINTTerminalRuleCall_3_0_9_3_1());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPcode.g:812:4: ( ruleEString otherlv_19= ':' ruleEString )
                    {
                    // InternalPcode.g:812:4: ( ruleEString otherlv_19= ':' ruleEString )
                    // InternalPcode.g:813:5: ruleEString otherlv_19= ':' ruleEString
                    {

                    					newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_3_1_0());
                    				
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_19=(Token)match(input,30,FOLLOW_3); 

                    					newLeafNode(otherlv_19, grammarAccess.getForAccess().getColonKeyword_3_1_1());
                    				

                    					newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_3_1_2());
                    				
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalPcode.g:833:4: (otherlv_21= 'all' ruleEString )
                    {
                    // InternalPcode.g:833:4: (otherlv_21= 'all' ruleEString )
                    // InternalPcode.g:834:5: otherlv_21= 'all' ruleEString
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_3); 

                    					newLeafNode(otherlv_21, grammarAccess.getForAccess().getAllKeyword_3_2_0());
                    				

                    					newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_3_2_1());
                    				
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalPcode.g:847:4: (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString )
                    {
                    // InternalPcode.g:847:4: (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString )
                    // InternalPcode.g:848:5: otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString
                    {
                    otherlv_23=(Token)match(input,32,FOLLOW_19); 

                    					newLeafNode(otherlv_23, grammarAccess.getForAccess().getIntervalKeyword_3_3_0());
                    				
                    this_INT_24=(Token)match(input,RULE_INT,FOLLOW_24); 

                    					newLeafNode(this_INT_24, grammarAccess.getForAccess().getINTTerminalRuleCall_3_3_1());
                    				
                    otherlv_25=(Token)match(input,33,FOLLOW_19); 

                    					newLeafNode(otherlv_25, grammarAccess.getForAccess().getToKeyword_3_3_2());
                    				
                    this_INT_26=(Token)match(input,RULE_INT,FOLLOW_25); 

                    					newLeafNode(this_INT_26, grammarAccess.getForAccess().getINTTerminalRuleCall_3_3_3());
                    				
                    otherlv_27=(Token)match(input,34,FOLLOW_3); 

                    					newLeafNode(otherlv_27, grammarAccess.getForAccess().getInKeyword_3_3_4());
                    				

                    					newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_3_3_5());
                    				
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getForAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // InternalPcode.g:885:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalPcode.g:885:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalPcode.g:886:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalPcode.g:892:1: ruleWhile returns [EObject current=null] : ( () otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPcode.g:898:2: ( ( () otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) ) )
            // InternalPcode.g:899:2: ( () otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) )
            {
            // InternalPcode.g:899:2: ( () otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) )
            // InternalPcode.g:900:3: () otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) )
            {
            // InternalPcode.g:900:3: ()
            // InternalPcode.g:901:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileAccess().getWhileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getWhileKeyword_1());
            		
            // InternalPcode.g:911:3: (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)||LA17_0==19) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPcode.g:912:4: otherlv_2= 'true'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getTrueKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPcode.g:917:4: ( (otherlv_3= '!' )? ruleEString )
                    {
                    // InternalPcode.g:917:4: ( (otherlv_3= '!' )? ruleEString )
                    // InternalPcode.g:918:5: (otherlv_3= '!' )? ruleEString
                    {
                    // InternalPcode.g:918:5: (otherlv_3= '!' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==19) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPcode.g:919:6: otherlv_3= '!'
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_3); 

                            						newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getExclamationMarkKeyword_2_1_0());
                            					

                            }
                            break;

                    }


                    					newCompositeNode(grammarAccess.getWhileAccess().getEStringParserRuleCall_2_1_1());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleParameter"
    // InternalPcode.g:937:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPcode.g:937:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPcode.g:938:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPcode.g:944:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:950:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPcode.g:951:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPcode.g:951:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPcode.g:952:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPcode.g:952:3: ()
            // InternalPcode.g:953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalPcode.g:959:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPcode.g:960:4: (lv_name_1_0= ruleEString )
            {
            // InternalPcode.g:960:4: (lv_name_1_0= ruleEString )
            // InternalPcode.g:961:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
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


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleStop"
    // InternalPcode.g:982:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalPcode.g:982:45: (iv_ruleStop= ruleStop EOF )
            // InternalPcode.g:983:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPcode.g:989:1: ruleStop returns [EObject current=null] : ( () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalPcode.g:995:2: ( ( () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' ) ) )
            // InternalPcode.g:996:2: ( () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' ) )
            {
            // InternalPcode.g:996:2: ( () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' ) )
            // InternalPcode.g:997:3: () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' )
            {
            // InternalPcode.g:997:3: ()
            // InternalPcode.g:998:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStopAccess().getStopAction_0(),
            					current);
            			

            }

            // InternalPcode.g:1004:3: ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt18=1;
                }
                break;
            case 38:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            case 40:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPcode.g:1005:4: (otherlv_1= 'return' ruleType )
                    {
                    // InternalPcode.g:1005:4: (otherlv_1= 'return' ruleType )
                    // InternalPcode.g:1006:5: otherlv_1= 'return' ruleType
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_11); 

                    					newLeafNode(otherlv_1, grammarAccess.getStopAccess().getReturnKeyword_1_0_0());
                    				

                    					newCompositeNode(grammarAccess.getStopAccess().getTypeParserRuleCall_1_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalPcode.g:1019:4: otherlv_3= 'stop'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStopAccess().getStopKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPcode.g:1024:4: otherlv_4= 'break'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStopAccess().getBreakKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPcode.g:1029:4: otherlv_5= 'continue'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getStopAccess().getContinueKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleType"
    // InternalPcode.g:1038:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalPcode.g:1038:44: (iv_ruleType= ruleType EOF )
            // InternalPcode.g:1039:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPcode.g:1045:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:1051:2: ( (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) )
            // InternalPcode.g:1052:2: (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            {
            // InternalPcode.g:1052:2: (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt19=2;
                }
                break;
            case RULE_INT:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPcode.g:1053:3: this_EString_0= ruleEString
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EString_0=ruleEString();

                    state._fsp--;


                    			current.merge(this_EString_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPcode.g:1064:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_1);
                    		

                    			newLeafNode(this_DOUBLE_1, grammarAccess.getTypeAccess().getDOUBLETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPcode.g:1072:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getTypeAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEqualVariable"
    // InternalPcode.g:1083:1: entryRuleEqualVariable returns [String current=null] : iv_ruleEqualVariable= ruleEqualVariable EOF ;
    public final String entryRuleEqualVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualVariable = null;


        try {
            // InternalPcode.g:1083:53: (iv_ruleEqualVariable= ruleEqualVariable EOF )
            // InternalPcode.g:1084:2: iv_ruleEqualVariable= ruleEqualVariable EOF
            {
             newCompositeNode(grammarAccess.getEqualVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualVariable=ruleEqualVariable();

            state._fsp--;

             current =iv_ruleEqualVariable.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEqualVariable"


    // $ANTLR start "ruleEqualVariable"
    // InternalPcode.g:1090:1: ruleEqualVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcode.g:1096:2: ( (kw= '==' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!=' ) )
            // InternalPcode.g:1097:2: (kw= '==' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!=' )
            {
            // InternalPcode.g:1097:2: (kw= '==' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!=' )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt20=1;
                }
                break;
            case 42:
                {
                alt20=2;
                }
                break;
            case 43:
                {
                alt20=3;
                }
                break;
            case 44:
                {
                alt20=4;
                }
                break;
            case 45:
                {
                alt20=5;
                }
                break;
            case 46:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPcode.g:1098:3: kw= '=='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPcode.g:1104:3: kw= '<'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPcode.g:1110:3: kw= '<='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPcode.g:1116:3: kw= '>'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPcode.g:1122:3: kw= '>='
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPcode.g:1128:3: kw= '!='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getExclamationMarkEqualsSignKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualVariable"


    // $ANTLR start "entryRuleEString"
    // InternalPcode.g:1137:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPcode.g:1137:47: (iv_ruleEString= ruleEString EOF )
            // InternalPcode.g:1138:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalPcode.g:1144:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPcode.g:1150:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPcode.g:1151:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPcode.g:1151:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPcode.g:1152:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPcode.g:1160:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\2\uffff\3\12\1\uffff\4\12\1\uffff";
    static final String dfa_3s = "\1\6\1\4\3\6\1\uffff\4\6\1\uffff";
    static final String dfa_4s = "\1\50\1\7\3\50\1\uffff\4\50\1\uffff";
    static final String dfa_5s = "\5\uffff\1\1\4\uffff\1\2";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\2\5\12\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\1\1\1\2\1\3\1\4",
            "\1\11\1\10\1\6\1\7",
            "\2\5\10\uffff\1\12\1\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\4\5",
            "\2\5\10\uffff\1\12\1\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\4\5",
            "\2\5\10\uffff\1\12\1\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\4\5",
            "",
            "\2\5\10\uffff\1\12\1\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\4\5",
            "\2\5\10\uffff\1\12\1\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\4\5",
            "\2\5\10\uffff\1\12\1\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\4\5",
            "\2\5\10\uffff\1\12\1\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\4\5",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 386:3: ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C0C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000001E8010400C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C800F2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001800000C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000010000800C0L});

}