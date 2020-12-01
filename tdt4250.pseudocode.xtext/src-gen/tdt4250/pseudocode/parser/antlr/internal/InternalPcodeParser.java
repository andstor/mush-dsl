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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'end_class'", "'('", "','", "')'", "'method'", "'end_method'", "'print'", "'\"'", "'='", "'+='", "'-='", "'_'", "'if'", "'!'", "'not'", "'exists'", "'knowing'", "'else'", "'for'", "';'", "'++'", "'--'", "'+'", "'-'", "':'", "'all'", "'interval'", "'to'", "'in'", "'repeat'", "'times'", "'while'", "'true'", "'until'", "'or'", "'and'", "'=='", "'!='", "'return'", "'stop'", "'break'", "'continue'", "'<'", "'<='", "'>'", "'>='", "'*'", "'/'", "'%'", "'total'", "'division'"
    };
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
    public static final int RULE_INT=4;
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
    // InternalPcode.g:72:1: rulePseudoClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )* otherlv_5= 'end_class' ) ;
    public final EObject rulePseudoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_members_3_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:78:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )* otherlv_5= 'end_class' ) )
            // InternalPcode.g:79:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )* otherlv_5= 'end_class' )
            {
            // InternalPcode.g:79:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )* otherlv_5= 'end_class' )
            // InternalPcode.g:80:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) ( (lv_members_3_0= ruleConstructor ) )* ( (lv_members_4_0= ruleMethod ) )* otherlv_5= 'end_class'
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

                if ( (LA1_0==14) ) {
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

                if ( (LA2_0==17) ) {
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

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPseudoClassAccess().getEnd_classKeyword_5());
            		

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
    // InternalPcode.g:156:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalPcode.g:156:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalPcode.g:157:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalPcode.g:163:1: ruleConstructor returns [EObject current=null] : ( () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:169:2: ( ( () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')' ) )
            // InternalPcode.g:170:2: ( () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')' )
            {
            // InternalPcode.g:170:2: ( () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')' )
            // InternalPcode.g:171:3: () ( (lv_name_1_0= '(' ) ) ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )* otherlv_5= ')'
            {
            // InternalPcode.g:171:3: ()
            // InternalPcode.g:172:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            // InternalPcode.g:178:3: ( (lv_name_1_0= '(' ) )
            // InternalPcode.g:179:4: (lv_name_1_0= '(' )
            {
            // InternalPcode.g:179:4: (lv_name_1_0= '(' )
            // InternalPcode.g:180:5: lv_name_1_0= '('
            {
            lv_name_1_0=(Token)match(input,14,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstructorAccess().getNameLeftParenthesisKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructorRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "(");
            				

            }


            }

            // InternalPcode.g:192:3: ( ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPcode.g:193:4: ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
            	    {
            	    // InternalPcode.g:193:4: ( (lv_parameters_2_0= ruleParameter ) )
            	    // InternalPcode.g:194:5: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalPcode.g:194:5: (lv_parameters_2_0= ruleParameter )
            	    // InternalPcode.g:195:6: lv_parameters_2_0= ruleParameter
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

            	    // InternalPcode.g:212:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalPcode.g:213:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getCommaKeyword_2_1_0());
            	    	    				
            	    	    // InternalPcode.g:217:5: ( (lv_parameters_4_0= ruleParameter ) )
            	    	    // InternalPcode.g:218:6: (lv_parameters_4_0= ruleParameter )
            	    	    {
            	    	    // InternalPcode.g:218:6: (lv_parameters_4_0= ruleParameter )
            	    	    // InternalPcode.g:219:7: lv_parameters_4_0= ruleParameter
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

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalPcode.g:246:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalPcode.g:246:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalPcode.g:247:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalPcode.g:253:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) ) otherlv_9= 'end_method' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:259:2: ( ( () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) ) otherlv_9= 'end_method' ) )
            // InternalPcode.g:260:2: ( () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) ) otherlv_9= 'end_method' )
            {
            // InternalPcode.g:260:2: ( () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) ) otherlv_9= 'end_method' )
            // InternalPcode.g:261:3: () otherlv_1= 'method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )* otherlv_7= ')' ( (lv_body_8_0= ruleBody ) ) otherlv_9= 'end_method'
            {
            // InternalPcode.g:261:3: ()
            // InternalPcode.g:262:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
            		
            // InternalPcode.g:272:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:273:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:273:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:274:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPcode.g:295:3: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPcode.g:296:4: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            	    {
            	    // InternalPcode.g:296:4: ( (lv_parameters_4_0= ruleParameter ) )
            	    // InternalPcode.g:297:5: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // InternalPcode.g:297:5: (lv_parameters_4_0= ruleParameter )
            	    // InternalPcode.g:298:6: lv_parameters_4_0= ruleParameter
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

            	    // InternalPcode.g:315:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==15) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalPcode.g:316:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,15,FOLLOW_3); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getCommaKeyword_4_1_0());
            	    	    				
            	    	    // InternalPcode.g:320:5: ( (lv_parameters_6_0= ruleParameter ) )
            	    	    // InternalPcode.g:321:6: (lv_parameters_6_0= ruleParameter )
            	    	    {
            	    	    // InternalPcode.g:321:6: (lv_parameters_6_0= ruleParameter )
            	    	    // InternalPcode.g:322:7: lv_parameters_6_0= ruleParameter
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

            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
            		
            // InternalPcode.g:345:3: ( (lv_body_8_0= ruleBody ) )
            // InternalPcode.g:346:4: (lv_body_8_0= ruleBody )
            {
            // InternalPcode.g:346:4: (lv_body_8_0= ruleBody )
            // InternalPcode.g:347:5: lv_body_8_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getBodyBodyParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getEnd_methodKeyword_7());
            		

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
    // InternalPcode.g:372:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalPcode.g:372:45: (iv_ruleBody= ruleBody EOF )
            // InternalPcode.g:373:2: iv_ruleBody= ruleBody EOF
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
    // InternalPcode.g:379:1: ruleBody returns [EObject current=null] : ( () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) ) ) ;
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
            // InternalPcode.g:385:2: ( ( () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) ) ) )
            // InternalPcode.g:386:2: ( () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) ) )
            {
            // InternalPcode.g:386:2: ( () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) ) )
            // InternalPcode.g:387:3: () ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )* ( (lv_statements_2_0= ruleStop ) )
            {
            // InternalPcode.g:387:3: ()
            // InternalPcode.g:388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            // InternalPcode.g:394:3: ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalPcode.g:395:4: ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) )
            	    {
            	    // InternalPcode.g:395:4: ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) )
            	    // InternalPcode.g:396:5: (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop )
            	    {
            	    // InternalPcode.g:396:5: (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop )
            	    int alt7=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_STRING:
            	    case RULE_ID:
            	    case 19:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        int LA7_4 = input.LA(2);

            	        if ( (LA7_4==RULE_INT) ) {
            	            alt7=3;
            	        }
            	        else if ( (LA7_4==46) ) {
            	            alt7=4;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 7, 4, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt7=4;
            	        }
            	        break;
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 54:
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
            	            // InternalPcode.g:397:6: lv_statements_1_1= ruleVariable
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
            	            // InternalPcode.g:413:6: lv_statements_1_2= ruleIf
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
            	            // InternalPcode.g:429:6: lv_statements_1_3= ruleFor
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
            	            // InternalPcode.g:445:6: lv_statements_1_4= ruleWhile
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
            	            // InternalPcode.g:461:6: lv_statements_1_5= ruleStop
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

            // InternalPcode.g:479:3: ( (lv_statements_2_0= ruleStop ) )
            // InternalPcode.g:480:4: (lv_statements_2_0= ruleStop )
            {
            // InternalPcode.g:480:4: (lv_statements_2_0= ruleStop )
            // InternalPcode.g:481:5: lv_statements_2_0= ruleStop
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
    // InternalPcode.g:502:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPcode.g:502:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPcode.g:503:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalPcode.g:509:1: ruleVariable returns [EObject current=null] : ( () ( (lv_expressions_1_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:515:2: ( ( () ( (lv_expressions_1_0= ruleExpression ) ) ) )
            // InternalPcode.g:516:2: ( () ( (lv_expressions_1_0= ruleExpression ) ) )
            {
            // InternalPcode.g:516:2: ( () ( (lv_expressions_1_0= ruleExpression ) ) )
            // InternalPcode.g:517:3: () ( (lv_expressions_1_0= ruleExpression ) )
            {
            // InternalPcode.g:517:3: ()
            // InternalPcode.g:518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalPcode.g:524:3: ( (lv_expressions_1_0= ruleExpression ) )
            // InternalPcode.g:525:4: (lv_expressions_1_0= ruleExpression )
            {
            // InternalPcode.g:525:4: (lv_expressions_1_0= ruleExpression )
            // InternalPcode.g:526:5: lv_expressions_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getExpressionsExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expressions_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_1_0,
            						"tdt4250.pseudocode.Pcode.Expression");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalPcode.g:547:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPcode.g:547:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPcode.g:548:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalPcode.g:554:1: ruleExpression returns [EObject current=null] : ( () ( (otherlv_1= 'print' ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )* ) | ( ruleEString (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' ) ruleType ( ruleMathSigns ruleType )* ) | ( ruleEString otherlv_16= '_' ruleType ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalPcode.g:560:2: ( ( () ( (otherlv_1= 'print' ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )* ) | ( ruleEString (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' ) ruleType ( ruleMathSigns ruleType )* ) | ( ruleEString otherlv_16= '_' ruleType ) ) ) )
            // InternalPcode.g:561:2: ( () ( (otherlv_1= 'print' ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )* ) | ( ruleEString (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' ) ruleType ( ruleMathSigns ruleType )* ) | ( ruleEString otherlv_16= '_' ruleType ) ) )
            {
            // InternalPcode.g:561:2: ( () ( (otherlv_1= 'print' ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )* ) | ( ruleEString (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' ) ruleType ( ruleMathSigns ruleType )* ) | ( ruleEString otherlv_16= '_' ruleType ) ) )
            // InternalPcode.g:562:3: () ( (otherlv_1= 'print' ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )* ) | ( ruleEString (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' ) ruleType ( ruleMathSigns ruleType )* ) | ( ruleEString otherlv_16= '_' ruleType ) )
            {
            // InternalPcode.g:562:3: ()
            // InternalPcode.g:563:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpressionAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalPcode.g:569:3: ( (otherlv_1= 'print' ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )* ) | ( ruleEString (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' ) ruleType ( ruleMathSigns ruleType )* ) | ( ruleEString otherlv_16= '_' ruleType ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt15=1;
                }
                break;
            case RULE_STRING:
                {
                int LA15_2 = input.LA(2);

                if ( ((LA15_2>=21 && LA15_2<=23)) ) {
                    alt15=2;
                }
                else if ( (LA15_2==24) ) {
                    alt15=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA15_3 = input.LA(2);

                if ( ((LA15_3>=21 && LA15_3<=23)) ) {
                    alt15=2;
                }
                else if ( (LA15_3==24) ) {
                    alt15=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPcode.g:570:4: (otherlv_1= 'print' ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )* )
                    {
                    // InternalPcode.g:570:4: (otherlv_1= 'print' ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )* )
                    // InternalPcode.g:571:5: otherlv_1= 'print' ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )*
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_11); 

                    					newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getPrintKeyword_1_0_0());
                    				
                    // InternalPcode.g:575:5: ( (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )* )*
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case RULE_STRING:
                            {
                            int LA12_2 = input.LA(2);

                            if ( (LA12_2==EOF||(LA12_2>=RULE_INT && LA12_2<=RULE_ID)||LA12_2==15||(LA12_2>=19 && LA12_2<=20)||LA12_2==25||LA12_2==31||LA12_2==42||LA12_2==44||(LA12_2>=51 && LA12_2<=54)) ) {
                                alt12=1;
                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA12_3 = input.LA(2);

                            if ( (LA12_3==EOF||(LA12_3>=RULE_INT && LA12_3<=RULE_ID)||LA12_3==15||(LA12_3>=19 && LA12_3<=20)||LA12_3==25||LA12_3==31||LA12_3==42||LA12_3==44||(LA12_3>=51 && LA12_3<=54)) ) {
                                alt12=1;
                            }


                            }
                            break;
                        case RULE_INT:
                        case RULE_DOUBLE:
                        case 20:
                            {
                            alt12=1;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // InternalPcode.g:576:6: (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )* ruleType (otherlv_6= ',' ruleType )*
                    	    {
                    	    // InternalPcode.g:576:6: (otherlv_2= '\"' ( ruleType )* otherlv_4= '\"' )*
                    	    loop10:
                    	    do {
                    	        int alt10=2;
                    	        int LA10_0 = input.LA(1);

                    	        if ( (LA10_0==20) ) {
                    	            alt10=1;
                    	        }


                    	        switch (alt10) {
                    	    	case 1 :
                    	    	    // InternalPcode.g:577:7: otherlv_2= '\"' ( ruleType )* otherlv_4= '\"'
                    	    	    {
                    	    	    otherlv_2=(Token)match(input,20,FOLLOW_12); 

                    	    	    							newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getQuotationMarkKeyword_1_0_1_0_0());
                    	    	    						
                    	    	    // InternalPcode.g:581:7: ( ruleType )*
                    	    	    loop9:
                    	    	    do {
                    	    	        int alt9=2;
                    	    	        int LA9_0 = input.LA(1);

                    	    	        if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)) ) {
                    	    	            alt9=1;
                    	    	        }


                    	    	        switch (alt9) {
                    	    	    	case 1 :
                    	    	    	    // InternalPcode.g:582:8: ruleType
                    	    	    	    {

                    	    	    	    								newCompositeNode(grammarAccess.getExpressionAccess().getTypeParserRuleCall_1_0_1_0_1());
                    	    	    	    							
                    	    	    	    pushFollow(FOLLOW_12);
                    	    	    	    ruleType();

                    	    	    	    state._fsp--;


                    	    	    	    								afterParserOrEnumRuleCall();
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    break loop9;
                    	    	        }
                    	    	    } while (true);

                    	    	    otherlv_4=(Token)match(input,20,FOLLOW_12); 

                    	    	    							newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getQuotationMarkKeyword_1_0_1_0_2());
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop10;
                    	        }
                    	    } while (true);


                    	    						newCompositeNode(grammarAccess.getExpressionAccess().getTypeParserRuleCall_1_0_1_1());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    ruleType();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					
                    	    // InternalPcode.g:602:6: (otherlv_6= ',' ruleType )*
                    	    loop11:
                    	    do {
                    	        int alt11=2;
                    	        int LA11_0 = input.LA(1);

                    	        if ( (LA11_0==15) ) {
                    	            alt11=1;
                    	        }


                    	        switch (alt11) {
                    	    	case 1 :
                    	    	    // InternalPcode.g:603:7: otherlv_6= ',' ruleType
                    	    	    {
                    	    	    otherlv_6=(Token)match(input,15,FOLLOW_12); 

                    	    	    							newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getCommaKeyword_1_0_1_2_0());
                    	    	    						

                    	    	    							newCompositeNode(grammarAccess.getExpressionAccess().getTypeParserRuleCall_1_0_1_2_1());
                    	    	    						
                    	    	    pushFollow(FOLLOW_13);
                    	    	    ruleType();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop11;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPcode.g:618:4: ( ruleEString (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' ) ruleType ( ruleMathSigns ruleType )* )
                    {
                    // InternalPcode.g:618:4: ( ruleEString (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' ) ruleType ( ruleMathSigns ruleType )* )
                    // InternalPcode.g:619:5: ruleEString (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' ) ruleType ( ruleMathSigns ruleType )*
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getEStringParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalPcode.g:626:5: (otherlv_9= '=' | otherlv_10= '+=' | otherlv_11= '-=' )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt13=1;
                        }
                        break;
                    case 22:
                        {
                        alt13=2;
                        }
                        break;
                    case 23:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // InternalPcode.g:627:6: otherlv_9= '='
                            {
                            otherlv_9=(Token)match(input,21,FOLLOW_12); 

                            						newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getEqualsSignKeyword_1_1_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalPcode.g:632:6: otherlv_10= '+='
                            {
                            otherlv_10=(Token)match(input,22,FOLLOW_12); 

                            						newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getPlusSignEqualsSignKeyword_1_1_1_1());
                            					

                            }
                            break;
                        case 3 :
                            // InternalPcode.g:637:6: otherlv_11= '-='
                            {
                            otherlv_11=(Token)match(input,23,FOLLOW_12); 

                            						newLeafNode(otherlv_11, grammarAccess.getExpressionAccess().getHyphenMinusEqualsSignKeyword_1_1_1_2());
                            					

                            }
                            break;

                    }


                    					newCompositeNode(grammarAccess.getExpressionAccess().getTypeParserRuleCall_1_1_2());
                    				
                    pushFollow(FOLLOW_15);
                    ruleType();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalPcode.g:649:5: ( ruleMathSigns ruleType )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=35 && LA14_0<=36)||(LA14_0>=59 && LA14_0<=62)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalPcode.g:650:6: ruleMathSigns ruleType
                    	    {

                    	    						newCompositeNode(grammarAccess.getExpressionAccess().getMathSignsParserRuleCall_1_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    ruleMathSigns();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    						newCompositeNode(grammarAccess.getExpressionAccess().getTypeParserRuleCall_1_1_3_1());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    ruleType();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalPcode.g:667:4: ( ruleEString otherlv_16= '_' ruleType )
                    {
                    // InternalPcode.g:667:4: ( ruleEString otherlv_16= '_' ruleType )
                    // InternalPcode.g:668:5: ruleEString otherlv_16= '_' ruleType
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getEStringParserRuleCall_1_2_0());
                    				
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_16=(Token)match(input,24,FOLLOW_12); 

                    					newLeafNode(otherlv_16, grammarAccess.getExpressionAccess().get_Keyword_1_2_1());
                    				

                    					newCompositeNode(grammarAccess.getExpressionAccess().getTypeParserRuleCall_1_2_2());
                    				
                    pushFollow(FOLLOW_2);
                    ruleType();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIf"
    // InternalPcode.g:692:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalPcode.g:692:43: (iv_ruleIf= ruleIf EOF )
            // InternalPcode.g:693:2: iv_ruleIf= ruleIf EOF
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
    // InternalPcode.g:699:1: ruleIf returns [EObject current=null] : ( () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) | ( ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString ) )* (otherlv_15= 'else' otherlv_16= 'if' ( (otherlv_17= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_23= 'else' )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_23=null;


        	enterRule();

        try {
            // InternalPcode.g:705:2: ( ( () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) | ( ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString ) )* (otherlv_15= 'else' otherlv_16= 'if' ( (otherlv_17= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_23= 'else' )? ) )
            // InternalPcode.g:706:2: ( () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) | ( ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString ) )* (otherlv_15= 'else' otherlv_16= 'if' ( (otherlv_17= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_23= 'else' )? )
            {
            // InternalPcode.g:706:2: ( () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) | ( ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString ) )* (otherlv_15= 'else' otherlv_16= 'if' ( (otherlv_17= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_23= 'else' )? )
            // InternalPcode.g:707:3: () otherlv_1= 'if' ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) | ( ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString ) )* (otherlv_15= 'else' otherlv_16= 'if' ( (otherlv_17= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )* (otherlv_23= 'else' )?
            {
            // InternalPcode.g:707:3: ()
            // InternalPcode.g:708:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalPcode.g:718:3: ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) | ( ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString ) )*
            loop18:
            do {
                int alt18=6;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalPcode.g:719:4: (otherlv_2= '!' ruleEString )
            	    {
            	    // InternalPcode.g:719:4: (otherlv_2= '!' ruleEString )
            	    // InternalPcode.g:720:5: otherlv_2= '!' ruleEString
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getIfAccess().getExclamationMarkKeyword_2_0_0());
            	    				

            	    					newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_2_0_1());
            	    				
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPcode.g:733:4: ruleEString
            	    {

            	    				newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalPcode.g:741:4: ( ruleType ruleEqualVariable ruleType )
            	    {
            	    // InternalPcode.g:741:4: ( ruleType ruleEqualVariable ruleType )
            	    // InternalPcode.g:742:5: ruleType ruleEqualVariable ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getTypeParserRuleCall_2_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    ruleType();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    					newCompositeNode(grammarAccess.getIfAccess().getEqualVariableParserRuleCall_2_2_1());
            	    				
            	    pushFollow(FOLLOW_12);
            	    ruleEqualVariable();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    					newCompositeNode(grammarAccess.getIfAccess().getTypeParserRuleCall_2_2_2());
            	    				
            	    pushFollow(FOLLOW_17);
            	    ruleType();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPcode.g:765:4: ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' )
            	    {
            	    // InternalPcode.g:765:4: ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' )
            	    // InternalPcode.g:766:5: ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists'
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_2_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				
            	    // InternalPcode.g:773:5: (otherlv_9= 'not' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==27) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalPcode.g:774:6: otherlv_9= 'not'
            	            {
            	            otherlv_9=(Token)match(input,27,FOLLOW_20); 

            	            						newLeafNode(otherlv_9, grammarAccess.getIfAccess().getNotKeyword_2_3_1());
            	            					

            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,28,FOLLOW_17); 

            	    					newLeafNode(otherlv_10, grammarAccess.getIfAccess().getExistsKeyword_2_3_2());
            	    				

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPcode.g:785:4: ( ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString )
            	    {
            	    // InternalPcode.g:785:4: ( ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString )
            	    // InternalPcode.g:786:5: ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_2_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				
            	    // InternalPcode.g:793:5: (otherlv_12= 'not' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==27) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalPcode.g:794:6: otherlv_12= 'not'
            	            {
            	            otherlv_12=(Token)match(input,27,FOLLOW_22); 

            	            						newLeafNode(otherlv_12, grammarAccess.getIfAccess().getNotKeyword_2_4_1());
            	            					

            	            }
            	            break;

            	    }

            	    otherlv_13=(Token)match(input,29,FOLLOW_3); 

            	    					newLeafNode(otherlv_13, grammarAccess.getIfAccess().getKnowingKeyword_2_4_2());
            	    				

            	    					newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_2_4_3());
            	    				
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalPcode.g:812:3: (otherlv_15= 'else' otherlv_16= 'if' ( (otherlv_17= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // InternalPcode.g:813:4: otherlv_15= 'else' otherlv_16= 'if' ( (otherlv_17= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) )
            	    {
            	    otherlv_15=(Token)match(input,30,FOLLOW_23); 

            	    				newLeafNode(otherlv_15, grammarAccess.getIfAccess().getElseKeyword_3_0());
            	    			
            	    otherlv_16=(Token)match(input,25,FOLLOW_24); 

            	    				newLeafNode(otherlv_16, grammarAccess.getIfAccess().getIfKeyword_3_1());
            	    			
            	    // InternalPcode.g:821:4: ( (otherlv_17= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        int LA19_2 = input.LA(2);

            	        if ( (LA19_2==EOF||(LA19_2>=RULE_STRING && LA19_2<=RULE_ID)||LA19_2==19||LA19_2==25||(LA19_2>=30 && LA19_2<=31)||LA19_2==42||LA19_2==44||(LA19_2>=51 && LA19_2<=54)) ) {
            	            alt19=2;
            	        }
            	        else if ( ((LA19_2>=49 && LA19_2<=50)||(LA19_2>=55 && LA19_2<=58)) ) {
            	            alt19=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 19, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        int LA19_3 = input.LA(2);

            	        if ( (LA19_3==EOF||(LA19_3>=RULE_STRING && LA19_3<=RULE_ID)||LA19_3==19||LA19_3==25||(LA19_3>=30 && LA19_3<=31)||LA19_3==42||LA19_3==44||(LA19_3>=51 && LA19_3<=54)) ) {
            	            alt19=2;
            	        }
            	        else if ( ((LA19_3>=49 && LA19_3<=50)||(LA19_3>=55 && LA19_3<=58)) ) {
            	            alt19=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 19, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_INT:
            	    case RULE_DOUBLE:
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
            	            // InternalPcode.g:822:5: (otherlv_17= '!' ruleEString )
            	            {
            	            // InternalPcode.g:822:5: (otherlv_17= '!' ruleEString )
            	            // InternalPcode.g:823:6: otherlv_17= '!' ruleEString
            	            {
            	            otherlv_17=(Token)match(input,26,FOLLOW_3); 

            	            						newLeafNode(otherlv_17, grammarAccess.getIfAccess().getExclamationMarkKeyword_3_2_0_0());
            	            					

            	            						newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_3_2_0_1());
            	            					
            	            pushFollow(FOLLOW_25);
            	            ruleEString();

            	            state._fsp--;


            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPcode.g:836:5: ruleEString
            	            {

            	            					newCompositeNode(grammarAccess.getIfAccess().getEStringParserRuleCall_3_2_1());
            	            				
            	            pushFollow(FOLLOW_25);
            	            ruleEString();

            	            state._fsp--;


            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalPcode.g:844:5: ( ruleType ruleEqualVariable ruleType )
            	            {
            	            // InternalPcode.g:844:5: ( ruleType ruleEqualVariable ruleType )
            	            // InternalPcode.g:845:6: ruleType ruleEqualVariable ruleType
            	            {

            	            						newCompositeNode(grammarAccess.getIfAccess().getTypeParserRuleCall_3_2_2_0());
            	            					
            	            pushFollow(FOLLOW_18);
            	            ruleType();

            	            state._fsp--;


            	            						afterParserOrEnumRuleCall();
            	            					

            	            						newCompositeNode(grammarAccess.getIfAccess().getEqualVariableParserRuleCall_3_2_2_1());
            	            					
            	            pushFollow(FOLLOW_12);
            	            ruleEqualVariable();

            	            state._fsp--;


            	            						afterParserOrEnumRuleCall();
            	            					

            	            						newCompositeNode(grammarAccess.getIfAccess().getTypeParserRuleCall_3_2_2_2());
            	            					
            	            pushFollow(FOLLOW_25);
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
            	    break loop20;
                }
            } while (true);

            // InternalPcode.g:869:3: (otherlv_23= 'else' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPcode.g:870:4: otherlv_23= 'else'
                    {
                    otherlv_23=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getIfAccess().getElseKeyword_4());
                    			

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
    // InternalPcode.g:879:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalPcode.g:879:44: (iv_ruleFor= ruleFor EOF )
            // InternalPcode.g:880:2: iv_ruleFor= ruleFor EOF
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
    // InternalPcode.g:886:1: ruleFor returns [EObject current=null] : ( () ( (otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' ) | (otherlv_30= 'repeat' this_INT_31= RULE_INT otherlv_32= 'times' ) ) ) ;
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
        Token otherlv_30=null;
        Token this_INT_31=null;
        Token otherlv_32=null;


        	enterRule();

        try {
            // InternalPcode.g:892:2: ( ( () ( (otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' ) | (otherlv_30= 'repeat' this_INT_31= RULE_INT otherlv_32= 'times' ) ) ) )
            // InternalPcode.g:893:2: ( () ( (otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' ) | (otherlv_30= 'repeat' this_INT_31= RULE_INT otherlv_32= 'times' ) ) )
            {
            // InternalPcode.g:893:2: ( () ( (otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' ) | (otherlv_30= 'repeat' this_INT_31= RULE_INT otherlv_32= 'times' ) ) )
            // InternalPcode.g:894:3: () ( (otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' ) | (otherlv_30= 'repeat' this_INT_31= RULE_INT otherlv_32= 'times' ) )
            {
            // InternalPcode.g:894:3: ()
            // InternalPcode.g:895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForAccess().getForAction_0(),
            					current);
            			

            }

            // InternalPcode.g:901:3: ( (otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' ) | (otherlv_30= 'repeat' this_INT_31= RULE_INT otherlv_32= 'times' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==42) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPcode.g:902:4: (otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' )
                    {
                    // InternalPcode.g:902:4: (otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')' )
                    // InternalPcode.g:903:5: otherlv_1= 'for' otherlv_2= '(' ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) ) otherlv_29= ')'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getForAccess().getForKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,14,FOLLOW_26); 

                    					newLeafNode(otherlv_2, grammarAccess.getForAccess().getLeftParenthesisKeyword_1_0_1());
                    				
                    // InternalPcode.g:911:5: ( ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) ) | ( ruleEString otherlv_19= ':' ruleEString ) | (otherlv_21= 'all' ruleEString ) | (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString ) )
                    int alt23=4;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==21) ) {
                            alt23=1;
                        }
                        else if ( (LA23_1==37) ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA23_2 = input.LA(2);

                        if ( (LA23_2==21) ) {
                            alt23=1;
                        }
                        else if ( (LA23_2==37) ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 38:
                        {
                        alt23=3;
                        }
                        break;
                    case 39:
                        {
                        alt23=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // InternalPcode.g:912:6: ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) )
                            {
                            // InternalPcode.g:912:6: ( ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) ) )
                            // InternalPcode.g:913:7: ruleEString otherlv_4= '=' this_INT_5= RULE_INT otherlv_6= ';' ruleEString ruleEqualVariable ruleType otherlv_10= ';' ruleEString (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) )
                            {

                            							newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_1_0_2_0_0());
                            						
                            pushFollow(FOLLOW_27);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						
                            otherlv_4=(Token)match(input,21,FOLLOW_28); 

                            							newLeafNode(otherlv_4, grammarAccess.getForAccess().getEqualsSignKeyword_1_0_2_0_1());
                            						
                            this_INT_5=(Token)match(input,RULE_INT,FOLLOW_29); 

                            							newLeafNode(this_INT_5, grammarAccess.getForAccess().getINTTerminalRuleCall_1_0_2_0_2());
                            						
                            otherlv_6=(Token)match(input,32,FOLLOW_3); 

                            							newLeafNode(otherlv_6, grammarAccess.getForAccess().getSemicolonKeyword_1_0_2_0_3());
                            						

                            							newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_1_0_2_0_4());
                            						
                            pushFollow(FOLLOW_18);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            							newCompositeNode(grammarAccess.getForAccess().getEqualVariableParserRuleCall_1_0_2_0_5());
                            						
                            pushFollow(FOLLOW_12);
                            ruleEqualVariable();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            							newCompositeNode(grammarAccess.getForAccess().getTypeParserRuleCall_1_0_2_0_6());
                            						
                            pushFollow(FOLLOW_29);
                            ruleType();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						
                            otherlv_10=(Token)match(input,32,FOLLOW_3); 

                            							newLeafNode(otherlv_10, grammarAccess.getForAccess().getSemicolonKeyword_1_0_2_0_7());
                            						

                            							newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_1_0_2_0_8());
                            						
                            pushFollow(FOLLOW_30);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						
                            // InternalPcode.g:964:7: (otherlv_12= '++' | otherlv_13= '--' | (otherlv_14= '+' this_INT_15= RULE_INT ) | (otherlv_16= '-' this_INT_17= RULE_INT ) )
                            int alt22=4;
                            switch ( input.LA(1) ) {
                            case 33:
                                {
                                alt22=1;
                                }
                                break;
                            case 34:
                                {
                                alt22=2;
                                }
                                break;
                            case 35:
                                {
                                alt22=3;
                                }
                                break;
                            case 36:
                                {
                                alt22=4;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 0, input);

                                throw nvae;
                            }

                            switch (alt22) {
                                case 1 :
                                    // InternalPcode.g:965:8: otherlv_12= '++'
                                    {
                                    otherlv_12=(Token)match(input,33,FOLLOW_31); 

                                    								newLeafNode(otherlv_12, grammarAccess.getForAccess().getPlusSignPlusSignKeyword_1_0_2_0_9_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalPcode.g:970:8: otherlv_13= '--'
                                    {
                                    otherlv_13=(Token)match(input,34,FOLLOW_31); 

                                    								newLeafNode(otherlv_13, grammarAccess.getForAccess().getHyphenMinusHyphenMinusKeyword_1_0_2_0_9_1());
                                    							

                                    }
                                    break;
                                case 3 :
                                    // InternalPcode.g:975:8: (otherlv_14= '+' this_INT_15= RULE_INT )
                                    {
                                    // InternalPcode.g:975:8: (otherlv_14= '+' this_INT_15= RULE_INT )
                                    // InternalPcode.g:976:9: otherlv_14= '+' this_INT_15= RULE_INT
                                    {
                                    otherlv_14=(Token)match(input,35,FOLLOW_28); 

                                    									newLeafNode(otherlv_14, grammarAccess.getForAccess().getPlusSignKeyword_1_0_2_0_9_2_0());
                                    								
                                    this_INT_15=(Token)match(input,RULE_INT,FOLLOW_31); 

                                    									newLeafNode(this_INT_15, grammarAccess.getForAccess().getINTTerminalRuleCall_1_0_2_0_9_2_1());
                                    								

                                    }


                                    }
                                    break;
                                case 4 :
                                    // InternalPcode.g:986:8: (otherlv_16= '-' this_INT_17= RULE_INT )
                                    {
                                    // InternalPcode.g:986:8: (otherlv_16= '-' this_INT_17= RULE_INT )
                                    // InternalPcode.g:987:9: otherlv_16= '-' this_INT_17= RULE_INT
                                    {
                                    otherlv_16=(Token)match(input,36,FOLLOW_28); 

                                    									newLeafNode(otherlv_16, grammarAccess.getForAccess().getHyphenMinusKeyword_1_0_2_0_9_3_0());
                                    								
                                    this_INT_17=(Token)match(input,RULE_INT,FOLLOW_31); 

                                    									newLeafNode(this_INT_17, grammarAccess.getForAccess().getINTTerminalRuleCall_1_0_2_0_9_3_1());
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPcode.g:999:6: ( ruleEString otherlv_19= ':' ruleEString )
                            {
                            // InternalPcode.g:999:6: ( ruleEString otherlv_19= ':' ruleEString )
                            // InternalPcode.g:1000:7: ruleEString otherlv_19= ':' ruleEString
                            {

                            							newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_1_0_2_1_0());
                            						
                            pushFollow(FOLLOW_32);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						
                            otherlv_19=(Token)match(input,37,FOLLOW_3); 

                            							newLeafNode(otherlv_19, grammarAccess.getForAccess().getColonKeyword_1_0_2_1_1());
                            						

                            							newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_1_0_2_1_2());
                            						
                            pushFollow(FOLLOW_31);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;
                        case 3 :
                            // InternalPcode.g:1020:6: (otherlv_21= 'all' ruleEString )
                            {
                            // InternalPcode.g:1020:6: (otherlv_21= 'all' ruleEString )
                            // InternalPcode.g:1021:7: otherlv_21= 'all' ruleEString
                            {
                            otherlv_21=(Token)match(input,38,FOLLOW_3); 

                            							newLeafNode(otherlv_21, grammarAccess.getForAccess().getAllKeyword_1_0_2_2_0());
                            						

                            							newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_1_0_2_2_1());
                            						
                            pushFollow(FOLLOW_31);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalPcode.g:1034:6: (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString )
                            {
                            // InternalPcode.g:1034:6: (otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString )
                            // InternalPcode.g:1035:7: otherlv_23= 'interval' this_INT_24= RULE_INT otherlv_25= 'to' this_INT_26= RULE_INT otherlv_27= 'in' ruleEString
                            {
                            otherlv_23=(Token)match(input,39,FOLLOW_28); 

                            							newLeafNode(otherlv_23, grammarAccess.getForAccess().getIntervalKeyword_1_0_2_3_0());
                            						
                            this_INT_24=(Token)match(input,RULE_INT,FOLLOW_33); 

                            							newLeafNode(this_INT_24, grammarAccess.getForAccess().getINTTerminalRuleCall_1_0_2_3_1());
                            						
                            otherlv_25=(Token)match(input,40,FOLLOW_28); 

                            							newLeafNode(otherlv_25, grammarAccess.getForAccess().getToKeyword_1_0_2_3_2());
                            						
                            this_INT_26=(Token)match(input,RULE_INT,FOLLOW_34); 

                            							newLeafNode(this_INT_26, grammarAccess.getForAccess().getINTTerminalRuleCall_1_0_2_3_3());
                            						
                            otherlv_27=(Token)match(input,41,FOLLOW_3); 

                            							newLeafNode(otherlv_27, grammarAccess.getForAccess().getInKeyword_1_0_2_3_4());
                            						

                            							newCompositeNode(grammarAccess.getForAccess().getEStringParserRuleCall_1_0_2_3_5());
                            						
                            pushFollow(FOLLOW_31);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_29, grammarAccess.getForAccess().getRightParenthesisKeyword_1_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalPcode.g:1070:4: (otherlv_30= 'repeat' this_INT_31= RULE_INT otherlv_32= 'times' )
                    {
                    // InternalPcode.g:1070:4: (otherlv_30= 'repeat' this_INT_31= RULE_INT otherlv_32= 'times' )
                    // InternalPcode.g:1071:5: otherlv_30= 'repeat' this_INT_31= RULE_INT otherlv_32= 'times'
                    {
                    otherlv_30=(Token)match(input,42,FOLLOW_28); 

                    					newLeafNode(otherlv_30, grammarAccess.getForAccess().getRepeatKeyword_1_1_0());
                    				
                    this_INT_31=(Token)match(input,RULE_INT,FOLLOW_35); 

                    					newLeafNode(this_INT_31, grammarAccess.getForAccess().getINTTerminalRuleCall_1_1_1());
                    				
                    otherlv_32=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(otherlv_32, grammarAccess.getForAccess().getTimesKeyword_1_1_2());
                    				

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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // InternalPcode.g:1089:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalPcode.g:1089:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalPcode.g:1090:2: iv_ruleWhile= ruleWhile EOF
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
    // InternalPcode.g:1096:1: ruleWhile returns [EObject current=null] : ( () ( (otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) ) | (otherlv_5= 'repeat' otherlv_6= 'until' ruleEString ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )* ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString ) ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalPcode.g:1102:2: ( ( () ( (otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) ) | (otherlv_5= 'repeat' otherlv_6= 'until' ruleEString ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )* ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString ) ) ) ) )
            // InternalPcode.g:1103:2: ( () ( (otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) ) | (otherlv_5= 'repeat' otherlv_6= 'until' ruleEString ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )* ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString ) ) ) )
            {
            // InternalPcode.g:1103:2: ( () ( (otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) ) | (otherlv_5= 'repeat' otherlv_6= 'until' ruleEString ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )* ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString ) ) ) )
            // InternalPcode.g:1104:3: () ( (otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) ) | (otherlv_5= 'repeat' otherlv_6= 'until' ruleEString ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )* ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString ) ) )
            {
            // InternalPcode.g:1104:3: ()
            // InternalPcode.g:1105:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileAccess().getWhileAction_0(),
            					current);
            			

            }

            // InternalPcode.g:1111:3: ( (otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) ) | (otherlv_5= 'repeat' otherlv_6= 'until' ruleEString ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )* ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            else if ( (LA30_0==42) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPcode.g:1112:4: (otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) )
                    {
                    // InternalPcode.g:1112:4: (otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) ) )
                    // InternalPcode.g:1113:5: otherlv_1= 'while' (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_36); 

                    					newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getWhileKeyword_1_0_0());
                    				
                    // InternalPcode.g:1117:5: (otherlv_2= 'true' | ( (otherlv_3= '!' )? ruleEString ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==45) ) {
                        alt26=1;
                    }
                    else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||LA26_0==26) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalPcode.g:1118:6: otherlv_2= 'true'
                            {
                            otherlv_2=(Token)match(input,45,FOLLOW_2); 

                            						newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getTrueKeyword_1_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalPcode.g:1123:6: ( (otherlv_3= '!' )? ruleEString )
                            {
                            // InternalPcode.g:1123:6: ( (otherlv_3= '!' )? ruleEString )
                            // InternalPcode.g:1124:7: (otherlv_3= '!' )? ruleEString
                            {
                            // InternalPcode.g:1124:7: (otherlv_3= '!' )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==26) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalPcode.g:1125:8: otherlv_3= '!'
                                    {
                                    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                                    								newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getExclamationMarkKeyword_1_0_1_1_0());
                                    							

                                    }
                                    break;

                            }


                            							newCompositeNode(grammarAccess.getWhileAccess().getEStringParserRuleCall_1_0_1_1_1());
                            						
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
                    break;
                case 2 :
                    // InternalPcode.g:1141:4: (otherlv_5= 'repeat' otherlv_6= 'until' ruleEString ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )* ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString ) )
                    {
                    // InternalPcode.g:1141:4: (otherlv_5= 'repeat' otherlv_6= 'until' ruleEString ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )* ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString ) )
                    // InternalPcode.g:1142:5: otherlv_5= 'repeat' otherlv_6= 'until' ruleEString ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )* ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_37); 

                    					newLeafNode(otherlv_5, grammarAccess.getWhileAccess().getRepeatKeyword_1_1_0());
                    				
                    otherlv_6=(Token)match(input,46,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getWhileAccess().getUntilKeyword_1_1_1());
                    				

                    					newCompositeNode(grammarAccess.getWhileAccess().getEStringParserRuleCall_1_1_2());
                    				
                    pushFollow(FOLLOW_38);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalPcode.g:1157:5: ( (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=47 && LA28_0<=48)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalPcode.g:1158:6: (otherlv_8= 'or' | otherlv_9= 'and' ) ruleEString
                    	    {
                    	    // InternalPcode.g:1158:6: (otherlv_8= 'or' | otherlv_9= 'and' )
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==47) ) {
                    	        alt27=1;
                    	    }
                    	    else if ( (LA27_0==48) ) {
                    	        alt27=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 27, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalPcode.g:1159:7: otherlv_8= 'or'
                    	            {
                    	            otherlv_8=(Token)match(input,47,FOLLOW_3); 

                    	            							newLeafNode(otherlv_8, grammarAccess.getWhileAccess().getOrKeyword_1_1_3_0_0());
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPcode.g:1164:7: otherlv_9= 'and'
                    	            {
                    	            otherlv_9=(Token)match(input,48,FOLLOW_3); 

                    	            							newLeafNode(otherlv_9, grammarAccess.getWhileAccess().getAndKeyword_1_1_3_0_1());
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    						newCompositeNode(grammarAccess.getWhileAccess().getEStringParserRuleCall_1_1_3_1());
                    	    					
                    	    pushFollow(FOLLOW_38);
                    	    ruleEString();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    // InternalPcode.g:1177:5: ( (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString )
                    // InternalPcode.g:1178:6: (otherlv_11= '==' | otherlv_12= '!=' ) ruleEString
                    {
                    // InternalPcode.g:1178:6: (otherlv_11= '==' | otherlv_12= '!=' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==49) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==50) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalPcode.g:1179:7: otherlv_11= '=='
                            {
                            otherlv_11=(Token)match(input,49,FOLLOW_3); 

                            							newLeafNode(otherlv_11, grammarAccess.getWhileAccess().getEqualsSignEqualsSignKeyword_1_1_4_0_0());
                            						

                            }
                            break;
                        case 2 :
                            // InternalPcode.g:1184:7: otherlv_12= '!='
                            {
                            otherlv_12=(Token)match(input,50,FOLLOW_3); 

                            							newLeafNode(otherlv_12, grammarAccess.getWhileAccess().getExclamationMarkEqualsSignKeyword_1_1_4_0_1());
                            						

                            }
                            break;

                    }


                    						newCompositeNode(grammarAccess.getWhileAccess().getEStringParserRuleCall_1_1_4_1());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // InternalPcode.g:1203:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPcode.g:1203:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPcode.g:1204:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalPcode.g:1210:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:1216:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPcode.g:1217:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPcode.g:1217:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPcode.g:1218:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPcode.g:1218:3: ()
            // InternalPcode.g:1219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalPcode.g:1225:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPcode.g:1226:4: (lv_name_1_0= ruleEString )
            {
            // InternalPcode.g:1226:4: (lv_name_1_0= ruleEString )
            // InternalPcode.g:1227:5: lv_name_1_0= ruleEString
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
    // InternalPcode.g:1248:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalPcode.g:1248:45: (iv_ruleStop= ruleStop EOF )
            // InternalPcode.g:1249:2: iv_ruleStop= ruleStop EOF
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
    // InternalPcode.g:1255:1: ruleStop returns [EObject current=null] : ( () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalPcode.g:1261:2: ( ( () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' ) ) )
            // InternalPcode.g:1262:2: ( () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' ) )
            {
            // InternalPcode.g:1262:2: ( () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' ) )
            // InternalPcode.g:1263:3: () ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' )
            {
            // InternalPcode.g:1263:3: ()
            // InternalPcode.g:1264:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStopAccess().getStopAction_0(),
            					current);
            			

            }

            // InternalPcode.g:1270:3: ( (otherlv_1= 'return' ruleType ) | otherlv_3= 'stop' | otherlv_4= 'break' | otherlv_5= 'continue' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt31=1;
                }
                break;
            case 52:
                {
                alt31=2;
                }
                break;
            case 53:
                {
                alt31=3;
                }
                break;
            case 54:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalPcode.g:1271:4: (otherlv_1= 'return' ruleType )
                    {
                    // InternalPcode.g:1271:4: (otherlv_1= 'return' ruleType )
                    // InternalPcode.g:1272:5: otherlv_1= 'return' ruleType
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_12); 

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
                    // InternalPcode.g:1285:4: otherlv_3= 'stop'
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStopAccess().getStopKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPcode.g:1290:4: otherlv_4= 'break'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStopAccess().getBreakKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalPcode.g:1295:4: otherlv_5= 'continue'
                    {
                    otherlv_5=(Token)match(input,54,FOLLOW_2); 

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
    // InternalPcode.g:1304:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalPcode.g:1304:44: (iv_ruleType= ruleType EOF )
            // InternalPcode.g:1305:2: iv_ruleType= ruleType EOF
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
    // InternalPcode.g:1311:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:1317:2: ( (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) )
            // InternalPcode.g:1318:2: (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            {
            // InternalPcode.g:1318:2: (this_EString_0= ruleEString | this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt32=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt32=2;
                }
                break;
            case RULE_INT:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalPcode.g:1319:3: this_EString_0= ruleEString
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
                    // InternalPcode.g:1330:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_1);
                    		

                    			newLeafNode(this_DOUBLE_1, grammarAccess.getTypeAccess().getDOUBLETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPcode.g:1338:3: this_INT_2= RULE_INT
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
    // InternalPcode.g:1349:1: entryRuleEqualVariable returns [String current=null] : iv_ruleEqualVariable= ruleEqualVariable EOF ;
    public final String entryRuleEqualVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualVariable = null;


        try {
            // InternalPcode.g:1349:53: (iv_ruleEqualVariable= ruleEqualVariable EOF )
            // InternalPcode.g:1350:2: iv_ruleEqualVariable= ruleEqualVariable EOF
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
    // InternalPcode.g:1356:1: ruleEqualVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcode.g:1362:2: ( (kw= '==' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!=' ) )
            // InternalPcode.g:1363:2: (kw= '==' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!=' )
            {
            // InternalPcode.g:1363:2: (kw= '==' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '!=' )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt33=1;
                }
                break;
            case 55:
                {
                alt33=2;
                }
                break;
            case 56:
                {
                alt33=3;
                }
                break;
            case 57:
                {
                alt33=4;
                }
                break;
            case 58:
                {
                alt33=5;
                }
                break;
            case 50:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalPcode.g:1364:3: kw= '=='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPcode.g:1370:3: kw= '<'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPcode.g:1376:3: kw= '<='
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPcode.g:1382:3: kw= '>'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPcode.g:1388:3: kw= '>='
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualVariableAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPcode.g:1394:3: kw= '!='
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMathSigns"
    // InternalPcode.g:1403:1: entryRuleMathSigns returns [String current=null] : iv_ruleMathSigns= ruleMathSigns EOF ;
    public final String entryRuleMathSigns() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathSigns = null;


        try {
            // InternalPcode.g:1403:49: (iv_ruleMathSigns= ruleMathSigns EOF )
            // InternalPcode.g:1404:2: iv_ruleMathSigns= ruleMathSigns EOF
            {
             newCompositeNode(grammarAccess.getMathSignsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathSigns=ruleMathSigns();

            state._fsp--;

             current =iv_ruleMathSigns.getText(); 
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
    // $ANTLR end "entryRuleMathSigns"


    // $ANTLR start "ruleMathSigns"
    // InternalPcode.g:1410:1: ruleMathSigns returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | (kw= 'total' kw= 'division' ) ) ;
    public final AntlrDatatypeRuleToken ruleMathSigns() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPcode.g:1416:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | (kw= 'total' kw= 'division' ) ) )
            // InternalPcode.g:1417:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | (kw= 'total' kw= 'division' ) )
            {
            // InternalPcode.g:1417:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | (kw= 'total' kw= 'division' ) )
            int alt34=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt34=1;
                }
                break;
            case 36:
                {
                alt34=2;
                }
                break;
            case 59:
                {
                alt34=3;
                }
                break;
            case 60:
                {
                alt34=4;
                }
                break;
            case 61:
                {
                alt34=5;
                }
                break;
            case 62:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalPcode.g:1418:3: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathSignsAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPcode.g:1424:3: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathSignsAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPcode.g:1430:3: kw= '*'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathSignsAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPcode.g:1436:3: kw= '/'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathSignsAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPcode.g:1442:3: kw= '%'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathSignsAccess().getPercentSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPcode.g:1448:3: (kw= 'total' kw= 'division' )
                    {
                    // InternalPcode.g:1448:3: (kw= 'total' kw= 'division' )
                    // InternalPcode.g:1449:4: kw= 'total' kw= 'division'
                    {
                    kw=(Token)match(input,62,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMathSignsAccess().getTotalKeyword_5_0());
                    			
                    kw=(Token)match(input,63,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMathSignsAccess().getDivisionKeyword_5_1());
                    			

                    }


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
    // $ANTLR end "ruleMathSigns"


    // $ANTLR start "entryRuleEString"
    // InternalPcode.g:1464:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPcode.g:1464:47: (iv_ruleEString= ruleEString EOF )
            // InternalPcode.g:1465:2: iv_ruleEString= ruleEString EOF
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
    // InternalPcode.g:1471:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPcode.g:1477:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPcode.g:1478:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPcode.g:1478:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalPcode.g:1479:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPcode.g:1487:3: this_ID_1= RULE_ID
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
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\2\uffff\3\12\1\uffff\4\12\1\uffff";
    static final String dfa_3s = "\1\6\1\4\3\6\1\uffff\4\6\1\uffff";
    static final String dfa_4s = "\1\66\1\7\3\66\1\uffff\4\66\1\uffff";
    static final String dfa_5s = "\5\uffff\1\1\4\uffff\1\2";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\2\5\13\uffff\1\5\5\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\1\5\6\uffff\1\1\1\2\1\3\1\4",
            "\1\11\1\10\1\6\1\7",
            "\2\5\12\uffff\1\12\1\5\5\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
            "\2\5\12\uffff\1\12\1\5\5\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
            "\2\5\12\uffff\1\12\1\5\5\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
            "",
            "\2\5\12\uffff\1\12\1\5\5\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
            "\2\5\12\uffff\1\12\1\5\5\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
            "\2\5\12\uffff\1\12\1\5\5\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
            "\2\5\12\uffff\1\12\1\5\5\uffff\1\5\5\uffff\1\5\12\uffff\1\5\1\uffff\1\5\6\uffff\4\5",
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
            return "()* loopback of 394:3: ( ( (lv_statements_1_1= ruleVariable | lv_statements_1_2= ruleIf | lv_statements_1_3= ruleFor | lv_statements_1_4= ruleWhile | lv_statements_1_5= ruleStop ) ) )*";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\1\1\uffff\2\10\6\uffff";
    static final String dfa_10s = "\1\4\1\uffff\2\4\2\uffff\1\34\3\uffff";
    static final String dfa_11s = "\1\66\1\uffff\2\72\2\uffff\1\35\3\uffff";
    static final String dfa_12s = "\1\uffff\1\6\2\uffff\1\1\1\3\1\uffff\1\4\1\2\1\5";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\2\5\1\2\1\3\13\uffff\1\1\5\uffff\1\1\1\4\3\uffff\2\1\12\uffff\1\1\1\uffff\1\1\6\uffff\4\1",
            "",
            "\4\10\13\uffff\1\10\1\uffff\4\1\2\10\1\6\1\7\1\11\2\10\12\uffff\1\10\1\uffff\1\10\4\uffff\2\5\4\10\4\5",
            "\4\10\13\uffff\1\10\1\uffff\4\1\2\10\1\6\1\7\1\11\2\10\12\uffff\1\10\1\uffff\1\10\4\uffff\2\5\4\10\4\5",
            "",
            "",
            "\1\7\1\11",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 718:3: ( (otherlv_2= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) | ( ruleEString (otherlv_9= 'not' )? otherlv_10= 'exists' ) | ( ruleEString (otherlv_12= 'not' )? otherlv_13= 'knowing' ruleEString ) )*";
        }
    }
    static final String dfa_15s = "\25\uffff";
    static final String dfa_16s = "\2\2\23\uffff";
    static final String dfa_17s = "\2\6\1\uffff\1\4\1\6\2\uffff\2\61\2\uffff\6\4\4\uffff";
    static final String dfa_18s = "\2\66\1\uffff\1\66\1\7\2\uffff\2\72\2\uffff\6\7\4\uffff";
    static final String dfa_19s = "\2\uffff\1\2\2\uffff\2\1\2\uffff\2\1\6\uffff\4\1";
    static final String dfa_20s = "\25\uffff}>";
    static final String[] dfa_21s = {
            "\2\2\13\uffff\1\2\5\uffff\1\2\4\uffff\1\1\1\2\12\uffff\1\2\1\uffff\1\2\6\uffff\4\2",
            "\2\2\13\uffff\1\2\5\uffff\1\3\5\uffff\1\2\12\uffff\1\2\1\uffff\1\2\6\uffff\4\2",
            "",
            "\1\10\1\7\1\5\1\6\13\uffff\1\2\5\uffff\1\2\1\4\3\uffff\2\2\12\uffff\1\2\1\uffff\1\2\6\uffff\4\2",
            "\1\11\1\12",
            "",
            "",
            "\1\13\1\20\4\uffff\1\14\1\15\1\16\1\17",
            "\1\13\1\20\4\uffff\1\14\1\15\1\16\1\17",
            "",
            "",
            "\1\24\1\23\1\21\1\22",
            "\1\24\1\23\1\21\1\22",
            "\1\24\1\23\1\21\1\22",
            "\1\24\1\23\1\21\1\22",
            "\1\24\1\23\1\21\1\22",
            "\1\24\1\23\1\21\1\22",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 812:3: (otherlv_15= 'else' otherlv_16= 'if' ( (otherlv_17= '!' ruleEString ) | ruleEString | ( ruleType ruleEqualVariable ruleType ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000100C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000180C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00781400820800C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001000F2L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001080F2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x7800001800000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000441000F2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0786000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000041000F0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C0000000C0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00002000040000C0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L});

}