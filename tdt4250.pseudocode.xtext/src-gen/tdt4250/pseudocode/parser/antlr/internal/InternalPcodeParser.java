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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PseudoClass'", "'{'", "'visibility'", "'type'", "'superTypes'", "'('", "','", "')'", "'members'", "'}'", "'Member'", "'PseudoInterface'", "'Field'", "'initializer'", "'Operation'", "'exceptions'", "'parameters'", "'Method'", "'Constructor'", "'Parameter'", "'packagePrivate'", "'private'", "'protected'", "'public'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalPcode.g:72:1: rulePseudoClass returns [EObject current=null] : ( () otherlv_1= 'PseudoClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject rulePseudoClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_visibility_5_0 = null;

        EObject lv_members_16_0 = null;

        EObject lv_members_18_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:78:2: ( ( () otherlv_1= 'PseudoClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalPcode.g:79:2: ( () otherlv_1= 'PseudoClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalPcode.g:79:2: ( () otherlv_1= 'PseudoClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalPcode.g:80:3: () otherlv_1= 'PseudoClass' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalPcode.g:80:3: ()
            // InternalPcode.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPseudoClassAccess().getPseudoClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPseudoClassAccess().getPseudoClassKeyword_1());
            		
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

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPseudoClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPcode.g:114:3: (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPcode.g:115:4: otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getPseudoClassAccess().getVisibilityKeyword_4_0());
                    			
                    // InternalPcode.g:119:4: ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    // InternalPcode.g:120:5: (lv_visibility_5_0= ruleVisibilityKind )
                    {
                    // InternalPcode.g:120:5: (lv_visibility_5_0= ruleVisibilityKind )
                    // InternalPcode.g:121:6: lv_visibility_5_0= ruleVisibilityKind
                    {

                    						newCompositeNode(grammarAccess.getPseudoClassAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_visibility_5_0=ruleVisibilityKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPseudoClassRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_5_0,
                    							"tdt4250.pseudocode.Pcode.VisibilityKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:139:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPcode.g:140:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getPseudoClassAccess().getTypeKeyword_5_0());
                    			
                    // InternalPcode.g:144:4: ( ( ruleEString ) )
                    // InternalPcode.g:145:5: ( ruleEString )
                    {
                    // InternalPcode.g:145:5: ( ruleEString )
                    // InternalPcode.g:146:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPseudoClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPseudoClassAccess().getTypePseudoTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:161:3: (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPcode.g:162:4: otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getPseudoClassAccess().getSuperTypesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPseudoClassAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalPcode.g:170:4: ( ( ruleEString ) )
                    // InternalPcode.g:171:5: ( ruleEString )
                    {
                    // InternalPcode.g:171:5: ( ruleEString )
                    // InternalPcode.g:172:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPseudoClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPseudoClassAccess().getSuperTypesPseudoTypeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPcode.g:186:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPcode.g:187:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPseudoClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalPcode.g:191:5: ( ( ruleEString ) )
                    	    // InternalPcode.g:192:6: ( ruleEString )
                    	    {
                    	    // InternalPcode.g:192:6: ( ruleEString )
                    	    // InternalPcode.g:193:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPseudoClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPseudoClassAccess().getSuperTypesPseudoTypeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getPseudoClassAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalPcode.g:213:3: (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPcode.g:214:4: otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getPseudoClassAccess().getMembersKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getPseudoClassAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPcode.g:222:4: ( (lv_members_16_0= ruleMember ) )
                    // InternalPcode.g:223:5: (lv_members_16_0= ruleMember )
                    {
                    // InternalPcode.g:223:5: (lv_members_16_0= ruleMember )
                    // InternalPcode.g:224:6: lv_members_16_0= ruleMember
                    {

                    						newCompositeNode(grammarAccess.getPseudoClassAccess().getMembersMemberParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_members_16_0=ruleMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPseudoClassRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_16_0,
                    							"tdt4250.pseudocode.Pcode.Member");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPcode.g:241:4: (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPcode.g:242:5: otherlv_17= ',' ( (lv_members_18_0= ruleMember ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPseudoClassAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalPcode.g:246:5: ( (lv_members_18_0= ruleMember ) )
                    	    // InternalPcode.g:247:6: (lv_members_18_0= ruleMember )
                    	    {
                    	    // InternalPcode.g:247:6: (lv_members_18_0= ruleMember )
                    	    // InternalPcode.g:248:7: lv_members_18_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getPseudoClassAccess().getMembersMemberParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_members_18_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPseudoClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_18_0,
                    	    								"tdt4250.pseudocode.Pcode.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getPseudoClassAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getPseudoClassAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleMember"
    // InternalPcode.g:279:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalPcode.g:279:47: (iv_ruleMember= ruleMember EOF )
            // InternalPcode.g:280:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalPcode.g:286:1: ruleMember returns [EObject current=null] : (this_Member_Impl_0= ruleMember_Impl | this_PseudoClass_1= rulePseudoClass | this_PseudoInterface_2= rulePseudoInterface | this_Field_3= ruleField | this_Operation_Impl_4= ruleOperation_Impl | this_Method_5= ruleMethod | this_Constructor_6= ruleConstructor ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Member_Impl_0 = null;

        EObject this_PseudoClass_1 = null;

        EObject this_PseudoInterface_2 = null;

        EObject this_Field_3 = null;

        EObject this_Operation_Impl_4 = null;

        EObject this_Method_5 = null;

        EObject this_Constructor_6 = null;



        	enterRule();

        try {
            // InternalPcode.g:292:2: ( (this_Member_Impl_0= ruleMember_Impl | this_PseudoClass_1= rulePseudoClass | this_PseudoInterface_2= rulePseudoInterface | this_Field_3= ruleField | this_Operation_Impl_4= ruleOperation_Impl | this_Method_5= ruleMethod | this_Constructor_6= ruleConstructor ) )
            // InternalPcode.g:293:2: (this_Member_Impl_0= ruleMember_Impl | this_PseudoClass_1= rulePseudoClass | this_PseudoInterface_2= rulePseudoInterface | this_Field_3= ruleField | this_Operation_Impl_4= ruleOperation_Impl | this_Method_5= ruleMethod | this_Constructor_6= ruleConstructor )
            {
            // InternalPcode.g:293:2: (this_Member_Impl_0= ruleMember_Impl | this_PseudoClass_1= rulePseudoClass | this_PseudoInterface_2= rulePseudoInterface | this_Field_3= ruleField | this_Operation_Impl_4= ruleOperation_Impl | this_Method_5= ruleMethod | this_Constructor_6= ruleConstructor )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 11:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            case 25:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 29:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPcode.g:294:3: this_Member_Impl_0= ruleMember_Impl
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getMember_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Member_Impl_0=ruleMember_Impl();

                    state._fsp--;


                    			current = this_Member_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPcode.g:303:3: this_PseudoClass_1= rulePseudoClass
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getPseudoClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PseudoClass_1=rulePseudoClass();

                    state._fsp--;


                    			current = this_PseudoClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPcode.g:312:3: this_PseudoInterface_2= rulePseudoInterface
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getPseudoInterfaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PseudoInterface_2=rulePseudoInterface();

                    state._fsp--;


                    			current = this_PseudoInterface_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPcode.g:321:3: this_Field_3= ruleField
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_3=ruleField();

                    state._fsp--;


                    			current = this_Field_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPcode.g:330:3: this_Operation_Impl_4= ruleOperation_Impl
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getOperation_ImplParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_Impl_4=ruleOperation_Impl();

                    state._fsp--;


                    			current = this_Operation_Impl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPcode.g:339:3: this_Method_5= ruleMethod
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Method_5=ruleMethod();

                    state._fsp--;


                    			current = this_Method_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPcode.g:348:3: this_Constructor_6= ruleConstructor
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getConstructorParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constructor_6=ruleConstructor();

                    state._fsp--;


                    			current = this_Constructor_6;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleEString"
    // InternalPcode.g:360:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPcode.g:360:47: (iv_ruleEString= ruleEString EOF )
            // InternalPcode.g:361:2: iv_ruleEString= ruleEString EOF
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
    // InternalPcode.g:367:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPcode.g:373:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPcode.g:374:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPcode.g:374:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPcode.g:375:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPcode.g:383:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleMember_Impl"
    // InternalPcode.g:394:1: entryRuleMember_Impl returns [EObject current=null] : iv_ruleMember_Impl= ruleMember_Impl EOF ;
    public final EObject entryRuleMember_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember_Impl = null;


        try {
            // InternalPcode.g:394:52: (iv_ruleMember_Impl= ruleMember_Impl EOF )
            // InternalPcode.g:395:2: iv_ruleMember_Impl= ruleMember_Impl EOF
            {
             newCompositeNode(grammarAccess.getMember_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember_Impl=ruleMember_Impl();

            state._fsp--;

             current =iv_ruleMember_Impl; 
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
    // $ANTLR end "entryRuleMember_Impl"


    // $ANTLR start "ruleMember_Impl"
    // InternalPcode.g:401:1: ruleMember_Impl returns [EObject current=null] : ( () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleMember_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_visibility_5_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:407:2: ( ( () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalPcode.g:408:2: ( () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalPcode.g:408:2: ( () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalPcode.g:409:3: () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalPcode.g:409:3: ()
            // InternalPcode.g:410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMember_ImplAccess().getMemberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMember_ImplAccess().getMemberKeyword_1());
            		
            // InternalPcode.g:420:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:421:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:421:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:422:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMember_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMember_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.pseudocode.Pcode.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getMember_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPcode.g:443:3: (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPcode.g:444:4: otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMember_ImplAccess().getVisibilityKeyword_4_0());
                    			
                    // InternalPcode.g:448:4: ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    // InternalPcode.g:449:5: (lv_visibility_5_0= ruleVisibilityKind )
                    {
                    // InternalPcode.g:449:5: (lv_visibility_5_0= ruleVisibilityKind )
                    // InternalPcode.g:450:6: lv_visibility_5_0= ruleVisibilityKind
                    {

                    						newCompositeNode(grammarAccess.getMember_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_visibility_5_0=ruleVisibilityKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMember_ImplRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_5_0,
                    							"tdt4250.pseudocode.Pcode.VisibilityKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:468:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPcode.g:469:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMember_ImplAccess().getTypeKeyword_5_0());
                    			
                    // InternalPcode.g:473:4: ( ( ruleEString ) )
                    // InternalPcode.g:474:5: ( ruleEString )
                    {
                    // InternalPcode.g:474:5: ( ruleEString )
                    // InternalPcode.g:475:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMember_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMember_ImplAccess().getTypePseudoTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMember_ImplAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMember_Impl"


    // $ANTLR start "entryRulePseudoInterface"
    // InternalPcode.g:498:1: entryRulePseudoInterface returns [EObject current=null] : iv_rulePseudoInterface= rulePseudoInterface EOF ;
    public final EObject entryRulePseudoInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoInterface = null;


        try {
            // InternalPcode.g:498:56: (iv_rulePseudoInterface= rulePseudoInterface EOF )
            // InternalPcode.g:499:2: iv_rulePseudoInterface= rulePseudoInterface EOF
            {
             newCompositeNode(grammarAccess.getPseudoInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePseudoInterface=rulePseudoInterface();

            state._fsp--;

             current =iv_rulePseudoInterface; 
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
    // $ANTLR end "entryRulePseudoInterface"


    // $ANTLR start "rulePseudoInterface"
    // InternalPcode.g:505:1: rulePseudoInterface returns [EObject current=null] : ( () otherlv_1= 'PseudoInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject rulePseudoInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_visibility_5_0 = null;

        EObject lv_members_16_0 = null;

        EObject lv_members_18_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:511:2: ( ( () otherlv_1= 'PseudoInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalPcode.g:512:2: ( () otherlv_1= 'PseudoInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalPcode.g:512:2: ( () otherlv_1= 'PseudoInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalPcode.g:513:3: () otherlv_1= 'PseudoInterface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalPcode.g:513:3: ()
            // InternalPcode.g:514:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPseudoInterfaceAccess().getPseudoInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPseudoInterfaceAccess().getPseudoInterfaceKeyword_1());
            		
            // InternalPcode.g:524:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:525:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:525:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:526:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPseudoInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPseudoInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.pseudocode.Pcode.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPseudoInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPcode.g:547:3: (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPcode.g:548:4: otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getPseudoInterfaceAccess().getVisibilityKeyword_4_0());
                    			
                    // InternalPcode.g:552:4: ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    // InternalPcode.g:553:5: (lv_visibility_5_0= ruleVisibilityKind )
                    {
                    // InternalPcode.g:553:5: (lv_visibility_5_0= ruleVisibilityKind )
                    // InternalPcode.g:554:6: lv_visibility_5_0= ruleVisibilityKind
                    {

                    						newCompositeNode(grammarAccess.getPseudoInterfaceAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_visibility_5_0=ruleVisibilityKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPseudoInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_5_0,
                    							"tdt4250.pseudocode.Pcode.VisibilityKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:572:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPcode.g:573:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getPseudoInterfaceAccess().getTypeKeyword_5_0());
                    			
                    // InternalPcode.g:577:4: ( ( ruleEString ) )
                    // InternalPcode.g:578:5: ( ruleEString )
                    {
                    // InternalPcode.g:578:5: ( ruleEString )
                    // InternalPcode.g:579:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPseudoInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPseudoInterfaceAccess().getTypePseudoTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:594:3: (otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPcode.g:595:4: otherlv_8= 'superTypes' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getPseudoInterfaceAccess().getSuperTypesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPseudoInterfaceAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalPcode.g:603:4: ( ( ruleEString ) )
                    // InternalPcode.g:604:5: ( ruleEString )
                    {
                    // InternalPcode.g:604:5: ( ruleEString )
                    // InternalPcode.g:605:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPseudoInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPseudoInterfaceAccess().getSuperTypesPseudoTypeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPcode.g:619:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPcode.g:620:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPseudoInterfaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalPcode.g:624:5: ( ( ruleEString ) )
                    	    // InternalPcode.g:625:6: ( ruleEString )
                    	    {
                    	    // InternalPcode.g:625:6: ( ruleEString )
                    	    // InternalPcode.g:626:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPseudoInterfaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPseudoInterfaceAccess().getSuperTypesPseudoTypeCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getPseudoInterfaceAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalPcode.g:646:3: (otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPcode.g:647:4: otherlv_14= 'members' otherlv_15= '{' ( (lv_members_16_0= ruleMember ) ) (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getPseudoInterfaceAccess().getMembersKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getPseudoInterfaceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPcode.g:655:4: ( (lv_members_16_0= ruleMember ) )
                    // InternalPcode.g:656:5: (lv_members_16_0= ruleMember )
                    {
                    // InternalPcode.g:656:5: (lv_members_16_0= ruleMember )
                    // InternalPcode.g:657:6: lv_members_16_0= ruleMember
                    {

                    						newCompositeNode(grammarAccess.getPseudoInterfaceAccess().getMembersMemberParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_members_16_0=ruleMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPseudoInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_16_0,
                    							"tdt4250.pseudocode.Pcode.Member");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPcode.g:674:4: (otherlv_17= ',' ( (lv_members_18_0= ruleMember ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPcode.g:675:5: otherlv_17= ',' ( (lv_members_18_0= ruleMember ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPseudoInterfaceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalPcode.g:679:5: ( (lv_members_18_0= ruleMember ) )
                    	    // InternalPcode.g:680:6: (lv_members_18_0= ruleMember )
                    	    {
                    	    // InternalPcode.g:680:6: (lv_members_18_0= ruleMember )
                    	    // InternalPcode.g:681:7: lv_members_18_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getPseudoInterfaceAccess().getMembersMemberParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_members_18_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPseudoInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_18_0,
                    	    								"tdt4250.pseudocode.Pcode.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getPseudoInterfaceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getPseudoInterfaceAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulePseudoInterface"


    // $ANTLR start "entryRuleField"
    // InternalPcode.g:712:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalPcode.g:712:46: (iv_ruleField= ruleField EOF )
            // InternalPcode.g:713:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalPcode.g:719:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'initializer' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_visibility_5_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:725:2: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'initializer' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalPcode.g:726:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'initializer' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalPcode.g:726:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'initializer' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // InternalPcode.g:727:3: () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'initializer' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalPcode.g:727:3: ()
            // InternalPcode.g:728:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalPcode.g:738:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:739:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:739:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:740:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.pseudocode.Pcode.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPcode.g:761:3: (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPcode.g:762:4: otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getVisibilityKeyword_4_0());
                    			
                    // InternalPcode.g:766:4: ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    // InternalPcode.g:767:5: (lv_visibility_5_0= ruleVisibilityKind )
                    {
                    // InternalPcode.g:767:5: (lv_visibility_5_0= ruleVisibilityKind )
                    // InternalPcode.g:768:6: lv_visibility_5_0= ruleVisibilityKind
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_visibility_5_0=ruleVisibilityKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_5_0,
                    							"tdt4250.pseudocode.Pcode.VisibilityKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:786:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPcode.g:787:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getTypeKeyword_5_0());
                    			
                    // InternalPcode.g:791:4: ( ( ruleEString ) )
                    // InternalPcode.g:792:5: ( ruleEString )
                    {
                    // InternalPcode.g:792:5: ( ruleEString )
                    // InternalPcode.g:793:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFieldAccess().getTypePseudoTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:808:3: (otherlv_8= 'initializer' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPcode.g:809:4: otherlv_8= 'initializer' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getInitializerKeyword_6_0());
                    			
                    // InternalPcode.g:813:4: ( ( ruleEString ) )
                    // InternalPcode.g:814:5: ( ruleEString )
                    {
                    // InternalPcode.g:814:5: ( ruleEString )
                    // InternalPcode.g:815:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFieldAccess().getInitializerExpressionCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleOperation_Impl"
    // InternalPcode.g:838:1: entryRuleOperation_Impl returns [EObject current=null] : iv_ruleOperation_Impl= ruleOperation_Impl EOF ;
    public final EObject entryRuleOperation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation_Impl = null;


        try {
            // InternalPcode.g:838:55: (iv_ruleOperation_Impl= ruleOperation_Impl EOF )
            // InternalPcode.g:839:2: iv_ruleOperation_Impl= ruleOperation_Impl EOF
            {
             newCompositeNode(grammarAccess.getOperation_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation_Impl=ruleOperation_Impl();

            state._fsp--;

             current =iv_ruleOperation_Impl; 
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
    // $ANTLR end "entryRuleOperation_Impl"


    // $ANTLR start "ruleOperation_Impl"
    // InternalPcode.g:845:1: ruleOperation_Impl returns [EObject current=null] : ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleOperation_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_visibility_5_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:851:2: ( ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalPcode.g:852:2: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalPcode.g:852:2: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalPcode.g:853:3: () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalPcode.g:853:3: ()
            // InternalPcode.g:854:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperation_ImplAccess().getOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOperation_ImplAccess().getOperationKeyword_1());
            		
            // InternalPcode.g:864:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:865:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:865:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:866:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperation_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperation_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.pseudocode.Pcode.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getOperation_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPcode.g:887:3: (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPcode.g:888:4: otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperation_ImplAccess().getVisibilityKeyword_4_0());
                    			
                    // InternalPcode.g:892:4: ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    // InternalPcode.g:893:5: (lv_visibility_5_0= ruleVisibilityKind )
                    {
                    // InternalPcode.g:893:5: (lv_visibility_5_0= ruleVisibilityKind )
                    // InternalPcode.g:894:6: lv_visibility_5_0= ruleVisibilityKind
                    {

                    						newCompositeNode(grammarAccess.getOperation_ImplAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_visibility_5_0=ruleVisibilityKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperation_ImplRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_5_0,
                    							"tdt4250.pseudocode.Pcode.VisibilityKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:912:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPcode.g:913:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperation_ImplAccess().getTypeKeyword_5_0());
                    			
                    // InternalPcode.g:917:4: ( ( ruleEString ) )
                    // InternalPcode.g:918:5: ( ruleEString )
                    {
                    // InternalPcode.g:918:5: ( ruleEString )
                    // InternalPcode.g:919:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperation_ImplAccess().getTypePseudoTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:934:3: (otherlv_8= 'exceptions' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPcode.g:935:4: otherlv_8= 'exceptions' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getOperation_ImplAccess().getExceptionsKeyword_6_0());
                    			
                    // InternalPcode.g:939:4: ( ( ruleEString ) )
                    // InternalPcode.g:940:5: ( ruleEString )
                    {
                    // InternalPcode.g:940:5: ( ruleEString )
                    // InternalPcode.g:941:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperation_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperation_ImplAccess().getExceptionsPseudoTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:956:3: (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPcode.g:957:4: otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getOperation_ImplAccess().getParametersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getOperation_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPcode.g:965:4: ( (lv_parameters_12_0= ruleParameter ) )
                    // InternalPcode.g:966:5: (lv_parameters_12_0= ruleParameter )
                    {
                    // InternalPcode.g:966:5: (lv_parameters_12_0= ruleParameter )
                    // InternalPcode.g:967:6: lv_parameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperation_ImplAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_parameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperation_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_12_0,
                    							"tdt4250.pseudocode.Pcode.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPcode.g:984:4: (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalPcode.g:985:5: otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOperation_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalPcode.g:989:5: ( (lv_parameters_14_0= ruleParameter ) )
                    	    // InternalPcode.g:990:6: (lv_parameters_14_0= ruleParameter )
                    	    {
                    	    // InternalPcode.g:990:6: (lv_parameters_14_0= ruleParameter )
                    	    // InternalPcode.g:991:7: lv_parameters_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperation_ImplAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperation_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_14_0,
                    	    								"tdt4250.pseudocode.Pcode.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getOperation_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getOperation_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleOperation_Impl"


    // $ANTLR start "entryRuleMethod"
    // InternalPcode.g:1022:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalPcode.g:1022:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalPcode.g:1023:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalPcode.g:1029:1: ruleMethod returns [EObject current=null] : ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_visibility_5_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:1035:2: ( ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalPcode.g:1036:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalPcode.g:1036:2: ( () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalPcode.g:1037:3: () otherlv_1= 'Method' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalPcode.g:1037:3: ()
            // InternalPcode.g:1038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getMethodKeyword_1());
            		
            // InternalPcode.g:1048:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:1049:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:1049:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:1050:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPcode.g:1071:3: (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPcode.g:1072:4: otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getVisibilityKeyword_4_0());
                    			
                    // InternalPcode.g:1076:4: ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    // InternalPcode.g:1077:5: (lv_visibility_5_0= ruleVisibilityKind )
                    {
                    // InternalPcode.g:1077:5: (lv_visibility_5_0= ruleVisibilityKind )
                    // InternalPcode.g:1078:6: lv_visibility_5_0= ruleVisibilityKind
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_visibility_5_0=ruleVisibilityKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_5_0,
                    							"tdt4250.pseudocode.Pcode.VisibilityKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:1096:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPcode.g:1097:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getTypeKeyword_5_0());
                    			
                    // InternalPcode.g:1101:4: ( ( ruleEString ) )
                    // InternalPcode.g:1102:5: ( ruleEString )
                    {
                    // InternalPcode.g:1102:5: ( ruleEString )
                    // InternalPcode.g:1103:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodAccess().getTypePseudoTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:1118:3: (otherlv_8= 'exceptions' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPcode.g:1119:4: otherlv_8= 'exceptions' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getExceptionsKeyword_6_0());
                    			
                    // InternalPcode.g:1123:4: ( ( ruleEString ) )
                    // InternalPcode.g:1124:5: ( ruleEString )
                    {
                    // InternalPcode.g:1124:5: ( ruleEString )
                    // InternalPcode.g:1125:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodAccess().getExceptionsPseudoTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:1140:3: (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPcode.g:1141:4: otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getParametersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPcode.g:1149:4: ( (lv_parameters_12_0= ruleParameter ) )
                    // InternalPcode.g:1150:5: (lv_parameters_12_0= ruleParameter )
                    {
                    // InternalPcode.g:1150:5: (lv_parameters_12_0= ruleParameter )
                    // InternalPcode.g:1151:6: lv_parameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_parameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_12_0,
                    							"tdt4250.pseudocode.Pcode.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPcode.g:1168:4: (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==17) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalPcode.g:1169:5: otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalPcode.g:1173:5: ( (lv_parameters_14_0= ruleParameter ) )
                    	    // InternalPcode.g:1174:6: (lv_parameters_14_0= ruleParameter )
                    	    {
                    	    // InternalPcode.g:1174:6: (lv_parameters_14_0= ruleParameter )
                    	    // InternalPcode.g:1175:7: lv_parameters_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_14_0,
                    	    								"tdt4250.pseudocode.Pcode.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleConstructor"
    // InternalPcode.g:1206:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalPcode.g:1206:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalPcode.g:1207:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalPcode.g:1213:1: ruleConstructor returns [EObject current=null] : ( () otherlv_1= 'Constructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_visibility_5_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:1219:2: ( ( () otherlv_1= 'Constructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalPcode.g:1220:2: ( () otherlv_1= 'Constructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalPcode.g:1220:2: ( () otherlv_1= 'Constructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalPcode.g:1221:3: () otherlv_1= 'Constructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )? (otherlv_6= 'type' ( ( ruleEString ) ) )? (otherlv_8= 'exceptions' ( ( ruleEString ) ) )? (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalPcode.g:1221:3: ()
            // InternalPcode.g:1222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getConstructorKeyword_1());
            		
            // InternalPcode.g:1232:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:1233:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:1233:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:1234:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConstructorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstructorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.pseudocode.Pcode.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPcode.g:1255:3: (otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPcode.g:1256:4: otherlv_4= 'visibility' ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getVisibilityKeyword_4_0());
                    			
                    // InternalPcode.g:1260:4: ( (lv_visibility_5_0= ruleVisibilityKind ) )
                    // InternalPcode.g:1261:5: (lv_visibility_5_0= ruleVisibilityKind )
                    {
                    // InternalPcode.g:1261:5: (lv_visibility_5_0= ruleVisibilityKind )
                    // InternalPcode.g:1262:6: lv_visibility_5_0= ruleVisibilityKind
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getVisibilityVisibilityKindEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_visibility_5_0=ruleVisibilityKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						set(
                    							current,
                    							"visibility",
                    							lv_visibility_5_0,
                    							"tdt4250.pseudocode.Pcode.VisibilityKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:1280:3: (otherlv_6= 'type' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPcode.g:1281:4: otherlv_6= 'type' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getTypeKeyword_5_0());
                    			
                    // InternalPcode.g:1285:4: ( ( ruleEString ) )
                    // InternalPcode.g:1286:5: ( ruleEString )
                    {
                    // InternalPcode.g:1286:5: ( ruleEString )
                    // InternalPcode.g:1287:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstructorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConstructorAccess().getTypePseudoTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:1302:3: (otherlv_8= 'exceptions' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPcode.g:1303:4: otherlv_8= 'exceptions' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstructorAccess().getExceptionsKeyword_6_0());
                    			
                    // InternalPcode.g:1307:4: ( ( ruleEString ) )
                    // InternalPcode.g:1308:5: ( ruleEString )
                    {
                    // InternalPcode.g:1308:5: ( ruleEString )
                    // InternalPcode.g:1309:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstructorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConstructorAccess().getExceptionsPseudoTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPcode.g:1324:3: (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPcode.g:1325:4: otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstructorAccess().getParametersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPcode.g:1333:4: ( (lv_parameters_12_0= ruleParameter ) )
                    // InternalPcode.g:1334:5: (lv_parameters_12_0= ruleParameter )
                    {
                    // InternalPcode.g:1334:5: (lv_parameters_12_0= ruleParameter )
                    // InternalPcode.g:1335:6: lv_parameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_parameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_12_0,
                    							"tdt4250.pseudocode.Pcode.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPcode.g:1352:4: (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==17) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalPcode.g:1353:5: otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getConstructorAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalPcode.g:1357:5: ( (lv_parameters_14_0= ruleParameter ) )
                    	    // InternalPcode.g:1358:6: (lv_parameters_14_0= ruleParameter )
                    	    {
                    	    // InternalPcode.g:1358:6: (lv_parameters_14_0= ruleParameter )
                    	    // InternalPcode.g:1359:7: lv_parameters_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstructorAccess().getParametersParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_14_0,
                    	    								"tdt4250.pseudocode.Pcode.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleParameter"
    // InternalPcode.g:1390:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPcode.g:1390:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPcode.g:1391:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalPcode.g:1397:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalPcode.g:1403:2: ( ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalPcode.g:1404:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalPcode.g:1404:2: ( () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalPcode.g:1405:3: () otherlv_1= 'Parameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalPcode.g:1405:3: ()
            // InternalPcode.g:1406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalPcode.g:1416:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPcode.g:1417:4: (lv_name_2_0= ruleEString )
            {
            // InternalPcode.g:1417:4: (lv_name_2_0= ruleEString )
            // InternalPcode.g:1418:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"tdt4250.pseudocode.Pcode.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPcode.g:1439:3: (otherlv_4= 'type' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPcode.g:1440:4: otherlv_4= 'type' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_4_0());
                    			
                    // InternalPcode.g:1444:4: ( ( ruleEString ) )
                    // InternalPcode.g:1445:5: ( ruleEString )
                    {
                    // InternalPcode.g:1445:5: ( ruleEString )
                    // InternalPcode.g:1446:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypePseudoTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "ruleVisibilityKind"
    // InternalPcode.g:1469:1: ruleVisibilityKind returns [Enumerator current=null] : ( (enumLiteral_0= 'packagePrivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'public' ) ) ;
    public final Enumerator ruleVisibilityKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPcode.g:1475:2: ( ( (enumLiteral_0= 'packagePrivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'public' ) ) )
            // InternalPcode.g:1476:2: ( (enumLiteral_0= 'packagePrivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'public' ) )
            {
            // InternalPcode.g:1476:2: ( (enumLiteral_0= 'packagePrivate' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'public' ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt36=1;
                }
                break;
            case 32:
                {
                alt36=2;
                }
                break;
            case 33:
                {
                alt36=3;
                }
                break;
            case 34:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalPcode.g:1477:3: (enumLiteral_0= 'packagePrivate' )
                    {
                    // InternalPcode.g:1477:3: (enumLiteral_0= 'packagePrivate' )
                    // InternalPcode.g:1478:4: enumLiteral_0= 'packagePrivate'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getPackagePrivateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityKindAccess().getPackagePrivateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPcode.g:1485:3: (enumLiteral_1= 'private' )
                    {
                    // InternalPcode.g:1485:3: (enumLiteral_1= 'private' )
                    // InternalPcode.g:1486:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPcode.g:1493:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalPcode.g:1493:3: (enumLiteral_2= 'protected' )
                    // InternalPcode.g:1494:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPcode.g:1501:3: (enumLiteral_3= 'public' )
                    {
                    // InternalPcode.g:1501:3: (enumLiteral_3= 'public' )
                    // InternalPcode.g:1502:4: enumLiteral_3= 'public'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleVisibilityKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000018E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000018C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000032E00800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000106000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001106000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001104000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C106000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C104000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});

}