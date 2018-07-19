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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMERO", "RULE_STRING_DECL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'const'", "'='", "'func'", "'('", "')'", "'{'", "'}'", "','", "'string'", "'int'", "'float'", "'boolean'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_STRING_DECL=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_NUMERO=5;
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

                if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==16) ) {
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
    // InternalGo.g:107:1: ruleGoDecl returns [EObject current=null] : ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) ) ;
    public final EObject ruleGoDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_func_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:113:2: ( ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) ) )
            // InternalGo.g:114:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) )
            {
            // InternalGo.g:114:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
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
                    // InternalGo.g:135:3: ( (lv_func_1_0= ruleFunctionType ) )
                    {
                    // InternalGo.g:135:3: ( (lv_func_1_0= ruleFunctionType ) )
                    // InternalGo.g:136:4: (lv_func_1_0= ruleFunctionType )
                    {
                    // InternalGo.g:136:4: (lv_func_1_0= ruleFunctionType )
                    // InternalGo.g:137:5: lv_func_1_0= ruleFunctionType
                    {

                    					newCompositeNode(grammarAccess.getGoDeclAccess().getFuncFunctionTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_func_1_0=ruleFunctionType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGoDeclRule());
                    					}
                    					set(
                    						current,
                    						"func",
                    						lv_func_1_0,
                    						"com.ufcg.compiler.Go.FunctionType");
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

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
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
                    lv_variavel_0_0=(Token)match(input,13,FOLLOW_2); 

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
                    lv_constante_1_0=(Token)match(input,14,FOLLOW_2); 

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
            lv_igual_0_0=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGo.g:338:1: ruleEXPRESSAO returns [EObject current=null] : ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) | ( (lv_declFunction_1_0= ruleFunctionType ) ) | ( (lv_variaveis_2_0= ruleVarDecl ) ) ) ;
    public final EObject ruleEXPRESSAO() throws RecognitionException {
        EObject current = null;

        EObject lv_basic_0_0 = null;

        EObject lv_declFunction_1_0 = null;

        EObject lv_variaveis_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:344:2: ( ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) | ( (lv_declFunction_1_0= ruleFunctionType ) ) | ( (lv_variaveis_2_0= ruleVarDecl ) ) ) )
            // InternalGo.g:345:2: ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) | ( (lv_declFunction_1_0= ruleFunctionType ) ) | ( (lv_variaveis_2_0= ruleVarDecl ) ) )
            {
            // InternalGo.g:345:2: ( ( (lv_basic_0_0= ruleLITERAIS_BASICOS ) ) | ( (lv_declFunction_1_0= ruleFunctionType ) ) | ( (lv_variaveis_2_0= ruleVarDecl ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
            case RULE_STRING_DECL:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 13:
            case 14:
                {
                alt4=3;
                }
                break;
            default:
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
                    // InternalGo.g:366:3: ( (lv_declFunction_1_0= ruleFunctionType ) )
                    {
                    // InternalGo.g:366:3: ( (lv_declFunction_1_0= ruleFunctionType ) )
                    // InternalGo.g:367:4: (lv_declFunction_1_0= ruleFunctionType )
                    {
                    // InternalGo.g:367:4: (lv_declFunction_1_0= ruleFunctionType )
                    // InternalGo.g:368:5: lv_declFunction_1_0= ruleFunctionType
                    {

                    					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_declFunction_1_0=ruleFunctionType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                    					}
                    					set(
                    						current,
                    						"declFunction",
                    						lv_declFunction_1_0,
                    						"com.ufcg.compiler.Go.FunctionType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:386:3: ( (lv_variaveis_2_0= ruleVarDecl ) )
                    {
                    // InternalGo.g:386:3: ( (lv_variaveis_2_0= ruleVarDecl ) )
                    // InternalGo.g:387:4: (lv_variaveis_2_0= ruleVarDecl )
                    {
                    // InternalGo.g:387:4: (lv_variaveis_2_0= ruleVarDecl )
                    // InternalGo.g:388:5: lv_variaveis_2_0= ruleVarDecl
                    {

                    					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variaveis_2_0=ruleVarDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                    					}
                    					set(
                    						current,
                    						"variaveis",
                    						lv_variaveis_2_0,
                    						"com.ufcg.compiler.Go.VarDecl");
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
    // InternalGo.g:409:1: entryRuleLITERAIS_BASICOS returns [EObject current=null] : iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF ;
    public final EObject entryRuleLITERAIS_BASICOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLITERAIS_BASICOS = null;


        try {
            // InternalGo.g:409:57: (iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF )
            // InternalGo.g:410:2: iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF
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
    // InternalGo.g:416:1: ruleLITERAIS_BASICOS returns [EObject current=null] : ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) ) ;
    public final EObject ruleLITERAIS_BASICOS() throws RecognitionException {
        EObject current = null;

        Token lv_numero_0_0=null;
        Token lv_string_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:422:2: ( ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) ) )
            // InternalGo.g:423:2: ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) )
            {
            // InternalGo.g:423:2: ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NUMERO) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING_DECL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:424:3: ( (lv_numero_0_0= RULE_NUMERO ) )
                    {
                    // InternalGo.g:424:3: ( (lv_numero_0_0= RULE_NUMERO ) )
                    // InternalGo.g:425:4: (lv_numero_0_0= RULE_NUMERO )
                    {
                    // InternalGo.g:425:4: (lv_numero_0_0= RULE_NUMERO )
                    // InternalGo.g:426:5: lv_numero_0_0= RULE_NUMERO
                    {
                    lv_numero_0_0=(Token)match(input,RULE_NUMERO,FOLLOW_2); 

                    					newLeafNode(lv_numero_0_0, grammarAccess.getLITERAIS_BASICOSAccess().getNumeroNUMEROTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLITERAIS_BASICOSRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"numero",
                    						lv_numero_0_0,
                    						"com.ufcg.compiler.Go.NUMERO");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:443:3: ( (lv_string_1_0= RULE_STRING_DECL ) )
                    {
                    // InternalGo.g:443:3: ( (lv_string_1_0= RULE_STRING_DECL ) )
                    // InternalGo.g:444:4: (lv_string_1_0= RULE_STRING_DECL )
                    {
                    // InternalGo.g:444:4: (lv_string_1_0= RULE_STRING_DECL )
                    // InternalGo.g:445:5: lv_string_1_0= RULE_STRING_DECL
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING_DECL,FOLLOW_2); 

                    					newLeafNode(lv_string_1_0, grammarAccess.getLITERAIS_BASICOSAccess().getStringSTRING_DECLTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLITERAIS_BASICOSRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_1_0,
                    						"com.ufcg.compiler.Go.STRING_DECL");
                    				

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


    // $ANTLR start "entryRuleFunctionType"
    // InternalGo.g:465:1: entryRuleFunctionType returns [EObject current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final EObject entryRuleFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionType = null;


        try {
            // InternalGo.g:465:53: (iv_ruleFunctionType= ruleFunctionType EOF )
            // InternalGo.g:466:2: iv_ruleFunctionType= ruleFunctionType EOF
            {
             newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionType=ruleFunctionType();

            state._fsp--;

             current =iv_ruleFunctionType; 
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
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // InternalGo.g:472:1: ruleFunctionType returns [EObject current=null] : (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? ) ;
    public final EObject ruleFunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nome_1_0=null;
        EObject lv_assinatura_2_0 = null;

        EObject lv_bloco_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:478:2: ( (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? ) )
            // InternalGo.g:479:2: (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? )
            {
            // InternalGo.g:479:2: (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? )
            // InternalGo.g:480:3: otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionTypeAccess().getFuncKeyword_0());
            		
            // InternalGo.g:484:3: ( (lv_nome_1_0= RULE_ID ) )
            // InternalGo.g:485:4: (lv_nome_1_0= RULE_ID )
            {
            // InternalGo.g:485:4: (lv_nome_1_0= RULE_ID )
            // InternalGo.g:486:5: lv_nome_1_0= RULE_ID
            {
            lv_nome_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_nome_1_0, grammarAccess.getFunctionTypeAccess().getNomeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGo.g:502:3: ( (lv_assinatura_2_0= ruleSignature ) )
            // InternalGo.g:503:4: (lv_assinatura_2_0= ruleSignature )
            {
            // InternalGo.g:503:4: (lv_assinatura_2_0= ruleSignature )
            // InternalGo.g:504:5: lv_assinatura_2_0= ruleSignature
            {

            					newCompositeNode(grammarAccess.getFunctionTypeAccess().getAssinaturaSignatureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_assinatura_2_0=ruleSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
            					}
            					set(
            						current,
            						"assinatura",
            						lv_assinatura_2_0,
            						"com.ufcg.compiler.Go.Signature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGo.g:521:3: ( (lv_bloco_3_0= ruleBLOCK ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:522:4: (lv_bloco_3_0= ruleBLOCK )
                    {
                    // InternalGo.g:522:4: (lv_bloco_3_0= ruleBLOCK )
                    // InternalGo.g:523:5: lv_bloco_3_0= ruleBLOCK
                    {

                    					newCompositeNode(grammarAccess.getFunctionTypeAccess().getBlocoBLOCKParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bloco_3_0=ruleBLOCK();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
                    					}
                    					set(
                    						current,
                    						"bloco",
                    						lv_bloco_3_0,
                    						"com.ufcg.compiler.Go.BLOCK");
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
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleSignature"
    // InternalGo.g:544:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalGo.g:544:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalGo.g:545:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalGo.g:551:1: ruleSignature returns [EObject current=null] : (this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        EObject this_Parameters_0 = null;

        EObject lv_retorno_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:557:2: ( (this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )? ) )
            // InternalGo.g:558:2: (this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )? )
            {
            // InternalGo.g:558:2: (this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )? )
            // InternalGo.g:559:3: this_Parameters_0= ruleParameters ( (lv_retorno_1_0= ruleResult ) )?
            {

            			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Parameters_0=ruleParameters();

            state._fsp--;


            			current = this_Parameters_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGo.g:567:3: ( (lv_retorno_1_0= ruleResult ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17||(LA7_0>=22 && LA7_0<=25)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:568:4: (lv_retorno_1_0= ruleResult )
                    {
                    // InternalGo.g:568:4: (lv_retorno_1_0= ruleResult )
                    // InternalGo.g:569:5: lv_retorno_1_0= ruleResult
                    {

                    					newCompositeNode(grammarAccess.getSignatureAccess().getRetornoResultParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_retorno_1_0=ruleResult();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSignatureRule());
                    					}
                    					set(
                    						current,
                    						"retorno",
                    						lv_retorno_1_0,
                    						"com.ufcg.compiler.Go.Result");
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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleResult"
    // InternalGo.g:590:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalGo.g:590:47: (iv_ruleResult= ruleResult EOF )
            // InternalGo.g:591:2: iv_ruleResult= ruleResult EOF
            {
             newCompositeNode(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;

             current =iv_ruleResult; 
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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalGo.g:597:1: ruleResult returns [EObject current=null] : ( ( () ( (lv_parametros_1_0= ruleParameters ) ) ) | ( (lv_tipo_2_0= ruleTypes ) ) ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        EObject lv_parametros_1_0 = null;

        AntlrDatatypeRuleToken lv_tipo_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:603:2: ( ( ( () ( (lv_parametros_1_0= ruleParameters ) ) ) | ( (lv_tipo_2_0= ruleTypes ) ) ) )
            // InternalGo.g:604:2: ( ( () ( (lv_parametros_1_0= ruleParameters ) ) ) | ( (lv_tipo_2_0= ruleTypes ) ) )
            {
            // InternalGo.g:604:2: ( ( () ( (lv_parametros_1_0= ruleParameters ) ) ) | ( (lv_tipo_2_0= ruleTypes ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=22 && LA8_0<=25)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:605:3: ( () ( (lv_parametros_1_0= ruleParameters ) ) )
                    {
                    // InternalGo.g:605:3: ( () ( (lv_parametros_1_0= ruleParameters ) ) )
                    // InternalGo.g:606:4: () ( (lv_parametros_1_0= ruleParameters ) )
                    {
                    // InternalGo.g:606:4: ()
                    // InternalGo.g:607:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getResultAccess().getResultAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGo.g:613:4: ( (lv_parametros_1_0= ruleParameters ) )
                    // InternalGo.g:614:5: (lv_parametros_1_0= ruleParameters )
                    {
                    // InternalGo.g:614:5: (lv_parametros_1_0= ruleParameters )
                    // InternalGo.g:615:6: lv_parametros_1_0= ruleParameters
                    {

                    						newCompositeNode(grammarAccess.getResultAccess().getParametrosParametersParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parametros_1_0=ruleParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResultRule());
                    						}
                    						set(
                    							current,
                    							"parametros",
                    							lv_parametros_1_0,
                    							"com.ufcg.compiler.Go.Parameters");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:634:3: ( (lv_tipo_2_0= ruleTypes ) )
                    {
                    // InternalGo.g:634:3: ( (lv_tipo_2_0= ruleTypes ) )
                    // InternalGo.g:635:4: (lv_tipo_2_0= ruleTypes )
                    {
                    // InternalGo.g:635:4: (lv_tipo_2_0= ruleTypes )
                    // InternalGo.g:636:5: lv_tipo_2_0= ruleTypes
                    {

                    					newCompositeNode(grammarAccess.getResultAccess().getTipoTypesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tipo_2_0=ruleTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getResultRule());
                    					}
                    					set(
                    						current,
                    						"tipo",
                    						lv_tipo_2_0,
                    						"com.ufcg.compiler.Go.Types");
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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParameters"
    // InternalGo.g:657:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalGo.g:657:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalGo.g:658:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalGo.g:664:1: ruleParameters returns [EObject current=null] : ( () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        EObject this_PARAMETERS_LIST_2 = null;



        	enterRule();

        try {
            // InternalGo.g:670:2: ( ( () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES ) )
            // InternalGo.g:671:2: ( () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES )
            {
            // InternalGo.g:671:2: ( () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES )
            // InternalGo.g:672:3: () ruleABRE_PARENTESES (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )? ruleFECHA_PARENTESES
            {
            // InternalGo.g:672:3: ()
            // InternalGo.g:673:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParametersAccess().getParametersAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getParametersAccess().getABRE_PARENTESESParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            ruleABRE_PARENTESES();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalGo.g:686:3: (this_PARAMETERS_LIST_2= rulePARAMETERS_LIST )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:687:4: this_PARAMETERS_LIST_2= rulePARAMETERS_LIST
                    {

                    				newCompositeNode(grammarAccess.getParametersAccess().getPARAMETERS_LISTParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_10);
                    this_PARAMETERS_LIST_2=rulePARAMETERS_LIST();

                    state._fsp--;


                    				current = this_PARAMETERS_LIST_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getParametersAccess().getFECHA_PARENTESESParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleFECHA_PARENTESES();

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleABRE_PARENTESES"
    // InternalGo.g:707:1: entryRuleABRE_PARENTESES returns [String current=null] : iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF ;
    public final String entryRuleABRE_PARENTESES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABRE_PARENTESES = null;


        try {
            // InternalGo.g:707:55: (iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF )
            // InternalGo.g:708:2: iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF
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
    // InternalGo.g:714:1: ruleABRE_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleABRE_PARENTESES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:720:2: (kw= '(' )
            // InternalGo.g:721:2: kw= '('
            {
            kw=(Token)match(input,17,FOLLOW_2); 

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
    // InternalGo.g:729:1: entryRuleFECHA_PARENTESES returns [String current=null] : iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF ;
    public final String entryRuleFECHA_PARENTESES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFECHA_PARENTESES = null;


        try {
            // InternalGo.g:729:56: (iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF )
            // InternalGo.g:730:2: iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF
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
    // InternalGo.g:736:1: ruleFECHA_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleFECHA_PARENTESES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:742:2: (kw= ')' )
            // InternalGo.g:743:2: kw= ')'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

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
    // InternalGo.g:751:1: entryRuleBLOCK returns [EObject current=null] : iv_ruleBLOCK= ruleBLOCK EOF ;
    public final EObject entryRuleBLOCK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBLOCK = null;


        try {
            // InternalGo.g:751:46: (iv_ruleBLOCK= ruleBLOCK EOF )
            // InternalGo.g:752:2: iv_ruleBLOCK= ruleBLOCK EOF
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
    // InternalGo.g:758:1: ruleBLOCK returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' ) ;
    public final EObject ruleBLOCK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_listaDeComandos_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:764:2: ( ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' ) )
            // InternalGo.g:765:2: ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' )
            {
            // InternalGo.g:765:2: ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}' )
            // InternalGo.g:766:3: () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* otherlv_3= '}'
            {
            // InternalGo.g:766:3: ()
            // InternalGo.g:767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBLOCKAccess().getBLOCKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBLOCKAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGo.g:777:3: ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_NUMERO && LA10_0<=RULE_STRING_DECL)||(LA10_0>=13 && LA10_0<=14)||LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGo.g:778:4: (lv_listaDeComandos_2_0= ruleEXPRESSAO )
            	    {
            	    // InternalGo.g:778:4: (lv_listaDeComandos_2_0= ruleEXPRESSAO )
            	    // InternalGo.g:779:5: lv_listaDeComandos_2_0= ruleEXPRESSAO
            	    {

            	    					newCompositeNode(grammarAccess.getBLOCKAccess().getListaDeComandosEXPRESSAOParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalGo.g:804:1: entryRulePARAMETERS_LIST returns [EObject current=null] : iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF ;
    public final EObject entryRulePARAMETERS_LIST() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMETERS_LIST = null;


        try {
            // InternalGo.g:804:56: (iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF )
            // InternalGo.g:805:2: iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF
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
    // InternalGo.g:811:1: rulePARAMETERS_LIST returns [EObject current=null] : (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* ) ;
    public final EObject rulePARAMETERS_LIST() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_PARAMETER_0 = null;

        EObject lv_PARAMETER_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:817:2: ( (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* ) )
            // InternalGo.g:818:2: (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* )
            {
            // InternalGo.g:818:2: (this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )* )
            // InternalGo.g:819:3: this_PARAMETER_0= rulePARAMETER (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )*
            {

            			newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_PARAMETER_0=rulePARAMETER();

            state._fsp--;


            			current = this_PARAMETER_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalGo.g:827:3: (otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGo.g:828:4: otherlv_1= ',' ( (lv_PARAMETER_2_0= rulePARAMETER ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPARAMETERS_LISTAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalGo.g:832:4: ( (lv_PARAMETER_2_0= rulePARAMETER ) )
            	    // InternalGo.g:833:5: (lv_PARAMETER_2_0= rulePARAMETER )
            	    {
            	    // InternalGo.g:833:5: (lv_PARAMETER_2_0= rulePARAMETER )
            	    // InternalGo.g:834:6: lv_PARAMETER_2_0= rulePARAMETER
            	    {

            	    						newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERPARAMETERParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
            	    break loop11;
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
    // InternalGo.g:856:1: entryRulePARAMETER returns [EObject current=null] : iv_rulePARAMETER= rulePARAMETER EOF ;
    public final EObject entryRulePARAMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMETER = null;


        try {
            // InternalGo.g:856:50: (iv_rulePARAMETER= rulePARAMETER EOF )
            // InternalGo.g:857:2: iv_rulePARAMETER= rulePARAMETER EOF
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
    // InternalGo.g:863:1: rulePARAMETER returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) ) ;
    public final EObject rulePARAMETER() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        AntlrDatatypeRuleToken lv_tipo_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:869:2: ( ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) ) )
            // InternalGo.g:870:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) )
            {
            // InternalGo.g:870:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) ) )
            // InternalGo.g:871:3: ( (lv_id_0_0= RULE_ID ) ) ( (lv_tipo_1_0= ruleTypes ) )
            {
            // InternalGo.g:871:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalGo.g:872:4: (lv_id_0_0= RULE_ID )
            {
            // InternalGo.g:872:4: (lv_id_0_0= RULE_ID )
            // InternalGo.g:873:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalGo.g:889:3: ( (lv_tipo_1_0= ruleTypes ) )
            // InternalGo.g:890:4: (lv_tipo_1_0= ruleTypes )
            {
            // InternalGo.g:890:4: (lv_tipo_1_0= ruleTypes )
            // InternalGo.g:891:5: lv_tipo_1_0= ruleTypes
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
    // InternalGo.g:912:1: entryRuleTypes returns [String current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final String entryRuleTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypes = null;


        try {
            // InternalGo.g:912:45: (iv_ruleTypes= ruleTypes EOF )
            // InternalGo.g:913:2: iv_ruleTypes= ruleTypes EOF
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
    // InternalGo.g:919:1: ruleTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' ) ;
    public final AntlrDatatypeRuleToken ruleTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:925:2: ( (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' ) )
            // InternalGo.g:926:2: (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' )
            {
            // InternalGo.g:926:2: (kw= 'string' | kw= 'int' | kw= 'float' | kw= 'boolean' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGo.g:927:3: kw= 'string'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypesAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGo.g:933:3: kw= 'int'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypesAccess().getIntKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGo.g:939:3: kw= 'float'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypesAccess().getFloatKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGo.g:945:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000016002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003C20002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000116060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003C20000L});

}