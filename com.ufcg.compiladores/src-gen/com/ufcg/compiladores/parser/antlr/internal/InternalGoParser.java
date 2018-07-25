package com.ufcg.compiladores.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ufcg.compiladores.services.GoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VIRGULA", "RULE_NUMERO", "RULE_STRING_DECL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'for'", "'{'", "'}'", "'range'", "';'", "'['", "']'", "'var'", "'const'", "'='", "':='", "'return'", "'func'", "'('", "')'", "'if'", "'else'", "'string'", "'int'", "'float'", "'bool'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'^'", "'++'", "'--'", "'=='", "'>='", "'<='", "'>'", "'<'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int RULE_VIRGULA=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_NUMERO=6;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
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
    public static final int RULE_STRING_DECL=7;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
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


        public InternalGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGo.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

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
    // InternalGo.g:70:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalGo.g:70:45: (iv_ruleInit= ruleInit EOF )
            // InternalGo.g:71:2: iv_ruleInit= ruleInit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInit; 
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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalGo.g:77:1: ruleInit returns [EObject current=null] : ( (lv_elements_0_0= ruleGoDecl ) )* ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:83:2: ( ( (lv_elements_0_0= ruleGoDecl ) )* )
            // InternalGo.g:84:2: ( (lv_elements_0_0= ruleGoDecl ) )*
            {
            // InternalGo.g:84:2: ( (lv_elements_0_0= ruleGoDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=RULE_NUMERO && LA1_0<=RULE_STRING_DECL)||(LA1_0>=14 && LA1_0<=17)||(LA1_0>=23 && LA1_0<=24)||LA1_0==28||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:85:3: (lv_elements_0_0= ruleGoDecl )
            	    {
            	    // InternalGo.g:85:3: (lv_elements_0_0= ruleGoDecl )
            	    // InternalGo.g:86:4: lv_elements_0_0= ruleGoDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInitAccess().getElementsGoDeclParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleGoDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getInitRule());
            	      				}
            	      				add(
            	      					current,
            	      					"elements",
            	      					lv_elements_0_0,
            	      					"com.ufcg.compiladores.Go.GoDecl");
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
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleBOOLEAN_VALUE"
    // InternalGo.g:106:1: entryRuleBOOLEAN_VALUE returns [EObject current=null] : iv_ruleBOOLEAN_VALUE= ruleBOOLEAN_VALUE EOF ;
    public final EObject entryRuleBOOLEAN_VALUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN_VALUE = null;


        try {
            // InternalGo.g:106:54: (iv_ruleBOOLEAN_VALUE= ruleBOOLEAN_VALUE EOF )
            // InternalGo.g:107:2: iv_ruleBOOLEAN_VALUE= ruleBOOLEAN_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEAN_VALUERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN_VALUE=ruleBOOLEAN_VALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN_VALUE; 
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
    // $ANTLR end "entryRuleBOOLEAN_VALUE"


    // $ANTLR start "ruleBOOLEAN_VALUE"
    // InternalGo.g:113:1: ruleBOOLEAN_VALUE returns [EObject current=null] : ( ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) ) | ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) ) ) ;
    public final EObject ruleBOOLEAN_VALUE() throws RecognitionException {
        EObject current = null;

        Token lv_verdadeiro_0_0=null;
        Token lv_falso_1_0=null;


        	enterRule();

        try {
            // InternalGo.g:119:2: ( ( ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) ) | ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) ) ) )
            // InternalGo.g:120:2: ( ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) ) | ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) ) )
            {
            // InternalGo.g:120:2: ( ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) ) | ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) && (synpred4_InternalGo())) {
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
                    // InternalGo.g:121:3: ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) )
                    {
                    // InternalGo.g:121:3: ( ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' ) )
                    // InternalGo.g:122:4: ( ( 'true' ) )=> (lv_verdadeiro_0_0= 'true' )
                    {
                    // InternalGo.g:126:4: (lv_verdadeiro_0_0= 'true' )
                    // InternalGo.g:127:5: lv_verdadeiro_0_0= 'true'
                    {
                    lv_verdadeiro_0_0=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_verdadeiro_0_0, grammarAccess.getBOOLEAN_VALUEAccess().getVerdadeiroTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBOOLEAN_VALUERule());
                      					}
                      					setWithLastConsumed(current, "verdadeiro", lv_verdadeiro_0_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:140:3: ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) )
                    {
                    // InternalGo.g:140:3: ( ( ( 'false' ) )=> (lv_falso_1_0= 'false' ) )
                    // InternalGo.g:141:4: ( ( 'false' ) )=> (lv_falso_1_0= 'false' )
                    {
                    // InternalGo.g:145:4: (lv_falso_1_0= 'false' )
                    // InternalGo.g:146:5: lv_falso_1_0= 'false'
                    {
                    lv_falso_1_0=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_falso_1_0, grammarAccess.getBOOLEAN_VALUEAccess().getFalsoFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBOOLEAN_VALUERule());
                      					}
                      					setWithLastConsumed(current, "falso", lv_falso_1_0, "false");
                      				
                    }

                    }


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
    // $ANTLR end "ruleBOOLEAN_VALUE"


    // $ANTLR start "entryRuleGoDecl"
    // InternalGo.g:162:1: entryRuleGoDecl returns [EObject current=null] : iv_ruleGoDecl= ruleGoDecl EOF ;
    public final EObject entryRuleGoDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoDecl = null;


        try {
            // InternalGo.g:162:47: (iv_ruleGoDecl= ruleGoDecl EOF )
            // InternalGo.g:163:2: iv_ruleGoDecl= ruleGoDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGoDecl=ruleGoDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoDecl; 
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
    // $ANTLR end "entryRuleGoDecl"


    // $ANTLR start "ruleGoDecl"
    // InternalGo.g:169:1: ruleGoDecl returns [EObject current=null] : ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) ) ;
    public final EObject ruleGoDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_func_1_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:175:2: ( ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) ) )
            // InternalGo.g:176:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) )
            {
            // InternalGo.g:176:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalGo.g:177:3: ( (lv_var_0_0= ruleVarDecl ) )
                    {
                    // InternalGo.g:177:3: ( (lv_var_0_0= ruleVarDecl ) )
                    // InternalGo.g:178:4: (lv_var_0_0= ruleVarDecl )
                    {
                    // InternalGo.g:178:4: (lv_var_0_0= ruleVarDecl )
                    // InternalGo.g:179:5: lv_var_0_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGoDeclAccess().getVarVarDeclParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGoDeclRule());
                      					}
                      					set(
                      						current,
                      						"var",
                      						lv_var_0_0,
                      						"com.ufcg.compiladores.Go.VarDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:197:3: ( (lv_func_1_0= ruleFunctionType ) )
                    {
                    // InternalGo.g:197:3: ( (lv_func_1_0= ruleFunctionType ) )
                    // InternalGo.g:198:4: (lv_func_1_0= ruleFunctionType )
                    {
                    // InternalGo.g:198:4: (lv_func_1_0= ruleFunctionType )
                    // InternalGo.g:199:5: lv_func_1_0= ruleFunctionType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGoDeclAccess().getFuncFunctionTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_func_1_0=ruleFunctionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGoDeclRule());
                      					}
                      					set(
                      						current,
                      						"func",
                      						lv_func_1_0,
                      						"com.ufcg.compiladores.Go.FunctionType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:217:3: ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) )
                    {
                    // InternalGo.g:217:3: ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) )
                    // InternalGo.g:218:4: (lv_expressao_2_0= ruleEXPRESSAOLINHA )
                    {
                    // InternalGo.g:218:4: (lv_expressao_2_0= ruleEXPRESSAOLINHA )
                    // InternalGo.g:219:5: lv_expressao_2_0= ruleEXPRESSAOLINHA
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGoDeclAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expressao_2_0=ruleEXPRESSAOLINHA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGoDeclRule());
                      					}
                      					set(
                      						current,
                      						"expressao",
                      						lv_expressao_2_0,
                      						"com.ufcg.compiladores.Go.EXPRESSAOLINHA");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


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
    // $ANTLR end "ruleGoDecl"


    // $ANTLR start "entryRuleForDecl"
    // InternalGo.g:240:1: entryRuleForDecl returns [EObject current=null] : iv_ruleForDecl= ruleForDecl EOF ;
    public final EObject entryRuleForDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForDecl = null;


        try {
            // InternalGo.g:240:48: (iv_ruleForDecl= ruleForDecl EOF )
            // InternalGo.g:241:2: iv_ruleForDecl= ruleForDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForDecl=ruleForDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForDecl; 
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
    // $ANTLR end "entryRuleForDecl"


    // $ANTLR start "ruleForDecl"
    // InternalGo.g:247:1: ruleForDecl returns [EObject current=null] : (otherlv_0= 'for' ( ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) | ( (lv_range_2_0= ruleRangeDecl ) ) ) otherlv_3= '{' ( (lv_comandos_4_0= ruleGoDecl ) )? otherlv_5= '}' ) ;
    public final EObject ruleForDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_clause_1_0 = null;

        EObject lv_range_2_0 = null;

        EObject lv_comandos_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:253:2: ( (otherlv_0= 'for' ( ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) | ( (lv_range_2_0= ruleRangeDecl ) ) ) otherlv_3= '{' ( (lv_comandos_4_0= ruleGoDecl ) )? otherlv_5= '}' ) )
            // InternalGo.g:254:2: (otherlv_0= 'for' ( ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) | ( (lv_range_2_0= ruleRangeDecl ) ) ) otherlv_3= '{' ( (lv_comandos_4_0= ruleGoDecl ) )? otherlv_5= '}' )
            {
            // InternalGo.g:254:2: (otherlv_0= 'for' ( ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) | ( (lv_range_2_0= ruleRangeDecl ) ) ) otherlv_3= '{' ( (lv_comandos_4_0= ruleGoDecl ) )? otherlv_5= '}' )
            // InternalGo.g:255:3: otherlv_0= 'for' ( ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) | ( (lv_range_2_0= ruleRangeDecl ) ) ) otherlv_3= '{' ( (lv_comandos_4_0= ruleGoDecl ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForDeclAccess().getForKeyword_0());
              		
            }
            // InternalGo.g:259:3: ( ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) ) | ( (lv_range_2_0= ruleRangeDecl ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20||(LA4_0>=23 && LA4_0<=24)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGo.g:260:4: ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) )
                    {
                    // InternalGo.g:260:4: ( ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause ) )
                    // InternalGo.g:261:5: ( ( ruleForClause ) )=> (lv_clause_1_0= ruleForClause )
                    {
                    // InternalGo.g:265:5: (lv_clause_1_0= ruleForClause )
                    // InternalGo.g:266:6: lv_clause_1_0= ruleForClause
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getForDeclAccess().getClauseForClauseParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_clause_1_0=ruleForClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getForDeclRule());
                      						}
                      						set(
                      							current,
                      							"clause",
                      							lv_clause_1_0,
                      							"com.ufcg.compiladores.Go.ForClause");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:284:4: ( (lv_range_2_0= ruleRangeDecl ) )
                    {
                    // InternalGo.g:284:4: ( (lv_range_2_0= ruleRangeDecl ) )
                    // InternalGo.g:285:5: (lv_range_2_0= ruleRangeDecl )
                    {
                    // InternalGo.g:285:5: (lv_range_2_0= ruleRangeDecl )
                    // InternalGo.g:286:6: lv_range_2_0= ruleRangeDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getForDeclAccess().getRangeRangeDeclParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_range_2_0=ruleRangeDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getForDeclRule());
                      						}
                      						set(
                      							current,
                      							"range",
                      							lv_range_2_0,
                      							"com.ufcg.compiladores.Go.RangeDecl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForDeclAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGo.g:308:3: ( (lv_comandos_4_0= ruleGoDecl ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=RULE_NUMERO && LA5_0<=RULE_STRING_DECL)||(LA5_0>=14 && LA5_0<=17)||(LA5_0>=23 && LA5_0<=24)||LA5_0==28||LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:309:4: (lv_comandos_4_0= ruleGoDecl )
                    {
                    // InternalGo.g:309:4: (lv_comandos_4_0= ruleGoDecl )
                    // InternalGo.g:310:5: lv_comandos_4_0= ruleGoDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForDeclAccess().getComandosGoDeclParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_comandos_4_0=ruleGoDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForDeclRule());
                      					}
                      					set(
                      						current,
                      						"comandos",
                      						lv_comandos_4_0,
                      						"com.ufcg.compiladores.Go.GoDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForDeclAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleForDecl"


    // $ANTLR start "entryRuleRangeDecl"
    // InternalGo.g:335:1: entryRuleRangeDecl returns [EObject current=null] : iv_ruleRangeDecl= ruleRangeDecl EOF ;
    public final EObject entryRuleRangeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeDecl = null;


        try {
            // InternalGo.g:335:50: (iv_ruleRangeDecl= ruleRangeDecl EOF )
            // InternalGo.g:336:2: iv_ruleRangeDecl= ruleRangeDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRangeDecl=ruleRangeDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeDecl; 
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
    // $ANTLR end "entryRuleRangeDecl"


    // $ANTLR start "ruleRangeDecl"
    // InternalGo.g:342:1: ruleRangeDecl returns [EObject current=null] : ( () ( (lv_idList_1_0= ruleIDList ) ) ( ( (lv_igual_2_0= ruleIGUAL ) ) | ( (lv_op_3_0= rulePONTOSIGUAL ) ) ) otherlv_4= 'range' ( ( (lv_variavel_5_0= ruleVarCall ) ) | ( (lv_func_6_0= ruleFunctionCall ) ) ) ) ;
    public final EObject ruleRangeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_idList_1_0 = null;

        EObject lv_igual_2_0 = null;

        EObject lv_op_3_0 = null;

        EObject lv_variavel_5_0 = null;

        EObject lv_func_6_0 = null;



        	enterRule();

        try {
            // InternalGo.g:348:2: ( ( () ( (lv_idList_1_0= ruleIDList ) ) ( ( (lv_igual_2_0= ruleIGUAL ) ) | ( (lv_op_3_0= rulePONTOSIGUAL ) ) ) otherlv_4= 'range' ( ( (lv_variavel_5_0= ruleVarCall ) ) | ( (lv_func_6_0= ruleFunctionCall ) ) ) ) )
            // InternalGo.g:349:2: ( () ( (lv_idList_1_0= ruleIDList ) ) ( ( (lv_igual_2_0= ruleIGUAL ) ) | ( (lv_op_3_0= rulePONTOSIGUAL ) ) ) otherlv_4= 'range' ( ( (lv_variavel_5_0= ruleVarCall ) ) | ( (lv_func_6_0= ruleFunctionCall ) ) ) )
            {
            // InternalGo.g:349:2: ( () ( (lv_idList_1_0= ruleIDList ) ) ( ( (lv_igual_2_0= ruleIGUAL ) ) | ( (lv_op_3_0= rulePONTOSIGUAL ) ) ) otherlv_4= 'range' ( ( (lv_variavel_5_0= ruleVarCall ) ) | ( (lv_func_6_0= ruleFunctionCall ) ) ) )
            // InternalGo.g:350:3: () ( (lv_idList_1_0= ruleIDList ) ) ( ( (lv_igual_2_0= ruleIGUAL ) ) | ( (lv_op_3_0= rulePONTOSIGUAL ) ) ) otherlv_4= 'range' ( ( (lv_variavel_5_0= ruleVarCall ) ) | ( (lv_func_6_0= ruleFunctionCall ) ) )
            {
            // InternalGo.g:350:3: ()
            // InternalGo.g:351:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRangeDeclAccess().getRangeDeclAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:360:3: ( (lv_idList_1_0= ruleIDList ) )
            // InternalGo.g:361:4: (lv_idList_1_0= ruleIDList )
            {
            // InternalGo.g:361:4: (lv_idList_1_0= ruleIDList )
            // InternalGo.g:362:5: lv_idList_1_0= ruleIDList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRangeDeclAccess().getIdListIDListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_idList_1_0=ruleIDList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRangeDeclRule());
              					}
              					add(
              						current,
              						"idList",
              						lv_idList_1_0,
              						"com.ufcg.compiladores.Go.IDList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:379:3: ( ( (lv_igual_2_0= ruleIGUAL ) ) | ( (lv_op_3_0= rulePONTOSIGUAL ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
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
                    // InternalGo.g:380:4: ( (lv_igual_2_0= ruleIGUAL ) )
                    {
                    // InternalGo.g:380:4: ( (lv_igual_2_0= ruleIGUAL ) )
                    // InternalGo.g:381:5: (lv_igual_2_0= ruleIGUAL )
                    {
                    // InternalGo.g:381:5: (lv_igual_2_0= ruleIGUAL )
                    // InternalGo.g:382:6: lv_igual_2_0= ruleIGUAL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRangeDeclAccess().getIgualIGUALParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_igual_2_0=ruleIGUAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRangeDeclRule());
                      						}
                      						set(
                      							current,
                      							"igual",
                      							lv_igual_2_0,
                      							"com.ufcg.compiladores.Go.IGUAL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:400:4: ( (lv_op_3_0= rulePONTOSIGUAL ) )
                    {
                    // InternalGo.g:400:4: ( (lv_op_3_0= rulePONTOSIGUAL ) )
                    // InternalGo.g:401:5: (lv_op_3_0= rulePONTOSIGUAL )
                    {
                    // InternalGo.g:401:5: (lv_op_3_0= rulePONTOSIGUAL )
                    // InternalGo.g:402:6: lv_op_3_0= rulePONTOSIGUAL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRangeDeclAccess().getOpPONTOSIGUALParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_op_3_0=rulePONTOSIGUAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRangeDeclRule());
                      						}
                      						set(
                      							current,
                      							"op",
                      							lv_op_3_0,
                      							"com.ufcg.compiladores.Go.PONTOSIGUAL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRangeDeclAccess().getRangeKeyword_3());
              		
            }
            // InternalGo.g:424:3: ( ( (lv_variavel_5_0= ruleVarCall ) ) | ( (lv_func_6_0= ruleFunctionCall ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==29) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==17) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:425:4: ( (lv_variavel_5_0= ruleVarCall ) )
                    {
                    // InternalGo.g:425:4: ( (lv_variavel_5_0= ruleVarCall ) )
                    // InternalGo.g:426:5: (lv_variavel_5_0= ruleVarCall )
                    {
                    // InternalGo.g:426:5: (lv_variavel_5_0= ruleVarCall )
                    // InternalGo.g:427:6: lv_variavel_5_0= ruleVarCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRangeDeclAccess().getVariavelVarCallParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_variavel_5_0=ruleVarCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRangeDeclRule());
                      						}
                      						set(
                      							current,
                      							"variavel",
                      							lv_variavel_5_0,
                      							"com.ufcg.compiladores.Go.VarCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:445:4: ( (lv_func_6_0= ruleFunctionCall ) )
                    {
                    // InternalGo.g:445:4: ( (lv_func_6_0= ruleFunctionCall ) )
                    // InternalGo.g:446:5: (lv_func_6_0= ruleFunctionCall )
                    {
                    // InternalGo.g:446:5: (lv_func_6_0= ruleFunctionCall )
                    // InternalGo.g:447:6: lv_func_6_0= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRangeDeclAccess().getFuncFunctionCallParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_func_6_0=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRangeDeclRule());
                      						}
                      						set(
                      							current,
                      							"func",
                      							lv_func_6_0,
                      							"com.ufcg.compiladores.Go.FunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
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
    // $ANTLR end "ruleRangeDecl"


    // $ANTLR start "entryRuleForClause"
    // InternalGo.g:469:1: entryRuleForClause returns [EObject current=null] : iv_ruleForClause= ruleForClause EOF ;
    public final EObject entryRuleForClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForClause = null;


        try {
            // InternalGo.g:469:50: (iv_ruleForClause= ruleForClause EOF )
            // InternalGo.g:470:2: iv_ruleForClause= ruleForClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForClause=ruleForClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForClause; 
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
    // $ANTLR end "entryRuleForClause"


    // $ANTLR start "ruleForClause"
    // InternalGo.g:476:1: ruleForClause returns [EObject current=null] : ( () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )? ) ;
    public final EObject ruleForClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_init_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_post_5_0 = null;



        	enterRule();

        try {
            // InternalGo.g:482:2: ( ( () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )? ) )
            // InternalGo.g:483:2: ( () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )? )
            {
            // InternalGo.g:483:2: ( () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )? )
            // InternalGo.g:484:3: () ( (lv_init_1_0= ruleInitStmt ) )? otherlv_2= ';' ( (lv_condition_3_0= ruleCondition ) )? otherlv_4= ';' ( (lv_post_5_0= rulePostStmt ) )?
            {
            // InternalGo.g:484:3: ()
            // InternalGo.g:485:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getForClauseAccess().getForClauseAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:494:3: ( (lv_init_1_0= ruleInitStmt ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=23 && LA8_0<=24)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:495:4: (lv_init_1_0= ruleInitStmt )
                    {
                    // InternalGo.g:495:4: (lv_init_1_0= ruleInitStmt )
                    // InternalGo.g:496:5: lv_init_1_0= ruleInitStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForClauseAccess().getInitInitStmtParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_init_1_0=ruleInitStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForClauseRule());
                      					}
                      					set(
                      						current,
                      						"init",
                      						lv_init_1_0,
                      						"com.ufcg.compiladores.Go.InitStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForClauseAccess().getSemicolonKeyword_2());
              		
            }
            // InternalGo.g:517:3: ( (lv_condition_3_0= ruleCondition ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=RULE_NUMERO && LA9_0<=RULE_STRING_DECL)||(LA9_0>=14 && LA9_0<=17)||(LA9_0>=23 && LA9_0<=24)||LA9_0==28||LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGo.g:518:4: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalGo.g:518:4: (lv_condition_3_0= ruleCondition )
                    // InternalGo.g:519:5: lv_condition_3_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForClauseAccess().getConditionConditionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForClauseRule());
                      					}
                      					set(
                      						current,
                      						"condition",
                      						lv_condition_3_0,
                      						"com.ufcg.compiladores.Go.Condition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForClauseAccess().getSemicolonKeyword_4());
              		
            }
            // InternalGo.g:540:3: ( (lv_post_5_0= rulePostStmt ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==RULE_NUMERO||(LA10_0>=44 && LA10_0<=45)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGo.g:541:4: (lv_post_5_0= rulePostStmt )
                    {
                    // InternalGo.g:541:4: (lv_post_5_0= rulePostStmt )
                    // InternalGo.g:542:5: lv_post_5_0= rulePostStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForClauseAccess().getPostPostStmtParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_post_5_0=rulePostStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getForClauseRule());
                      					}
                      					set(
                      						current,
                      						"post",
                      						lv_post_5_0,
                      						"com.ufcg.compiladores.Go.PostStmt");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleForClause"


    // $ANTLR start "entryRuleInitStmt"
    // InternalGo.g:563:1: entryRuleInitStmt returns [EObject current=null] : iv_ruleInitStmt= ruleInitStmt EOF ;
    public final EObject entryRuleInitStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitStmt = null;


        try {
            // InternalGo.g:563:49: (iv_ruleInitStmt= ruleInitStmt EOF )
            // InternalGo.g:564:2: iv_ruleInitStmt= ruleInitStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitStmt=ruleInitStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitStmt; 
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
    // $ANTLR end "entryRuleInitStmt"


    // $ANTLR start "ruleInitStmt"
    // InternalGo.g:570:1: ruleInitStmt returns [EObject current=null] : ( (lv_varDecl_0_0= ruleVarDecl ) ) ;
    public final EObject ruleInitStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_varDecl_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:576:2: ( ( (lv_varDecl_0_0= ruleVarDecl ) ) )
            // InternalGo.g:577:2: ( (lv_varDecl_0_0= ruleVarDecl ) )
            {
            // InternalGo.g:577:2: ( (lv_varDecl_0_0= ruleVarDecl ) )
            // InternalGo.g:578:3: (lv_varDecl_0_0= ruleVarDecl )
            {
            // InternalGo.g:578:3: (lv_varDecl_0_0= ruleVarDecl )
            // InternalGo.g:579:4: lv_varDecl_0_0= ruleVarDecl
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getInitStmtAccess().getVarDeclVarDeclParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_varDecl_0_0=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getInitStmtRule());
              				}
              				set(
              					current,
              					"varDecl",
              					lv_varDecl_0_0,
              					"com.ufcg.compiladores.Go.VarDecl");
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleInitStmt"


    // $ANTLR start "entryRulePostStmt"
    // InternalGo.g:599:1: entryRulePostStmt returns [EObject current=null] : iv_rulePostStmt= rulePostStmt EOF ;
    public final EObject entryRulePostStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostStmt = null;


        try {
            // InternalGo.g:599:49: (iv_rulePostStmt= rulePostStmt EOF )
            // InternalGo.g:600:2: iv_rulePostStmt= rulePostStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostStmt=rulePostStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostStmt; 
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
    // $ANTLR end "entryRulePostStmt"


    // $ANTLR start "rulePostStmt"
    // InternalGo.g:606:1: rulePostStmt returns [EObject current=null] : ( ( ( ruleARIT_EXPR ) )=> (lv_art_0_0= ruleARIT_EXPR ) ) ;
    public final EObject rulePostStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_art_0_0 = null;



        	enterRule();

        try {
            // InternalGo.g:612:2: ( ( ( ( ruleARIT_EXPR ) )=> (lv_art_0_0= ruleARIT_EXPR ) ) )
            // InternalGo.g:613:2: ( ( ( ruleARIT_EXPR ) )=> (lv_art_0_0= ruleARIT_EXPR ) )
            {
            // InternalGo.g:613:2: ( ( ( ruleARIT_EXPR ) )=> (lv_art_0_0= ruleARIT_EXPR ) )
            // InternalGo.g:614:3: ( ( ruleARIT_EXPR ) )=> (lv_art_0_0= ruleARIT_EXPR )
            {
            // InternalGo.g:618:3: (lv_art_0_0= ruleARIT_EXPR )
            // InternalGo.g:619:4: lv_art_0_0= ruleARIT_EXPR
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPostStmtAccess().getArtARIT_EXPRParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_art_0_0=ruleARIT_EXPR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPostStmtRule());
              				}
              				set(
              					current,
              					"art",
              					lv_art_0_0,
              					"com.ufcg.compiladores.Go.ARIT_EXPR");
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "rulePostStmt"


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:639:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGo.g:639:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGo.g:640:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGo.g:646:1: ruleCondition returns [EObject current=null] : ( ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expr1_0_0 = null;

        EObject lv_comparador_1_0 = null;

        EObject lv_expr2_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:652:2: ( ( ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) ) ) )
            // InternalGo.g:653:2: ( ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) ) )
            {
            // InternalGo.g:653:2: ( ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) ) )
            // InternalGo.g:654:3: ( (lv_expr1_0_0= ruleEXPRESSAO ) ) ( (lv_comparador_1_0= ruleCOMPARISON ) ) ( (lv_expr2_2_0= ruleEXPRESSAO ) )
            {
            // InternalGo.g:654:3: ( (lv_expr1_0_0= ruleEXPRESSAO ) )
            // InternalGo.g:655:4: (lv_expr1_0_0= ruleEXPRESSAO )
            {
            // InternalGo.g:655:4: (lv_expr1_0_0= ruleEXPRESSAO )
            // InternalGo.g:656:5: lv_expr1_0_0= ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getExpr1EXPRESSAOParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_expr1_0_0=ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"expr1",
              						lv_expr1_0_0,
              						"com.ufcg.compiladores.Go.EXPRESSAO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:673:3: ( (lv_comparador_1_0= ruleCOMPARISON ) )
            // InternalGo.g:674:4: (lv_comparador_1_0= ruleCOMPARISON )
            {
            // InternalGo.g:674:4: (lv_comparador_1_0= ruleCOMPARISON )
            // InternalGo.g:675:5: lv_comparador_1_0= ruleCOMPARISON
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getComparadorCOMPARISONParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_comparador_1_0=ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"comparador",
              						lv_comparador_1_0,
              						"com.ufcg.compiladores.Go.COMPARISON");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:692:3: ( (lv_expr2_2_0= ruleEXPRESSAO ) )
            // InternalGo.g:693:4: (lv_expr2_2_0= ruleEXPRESSAO )
            {
            // InternalGo.g:693:4: (lv_expr2_2_0= ruleEXPRESSAO )
            // InternalGo.g:694:5: lv_expr2_2_0= ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getExpr2EXPRESSAOParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr2_2_0=ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"expr2",
              						lv_expr2_2_0,
              						"com.ufcg.compiladores.Go.EXPRESSAO");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIDList"
    // InternalGo.g:715:1: entryRuleIDList returns [EObject current=null] : iv_ruleIDList= ruleIDList EOF ;
    public final EObject entryRuleIDList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDList = null;


        try {
            // InternalGo.g:715:47: (iv_ruleIDList= ruleIDList EOF )
            // InternalGo.g:716:2: iv_ruleIDList= ruleIDList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIDList=ruleIDList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIDList; 
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
    // $ANTLR end "entryRuleIDList"


    // $ANTLR start "ruleIDList"
    // InternalGo.g:722:1: ruleIDList returns [EObject current=null] : ( ( (lv_idList_0_0= RULE_ID ) ) | ( ( (lv_idList_1_0= RULE_ID ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_list_3_0= ruleIDList ) ) ) ) ;
    public final EObject ruleIDList() throws RecognitionException {
        EObject current = null;

        Token lv_idList_0_0=null;
        Token lv_idList_1_0=null;
        Token lv_vir_2_0=null;
        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:728:2: ( ( ( (lv_idList_0_0= RULE_ID ) ) | ( ( (lv_idList_1_0= RULE_ID ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_list_3_0= ruleIDList ) ) ) ) )
            // InternalGo.g:729:2: ( ( (lv_idList_0_0= RULE_ID ) ) | ( ( (lv_idList_1_0= RULE_ID ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_list_3_0= ruleIDList ) ) ) )
            {
            // InternalGo.g:729:2: ( ( (lv_idList_0_0= RULE_ID ) ) | ( ( (lv_idList_1_0= RULE_ID ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_list_3_0= ruleIDList ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_VIRGULA) ) {
                    alt11=2;
                }
                else if ( (LA11_1==EOF||(LA11_1>=25 && LA11_1<=26)) ) {
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
                    // InternalGo.g:730:3: ( (lv_idList_0_0= RULE_ID ) )
                    {
                    // InternalGo.g:730:3: ( (lv_idList_0_0= RULE_ID ) )
                    // InternalGo.g:731:4: (lv_idList_0_0= RULE_ID )
                    {
                    // InternalGo.g:731:4: (lv_idList_0_0= RULE_ID )
                    // InternalGo.g:732:5: lv_idList_0_0= RULE_ID
                    {
                    lv_idList_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_idList_0_0, grammarAccess.getIDListAccess().getIdListIDTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIDListRule());
                      					}
                      					addWithLastConsumed(
                      						current,
                      						"idList",
                      						lv_idList_0_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:749:3: ( ( (lv_idList_1_0= RULE_ID ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_list_3_0= ruleIDList ) ) )
                    {
                    // InternalGo.g:749:3: ( ( (lv_idList_1_0= RULE_ID ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_list_3_0= ruleIDList ) ) )
                    // InternalGo.g:750:4: ( (lv_idList_1_0= RULE_ID ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_list_3_0= ruleIDList ) )
                    {
                    // InternalGo.g:750:4: ( (lv_idList_1_0= RULE_ID ) )
                    // InternalGo.g:751:5: (lv_idList_1_0= RULE_ID )
                    {
                    // InternalGo.g:751:5: (lv_idList_1_0= RULE_ID )
                    // InternalGo.g:752:6: lv_idList_1_0= RULE_ID
                    {
                    lv_idList_1_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_idList_1_0, grammarAccess.getIDListAccess().getIdListIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getIDListRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"idList",
                      							lv_idList_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalGo.g:768:4: ( (lv_vir_2_0= RULE_VIRGULA ) )
                    // InternalGo.g:769:5: (lv_vir_2_0= RULE_VIRGULA )
                    {
                    // InternalGo.g:769:5: (lv_vir_2_0= RULE_VIRGULA )
                    // InternalGo.g:770:6: lv_vir_2_0= RULE_VIRGULA
                    {
                    lv_vir_2_0=(Token)match(input,RULE_VIRGULA,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_vir_2_0, grammarAccess.getIDListAccess().getVirVIRGULATerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getIDListRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"vir",
                      							lv_vir_2_0,
                      							"com.ufcg.compiladores.Go.VIRGULA");
                      					
                    }

                    }


                    }

                    // InternalGo.g:786:4: ( (lv_list_3_0= ruleIDList ) )
                    // InternalGo.g:787:5: (lv_list_3_0= ruleIDList )
                    {
                    // InternalGo.g:787:5: (lv_list_3_0= ruleIDList )
                    // InternalGo.g:788:6: lv_list_3_0= ruleIDList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIDListAccess().getListIDListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_list_3_0=ruleIDList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIDListRule());
                      						}
                      						add(
                      							current,
                      							"list",
                      							lv_list_3_0,
                      							"com.ufcg.compiladores.Go.IDList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


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
    // $ANTLR end "ruleIDList"


    // $ANTLR start "entryRuleVarDecl"
    // InternalGo.g:810:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalGo.g:810:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalGo.g:811:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDecl; 
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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalGo.g:817:1: ruleVarDecl returns [EObject current=null] : ( ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) )? ( ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) ) )? ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_signature_0_0 = null;

        EObject lv_atribuicao_1_0 = null;

        EObject lv_pront_2_0 = null;

        EObject lv_array_3_0 = null;

        EObject lv_expressao_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:823:2: ( ( ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) )? ( ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) ) )? ) )
            // InternalGo.g:824:2: ( ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) )? ( ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) ) )? )
            {
            // InternalGo.g:824:2: ( ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) )? ( ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) ) )? )
            // InternalGo.g:825:3: ( (lv_signature_0_0= ruleSignatureDel ) ) ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) )? ( ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) ) )?
            {
            // InternalGo.g:825:3: ( (lv_signature_0_0= ruleSignatureDel ) )
            // InternalGo.g:826:4: (lv_signature_0_0= ruleSignatureDel )
            {
            // InternalGo.g:826:4: (lv_signature_0_0= ruleSignatureDel )
            // InternalGo.g:827:5: lv_signature_0_0= ruleSignatureDel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarDeclAccess().getSignatureSignatureDelParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_signature_0_0=ruleSignatureDel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarDeclRule());
              					}
              					set(
              						current,
              						"signature",
              						lv_signature_0_0,
              						"com.ufcg.compiladores.Go.SignatureDel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:844:3: ( ( (lv_atribuicao_1_0= ruleIGUAL ) ) | ( (lv_pront_2_0= rulePONTOSIGUAL ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalGo.g:845:4: ( (lv_atribuicao_1_0= ruleIGUAL ) )
                    {
                    // InternalGo.g:845:4: ( (lv_atribuicao_1_0= ruleIGUAL ) )
                    // InternalGo.g:846:5: (lv_atribuicao_1_0= ruleIGUAL )
                    {
                    // InternalGo.g:846:5: (lv_atribuicao_1_0= ruleIGUAL )
                    // InternalGo.g:847:6: lv_atribuicao_1_0= ruleIGUAL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarDeclAccess().getAtribuicaoIGUALParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_atribuicao_1_0=ruleIGUAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                      						}
                      						set(
                      							current,
                      							"atribuicao",
                      							lv_atribuicao_1_0,
                      							"com.ufcg.compiladores.Go.IGUAL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:865:4: ( (lv_pront_2_0= rulePONTOSIGUAL ) )
                    {
                    // InternalGo.g:865:4: ( (lv_pront_2_0= rulePONTOSIGUAL ) )
                    // InternalGo.g:866:5: (lv_pront_2_0= rulePONTOSIGUAL )
                    {
                    // InternalGo.g:866:5: (lv_pront_2_0= rulePONTOSIGUAL )
                    // InternalGo.g:867:6: lv_pront_2_0= rulePONTOSIGUAL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarDeclAccess().getProntPONTOSIGUALParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_pront_2_0=rulePONTOSIGUAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                      						}
                      						set(
                      							current,
                      							"pront",
                      							lv_pront_2_0,
                      							"com.ufcg.compiladores.Go.PONTOSIGUAL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalGo.g:885:3: ( ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) ) )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalGo.g:886:4: ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) )
                    {
                    // InternalGo.g:886:4: ( (lv_array_3_0= ruleArrayType ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalGo.g:887:5: (lv_array_3_0= ruleArrayType )
                            {
                            // InternalGo.g:887:5: (lv_array_3_0= ruleArrayType )
                            // InternalGo.g:888:6: lv_array_3_0= ruleArrayType
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getVarDeclAccess().getArrayArrayTypeParserRuleCall_2_0_0());
                              					
                            }
                            pushFollow(FOLLOW_15);
                            lv_array_3_0=ruleArrayType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                              						}
                              						set(
                              							current,
                              							"array",
                              							lv_array_3_0,
                              							"com.ufcg.compiladores.Go.ArrayType");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalGo.g:905:4: ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) )
                    // InternalGo.g:906:5: (lv_expressao_4_0= ruleEXPRESSAOLINHA )
                    {
                    // InternalGo.g:906:5: (lv_expressao_4_0= ruleEXPRESSAOLINHA )
                    // InternalGo.g:907:6: lv_expressao_4_0= ruleEXPRESSAOLINHA
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarDeclAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expressao_4_0=ruleEXPRESSAOLINHA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                      						}
                      						set(
                      							current,
                      							"expressao",
                      							lv_expressao_4_0,
                      							"com.ufcg.compiladores.Go.EXPRESSAOLINHA");
                      						afterParserOrEnumRuleCall();
                      					
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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleSignatureDel"
    // InternalGo.g:929:1: entryRuleSignatureDel returns [EObject current=null] : iv_ruleSignatureDel= ruleSignatureDel EOF ;
    public final EObject entryRuleSignatureDel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignatureDel = null;


        try {
            // InternalGo.g:929:53: (iv_ruleSignatureDel= ruleSignatureDel EOF )
            // InternalGo.g:930:2: iv_ruleSignatureDel= ruleSignatureDel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureDelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignatureDel=ruleSignatureDel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignatureDel; 
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
    // $ANTLR end "entryRuleSignatureDel"


    // $ANTLR start "ruleSignatureDel"
    // InternalGo.g:936:1: ruleSignatureDel returns [EObject current=null] : ( ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )? ) ;
    public final EObject ruleSignatureDel() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_tipoDecl_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:942:2: ( ( ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )? ) )
            // InternalGo.g:943:2: ( ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )? )
            {
            // InternalGo.g:943:2: ( ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )? )
            // InternalGo.g:944:3: ( (lv_tipoDecl_0_0= ruleTIPO ) ) ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleTypes ) )?
            {
            // InternalGo.g:944:3: ( (lv_tipoDecl_0_0= ruleTIPO ) )
            // InternalGo.g:945:4: (lv_tipoDecl_0_0= ruleTIPO )
            {
            // InternalGo.g:945:4: (lv_tipoDecl_0_0= ruleTIPO )
            // InternalGo.g:946:5: lv_tipoDecl_0_0= ruleTIPO
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignatureDelAccess().getTipoDeclTIPOParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_tipoDecl_0_0=ruleTIPO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSignatureDelRule());
              					}
              					set(
              						current,
              						"tipoDecl",
              						lv_tipoDecl_0_0,
              						"com.ufcg.compiladores.Go.TIPO");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:963:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalGo.g:964:4: (lv_id_1_0= RULE_ID )
            {
            // InternalGo.g:964:4: (lv_id_1_0= RULE_ID )
            // InternalGo.g:965:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_1_0, grammarAccess.getSignatureDelAccess().getIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSignatureDelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:981:3: ( (lv_type_2_0= ruleTypes ) )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalGo.g:982:4: (lv_type_2_0= ruleTypes )
                    {
                    // InternalGo.g:982:4: (lv_type_2_0= ruleTypes )
                    // InternalGo.g:983:5: lv_type_2_0= ruleTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSignatureDelAccess().getTypeTypesParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSignatureDelRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_2_0,
                      						"com.ufcg.compiladores.Go.Types");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleSignatureDel"


    // $ANTLR start "entryRuleAssignment"
    // InternalGo.g:1004:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalGo.g:1004:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalGo.g:1005:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalGo.g:1011:1: ruleAssignment returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_qtd_2_0=null;
        Token otherlv_3=null;
        EObject lv_igual_4_0 = null;

        EObject lv_dois_5_0 = null;

        EObject lv_expressao_6_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1017:2: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) ) ) )
            // InternalGo.g:1018:2: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) ) )
            {
            // InternalGo.g:1018:2: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) ) )
            // InternalGo.g:1019:3: ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )? ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) ) ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) )
            {
            // InternalGo.g:1019:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalGo.g:1020:4: (lv_id_0_0= RULE_ID )
            {
            // InternalGo.g:1020:4: (lv_id_0_0= RULE_ID )
            // InternalGo.g:1021:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_0_0, grammarAccess.getAssignmentAccess().getIdIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAssignmentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalGo.g:1037:3: (otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1038:4: otherlv_1= '[' ( (lv_qtd_2_0= RULE_NUMERO ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalGo.g:1042:4: ( (lv_qtd_2_0= RULE_NUMERO ) )
                    // InternalGo.g:1043:5: (lv_qtd_2_0= RULE_NUMERO )
                    {
                    // InternalGo.g:1043:5: (lv_qtd_2_0= RULE_NUMERO )
                    // InternalGo.g:1044:6: lv_qtd_2_0= RULE_NUMERO
                    {
                    lv_qtd_2_0=(Token)match(input,RULE_NUMERO,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_qtd_2_0, grammarAccess.getAssignmentAccess().getQtdNUMEROTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAssignmentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"qtd",
                      							lv_qtd_2_0,
                      							"com.ufcg.compiladores.Go.NUMERO");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalGo.g:1065:3: ( ( (lv_igual_4_0= ruleIGUAL ) ) | ( (lv_dois_5_0= rulePONTOSIGUAL ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            else if ( (LA17_0==26) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGo.g:1066:4: ( (lv_igual_4_0= ruleIGUAL ) )
                    {
                    // InternalGo.g:1066:4: ( (lv_igual_4_0= ruleIGUAL ) )
                    // InternalGo.g:1067:5: (lv_igual_4_0= ruleIGUAL )
                    {
                    // InternalGo.g:1067:5: (lv_igual_4_0= ruleIGUAL )
                    // InternalGo.g:1068:6: lv_igual_4_0= ruleIGUAL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentAccess().getIgualIGUALParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_igual_4_0=ruleIGUAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"igual",
                      							lv_igual_4_0,
                      							"com.ufcg.compiladores.Go.IGUAL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1086:4: ( (lv_dois_5_0= rulePONTOSIGUAL ) )
                    {
                    // InternalGo.g:1086:4: ( (lv_dois_5_0= rulePONTOSIGUAL ) )
                    // InternalGo.g:1087:5: (lv_dois_5_0= rulePONTOSIGUAL )
                    {
                    // InternalGo.g:1087:5: (lv_dois_5_0= rulePONTOSIGUAL )
                    // InternalGo.g:1088:6: lv_dois_5_0= rulePONTOSIGUAL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentAccess().getDoisPONTOSIGUALParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_dois_5_0=rulePONTOSIGUAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"dois",
                      							lv_dois_5_0,
                      							"com.ufcg.compiladores.Go.PONTOSIGUAL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalGo.g:1106:3: ( (lv_expressao_6_0= ruleEXPRESSAOLINHA ) )
            // InternalGo.g:1107:4: (lv_expressao_6_0= ruleEXPRESSAOLINHA )
            {
            // InternalGo.g:1107:4: (lv_expressao_6_0= ruleEXPRESSAOLINHA )
            // InternalGo.g:1108:5: lv_expressao_6_0= ruleEXPRESSAOLINHA
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_6_0=ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_6_0,
              						"com.ufcg.compiladores.Go.EXPRESSAOLINHA");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleTIPO"
    // InternalGo.g:1129:1: entryRuleTIPO returns [EObject current=null] : iv_ruleTIPO= ruleTIPO EOF ;
    public final EObject entryRuleTIPO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTIPO = null;


        try {
            // InternalGo.g:1129:45: (iv_ruleTIPO= ruleTIPO EOF )
            // InternalGo.g:1130:2: iv_ruleTIPO= ruleTIPO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTIPORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTIPO=ruleTIPO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTIPO; 
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
    // $ANTLR end "entryRuleTIPO"


    // $ANTLR start "ruleTIPO"
    // InternalGo.g:1136:1: ruleTIPO returns [EObject current=null] : ( ( (lv_variavel_0_0= ruleVar ) ) | ( (lv_constante_1_0= ruleConst ) ) ) ;
    public final EObject ruleTIPO() throws RecognitionException {
        EObject current = null;

        EObject lv_variavel_0_0 = null;

        EObject lv_constante_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1142:2: ( ( ( (lv_variavel_0_0= ruleVar ) ) | ( (lv_constante_1_0= ruleConst ) ) ) )
            // InternalGo.g:1143:2: ( ( (lv_variavel_0_0= ruleVar ) ) | ( (lv_constante_1_0= ruleConst ) ) )
            {
            // InternalGo.g:1143:2: ( ( (lv_variavel_0_0= ruleVar ) ) | ( (lv_constante_1_0= ruleConst ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            else if ( (LA18_0==24) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGo.g:1144:3: ( (lv_variavel_0_0= ruleVar ) )
                    {
                    // InternalGo.g:1144:3: ( (lv_variavel_0_0= ruleVar ) )
                    // InternalGo.g:1145:4: (lv_variavel_0_0= ruleVar )
                    {
                    // InternalGo.g:1145:4: (lv_variavel_0_0= ruleVar )
                    // InternalGo.g:1146:5: lv_variavel_0_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTIPOAccess().getVariavelVarParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variavel_0_0=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTIPORule());
                      					}
                      					set(
                      						current,
                      						"variavel",
                      						lv_variavel_0_0,
                      						"com.ufcg.compiladores.Go.Var");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1164:3: ( (lv_constante_1_0= ruleConst ) )
                    {
                    // InternalGo.g:1164:3: ( (lv_constante_1_0= ruleConst ) )
                    // InternalGo.g:1165:4: (lv_constante_1_0= ruleConst )
                    {
                    // InternalGo.g:1165:4: (lv_constante_1_0= ruleConst )
                    // InternalGo.g:1166:5: lv_constante_1_0= ruleConst
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTIPOAccess().getConstanteConstParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_constante_1_0=ruleConst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTIPORule());
                      					}
                      					set(
                      						current,
                      						"constante",
                      						lv_constante_1_0,
                      						"com.ufcg.compiladores.Go.Const");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


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
    // $ANTLR end "ruleTIPO"


    // $ANTLR start "entryRuleVar"
    // InternalGo.g:1187:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalGo.g:1187:44: (iv_ruleVar= ruleVar EOF )
            // InternalGo.g:1188:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalGo.g:1194:1: ruleVar returns [EObject current=null] : ( (lv_var_0_0= 'var' ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1200:2: ( ( (lv_var_0_0= 'var' ) ) )
            // InternalGo.g:1201:2: ( (lv_var_0_0= 'var' ) )
            {
            // InternalGo.g:1201:2: ( (lv_var_0_0= 'var' ) )
            // InternalGo.g:1202:3: (lv_var_0_0= 'var' )
            {
            // InternalGo.g:1202:3: (lv_var_0_0= 'var' )
            // InternalGo.g:1203:4: lv_var_0_0= 'var'
            {
            lv_var_0_0=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_var_0_0, grammarAccess.getVarAccess().getVarVarKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVarRule());
              				}
              				setWithLastConsumed(current, "var", lv_var_0_0, "var");
              			
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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConst"
    // InternalGo.g:1218:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // InternalGo.g:1218:46: (iv_ruleConst= ruleConst EOF )
            // InternalGo.g:1219:2: iv_ruleConst= ruleConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConst=ruleConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConst; 
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
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalGo.g:1225:1: ruleConst returns [EObject current=null] : ( (lv_const_0_0= 'const' ) ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1231:2: ( ( (lv_const_0_0= 'const' ) ) )
            // InternalGo.g:1232:2: ( (lv_const_0_0= 'const' ) )
            {
            // InternalGo.g:1232:2: ( (lv_const_0_0= 'const' ) )
            // InternalGo.g:1233:3: (lv_const_0_0= 'const' )
            {
            // InternalGo.g:1233:3: (lv_const_0_0= 'const' )
            // InternalGo.g:1234:4: lv_const_0_0= 'const'
            {
            lv_const_0_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_const_0_0, grammarAccess.getConstAccess().getConstConstKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getConstRule());
              				}
              				setWithLastConsumed(current, "const", lv_const_0_0, "const");
              			
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
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleIGUAL"
    // InternalGo.g:1249:1: entryRuleIGUAL returns [EObject current=null] : iv_ruleIGUAL= ruleIGUAL EOF ;
    public final EObject entryRuleIGUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIGUAL = null;


        try {
            // InternalGo.g:1249:46: (iv_ruleIGUAL= ruleIGUAL EOF )
            // InternalGo.g:1250:2: iv_ruleIGUAL= ruleIGUAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIGUALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIGUAL=ruleIGUAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIGUAL; 
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
    // $ANTLR end "entryRuleIGUAL"


    // $ANTLR start "ruleIGUAL"
    // InternalGo.g:1256:1: ruleIGUAL returns [EObject current=null] : ( (lv_igual_0_0= '=' ) ) ;
    public final EObject ruleIGUAL() throws RecognitionException {
        EObject current = null;

        Token lv_igual_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1262:2: ( ( (lv_igual_0_0= '=' ) ) )
            // InternalGo.g:1263:2: ( (lv_igual_0_0= '=' ) )
            {
            // InternalGo.g:1263:2: ( (lv_igual_0_0= '=' ) )
            // InternalGo.g:1264:3: (lv_igual_0_0= '=' )
            {
            // InternalGo.g:1264:3: (lv_igual_0_0= '=' )
            // InternalGo.g:1265:4: lv_igual_0_0= '='
            {
            lv_igual_0_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_igual_0_0, grammarAccess.getIGUALAccess().getIgualEqualsSignKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIGUALRule());
              				}
              				setWithLastConsumed(current, "igual", lv_igual_0_0, "=");
              			
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
    // $ANTLR end "ruleIGUAL"


    // $ANTLR start "entryRulePONTOSIGUAL"
    // InternalGo.g:1280:1: entryRulePONTOSIGUAL returns [EObject current=null] : iv_rulePONTOSIGUAL= rulePONTOSIGUAL EOF ;
    public final EObject entryRulePONTOSIGUAL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePONTOSIGUAL = null;


        try {
            // InternalGo.g:1280:52: (iv_rulePONTOSIGUAL= rulePONTOSIGUAL EOF )
            // InternalGo.g:1281:2: iv_rulePONTOSIGUAL= rulePONTOSIGUAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPONTOSIGUALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePONTOSIGUAL=rulePONTOSIGUAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePONTOSIGUAL; 
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
    // $ANTLR end "entryRulePONTOSIGUAL"


    // $ANTLR start "rulePONTOSIGUAL"
    // InternalGo.g:1287:1: rulePONTOSIGUAL returns [EObject current=null] : ( (lv_op_0_0= ':=' ) ) ;
    public final EObject rulePONTOSIGUAL() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:1293:2: ( ( (lv_op_0_0= ':=' ) ) )
            // InternalGo.g:1294:2: ( (lv_op_0_0= ':=' ) )
            {
            // InternalGo.g:1294:2: ( (lv_op_0_0= ':=' ) )
            // InternalGo.g:1295:3: (lv_op_0_0= ':=' )
            {
            // InternalGo.g:1295:3: (lv_op_0_0= ':=' )
            // InternalGo.g:1296:4: lv_op_0_0= ':='
            {
            lv_op_0_0=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_op_0_0, grammarAccess.getPONTOSIGUALAccess().getOpColonEqualsSignKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPONTOSIGUALRule());
              				}
              				setWithLastConsumed(current, "op", lv_op_0_0, ":=");
              			
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
    // $ANTLR end "rulePONTOSIGUAL"


    // $ANTLR start "entryRuleEXPRESSAOLINHA"
    // InternalGo.g:1311:1: entryRuleEXPRESSAOLINHA returns [EObject current=null] : iv_ruleEXPRESSAOLINHA= ruleEXPRESSAOLINHA EOF ;
    public final EObject entryRuleEXPRESSAOLINHA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSAOLINHA = null;


        try {
            // InternalGo.g:1311:55: (iv_ruleEXPRESSAOLINHA= ruleEXPRESSAOLINHA EOF )
            // InternalGo.g:1312:2: iv_ruleEXPRESSAOLINHA= ruleEXPRESSAOLINHA EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRESSAOLINHARule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEXPRESSAOLINHA=ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRESSAOLINHA; 
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
    // $ANTLR end "entryRuleEXPRESSAOLINHA"


    // $ANTLR start "ruleEXPRESSAOLINHA"
    // InternalGo.g:1318:1: ruleEXPRESSAOLINHA returns [EObject current=null] : ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) ) ;
    public final EObject ruleEXPRESSAOLINHA() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;

        EObject lv_explinha_1_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1324:2: ( ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) ) )
            // InternalGo.g:1325:2: ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) )
            {
            // InternalGo.g:1325:2: ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalGo.g:1326:3: ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) )
                    {
                    // InternalGo.g:1326:3: ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) )
                    // InternalGo.g:1327:4: ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) )
                    {
                    // InternalGo.g:1327:4: ( (lv_exp_0_0= ruleEXPRESSAO ) )
                    // InternalGo.g:1328:5: (lv_exp_0_0= ruleEXPRESSAO )
                    {
                    // InternalGo.g:1328:5: (lv_exp_0_0= ruleEXPRESSAO )
                    // InternalGo.g:1329:6: lv_exp_0_0= ruleEXPRESSAO
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_exp_0_0=ruleEXPRESSAO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEXPRESSAOLINHARule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_0_0,
                      							"com.ufcg.compiladores.Go.EXPRESSAO");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:1346:4: ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) )
                    // InternalGo.g:1347:5: (lv_explinha_1_0= ruleEXPRESSAOLINHA )
                    {
                    // InternalGo.g:1347:5: (lv_explinha_1_0= ruleEXPRESSAOLINHA )
                    // InternalGo.g:1348:6: lv_explinha_1_0= ruleEXPRESSAOLINHA
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExplinhaEXPRESSAOLINHAParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_explinha_1_0=ruleEXPRESSAOLINHA();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEXPRESSAOLINHARule());
                      						}
                      						set(
                      							current,
                      							"explinha",
                      							lv_explinha_1_0,
                      							"com.ufcg.compiladores.Go.EXPRESSAOLINHA");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1367:3: ( (lv_exp_2_0= ruleEXPRESSAO ) )
                    {
                    // InternalGo.g:1367:3: ( (lv_exp_2_0= ruleEXPRESSAO ) )
                    // InternalGo.g:1368:4: (lv_exp_2_0= ruleEXPRESSAO )
                    {
                    // InternalGo.g:1368:4: (lv_exp_2_0= ruleEXPRESSAO )
                    // InternalGo.g:1369:5: lv_exp_2_0= ruleEXPRESSAO
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_2_0=ruleEXPRESSAO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAOLINHARule());
                      					}
                      					set(
                      						current,
                      						"exp",
                      						lv_exp_2_0,
                      						"com.ufcg.compiladores.Go.EXPRESSAO");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


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
    // $ANTLR end "ruleEXPRESSAOLINHA"


    // $ANTLR start "entryRuleEXPRESSAO"
    // InternalGo.g:1390:1: entryRuleEXPRESSAO returns [EObject current=null] : iv_ruleEXPRESSAO= ruleEXPRESSAO EOF ;
    public final EObject entryRuleEXPRESSAO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSAO = null;


        try {
            // InternalGo.g:1390:50: (iv_ruleEXPRESSAO= ruleEXPRESSAO EOF )
            // InternalGo.g:1391:2: iv_ruleEXPRESSAO= ruleEXPRESSAO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRESSAORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEXPRESSAO=ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRESSAO; 
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
    // $ANTLR end "entryRuleEXPRESSAO"


    // $ANTLR start "ruleEXPRESSAO"
    // InternalGo.g:1397:1: ruleEXPRESSAO returns [EObject current=null] : ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_binary_exp_2_0= ruleBINARY_EXP ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_assignment_4_0= ruleAssignment ) ) | ( (lv_for_5_0= ruleForDecl ) ) | ( (lv_arrayValue_6_0= ruleArrayValue ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_cham_8_0= ruleChamada ) ) | ( (lv_if_9_0= ruleIfStmt ) ) ) ;
    public final EObject ruleEXPRESSAO() throws RecognitionException {
        EObject current = null;

        EObject lv_declFunction_1_0 = null;

        EObject lv_binary_exp_2_0 = null;

        EObject lv_basic_3_0 = null;

        EObject lv_assignment_4_0 = null;

        EObject lv_for_5_0 = null;

        EObject lv_arrayValue_6_0 = null;

        EObject lv_variaveis_7_0 = null;

        EObject lv_cham_8_0 = null;

        EObject lv_if_9_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1403:2: ( ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_binary_exp_2_0= ruleBINARY_EXP ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_assignment_4_0= ruleAssignment ) ) | ( (lv_for_5_0= ruleForDecl ) ) | ( (lv_arrayValue_6_0= ruleArrayValue ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_cham_8_0= ruleChamada ) ) | ( (lv_if_9_0= ruleIfStmt ) ) ) )
            // InternalGo.g:1404:2: ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_binary_exp_2_0= ruleBINARY_EXP ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_assignment_4_0= ruleAssignment ) ) | ( (lv_for_5_0= ruleForDecl ) ) | ( (lv_arrayValue_6_0= ruleArrayValue ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_cham_8_0= ruleChamada ) ) | ( (lv_if_9_0= ruleIfStmt ) ) )
            {
            // InternalGo.g:1404:2: ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_binary_exp_2_0= ruleBINARY_EXP ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_assignment_4_0= ruleAssignment ) ) | ( (lv_for_5_0= ruleForDecl ) ) | ( (lv_arrayValue_6_0= ruleArrayValue ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_cham_8_0= ruleChamada ) ) | ( (lv_if_9_0= ruleIfStmt ) ) )
            int alt20=9;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalGo.g:1405:3: ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) )
                    {
                    // InternalGo.g:1405:3: ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) )
                    // InternalGo.g:1406:4: () ( (lv_declFunction_1_0= ruleFunctionType ) )
                    {
                    // InternalGo.g:1406:4: ()
                    // InternalGo.g:1407:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEXPRESSAOAccess().getEXPRESSAOAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:1416:4: ( (lv_declFunction_1_0= ruleFunctionType ) )
                    // InternalGo.g:1417:5: (lv_declFunction_1_0= ruleFunctionType )
                    {
                    // InternalGo.g:1417:5: (lv_declFunction_1_0= ruleFunctionType )
                    // InternalGo.g:1418:6: lv_declFunction_1_0= ruleFunctionType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_declFunction_1_0=ruleFunctionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      						}
                      						set(
                      							current,
                      							"declFunction",
                      							lv_declFunction_1_0,
                      							"com.ufcg.compiladores.Go.FunctionType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1437:3: ( (lv_binary_exp_2_0= ruleBINARY_EXP ) )
                    {
                    // InternalGo.g:1437:3: ( (lv_binary_exp_2_0= ruleBINARY_EXP ) )
                    // InternalGo.g:1438:4: (lv_binary_exp_2_0= ruleBINARY_EXP )
                    {
                    // InternalGo.g:1438:4: (lv_binary_exp_2_0= ruleBINARY_EXP )
                    // InternalGo.g:1439:5: lv_binary_exp_2_0= ruleBINARY_EXP
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBinary_expBINARY_EXPParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_binary_exp_2_0=ruleBINARY_EXP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"binary_exp",
                      						lv_binary_exp_2_0,
                      						"com.ufcg.compiladores.Go.BINARY_EXP");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1457:3: ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:1457:3: ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1458:4: (lv_basic_3_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1458:4: (lv_basic_3_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1459:5: lv_basic_3_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_basic_3_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"basic",
                      						lv_basic_3_0,
                      						"com.ufcg.compiladores.Go.LITERAIS_BASICOS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1477:3: ( (lv_assignment_4_0= ruleAssignment ) )
                    {
                    // InternalGo.g:1477:3: ( (lv_assignment_4_0= ruleAssignment ) )
                    // InternalGo.g:1478:4: (lv_assignment_4_0= ruleAssignment )
                    {
                    // InternalGo.g:1478:4: (lv_assignment_4_0= ruleAssignment )
                    // InternalGo.g:1479:5: lv_assignment_4_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getAssignmentAssignmentParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_assignment_4_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"assignment",
                      						lv_assignment_4_0,
                      						"com.ufcg.compiladores.Go.Assignment");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1497:3: ( (lv_for_5_0= ruleForDecl ) )
                    {
                    // InternalGo.g:1497:3: ( (lv_for_5_0= ruleForDecl ) )
                    // InternalGo.g:1498:4: (lv_for_5_0= ruleForDecl )
                    {
                    // InternalGo.g:1498:4: (lv_for_5_0= ruleForDecl )
                    // InternalGo.g:1499:5: lv_for_5_0= ruleForDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getForForDeclParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_for_5_0=ruleForDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"for",
                      						lv_for_5_0,
                      						"com.ufcg.compiladores.Go.ForDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:1517:3: ( (lv_arrayValue_6_0= ruleArrayValue ) )
                    {
                    // InternalGo.g:1517:3: ( (lv_arrayValue_6_0= ruleArrayValue ) )
                    // InternalGo.g:1518:4: (lv_arrayValue_6_0= ruleArrayValue )
                    {
                    // InternalGo.g:1518:4: (lv_arrayValue_6_0= ruleArrayValue )
                    // InternalGo.g:1519:5: lv_arrayValue_6_0= ruleArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getArrayValueArrayValueParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_arrayValue_6_0=ruleArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"arrayValue",
                      						lv_arrayValue_6_0,
                      						"com.ufcg.compiladores.Go.ArrayValue");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:1537:3: ( (lv_variaveis_7_0= ruleVarDecl ) )
                    {
                    // InternalGo.g:1537:3: ( (lv_variaveis_7_0= ruleVarDecl ) )
                    // InternalGo.g:1538:4: (lv_variaveis_7_0= ruleVarDecl )
                    {
                    // InternalGo.g:1538:4: (lv_variaveis_7_0= ruleVarDecl )
                    // InternalGo.g:1539:5: lv_variaveis_7_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variaveis_7_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"variaveis",
                      						lv_variaveis_7_0,
                      						"com.ufcg.compiladores.Go.VarDecl");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:1557:3: ( (lv_cham_8_0= ruleChamada ) )
                    {
                    // InternalGo.g:1557:3: ( (lv_cham_8_0= ruleChamada ) )
                    // InternalGo.g:1558:4: (lv_cham_8_0= ruleChamada )
                    {
                    // InternalGo.g:1558:4: (lv_cham_8_0= ruleChamada )
                    // InternalGo.g:1559:5: lv_cham_8_0= ruleChamada
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getChamChamadaParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cham_8_0=ruleChamada();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"cham",
                      						lv_cham_8_0,
                      						"com.ufcg.compiladores.Go.Chamada");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:1577:3: ( (lv_if_9_0= ruleIfStmt ) )
                    {
                    // InternalGo.g:1577:3: ( (lv_if_9_0= ruleIfStmt ) )
                    // InternalGo.g:1578:4: (lv_if_9_0= ruleIfStmt )
                    {
                    // InternalGo.g:1578:4: (lv_if_9_0= ruleIfStmt )
                    // InternalGo.g:1579:5: lv_if_9_0= ruleIfStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getIfIfStmtParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_if_9_0=ruleIfStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
                      					}
                      					set(
                      						current,
                      						"if",
                      						lv_if_9_0,
                      						"com.ufcg.compiladores.Go.IfStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


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
    // $ANTLR end "ruleEXPRESSAO"


    // $ANTLR start "entryRuleReturnStmt"
    // InternalGo.g:1600:1: entryRuleReturnStmt returns [EObject current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final EObject entryRuleReturnStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStmt = null;


        try {
            // InternalGo.g:1600:51: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // InternalGo.g:1601:2: iv_ruleReturnStmt= ruleReturnStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStmt=ruleReturnStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStmt; 
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
    // $ANTLR end "entryRuleReturnStmt"


    // $ANTLR start "ruleReturnStmt"
    // InternalGo.g:1607:1: ruleReturnStmt returns [EObject current=null] : ( () otherlv_1= 'return' ( ( (lv_basic_2_0= ruleLITERAIS_BASICOS ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) | ( (lv_idVar_4_0= ruleVarCall ) ) )? ) ;
    public final EObject ruleReturnStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_basic_2_0 = null;

        EObject lv_func_3_0 = null;

        EObject lv_idVar_4_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1613:2: ( ( () otherlv_1= 'return' ( ( (lv_basic_2_0= ruleLITERAIS_BASICOS ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) | ( (lv_idVar_4_0= ruleVarCall ) ) )? ) )
            // InternalGo.g:1614:2: ( () otherlv_1= 'return' ( ( (lv_basic_2_0= ruleLITERAIS_BASICOS ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) | ( (lv_idVar_4_0= ruleVarCall ) ) )? )
            {
            // InternalGo.g:1614:2: ( () otherlv_1= 'return' ( ( (lv_basic_2_0= ruleLITERAIS_BASICOS ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) | ( (lv_idVar_4_0= ruleVarCall ) ) )? )
            // InternalGo.g:1615:3: () otherlv_1= 'return' ( ( (lv_basic_2_0= ruleLITERAIS_BASICOS ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) | ( (lv_idVar_4_0= ruleVarCall ) ) )?
            {
            // InternalGo.g:1615:3: ()
            // InternalGo.g:1616:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReturnStmtAccess().getReturnStmtAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnStmtAccess().getReturnKeyword_1());
              		
            }
            // InternalGo.g:1629:3: ( ( (lv_basic_2_0= ruleLITERAIS_BASICOS ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) | ( (lv_idVar_4_0= ruleVarCall ) ) )?
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_NUMERO && LA21_0<=RULE_STRING_DECL)||(LA21_0>=14 && LA21_0<=15)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==29) ) {
                    alt21=2;
                }
                else if ( (LA21_2==EOF||LA21_2==18) ) {
                    alt21=3;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:1630:4: ( (lv_basic_2_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:1630:4: ( (lv_basic_2_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1631:5: (lv_basic_2_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1631:5: (lv_basic_2_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1632:6: lv_basic_2_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnStmtAccess().getBasicLITERAIS_BASICOSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_basic_2_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReturnStmtRule());
                      						}
                      						set(
                      							current,
                      							"basic",
                      							lv_basic_2_0,
                      							"com.ufcg.compiladores.Go.LITERAIS_BASICOS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1650:4: ( (lv_func_3_0= ruleFunctionCall ) )
                    {
                    // InternalGo.g:1650:4: ( (lv_func_3_0= ruleFunctionCall ) )
                    // InternalGo.g:1651:5: (lv_func_3_0= ruleFunctionCall )
                    {
                    // InternalGo.g:1651:5: (lv_func_3_0= ruleFunctionCall )
                    // InternalGo.g:1652:6: lv_func_3_0= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnStmtAccess().getFuncFunctionCallParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_func_3_0=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReturnStmtRule());
                      						}
                      						set(
                      							current,
                      							"func",
                      							lv_func_3_0,
                      							"com.ufcg.compiladores.Go.FunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1670:4: ( (lv_idVar_4_0= ruleVarCall ) )
                    {
                    // InternalGo.g:1670:4: ( (lv_idVar_4_0= ruleVarCall ) )
                    // InternalGo.g:1671:5: (lv_idVar_4_0= ruleVarCall )
                    {
                    // InternalGo.g:1671:5: (lv_idVar_4_0= ruleVarCall )
                    // InternalGo.g:1672:6: lv_idVar_4_0= ruleVarCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReturnStmtAccess().getIdVarVarCallParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_idVar_4_0=ruleVarCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReturnStmtRule());
                      						}
                      						set(
                      							current,
                      							"idVar",
                      							lv_idVar_4_0,
                      							"com.ufcg.compiladores.Go.VarCall");
                      						afterParserOrEnumRuleCall();
                      					
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
    // $ANTLR end "ruleReturnStmt"


    // $ANTLR start "entryRuleArrayValue"
    // InternalGo.g:1694:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalGo.g:1694:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalGo.g:1695:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayValue; 
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
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalGo.g:1701:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_lit_1_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1707:2: ( (otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}' ) )
            // InternalGo.g:1708:2: (otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}' )
            {
            // InternalGo.g:1708:2: (otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}' )
            // InternalGo.g:1709:3: otherlv_0= '{' ( (lv_lit_1_0= ruleLiteraisList ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGo.g:1713:3: ( (lv_lit_1_0= ruleLiteraisList ) )
            // InternalGo.g:1714:4: (lv_lit_1_0= ruleLiteraisList )
            {
            // InternalGo.g:1714:4: (lv_lit_1_0= ruleLiteraisList )
            // InternalGo.g:1715:5: lv_lit_1_0= ruleLiteraisList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayValueAccess().getLitLiteraisListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_lit_1_0=ruleLiteraisList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayValueRule());
              					}
              					set(
              						current,
              						"lit",
              						lv_lit_1_0,
              						"com.ufcg.compiladores.Go.LiteraisList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getRightCurlyBracketKeyword_2());
              		
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
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleLiteraisList"
    // InternalGo.g:1740:1: entryRuleLiteraisList returns [EObject current=null] : iv_ruleLiteraisList= ruleLiteraisList EOF ;
    public final EObject entryRuleLiteraisList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteraisList = null;


        try {
            // InternalGo.g:1740:53: (iv_ruleLiteraisList= ruleLiteraisList EOF )
            // InternalGo.g:1741:2: iv_ruleLiteraisList= ruleLiteraisList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteraisListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteraisList=ruleLiteraisList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteraisList; 
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
    // $ANTLR end "entryRuleLiteraisList"


    // $ANTLR start "ruleLiteraisList"
    // InternalGo.g:1747:1: ruleLiteraisList returns [EObject current=null] : ( ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) ) | ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_lit_3_0= ruleLiteraisList ) ) ) ) ;
    public final EObject ruleLiteraisList() throws RecognitionException {
        EObject current = null;

        Token lv_vir_2_0=null;
        EObject lv_lit_0_0 = null;

        EObject lv_lit_1_0 = null;

        EObject lv_lit_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1753:2: ( ( ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) ) | ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_lit_3_0= ruleLiteraisList ) ) ) ) )
            // InternalGo.g:1754:2: ( ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) ) | ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_lit_3_0= ruleLiteraisList ) ) ) )
            {
            // InternalGo.g:1754:2: ( ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) ) | ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_lit_3_0= ruleLiteraisList ) ) ) )
            int alt22=2;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||LA22_1==18) ) {
                    alt22=1;
                }
                else if ( (LA22_1==RULE_VIRGULA) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING_DECL:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==RULE_VIRGULA) ) {
                    alt22=2;
                }
                else if ( (LA22_2==EOF||LA22_2==18) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA22_3 = input.LA(2);

                if ( (LA22_3==RULE_VIRGULA) ) {
                    alt22=2;
                }
                else if ( (LA22_3==EOF||LA22_3==18) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA22_4 = input.LA(2);

                if ( (LA22_4==EOF||LA22_4==18) ) {
                    alt22=1;
                }
                else if ( (LA22_4==RULE_VIRGULA) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 4, input);

                    throw nvae;
                }
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
                    // InternalGo.g:1755:3: ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:1755:3: ( (lv_lit_0_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1756:4: (lv_lit_0_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1756:4: (lv_lit_0_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1757:5: lv_lit_0_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteraisListAccess().getLitLITERAIS_BASICOSParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_lit_0_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteraisListRule());
                      					}
                      					add(
                      						current,
                      						"lit",
                      						lv_lit_0_0,
                      						"com.ufcg.compiladores.Go.LITERAIS_BASICOS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1775:3: ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_lit_3_0= ruleLiteraisList ) ) )
                    {
                    // InternalGo.g:1775:3: ( ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_lit_3_0= ruleLiteraisList ) ) )
                    // InternalGo.g:1776:4: ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) ) ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_lit_3_0= ruleLiteraisList ) )
                    {
                    // InternalGo.g:1776:4: ( (lv_lit_1_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1777:5: (lv_lit_1_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1777:5: (lv_lit_1_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1778:6: lv_lit_1_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteraisListAccess().getLitLITERAIS_BASICOSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_lit_1_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteraisListRule());
                      						}
                      						add(
                      							current,
                      							"lit",
                      							lv_lit_1_0,
                      							"com.ufcg.compiladores.Go.LITERAIS_BASICOS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:1795:4: ( (lv_vir_2_0= RULE_VIRGULA ) )
                    // InternalGo.g:1796:5: (lv_vir_2_0= RULE_VIRGULA )
                    {
                    // InternalGo.g:1796:5: (lv_vir_2_0= RULE_VIRGULA )
                    // InternalGo.g:1797:6: lv_vir_2_0= RULE_VIRGULA
                    {
                    lv_vir_2_0=(Token)match(input,RULE_VIRGULA,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_vir_2_0, grammarAccess.getLiteraisListAccess().getVirVIRGULATerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLiteraisListRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"vir",
                      							lv_vir_2_0,
                      							"com.ufcg.compiladores.Go.VIRGULA");
                      					
                    }

                    }


                    }

                    // InternalGo.g:1813:4: ( (lv_lit_3_0= ruleLiteraisList ) )
                    // InternalGo.g:1814:5: (lv_lit_3_0= ruleLiteraisList )
                    {
                    // InternalGo.g:1814:5: (lv_lit_3_0= ruleLiteraisList )
                    // InternalGo.g:1815:6: lv_lit_3_0= ruleLiteraisList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteraisListAccess().getLitLiteraisListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_lit_3_0=ruleLiteraisList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteraisListRule());
                      						}
                      						add(
                      							current,
                      							"lit",
                      							lv_lit_3_0,
                      							"com.ufcg.compiladores.Go.LiteraisList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


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
    // $ANTLR end "ruleLiteraisList"


    // $ANTLR start "entryRuleLITERAIS_BASICOS"
    // InternalGo.g:1837:1: entryRuleLITERAIS_BASICOS returns [EObject current=null] : iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF ;
    public final EObject entryRuleLITERAIS_BASICOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLITERAIS_BASICOS = null;


        try {
            // InternalGo.g:1837:57: (iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF )
            // InternalGo.g:1838:2: iv_ruleLITERAIS_BASICOS= ruleLITERAIS_BASICOS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLITERAIS_BASICOSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLITERAIS_BASICOS=ruleLITERAIS_BASICOS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLITERAIS_BASICOS; 
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
    // $ANTLR end "entryRuleLITERAIS_BASICOS"


    // $ANTLR start "ruleLITERAIS_BASICOS"
    // InternalGo.g:1844:1: ruleLITERAIS_BASICOS returns [EObject current=null] : ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) | ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) ) ) ;
    public final EObject ruleLITERAIS_BASICOS() throws RecognitionException {
        EObject current = null;

        Token lv_numero_0_0=null;
        Token lv_string_1_0=null;
        EObject lv_booleano_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1850:2: ( ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) | ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) ) ) )
            // InternalGo.g:1851:2: ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) | ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) ) )
            {
            // InternalGo.g:1851:2: ( ( (lv_numero_0_0= RULE_NUMERO ) ) | ( (lv_string_1_0= RULE_STRING_DECL ) ) | ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
                {
                alt23=1;
                }
                break;
            case RULE_STRING_DECL:
                {
                alt23=2;
                }
                break;
            case 14:
            case 15:
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
                    // InternalGo.g:1852:3: ( (lv_numero_0_0= RULE_NUMERO ) )
                    {
                    // InternalGo.g:1852:3: ( (lv_numero_0_0= RULE_NUMERO ) )
                    // InternalGo.g:1853:4: (lv_numero_0_0= RULE_NUMERO )
                    {
                    // InternalGo.g:1853:4: (lv_numero_0_0= RULE_NUMERO )
                    // InternalGo.g:1854:5: lv_numero_0_0= RULE_NUMERO
                    {
                    lv_numero_0_0=(Token)match(input,RULE_NUMERO,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_numero_0_0, grammarAccess.getLITERAIS_BASICOSAccess().getNumeroNUMEROTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLITERAIS_BASICOSRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"numero",
                      						lv_numero_0_0,
                      						"com.ufcg.compiladores.Go.NUMERO");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1871:3: ( (lv_string_1_0= RULE_STRING_DECL ) )
                    {
                    // InternalGo.g:1871:3: ( (lv_string_1_0= RULE_STRING_DECL ) )
                    // InternalGo.g:1872:4: (lv_string_1_0= RULE_STRING_DECL )
                    {
                    // InternalGo.g:1872:4: (lv_string_1_0= RULE_STRING_DECL )
                    // InternalGo.g:1873:5: lv_string_1_0= RULE_STRING_DECL
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING_DECL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_string_1_0, grammarAccess.getLITERAIS_BASICOSAccess().getStringSTRING_DECLTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLITERAIS_BASICOSRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"string",
                      						lv_string_1_0,
                      						"com.ufcg.compiladores.Go.STRING_DECL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1890:3: ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) )
                    {
                    // InternalGo.g:1890:3: ( (lv_booleano_2_0= ruleBOOLEAN_VALUE ) )
                    // InternalGo.g:1891:4: (lv_booleano_2_0= ruleBOOLEAN_VALUE )
                    {
                    // InternalGo.g:1891:4: (lv_booleano_2_0= ruleBOOLEAN_VALUE )
                    // InternalGo.g:1892:5: lv_booleano_2_0= ruleBOOLEAN_VALUE
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLITERAIS_BASICOSAccess().getBooleanoBOOLEAN_VALUEParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_booleano_2_0=ruleBOOLEAN_VALUE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLITERAIS_BASICOSRule());
                      					}
                      					set(
                      						current,
                      						"booleano",
                      						lv_booleano_2_0,
                      						"com.ufcg.compiladores.Go.BOOLEAN_VALUE");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


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
    // $ANTLR end "ruleLITERAIS_BASICOS"


    // $ANTLR start "entryRuleBINARY_EXP"
    // InternalGo.g:1913:1: entryRuleBINARY_EXP returns [EObject current=null] : iv_ruleBINARY_EXP= ruleBINARY_EXP EOF ;
    public final EObject entryRuleBINARY_EXP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBINARY_EXP = null;


        try {
            // InternalGo.g:1913:51: (iv_ruleBINARY_EXP= ruleBINARY_EXP EOF )
            // InternalGo.g:1914:2: iv_ruleBINARY_EXP= ruleBINARY_EXP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBINARY_EXPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBINARY_EXP=ruleBINARY_EXP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBINARY_EXP; 
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
    // $ANTLR end "entryRuleBINARY_EXP"


    // $ANTLR start "ruleBINARY_EXP"
    // InternalGo.g:1920:1: ruleBINARY_EXP returns [EObject current=null] : ( () ( ( (lv_basic_1_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_2_0= ruleVarCall ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) ) ( ( (lv_bool_4_0= ruleBOOL_OP ) ) | ( (lv_arit_5_0= ruleARIT_OP ) ) ) ( ( (lv_basic_6_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_7_0= ruleVarCall ) ) | ( (lv_func_8_0= ruleFunctionCall ) ) ) ) ;
    public final EObject ruleBINARY_EXP() throws RecognitionException {
        EObject current = null;

        EObject lv_basic_1_0 = null;

        EObject lv_varCal_2_0 = null;

        EObject lv_func_3_0 = null;

        EObject lv_bool_4_0 = null;

        AntlrDatatypeRuleToken lv_arit_5_0 = null;

        EObject lv_basic_6_0 = null;

        EObject lv_varCal_7_0 = null;

        EObject lv_func_8_0 = null;



        	enterRule();

        try {
            // InternalGo.g:1926:2: ( ( () ( ( (lv_basic_1_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_2_0= ruleVarCall ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) ) ( ( (lv_bool_4_0= ruleBOOL_OP ) ) | ( (lv_arit_5_0= ruleARIT_OP ) ) ) ( ( (lv_basic_6_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_7_0= ruleVarCall ) ) | ( (lv_func_8_0= ruleFunctionCall ) ) ) ) )
            // InternalGo.g:1927:2: ( () ( ( (lv_basic_1_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_2_0= ruleVarCall ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) ) ( ( (lv_bool_4_0= ruleBOOL_OP ) ) | ( (lv_arit_5_0= ruleARIT_OP ) ) ) ( ( (lv_basic_6_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_7_0= ruleVarCall ) ) | ( (lv_func_8_0= ruleFunctionCall ) ) ) )
            {
            // InternalGo.g:1927:2: ( () ( ( (lv_basic_1_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_2_0= ruleVarCall ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) ) ( ( (lv_bool_4_0= ruleBOOL_OP ) ) | ( (lv_arit_5_0= ruleARIT_OP ) ) ) ( ( (lv_basic_6_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_7_0= ruleVarCall ) ) | ( (lv_func_8_0= ruleFunctionCall ) ) ) )
            // InternalGo.g:1928:3: () ( ( (lv_basic_1_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_2_0= ruleVarCall ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) ) ( ( (lv_bool_4_0= ruleBOOL_OP ) ) | ( (lv_arit_5_0= ruleARIT_OP ) ) ) ( ( (lv_basic_6_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_7_0= ruleVarCall ) ) | ( (lv_func_8_0= ruleFunctionCall ) ) )
            {
            // InternalGo.g:1928:3: ()
            // InternalGo.g:1929:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBINARY_EXPAccess().getBINARY_EXPAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:1938:3: ( ( (lv_basic_1_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_2_0= ruleVarCall ) ) | ( (lv_func_3_0= ruleFunctionCall ) ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_NUMERO && LA24_0<=RULE_STRING_DECL)||(LA24_0>=14 && LA24_0<=15)) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                int LA24_2 = input.LA(2);

                if ( ((LA24_2>=37 && LA24_2<=43)) ) {
                    alt24=2;
                }
                else if ( (LA24_2==29) ) {
                    alt24=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:1939:4: ( (lv_basic_1_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:1939:4: ( (lv_basic_1_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:1940:5: (lv_basic_1_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:1940:5: (lv_basic_1_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:1941:6: lv_basic_1_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getBasicLITERAIS_BASICOSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_basic_1_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						add(
                      							current,
                      							"basic",
                      							lv_basic_1_0,
                      							"com.ufcg.compiladores.Go.LITERAIS_BASICOS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1959:4: ( (lv_varCal_2_0= ruleVarCall ) )
                    {
                    // InternalGo.g:1959:4: ( (lv_varCal_2_0= ruleVarCall ) )
                    // InternalGo.g:1960:5: (lv_varCal_2_0= ruleVarCall )
                    {
                    // InternalGo.g:1960:5: (lv_varCal_2_0= ruleVarCall )
                    // InternalGo.g:1961:6: lv_varCal_2_0= ruleVarCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getVarCalVarCallParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_varCal_2_0=ruleVarCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						add(
                      							current,
                      							"varCal",
                      							lv_varCal_2_0,
                      							"com.ufcg.compiladores.Go.VarCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1979:4: ( (lv_func_3_0= ruleFunctionCall ) )
                    {
                    // InternalGo.g:1979:4: ( (lv_func_3_0= ruleFunctionCall ) )
                    // InternalGo.g:1980:5: (lv_func_3_0= ruleFunctionCall )
                    {
                    // InternalGo.g:1980:5: (lv_func_3_0= ruleFunctionCall )
                    // InternalGo.g:1981:6: lv_func_3_0= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getFuncFunctionCallParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_func_3_0=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						add(
                      							current,
                      							"func",
                      							lv_func_3_0,
                      							"com.ufcg.compiladores.Go.FunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalGo.g:1999:3: ( ( (lv_bool_4_0= ruleBOOL_OP ) ) | ( (lv_arit_5_0= ruleARIT_OP ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=37 && LA25_0<=38)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=39 && LA25_0<=43)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:2000:4: ( (lv_bool_4_0= ruleBOOL_OP ) )
                    {
                    // InternalGo.g:2000:4: ( (lv_bool_4_0= ruleBOOL_OP ) )
                    // InternalGo.g:2001:5: (lv_bool_4_0= ruleBOOL_OP )
                    {
                    // InternalGo.g:2001:5: (lv_bool_4_0= ruleBOOL_OP )
                    // InternalGo.g:2002:6: lv_bool_4_0= ruleBOOL_OP
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getBoolBOOL_OPParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_bool_4_0=ruleBOOL_OP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						set(
                      							current,
                      							"bool",
                      							lv_bool_4_0,
                      							"com.ufcg.compiladores.Go.BOOL_OP");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2020:4: ( (lv_arit_5_0= ruleARIT_OP ) )
                    {
                    // InternalGo.g:2020:4: ( (lv_arit_5_0= ruleARIT_OP ) )
                    // InternalGo.g:2021:5: (lv_arit_5_0= ruleARIT_OP )
                    {
                    // InternalGo.g:2021:5: (lv_arit_5_0= ruleARIT_OP )
                    // InternalGo.g:2022:6: lv_arit_5_0= ruleARIT_OP
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getAritARIT_OPParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_arit_5_0=ruleARIT_OP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						set(
                      							current,
                      							"arit",
                      							lv_arit_5_0,
                      							"com.ufcg.compiladores.Go.ARIT_OP");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalGo.g:2040:3: ( ( (lv_basic_6_0= ruleLITERAIS_BASICOS ) ) | ( (lv_varCal_7_0= ruleVarCall ) ) | ( (lv_func_8_0= ruleFunctionCall ) ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_NUMERO && LA26_0<=RULE_STRING_DECL)||(LA26_0>=14 && LA26_0<=15)) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==29) ) {
                    alt26=3;
                }
                else if ( (LA26_2==EOF||LA26_2==RULE_ID||(LA26_2>=RULE_NUMERO && LA26_2<=RULE_STRING_DECL)||(LA26_2>=14 && LA26_2<=18)||LA26_2==20||(LA26_2>=23 && LA26_2<=24)||(LA26_2>=27 && LA26_2<=28)||LA26_2==31||(LA26_2>=46 && LA26_2<=50)) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:2041:4: ( (lv_basic_6_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:2041:4: ( (lv_basic_6_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:2042:5: (lv_basic_6_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:2042:5: (lv_basic_6_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:2043:6: lv_basic_6_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getBasicLITERAIS_BASICOSParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_basic_6_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						add(
                      							current,
                      							"basic",
                      							lv_basic_6_0,
                      							"com.ufcg.compiladores.Go.LITERAIS_BASICOS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2061:4: ( (lv_varCal_7_0= ruleVarCall ) )
                    {
                    // InternalGo.g:2061:4: ( (lv_varCal_7_0= ruleVarCall ) )
                    // InternalGo.g:2062:5: (lv_varCal_7_0= ruleVarCall )
                    {
                    // InternalGo.g:2062:5: (lv_varCal_7_0= ruleVarCall )
                    // InternalGo.g:2063:6: lv_varCal_7_0= ruleVarCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getVarCalVarCallParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_varCal_7_0=ruleVarCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						add(
                      							current,
                      							"varCal",
                      							lv_varCal_7_0,
                      							"com.ufcg.compiladores.Go.VarCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:2081:4: ( (lv_func_8_0= ruleFunctionCall ) )
                    {
                    // InternalGo.g:2081:4: ( (lv_func_8_0= ruleFunctionCall ) )
                    // InternalGo.g:2082:5: (lv_func_8_0= ruleFunctionCall )
                    {
                    // InternalGo.g:2082:5: (lv_func_8_0= ruleFunctionCall )
                    // InternalGo.g:2083:6: lv_func_8_0= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBINARY_EXPAccess().getFuncFunctionCallParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_func_8_0=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBINARY_EXPRule());
                      						}
                      						add(
                      							current,
                      							"func",
                      							lv_func_8_0,
                      							"com.ufcg.compiladores.Go.FunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
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
    // $ANTLR end "ruleBINARY_EXP"


    // $ANTLR start "entryRuleFunctionType"
    // InternalGo.g:2105:1: entryRuleFunctionType returns [EObject current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final EObject entryRuleFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionType = null;


        try {
            // InternalGo.g:2105:53: (iv_ruleFunctionType= ruleFunctionType EOF )
            // InternalGo.g:2106:2: iv_ruleFunctionType= ruleFunctionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionType=ruleFunctionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionType; 
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
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // InternalGo.g:2112:1: ruleFunctionType returns [EObject current=null] : (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? ) ;
    public final EObject ruleFunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nome_1_0=null;
        EObject lv_assinatura_2_0 = null;

        EObject lv_bloco_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2118:2: ( (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? ) )
            // InternalGo.g:2119:2: (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? )
            {
            // InternalGo.g:2119:2: (otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )? )
            // InternalGo.g:2120:3: otherlv_0= 'func' ( (lv_nome_1_0= RULE_ID ) ) ( (lv_assinatura_2_0= ruleSignature ) ) ( (lv_bloco_3_0= ruleBLOCK ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionTypeAccess().getFuncKeyword_0());
              		
            }
            // InternalGo.g:2124:3: ( (lv_nome_1_0= RULE_ID ) )
            // InternalGo.g:2125:4: (lv_nome_1_0= RULE_ID )
            {
            // InternalGo.g:2125:4: (lv_nome_1_0= RULE_ID )
            // InternalGo.g:2126:5: lv_nome_1_0= RULE_ID
            {
            lv_nome_1_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_nome_1_0, grammarAccess.getFunctionTypeAccess().getNomeIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalGo.g:2142:3: ( (lv_assinatura_2_0= ruleSignature ) )
            // InternalGo.g:2143:4: (lv_assinatura_2_0= ruleSignature )
            {
            // InternalGo.g:2143:4: (lv_assinatura_2_0= ruleSignature )
            // InternalGo.g:2144:5: lv_assinatura_2_0= ruleSignature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionTypeAccess().getAssinaturaSignatureParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_assinatura_2_0=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
              					}
              					set(
              						current,
              						"assinatura",
              						lv_assinatura_2_0,
              						"com.ufcg.compiladores.Go.Signature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:2161:3: ( (lv_bloco_3_0= ruleBLOCK ) )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalGo.g:2162:4: (lv_bloco_3_0= ruleBLOCK )
                    {
                    // InternalGo.g:2162:4: (lv_bloco_3_0= ruleBLOCK )
                    // InternalGo.g:2163:5: lv_bloco_3_0= ruleBLOCK
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionTypeAccess().getBlocoBLOCKParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_bloco_3_0=ruleBLOCK();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
                      					}
                      					set(
                      						current,
                      						"bloco",
                      						lv_bloco_3_0,
                      						"com.ufcg.compiladores.Go.BLOCK");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleSignature"
    // InternalGo.g:2184:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalGo.g:2184:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalGo.g:2185:2: iv_ruleSignature= ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignature; 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalGo.g:2191:1: ruleSignature returns [EObject current=null] : ( () ( (lv_params_1_0= ruleParameters ) ) ( (lv_retorno_2_0= ruleTypes ) )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        EObject lv_params_1_0 = null;

        EObject lv_retorno_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2197:2: ( ( () ( (lv_params_1_0= ruleParameters ) ) ( (lv_retorno_2_0= ruleTypes ) )? ) )
            // InternalGo.g:2198:2: ( () ( (lv_params_1_0= ruleParameters ) ) ( (lv_retorno_2_0= ruleTypes ) )? )
            {
            // InternalGo.g:2198:2: ( () ( (lv_params_1_0= ruleParameters ) ) ( (lv_retorno_2_0= ruleTypes ) )? )
            // InternalGo.g:2199:3: () ( (lv_params_1_0= ruleParameters ) ) ( (lv_retorno_2_0= ruleTypes ) )?
            {
            // InternalGo.g:2199:3: ()
            // InternalGo.g:2200:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSignatureAccess().getSignatureAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:2209:3: ( (lv_params_1_0= ruleParameters ) )
            // InternalGo.g:2210:4: (lv_params_1_0= ruleParameters )
            {
            // InternalGo.g:2210:4: (lv_params_1_0= ruleParameters )
            // InternalGo.g:2211:5: lv_params_1_0= ruleParameters
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSignatureAccess().getParamsParametersParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_params_1_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSignatureRule());
              					}
              					set(
              						current,
              						"params",
              						lv_params_1_0,
              						"com.ufcg.compiladores.Go.Parameters");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:2228:3: ( (lv_retorno_2_0= ruleTypes ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21||(LA28_0>=33 && LA28_0<=36)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGo.g:2229:4: (lv_retorno_2_0= ruleTypes )
                    {
                    // InternalGo.g:2229:4: (lv_retorno_2_0= ruleTypes )
                    // InternalGo.g:2230:5: lv_retorno_2_0= ruleTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSignatureAccess().getRetornoTypesParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_retorno_2_0=ruleTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSignatureRule());
                      					}
                      					set(
                      						current,
                      						"retorno",
                      						lv_retorno_2_0,
                      						"com.ufcg.compiladores.Go.Types");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameters"
    // InternalGo.g:2251:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalGo.g:2251:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalGo.g:2252:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters; 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalGo.g:2258:1: ruleParameters returns [EObject current=null] : ( () ruleABRE_PARENTESES ( (lv_params_2_0= rulePARAMETERS_LIST ) )? ruleFECHA_PARENTESES ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2264:2: ( ( () ruleABRE_PARENTESES ( (lv_params_2_0= rulePARAMETERS_LIST ) )? ruleFECHA_PARENTESES ) )
            // InternalGo.g:2265:2: ( () ruleABRE_PARENTESES ( (lv_params_2_0= rulePARAMETERS_LIST ) )? ruleFECHA_PARENTESES )
            {
            // InternalGo.g:2265:2: ( () ruleABRE_PARENTESES ( (lv_params_2_0= rulePARAMETERS_LIST ) )? ruleFECHA_PARENTESES )
            // InternalGo.g:2266:3: () ruleABRE_PARENTESES ( (lv_params_2_0= rulePARAMETERS_LIST ) )? ruleFECHA_PARENTESES
            {
            // InternalGo.g:2266:3: ()
            // InternalGo.g:2267:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParametersAccess().getParametersAction_0(),
              					current);
              			
            }

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParametersAccess().getABRE_PARENTESESParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_29);
            ruleABRE_PARENTESES();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalGo.g:2286:3: ( (lv_params_2_0= rulePARAMETERS_LIST ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=RULE_NUMERO && LA29_0<=RULE_STRING_DECL)||(LA29_0>=14 && LA29_0<=15)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:2287:4: (lv_params_2_0= rulePARAMETERS_LIST )
                    {
                    // InternalGo.g:2287:4: (lv_params_2_0= rulePARAMETERS_LIST )
                    // InternalGo.g:2288:5: lv_params_2_0= rulePARAMETERS_LIST
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getParametersAccess().getParamsPARAMETERS_LISTParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
                    lv_params_2_0=rulePARAMETERS_LIST();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getParametersRule());
                      					}
                      					set(
                      						current,
                      						"params",
                      						lv_params_2_0,
                      						"com.ufcg.compiladores.Go.PARAMETERS_LIST");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParametersAccess().getFECHA_PARENTESESParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            ruleFECHA_PARENTESES();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleABRE_PARENTESES"
    // InternalGo.g:2319:1: entryRuleABRE_PARENTESES returns [String current=null] : iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF ;
    public final String entryRuleABRE_PARENTESES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleABRE_PARENTESES = null;


        try {
            // InternalGo.g:2319:55: (iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF )
            // InternalGo.g:2320:2: iv_ruleABRE_PARENTESES= ruleABRE_PARENTESES EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getABRE_PARENTESESRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleABRE_PARENTESES=ruleABRE_PARENTESES();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleABRE_PARENTESES.getText(); 
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
    // $ANTLR end "entryRuleABRE_PARENTESES"


    // $ANTLR start "ruleABRE_PARENTESES"
    // InternalGo.g:2326:1: ruleABRE_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleABRE_PARENTESES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2332:2: (kw= '(' )
            // InternalGo.g:2333:2: kw= '('
            {
            kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getABRE_PARENTESESAccess().getLeftParenthesisKeyword());
              	
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
    // $ANTLR end "ruleABRE_PARENTESES"


    // $ANTLR start "entryRuleFECHA_PARENTESES"
    // InternalGo.g:2341:1: entryRuleFECHA_PARENTESES returns [String current=null] : iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF ;
    public final String entryRuleFECHA_PARENTESES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFECHA_PARENTESES = null;


        try {
            // InternalGo.g:2341:56: (iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF )
            // InternalGo.g:2342:2: iv_ruleFECHA_PARENTESES= ruleFECHA_PARENTESES EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFECHA_PARENTESESRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFECHA_PARENTESES=ruleFECHA_PARENTESES();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFECHA_PARENTESES.getText(); 
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
    // $ANTLR end "entryRuleFECHA_PARENTESES"


    // $ANTLR start "ruleFECHA_PARENTESES"
    // InternalGo.g:2348:1: ruleFECHA_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleFECHA_PARENTESES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:2354:2: (kw= ')' )
            // InternalGo.g:2355:2: kw= ')'
            {
            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getFECHA_PARENTESESAccess().getRightParenthesisKeyword());
              	
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
    // $ANTLR end "ruleFECHA_PARENTESES"


    // $ANTLR start "entryRuleIfCondition"
    // InternalGo.g:2363:1: entryRuleIfCondition returns [EObject current=null] : iv_ruleIfCondition= ruleIfCondition EOF ;
    public final EObject entryRuleIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCondition = null;


        try {
            // InternalGo.g:2363:52: (iv_ruleIfCondition= ruleIfCondition EOF )
            // InternalGo.g:2364:2: iv_ruleIfCondition= ruleIfCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfCondition=ruleIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfCondition; 
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
    // $ANTLR end "entryRuleIfCondition"


    // $ANTLR start "ruleIfCondition"
    // InternalGo.g:2370:1: ruleIfCondition returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' ) ;
    public final EObject ruleIfCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2376:2: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' ) )
            // InternalGo.g:2377:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' )
            {
            // InternalGo.g:2377:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' )
            // InternalGo.g:2378:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfConditionAccess().getIfKeyword_0());
              		
            }
            // InternalGo.g:2382:3: ( (lv_cond_1_0= ruleCondition ) )
            // InternalGo.g:2383:4: (lv_cond_1_0= ruleCondition )
            {
            // InternalGo.g:2383:4: (lv_cond_1_0= ruleCondition )
            // InternalGo.g:2384:5: lv_cond_1_0= ruleCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfConditionAccess().getCondConditionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_cond_1_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfConditionRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_1_0,
              						"com.ufcg.compiladores.Go.Condition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfConditionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGo.g:2405:3: ( (lv_then_3_0= ruleEXPRESSAO ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=RULE_NUMERO && LA30_0<=RULE_STRING_DECL)||(LA30_0>=14 && LA30_0<=17)||(LA30_0>=23 && LA30_0<=24)||LA30_0==28||LA30_0==31) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGo.g:2406:4: (lv_then_3_0= ruleEXPRESSAO )
            	    {
            	    // InternalGo.g:2406:4: (lv_then_3_0= ruleEXPRESSAO )
            	    // InternalGo.g:2407:5: lv_then_3_0= ruleEXPRESSAO
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfConditionAccess().getThenEXPRESSAOParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_then_3_0=ruleEXPRESSAO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfConditionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"then",
            	      						lv_then_3_0,
            	      						"com.ufcg.compiladores.Go.EXPRESSAO");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfConditionAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleIfCondition"


    // $ANTLR start "entryRuleElseIfCondition"
    // InternalGo.g:2432:1: entryRuleElseIfCondition returns [EObject current=null] : iv_ruleElseIfCondition= ruleElseIfCondition EOF ;
    public final EObject entryRuleElseIfCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfCondition = null;


        try {
            // InternalGo.g:2432:56: (iv_ruleElseIfCondition= ruleElseIfCondition EOF )
            // InternalGo.g:2433:2: iv_ruleElseIfCondition= ruleElseIfCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseIfCondition=ruleElseIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfCondition; 
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
    // $ANTLR end "entryRuleElseIfCondition"


    // $ANTLR start "ruleElseIfCondition"
    // InternalGo.g:2439:1: ruleElseIfCondition returns [EObject current=null] : ( ( ( 'else' )=>otherlv_0= 'else' ) this_IfCondition_1= ruleIfCondition ) ;
    public final EObject ruleElseIfCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_IfCondition_1 = null;



        	enterRule();

        try {
            // InternalGo.g:2445:2: ( ( ( ( 'else' )=>otherlv_0= 'else' ) this_IfCondition_1= ruleIfCondition ) )
            // InternalGo.g:2446:2: ( ( ( 'else' )=>otherlv_0= 'else' ) this_IfCondition_1= ruleIfCondition )
            {
            // InternalGo.g:2446:2: ( ( ( 'else' )=>otherlv_0= 'else' ) this_IfCondition_1= ruleIfCondition )
            // InternalGo.g:2447:3: ( ( 'else' )=>otherlv_0= 'else' ) this_IfCondition_1= ruleIfCondition
            {
            // InternalGo.g:2447:3: ( ( 'else' )=>otherlv_0= 'else' )
            // InternalGo.g:2448:4: ( 'else' )=>otherlv_0= 'else'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getElseIfConditionAccess().getElseKeyword_0());
              			
            }

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getElseIfConditionAccess().getIfConditionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_IfCondition_1=ruleIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_IfCondition_1;
              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleElseIfCondition"


    // $ANTLR start "entryRuleElseCondition"
    // InternalGo.g:2469:1: entryRuleElseCondition returns [EObject current=null] : iv_ruleElseCondition= ruleElseCondition EOF ;
    public final EObject entryRuleElseCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseCondition = null;


        try {
            // InternalGo.g:2469:54: (iv_ruleElseCondition= ruleElseCondition EOF )
            // InternalGo.g:2470:2: iv_ruleElseCondition= ruleElseCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseCondition=ruleElseCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseCondition; 
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
    // $ANTLR end "entryRuleElseCondition"


    // $ANTLR start "ruleElseCondition"
    // InternalGo.g:2476:1: ruleElseCondition returns [EObject current=null] : ( () ( ( ( 'else' )=>otherlv_1= 'else' ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleElseCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_then_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2482:2: ( ( () ( ( ( 'else' )=>otherlv_1= 'else' ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' ) ) )
            // InternalGo.g:2483:2: ( () ( ( ( 'else' )=>otherlv_1= 'else' ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' ) )
            {
            // InternalGo.g:2483:2: ( () ( ( ( 'else' )=>otherlv_1= 'else' ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' ) )
            // InternalGo.g:2484:3: () ( ( ( 'else' )=>otherlv_1= 'else' ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' )
            {
            // InternalGo.g:2484:3: ()
            // InternalGo.g:2485:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElseConditionAccess().getElseConditionAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:2494:3: ( ( ( 'else' )=>otherlv_1= 'else' ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}' )
            // InternalGo.g:2495:4: ( ( 'else' )=>otherlv_1= 'else' ) otherlv_2= '{' ( (lv_then_3_0= ruleEXPRESSAO ) )* otherlv_4= '}'
            {
            // InternalGo.g:2495:4: ( ( 'else' )=>otherlv_1= 'else' )
            // InternalGo.g:2496:5: ( 'else' )=>otherlv_1= 'else'
            {
            otherlv_1=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getElseConditionAccess().getElseKeyword_1_0());
              				
            }

            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getElseConditionAccess().getLeftCurlyBracketKeyword_1_1());
              			
            }
            // InternalGo.g:2506:4: ( (lv_then_3_0= ruleEXPRESSAO ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=RULE_NUMERO && LA31_0<=RULE_STRING_DECL)||(LA31_0>=14 && LA31_0<=17)||(LA31_0>=23 && LA31_0<=24)||LA31_0==28||LA31_0==31) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGo.g:2507:5: (lv_then_3_0= ruleEXPRESSAO )
            	    {
            	    // InternalGo.g:2507:5: (lv_then_3_0= ruleEXPRESSAO )
            	    // InternalGo.g:2508:6: lv_then_3_0= ruleEXPRESSAO
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getElseConditionAccess().getThenEXPRESSAOParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_then_3_0=ruleEXPRESSAO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getElseConditionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"then",
            	      							lv_then_3_0,
            	      							"com.ufcg.compiladores.Go.EXPRESSAO");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getElseConditionAccess().getRightCurlyBracketKeyword_1_3());
              			
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
    // $ANTLR end "ruleElseCondition"


    // $ANTLR start "entryRuleBLOCK"
    // InternalGo.g:2534:1: entryRuleBLOCK returns [EObject current=null] : iv_ruleBLOCK= ruleBLOCK EOF ;
    public final EObject entryRuleBLOCK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBLOCK = null;


        try {
            // InternalGo.g:2534:46: (iv_ruleBLOCK= ruleBLOCK EOF )
            // InternalGo.g:2535:2: iv_ruleBLOCK= ruleBLOCK EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBLOCKRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBLOCK=ruleBLOCK();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBLOCK; 
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
    // $ANTLR end "entryRuleBLOCK"


    // $ANTLR start "ruleBLOCK"
    // InternalGo.g:2541:1: ruleBLOCK returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* ( (lv_retorno_3_0= ruleReturnStmt ) )? otherlv_4= '}' ) ;
    public final EObject ruleBLOCK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_listaDeComandos_2_0 = null;

        EObject lv_retorno_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2547:2: ( ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* ( (lv_retorno_3_0= ruleReturnStmt ) )? otherlv_4= '}' ) )
            // InternalGo.g:2548:2: ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* ( (lv_retorno_3_0= ruleReturnStmt ) )? otherlv_4= '}' )
            {
            // InternalGo.g:2548:2: ( () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* ( (lv_retorno_3_0= ruleReturnStmt ) )? otherlv_4= '}' )
            // InternalGo.g:2549:3: () otherlv_1= '{' ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )* ( (lv_retorno_3_0= ruleReturnStmt ) )? otherlv_4= '}'
            {
            // InternalGo.g:2549:3: ()
            // InternalGo.g:2550:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBLOCKAccess().getBLOCKAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBLOCKAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGo.g:2563:3: ( (lv_listaDeComandos_2_0= ruleEXPRESSAO ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=RULE_NUMERO && LA32_0<=RULE_STRING_DECL)||(LA32_0>=14 && LA32_0<=17)||(LA32_0>=23 && LA32_0<=24)||LA32_0==28||LA32_0==31) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:2564:4: (lv_listaDeComandos_2_0= ruleEXPRESSAO )
            	    {
            	    // InternalGo.g:2564:4: (lv_listaDeComandos_2_0= ruleEXPRESSAO )
            	    // InternalGo.g:2565:5: lv_listaDeComandos_2_0= ruleEXPRESSAO
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBLOCKAccess().getListaDeComandosEXPRESSAOParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_listaDeComandos_2_0=ruleEXPRESSAO();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBLOCKRule());
            	      					}
            	      					add(
            	      						current,
            	      						"listaDeComandos",
            	      						lv_listaDeComandos_2_0,
            	      						"com.ufcg.compiladores.Go.EXPRESSAO");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalGo.g:2582:3: ( (lv_retorno_3_0= ruleReturnStmt ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGo.g:2583:4: (lv_retorno_3_0= ruleReturnStmt )
                    {
                    // InternalGo.g:2583:4: (lv_retorno_3_0= ruleReturnStmt )
                    // InternalGo.g:2584:5: lv_retorno_3_0= ruleReturnStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBLOCKAccess().getRetornoReturnStmtParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_retorno_3_0=ruleReturnStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBLOCKRule());
                      					}
                      					set(
                      						current,
                      						"retorno",
                      						lv_retorno_3_0,
                      						"com.ufcg.compiladores.Go.ReturnStmt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBLOCKAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleBLOCK"


    // $ANTLR start "entryRulePARAMETERS_LIST"
    // InternalGo.g:2609:1: entryRulePARAMETERS_LIST returns [EObject current=null] : iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF ;
    public final EObject entryRulePARAMETERS_LIST() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMETERS_LIST = null;


        try {
            // InternalGo.g:2609:56: (iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF )
            // InternalGo.g:2610:2: iv_rulePARAMETERS_LIST= rulePARAMETERS_LIST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPARAMETERS_LISTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePARAMETERS_LIST=rulePARAMETERS_LIST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePARAMETERS_LIST; 
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
    // $ANTLR end "entryRulePARAMETERS_LIST"


    // $ANTLR start "rulePARAMETERS_LIST"
    // InternalGo.g:2616:1: rulePARAMETERS_LIST returns [EObject current=null] : ( () ( (lv_params_1_0= rulePARAMETER ) ) ( ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_params_3_0= rulePARAMETER ) ) )* ) ;
    public final EObject rulePARAMETERS_LIST() throws RecognitionException {
        EObject current = null;

        Token lv_vir_2_0=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2622:2: ( ( () ( (lv_params_1_0= rulePARAMETER ) ) ( ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_params_3_0= rulePARAMETER ) ) )* ) )
            // InternalGo.g:2623:2: ( () ( (lv_params_1_0= rulePARAMETER ) ) ( ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_params_3_0= rulePARAMETER ) ) )* )
            {
            // InternalGo.g:2623:2: ( () ( (lv_params_1_0= rulePARAMETER ) ) ( ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_params_3_0= rulePARAMETER ) ) )* )
            // InternalGo.g:2624:3: () ( (lv_params_1_0= rulePARAMETER ) ) ( ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_params_3_0= rulePARAMETER ) ) )*
            {
            // InternalGo.g:2624:3: ()
            // InternalGo.g:2625:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERS_LISTAction_0(),
              					current);
              			
            }

            }

            // InternalGo.g:2634:3: ( (lv_params_1_0= rulePARAMETER ) )
            // InternalGo.g:2635:4: (lv_params_1_0= rulePARAMETER )
            {
            // InternalGo.g:2635:4: (lv_params_1_0= rulePARAMETER )
            // InternalGo.g:2636:5: lv_params_1_0= rulePARAMETER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getParamsPARAMETERParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_params_1_0=rulePARAMETER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPARAMETERS_LISTRule());
              					}
              					add(
              						current,
              						"params",
              						lv_params_1_0,
              						"com.ufcg.compiladores.Go.PARAMETER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:2653:3: ( ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_params_3_0= rulePARAMETER ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_VIRGULA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGo.g:2654:4: ( (lv_vir_2_0= RULE_VIRGULA ) ) ( (lv_params_3_0= rulePARAMETER ) )
            	    {
            	    // InternalGo.g:2654:4: ( (lv_vir_2_0= RULE_VIRGULA ) )
            	    // InternalGo.g:2655:5: (lv_vir_2_0= RULE_VIRGULA )
            	    {
            	    // InternalGo.g:2655:5: (lv_vir_2_0= RULE_VIRGULA )
            	    // InternalGo.g:2656:6: lv_vir_2_0= RULE_VIRGULA
            	    {
            	    lv_vir_2_0=(Token)match(input,RULE_VIRGULA,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vir_2_0, grammarAccess.getPARAMETERS_LISTAccess().getVirVIRGULATerminalRuleCall_2_0_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPARAMETERS_LISTRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vir",
            	      							lv_vir_2_0,
            	      							"com.ufcg.compiladores.Go.VIRGULA");
            	      					
            	    }

            	    }


            	    }

            	    // InternalGo.g:2672:4: ( (lv_params_3_0= rulePARAMETER ) )
            	    // InternalGo.g:2673:5: (lv_params_3_0= rulePARAMETER )
            	    {
            	    // InternalGo.g:2673:5: (lv_params_3_0= rulePARAMETER )
            	    // InternalGo.g:2674:6: lv_params_3_0= rulePARAMETER
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getParamsPARAMETERParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_params_3_0=rulePARAMETER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPARAMETERS_LISTRule());
            	      						}
            	      						add(
            	      							current,
            	      							"params",
            	      							lv_params_3_0,
            	      							"com.ufcg.compiladores.Go.PARAMETER");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "rulePARAMETERS_LIST"


    // $ANTLR start "entryRulePARAMETER"
    // InternalGo.g:2696:1: entryRulePARAMETER returns [EObject current=null] : iv_rulePARAMETER= rulePARAMETER EOF ;
    public final EObject entryRulePARAMETER() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePARAMETER = null;


        try {
            // InternalGo.g:2696:50: (iv_rulePARAMETER= rulePARAMETER EOF )
            // InternalGo.g:2697:2: iv_rulePARAMETER= rulePARAMETER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPARAMETERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePARAMETER=rulePARAMETER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePARAMETER; 
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
    // $ANTLR end "entryRulePARAMETER"


    // $ANTLR start "rulePARAMETER"
    // InternalGo.g:2703:1: rulePARAMETER returns [EObject current=null] : ( ( () ( (lv_basico_1_0= ruleLITERAIS_BASICOS ) ) ) | ( ( (lv_id_2_0= RULE_ID ) ) ( (lv_tipo_3_0= ruleTypes ) )? ) ) ;
    public final EObject rulePARAMETER() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        EObject lv_basico_1_0 = null;

        EObject lv_tipo_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2709:2: ( ( ( () ( (lv_basico_1_0= ruleLITERAIS_BASICOS ) ) ) | ( ( (lv_id_2_0= RULE_ID ) ) ( (lv_tipo_3_0= ruleTypes ) )? ) ) )
            // InternalGo.g:2710:2: ( ( () ( (lv_basico_1_0= ruleLITERAIS_BASICOS ) ) ) | ( ( (lv_id_2_0= RULE_ID ) ) ( (lv_tipo_3_0= ruleTypes ) )? ) )
            {
            // InternalGo.g:2710:2: ( ( () ( (lv_basico_1_0= ruleLITERAIS_BASICOS ) ) ) | ( ( (lv_id_2_0= RULE_ID ) ) ( (lv_tipo_3_0= ruleTypes ) )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_NUMERO && LA36_0<=RULE_STRING_DECL)||(LA36_0>=14 && LA36_0<=15)) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalGo.g:2711:3: ( () ( (lv_basico_1_0= ruleLITERAIS_BASICOS ) ) )
                    {
                    // InternalGo.g:2711:3: ( () ( (lv_basico_1_0= ruleLITERAIS_BASICOS ) ) )
                    // InternalGo.g:2712:4: () ( (lv_basico_1_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:2712:4: ()
                    // InternalGo.g:2713:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPARAMETERAccess().getPARAMETERAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:2722:4: ( (lv_basico_1_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:2723:5: (lv_basico_1_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:2723:5: (lv_basico_1_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:2724:6: lv_basico_1_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPARAMETERAccess().getBasicoLITERAIS_BASICOSParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_basico_1_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPARAMETERRule());
                      						}
                      						set(
                      							current,
                      							"basico",
                      							lv_basico_1_0,
                      							"com.ufcg.compiladores.Go.LITERAIS_BASICOS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2743:3: ( ( (lv_id_2_0= RULE_ID ) ) ( (lv_tipo_3_0= ruleTypes ) )? )
                    {
                    // InternalGo.g:2743:3: ( ( (lv_id_2_0= RULE_ID ) ) ( (lv_tipo_3_0= ruleTypes ) )? )
                    // InternalGo.g:2744:4: ( (lv_id_2_0= RULE_ID ) ) ( (lv_tipo_3_0= ruleTypes ) )?
                    {
                    // InternalGo.g:2744:4: ( (lv_id_2_0= RULE_ID ) )
                    // InternalGo.g:2745:5: (lv_id_2_0= RULE_ID )
                    {
                    // InternalGo.g:2745:5: (lv_id_2_0= RULE_ID )
                    // InternalGo.g:2746:6: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_id_2_0, grammarAccess.getPARAMETERAccess().getIdIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPARAMETERRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"id",
                      							lv_id_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalGo.g:2762:4: ( (lv_tipo_3_0= ruleTypes ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==21||(LA35_0>=33 && LA35_0<=36)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalGo.g:2763:5: (lv_tipo_3_0= ruleTypes )
                            {
                            // InternalGo.g:2763:5: (lv_tipo_3_0= ruleTypes )
                            // InternalGo.g:2764:6: lv_tipo_3_0= ruleTypes
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getPARAMETERAccess().getTipoTypesParserRuleCall_1_1_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_tipo_3_0=ruleTypes();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getPARAMETERRule());
                              						}
                              						set(
                              							current,
                              							"tipo",
                              							lv_tipo_3_0,
                              							"com.ufcg.compiladores.Go.Types");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "rulePARAMETER"


    // $ANTLR start "entryRuleTypes"
    // InternalGo.g:2786:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // InternalGo.g:2786:46: (iv_ruleTypes= ruleTypes EOF )
            // InternalGo.g:2787:2: iv_ruleTypes= ruleTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypes; 
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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalGo.g:2793:1: ruleTypes returns [EObject current=null] : ( ( () ( (lv_basic_1_0= ruleBasicType ) ) ) | ( (lv_array_2_0= ruleArrayType ) ) ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_basic_1_0 = null;

        EObject lv_array_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2799:2: ( ( ( () ( (lv_basic_1_0= ruleBasicType ) ) ) | ( (lv_array_2_0= ruleArrayType ) ) ) )
            // InternalGo.g:2800:2: ( ( () ( (lv_basic_1_0= ruleBasicType ) ) ) | ( (lv_array_2_0= ruleArrayType ) ) )
            {
            // InternalGo.g:2800:2: ( ( () ( (lv_basic_1_0= ruleBasicType ) ) ) | ( (lv_array_2_0= ruleArrayType ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=33 && LA37_0<=36)) ) {
                alt37=1;
            }
            else if ( (LA37_0==21) ) {
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
                    // InternalGo.g:2801:3: ( () ( (lv_basic_1_0= ruleBasicType ) ) )
                    {
                    // InternalGo.g:2801:3: ( () ( (lv_basic_1_0= ruleBasicType ) ) )
                    // InternalGo.g:2802:4: () ( (lv_basic_1_0= ruleBasicType ) )
                    {
                    // InternalGo.g:2802:4: ()
                    // InternalGo.g:2803:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypesAccess().getTypesAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:2812:4: ( (lv_basic_1_0= ruleBasicType ) )
                    // InternalGo.g:2813:5: (lv_basic_1_0= ruleBasicType )
                    {
                    // InternalGo.g:2813:5: (lv_basic_1_0= ruleBasicType )
                    // InternalGo.g:2814:6: lv_basic_1_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypesAccess().getBasicBasicTypeParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_basic_1_0=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypesRule());
                      						}
                      						set(
                      							current,
                      							"basic",
                      							lv_basic_1_0,
                      							"com.ufcg.compiladores.Go.BasicType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2833:3: ( (lv_array_2_0= ruleArrayType ) )
                    {
                    // InternalGo.g:2833:3: ( (lv_array_2_0= ruleArrayType ) )
                    // InternalGo.g:2834:4: (lv_array_2_0= ruleArrayType )
                    {
                    // InternalGo.g:2834:4: (lv_array_2_0= ruleArrayType )
                    // InternalGo.g:2835:5: lv_array_2_0= ruleArrayType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypesAccess().getArrayArrayTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_array_2_0=ruleArrayType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypesRule());
                      					}
                      					set(
                      						current,
                      						"array",
                      						lv_array_2_0,
                      						"com.ufcg.compiladores.Go.ArrayType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleArrayType"
    // InternalGo.g:2856:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalGo.g:2856:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalGo.g:2857:2: iv_ruleArrayType= ruleArrayType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayType; 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalGo.g:2863:1: ruleArrayType returns [EObject current=null] : (otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) ) ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_qtd_1_0=null;
        Token otherlv_2=null;
        EObject lv_basic_3_0 = null;



        	enterRule();

        try {
            // InternalGo.g:2869:2: ( (otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) ) ) )
            // InternalGo.g:2870:2: (otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) ) )
            {
            // InternalGo.g:2870:2: (otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) ) )
            // InternalGo.g:2871:3: otherlv_0= '[' ( (lv_qtd_1_0= RULE_NUMERO ) )? otherlv_2= ']' ( (lv_basic_3_0= ruleBasicType ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalGo.g:2875:3: ( (lv_qtd_1_0= RULE_NUMERO ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_NUMERO) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGo.g:2876:4: (lv_qtd_1_0= RULE_NUMERO )
                    {
                    // InternalGo.g:2876:4: (lv_qtd_1_0= RULE_NUMERO )
                    // InternalGo.g:2877:5: lv_qtd_1_0= RULE_NUMERO
                    {
                    lv_qtd_1_0=(Token)match(input,RULE_NUMERO,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_qtd_1_0, grammarAccess.getArrayTypeAccess().getQtdNUMEROTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getArrayTypeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"qtd",
                      						lv_qtd_1_0,
                      						"com.ufcg.compiladores.Go.NUMERO");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_2());
              		
            }
            // InternalGo.g:2897:3: ( (lv_basic_3_0= ruleBasicType ) )
            // InternalGo.g:2898:4: (lv_basic_3_0= ruleBasicType )
            {
            // InternalGo.g:2898:4: (lv_basic_3_0= ruleBasicType )
            // InternalGo.g:2899:5: lv_basic_3_0= ruleBasicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayTypeAccess().getBasicBasicTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_basic_3_0=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayTypeRule());
              					}
              					set(
              						current,
              						"basic",
              						lv_basic_3_0,
              						"com.ufcg.compiladores.Go.BasicType");
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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleBasicType"
    // InternalGo.g:2920:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalGo.g:2920:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalGo.g:2921:2: iv_ruleBasicType= ruleBasicType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicType; 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalGo.g:2927:1: ruleBasicType returns [EObject current=null] : ( ( (lv_string_0_0= 'string' ) ) | ( (lv_int_1_0= 'int' ) ) | ( (lv_float_2_0= 'float' ) ) | ( (lv_boolean_3_0= 'bool' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token lv_int_1_0=null;
        Token lv_float_2_0=null;
        Token lv_boolean_3_0=null;


        	enterRule();

        try {
            // InternalGo.g:2933:2: ( ( ( (lv_string_0_0= 'string' ) ) | ( (lv_int_1_0= 'int' ) ) | ( (lv_float_2_0= 'float' ) ) | ( (lv_boolean_3_0= 'bool' ) ) ) )
            // InternalGo.g:2934:2: ( ( (lv_string_0_0= 'string' ) ) | ( (lv_int_1_0= 'int' ) ) | ( (lv_float_2_0= 'float' ) ) | ( (lv_boolean_3_0= 'bool' ) ) )
            {
            // InternalGo.g:2934:2: ( ( (lv_string_0_0= 'string' ) ) | ( (lv_int_1_0= 'int' ) ) | ( (lv_float_2_0= 'float' ) ) | ( (lv_boolean_3_0= 'bool' ) ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt39=1;
                }
                break;
            case 34:
                {
                alt39=2;
                }
                break;
            case 35:
                {
                alt39=3;
                }
                break;
            case 36:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalGo.g:2935:3: ( (lv_string_0_0= 'string' ) )
                    {
                    // InternalGo.g:2935:3: ( (lv_string_0_0= 'string' ) )
                    // InternalGo.g:2936:4: (lv_string_0_0= 'string' )
                    {
                    // InternalGo.g:2936:4: (lv_string_0_0= 'string' )
                    // InternalGo.g:2937:5: lv_string_0_0= 'string'
                    {
                    lv_string_0_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_string_0_0, grammarAccess.getBasicTypeAccess().getStringStringKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "string", lv_string_0_0, "string");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:2950:3: ( (lv_int_1_0= 'int' ) )
                    {
                    // InternalGo.g:2950:3: ( (lv_int_1_0= 'int' ) )
                    // InternalGo.g:2951:4: (lv_int_1_0= 'int' )
                    {
                    // InternalGo.g:2951:4: (lv_int_1_0= 'int' )
                    // InternalGo.g:2952:5: lv_int_1_0= 'int'
                    {
                    lv_int_1_0=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_int_1_0, grammarAccess.getBasicTypeAccess().getIntIntKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "int", lv_int_1_0, "int");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:2965:3: ( (lv_float_2_0= 'float' ) )
                    {
                    // InternalGo.g:2965:3: ( (lv_float_2_0= 'float' ) )
                    // InternalGo.g:2966:4: (lv_float_2_0= 'float' )
                    {
                    // InternalGo.g:2966:4: (lv_float_2_0= 'float' )
                    // InternalGo.g:2967:5: lv_float_2_0= 'float'
                    {
                    lv_float_2_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_float_2_0, grammarAccess.getBasicTypeAccess().getFloatFloatKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "float", lv_float_2_0, "float");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:2980:3: ( (lv_boolean_3_0= 'bool' ) )
                    {
                    // InternalGo.g:2980:3: ( (lv_boolean_3_0= 'bool' ) )
                    // InternalGo.g:2981:4: (lv_boolean_3_0= 'bool' )
                    {
                    // InternalGo.g:2981:4: (lv_boolean_3_0= 'bool' )
                    // InternalGo.g:2982:5: lv_boolean_3_0= 'bool'
                    {
                    lv_boolean_3_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolean_3_0, grammarAccess.getBasicTypeAccess().getBooleanBoolKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBasicTypeRule());
                      					}
                      					setWithLastConsumed(current, "boolean", lv_boolean_3_0, "bool");
                      				
                    }

                    }


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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleVarCall"
    // InternalGo.g:2998:1: entryRuleVarCall returns [EObject current=null] : iv_ruleVarCall= ruleVarCall EOF ;
    public final EObject entryRuleVarCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarCall = null;


        try {
            // InternalGo.g:2998:48: (iv_ruleVarCall= ruleVarCall EOF )
            // InternalGo.g:2999:2: iv_ruleVarCall= ruleVarCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarCall=ruleVarCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarCall; 
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
    // $ANTLR end "entryRuleVarCall"


    // $ANTLR start "ruleVarCall"
    // InternalGo.g:3005:1: ruleVarCall returns [EObject current=null] : ( ( ( RULE_ID ) )=> (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleVarCall() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalGo.g:3011:2: ( ( ( ( RULE_ID ) )=> (lv_id_0_0= RULE_ID ) ) )
            // InternalGo.g:3012:2: ( ( ( RULE_ID ) )=> (lv_id_0_0= RULE_ID ) )
            {
            // InternalGo.g:3012:2: ( ( ( RULE_ID ) )=> (lv_id_0_0= RULE_ID ) )
            // InternalGo.g:3013:3: ( ( RULE_ID ) )=> (lv_id_0_0= RULE_ID )
            {
            // InternalGo.g:3017:3: (lv_id_0_0= RULE_ID )
            // InternalGo.g:3018:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_id_0_0, grammarAccess.getVarCallAccess().getIdIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVarCallRule());
              				}
              				setWithLastConsumed(
              					current,
              					"id",
              					lv_id_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
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
    // $ANTLR end "ruleVarCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalGo.g:3037:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalGo.g:3037:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalGo.g:3038:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalGo.g:3044:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= rulePARAMETERS_LIST ) )? otherlv_3= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3050:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= rulePARAMETERS_LIST ) )? otherlv_3= ')' ) )
            // InternalGo.g:3051:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= rulePARAMETERS_LIST ) )? otherlv_3= ')' )
            {
            // InternalGo.g:3051:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= rulePARAMETERS_LIST ) )? otherlv_3= ')' )
            // InternalGo.g:3052:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= rulePARAMETERS_LIST ) )? otherlv_3= ')'
            {
            // InternalGo.g:3052:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalGo.g:3053:4: (lv_id_0_0= RULE_ID )
            {
            // InternalGo.g:3053:4: (lv_id_0_0= RULE_ID )
            // InternalGo.g:3054:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_0_0, grammarAccess.getFunctionCallAccess().getIdIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGo.g:3074:3: ( (lv_params_2_0= rulePARAMETERS_LIST ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||(LA40_0>=RULE_NUMERO && LA40_0<=RULE_STRING_DECL)||(LA40_0>=14 && LA40_0<=15)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGo.g:3075:4: (lv_params_2_0= rulePARAMETERS_LIST )
                    {
                    // InternalGo.g:3075:4: (lv_params_2_0= rulePARAMETERS_LIST )
                    // InternalGo.g:3076:5: lv_params_2_0= rulePARAMETERS_LIST
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionCallAccess().getParamsPARAMETERS_LISTParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_34);
                    lv_params_2_0=rulePARAMETERS_LIST();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      					}
                      					set(
                      						current,
                      						"params",
                      						lv_params_2_0,
                      						"com.ufcg.compiladores.Go.PARAMETERS_LIST");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
              		
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


    // $ANTLR start "entryRuleChamada"
    // InternalGo.g:3101:1: entryRuleChamada returns [EObject current=null] : iv_ruleChamada= ruleChamada EOF ;
    public final EObject entryRuleChamada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChamada = null;


        try {
            // InternalGo.g:3101:48: (iv_ruleChamada= ruleChamada EOF )
            // InternalGo.g:3102:2: iv_ruleChamada= ruleChamada EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChamadaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChamada=ruleChamada();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChamada; 
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
    // $ANTLR end "entryRuleChamada"


    // $ANTLR start "ruleChamada"
    // InternalGo.g:3108:1: ruleChamada returns [EObject current=null] : ( ( (lv_cham_0_0= ruleFunctionCall ) ) | ( (lv_cham_1_0= ruleVarCall ) ) | ( (lv_cham_2_0= ruleLITERAIS_BASICOS ) ) ) ;
    public final EObject ruleChamada() throws RecognitionException {
        EObject current = null;

        EObject lv_cham_0_0 = null;

        EObject lv_cham_1_0 = null;

        EObject lv_cham_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3114:2: ( ( ( (lv_cham_0_0= ruleFunctionCall ) ) | ( (lv_cham_1_0= ruleVarCall ) ) | ( (lv_cham_2_0= ruleLITERAIS_BASICOS ) ) ) )
            // InternalGo.g:3115:2: ( ( (lv_cham_0_0= ruleFunctionCall ) ) | ( (lv_cham_1_0= ruleVarCall ) ) | ( (lv_cham_2_0= ruleLITERAIS_BASICOS ) ) )
            {
            // InternalGo.g:3115:2: ( ( (lv_cham_0_0= ruleFunctionCall ) ) | ( (lv_cham_1_0= ruleVarCall ) ) | ( (lv_cham_2_0= ruleLITERAIS_BASICOS ) ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==29) ) {
                    alt41=1;
                }
                else if ( (LA41_1==EOF||LA41_1==RULE_ID||(LA41_1>=RULE_NUMERO && LA41_1<=RULE_STRING_DECL)||(LA41_1>=14 && LA41_1<=18)||LA41_1==20||(LA41_1>=23 && LA41_1<=24)||(LA41_1>=27 && LA41_1<=28)||LA41_1==31||(LA41_1>=46 && LA41_1<=50)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA41_0>=RULE_NUMERO && LA41_0<=RULE_STRING_DECL)||(LA41_0>=14 && LA41_0<=15)) ) {
                alt41=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalGo.g:3116:3: ( (lv_cham_0_0= ruleFunctionCall ) )
                    {
                    // InternalGo.g:3116:3: ( (lv_cham_0_0= ruleFunctionCall ) )
                    // InternalGo.g:3117:4: (lv_cham_0_0= ruleFunctionCall )
                    {
                    // InternalGo.g:3117:4: (lv_cham_0_0= ruleFunctionCall )
                    // InternalGo.g:3118:5: lv_cham_0_0= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getChamadaAccess().getChamFunctionCallParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cham_0_0=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getChamadaRule());
                      					}
                      					add(
                      						current,
                      						"cham",
                      						lv_cham_0_0,
                      						"com.ufcg.compiladores.Go.FunctionCall");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3136:3: ( (lv_cham_1_0= ruleVarCall ) )
                    {
                    // InternalGo.g:3136:3: ( (lv_cham_1_0= ruleVarCall ) )
                    // InternalGo.g:3137:4: (lv_cham_1_0= ruleVarCall )
                    {
                    // InternalGo.g:3137:4: (lv_cham_1_0= ruleVarCall )
                    // InternalGo.g:3138:5: lv_cham_1_0= ruleVarCall
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getChamadaAccess().getChamVarCallParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cham_1_0=ruleVarCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getChamadaRule());
                      					}
                      					add(
                      						current,
                      						"cham",
                      						lv_cham_1_0,
                      						"com.ufcg.compiladores.Go.VarCall");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:3156:3: ( (lv_cham_2_0= ruleLITERAIS_BASICOS ) )
                    {
                    // InternalGo.g:3156:3: ( (lv_cham_2_0= ruleLITERAIS_BASICOS ) )
                    // InternalGo.g:3157:4: (lv_cham_2_0= ruleLITERAIS_BASICOS )
                    {
                    // InternalGo.g:3157:4: (lv_cham_2_0= ruleLITERAIS_BASICOS )
                    // InternalGo.g:3158:5: lv_cham_2_0= ruleLITERAIS_BASICOS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getChamadaAccess().getChamLITERAIS_BASICOSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cham_2_0=ruleLITERAIS_BASICOS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getChamadaRule());
                      					}
                      					add(
                      						current,
                      						"cham",
                      						lv_cham_2_0,
                      						"com.ufcg.compiladores.Go.LITERAIS_BASICOS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


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
    // $ANTLR end "ruleChamada"


    // $ANTLR start "entryRuleBOOL_OP"
    // InternalGo.g:3179:1: entryRuleBOOL_OP returns [EObject current=null] : iv_ruleBOOL_OP= ruleBOOL_OP EOF ;
    public final EObject entryRuleBOOL_OP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOL_OP = null;


        try {
            // InternalGo.g:3179:48: (iv_ruleBOOL_OP= ruleBOOL_OP EOF )
            // InternalGo.g:3180:2: iv_ruleBOOL_OP= ruleBOOL_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOL_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOL_OP=ruleBOOL_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOL_OP; 
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
    // $ANTLR end "entryRuleBOOL_OP"


    // $ANTLR start "ruleBOOL_OP"
    // InternalGo.g:3186:1: ruleBOOL_OP returns [EObject current=null] : ( ( () ( ( '&&' )=>otherlv_1= '&&' ) ) | ( () ( ( '||' )=>otherlv_3= '||' ) ) ) ;
    public final EObject ruleBOOL_OP() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGo.g:3192:2: ( ( ( () ( ( '&&' )=>otherlv_1= '&&' ) ) | ( () ( ( '||' )=>otherlv_3= '||' ) ) ) )
            // InternalGo.g:3193:2: ( ( () ( ( '&&' )=>otherlv_1= '&&' ) ) | ( () ( ( '||' )=>otherlv_3= '||' ) ) )
            {
            // InternalGo.g:3193:2: ( ( () ( ( '&&' )=>otherlv_1= '&&' ) ) | ( () ( ( '||' )=>otherlv_3= '||' ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            else if ( (LA42_0==38) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalGo.g:3194:3: ( () ( ( '&&' )=>otherlv_1= '&&' ) )
                    {
                    // InternalGo.g:3194:3: ( () ( ( '&&' )=>otherlv_1= '&&' ) )
                    // InternalGo.g:3195:4: () ( ( '&&' )=>otherlv_1= '&&' )
                    {
                    // InternalGo.g:3195:4: ()
                    // InternalGo.g:3196:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBOOL_OPAccess().getBOOL_OPAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:3205:4: ( ( '&&' )=>otherlv_1= '&&' )
                    // InternalGo.g:3206:5: ( '&&' )=>otherlv_1= '&&'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getBOOL_OPAccess().getAmpersandAmpersandKeyword_0_1());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3214:3: ( () ( ( '||' )=>otherlv_3= '||' ) )
                    {
                    // InternalGo.g:3214:3: ( () ( ( '||' )=>otherlv_3= '||' ) )
                    // InternalGo.g:3215:4: () ( ( '||' )=>otherlv_3= '||' )
                    {
                    // InternalGo.g:3215:4: ()
                    // InternalGo.g:3216:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBOOL_OPAccess().getBOOL_OPAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGo.g:3225:4: ( ( '||' )=>otherlv_3= '||' )
                    // InternalGo.g:3226:5: ( '||' )=>otherlv_3= '||'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getBOOL_OPAccess().getVerticalLineVerticalLineKeyword_1_1());
                      				
                    }

                    }


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
    // $ANTLR end "ruleBOOL_OP"


    // $ANTLR start "entryRuleARIT_EXPR"
    // InternalGo.g:3237:1: entryRuleARIT_EXPR returns [EObject current=null] : iv_ruleARIT_EXPR= ruleARIT_EXPR EOF ;
    public final EObject entryRuleARIT_EXPR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARIT_EXPR = null;


        try {
            // InternalGo.g:3237:50: (iv_ruleARIT_EXPR= ruleARIT_EXPR EOF )
            // InternalGo.g:3238:2: iv_ruleARIT_EXPR= ruleARIT_EXPR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARIT_EXPRRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARIT_EXPR=ruleARIT_EXPR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARIT_EXPR; 
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
    // $ANTLR end "entryRuleARIT_EXPR"


    // $ANTLR start "ruleARIT_EXPR"
    // InternalGo.g:3244:1: ruleARIT_EXPR returns [EObject current=null] : ( ( ( ( (lv_num1_0_0= RULE_NUMERO ) ) | ( (lv_var1_1_0= ruleVarCall ) ) ) ( (lv_op_2_0= ruleARIT_OP ) ) ( ( (lv_num2_3_0= RULE_NUMERO ) ) | ( (lv_var2_4_0= ruleVarCall ) ) ) ) | ( ( ( (lv_num_5_0= RULE_NUMERO ) ) | ( (lv_var_6_0= ruleVarCall ) ) ) ( (lv_atr_7_0= ruleARIT_ATR ) ) ) | ( ( (lv_atr_8_0= ruleARIT_ATR ) ) ( ( (lv_num_9_0= RULE_NUMERO ) ) | ( (lv_var_10_0= ruleVarCall ) ) ) ) ) ;
    public final EObject ruleARIT_EXPR() throws RecognitionException {
        EObject current = null;

        Token lv_num1_0_0=null;
        Token lv_num2_3_0=null;
        Token lv_num_5_0=null;
        Token lv_num_9_0=null;
        EObject lv_var1_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_var2_4_0 = null;

        EObject lv_var_6_0 = null;

        AntlrDatatypeRuleToken lv_atr_7_0 = null;

        AntlrDatatypeRuleToken lv_atr_8_0 = null;

        EObject lv_var_10_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3250:2: ( ( ( ( ( (lv_num1_0_0= RULE_NUMERO ) ) | ( (lv_var1_1_0= ruleVarCall ) ) ) ( (lv_op_2_0= ruleARIT_OP ) ) ( ( (lv_num2_3_0= RULE_NUMERO ) ) | ( (lv_var2_4_0= ruleVarCall ) ) ) ) | ( ( ( (lv_num_5_0= RULE_NUMERO ) ) | ( (lv_var_6_0= ruleVarCall ) ) ) ( (lv_atr_7_0= ruleARIT_ATR ) ) ) | ( ( (lv_atr_8_0= ruleARIT_ATR ) ) ( ( (lv_num_9_0= RULE_NUMERO ) ) | ( (lv_var_10_0= ruleVarCall ) ) ) ) ) )
            // InternalGo.g:3251:2: ( ( ( ( (lv_num1_0_0= RULE_NUMERO ) ) | ( (lv_var1_1_0= ruleVarCall ) ) ) ( (lv_op_2_0= ruleARIT_OP ) ) ( ( (lv_num2_3_0= RULE_NUMERO ) ) | ( (lv_var2_4_0= ruleVarCall ) ) ) ) | ( ( ( (lv_num_5_0= RULE_NUMERO ) ) | ( (lv_var_6_0= ruleVarCall ) ) ) ( (lv_atr_7_0= ruleARIT_ATR ) ) ) | ( ( (lv_atr_8_0= ruleARIT_ATR ) ) ( ( (lv_num_9_0= RULE_NUMERO ) ) | ( (lv_var_10_0= ruleVarCall ) ) ) ) )
            {
            // InternalGo.g:3251:2: ( ( ( ( (lv_num1_0_0= RULE_NUMERO ) ) | ( (lv_var1_1_0= ruleVarCall ) ) ) ( (lv_op_2_0= ruleARIT_OP ) ) ( ( (lv_num2_3_0= RULE_NUMERO ) ) | ( (lv_var2_4_0= ruleVarCall ) ) ) ) | ( ( ( (lv_num_5_0= RULE_NUMERO ) ) | ( (lv_var_6_0= ruleVarCall ) ) ) ( (lv_atr_7_0= ruleARIT_ATR ) ) ) | ( ( (lv_atr_8_0= ruleARIT_ATR ) ) ( ( (lv_num_9_0= RULE_NUMERO ) ) | ( (lv_var_10_0= ruleVarCall ) ) ) ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
                {
                int LA47_1 = input.LA(2);

                if ( ((LA47_1>=39 && LA47_1<=43)) ) {
                    alt47=1;
                }
                else if ( ((LA47_1>=44 && LA47_1<=45)) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA47_2 = input.LA(2);

                if ( ((LA47_2>=44 && LA47_2<=45)) ) {
                    alt47=2;
                }
                else if ( ((LA47_2>=39 && LA47_2<=43)) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
                }
                break;
            case 44:
            case 45:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalGo.g:3252:3: ( ( ( (lv_num1_0_0= RULE_NUMERO ) ) | ( (lv_var1_1_0= ruleVarCall ) ) ) ( (lv_op_2_0= ruleARIT_OP ) ) ( ( (lv_num2_3_0= RULE_NUMERO ) ) | ( (lv_var2_4_0= ruleVarCall ) ) ) )
                    {
                    // InternalGo.g:3252:3: ( ( ( (lv_num1_0_0= RULE_NUMERO ) ) | ( (lv_var1_1_0= ruleVarCall ) ) ) ( (lv_op_2_0= ruleARIT_OP ) ) ( ( (lv_num2_3_0= RULE_NUMERO ) ) | ( (lv_var2_4_0= ruleVarCall ) ) ) )
                    // InternalGo.g:3253:4: ( ( (lv_num1_0_0= RULE_NUMERO ) ) | ( (lv_var1_1_0= ruleVarCall ) ) ) ( (lv_op_2_0= ruleARIT_OP ) ) ( ( (lv_num2_3_0= RULE_NUMERO ) ) | ( (lv_var2_4_0= ruleVarCall ) ) )
                    {
                    // InternalGo.g:3253:4: ( ( (lv_num1_0_0= RULE_NUMERO ) ) | ( (lv_var1_1_0= ruleVarCall ) ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_NUMERO) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==RULE_ID) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalGo.g:3254:5: ( (lv_num1_0_0= RULE_NUMERO ) )
                            {
                            // InternalGo.g:3254:5: ( (lv_num1_0_0= RULE_NUMERO ) )
                            // InternalGo.g:3255:6: (lv_num1_0_0= RULE_NUMERO )
                            {
                            // InternalGo.g:3255:6: (lv_num1_0_0= RULE_NUMERO )
                            // InternalGo.g:3256:7: lv_num1_0_0= RULE_NUMERO
                            {
                            lv_num1_0_0=(Token)match(input,RULE_NUMERO,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_num1_0_0, grammarAccess.getARIT_EXPRAccess().getNum1NUMEROTerminalRuleCall_0_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getARIT_EXPRRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"num1",
                              								lv_num1_0_0,
                              								"com.ufcg.compiladores.Go.NUMERO");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGo.g:3273:5: ( (lv_var1_1_0= ruleVarCall ) )
                            {
                            // InternalGo.g:3273:5: ( (lv_var1_1_0= ruleVarCall ) )
                            // InternalGo.g:3274:6: (lv_var1_1_0= ruleVarCall )
                            {
                            // InternalGo.g:3274:6: (lv_var1_1_0= ruleVarCall )
                            // InternalGo.g:3275:7: lv_var1_1_0= ruleVarCall
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getARIT_EXPRAccess().getVar1VarCallParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_26);
                            lv_var1_1_0=ruleVarCall();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getARIT_EXPRRule());
                              							}
                              							set(
                              								current,
                              								"var1",
                              								lv_var1_1_0,
                              								"com.ufcg.compiladores.Go.VarCall");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalGo.g:3293:4: ( (lv_op_2_0= ruleARIT_OP ) )
                    // InternalGo.g:3294:5: (lv_op_2_0= ruleARIT_OP )
                    {
                    // InternalGo.g:3294:5: (lv_op_2_0= ruleARIT_OP )
                    // InternalGo.g:3295:6: lv_op_2_0= ruleARIT_OP
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getARIT_EXPRAccess().getOpARIT_OPParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_op_2_0=ruleARIT_OP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getARIT_EXPRRule());
                      						}
                      						set(
                      							current,
                      							"op",
                      							lv_op_2_0,
                      							"com.ufcg.compiladores.Go.ARIT_OP");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:3312:4: ( ( (lv_num2_3_0= RULE_NUMERO ) ) | ( (lv_var2_4_0= ruleVarCall ) ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_NUMERO) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==RULE_ID) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalGo.g:3313:5: ( (lv_num2_3_0= RULE_NUMERO ) )
                            {
                            // InternalGo.g:3313:5: ( (lv_num2_3_0= RULE_NUMERO ) )
                            // InternalGo.g:3314:6: (lv_num2_3_0= RULE_NUMERO )
                            {
                            // InternalGo.g:3314:6: (lv_num2_3_0= RULE_NUMERO )
                            // InternalGo.g:3315:7: lv_num2_3_0= RULE_NUMERO
                            {
                            lv_num2_3_0=(Token)match(input,RULE_NUMERO,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_num2_3_0, grammarAccess.getARIT_EXPRAccess().getNum2NUMEROTerminalRuleCall_0_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getARIT_EXPRRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"num2",
                              								lv_num2_3_0,
                              								"com.ufcg.compiladores.Go.NUMERO");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGo.g:3332:5: ( (lv_var2_4_0= ruleVarCall ) )
                            {
                            // InternalGo.g:3332:5: ( (lv_var2_4_0= ruleVarCall ) )
                            // InternalGo.g:3333:6: (lv_var2_4_0= ruleVarCall )
                            {
                            // InternalGo.g:3333:6: (lv_var2_4_0= ruleVarCall )
                            // InternalGo.g:3334:7: lv_var2_4_0= ruleVarCall
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getARIT_EXPRAccess().getVar2VarCallParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_var2_4_0=ruleVarCall();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getARIT_EXPRRule());
                              							}
                              							set(
                              								current,
                              								"var2",
                              								lv_var2_4_0,
                              								"com.ufcg.compiladores.Go.VarCall");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3354:3: ( ( ( (lv_num_5_0= RULE_NUMERO ) ) | ( (lv_var_6_0= ruleVarCall ) ) ) ( (lv_atr_7_0= ruleARIT_ATR ) ) )
                    {
                    // InternalGo.g:3354:3: ( ( ( (lv_num_5_0= RULE_NUMERO ) ) | ( (lv_var_6_0= ruleVarCall ) ) ) ( (lv_atr_7_0= ruleARIT_ATR ) ) )
                    // InternalGo.g:3355:4: ( ( (lv_num_5_0= RULE_NUMERO ) ) | ( (lv_var_6_0= ruleVarCall ) ) ) ( (lv_atr_7_0= ruleARIT_ATR ) )
                    {
                    // InternalGo.g:3355:4: ( ( (lv_num_5_0= RULE_NUMERO ) ) | ( (lv_var_6_0= ruleVarCall ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_NUMERO) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==RULE_ID) ) {
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
                            // InternalGo.g:3356:5: ( (lv_num_5_0= RULE_NUMERO ) )
                            {
                            // InternalGo.g:3356:5: ( (lv_num_5_0= RULE_NUMERO ) )
                            // InternalGo.g:3357:6: (lv_num_5_0= RULE_NUMERO )
                            {
                            // InternalGo.g:3357:6: (lv_num_5_0= RULE_NUMERO )
                            // InternalGo.g:3358:7: lv_num_5_0= RULE_NUMERO
                            {
                            lv_num_5_0=(Token)match(input,RULE_NUMERO,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_num_5_0, grammarAccess.getARIT_EXPRAccess().getNumNUMEROTerminalRuleCall_1_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getARIT_EXPRRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"num",
                              								lv_num_5_0,
                              								"com.ufcg.compiladores.Go.NUMERO");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGo.g:3375:5: ( (lv_var_6_0= ruleVarCall ) )
                            {
                            // InternalGo.g:3375:5: ( (lv_var_6_0= ruleVarCall ) )
                            // InternalGo.g:3376:6: (lv_var_6_0= ruleVarCall )
                            {
                            // InternalGo.g:3376:6: (lv_var_6_0= ruleVarCall )
                            // InternalGo.g:3377:7: lv_var_6_0= ruleVarCall
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getARIT_EXPRAccess().getVarVarCallParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_36);
                            lv_var_6_0=ruleVarCall();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getARIT_EXPRRule());
                              							}
                              							set(
                              								current,
                              								"var",
                              								lv_var_6_0,
                              								"com.ufcg.compiladores.Go.VarCall");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalGo.g:3395:4: ( (lv_atr_7_0= ruleARIT_ATR ) )
                    // InternalGo.g:3396:5: (lv_atr_7_0= ruleARIT_ATR )
                    {
                    // InternalGo.g:3396:5: (lv_atr_7_0= ruleARIT_ATR )
                    // InternalGo.g:3397:6: lv_atr_7_0= ruleARIT_ATR
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getARIT_EXPRAccess().getAtrARIT_ATRParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_atr_7_0=ruleARIT_ATR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getARIT_EXPRRule());
                      						}
                      						set(
                      							current,
                      							"atr",
                      							lv_atr_7_0,
                      							"com.ufcg.compiladores.Go.ARIT_ATR");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:3416:3: ( ( (lv_atr_8_0= ruleARIT_ATR ) ) ( ( (lv_num_9_0= RULE_NUMERO ) ) | ( (lv_var_10_0= ruleVarCall ) ) ) )
                    {
                    // InternalGo.g:3416:3: ( ( (lv_atr_8_0= ruleARIT_ATR ) ) ( ( (lv_num_9_0= RULE_NUMERO ) ) | ( (lv_var_10_0= ruleVarCall ) ) ) )
                    // InternalGo.g:3417:4: ( (lv_atr_8_0= ruleARIT_ATR ) ) ( ( (lv_num_9_0= RULE_NUMERO ) ) | ( (lv_var_10_0= ruleVarCall ) ) )
                    {
                    // InternalGo.g:3417:4: ( (lv_atr_8_0= ruleARIT_ATR ) )
                    // InternalGo.g:3418:5: (lv_atr_8_0= ruleARIT_ATR )
                    {
                    // InternalGo.g:3418:5: (lv_atr_8_0= ruleARIT_ATR )
                    // InternalGo.g:3419:6: lv_atr_8_0= ruleARIT_ATR
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getARIT_EXPRAccess().getAtrARIT_ATRParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_atr_8_0=ruleARIT_ATR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getARIT_EXPRRule());
                      						}
                      						set(
                      							current,
                      							"atr",
                      							lv_atr_8_0,
                      							"com.ufcg.compiladores.Go.ARIT_ATR");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGo.g:3436:4: ( ( (lv_num_9_0= RULE_NUMERO ) ) | ( (lv_var_10_0= ruleVarCall ) ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_NUMERO) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==RULE_ID) ) {
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
                            // InternalGo.g:3437:5: ( (lv_num_9_0= RULE_NUMERO ) )
                            {
                            // InternalGo.g:3437:5: ( (lv_num_9_0= RULE_NUMERO ) )
                            // InternalGo.g:3438:6: (lv_num_9_0= RULE_NUMERO )
                            {
                            // InternalGo.g:3438:6: (lv_num_9_0= RULE_NUMERO )
                            // InternalGo.g:3439:7: lv_num_9_0= RULE_NUMERO
                            {
                            lv_num_9_0=(Token)match(input,RULE_NUMERO,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_num_9_0, grammarAccess.getARIT_EXPRAccess().getNumNUMEROTerminalRuleCall_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getARIT_EXPRRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"num",
                              								lv_num_9_0,
                              								"com.ufcg.compiladores.Go.NUMERO");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalGo.g:3456:5: ( (lv_var_10_0= ruleVarCall ) )
                            {
                            // InternalGo.g:3456:5: ( (lv_var_10_0= ruleVarCall ) )
                            // InternalGo.g:3457:6: (lv_var_10_0= ruleVarCall )
                            {
                            // InternalGo.g:3457:6: (lv_var_10_0= ruleVarCall )
                            // InternalGo.g:3458:7: lv_var_10_0= ruleVarCall
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getARIT_EXPRAccess().getVarVarCallParserRuleCall_2_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_var_10_0=ruleVarCall();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getARIT_EXPRRule());
                              							}
                              							set(
                              								current,
                              								"var",
                              								lv_var_10_0,
                              								"com.ufcg.compiladores.Go.VarCall");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleARIT_EXPR"


    // $ANTLR start "entryRuleIfStmt"
    // InternalGo.g:3481:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalGo.g:3481:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalGo.g:3482:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStmt; 
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
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalGo.g:3488:1: ruleIfStmt returns [EObject current=null] : ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( 'else' )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( (lv_else_2_0= ruleElseCondition ) )? ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_if_0_0 = null;

        EObject lv_elseif_1_0 = null;

        EObject lv_else_2_0 = null;



        	enterRule();

        try {
            // InternalGo.g:3494:2: ( ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( 'else' )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( (lv_else_2_0= ruleElseCondition ) )? ) )
            // InternalGo.g:3495:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( 'else' )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( (lv_else_2_0= ruleElseCondition ) )? )
            {
            // InternalGo.g:3495:2: ( ( (lv_if_0_0= ruleIfCondition ) ) ( ( 'else' )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( (lv_else_2_0= ruleElseCondition ) )? )
            // InternalGo.g:3496:3: ( (lv_if_0_0= ruleIfCondition ) ) ( ( 'else' )=> (lv_elseif_1_0= ruleElseIfCondition ) )* ( (lv_else_2_0= ruleElseCondition ) )?
            {
            // InternalGo.g:3496:3: ( (lv_if_0_0= ruleIfCondition ) )
            // InternalGo.g:3497:4: (lv_if_0_0= ruleIfCondition )
            {
            // InternalGo.g:3497:4: (lv_if_0_0= ruleIfCondition )
            // InternalGo.g:3498:5: lv_if_0_0= ruleIfCondition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStmtAccess().getIfIfConditionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_if_0_0=ruleIfCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStmtRule());
              					}
              					set(
              						current,
              						"if",
              						lv_if_0_0,
              						"com.ufcg.compiladores.Go.IfCondition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGo.g:3515:3: ( ( 'else' )=> (lv_elseif_1_0= ruleElseIfCondition ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==32) ) {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==31) && (synpred75_InternalGo())) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // InternalGo.g:3516:4: ( 'else' )=> (lv_elseif_1_0= ruleElseIfCondition )
            	    {
            	    // InternalGo.g:3517:4: (lv_elseif_1_0= ruleElseIfCondition )
            	    // InternalGo.g:3518:5: lv_elseif_1_0= ruleElseIfCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfStmtAccess().getElseifElseIfConditionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_elseif_1_0=ruleElseIfCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elseif",
            	      						lv_elseif_1_0,
            	      						"com.ufcg.compiladores.Go.ElseIfCondition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // InternalGo.g:3535:3: ( (lv_else_2_0= ruleElseCondition ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==32) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGo.g:3536:4: (lv_else_2_0= ruleElseCondition )
                    {
                    // InternalGo.g:3536:4: (lv_else_2_0= ruleElseCondition )
                    // InternalGo.g:3537:5: lv_else_2_0= ruleElseCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIfStmtAccess().getElseElseConditionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_2_0=ruleElseCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIfStmtRule());
                      					}
                      					set(
                      						current,
                      						"else",
                      						lv_else_2_0,
                      						"com.ufcg.compiladores.Go.ElseCondition");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleARIT_OP"
    // InternalGo.g:3558:1: entryRuleARIT_OP returns [String current=null] : iv_ruleARIT_OP= ruleARIT_OP EOF ;
    public final String entryRuleARIT_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARIT_OP = null;


        try {
            // InternalGo.g:3558:47: (iv_ruleARIT_OP= ruleARIT_OP EOF )
            // InternalGo.g:3559:2: iv_ruleARIT_OP= ruleARIT_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARIT_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARIT_OP=ruleARIT_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARIT_OP.getText(); 
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
    // $ANTLR end "entryRuleARIT_OP"


    // $ANTLR start "ruleARIT_OP"
    // InternalGo.g:3565:1: ruleARIT_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleARIT_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3571:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalGo.g:3572:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalGo.g:3572:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt50=1;
                }
                break;
            case 40:
                {
                alt50=2;
                }
                break;
            case 41:
                {
                alt50=3;
                }
                break;
            case 42:
                {
                alt50=4;
                }
                break;
            case 43:
                {
                alt50=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalGo.g:3573:3: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3579:3: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGo.g:3585:3: kw= '*'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGo.g:3591:3: kw= '/'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getSolidusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGo.g:3597:3: kw= '^'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_OPAccess().getCircumflexAccentKeyword_4());
                      		
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
    // $ANTLR end "ruleARIT_OP"


    // $ANTLR start "entryRuleARIT_ATR"
    // InternalGo.g:3606:1: entryRuleARIT_ATR returns [String current=null] : iv_ruleARIT_ATR= ruleARIT_ATR EOF ;
    public final String entryRuleARIT_ATR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleARIT_ATR = null;


        try {
            // InternalGo.g:3606:48: (iv_ruleARIT_ATR= ruleARIT_ATR EOF )
            // InternalGo.g:3607:2: iv_ruleARIT_ATR= ruleARIT_ATR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARIT_ATRRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleARIT_ATR=ruleARIT_ATR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARIT_ATR.getText(); 
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
    // $ANTLR end "entryRuleARIT_ATR"


    // $ANTLR start "ruleARIT_ATR"
    // InternalGo.g:3613:1: ruleARIT_ATR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken ruleARIT_ATR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGo.g:3619:2: ( (kw= '++' | kw= '--' ) )
            // InternalGo.g:3620:2: (kw= '++' | kw= '--' )
            {
            // InternalGo.g:3620:2: (kw= '++' | kw= '--' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==44) ) {
                alt51=1;
            }
            else if ( (LA51_0==45) ) {
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
                    // InternalGo.g:3621:3: kw= '++'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_ATRAccess().getPlusSignPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGo.g:3627:3: kw= '--'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getARIT_ATRAccess().getHyphenMinusHyphenMinusKeyword_1());
                      		
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
    // $ANTLR end "ruleARIT_ATR"


    // $ANTLR start "entryRuleCOMPARISON"
    // InternalGo.g:3636:1: entryRuleCOMPARISON returns [EObject current=null] : iv_ruleCOMPARISON= ruleCOMPARISON EOF ;
    public final EObject entryRuleCOMPARISON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMPARISON = null;


        try {
            // InternalGo.g:3636:51: (iv_ruleCOMPARISON= ruleCOMPARISON EOF )
            // InternalGo.g:3637:2: iv_ruleCOMPARISON= ruleCOMPARISON EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCOMPARISONRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCOMPARISON=ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCOMPARISON; 
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
    // $ANTLR end "entryRuleCOMPARISON"


    // $ANTLR start "ruleCOMPARISON"
    // InternalGo.g:3643:1: ruleCOMPARISON returns [EObject current=null] : ( ( (lv_igual_0_0= '==' ) ) | ( (lv_maiorigualque_1_0= '>=' ) ) | ( (lv_menorigualque_2_0= '<=' ) ) | ( (lv_maiorque_3_0= '>' ) ) | ( (lv_menorque_4_0= '<' ) ) ) ;
    public final EObject ruleCOMPARISON() throws RecognitionException {
        EObject current = null;

        Token lv_igual_0_0=null;
        Token lv_maiorigualque_1_0=null;
        Token lv_menorigualque_2_0=null;
        Token lv_maiorque_3_0=null;
        Token lv_menorque_4_0=null;


        	enterRule();

        try {
            // InternalGo.g:3649:2: ( ( ( (lv_igual_0_0= '==' ) ) | ( (lv_maiorigualque_1_0= '>=' ) ) | ( (lv_menorigualque_2_0= '<=' ) ) | ( (lv_maiorque_3_0= '>' ) ) | ( (lv_menorque_4_0= '<' ) ) ) )
            // InternalGo.g:3650:2: ( ( (lv_igual_0_0= '==' ) ) | ( (lv_maiorigualque_1_0= '>=' ) ) | ( (lv_menorigualque_2_0= '<=' ) ) | ( (lv_maiorque_3_0= '>' ) ) | ( (lv_menorque_4_0= '<' ) ) )
            {
            // InternalGo.g:3650:2: ( ( (lv_igual_0_0= '==' ) ) | ( (lv_maiorigualque_1_0= '>=' ) ) | ( (lv_menorigualque_2_0= '<=' ) ) | ( (lv_maiorque_3_0= '>' ) ) | ( (lv_menorque_4_0= '<' ) ) )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt52=1;
                }
                break;
            case 47:
                {
                alt52=2;
                }
                break;
            case 48:
                {
                alt52=3;
                }
                break;
            case 49:
                {
                alt52=4;
                }
                break;
            case 50:
                {
                alt52=5;
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
                    // InternalGo.g:3651:3: ( (lv_igual_0_0= '==' ) )
                    {
                    // InternalGo.g:3651:3: ( (lv_igual_0_0= '==' ) )
                    // InternalGo.g:3652:4: (lv_igual_0_0= '==' )
                    {
                    // InternalGo.g:3652:4: (lv_igual_0_0= '==' )
                    // InternalGo.g:3653:5: lv_igual_0_0= '=='
                    {
                    lv_igual_0_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_igual_0_0, grammarAccess.getCOMPARISONAccess().getIgualEqualsSignEqualsSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "igual", lv_igual_0_0, "==");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:3666:3: ( (lv_maiorigualque_1_0= '>=' ) )
                    {
                    // InternalGo.g:3666:3: ( (lv_maiorigualque_1_0= '>=' ) )
                    // InternalGo.g:3667:4: (lv_maiorigualque_1_0= '>=' )
                    {
                    // InternalGo.g:3667:4: (lv_maiorigualque_1_0= '>=' )
                    // InternalGo.g:3668:5: lv_maiorigualque_1_0= '>='
                    {
                    lv_maiorigualque_1_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_maiorigualque_1_0, grammarAccess.getCOMPARISONAccess().getMaiorigualqueGreaterThanSignEqualsSignKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "maiorigualque", lv_maiorigualque_1_0, ">=");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:3681:3: ( (lv_menorigualque_2_0= '<=' ) )
                    {
                    // InternalGo.g:3681:3: ( (lv_menorigualque_2_0= '<=' ) )
                    // InternalGo.g:3682:4: (lv_menorigualque_2_0= '<=' )
                    {
                    // InternalGo.g:3682:4: (lv_menorigualque_2_0= '<=' )
                    // InternalGo.g:3683:5: lv_menorigualque_2_0= '<='
                    {
                    lv_menorigualque_2_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_menorigualque_2_0, grammarAccess.getCOMPARISONAccess().getMenorigualqueLessThanSignEqualsSignKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "menorigualque", lv_menorigualque_2_0, "<=");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:3696:3: ( (lv_maiorque_3_0= '>' ) )
                    {
                    // InternalGo.g:3696:3: ( (lv_maiorque_3_0= '>' ) )
                    // InternalGo.g:3697:4: (lv_maiorque_3_0= '>' )
                    {
                    // InternalGo.g:3697:4: (lv_maiorque_3_0= '>' )
                    // InternalGo.g:3698:5: lv_maiorque_3_0= '>'
                    {
                    lv_maiorque_3_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_maiorque_3_0, grammarAccess.getCOMPARISONAccess().getMaiorqueGreaterThanSignKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "maiorque", lv_maiorque_3_0, ">");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:3711:3: ( (lv_menorque_4_0= '<' ) )
                    {
                    // InternalGo.g:3711:3: ( (lv_menorque_4_0= '<' ) )
                    // InternalGo.g:3712:4: (lv_menorque_4_0= '<' )
                    {
                    // InternalGo.g:3712:4: (lv_menorque_4_0= '<' )
                    // InternalGo.g:3713:5: lv_menorque_4_0= '<'
                    {
                    lv_menorque_4_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_menorque_4_0, grammarAccess.getCOMPARISONAccess().getMenorqueLessThanSignKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARISONRule());
                      					}
                      					setWithLastConsumed(current, "menorque", lv_menorque_4_0, "<");
                      				
                    }

                    }


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
    // $ANTLR end "ruleCOMPARISON"

    // $ANTLR start synpred4_InternalGo
    public final void synpred4_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:141:4: ( ( 'false' ) )
        // InternalGo.g:141:5: ( 'false' )
        {
        // InternalGo.g:141:5: ( 'false' )
        // InternalGo.g:142:5: 'false'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalGo

    // $ANTLR start synpred5_InternalGo
    public final void synpred5_InternalGo_fragment() throws RecognitionException {   
        EObject lv_var_0_0 = null;


        // InternalGo.g:177:3: ( ( (lv_var_0_0= ruleVarDecl ) ) )
        // InternalGo.g:177:3: ( (lv_var_0_0= ruleVarDecl ) )
        {
        // InternalGo.g:177:3: ( (lv_var_0_0= ruleVarDecl ) )
        // InternalGo.g:178:4: (lv_var_0_0= ruleVarDecl )
        {
        // InternalGo.g:178:4: (lv_var_0_0= ruleVarDecl )
        // InternalGo.g:179:5: lv_var_0_0= ruleVarDecl
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getGoDeclAccess().getVarVarDeclParserRuleCall_0_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_var_0_0=ruleVarDecl();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalGo

    // $ANTLR start synpred6_InternalGo
    public final void synpred6_InternalGo_fragment() throws RecognitionException {   
        EObject lv_func_1_0 = null;


        // InternalGo.g:197:3: ( ( (lv_func_1_0= ruleFunctionType ) ) )
        // InternalGo.g:197:3: ( (lv_func_1_0= ruleFunctionType ) )
        {
        // InternalGo.g:197:3: ( (lv_func_1_0= ruleFunctionType ) )
        // InternalGo.g:198:4: (lv_func_1_0= ruleFunctionType )
        {
        // InternalGo.g:198:4: (lv_func_1_0= ruleFunctionType )
        // InternalGo.g:199:5: lv_func_1_0= ruleFunctionType
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getGoDeclAccess().getFuncFunctionTypeParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_func_1_0=ruleFunctionType();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGo

    // $ANTLR start synpred20_InternalGo
    public final void synpred20_InternalGo_fragment() throws RecognitionException {   
        EObject lv_array_3_0 = null;

        EObject lv_expressao_4_0 = null;


        // InternalGo.g:886:4: ( ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) ) )
        // InternalGo.g:886:4: ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) )
        {
        // InternalGo.g:886:4: ( (lv_array_3_0= ruleArrayType ) )?
        int alt53=2;
        int LA53_0 = input.LA(1);

        if ( (LA53_0==21) ) {
            alt53=1;
        }
        switch (alt53) {
            case 1 :
                // InternalGo.g:887:5: (lv_array_3_0= ruleArrayType )
                {
                // InternalGo.g:887:5: (lv_array_3_0= ruleArrayType )
                // InternalGo.g:888:6: lv_array_3_0= ruleArrayType
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getVarDeclAccess().getArrayArrayTypeParserRuleCall_2_0_0());
                  					
                }
                pushFollow(FOLLOW_15);
                lv_array_3_0=ruleArrayType();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // InternalGo.g:905:4: ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) )
        // InternalGo.g:906:5: (lv_expressao_4_0= ruleEXPRESSAOLINHA )
        {
        // InternalGo.g:906:5: (lv_expressao_4_0= ruleEXPRESSAOLINHA )
        // InternalGo.g:907:6: lv_expressao_4_0= ruleEXPRESSAOLINHA
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getVarDeclAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_expressao_4_0=ruleEXPRESSAOLINHA();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalGo

    // $ANTLR start synpred21_InternalGo
    public final void synpred21_InternalGo_fragment() throws RecognitionException {   
        EObject lv_type_2_0 = null;


        // InternalGo.g:982:4: ( (lv_type_2_0= ruleTypes ) )
        // InternalGo.g:982:4: (lv_type_2_0= ruleTypes )
        {
        // InternalGo.g:982:4: (lv_type_2_0= ruleTypes )
        // InternalGo.g:983:5: lv_type_2_0= ruleTypes
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getSignatureDelAccess().getTypeTypesParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_type_2_0=ruleTypes();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalGo

    // $ANTLR start synpred25_InternalGo
    public final void synpred25_InternalGo_fragment() throws RecognitionException {   
        EObject lv_exp_0_0 = null;

        EObject lv_explinha_1_0 = null;


        // InternalGo.g:1326:3: ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) )
        // InternalGo.g:1326:3: ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) )
        {
        // InternalGo.g:1326:3: ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) )
        // InternalGo.g:1327:4: ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) )
        {
        // InternalGo.g:1327:4: ( (lv_exp_0_0= ruleEXPRESSAO ) )
        // InternalGo.g:1328:5: (lv_exp_0_0= ruleEXPRESSAO )
        {
        // InternalGo.g:1328:5: (lv_exp_0_0= ruleEXPRESSAO )
        // InternalGo.g:1329:6: lv_exp_0_0= ruleEXPRESSAO
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_15);
        lv_exp_0_0=ruleEXPRESSAO();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalGo.g:1346:4: ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) )
        // InternalGo.g:1347:5: (lv_explinha_1_0= ruleEXPRESSAOLINHA )
        {
        // InternalGo.g:1347:5: (lv_explinha_1_0= ruleEXPRESSAOLINHA )
        // InternalGo.g:1348:6: lv_explinha_1_0= ruleEXPRESSAOLINHA
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEXPRESSAOLINHAAccess().getExplinhaEXPRESSAOLINHAParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_explinha_1_0=ruleEXPRESSAOLINHA();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalGo

    // $ANTLR start synpred28_InternalGo
    public final void synpred28_InternalGo_fragment() throws RecognitionException {   
        EObject lv_basic_3_0 = null;


        // InternalGo.g:1457:3: ( ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) )
        // InternalGo.g:1457:3: ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) )
        {
        // InternalGo.g:1457:3: ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) )
        // InternalGo.g:1458:4: (lv_basic_3_0= ruleLITERAIS_BASICOS )
        {
        // InternalGo.g:1458:4: (lv_basic_3_0= ruleLITERAIS_BASICOS )
        // InternalGo.g:1459:5: lv_basic_3_0= ruleLITERAIS_BASICOS
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_basic_3_0=ruleLITERAIS_BASICOS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalGo

    // $ANTLR start synpred33_InternalGo
    public final void synpred33_InternalGo_fragment() throws RecognitionException {   
        EObject lv_cham_8_0 = null;


        // InternalGo.g:1557:3: ( ( (lv_cham_8_0= ruleChamada ) ) )
        // InternalGo.g:1557:3: ( (lv_cham_8_0= ruleChamada ) )
        {
        // InternalGo.g:1557:3: ( (lv_cham_8_0= ruleChamada ) )
        // InternalGo.g:1558:4: (lv_cham_8_0= ruleChamada )
        {
        // InternalGo.g:1558:4: (lv_cham_8_0= ruleChamada )
        // InternalGo.g:1559:5: lv_cham_8_0= ruleChamada
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getChamChamadaParserRuleCall_7_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_cham_8_0=ruleChamada();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33_InternalGo

    // $ANTLR start synpred45_InternalGo
    public final void synpred45_InternalGo_fragment() throws RecognitionException {   
        EObject lv_bloco_3_0 = null;


        // InternalGo.g:2162:4: ( (lv_bloco_3_0= ruleBLOCK ) )
        // InternalGo.g:2162:4: (lv_bloco_3_0= ruleBLOCK )
        {
        // InternalGo.g:2162:4: (lv_bloco_3_0= ruleBLOCK )
        // InternalGo.g:2163:5: lv_bloco_3_0= ruleBLOCK
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getFunctionTypeAccess().getBlocoBLOCKParserRuleCall_3_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_bloco_3_0=ruleBLOCK();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred45_InternalGo

    // $ANTLR start synpred75_InternalGo
    public final void synpred75_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:3516:4: ( 'else' )
        // InternalGo.g:3516:5: 'else'
        {
        match(input,32,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalGo

    // Delegated rules

    public final boolean synpred33_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\54\uffff";
    static final String dfa_2s = "\4\4\1\uffff\1\0\1\35\1\uffff\1\4\5\5\1\0\1\4\4\5\1\6\1\uffff\5\5\1\26\1\41\4\5\1\6\4\5\1\26\1\41\4\5";
    static final String dfa_3s = "\1\37\3\4\1\uffff\1\0\1\35\1\uffff\5\36\1\44\1\0\1\17\4\36\1\26\1\uffff\4\36\1\44\1\26\1\44\4\36\1\26\4\36\1\26\1\44\4\36";
    static final String dfa_4s = "\4\uffff\1\3\2\uffff\1\1\15\uffff\1\2\26\uffff";
    static final String dfa_5s = "\5\uffff\1\1\10\uffff\1\0\35\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\uffff\2\4\6\uffff\4\4\5\uffff\1\1\1\2\3\uffff\1\3\2\uffff\1\4",
            "\1\5",
            "\1\5",
            "\1\6",
            "",
            "\1\uffff",
            "\1\10",
            "",
            "\1\15\1\uffff\1\11\1\12\6\uffff\1\13\1\14\16\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\17\uffff\1\24\10\uffff\1\16\2\uffff\1\20\1\21\1\22\1\23",
            "\1\uffff",
            "\1\32\1\uffff\1\26\1\27\6\uffff\1\30\1\31",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\33\17\uffff\1\34",
            "",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\17\uffff\1\41\10\uffff\1\16\2\uffff\1\35\1\36\1\37\1\40",
            "\1\34",
            "\1\42\1\43\1\44\1\45",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\46\17\uffff\1\47",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\47",
            "\1\50\1\51\1\52\1\53",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16",
            "\1\17\30\uffff\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "176:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_func_1_0= ruleFunctionType ) ) | ( (lv_expressao_2_0= ruleEXPRESSAOLINHA ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_14 = input.LA(1);

                         
                        int index3_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index3_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalGo()) ) {s = 7;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\26\uffff";
    static final String dfa_8s = "\1\15\25\uffff";
    static final String dfa_9s = "\1\4\1\uffff\13\0\11\uffff";
    static final String dfa_10s = "\1\62\1\uffff\13\0\11\uffff";
    static final String dfa_11s = "\1\uffff\1\1\13\uffff\1\2\10\uffff";
    static final String dfa_12s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\11\uffff}>";
    static final String[] dfa_13s = {
            "\1\7\1\uffff\1\3\1\4\6\uffff\1\5\1\6\1\10\1\11\1\15\1\uffff\1\15\1\1\1\uffff\1\12\1\13\2\uffff\1\15\1\2\2\uffff\1\14\16\uffff\5\15",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "885:3: ( ( (lv_array_3_0= ruleArrayType ) )? ( (lv_expressao_4_0= ruleEXPRESSAOLINHA ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_10 = input.LA(1);

                         
                        int index14_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_11 = input.LA(1);

                         
                        int index14_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_12 = input.LA(1);

                         
                        int index14_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index14_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\1\3\11\uffff";
    static final String dfa_16s = "\1\4\1\uffff\1\6\1\uffff\1\26\1\41\4\0";
    static final String dfa_17s = "\1\62\1\uffff\1\26\1\uffff\1\26\1\44\4\0";
    static final String dfa_18s = "\1\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String dfa_19s = "\6\uffff\1\0\1\1\1\2\1\3}>";
    static final String[] dfa_20s = {
            "\1\3\1\uffff\2\3\6\uffff\5\3\1\uffff\1\3\1\2\1\uffff\6\3\2\uffff\1\3\1\uffff\4\1\11\uffff\5\3",
            "",
            "\1\4\17\uffff\1\5",
            "",
            "\1\5",
            "\1\6\1\7\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "981:3: ( (lv_type_2_0= ruleTypes ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\16\uffff";
    static final String dfa_22s = "\1\4\13\0\2\uffff";
    static final String dfa_23s = "\1\37\13\0\2\uffff";
    static final String dfa_24s = "\14\uffff\1\1\1\2";
    static final String dfa_25s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_26s = {
            "\1\6\1\uffff\1\2\1\3\6\uffff\1\4\1\5\1\7\1\10\5\uffff\1\11\1\12\3\uffff\1\1\2\uffff\1\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1325:2: ( ( ( (lv_exp_0_0= ruleEXPRESSAO ) ) ( (lv_explinha_1_0= ruleEXPRESSAOLINHA ) ) ) | ( (lv_exp_2_0= ruleEXPRESSAO ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_6 = input.LA(1);

                         
                        int index19_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_9 = input.LA(1);

                         
                        int index19_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_10 = input.LA(1);

                         
                        int index19_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_11 = input.LA(1);

                         
                        int index19_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalGo()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index19_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\62\uffff";
    static final String dfa_28s = "\6\uffff\1\15\16\uffff\1\15\34\uffff";
    static final String dfa_29s = "\1\4\1\uffff\4\45\1\4\7\uffff\1\4\1\uffff\5\5\2\4\4\5\1\6\5\5\1\26\1\41\4\5\1\6\4\5\1\26\1\41\4\5";
    static final String dfa_30s = "\1\37\1\uffff\4\53\1\62\7\uffff\1\36\1\uffff\4\36\1\44\1\62\1\17\4\36\1\26\4\36\1\44\1\26\1\44\4\36\1\26\4\36\1\26\1\44\4\36";
    static final String dfa_31s = "\1\uffff\1\1\5\uffff\1\5\1\6\1\7\1\11\1\2\1\3\1\10\1\uffff\1\4\42\uffff";
    static final String dfa_32s = "\2\uffff\1\3\1\1\1\2\1\0\54\uffff}>";
    static final String[] dfa_33s = {
            "\1\6\1\uffff\1\2\1\3\6\uffff\1\4\1\5\1\7\1\10\5\uffff\2\11\3\uffff\1\1\2\uffff\1\12",
            "",
            "\7\13",
            "\7\13",
            "\7\13",
            "\7\13",
            "\1\15\1\uffff\2\15\6\uffff\5\15\1\uffff\1\15\1\17\1\uffff\2\15\2\17\2\15\1\16\1\uffff\1\15\5\uffff\7\13\2\uffff\5\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\uffff\1\20\1\21\6\uffff\1\22\1\23\16\uffff\1\25",
            "",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\17\uffff\1\33\10\uffff\1\25\2\uffff\1\27\1\30\1\31\1\32",
            "\1\15\1\uffff\2\15\6\uffff\5\15\1\uffff\1\15\2\uffff\2\15\2\uffff\2\15\2\uffff\1\15\5\uffff\7\13\2\uffff\5\15",
            "\1\40\1\uffff\1\34\1\35\6\uffff\1\36\1\37",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\41\17\uffff\1\42",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\17\uffff\1\47\10\uffff\1\25\2\uffff\1\43\1\44\1\45\1\46",
            "\1\42",
            "\1\50\1\51\1\52\1\53",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\54\17\uffff\1\55",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\55",
            "\1\56\1\57\1\60\1\61",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25",
            "\1\26\30\uffff\1\25"
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "1404:2: ( ( () ( (lv_declFunction_1_0= ruleFunctionType ) ) ) | ( (lv_binary_exp_2_0= ruleBINARY_EXP ) ) | ( (lv_basic_3_0= ruleLITERAIS_BASICOS ) ) | ( (lv_assignment_4_0= ruleAssignment ) ) | ( (lv_for_5_0= ruleForDecl ) ) | ( (lv_arrayValue_6_0= ruleArrayValue ) ) | ( (lv_variaveis_7_0= ruleVarDecl ) ) | ( (lv_cham_8_0= ruleChamada ) ) | ( (lv_if_9_0= ruleIfStmt ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA20_5>=37 && LA20_5<=43)) ) {s = 11;}

                        else if ( (synpred28_InternalGo()) ) {s = 12;}

                        else if ( (synpred33_InternalGo()) ) {s = 13;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA20_3>=37 && LA20_3<=43)) ) {s = 11;}

                        else if ( (synpred28_InternalGo()) ) {s = 12;}

                        else if ( (synpred33_InternalGo()) ) {s = 13;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA20_4>=37 && LA20_4<=43)) ) {s = 11;}

                        else if ( (synpred28_InternalGo()) ) {s = 12;}

                        else if ( (synpred33_InternalGo()) ) {s = 13;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA20_2>=37 && LA20_2<=43)) ) {s = 11;}

                        else if ( (synpred28_InternalGo()) ) {s = 12;}

                        else if ( (synpred33_InternalGo()) ) {s = 13;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\1\2\25\uffff";
    static final String dfa_35s = "\1\4\1\0\24\uffff";
    static final String dfa_36s = "\1\62\1\0\24\uffff";
    static final String dfa_37s = "\2\uffff\1\2\22\uffff\1\1";
    static final String dfa_38s = "\1\uffff\1\0\24\uffff}>";
    static final String[] dfa_39s = {
            "\1\2\1\uffff\2\2\6\uffff\3\2\1\1\1\2\1\uffff\1\2\2\uffff\2\2\2\uffff\2\2\2\uffff\1\2\16\uffff\5\2",
            "\1\uffff",
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
            ""
    };
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_7;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "2161:3: ( (lv_bloco_3_0= ruleBLOCK ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalGo()) ) {s = 21;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000009183C0D2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001900010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000009187C0D0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C0D0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000009193C0D0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000300000000052L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000009183C0D0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000097A3C0D0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000091A3C0D0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001E00200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000000C0D2L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000C0C0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000FE000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000004000C0D0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000009987C0D0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000300000000050L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000002L});

}