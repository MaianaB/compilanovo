package com.ufcg.compiler.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ufcg.compiler.services.GoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'const'", "'='", "'func'", "'('", "')'", "'{'", "'}'", "','", "'string'", "'int'", "'float'", "'boolean'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGo.g"; }



     	private GoGrammarAccess grammarAccess;

        public InternalGoParser(TokenStream input, GoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Init";
       	}

       	@Override
       	protected GoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInit"
    // InternalGo.g:64:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalGo.g:64:45: (iv_ruleInit= ruleInit EOF )
            // InternalGo.g:65:2: iv_ruleInit= ruleInit EOF
            {
             newCompositeNode(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;

             current =iv_ruleInit; 
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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalGo.g:71:1: ruleInit returns [EObject current=null] : ( (lv_elements_0_0= ruleGoDecl ) )* ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:77:2: ( ( (lv_elements_0_0= ruleGoDecl ) )* )
            // InternalGo.g:78:2: ( (lv_elements_0_0= ruleGoDecl ) )*
            {
            // InternalGo.g:78:2: ( (lv_elements_0_0= ruleGoDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:79:3: (lv_elements_0_0= ruleGoDecl )
            	    {
            	    // InternalGo.g:79:3: (lv_elements_0_0= ruleGoDecl )
            	    // InternalGo.g:80:4: lv_elements_0_0= ruleGoDecl
            	    {

            	    				newCompositeNode(grammarAccess.getInitAccess().getElementsGoDeclParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleGoDecl();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getInitRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"com.ufcg.compiler.Go.GoDecl");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleGoDecl"
    // InternalGo.g:100:1: entryRuleGoDecl returns [EObject current=null] : iv_ruleGoDecl= ruleGoDecl EOF ;
    public final EObject entryRuleGoDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoDecl = null;


        try {
            // InternalGo.g:100:47: (iv_ruleGoDecl= ruleGoDecl EOF )
            // InternalGo.g:101:2: iv_ruleGoDecl= ruleGoDecl EOF
            {
             newCompositeNode(grammarAccess.getGoDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoDecl=ruleGoDecl();

            state._fsp--;

             current =iv_ruleGoDecl; 
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
    // $ANTLR end "entryRuleGoDecl"


    // $ANTLR start "ruleGoDecl"
    // InternalGo.g:107:1: ruleGoDecl returns [EObject current=null] : ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFUNCAO ) ) ) ;
    public final EObject ruleGoDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_func_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: ( ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFUNCAO ) ) ) )
            // InternalGo.g:114:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFUNCAO ) ) )
            {
            // InternalGo.g:114:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFUNCAO ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:115:3: ( (lv_var_0_0= ruleVarDecl ) )
                    {
                    // InternalGo.g:115:3: ( (lv_var_0_0= ruleVarDecl ) )
                    // InternalGo.g:116:4: (lv_var_0_0= ruleVarDecl )
                    {
                    // InternalGo.g:116:4: (lv_var_0_0= ruleVarDecl )
                    // InternalGo.g:117:5: lv_var_0_0= ruleVarDecl
                    {

                    					newCompositeNode(grammarAccess.getGoDeclAccess().getVarVarDeclParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVarDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGoDeclRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_0_0,
                    						"com.ufcg.compiler.Go.VarDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:135:3: ( (lv_func_1_0= ruleFUNCAO ) )
                    {
                    // InternalGo.g:135:3: ( (lv_func_1_0= ruleFUNCAO ) )
                    // InternalGo.g:136:4: (lv_func_1_0= ruleFUNCAO )
                    {
                    // InternalGo.g:136:4: (lv_func_1_0= ruleFUNCAO )
                    // InternalGo.g:137:5: lv_func_1_0= ruleFUNCAO
                    {

                    					newCompositeNode(grammarAccess.getGoDeclAccess().getFuncFUNCAOParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_func_1_0=ruleFUNCAO();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGoDeclRule());
                    					}
                    					set(
                    						current,
                    						"func",
                    						lv_func_1_0,
                    						"com.ufcg.compiler.Go.FUNCAO");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleGoDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalGo.g:158:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalGo.g:158:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalGo.g:159:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalGo.g:165:1: ruleVarDecl returns [EObject current=null] : ( ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_atribuicao_2_0= ruleIGUAL ) ) ( (lv_expressao_3_0= ruleEXPRESSAO ) ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_tipoDecl_0_0 = null;

        EObject lv_atribuicao_2_0 = null;

        EObject lv_expressao_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:171:2: ( ( ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_atribuicao_2_0= ruleIGUAL ) ) ( (lv_expressao_3_0= ruleEXPRESSAO ) ) ) )
            // InternalGo.g:172:2: ( ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_atribuicao_2_0= ruleIGUAL ) ) ( (lv_expressao_3_0= ruleEXPRESSAO ) ) )
            {
            // InternalGo.g:172:2: ( ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_atribuicao_2_0= ruleIGUAL ) ) ( (lv_expressao_3_0= ruleEXPRESSAO ) ) )
            // InternalGo.g:173:3: ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_atribuicao_2_0= ruleIGUAL ) ) ( (lv_expressao_3_0= ruleEXPRESSAO ) )
            {
            // InternalGo.g:173:3: ( (lv_tipoDecl_0_0= ruleTIPO ) )
            // InternalGo.g:174:4: (lv_tipoDecl_0_0= ruleTIPO )
            {
            // InternalGo.g:174:4: (lv_tipoDecl_0_0= ruleTIPO )
            // InternalGo.g:175:5: lv_tipoDecl_0_0= ruleTIPO
            {

            					newCompositeNode(grammarAccess.getVarDeclAccess().getTipoDeclTIPOParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_tipoDecl_0_0=ruleTIPO();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclRule());
            					}
            					set(
            						current,
            						"tipoDecl",
            						lv_tipoDecl_0_0,
            						"com.ufcg.compiler.Go.TIPO");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGo.g:192:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGo.g:193:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGo.g:193:4: (lv_id_1_0= RULE_ID )
            // InternalGo.g:194:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getVarDeclAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGo.g:210:3: ( (lv_atribuicao_2_0= ruleIGUAL ) )
            // InternalGo.g:211:4: (lv_atribuicao_2_0= ruleIGUAL )
            {
            // InternalGo.g:211:4: (lv_atribuicao_2_0= ruleIGUAL )
            // InternalGo.g:212:5: lv_atribuicao_2_0= ruleIGUAL
            {

            					newCompositeNode(grammarAccess.getVarDeclAccess().getAtribuicaoIGUALParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_atribuicao_2_0=ruleIGUAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclRule());
            					}
            					set(
            						current,
            						"atribuicao",
            						lv_atribuicao_2_0,
            						"com.ufcg.compiler.Go.IGUAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGo.g:229:3: ( (lv_expressao_3_0= ruleEXPRESSAO ) )
            // InternalGo.g:230:4: (lv_expressao_3_0= ruleEXPRESSAO )
            {
            // InternalGo.g:230:4: (lv_expressao_3_0= ruleEXPRESSAO )
            // InternalGo.g:231:5: lv_expressao_3_0= ruleEXPRESSAO
            {

            					newCompositeNode(grammarAccess.getVarDeclAccess().getExpressaoEXPRESSAOParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expressao_3_0=ruleEXPRESSAO();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclRule());
            					}
            					set(
            						current,
            						"expressao",
            						lv_expressao_3_0,
            						"com.ufcg.compiler.Go.EXPRESSAO");
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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleTIPO"
    // InternalGo.g:252:1: entryRuleTIPO returns [EObject current=null] : iv_ruleTIPO= ruleTIPO EOF ;
    public final EObject entryRuleTIPO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTIPO = null;


        try {
            // InternalGo.g:252:45: (iv_ruleTIPO= ruleTIPO EOF )
            // InternalGo.g:253:2: iv_ruleTIPO= ruleTIPO EOF
            {
             newCompositeNode(grammarAccess.getTIPORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTIPO=ruleTIPO();

            state._fsp--;

             current =iv_ruleTIPO; 
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
    // $ANTLR end "entryRuleTIPO"


    // $ANTLR start "ruleTIPO"
    // InternalGo.g:259:1: ruleTIPO returns [EObject current=null] : ( ( (lv_variavel_0_0= 'var' ) ) | ( (lv_constante_1_0= 'const' ) ) ) ;
    public final EObject ruleTIPO() throws RecognitionException {
        EObject current = null;

        Token lv_variavel_0_0=null;
        Token lv_constante_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:265:2: ( ( ( (lv_variavel_0_0= 'var' ) ) | ( (lv_constante_1_0= 'const' ) ) ) )
            // InternalGo.g:266:2: ( ( (lv_variavel_0_0= 'var' ) ) | ( (lv_constante_1_0= 'const' ) ) )
            {
            // InternalGo.g:266:2: ( ( (lv_variavel_0_0= 'var' ) ) | ( (lv_constante_1_0= 'const' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:267:3: ( (lv_variavel_0_0= 'var' ) )
                    {
                    // InternalGo.g:267:3: ( (lv_variavel_0_0= 'var' ) )
                    // InternalGo.g:268:4: (lv_variavel_0_0= 'var' )
                    {
                    // InternalGo.g:268:4: (lv_variavel_0_0= 'var' )
                    // InternalGo.g:269:5: lv_variavel_0_0= 'var'
                    {
                    lv_variavel_0_0=(Token)match(input,11,FOLLOW_2); 

                    					newLeafNode(lv_variavel_0_0, grammarAccess.getTIPOAccess().getVariavelVarKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTIPORule());
                    					}
                    					setWithLastConsumed(current, "variavel", lv_variavel_0_0, "var");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:282:3: ( (lv_constante_1_0= 'const' ) )
                    {
                    // InternalGo.g:282:3: ( (lv_constante_1_0= 'const' ) )
                    // InternalGo.g:283:4: (lv_constante_1_0= 'const' )
                    {
                    // InternalGo.g:283:4: (lv_constante_1_0= 'const' )
                    // InternalGo.g:284:5: lv_constante_1_0= 'const'
                    {
                    lv_constante_1_0=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(lv_constante_1_0, grammarAccess.getTIPOAccess().getConstanteConstKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTIPORule());
                    					}
                    					setWithLastConsumed(current, "constante", lv_constante_1_0, "const");
                    				

                    }


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
    // $ANTLR end "ruleTIPO"


    // $ANTLR start "entryRuleIGUAL"
    // InternalGo.g:300:1: entryRuleIGUAL returns [EObject current=null] : iv_ruleIGUAL= ruleIGUAL EOF ;
    public final EObject entryRuleIGUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIGUAL = null;


        try {
            // InternalGo.g:300:46: (iv_ruleIGUAL= ruleIGUAL EOF )
            // InternalGo.g:301:2: iv_ruleIGUAL= ruleIGUAL EOF
            {
             newCompositeNode(grammarAccess.getIGUALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIGUAL=ruleIGUAL();

            state._fsp--;

             current =iv_ruleIGUAL; 
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
    // $ANTLR end "entryRuleIGUAL"


    // $ANTLR start "ruleIGUAL"
    // InternalGo.g:307:1: ruleIGUAL returns [EObject current=null] : ( (lv_igual_0_0= '=' ) ) ;
    public final EObject ruleIGUAL() throws RecognitionException {
        EObject current = null;

        Token lv_igual_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:313:2: ( ( (lv_igual_0_0= '=' ) ) )
            // InternalGo.g:314:2: ( (lv_igual_0_0= '=' ) )
            {
            // InternalGo.g:314:2: ( (lv_igual_0_0= '=' ) )
            // InternalGo.g:315:3: (lv_igual_0_0= '=' )
            {
            // InternalGo.g:315:3: (lv_igual_0_0= '=' )
            // InternalGo.g:316:4: lv_igual_0_0= '='
            {
            lv_igual_0_0=(Token)match(input,13,FOLLOW_2); 

            				newLeafNode(lv_igual_0_0, grammarAccess.getIGUALAccess().getIgualEqualsSignKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIGUALRule());
            				}
            				setWithLastConsumed(current, "igual", lv_igual_0_0, "=");
            			

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
    // $ANTLR end "ruleIGUAL"


    // $ANTLR start "entryRuleEXPRESSAO"
    // InternalGo.g:331:1: entryRuleEXPRESSAO returns [EObject current=null] : iv_ruleEXPRESSAO= ruleEXPRESSAO EOF ;
    public final EObject entryRuleEXPRESSAO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSAO = null;


        try {
            // InternalGo.g:331:50: (iv_ruleEXPRESSAO= ruleEXPRESSAO EOF )
            // InternalGo.g:332:2: iv_ruleEXPRESSAO= ruleEXPRESSAO EOF
            {
             newCompositeNode(grammarAccess.getEXPRESSAORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEXPRESSAO=ruleEXPRESSAO();

            state._fsp--;

             current =iv_ruleEXPRESSAO; 
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
    // $ANTLR end "entryRuleEXPRESSAO"


    // $ANTLR start "ruleEXPRESSAO"
    // InternalGo.g:338:1: ruleEXPRESSAO returns [EObject current=null] : ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) | ( (lv_declFunction_1_0= ruleFUNCAO ) ) ) ;
    public final EObject ruleEXPRESSAO() throws RecognitionException {
        EObject current = null;

        EObject lv_basic_0_0 = null;

        EObject lv_declFunction_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:344:2: ( ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) | ( (lv_declFunction_1_0= ruleFUNCAO ) ) ) )
            // InternalGo.g:345:2: ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) | ( (lv_declFunction_1_0= ruleFUNCAO ) ) )
            {
            // InternalGo.g:345:2: ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) | ( (lv_declFunction_1_0= ruleFUNCAO ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGo.g:346:3: ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:346:3: ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:347:4: (lv_basic_0_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:347:4: (lv_basic_0_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:348:5: lv_basic_0_0= ruleLITERAIS_BASICOS
                    {

                    					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_basic_0_0=ruleLITERAIS_BASICOS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                    					}
                    					set(
                    						current,
                    						"basic",
                    						lv_basic_0_0,
                    						"com.ufcg.compiler.Go.LITERAIS_BASICOS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:366:3: ( (lv_declFunction_1_0= ruleFUNCAO ) )
                    {
                    // InternalGo.g:366:3: ( (lv_declFunction_1_0= ruleFUNCAO ) )
                    // InternalGo.g:367:4: (lv_declFunction_1_0= ruleFUNCAO )
                    {
                    // InternalGo.g:367:4: (lv_declFunction_1_0= ruleFUNCAO )
                    // InternalGo.g:368:5: lv_declFunction_1_0= ruleFUNCAO
                    {

                    					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFUNCAOParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_declFunction_1_0=ruleFUNCAO();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                    					}
                    					set(
                    						current,
                    						"declFunction",
                    						lv_declFunction_1_0,
                    						"com.ufcg.compiler.Go.FUNCAO");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleEXPRESSAO"


    // $ANTLR start "entryRuleLITERAIS_BASICOS"
    // InternalGo.g:389:1: entryRuleLITERAIS_BASICOS returns [EObject current=null] : iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF ;
    public final EObject entryRuleLITERAIS_BASICOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLITERAIS_BASICOS = null;


        try {
            // InternalGo.g:389:57: (iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF )
            // InternalGo.g:390:2: iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF
            {
             newCompositeNode(grammarAccess.getLITERAIS_BASICOSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLITERAIS_BASICOS=ruleLITERAIS_BASICOS();

            state._fsp--;

             current =iv_ruleLITERAIS_BASICOS; 
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
    // $ANTLR end "entryRuleLITERAIS_BASICOS"


    // $ANTLR start "ruleLITERAIS_BASICOS"
    // InternalGo.g:396:1: ruleLITERAIS_BASICOS returns [EObject current=null] : ( ( (lv_numero_0_0= ruleNUMERO ) ) | ( (lv_string_1_0= ruleSTRING_DECL ) ) ) ;
    public final EObject ruleLITERAIS_BASICOS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numero_0_0 = null;

        AntlrDatatypeRuleToken lv_string_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:402:2: ( ( ( (lv_numero_0_0= ruleNUMERO ) ) | ( (lv_string_1_0= ruleSTRING_DECL ) ) ) )
            // InternalGo.g:403:2: ( ( (lv_numero_0_0= ruleNUMERO ) ) | ( (lv_string_1_0= ruleSTRING_DECL ) ) )
            {
            // InternalGo.g:403:2: ( ( (lv_numero_0_0= ruleNUMERO ) ) | ( (lv_string_1_0= ruleSTRING_DECL ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:404:3: ( (lv_numero_0_0= ruleNUMERO ) )
                    {
                    // InternalGo.g:404:3: ( (lv_numero_0_0= ruleNUMERO ) )
                    // InternalGo.g:405:4: (lv_numero_0_0= ruleNUMERO )
                    {
                    // InternalGo.g:405:4: (lv_numero_0_0= ruleNUMERO )
                    // InternalGo.g:406:5: lv_numero_0_0= ruleNUMERO
                    {

                    					newCompositeNode(grammarAccess.getLITERAIS_BASICOSAccess().getNumeroNUMEROParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_numero_0_0=ruleNUMERO();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLITERAIS_BASICOSRule());
                    					}
                    					set(
                    						current,
                    						"numero",
                    						lv_numero_0_0,
                    						"com.ufcg.compiler.Go.NUMERO");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:424:3: ( (lv_string_1_0= ruleSTRING_DECL ) )
                    {
                    // InternalGo.g:424:3: ( (lv_string_1_0= ruleSTRING_DECL ) )
                    // InternalGo.g:425:4: (lv_string_1_0= ruleSTRING_DECL )
                    {
                    // InternalGo.g:425:4: (lv_string_1_0= ruleSTRING_DECL )
                    // InternalGo.g:426:5: lv_string_1_0= ruleSTRING_DECL
                    {

                    					newCompositeNode(grammarAccess.getLITERAIS_BASICOSAccess().getStringSTRING_DECLParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_string_1_0=ruleSTRING_DECL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLITERAIS_BASICOSRule());
                    					}
                    					set(
                    						current,
                    						"string",
                    						lv_string_1_0,
                    						"com.ufcg.compiler.Go.STRING_DECL");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleLITERAIS_BASICOS"


    // $ANTLR start "entryRuleFUNCAO"
    // InternalGo.g:447:1: entryRuleFUNCAO returns [EObject current=null] : iv_ruleFUNCAO= ruleFUNCAO EOF ;
    public final EObject entryRuleFUNCAO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFUNCAO = null;


        try {
            // InternalGo.g:447:47: (iv_ruleFUNCAO= ruleFUNCAO EOF )
            // InternalGo.g:448:2: iv_ruleFUNCAO= ruleFUNCAO EOF
            {
             newCompositeNode(grammarAccess.getFUNCAORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFUNCAO=ruleFUNCAO();

            state._fsp--;

             current =iv_ruleFUNCAO; 
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
    // $ANTLR end "entryRuleFUNCAO"


    // $ANTLR start "ruleFUNCAO"
    // InternalGo.g:454:1: ruleFUNCAO returns [EObject current=null] : ( ( (lv_func_0_0= 'func' ) ) ( (lv_nome_1_0= RULE_ID ) ) ( (lv_ABRE_PARENTESES_2_0= ruleABRE_PARENTESES ) ) ( (lv_PARAMETERS_LIST_3_0= rulePARAMETERS_LIST ) )? ( (lv_FECHA_PARENTESES_4_0= ruleFECHA_PARENTESES ) ) ( (lv_bloco_5_0= ruleBLOCK ) ) ) ;
    public final EObject ruleFUNCAO() throws RecognitionException {
        EObject current = null;

        Token lv_func_0_0=null;
        Token lv_nome_1_0=null;
        AntlrDatatypeRuleToken lv_ABRE_PARENTESES_2_0 = null;

        EObject lv_PARAMETERS_LIST_3_0 = null;

        AntlrDatatypeRuleToken lv_FECHA_PARENTESES_4_0 = null;

        EObject lv_bloco_5_0 = null;



        	enterRule();

        try {
            // InternalGo.g:460:2: ( ( ( (lv_func_0_0= 'func' ) ) ( (lv_nome_1_0= RULE_ID ) ) ( (lv_ABRE_PARENTESES_2_0= ruleABRE_PARENTESES ) ) ( (lv_PARAMETERS_LIST_3_0= rulePARAMETERS_LIST ) )? ( (lv_FECHA_PARENTESES_4_0= ruleFECHA_PARENTESES ) ) ( (lv_bloco_5_0= ruleBLOCK ) ) ) )
            // InternalGo.g:461:2: ( ( (lv_func_0_0= 'func' ) ) ( (lv_nome_1_0= RULE_ID ) ) ( (lv_ABRE_PARENTESES_2_0= ruleABRE_PARENTESES ) ) ( (lv_PARAMETERS_LIST_3_0= rulePARAMETERS_LIST ) )? ( (lv_FECHA_PARENTESES_4_0= ruleFECHA_PARENTESES ) ) ( (lv_bloco_5_0= ruleBLOCK ) ) )
            {
            // InternalGo.g:461:2: ( ( (lv_func_0_0= 'func' ) ) ( (lv_nome_1_0= RULE_ID ) ) ( (lv_ABRE_PARENTESES_2_0= ruleABRE_PARENTESES ) ) ( (lv_PARAMETERS_LIST_3_0= rulePARAMETERS_LIST ) )? ( (lv_FECHA_PARENTESES_4_0= ruleFECHA_PARENTESES ) ) ( (lv_bloco_5_0= ruleBLOCK ) ) )
            // InternalGo.g:462:3: ( (lv_func_0_0= 'func' ) ) ( (lv_nome_1_0= RULE_ID ) ) ( (lv_ABRE_PARENTESES_2_0= ruleABRE_PARENTESES ) ) ( (lv_PARAMETERS_LIST_3_0= rulePARAMETERS_LIST ) )? ( (lv_FECHA_PARENTESES_4_0= ruleFECHA_PARENTESES ) ) ( (lv_bloco_5_0= ruleBLOCK ) )
            {
            // InternalGo.g:462:3: ( (lv_func_0_0= 'func' ) )
            // InternalGo.g:463:4: (lv_func_0_0= 'func' )
            {
            // InternalGo.g:463:4: (lv_func_0_0= 'func' )
            // InternalGo.g:464:5: lv_func_0_0= 'func'
            {
            lv_func_0_0=(Token)match(input,14,FOLLOW_4); 

            					newLeafNode(lv_func_0_0, grammarAccess.getFUNCAOAccess().getFuncFuncKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFUNCAORule());
            					}
            					setWithLastConsumed(current, "func", lv_func_0_0, "func");
            				

            }


            }

            // InternalGo.g:476:3: ( (lv_nome_1_0= RULE_ID ) )
            // InternalGo.g:477:4: (lv_nome_1_0= RULE_ID )
            {
            // InternalGo.g:477:4: (lv_nome_1_0= RULE_ID )
            // InternalGo.g:478:5: lv_nome_1_0= RULE_ID
            {
            lv_nome_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_nome_1_0, grammarAccess.getFUNCAOAccess().getNomeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFUNCAORule());
            					}
            					setWithLastConsumed(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGo.g:494:3: ( (lv_ABRE_PARENTESES_2_0= ruleABRE_PARENTESES ) )
            // InternalGo.g:495:4: (lv_ABRE_PARENTESES_2_0= ruleABRE_PARENTESES )
            {
            // InternalGo.g:495:4: (lv_ABRE_PARENTESES_2_0= ruleABRE_PARENTESES )
            // InternalGo.g:496:5: lv_ABRE_PARENTESES_2_0= ruleABRE_PARENTESES
            {

            					newCompositeNode(grammarAccess.getFUNCAOAccess().getABRE_PARENTESESABRE_PARENTESESParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_ABRE_PARENTESES_2_0=ruleABRE_PARENTESES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFUNCAORule());
            					}
            					set(
            						current,
            						"ABRE_PARENTESES",
            						lv_ABRE_PARENTESES_2_0,
            						"com.ufcg.compiler.Go.ABRE_PARENTESES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGo.g:513:3: ( (lv_PARAMETERS_LIST_3_0= rulePARAMETERS_LIST ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:514:4: (lv_PARAMETERS_LIST_3_0= rulePARAMETERS_LIST )
                    {
                    // InternalGo.g:514:4: (lv_PARAMETERS_LIST_3_0= rulePARAMETERS_LIST )
                    // InternalGo.g:515:5: lv_PARAMETERS_LIST_3_0= rulePARAMETERS_LIST
                    {

                    					newCompositeNode(grammarAccess.getFUNCAOAccess().getPARAMETERS_LISTPARAMETERS_LISTParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_PARAMETERS_LIST_3_0=rulePARAMETERS_LIST();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFUNCAORule());
                    					}
                    					set(
                    						current,
                    						"PARAMETERS_LIST",
                    						lv_PARAMETERS_LIST_3_0,
                    						"com.ufcg.compiler.Go.PARAMETERS_LIST");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGo.g:532:3: ( (lv_FECHA_PARENTESES_4_0= ruleFECHA_PARENTESES ) )
            // InternalGo.g:533:4: (lv_FECHA_PARENTESES_4_0= ruleFECHA_PARENTESES )
            {
            // InternalGo.g:533:4: (lv_FECHA_PARENTESES_4_0= ruleFECHA_PARENTESES )
            // InternalGo.g:534:5: lv_FECHA_PARENTESES_4_0= ruleFECHA_PARENTESES
            {

            					newCompositeNode(grammarAccess.getFUNCAOAccess().getFECHA_PARENTESESFECHA_PARENTESESParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_FECHA_PARENTESES_4_0=ruleFECHA_PARENTESES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFUNCAORule());
            					}
            					set(
            						current,
            						"FECHA_PARENTESES",
            						lv_FECHA_PARENTESES_4_0,
            						"com.ufcg.compiler.Go.FECHA_PARENTESES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGo.g:551:3: ( (lv_bloco_5_0= ruleBLOCK ) )
            // InternalGo.g:552:4: (lv_bloco_5_0= ruleBLOCK )
            {
            // InternalGo.g:552:4: (lv_bloco_5_0= ruleBLOCK )
            // InternalGo.g:553:5: lv_bloco_5_0= ruleBLOCK
            {

            					newCompositeNode(grammarAccess.getFUNCAOAccess().getBlocoBLOCKParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_bloco_5_0=ruleBLOCK();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFUNCAORule());
            					}
            					set(
            						current,
            						"bloco",
            						lv_bloco_5_0,
            						"com.ufcg.compiler.Go.BLOCK");
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
    // $ANTLR end "ruleFUNCAO"


    // $ANTLR start "entryRuleABRE_PARENTESES"
    // InternalGo.g:574:1: entryRuleABRE_PARENTESES returns [String current=null] : iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF ;
    public final String entryRuleABRE_PARENTESES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABRE_PARENTESES = null;


        try {
            // InternalGo.g:574:55: (iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF )
            // InternalGo.g:575:2: iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF
            {
             newCompositeNode(grammarAccess.getABRE_PARENTESESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleABRE_PARENTESES=ruleABRE_PARENTESES();

            state._fsp--;

             current =iv_ruleABRE_PARENTESES.getText(); 
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
    // $ANTLR end "entryRuleABRE_PARENTESES"


    // $ANTLR start "ruleABRE_PARENTESES"
    // InternalGo.g:581:1: ruleABRE_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleABRE_PARENTESES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:587:2: (kw= '(' )
            // InternalGo.g:588:2: kw= '('
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getABRE_PARENTESESAccess().getLeftParenthesisKeyword());
            	

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
    // $ANTLR end "ruleABRE_PARENTESES"


    // $ANTLR start "entryRuleFECHA_PARENTESES"
    // InternalGo.g:596:1: entryRuleFECHA_PARENTESES returns [String current=null] : iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF ;
    public final String entryRuleFECHA_PARENTESES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFECHA_PARENTESES = null;


        try {
            // InternalGo.g:596:56: (iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF )
            // InternalGo.g:597:2: iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF
            {
             newCompositeNode(grammarAccess.getFECHA_PARENTESESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFECHA_PARENTESES=ruleFECHA_PARENTESES();

            state._fsp--;

             current =iv_ruleFECHA_PARENTESES.getText(); 
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
    // $ANTLR end "entryRuleFECHA_PARENTESES"


    // $ANTLR start "ruleFECHA_PARENTESES"
    // InternalGo.g:603:1: ruleFECHA_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleFECHA_PARENTESES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:609:2: (kw= ')' )
            // InternalGo.g:610:2: kw= ')'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFECHA_PARENTESESAccess().getRightParenthesisKeyword());
            	

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
    // $ANTLR end "ruleFECHA_PARENTESES"


    // $ANTLR start "entryRuleBLOCK"
    // InternalGo.g:618:1: entryRuleBLOCK returns [EObject current=null] : iv_ruleBLOCK= ruleBLOCK EOF ;
    public final EObject entryRuleBLOCK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBLOCK = null;


        try {
            // InternalGo.g:618:46: (iv_ruleBLOCK= ruleBLOCK EOF )
            // InternalGo.g:619:2: iv_ruleBLOCK= ruleBLOCK EOF
            {
             newCompositeNode(grammarAccess.getBLOCKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBLOCK=ruleBLOCK();

            state._fsp--;

             current =iv_ruleBLOCK; 
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
    // $ANTLR end "entryRuleBLOCK"


    // $ANTLR start "ruleBLOCK"
    // InternalGo.g:625:1: ruleBLOCK returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' ) ;
    public final EObject ruleBLOCK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listaDeComandos_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:631:2: ( ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' ) )
            // InternalGo.g:632:2: ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' )
            {
            // InternalGo.g:632:2: ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' )
            // InternalGo.g:633:3: () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}'
            {
            // InternalGo.g:633:3: ()
            // InternalGo.g:634:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBLOCKAccess().getBLOCKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBLOCKAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGo.g:644:3: ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGo.g:645:4: (lv_listaDeComandos_2_0= ruleEXPRESSAO )
            	    {
            	    // InternalGo.g:645:4: (lv_listaDeComandos_2_0= ruleEXPRESSAO )
            	    // InternalGo.g:646:5: lv_listaDeComandos_2_0= ruleEXPRESSAO
            	    {

            	    					newCompositeNode(grammarAccess.getBLOCKAccess().getListaDeComandosEXPRESSAOParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_listaDeComandos_2_0=ruleEXPRESSAO();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBLOCKRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listaDeComandos",
            	    						lv_listaDeComandos_2_0,
            	    						"com.ufcg.compiler.Go.EXPRESSAO");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBLOCKAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBLOCK"


    // $ANTLR start "entryRulePARAMETERS_LIST"
    // InternalGo.g:671:1: entryRulePARAMETERS_LIST returns [EObject current=null] : iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF ;
    public final EObject entryRulePARAMETERS_LIST() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMETERS_LIST = null;


        try {
            // InternalGo.g:671:56: (iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF )
            // InternalGo.g:672:2: iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF
            {
             newCompositeNode(grammarAccess.getPARAMETERS_LISTRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePARAMETERS_LIST=rulePARAMETERS_LIST();

            state._fsp--;

             current =iv_rulePARAMETERS_LIST; 
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
    // $ANTLR end "entryRulePARAMETERS_LIST"


    // $ANTLR start "rulePARAMETERS_LIST"
    // InternalGo.g:678:1: rulePARAMETERS_LIST returns [EObject current=null] : (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* ) ;
    public final EObject rulePARAMETERS_LIST() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PARAMETER_0 = null;

        EObject lv_PARAMETER_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:684:2: ( (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* ) )
            // InternalGo.g:685:2: (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* )
            {
            // InternalGo.g:685:2: (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* )
            // InternalGo.g:686:3: this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )*
            {

            			newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_PARAMETER_0=rulePARAMETER();

            state._fsp--;


            			current = this_PARAMETER_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGo.g:694:3: (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGo.g:695:4: otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPARAMETERS_LISTAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalGo.g:699:4: ( (lv_PARAMETER_2_0= rulePARAMETER ) )
            	    // InternalGo.g:700:5: (lv_PARAMETER_2_0= rulePARAMETER )
            	    {
            	    // InternalGo.g:700:5: (lv_PARAMETER_2_0= rulePARAMETER )
            	    // InternalGo.g:701:6: lv_PARAMETER_2_0= rulePARAMETER
            	    {

            	    						newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERPARAMETERParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_PARAMETER_2_0=rulePARAMETER();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPARAMETERS_LISTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"PARAMETER",
            	    							lv_PARAMETER_2_0,
            	    							"com.ufcg.compiler.Go.PARAMETER");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "rulePARAMETERS_LIST"


    // $ANTLR start "entryRulePARAMETER"
    // InternalGo.g:723:1: entryRulePARAMETER returns [EObject current=null] : iv_rulePARAMETER= rulePARAMETER EOF ;
    public final EObject entryRulePARAMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMETER = null;


        try {
            // InternalGo.g:723:50: (iv_rulePARAMETER= rulePARAMETER EOF )
            // InternalGo.g:724:2: iv_rulePARAMETER= rulePARAMETER EOF
            {
             newCompositeNode(grammarAccess.getPARAMETERRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePARAMETER=rulePARAMETER();

            state._fsp--;

             current =iv_rulePARAMETER; 
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
    // $ANTLR end "entryRulePARAMETER"


    // $ANTLR start "rulePARAMETER"
    // InternalGo.g:730:1: rulePARAMETER returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) ) ;
    public final EObject rulePARAMETER() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        AntlrDatatypeRuleToken lv_tipo_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:736:2: ( ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) ) )
            // InternalGo.g:737:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) )
            {
            // InternalGo.g:737:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) )
            // InternalGo.g:738:3: ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) )
            {
            // InternalGo.g:738:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalGo.g:739:4: (lv_id_0_0= RULE_ID )
            {
            // InternalGo.g:739:4: (lv_id_0_0= RULE_ID )
            // InternalGo.g:740:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_id_0_0, grammarAccess.getPARAMETERAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPARAMETERRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGo.g:756:3: ( (lv_tipo_1_0= ruleTypes ) )
            // InternalGo.g:757:4: (lv_tipo_1_0= ruleTypes )
            {
            // InternalGo.g:757:4: (lv_tipo_1_0= ruleTypes )
            // InternalGo.g:758:5: lv_tipo_1_0= ruleTypes
            {

            					newCompositeNode(grammarAccess.getPARAMETERAccess().getTipoTypesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_tipo_1_0=ruleTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPARAMETERRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_1_0,
            						"com.ufcg.compiler.Go.Types");
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
    // $ANTLR end "rulePARAMETER"


    // $ANTLR start "entryRuleTypes"
    // InternalGo.g:779:1: entryRuleTypes returns [String current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final String entryRuleTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypes = null;


        try {
            // InternalGo.g:779:45: (iv_ruleTypes= ruleTypes EOF )
            // InternalGo.g:780:2: iv_ruleTypes= ruleTypes EOF
            {
             newCompositeNode(grammarAccess.getTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;

             current =iv_ruleTypes.getText(); 
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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalGo.g:786:1: ruleTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' ) ;
    public final AntlrDatatypeRuleToken ruleTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:792:2: ( (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' ) )
            // InternalGo.g:793:2: (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' )
            {
            // InternalGo.g:793:2: (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGo.g:794:3: kw= 'string'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypesAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGo.g:800:3: kw= 'int'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypesAccess().getIntKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGo.g:806:3: kw= 'float'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypesAccess().getFloatKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGo.g:812:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypesAccess().getBooleanKeyword_3());
                    		

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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleNUMERO"
    // InternalGo.g:821:1: entryRuleNUMERO returns [String current=null] : iv_ruleNUMERO= ruleNUMERO EOF ;
    public final String entryRuleNUMERO() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERO = null;


        try {
            // InternalGo.g:821:46: (iv_ruleNUMERO= ruleNUMERO EOF )
            // InternalGo.g:822:2: iv_ruleNUMERO= ruleNUMERO EOF
            {
             newCompositeNode(grammarAccess.getNUMERORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMERO=ruleNUMERO();

            state._fsp--;

             current =iv_ruleNUMERO.getText(); 
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
    // $ANTLR end "entryRuleNUMERO"


    // $ANTLR start "ruleNUMERO"
    // InternalGo.g:828:1: ruleNUMERO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMERO() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGo.g:834:2: (this_INT_0= RULE_INT )
            // InternalGo.g:835:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getNUMEROAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleNUMERO"


    // $ANTLR start "entryRuleSTRING_DECL"
    // InternalGo.g:845:1: entryRuleSTRING_DECL returns [String current=null] : iv_ruleSTRING_DECL= ruleSTRING_DECL EOF ;
    public final String entryRuleSTRING_DECL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTRING_DECL = null;


        try {
            // InternalGo.g:845:51: (iv_ruleSTRING_DECL= ruleSTRING_DECL EOF )
            // InternalGo.g:846:2: iv_ruleSTRING_DECL= ruleSTRING_DECL EOF
            {
             newCompositeNode(grammarAccess.getSTRING_DECLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTRING_DECL=ruleSTRING_DECL();

            state._fsp--;

             current =iv_ruleSTRING_DECL.getText(); 
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
    // $ANTLR end "entryRuleSTRING_DECL"


    // $ANTLR start "ruleSTRING_DECL"
    // InternalGo.g:852:1: ruleSTRING_DECL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSTRING_DECL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalGo.g:858:2: (this_ID_0= RULE_ID )
            // InternalGo.g:859:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getSTRING_DECLAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleSTRING_DECL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000005830L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000045830L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F00000L});

}