package com.ufcg.compiler.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.ufcg.compiler.services.GoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMERO", "RULE_STRING_DECL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'^'", "'for'", "'{'", "'}'", "';'", "','", "'['", "']'", "'func'", "'&'", "'||'", "'true'", "'false'", "'var'", "'const'", "'='", "':='", "'string'", "'int'", "'float'", "'bool'", "'=='", "'>='", "'<='", "'>'", "'<'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_NUMERO=5;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_STRING_DECL=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
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


    	private GoGrammarAccess grammarAccess;

    	public void setGrammarAccess(GoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInit"
    // InternalGo.g:54:1: entryRuleInit : ruleInit EOF ;
    public final void entryRuleInit() throws RecognitionException {
        try {
            // InternalGo.g:55:1: ( ruleInit EOF )
            // InternalGo.g:56:1: ruleInit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalGo.g:63:1: ruleInit : ( ( rule__Init__ElementsAssignment )* ) ;
    public final void ruleInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:67:2: ( ( ( rule__Init__ElementsAssignment )* ) )
            // InternalGo.g:68:2: ( ( rule__Init__ElementsAssignment )* )
            {
            // InternalGo.g:68:2: ( ( rule__Init__ElementsAssignment )* )
            // InternalGo.g:69:3: ( rule__Init__ElementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitAccess().getElementsAssignment()); 
            }
            // InternalGo.g:70:3: ( rule__Init__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING_DECL)||(LA1_0>=20 && LA1_0<=21)||LA1_0==27||(LA1_0>=30 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGo.g:70:4: rule__Init__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Init__ElementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitAccess().getElementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleBOOL_OP"
    // InternalGo.g:79:1: entryRuleBOOL_OP : ruleBOOL_OP EOF ;
    public final void entryRuleBOOL_OP() throws RecognitionException {
        try {
            // InternalGo.g:80:1: ( ruleBOOL_OP EOF )
            // InternalGo.g:81:1: ruleBOOL_OP EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOL_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBOOL_OP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOL_OPRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOL_OP"


    // $ANTLR start "ruleBOOL_OP"
    // InternalGo.g:88:1: ruleBOOL_OP : ( ( rule__BOOL_OP__Alternatives ) ) ;
    public final void ruleBOOL_OP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:92:2: ( ( ( rule__BOOL_OP__Alternatives ) ) )
            // InternalGo.g:93:2: ( ( rule__BOOL_OP__Alternatives ) )
            {
            // InternalGo.g:93:2: ( ( rule__BOOL_OP__Alternatives ) )
            // InternalGo.g:94:3: ( rule__BOOL_OP__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOL_OPAccess().getAlternatives()); 
            }
            // InternalGo.g:95:3: ( rule__BOOL_OP__Alternatives )
            // InternalGo.g:95:4: rule__BOOL_OP__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOL_OP__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOL_OPAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOL_OP"


    // $ANTLR start "entryRuleBOOLEAN_VALUE"
    // InternalGo.g:104:1: entryRuleBOOLEAN_VALUE : ruleBOOLEAN_VALUE EOF ;
    public final void entryRuleBOOLEAN_VALUE() throws RecognitionException {
        try {
            // InternalGo.g:105:1: ( ruleBOOLEAN_VALUE EOF )
            // InternalGo.g:106:1: ruleBOOLEAN_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEAN_VALUERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBOOLEAN_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEAN_VALUERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOLEAN_VALUE"


    // $ANTLR start "ruleBOOLEAN_VALUE"
    // InternalGo.g:113:1: ruleBOOLEAN_VALUE : ( ( rule__BOOLEAN_VALUE__Alternatives ) ) ;
    public final void ruleBOOLEAN_VALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:117:2: ( ( ( rule__BOOLEAN_VALUE__Alternatives ) ) )
            // InternalGo.g:118:2: ( ( rule__BOOLEAN_VALUE__Alternatives ) )
            {
            // InternalGo.g:118:2: ( ( rule__BOOLEAN_VALUE__Alternatives ) )
            // InternalGo.g:119:3: ( rule__BOOLEAN_VALUE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEAN_VALUEAccess().getAlternatives()); 
            }
            // InternalGo.g:120:3: ( rule__BOOLEAN_VALUE__Alternatives )
            // InternalGo.g:120:4: rule__BOOLEAN_VALUE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOLEAN_VALUE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEAN_VALUEAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN_VALUE"


    // $ANTLR start "entryRuleGoDecl"
    // InternalGo.g:129:1: entryRuleGoDecl : ruleGoDecl EOF ;
    public final void entryRuleGoDecl() throws RecognitionException {
        try {
            // InternalGo.g:130:1: ( ruleGoDecl EOF )
            // InternalGo.g:131:1: ruleGoDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGoDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoDecl"


    // $ANTLR start "ruleGoDecl"
    // InternalGo.g:138:1: ruleGoDecl : ( ( rule__GoDecl__Alternatives ) ) ;
    public final void ruleGoDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:142:2: ( ( ( rule__GoDecl__Alternatives ) ) )
            // InternalGo.g:143:2: ( ( rule__GoDecl__Alternatives ) )
            {
            // InternalGo.g:143:2: ( ( rule__GoDecl__Alternatives ) )
            // InternalGo.g:144:3: ( rule__GoDecl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoDeclAccess().getAlternatives()); 
            }
            // InternalGo.g:145:3: ( rule__GoDecl__Alternatives )
            // InternalGo.g:145:4: rule__GoDecl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GoDecl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoDeclAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoDecl"


    // $ANTLR start "entryRuleForDecl"
    // InternalGo.g:154:1: entryRuleForDecl : ruleForDecl EOF ;
    public final void entryRuleForDecl() throws RecognitionException {
        try {
            // InternalGo.g:155:1: ( ruleForDecl EOF )
            // InternalGo.g:156:1: ruleForDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForDecl"


    // $ANTLR start "ruleForDecl"
    // InternalGo.g:163:1: ruleForDecl : ( ( rule__ForDecl__Group__0 ) ) ;
    public final void ruleForDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:167:2: ( ( ( rule__ForDecl__Group__0 ) ) )
            // InternalGo.g:168:2: ( ( rule__ForDecl__Group__0 ) )
            {
            // InternalGo.g:168:2: ( ( rule__ForDecl__Group__0 ) )
            // InternalGo.g:169:3: ( rule__ForDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForDeclAccess().getGroup()); 
            }
            // InternalGo.g:170:3: ( rule__ForDecl__Group__0 )
            // InternalGo.g:170:4: rule__ForDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForDecl"


    // $ANTLR start "entryRuleForClause"
    // InternalGo.g:179:1: entryRuleForClause : ruleForClause EOF ;
    public final void entryRuleForClause() throws RecognitionException {
        try {
            // InternalGo.g:180:1: ( ruleForClause EOF )
            // InternalGo.g:181:1: ruleForClause EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForClause();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForClause"


    // $ANTLR start "ruleForClause"
    // InternalGo.g:188:1: ruleForClause : ( ( rule__ForClause__Group__0 ) ) ;
    public final void ruleForClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:192:2: ( ( ( rule__ForClause__Group__0 ) ) )
            // InternalGo.g:193:2: ( ( rule__ForClause__Group__0 ) )
            {
            // InternalGo.g:193:2: ( ( rule__ForClause__Group__0 ) )
            // InternalGo.g:194:3: ( rule__ForClause__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getGroup()); 
            }
            // InternalGo.g:195:3: ( rule__ForClause__Group__0 )
            // InternalGo.g:195:4: rule__ForClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForClause__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForClause"


    // $ANTLR start "entryRuleInitStmt"
    // InternalGo.g:204:1: entryRuleInitStmt : ruleInitStmt EOF ;
    public final void entryRuleInitStmt() throws RecognitionException {
        try {
            // InternalGo.g:205:1: ( ruleInitStmt EOF )
            // InternalGo.g:206:1: ruleInitStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInitStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitStmtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitStmt"


    // $ANTLR start "ruleInitStmt"
    // InternalGo.g:213:1: ruleInitStmt : ( ( rule__InitStmt__DeclAssignment ) ) ;
    public final void ruleInitStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:217:2: ( ( ( rule__InitStmt__DeclAssignment ) ) )
            // InternalGo.g:218:2: ( ( rule__InitStmt__DeclAssignment ) )
            {
            // InternalGo.g:218:2: ( ( rule__InitStmt__DeclAssignment ) )
            // InternalGo.g:219:3: ( rule__InitStmt__DeclAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitStmtAccess().getDeclAssignment()); 
            }
            // InternalGo.g:220:3: ( rule__InitStmt__DeclAssignment )
            // InternalGo.g:220:4: rule__InitStmt__DeclAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InitStmt__DeclAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitStmtAccess().getDeclAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitStmt"


    // $ANTLR start "entryRulePostStmt"
    // InternalGo.g:229:1: entryRulePostStmt : rulePostStmt EOF ;
    public final void entryRulePostStmt() throws RecognitionException {
        try {
            // InternalGo.g:230:1: ( rulePostStmt EOF )
            // InternalGo.g:231:1: rulePostStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePostStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostStmtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePostStmt"


    // $ANTLR start "rulePostStmt"
    // InternalGo.g:238:1: rulePostStmt : ( ( rule__PostStmt__DeclAssignment ) ) ;
    public final void rulePostStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:242:2: ( ( ( rule__PostStmt__DeclAssignment ) ) )
            // InternalGo.g:243:2: ( ( rule__PostStmt__DeclAssignment ) )
            {
            // InternalGo.g:243:2: ( ( rule__PostStmt__DeclAssignment ) )
            // InternalGo.g:244:3: ( rule__PostStmt__DeclAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostStmtAccess().getDeclAssignment()); 
            }
            // InternalGo.g:245:3: ( rule__PostStmt__DeclAssignment )
            // InternalGo.g:245:4: rule__PostStmt__DeclAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PostStmt__DeclAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostStmtAccess().getDeclAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePostStmt"


    // $ANTLR start "entryRuleCondition"
    // InternalGo.g:254:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGo.g:255:1: ( ruleCondition EOF )
            // InternalGo.g:256:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGo.g:263:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:267:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGo.g:268:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGo.g:268:2: ( ( rule__Condition__Group__0 ) )
            // InternalGo.g:269:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalGo.g:270:3: ( rule__Condition__Group__0 )
            // InternalGo.g:270:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIDList"
    // InternalGo.g:279:1: entryRuleIDList : ruleIDList EOF ;
    public final void entryRuleIDList() throws RecognitionException {
        try {
            // InternalGo.g:280:1: ( ruleIDList EOF )
            // InternalGo.g:281:1: ruleIDList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIDList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIDList"


    // $ANTLR start "ruleIDList"
    // InternalGo.g:288:1: ruleIDList : ( ( rule__IDList__Alternatives ) ) ;
    public final void ruleIDList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:292:2: ( ( ( rule__IDList__Alternatives ) ) )
            // InternalGo.g:293:2: ( ( rule__IDList__Alternatives ) )
            {
            // InternalGo.g:293:2: ( ( rule__IDList__Alternatives ) )
            // InternalGo.g:294:3: ( rule__IDList__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDListAccess().getAlternatives()); 
            }
            // InternalGo.g:295:3: ( rule__IDList__Alternatives )
            // InternalGo.g:295:4: rule__IDList__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IDList__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDListAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDList"


    // $ANTLR start "entryRuleVarDecl"
    // InternalGo.g:304:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // InternalGo.g:305:1: ( ruleVarDecl EOF )
            // InternalGo.g:306:1: ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalGo.g:313:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:317:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // InternalGo.g:318:2: ( ( rule__VarDecl__Group__0 ) )
            {
            // InternalGo.g:318:2: ( ( rule__VarDecl__Group__0 ) )
            // InternalGo.g:319:3: ( rule__VarDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getGroup()); 
            }
            // InternalGo.g:320:3: ( rule__VarDecl__Group__0 )
            // InternalGo.g:320:4: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleSignatureDel"
    // InternalGo.g:329:1: entryRuleSignatureDel : ruleSignatureDel EOF ;
    public final void entryRuleSignatureDel() throws RecognitionException {
        try {
            // InternalGo.g:330:1: ( ruleSignatureDel EOF )
            // InternalGo.g:331:1: ruleSignatureDel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureDelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSignatureDel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureDelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignatureDel"


    // $ANTLR start "ruleSignatureDel"
    // InternalGo.g:338:1: ruleSignatureDel : ( ( rule__SignatureDel__Group__0 ) ) ;
    public final void ruleSignatureDel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:342:2: ( ( ( rule__SignatureDel__Group__0 ) ) )
            // InternalGo.g:343:2: ( ( rule__SignatureDel__Group__0 ) )
            {
            // InternalGo.g:343:2: ( ( rule__SignatureDel__Group__0 ) )
            // InternalGo.g:344:3: ( rule__SignatureDel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureDelAccess().getGroup()); 
            }
            // InternalGo.g:345:3: ( rule__SignatureDel__Group__0 )
            // InternalGo.g:345:4: rule__SignatureDel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SignatureDel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureDelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignatureDel"


    // $ANTLR start "entryRuleAssignment"
    // InternalGo.g:354:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalGo.g:355:1: ( ruleAssignment EOF )
            // InternalGo.g:356:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalGo.g:363:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:367:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalGo.g:368:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalGo.g:368:2: ( ( rule__Assignment__Group__0 ) )
            // InternalGo.g:369:3: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalGo.g:370:3: ( rule__Assignment__Group__0 )
            // InternalGo.g:370:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleTIPO"
    // InternalGo.g:379:1: entryRuleTIPO : ruleTIPO EOF ;
    public final void entryRuleTIPO() throws RecognitionException {
        try {
            // InternalGo.g:380:1: ( ruleTIPO EOF )
            // InternalGo.g:381:1: ruleTIPO EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTIPORule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTIPO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTIPORule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTIPO"


    // $ANTLR start "ruleTIPO"
    // InternalGo.g:388:1: ruleTIPO : ( ( rule__TIPO__Alternatives ) ) ;
    public final void ruleTIPO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:392:2: ( ( ( rule__TIPO__Alternatives ) ) )
            // InternalGo.g:393:2: ( ( rule__TIPO__Alternatives ) )
            {
            // InternalGo.g:393:2: ( ( rule__TIPO__Alternatives ) )
            // InternalGo.g:394:3: ( rule__TIPO__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTIPOAccess().getAlternatives()); 
            }
            // InternalGo.g:395:3: ( rule__TIPO__Alternatives )
            // InternalGo.g:395:4: rule__TIPO__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TIPO__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTIPOAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTIPO"


    // $ANTLR start "entryRuleVar"
    // InternalGo.g:404:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalGo.g:405:1: ( ruleVar EOF )
            // InternalGo.g:406:1: ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalGo.g:413:1: ruleVar : ( ( rule__Var__VarAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:417:2: ( ( ( rule__Var__VarAssignment ) ) )
            // InternalGo.g:418:2: ( ( rule__Var__VarAssignment ) )
            {
            // InternalGo.g:418:2: ( ( rule__Var__VarAssignment ) )
            // InternalGo.g:419:3: ( rule__Var__VarAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVarAssignment()); 
            }
            // InternalGo.g:420:3: ( rule__Var__VarAssignment )
            // InternalGo.g:420:4: rule__Var__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Var__VarAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVarAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleConst"
    // InternalGo.g:429:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // InternalGo.g:430:1: ( ruleConst EOF )
            // InternalGo.g:431:1: ruleConst EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // InternalGo.g:438:1: ruleConst : ( ( rule__Const__ConstAssignment ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:442:2: ( ( ( rule__Const__ConstAssignment ) ) )
            // InternalGo.g:443:2: ( ( rule__Const__ConstAssignment ) )
            {
            // InternalGo.g:443:2: ( ( rule__Const__ConstAssignment ) )
            // InternalGo.g:444:3: ( rule__Const__ConstAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstAccess().getConstAssignment()); 
            }
            // InternalGo.g:445:3: ( rule__Const__ConstAssignment )
            // InternalGo.g:445:4: rule__Const__ConstAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Const__ConstAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstAccess().getConstAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleIGUAL"
    // InternalGo.g:454:1: entryRuleIGUAL : ruleIGUAL EOF ;
    public final void entryRuleIGUAL() throws RecognitionException {
        try {
            // InternalGo.g:455:1: ( ruleIGUAL EOF )
            // InternalGo.g:456:1: ruleIGUAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIGUALRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIGUAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIGUALRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIGUAL"


    // $ANTLR start "ruleIGUAL"
    // InternalGo.g:463:1: ruleIGUAL : ( ( rule__IGUAL__IgualAssignment ) ) ;
    public final void ruleIGUAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:467:2: ( ( ( rule__IGUAL__IgualAssignment ) ) )
            // InternalGo.g:468:2: ( ( rule__IGUAL__IgualAssignment ) )
            {
            // InternalGo.g:468:2: ( ( rule__IGUAL__IgualAssignment ) )
            // InternalGo.g:469:3: ( rule__IGUAL__IgualAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIGUALAccess().getIgualAssignment()); 
            }
            // InternalGo.g:470:3: ( rule__IGUAL__IgualAssignment )
            // InternalGo.g:470:4: rule__IGUAL__IgualAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IGUAL__IgualAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIGUALAccess().getIgualAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIGUAL"


    // $ANTLR start "entryRulePONTOSIGUAL"
    // InternalGo.g:479:1: entryRulePONTOSIGUAL : rulePONTOSIGUAL EOF ;
    public final void entryRulePONTOSIGUAL() throws RecognitionException {
        try {
            // InternalGo.g:480:1: ( rulePONTOSIGUAL EOF )
            // InternalGo.g:481:1: rulePONTOSIGUAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPONTOSIGUALRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePONTOSIGUAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPONTOSIGUALRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePONTOSIGUAL"


    // $ANTLR start "rulePONTOSIGUAL"
    // InternalGo.g:488:1: rulePONTOSIGUAL : ( ( rule__PONTOSIGUAL__OpAssignment ) ) ;
    public final void rulePONTOSIGUAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:492:2: ( ( ( rule__PONTOSIGUAL__OpAssignment ) ) )
            // InternalGo.g:493:2: ( ( rule__PONTOSIGUAL__OpAssignment ) )
            {
            // InternalGo.g:493:2: ( ( rule__PONTOSIGUAL__OpAssignment ) )
            // InternalGo.g:494:3: ( rule__PONTOSIGUAL__OpAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPONTOSIGUALAccess().getOpAssignment()); 
            }
            // InternalGo.g:495:3: ( rule__PONTOSIGUAL__OpAssignment )
            // InternalGo.g:495:4: rule__PONTOSIGUAL__OpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PONTOSIGUAL__OpAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPONTOSIGUALAccess().getOpAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePONTOSIGUAL"


    // $ANTLR start "entryRuleEXPRESSAOLINHA"
    // InternalGo.g:504:1: entryRuleEXPRESSAOLINHA : ruleEXPRESSAOLINHA EOF ;
    public final void entryRuleEXPRESSAOLINHA() throws RecognitionException {
        try {
            // InternalGo.g:505:1: ( ruleEXPRESSAOLINHA EOF )
            // InternalGo.g:506:1: ruleEXPRESSAOLINHA EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOLINHARule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOLINHARule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPRESSAOLINHA"


    // $ANTLR start "ruleEXPRESSAOLINHA"
    // InternalGo.g:513:1: ruleEXPRESSAOLINHA : ( ( rule__EXPRESSAOLINHA__Alternatives ) ) ;
    public final void ruleEXPRESSAOLINHA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:517:2: ( ( ( rule__EXPRESSAOLINHA__Alternatives ) ) )
            // InternalGo.g:518:2: ( ( rule__EXPRESSAOLINHA__Alternatives ) )
            {
            // InternalGo.g:518:2: ( ( rule__EXPRESSAOLINHA__Alternatives ) )
            // InternalGo.g:519:3: ( rule__EXPRESSAOLINHA__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOLINHAAccess().getAlternatives()); 
            }
            // InternalGo.g:520:3: ( rule__EXPRESSAOLINHA__Alternatives )
            // InternalGo.g:520:4: rule__EXPRESSAOLINHA__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSAOLINHA__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOLINHAAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPRESSAOLINHA"


    // $ANTLR start "entryRuleEXPRESSAO"
    // InternalGo.g:529:1: entryRuleEXPRESSAO : ruleEXPRESSAO EOF ;
    public final void entryRuleEXPRESSAO() throws RecognitionException {
        try {
            // InternalGo.g:530:1: ( ruleEXPRESSAO EOF )
            // InternalGo.g:531:1: ruleEXPRESSAO EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAORule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAORule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPRESSAO"


    // $ANTLR start "ruleEXPRESSAO"
    // InternalGo.g:538:1: ruleEXPRESSAO : ( ( rule__EXPRESSAO__Alternatives ) ) ;
    public final void ruleEXPRESSAO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:542:2: ( ( ( rule__EXPRESSAO__Alternatives ) ) )
            // InternalGo.g:543:2: ( ( rule__EXPRESSAO__Alternatives ) )
            {
            // InternalGo.g:543:2: ( ( rule__EXPRESSAO__Alternatives ) )
            // InternalGo.g:544:3: ( rule__EXPRESSAO__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getAlternatives()); 
            }
            // InternalGo.g:545:3: ( rule__EXPRESSAO__Alternatives )
            // InternalGo.g:545:4: rule__EXPRESSAO__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSAO__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPRESSAO"


    // $ANTLR start "entryRuleArrayValue"
    // InternalGo.g:554:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalGo.g:555:1: ( ruleArrayValue EOF )
            // InternalGo.g:556:1: ruleArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalGo.g:563:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:567:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalGo.g:568:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalGo.g:568:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalGo.g:569:3: ( rule__ArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup()); 
            }
            // InternalGo.g:570:3: ( rule__ArrayValue__Group__0 )
            // InternalGo.g:570:4: rule__ArrayValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleLiteraisList"
    // InternalGo.g:579:1: entryRuleLiteraisList : ruleLiteraisList EOF ;
    public final void entryRuleLiteraisList() throws RecognitionException {
        try {
            // InternalGo.g:580:1: ( ruleLiteraisList EOF )
            // InternalGo.g:581:1: ruleLiteraisList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteraisListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteraisList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteraisListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteraisList"


    // $ANTLR start "ruleLiteraisList"
    // InternalGo.g:588:1: ruleLiteraisList : ( ( rule__LiteraisList__Alternatives ) ) ;
    public final void ruleLiteraisList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:592:2: ( ( ( rule__LiteraisList__Alternatives ) ) )
            // InternalGo.g:593:2: ( ( rule__LiteraisList__Alternatives ) )
            {
            // InternalGo.g:593:2: ( ( rule__LiteraisList__Alternatives ) )
            // InternalGo.g:594:3: ( rule__LiteraisList__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteraisListAccess().getAlternatives()); 
            }
            // InternalGo.g:595:3: ( rule__LiteraisList__Alternatives )
            // InternalGo.g:595:4: rule__LiteraisList__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteraisList__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteraisListAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteraisList"


    // $ANTLR start "entryRuleLITERAIS_BASICOS"
    // InternalGo.g:604:1: entryRuleLITERAIS_BASICOS : ruleLITERAIS_BASICOS EOF ;
    public final void entryRuleLITERAIS_BASICOS() throws RecognitionException {
        try {
            // InternalGo.g:605:1: ( ruleLITERAIS_BASICOS EOF )
            // InternalGo.g:606:1: ruleLITERAIS_BASICOS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLITERAIS_BASICOSRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLITERAIS_BASICOS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLITERAIS_BASICOSRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLITERAIS_BASICOS"


    // $ANTLR start "ruleLITERAIS_BASICOS"
    // InternalGo.g:613:1: ruleLITERAIS_BASICOS : ( ( rule__LITERAIS_BASICOS__Alternatives ) ) ;
    public final void ruleLITERAIS_BASICOS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:617:2: ( ( ( rule__LITERAIS_BASICOS__Alternatives ) ) )
            // InternalGo.g:618:2: ( ( rule__LITERAIS_BASICOS__Alternatives ) )
            {
            // InternalGo.g:618:2: ( ( rule__LITERAIS_BASICOS__Alternatives ) )
            // InternalGo.g:619:3: ( rule__LITERAIS_BASICOS__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLITERAIS_BASICOSAccess().getAlternatives()); 
            }
            // InternalGo.g:620:3: ( rule__LITERAIS_BASICOS__Alternatives )
            // InternalGo.g:620:4: rule__LITERAIS_BASICOS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LITERAIS_BASICOS__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLITERAIS_BASICOSAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLITERAIS_BASICOS"


    // $ANTLR start "entryRuleBINARY_EXP"
    // InternalGo.g:629:1: entryRuleBINARY_EXP : ruleBINARY_EXP EOF ;
    public final void entryRuleBINARY_EXP() throws RecognitionException {
        try {
            // InternalGo.g:630:1: ( ruleBINARY_EXP EOF )
            // InternalGo.g:631:1: ruleBINARY_EXP EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBINARY_EXP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBINARY_EXP"


    // $ANTLR start "ruleBINARY_EXP"
    // InternalGo.g:638:1: ruleBINARY_EXP : ( ( rule__BINARY_EXP__Alternatives ) ) ;
    public final void ruleBINARY_EXP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:642:2: ( ( ( rule__BINARY_EXP__Alternatives ) ) )
            // InternalGo.g:643:2: ( ( rule__BINARY_EXP__Alternatives ) )
            {
            // InternalGo.g:643:2: ( ( rule__BINARY_EXP__Alternatives ) )
            // InternalGo.g:644:3: ( rule__BINARY_EXP__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPAccess().getAlternatives()); 
            }
            // InternalGo.g:645:3: ( rule__BINARY_EXP__Alternatives )
            // InternalGo.g:645:4: rule__BINARY_EXP__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BINARY_EXP__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBINARY_EXP"


    // $ANTLR start "entryRuleFunctionType"
    // InternalGo.g:654:1: entryRuleFunctionType : ruleFunctionType EOF ;
    public final void entryRuleFunctionType() throws RecognitionException {
        try {
            // InternalGo.g:655:1: ( ruleFunctionType EOF )
            // InternalGo.g:656:1: ruleFunctionType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunctionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // InternalGo.g:663:1: ruleFunctionType : ( ( rule__FunctionType__Group__0 ) ) ;
    public final void ruleFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:667:2: ( ( ( rule__FunctionType__Group__0 ) ) )
            // InternalGo.g:668:2: ( ( rule__FunctionType__Group__0 ) )
            {
            // InternalGo.g:668:2: ( ( rule__FunctionType__Group__0 ) )
            // InternalGo.g:669:3: ( rule__FunctionType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionTypeAccess().getGroup()); 
            }
            // InternalGo.g:670:3: ( rule__FunctionType__Group__0 )
            // InternalGo.g:670:4: rule__FunctionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleSignature"
    // InternalGo.g:679:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalGo.g:680:1: ( ruleSignature EOF )
            // InternalGo.g:681:1: ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalGo.g:688:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:692:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalGo.g:693:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalGo.g:693:2: ( ( rule__Signature__Group__0 ) )
            // InternalGo.g:694:3: ( rule__Signature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup()); 
            }
            // InternalGo.g:695:3: ( rule__Signature__Group__0 )
            // InternalGo.g:695:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleResult"
    // InternalGo.g:704:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalGo.g:705:1: ( ruleResult EOF )
            // InternalGo.g:706:1: ruleResult EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleResult();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalGo.g:713:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:717:2: ( ( ( rule__Result__Alternatives ) ) )
            // InternalGo.g:718:2: ( ( rule__Result__Alternatives ) )
            {
            // InternalGo.g:718:2: ( ( rule__Result__Alternatives ) )
            // InternalGo.g:719:3: ( rule__Result__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultAccess().getAlternatives()); 
            }
            // InternalGo.g:720:3: ( rule__Result__Alternatives )
            // InternalGo.g:720:4: rule__Result__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Result__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParameters"
    // InternalGo.g:729:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // InternalGo.g:730:1: ( ruleParameters EOF )
            // InternalGo.g:731:1: ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalGo.g:738:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:742:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // InternalGo.g:743:2: ( ( rule__Parameters__Group__0 ) )
            {
            // InternalGo.g:743:2: ( ( rule__Parameters__Group__0 ) )
            // InternalGo.g:744:3: ( rule__Parameters__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getGroup()); 
            }
            // InternalGo.g:745:3: ( rule__Parameters__Group__0 )
            // InternalGo.g:745:4: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleABRE_PARENTESES"
    // InternalGo.g:754:1: entryRuleABRE_PARENTESES : ruleABRE_PARENTESES EOF ;
    public final void entryRuleABRE_PARENTESES() throws RecognitionException {
        try {
            // InternalGo.g:755:1: ( ruleABRE_PARENTESES EOF )
            // InternalGo.g:756:1: ruleABRE_PARENTESES EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getABRE_PARENTESESRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleABRE_PARENTESES();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getABRE_PARENTESESRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleABRE_PARENTESES"


    // $ANTLR start "ruleABRE_PARENTESES"
    // InternalGo.g:763:1: ruleABRE_PARENTESES : ( '(' ) ;
    public final void ruleABRE_PARENTESES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:767:2: ( ( '(' ) )
            // InternalGo.g:768:2: ( '(' )
            {
            // InternalGo.g:768:2: ( '(' )
            // InternalGo.g:769:3: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getABRE_PARENTESESAccess().getLeftParenthesisKeyword()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getABRE_PARENTESESAccess().getLeftParenthesisKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleABRE_PARENTESES"


    // $ANTLR start "entryRuleFECHA_PARENTESES"
    // InternalGo.g:779:1: entryRuleFECHA_PARENTESES : ruleFECHA_PARENTESES EOF ;
    public final void entryRuleFECHA_PARENTESES() throws RecognitionException {
        try {
            // InternalGo.g:780:1: ( ruleFECHA_PARENTESES EOF )
            // InternalGo.g:781:1: ruleFECHA_PARENTESES EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFECHA_PARENTESESRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFECHA_PARENTESES();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFECHA_PARENTESESRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFECHA_PARENTESES"


    // $ANTLR start "ruleFECHA_PARENTESES"
    // InternalGo.g:788:1: ruleFECHA_PARENTESES : ( ')' ) ;
    public final void ruleFECHA_PARENTESES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:792:2: ( ( ')' ) )
            // InternalGo.g:793:2: ( ')' )
            {
            // InternalGo.g:793:2: ( ')' )
            // InternalGo.g:794:3: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFECHA_PARENTESESAccess().getRightParenthesisKeyword()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFECHA_PARENTESESAccess().getRightParenthesisKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFECHA_PARENTESES"


    // $ANTLR start "entryRuleBLOCK"
    // InternalGo.g:804:1: entryRuleBLOCK : ruleBLOCK EOF ;
    public final void entryRuleBLOCK() throws RecognitionException {
        try {
            // InternalGo.g:805:1: ( ruleBLOCK EOF )
            // InternalGo.g:806:1: ruleBLOCK EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBLOCKRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBLOCK();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBLOCKRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBLOCK"


    // $ANTLR start "ruleBLOCK"
    // InternalGo.g:813:1: ruleBLOCK : ( ( rule__BLOCK__Group__0 ) ) ;
    public final void ruleBLOCK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:817:2: ( ( ( rule__BLOCK__Group__0 ) ) )
            // InternalGo.g:818:2: ( ( rule__BLOCK__Group__0 ) )
            {
            // InternalGo.g:818:2: ( ( rule__BLOCK__Group__0 ) )
            // InternalGo.g:819:3: ( rule__BLOCK__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBLOCKAccess().getGroup()); 
            }
            // InternalGo.g:820:3: ( rule__BLOCK__Group__0 )
            // InternalGo.g:820:4: rule__BLOCK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BLOCK__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBLOCKAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBLOCK"


    // $ANTLR start "entryRulePARAMETERS_LIST"
    // InternalGo.g:829:1: entryRulePARAMETERS_LIST : rulePARAMETERS_LIST EOF ;
    public final void entryRulePARAMETERS_LIST() throws RecognitionException {
        try {
            // InternalGo.g:830:1: ( rulePARAMETERS_LIST EOF )
            // InternalGo.g:831:1: rulePARAMETERS_LIST EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERS_LISTRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePARAMETERS_LIST();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERS_LISTRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePARAMETERS_LIST"


    // $ANTLR start "rulePARAMETERS_LIST"
    // InternalGo.g:838:1: rulePARAMETERS_LIST : ( ( rule__PARAMETERS_LIST__Group__0 ) ) ;
    public final void rulePARAMETERS_LIST() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:842:2: ( ( ( rule__PARAMETERS_LIST__Group__0 ) ) )
            // InternalGo.g:843:2: ( ( rule__PARAMETERS_LIST__Group__0 ) )
            {
            // InternalGo.g:843:2: ( ( rule__PARAMETERS_LIST__Group__0 ) )
            // InternalGo.g:844:3: ( rule__PARAMETERS_LIST__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERS_LISTAccess().getGroup()); 
            }
            // InternalGo.g:845:3: ( rule__PARAMETERS_LIST__Group__0 )
            // InternalGo.g:845:4: rule__PARAMETERS_LIST__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PARAMETERS_LIST__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERS_LISTAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePARAMETERS_LIST"


    // $ANTLR start "entryRulePARAMETER"
    // InternalGo.g:854:1: entryRulePARAMETER : rulePARAMETER EOF ;
    public final void entryRulePARAMETER() throws RecognitionException {
        try {
            // InternalGo.g:855:1: ( rulePARAMETER EOF )
            // InternalGo.g:856:1: rulePARAMETER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePARAMETER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePARAMETER"


    // $ANTLR start "rulePARAMETER"
    // InternalGo.g:863:1: rulePARAMETER : ( ( rule__PARAMETER__Group__0 ) ) ;
    public final void rulePARAMETER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:867:2: ( ( ( rule__PARAMETER__Group__0 ) ) )
            // InternalGo.g:868:2: ( ( rule__PARAMETER__Group__0 ) )
            {
            // InternalGo.g:868:2: ( ( rule__PARAMETER__Group__0 ) )
            // InternalGo.g:869:3: ( rule__PARAMETER__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERAccess().getGroup()); 
            }
            // InternalGo.g:870:3: ( rule__PARAMETER__Group__0 )
            // InternalGo.g:870:4: rule__PARAMETER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PARAMETER__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePARAMETER"


    // $ANTLR start "entryRuleTypes"
    // InternalGo.g:879:1: entryRuleTypes : ruleTypes EOF ;
    public final void entryRuleTypes() throws RecognitionException {
        try {
            // InternalGo.g:880:1: ( ruleTypes EOF )
            // InternalGo.g:881:1: ruleTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalGo.g:888:1: ruleTypes : ( ( rule__Types__Alternatives ) ) ;
    public final void ruleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:892:2: ( ( ( rule__Types__Alternatives ) ) )
            // InternalGo.g:893:2: ( ( rule__Types__Alternatives ) )
            {
            // InternalGo.g:893:2: ( ( rule__Types__Alternatives ) )
            // InternalGo.g:894:3: ( rule__Types__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypesAccess().getAlternatives()); 
            }
            // InternalGo.g:895:3: ( rule__Types__Alternatives )
            // InternalGo.g:895:4: rule__Types__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Types__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleArrayType"
    // InternalGo.g:904:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalGo.g:905:1: ( ruleArrayType EOF )
            // InternalGo.g:906:1: ruleArrayType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalGo.g:913:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:917:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalGo.g:918:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalGo.g:918:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalGo.g:919:3: ( rule__ArrayType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeAccess().getGroup()); 
            }
            // InternalGo.g:920:3: ( rule__ArrayType__Group__0 )
            // InternalGo.g:920:4: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleBasicType"
    // InternalGo.g:929:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalGo.g:930:1: ( ruleBasicType EOF )
            // InternalGo.g:931:1: ruleBasicType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalGo.g:938:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:942:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalGo.g:943:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalGo.g:943:2: ( ( rule__BasicType__Alternatives ) )
            // InternalGo.g:944:3: ( rule__BasicType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            }
            // InternalGo.g:945:3: ( rule__BasicType__Alternatives )
            // InternalGo.g:945:4: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleARIT_OP"
    // InternalGo.g:954:1: entryRuleARIT_OP : ruleARIT_OP EOF ;
    public final void entryRuleARIT_OP() throws RecognitionException {
        try {
            // InternalGo.g:955:1: ( ruleARIT_OP EOF )
            // InternalGo.g:956:1: ruleARIT_OP EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getARIT_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleARIT_OP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getARIT_OPRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleARIT_OP"


    // $ANTLR start "ruleARIT_OP"
    // InternalGo.g:963:1: ruleARIT_OP : ( ( rule__ARIT_OP__Alternatives ) ) ;
    public final void ruleARIT_OP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:967:2: ( ( ( rule__ARIT_OP__Alternatives ) ) )
            // InternalGo.g:968:2: ( ( rule__ARIT_OP__Alternatives ) )
            {
            // InternalGo.g:968:2: ( ( rule__ARIT_OP__Alternatives ) )
            // InternalGo.g:969:3: ( rule__ARIT_OP__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getARIT_OPAccess().getAlternatives()); 
            }
            // InternalGo.g:970:3: ( rule__ARIT_OP__Alternatives )
            // InternalGo.g:970:4: rule__ARIT_OP__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ARIT_OP__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getARIT_OPAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleARIT_OP"


    // $ANTLR start "entryRuleCOMPARISON"
    // InternalGo.g:979:1: entryRuleCOMPARISON : ruleCOMPARISON EOF ;
    public final void entryRuleCOMPARISON() throws RecognitionException {
        try {
            // InternalGo.g:980:1: ( ruleCOMPARISON EOF )
            // InternalGo.g:981:1: ruleCOMPARISON EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOMPARISON"


    // $ANTLR start "ruleCOMPARISON"
    // InternalGo.g:988:1: ruleCOMPARISON : ( ( rule__COMPARISON__Alternatives ) ) ;
    public final void ruleCOMPARISON() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:992:2: ( ( ( rule__COMPARISON__Alternatives ) ) )
            // InternalGo.g:993:2: ( ( rule__COMPARISON__Alternatives ) )
            {
            // InternalGo.g:993:2: ( ( rule__COMPARISON__Alternatives ) )
            // InternalGo.g:994:3: ( rule__COMPARISON__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getAlternatives()); 
            }
            // InternalGo.g:995:3: ( rule__COMPARISON__Alternatives )
            // InternalGo.g:995:4: rule__COMPARISON__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__COMPARISON__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOMPARISON"


    // $ANTLR start "rule__BOOL_OP__Alternatives"
    // InternalGo.g:1003:1: rule__BOOL_OP__Alternatives : ( ( ( rule__BOOL_OP__AndAssignment_0 ) ) | ( ( rule__BOOL_OP__OrAssignment_1 ) ) );
    public final void rule__BOOL_OP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1007:1: ( ( ( rule__BOOL_OP__AndAssignment_0 ) ) | ( ( rule__BOOL_OP__OrAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGo.g:1008:2: ( ( rule__BOOL_OP__AndAssignment_0 ) )
                    {
                    // InternalGo.g:1008:2: ( ( rule__BOOL_OP__AndAssignment_0 ) )
                    // InternalGo.g:1009:3: ( rule__BOOL_OP__AndAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOL_OPAccess().getAndAssignment_0()); 
                    }
                    // InternalGo.g:1010:3: ( rule__BOOL_OP__AndAssignment_0 )
                    // InternalGo.g:1010:4: rule__BOOL_OP__AndAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOOL_OP__AndAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOL_OPAccess().getAndAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1014:2: ( ( rule__BOOL_OP__OrAssignment_1 ) )
                    {
                    // InternalGo.g:1014:2: ( ( rule__BOOL_OP__OrAssignment_1 ) )
                    // InternalGo.g:1015:3: ( rule__BOOL_OP__OrAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOL_OPAccess().getOrAssignment_1()); 
                    }
                    // InternalGo.g:1016:3: ( rule__BOOL_OP__OrAssignment_1 )
                    // InternalGo.g:1016:4: rule__BOOL_OP__OrAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOOL_OP__OrAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOL_OPAccess().getOrAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL_OP__Alternatives"


    // $ANTLR start "rule__BOOLEAN_VALUE__Alternatives"
    // InternalGo.g:1024:1: rule__BOOLEAN_VALUE__Alternatives : ( ( ( rule__BOOLEAN_VALUE__VerdadeiroAssignment_0 ) ) | ( ( rule__BOOLEAN_VALUE__FalsoAssignment_1 ) ) );
    public final void rule__BOOLEAN_VALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1028:1: ( ( ( rule__BOOLEAN_VALUE__VerdadeiroAssignment_0 ) ) | ( ( rule__BOOLEAN_VALUE__FalsoAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGo.g:1029:2: ( ( rule__BOOLEAN_VALUE__VerdadeiroAssignment_0 ) )
                    {
                    // InternalGo.g:1029:2: ( ( rule__BOOLEAN_VALUE__VerdadeiroAssignment_0 ) )
                    // InternalGo.g:1030:3: ( rule__BOOLEAN_VALUE__VerdadeiroAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLEAN_VALUEAccess().getVerdadeiroAssignment_0()); 
                    }
                    // InternalGo.g:1031:3: ( rule__BOOLEAN_VALUE__VerdadeiroAssignment_0 )
                    // InternalGo.g:1031:4: rule__BOOLEAN_VALUE__VerdadeiroAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOOLEAN_VALUE__VerdadeiroAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLEAN_VALUEAccess().getVerdadeiroAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1035:2: ( ( rule__BOOLEAN_VALUE__FalsoAssignment_1 ) )
                    {
                    // InternalGo.g:1035:2: ( ( rule__BOOLEAN_VALUE__FalsoAssignment_1 ) )
                    // InternalGo.g:1036:3: ( rule__BOOLEAN_VALUE__FalsoAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLEAN_VALUEAccess().getFalsoAssignment_1()); 
                    }
                    // InternalGo.g:1037:3: ( rule__BOOLEAN_VALUE__FalsoAssignment_1 )
                    // InternalGo.g:1037:4: rule__BOOLEAN_VALUE__FalsoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BOOLEAN_VALUE__FalsoAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLEAN_VALUEAccess().getFalsoAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN_VALUE__Alternatives"


    // $ANTLR start "rule__GoDecl__Alternatives"
    // InternalGo.g:1045:1: rule__GoDecl__Alternatives : ( ( ( rule__GoDecl__VarAssignment_0 ) ) | ( ( rule__GoDecl__FuncAssignment_1 ) ) | ( ( rule__GoDecl__ExpressaoAssignment_2 ) ) );
    public final void rule__GoDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1049:1: ( ( ( rule__GoDecl__VarAssignment_0 ) ) | ( ( rule__GoDecl__FuncAssignment_1 ) ) | ( ( rule__GoDecl__ExpressaoAssignment_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGo.g:1050:2: ( ( rule__GoDecl__VarAssignment_0 ) )
                    {
                    // InternalGo.g:1050:2: ( ( rule__GoDecl__VarAssignment_0 ) )
                    // InternalGo.g:1051:3: ( rule__GoDecl__VarAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGoDeclAccess().getVarAssignment_0()); 
                    }
                    // InternalGo.g:1052:3: ( rule__GoDecl__VarAssignment_0 )
                    // InternalGo.g:1052:4: rule__GoDecl__VarAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GoDecl__VarAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGoDeclAccess().getVarAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1056:2: ( ( rule__GoDecl__FuncAssignment_1 ) )
                    {
                    // InternalGo.g:1056:2: ( ( rule__GoDecl__FuncAssignment_1 ) )
                    // InternalGo.g:1057:3: ( rule__GoDecl__FuncAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGoDeclAccess().getFuncAssignment_1()); 
                    }
                    // InternalGo.g:1058:3: ( rule__GoDecl__FuncAssignment_1 )
                    // InternalGo.g:1058:4: rule__GoDecl__FuncAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GoDecl__FuncAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGoDeclAccess().getFuncAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1062:2: ( ( rule__GoDecl__ExpressaoAssignment_2 ) )
                    {
                    // InternalGo.g:1062:2: ( ( rule__GoDecl__ExpressaoAssignment_2 ) )
                    // InternalGo.g:1063:3: ( rule__GoDecl__ExpressaoAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGoDeclAccess().getExpressaoAssignment_2()); 
                    }
                    // InternalGo.g:1064:3: ( rule__GoDecl__ExpressaoAssignment_2 )
                    // InternalGo.g:1064:4: rule__GoDecl__ExpressaoAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GoDecl__ExpressaoAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGoDeclAccess().getExpressaoAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoDecl__Alternatives"


    // $ANTLR start "rule__IDList__Alternatives"
    // InternalGo.g:1072:1: rule__IDList__Alternatives : ( ( ( rule__IDList__IdListAssignment_0 ) ) | ( ( rule__IDList__Group_1__0 ) ) );
    public final void rule__IDList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1076:1: ( ( ( rule__IDList__IdListAssignment_0 ) ) | ( ( rule__IDList__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF) ) {
                    alt5=1;
                }
                else if ( (LA5_1==24) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGo.g:1077:2: ( ( rule__IDList__IdListAssignment_0 ) )
                    {
                    // InternalGo.g:1077:2: ( ( rule__IDList__IdListAssignment_0 ) )
                    // InternalGo.g:1078:3: ( rule__IDList__IdListAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIDListAccess().getIdListAssignment_0()); 
                    }
                    // InternalGo.g:1079:3: ( rule__IDList__IdListAssignment_0 )
                    // InternalGo.g:1079:4: rule__IDList__IdListAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IDList__IdListAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIDListAccess().getIdListAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1083:2: ( ( rule__IDList__Group_1__0 ) )
                    {
                    // InternalGo.g:1083:2: ( ( rule__IDList__Group_1__0 ) )
                    // InternalGo.g:1084:3: ( rule__IDList__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIDListAccess().getGroup_1()); 
                    }
                    // InternalGo.g:1085:3: ( rule__IDList__Group_1__0 )
                    // InternalGo.g:1085:4: rule__IDList__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IDList__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIDListAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__Alternatives"


    // $ANTLR start "rule__VarDecl__Alternatives_1_0"
    // InternalGo.g:1093:1: rule__VarDecl__Alternatives_1_0 : ( ( ( rule__VarDecl__AtribuicaoAssignment_1_0_0 ) ) | ( ( rule__VarDecl__ProntAssignment_1_0_1 ) ) );
    public final void rule__VarDecl__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1097:1: ( ( ( rule__VarDecl__AtribuicaoAssignment_1_0_0 ) ) | ( ( rule__VarDecl__ProntAssignment_1_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGo.g:1098:2: ( ( rule__VarDecl__AtribuicaoAssignment_1_0_0 ) )
                    {
                    // InternalGo.g:1098:2: ( ( rule__VarDecl__AtribuicaoAssignment_1_0_0 ) )
                    // InternalGo.g:1099:3: ( rule__VarDecl__AtribuicaoAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclAccess().getAtribuicaoAssignment_1_0_0()); 
                    }
                    // InternalGo.g:1100:3: ( rule__VarDecl__AtribuicaoAssignment_1_0_0 )
                    // InternalGo.g:1100:4: rule__VarDecl__AtribuicaoAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDecl__AtribuicaoAssignment_1_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclAccess().getAtribuicaoAssignment_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1104:2: ( ( rule__VarDecl__ProntAssignment_1_0_1 ) )
                    {
                    // InternalGo.g:1104:2: ( ( rule__VarDecl__ProntAssignment_1_0_1 ) )
                    // InternalGo.g:1105:3: ( rule__VarDecl__ProntAssignment_1_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclAccess().getProntAssignment_1_0_1()); 
                    }
                    // InternalGo.g:1106:3: ( rule__VarDecl__ProntAssignment_1_0_1 )
                    // InternalGo.g:1106:4: rule__VarDecl__ProntAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDecl__ProntAssignment_1_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclAccess().getProntAssignment_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Alternatives_1_0"


    // $ANTLR start "rule__Assignment__Alternatives_2"
    // InternalGo.g:1114:1: rule__Assignment__Alternatives_2 : ( ( ( rule__Assignment__IgualAssignment_2_0 ) ) | ( ( rule__Assignment__DoisAssignment_2_1 ) ) );
    public final void rule__Assignment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1118:1: ( ( ( rule__Assignment__IgualAssignment_2_0 ) ) | ( ( rule__Assignment__DoisAssignment_2_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGo.g:1119:2: ( ( rule__Assignment__IgualAssignment_2_0 ) )
                    {
                    // InternalGo.g:1119:2: ( ( rule__Assignment__IgualAssignment_2_0 ) )
                    // InternalGo.g:1120:3: ( rule__Assignment__IgualAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getIgualAssignment_2_0()); 
                    }
                    // InternalGo.g:1121:3: ( rule__Assignment__IgualAssignment_2_0 )
                    // InternalGo.g:1121:4: rule__Assignment__IgualAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__IgualAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getIgualAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1125:2: ( ( rule__Assignment__DoisAssignment_2_1 ) )
                    {
                    // InternalGo.g:1125:2: ( ( rule__Assignment__DoisAssignment_2_1 ) )
                    // InternalGo.g:1126:3: ( rule__Assignment__DoisAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getDoisAssignment_2_1()); 
                    }
                    // InternalGo.g:1127:3: ( rule__Assignment__DoisAssignment_2_1 )
                    // InternalGo.g:1127:4: rule__Assignment__DoisAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__DoisAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getDoisAssignment_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Alternatives_2"


    // $ANTLR start "rule__TIPO__Alternatives"
    // InternalGo.g:1135:1: rule__TIPO__Alternatives : ( ( ( rule__TIPO__VariavelAssignment_0 ) ) | ( ( rule__TIPO__ConstanteAssignment_1 ) ) );
    public final void rule__TIPO__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1139:1: ( ( ( rule__TIPO__VariavelAssignment_0 ) ) | ( ( rule__TIPO__ConstanteAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            else if ( (LA8_0==33) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGo.g:1140:2: ( ( rule__TIPO__VariavelAssignment_0 ) )
                    {
                    // InternalGo.g:1140:2: ( ( rule__TIPO__VariavelAssignment_0 ) )
                    // InternalGo.g:1141:3: ( rule__TIPO__VariavelAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTIPOAccess().getVariavelAssignment_0()); 
                    }
                    // InternalGo.g:1142:3: ( rule__TIPO__VariavelAssignment_0 )
                    // InternalGo.g:1142:4: rule__TIPO__VariavelAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TIPO__VariavelAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTIPOAccess().getVariavelAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1146:2: ( ( rule__TIPO__ConstanteAssignment_1 ) )
                    {
                    // InternalGo.g:1146:2: ( ( rule__TIPO__ConstanteAssignment_1 ) )
                    // InternalGo.g:1147:3: ( rule__TIPO__ConstanteAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTIPOAccess().getConstanteAssignment_1()); 
                    }
                    // InternalGo.g:1148:3: ( rule__TIPO__ConstanteAssignment_1 )
                    // InternalGo.g:1148:4: rule__TIPO__ConstanteAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TIPO__ConstanteAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTIPOAccess().getConstanteAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIPO__Alternatives"


    // $ANTLR start "rule__EXPRESSAOLINHA__Alternatives"
    // InternalGo.g:1156:1: rule__EXPRESSAOLINHA__Alternatives : ( ( ( rule__EXPRESSAOLINHA__Group_0__0 ) ) | ( ( rule__EXPRESSAOLINHA__ExpAssignment_1 ) ) );
    public final void rule__EXPRESSAOLINHA__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1160:1: ( ( ( rule__EXPRESSAOLINHA__Group_0__0 ) ) | ( ( rule__EXPRESSAOLINHA__ExpAssignment_1 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalGo.g:1161:2: ( ( rule__EXPRESSAOLINHA__Group_0__0 ) )
                    {
                    // InternalGo.g:1161:2: ( ( rule__EXPRESSAOLINHA__Group_0__0 ) )
                    // InternalGo.g:1162:3: ( rule__EXPRESSAOLINHA__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOLINHAAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1163:3: ( rule__EXPRESSAOLINHA__Group_0__0 )
                    // InternalGo.g:1163:4: rule__EXPRESSAOLINHA__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAOLINHA__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOLINHAAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1167:2: ( ( rule__EXPRESSAOLINHA__ExpAssignment_1 ) )
                    {
                    // InternalGo.g:1167:2: ( ( rule__EXPRESSAOLINHA__ExpAssignment_1 ) )
                    // InternalGo.g:1168:3: ( rule__EXPRESSAOLINHA__ExpAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOLINHAAccess().getExpAssignment_1()); 
                    }
                    // InternalGo.g:1169:3: ( rule__EXPRESSAOLINHA__ExpAssignment_1 )
                    // InternalGo.g:1169:4: rule__EXPRESSAOLINHA__ExpAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAOLINHA__ExpAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOLINHAAccess().getExpAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAOLINHA__Alternatives"


    // $ANTLR start "rule__EXPRESSAO__Alternatives"
    // InternalGo.g:1177:1: rule__EXPRESSAO__Alternatives : ( ( ( rule__EXPRESSAO__Group_0__0 ) ) | ( ( rule__EXPRESSAO__VariaveisAssignment_1 ) ) | ( ( rule__EXPRESSAO__BasicAssignment_2 ) ) | ( ( rule__EXPRESSAO__Binary_expAssignment_3 ) ) | ( ( rule__EXPRESSAO__DeclFunctionAssignment_4 ) ) | ( ( rule__EXPRESSAO__AssignmentAssignment_5 ) ) | ( ( rule__EXPRESSAO__VariaveisAssignment_6 ) ) | ( ( rule__EXPRESSAO__ForAssignment_7 ) ) | ( ( rule__EXPRESSAO__BasicAssignment_8 ) ) | ( ( rule__EXPRESSAO__ArrayValueAssignment_9 ) ) );
    public final void rule__EXPRESSAO__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1181:1: ( ( ( rule__EXPRESSAO__Group_0__0 ) ) | ( ( rule__EXPRESSAO__VariaveisAssignment_1 ) ) | ( ( rule__EXPRESSAO__BasicAssignment_2 ) ) | ( ( rule__EXPRESSAO__Binary_expAssignment_3 ) ) | ( ( rule__EXPRESSAO__DeclFunctionAssignment_4 ) ) | ( ( rule__EXPRESSAO__AssignmentAssignment_5 ) ) | ( ( rule__EXPRESSAO__VariaveisAssignment_6 ) ) | ( ( rule__EXPRESSAO__ForAssignment_7 ) ) | ( ( rule__EXPRESSAO__BasicAssignment_8 ) ) | ( ( rule__EXPRESSAO__ArrayValueAssignment_9 ) ) )
            int alt10=10;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalGo.g:1182:2: ( ( rule__EXPRESSAO__Group_0__0 ) )
                    {
                    // InternalGo.g:1182:2: ( ( rule__EXPRESSAO__Group_0__0 ) )
                    // InternalGo.g:1183:3: ( rule__EXPRESSAO__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1184:3: ( rule__EXPRESSAO__Group_0__0 )
                    // InternalGo.g:1184:4: rule__EXPRESSAO__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1188:2: ( ( rule__EXPRESSAO__VariaveisAssignment_1 ) )
                    {
                    // InternalGo.g:1188:2: ( ( rule__EXPRESSAO__VariaveisAssignment_1 ) )
                    // InternalGo.g:1189:3: ( rule__EXPRESSAO__VariaveisAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getVariaveisAssignment_1()); 
                    }
                    // InternalGo.g:1190:3: ( rule__EXPRESSAO__VariaveisAssignment_1 )
                    // InternalGo.g:1190:4: rule__EXPRESSAO__VariaveisAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__VariaveisAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getVariaveisAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1194:2: ( ( rule__EXPRESSAO__BasicAssignment_2 ) )
                    {
                    // InternalGo.g:1194:2: ( ( rule__EXPRESSAO__BasicAssignment_2 ) )
                    // InternalGo.g:1195:3: ( rule__EXPRESSAO__BasicAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getBasicAssignment_2()); 
                    }
                    // InternalGo.g:1196:3: ( rule__EXPRESSAO__BasicAssignment_2 )
                    // InternalGo.g:1196:4: rule__EXPRESSAO__BasicAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__BasicAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getBasicAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1200:2: ( ( rule__EXPRESSAO__Binary_expAssignment_3 ) )
                    {
                    // InternalGo.g:1200:2: ( ( rule__EXPRESSAO__Binary_expAssignment_3 ) )
                    // InternalGo.g:1201:3: ( rule__EXPRESSAO__Binary_expAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getBinary_expAssignment_3()); 
                    }
                    // InternalGo.g:1202:3: ( rule__EXPRESSAO__Binary_expAssignment_3 )
                    // InternalGo.g:1202:4: rule__EXPRESSAO__Binary_expAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__Binary_expAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getBinary_expAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1206:2: ( ( rule__EXPRESSAO__DeclFunctionAssignment_4 ) )
                    {
                    // InternalGo.g:1206:2: ( ( rule__EXPRESSAO__DeclFunctionAssignment_4 ) )
                    // InternalGo.g:1207:3: ( rule__EXPRESSAO__DeclFunctionAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getDeclFunctionAssignment_4()); 
                    }
                    // InternalGo.g:1208:3: ( rule__EXPRESSAO__DeclFunctionAssignment_4 )
                    // InternalGo.g:1208:4: rule__EXPRESSAO__DeclFunctionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__DeclFunctionAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getDeclFunctionAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGo.g:1212:2: ( ( rule__EXPRESSAO__AssignmentAssignment_5 ) )
                    {
                    // InternalGo.g:1212:2: ( ( rule__EXPRESSAO__AssignmentAssignment_5 ) )
                    // InternalGo.g:1213:3: ( rule__EXPRESSAO__AssignmentAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getAssignmentAssignment_5()); 
                    }
                    // InternalGo.g:1214:3: ( rule__EXPRESSAO__AssignmentAssignment_5 )
                    // InternalGo.g:1214:4: rule__EXPRESSAO__AssignmentAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__AssignmentAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getAssignmentAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGo.g:1218:2: ( ( rule__EXPRESSAO__VariaveisAssignment_6 ) )
                    {
                    // InternalGo.g:1218:2: ( ( rule__EXPRESSAO__VariaveisAssignment_6 ) )
                    // InternalGo.g:1219:3: ( rule__EXPRESSAO__VariaveisAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getVariaveisAssignment_6()); 
                    }
                    // InternalGo.g:1220:3: ( rule__EXPRESSAO__VariaveisAssignment_6 )
                    // InternalGo.g:1220:4: rule__EXPRESSAO__VariaveisAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__VariaveisAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getVariaveisAssignment_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalGo.g:1224:2: ( ( rule__EXPRESSAO__ForAssignment_7 ) )
                    {
                    // InternalGo.g:1224:2: ( ( rule__EXPRESSAO__ForAssignment_7 ) )
                    // InternalGo.g:1225:3: ( rule__EXPRESSAO__ForAssignment_7 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getForAssignment_7()); 
                    }
                    // InternalGo.g:1226:3: ( rule__EXPRESSAO__ForAssignment_7 )
                    // InternalGo.g:1226:4: rule__EXPRESSAO__ForAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__ForAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getForAssignment_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalGo.g:1230:2: ( ( rule__EXPRESSAO__BasicAssignment_8 ) )
                    {
                    // InternalGo.g:1230:2: ( ( rule__EXPRESSAO__BasicAssignment_8 ) )
                    // InternalGo.g:1231:3: ( rule__EXPRESSAO__BasicAssignment_8 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getBasicAssignment_8()); 
                    }
                    // InternalGo.g:1232:3: ( rule__EXPRESSAO__BasicAssignment_8 )
                    // InternalGo.g:1232:4: rule__EXPRESSAO__BasicAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__BasicAssignment_8();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getBasicAssignment_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalGo.g:1236:2: ( ( rule__EXPRESSAO__ArrayValueAssignment_9 ) )
                    {
                    // InternalGo.g:1236:2: ( ( rule__EXPRESSAO__ArrayValueAssignment_9 ) )
                    // InternalGo.g:1237:3: ( rule__EXPRESSAO__ArrayValueAssignment_9 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEXPRESSAOAccess().getArrayValueAssignment_9()); 
                    }
                    // InternalGo.g:1238:3: ( rule__EXPRESSAO__ArrayValueAssignment_9 )
                    // InternalGo.g:1238:4: rule__EXPRESSAO__ArrayValueAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__EXPRESSAO__ArrayValueAssignment_9();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEXPRESSAOAccess().getArrayValueAssignment_9()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__Alternatives"


    // $ANTLR start "rule__LiteraisList__Alternatives"
    // InternalGo.g:1246:1: rule__LiteraisList__Alternatives : ( ( ( rule__LiteraisList__LitAssignment_0 ) ) | ( ( rule__LiteraisList__Group_1__0 ) ) );
    public final void rule__LiteraisList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1250:1: ( ( ( rule__LiteraisList__LitAssignment_0 ) ) | ( ( rule__LiteraisList__Group_1__0 ) ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==24) ) {
                    alt11=2;
                }
                else if ( (LA11_1==EOF||LA11_1==22) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING_DECL:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==24) ) {
                    alt11=2;
                }
                else if ( (LA11_2==EOF||LA11_2==22) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==EOF||LA11_3==22) ) {
                    alt11=1;
                }
                else if ( (LA11_3==24) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA11_4 = input.LA(2);

                if ( (LA11_4==EOF||LA11_4==22) ) {
                    alt11=1;
                }
                else if ( (LA11_4==24) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGo.g:1251:2: ( ( rule__LiteraisList__LitAssignment_0 ) )
                    {
                    // InternalGo.g:1251:2: ( ( rule__LiteraisList__LitAssignment_0 ) )
                    // InternalGo.g:1252:3: ( rule__LiteraisList__LitAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteraisListAccess().getLitAssignment_0()); 
                    }
                    // InternalGo.g:1253:3: ( rule__LiteraisList__LitAssignment_0 )
                    // InternalGo.g:1253:4: rule__LiteraisList__LitAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteraisList__LitAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteraisListAccess().getLitAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1257:2: ( ( rule__LiteraisList__Group_1__0 ) )
                    {
                    // InternalGo.g:1257:2: ( ( rule__LiteraisList__Group_1__0 ) )
                    // InternalGo.g:1258:3: ( rule__LiteraisList__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteraisListAccess().getGroup_1()); 
                    }
                    // InternalGo.g:1259:3: ( rule__LiteraisList__Group_1__0 )
                    // InternalGo.g:1259:4: rule__LiteraisList__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteraisList__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteraisListAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__Alternatives"


    // $ANTLR start "rule__LITERAIS_BASICOS__Alternatives"
    // InternalGo.g:1267:1: rule__LITERAIS_BASICOS__Alternatives : ( ( ( rule__LITERAIS_BASICOS__NumeroAssignment_0 ) ) | ( ( rule__LITERAIS_BASICOS__StringAssignment_1 ) ) | ( ( rule__LITERAIS_BASICOS__BooleanoAssignment_2 ) ) );
    public final void rule__LITERAIS_BASICOS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1271:1: ( ( ( rule__LITERAIS_BASICOS__NumeroAssignment_0 ) ) | ( ( rule__LITERAIS_BASICOS__StringAssignment_1 ) ) | ( ( rule__LITERAIS_BASICOS__BooleanoAssignment_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
                {
                alt12=1;
                }
                break;
            case RULE_STRING_DECL:
                {
                alt12=2;
                }
                break;
            case 30:
            case 31:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGo.g:1272:2: ( ( rule__LITERAIS_BASICOS__NumeroAssignment_0 ) )
                    {
                    // InternalGo.g:1272:2: ( ( rule__LITERAIS_BASICOS__NumeroAssignment_0 ) )
                    // InternalGo.g:1273:3: ( rule__LITERAIS_BASICOS__NumeroAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLITERAIS_BASICOSAccess().getNumeroAssignment_0()); 
                    }
                    // InternalGo.g:1274:3: ( rule__LITERAIS_BASICOS__NumeroAssignment_0 )
                    // InternalGo.g:1274:4: rule__LITERAIS_BASICOS__NumeroAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LITERAIS_BASICOS__NumeroAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLITERAIS_BASICOSAccess().getNumeroAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1278:2: ( ( rule__LITERAIS_BASICOS__StringAssignment_1 ) )
                    {
                    // InternalGo.g:1278:2: ( ( rule__LITERAIS_BASICOS__StringAssignment_1 ) )
                    // InternalGo.g:1279:3: ( rule__LITERAIS_BASICOS__StringAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLITERAIS_BASICOSAccess().getStringAssignment_1()); 
                    }
                    // InternalGo.g:1280:3: ( rule__LITERAIS_BASICOS__StringAssignment_1 )
                    // InternalGo.g:1280:4: rule__LITERAIS_BASICOS__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LITERAIS_BASICOS__StringAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLITERAIS_BASICOSAccess().getStringAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1284:2: ( ( rule__LITERAIS_BASICOS__BooleanoAssignment_2 ) )
                    {
                    // InternalGo.g:1284:2: ( ( rule__LITERAIS_BASICOS__BooleanoAssignment_2 ) )
                    // InternalGo.g:1285:3: ( rule__LITERAIS_BASICOS__BooleanoAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLITERAIS_BASICOSAccess().getBooleanoAssignment_2()); 
                    }
                    // InternalGo.g:1286:3: ( rule__LITERAIS_BASICOS__BooleanoAssignment_2 )
                    // InternalGo.g:1286:4: rule__LITERAIS_BASICOS__BooleanoAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LITERAIS_BASICOS__BooleanoAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLITERAIS_BASICOSAccess().getBooleanoAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LITERAIS_BASICOS__Alternatives"


    // $ANTLR start "rule__BINARY_EXP__Alternatives"
    // InternalGo.g:1294:1: rule__BINARY_EXP__Alternatives : ( ( ( rule__BINARY_EXP__Group_0__0 ) ) | ( ( rule__BINARY_EXP__Unique_basicAssignment_1 ) ) );
    public final void rule__BINARY_EXP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1298:1: ( ( ( rule__BINARY_EXP__Group_0__0 ) ) | ( ( rule__BINARY_EXP__Unique_basicAssignment_1 ) ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case RULE_NUMERO:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||(LA13_1>=RULE_ID && LA13_1<=RULE_STRING_DECL)||(LA13_1>=20 && LA13_1<=23)||LA13_1==27||(LA13_1>=30 && LA13_1<=33)||(LA13_1>=40 && LA13_1<=44)) ) {
                    alt13=2;
                }
                else if ( ((LA13_1>=15 && LA13_1<=19)||(LA13_1>=28 && LA13_1<=29)) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING_DECL:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==EOF||(LA13_2>=RULE_ID && LA13_2<=RULE_STRING_DECL)||(LA13_2>=20 && LA13_2<=23)||LA13_2==27||(LA13_2>=30 && LA13_2<=33)||(LA13_2>=40 && LA13_2<=44)) ) {
                    alt13=2;
                }
                else if ( ((LA13_2>=15 && LA13_2<=19)||(LA13_2>=28 && LA13_2<=29)) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==EOF||(LA13_3>=RULE_ID && LA13_3<=RULE_STRING_DECL)||(LA13_3>=20 && LA13_3<=23)||LA13_3==27||(LA13_3>=30 && LA13_3<=33)||(LA13_3>=40 && LA13_3<=44)) ) {
                    alt13=2;
                }
                else if ( ((LA13_3>=15 && LA13_3<=19)||(LA13_3>=28 && LA13_3<=29)) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA13_4 = input.LA(2);

                if ( ((LA13_4>=15 && LA13_4<=19)||(LA13_4>=28 && LA13_4<=29)) ) {
                    alt13=1;
                }
                else if ( (LA13_4==EOF||(LA13_4>=RULE_ID && LA13_4<=RULE_STRING_DECL)||(LA13_4>=20 && LA13_4<=23)||LA13_4==27||(LA13_4>=30 && LA13_4<=33)||(LA13_4>=40 && LA13_4<=44)) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalGo.g:1299:2: ( ( rule__BINARY_EXP__Group_0__0 ) )
                    {
                    // InternalGo.g:1299:2: ( ( rule__BINARY_EXP__Group_0__0 ) )
                    // InternalGo.g:1300:3: ( rule__BINARY_EXP__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBINARY_EXPAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1301:3: ( rule__BINARY_EXP__Group_0__0 )
                    // InternalGo.g:1301:4: rule__BINARY_EXP__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BINARY_EXP__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBINARY_EXPAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1305:2: ( ( rule__BINARY_EXP__Unique_basicAssignment_1 ) )
                    {
                    // InternalGo.g:1305:2: ( ( rule__BINARY_EXP__Unique_basicAssignment_1 ) )
                    // InternalGo.g:1306:3: ( rule__BINARY_EXP__Unique_basicAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBINARY_EXPAccess().getUnique_basicAssignment_1()); 
                    }
                    // InternalGo.g:1307:3: ( rule__BINARY_EXP__Unique_basicAssignment_1 )
                    // InternalGo.g:1307:4: rule__BINARY_EXP__Unique_basicAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BINARY_EXP__Unique_basicAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBINARY_EXPAccess().getUnique_basicAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__Alternatives"


    // $ANTLR start "rule__BINARY_EXP__Alternatives_0_1"
    // InternalGo.g:1315:1: rule__BINARY_EXP__Alternatives_0_1 : ( ( ( rule__BINARY_EXP__BoolAssignment_0_1_0 ) ) | ( ( rule__BINARY_EXP__AritAssignment_0_1_1 ) ) );
    public final void rule__BINARY_EXP__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1319:1: ( ( ( rule__BINARY_EXP__BoolAssignment_0_1_0 ) ) | ( ( rule__BINARY_EXP__AritAssignment_0_1_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=28 && LA14_0<=29)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=15 && LA14_0<=19)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGo.g:1320:2: ( ( rule__BINARY_EXP__BoolAssignment_0_1_0 ) )
                    {
                    // InternalGo.g:1320:2: ( ( rule__BINARY_EXP__BoolAssignment_0_1_0 ) )
                    // InternalGo.g:1321:3: ( rule__BINARY_EXP__BoolAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBINARY_EXPAccess().getBoolAssignment_0_1_0()); 
                    }
                    // InternalGo.g:1322:3: ( rule__BINARY_EXP__BoolAssignment_0_1_0 )
                    // InternalGo.g:1322:4: rule__BINARY_EXP__BoolAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BINARY_EXP__BoolAssignment_0_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBINARY_EXPAccess().getBoolAssignment_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1326:2: ( ( rule__BINARY_EXP__AritAssignment_0_1_1 ) )
                    {
                    // InternalGo.g:1326:2: ( ( rule__BINARY_EXP__AritAssignment_0_1_1 ) )
                    // InternalGo.g:1327:3: ( rule__BINARY_EXP__AritAssignment_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBINARY_EXPAccess().getAritAssignment_0_1_1()); 
                    }
                    // InternalGo.g:1328:3: ( rule__BINARY_EXP__AritAssignment_0_1_1 )
                    // InternalGo.g:1328:4: rule__BINARY_EXP__AritAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BINARY_EXP__AritAssignment_0_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBINARY_EXPAccess().getAritAssignment_0_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__Alternatives_0_1"


    // $ANTLR start "rule__Result__Alternatives"
    // InternalGo.g:1336:1: rule__Result__Alternatives : ( ( ( rule__Result__Group_0__0 ) ) | ( ( rule__Result__TipoAssignment_1 ) ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1340:1: ( ( ( rule__Result__Group_0__0 ) ) | ( ( rule__Result__TipoAssignment_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            else if ( (LA15_0==25||(LA15_0>=36 && LA15_0<=39)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGo.g:1341:2: ( ( rule__Result__Group_0__0 ) )
                    {
                    // InternalGo.g:1341:2: ( ( rule__Result__Group_0__0 ) )
                    // InternalGo.g:1342:3: ( rule__Result__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getResultAccess().getGroup_0()); 
                    }
                    // InternalGo.g:1343:3: ( rule__Result__Group_0__0 )
                    // InternalGo.g:1343:4: rule__Result__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Result__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getResultAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1347:2: ( ( rule__Result__TipoAssignment_1 ) )
                    {
                    // InternalGo.g:1347:2: ( ( rule__Result__TipoAssignment_1 ) )
                    // InternalGo.g:1348:3: ( rule__Result__TipoAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getResultAccess().getTipoAssignment_1()); 
                    }
                    // InternalGo.g:1349:3: ( rule__Result__TipoAssignment_1 )
                    // InternalGo.g:1349:4: rule__Result__TipoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Result__TipoAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getResultAccess().getTipoAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Alternatives"


    // $ANTLR start "rule__Types__Alternatives"
    // InternalGo.g:1357:1: rule__Types__Alternatives : ( ( ( rule__Types__BasicAssignment_0 ) ) | ( ( rule__Types__ArrayAssignment_1 ) ) );
    public final void rule__Types__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1361:1: ( ( ( rule__Types__BasicAssignment_0 ) ) | ( ( rule__Types__ArrayAssignment_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=36 && LA16_0<=39)) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGo.g:1362:2: ( ( rule__Types__BasicAssignment_0 ) )
                    {
                    // InternalGo.g:1362:2: ( ( rule__Types__BasicAssignment_0 ) )
                    // InternalGo.g:1363:3: ( rule__Types__BasicAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getBasicAssignment_0()); 
                    }
                    // InternalGo.g:1364:3: ( rule__Types__BasicAssignment_0 )
                    // InternalGo.g:1364:4: rule__Types__BasicAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__BasicAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getBasicAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1368:2: ( ( rule__Types__ArrayAssignment_1 ) )
                    {
                    // InternalGo.g:1368:2: ( ( rule__Types__ArrayAssignment_1 ) )
                    // InternalGo.g:1369:3: ( rule__Types__ArrayAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getArrayAssignment_1()); 
                    }
                    // InternalGo.g:1370:3: ( rule__Types__ArrayAssignment_1 )
                    // InternalGo.g:1370:4: rule__Types__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__ArrayAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getArrayAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Alternatives"


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalGo.g:1378:1: rule__BasicType__Alternatives : ( ( ( rule__BasicType__StringAssignment_0 ) ) | ( ( rule__BasicType__IntAssignment_1 ) ) | ( ( rule__BasicType__FloatAssignment_2 ) ) | ( ( rule__BasicType__BooleanAssignment_3 ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1382:1: ( ( ( rule__BasicType__StringAssignment_0 ) ) | ( ( rule__BasicType__IntAssignment_1 ) ) | ( ( rule__BasicType__FloatAssignment_2 ) ) | ( ( rule__BasicType__BooleanAssignment_3 ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt17=1;
                }
                break;
            case 37:
                {
                alt17=2;
                }
                break;
            case 38:
                {
                alt17=3;
                }
                break;
            case 39:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalGo.g:1383:2: ( ( rule__BasicType__StringAssignment_0 ) )
                    {
                    // InternalGo.g:1383:2: ( ( rule__BasicType__StringAssignment_0 ) )
                    // InternalGo.g:1384:3: ( rule__BasicType__StringAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getStringAssignment_0()); 
                    }
                    // InternalGo.g:1385:3: ( rule__BasicType__StringAssignment_0 )
                    // InternalGo.g:1385:4: rule__BasicType__StringAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__StringAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getStringAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1389:2: ( ( rule__BasicType__IntAssignment_1 ) )
                    {
                    // InternalGo.g:1389:2: ( ( rule__BasicType__IntAssignment_1 ) )
                    // InternalGo.g:1390:3: ( rule__BasicType__IntAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getIntAssignment_1()); 
                    }
                    // InternalGo.g:1391:3: ( rule__BasicType__IntAssignment_1 )
                    // InternalGo.g:1391:4: rule__BasicType__IntAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__IntAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getIntAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1395:2: ( ( rule__BasicType__FloatAssignment_2 ) )
                    {
                    // InternalGo.g:1395:2: ( ( rule__BasicType__FloatAssignment_2 ) )
                    // InternalGo.g:1396:3: ( rule__BasicType__FloatAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getFloatAssignment_2()); 
                    }
                    // InternalGo.g:1397:3: ( rule__BasicType__FloatAssignment_2 )
                    // InternalGo.g:1397:4: rule__BasicType__FloatAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__FloatAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getFloatAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1401:2: ( ( rule__BasicType__BooleanAssignment_3 ) )
                    {
                    // InternalGo.g:1401:2: ( ( rule__BasicType__BooleanAssignment_3 ) )
                    // InternalGo.g:1402:3: ( rule__BasicType__BooleanAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicTypeAccess().getBooleanAssignment_3()); 
                    }
                    // InternalGo.g:1403:3: ( rule__BasicType__BooleanAssignment_3 )
                    // InternalGo.g:1403:4: rule__BasicType__BooleanAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__BooleanAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicTypeAccess().getBooleanAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__ARIT_OP__Alternatives"
    // InternalGo.g:1411:1: rule__ARIT_OP__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) );
    public final void rule__ARIT_OP__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1415:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '^' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt18=1;
                }
                break;
            case 16:
                {
                alt18=2;
                }
                break;
            case 17:
                {
                alt18=3;
                }
                break;
            case 18:
                {
                alt18=4;
                }
                break;
            case 19:
                {
                alt18=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGo.g:1416:2: ( '+' )
                    {
                    // InternalGo.g:1416:2: ( '+' )
                    // InternalGo.g:1417:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getARIT_OPAccess().getPlusSignKeyword_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getARIT_OPAccess().getPlusSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1422:2: ( '-' )
                    {
                    // InternalGo.g:1422:2: ( '-' )
                    // InternalGo.g:1423:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getARIT_OPAccess().getHyphenMinusKeyword_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getARIT_OPAccess().getHyphenMinusKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1428:2: ( '*' )
                    {
                    // InternalGo.g:1428:2: ( '*' )
                    // InternalGo.g:1429:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getARIT_OPAccess().getAsteriskKeyword_2()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getARIT_OPAccess().getAsteriskKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1434:2: ( '/' )
                    {
                    // InternalGo.g:1434:2: ( '/' )
                    // InternalGo.g:1435:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getARIT_OPAccess().getSolidusKeyword_3()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getARIT_OPAccess().getSolidusKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1440:2: ( '^' )
                    {
                    // InternalGo.g:1440:2: ( '^' )
                    // InternalGo.g:1441:3: '^'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getARIT_OPAccess().getCircumflexAccentKeyword_4()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getARIT_OPAccess().getCircumflexAccentKeyword_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ARIT_OP__Alternatives"


    // $ANTLR start "rule__COMPARISON__Alternatives"
    // InternalGo.g:1450:1: rule__COMPARISON__Alternatives : ( ( ( rule__COMPARISON__IgualAssignment_0 ) ) | ( ( rule__COMPARISON__MaiorigualqueAssignment_1 ) ) | ( ( rule__COMPARISON__MenorigualqueAssignment_2 ) ) | ( ( rule__COMPARISON__MaiorqueAssignment_3 ) ) | ( ( rule__COMPARISON__MenorqueAssignment_4 ) ) );
    public final void rule__COMPARISON__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1454:1: ( ( ( rule__COMPARISON__IgualAssignment_0 ) ) | ( ( rule__COMPARISON__MaiorigualqueAssignment_1 ) ) | ( ( rule__COMPARISON__MenorigualqueAssignment_2 ) ) | ( ( rule__COMPARISON__MaiorqueAssignment_3 ) ) | ( ( rule__COMPARISON__MenorqueAssignment_4 ) ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            case 43:
                {
                alt19=4;
                }
                break;
            case 44:
                {
                alt19=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGo.g:1455:2: ( ( rule__COMPARISON__IgualAssignment_0 ) )
                    {
                    // InternalGo.g:1455:2: ( ( rule__COMPARISON__IgualAssignment_0 ) )
                    // InternalGo.g:1456:3: ( rule__COMPARISON__IgualAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getIgualAssignment_0()); 
                    }
                    // InternalGo.g:1457:3: ( rule__COMPARISON__IgualAssignment_0 )
                    // InternalGo.g:1457:4: rule__COMPARISON__IgualAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__COMPARISON__IgualAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getIgualAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGo.g:1461:2: ( ( rule__COMPARISON__MaiorigualqueAssignment_1 ) )
                    {
                    // InternalGo.g:1461:2: ( ( rule__COMPARISON__MaiorigualqueAssignment_1 ) )
                    // InternalGo.g:1462:3: ( rule__COMPARISON__MaiorigualqueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getMaiorigualqueAssignment_1()); 
                    }
                    // InternalGo.g:1463:3: ( rule__COMPARISON__MaiorigualqueAssignment_1 )
                    // InternalGo.g:1463:4: rule__COMPARISON__MaiorigualqueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__COMPARISON__MaiorigualqueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getMaiorigualqueAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGo.g:1467:2: ( ( rule__COMPARISON__MenorigualqueAssignment_2 ) )
                    {
                    // InternalGo.g:1467:2: ( ( rule__COMPARISON__MenorigualqueAssignment_2 ) )
                    // InternalGo.g:1468:3: ( rule__COMPARISON__MenorigualqueAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getMenorigualqueAssignment_2()); 
                    }
                    // InternalGo.g:1469:3: ( rule__COMPARISON__MenorigualqueAssignment_2 )
                    // InternalGo.g:1469:4: rule__COMPARISON__MenorigualqueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__COMPARISON__MenorigualqueAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getMenorigualqueAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGo.g:1473:2: ( ( rule__COMPARISON__MaiorqueAssignment_3 ) )
                    {
                    // InternalGo.g:1473:2: ( ( rule__COMPARISON__MaiorqueAssignment_3 ) )
                    // InternalGo.g:1474:3: ( rule__COMPARISON__MaiorqueAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getMaiorqueAssignment_3()); 
                    }
                    // InternalGo.g:1475:3: ( rule__COMPARISON__MaiorqueAssignment_3 )
                    // InternalGo.g:1475:4: rule__COMPARISON__MaiorqueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__COMPARISON__MaiorqueAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getMaiorqueAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGo.g:1479:2: ( ( rule__COMPARISON__MenorqueAssignment_4 ) )
                    {
                    // InternalGo.g:1479:2: ( ( rule__COMPARISON__MenorqueAssignment_4 ) )
                    // InternalGo.g:1480:3: ( rule__COMPARISON__MenorqueAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCOMPARISONAccess().getMenorqueAssignment_4()); 
                    }
                    // InternalGo.g:1481:3: ( rule__COMPARISON__MenorqueAssignment_4 )
                    // InternalGo.g:1481:4: rule__COMPARISON__MenorqueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__COMPARISON__MenorqueAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCOMPARISONAccess().getMenorqueAssignment_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPARISON__Alternatives"


    // $ANTLR start "rule__ForDecl__Group__0"
    // InternalGo.g:1489:1: rule__ForDecl__Group__0 : rule__ForDecl__Group__0__Impl rule__ForDecl__Group__1 ;
    public final void rule__ForDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1493:1: ( rule__ForDecl__Group__0__Impl rule__ForDecl__Group__1 )
            // InternalGo.g:1494:2: rule__ForDecl__Group__0__Impl rule__ForDecl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ForDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__0"


    // $ANTLR start "rule__ForDecl__Group__0__Impl"
    // InternalGo.g:1501:1: rule__ForDecl__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1505:1: ( ( 'for' ) )
            // InternalGo.g:1506:1: ( 'for' )
            {
            // InternalGo.g:1506:1: ( 'for' )
            // InternalGo.g:1507:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForDeclAccess().getForKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForDeclAccess().getForKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__0__Impl"


    // $ANTLR start "rule__ForDecl__Group__1"
    // InternalGo.g:1516:1: rule__ForDecl__Group__1 : rule__ForDecl__Group__1__Impl rule__ForDecl__Group__2 ;
    public final void rule__ForDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1520:1: ( rule__ForDecl__Group__1__Impl rule__ForDecl__Group__2 )
            // InternalGo.g:1521:2: rule__ForDecl__Group__1__Impl rule__ForDecl__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ForDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__1"


    // $ANTLR start "rule__ForDecl__Group__1__Impl"
    // InternalGo.g:1528:1: rule__ForDecl__Group__1__Impl : ( ( rule__ForDecl__ClauseAssignment_1 ) ) ;
    public final void rule__ForDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1532:1: ( ( ( rule__ForDecl__ClauseAssignment_1 ) ) )
            // InternalGo.g:1533:1: ( ( rule__ForDecl__ClauseAssignment_1 ) )
            {
            // InternalGo.g:1533:1: ( ( rule__ForDecl__ClauseAssignment_1 ) )
            // InternalGo.g:1534:2: ( rule__ForDecl__ClauseAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForDeclAccess().getClauseAssignment_1()); 
            }
            // InternalGo.g:1535:2: ( rule__ForDecl__ClauseAssignment_1 )
            // InternalGo.g:1535:3: rule__ForDecl__ClauseAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForDecl__ClauseAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForDeclAccess().getClauseAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__1__Impl"


    // $ANTLR start "rule__ForDecl__Group__2"
    // InternalGo.g:1543:1: rule__ForDecl__Group__2 : rule__ForDecl__Group__2__Impl rule__ForDecl__Group__3 ;
    public final void rule__ForDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1547:1: ( rule__ForDecl__Group__2__Impl rule__ForDecl__Group__3 )
            // InternalGo.g:1548:2: rule__ForDecl__Group__2__Impl rule__ForDecl__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ForDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__2"


    // $ANTLR start "rule__ForDecl__Group__2__Impl"
    // InternalGo.g:1555:1: rule__ForDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__ForDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1559:1: ( ( '{' ) )
            // InternalGo.g:1560:1: ( '{' )
            {
            // InternalGo.g:1560:1: ( '{' )
            // InternalGo.g:1561:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForDeclAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForDeclAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__2__Impl"


    // $ANTLR start "rule__ForDecl__Group__3"
    // InternalGo.g:1570:1: rule__ForDecl__Group__3 : rule__ForDecl__Group__3__Impl rule__ForDecl__Group__4 ;
    public final void rule__ForDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1574:1: ( rule__ForDecl__Group__3__Impl rule__ForDecl__Group__4 )
            // InternalGo.g:1575:2: rule__ForDecl__Group__3__Impl rule__ForDecl__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ForDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__3"


    // $ANTLR start "rule__ForDecl__Group__3__Impl"
    // InternalGo.g:1582:1: rule__ForDecl__Group__3__Impl : ( ( rule__ForDecl__ExpAssignment_3 ) ) ;
    public final void rule__ForDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1586:1: ( ( ( rule__ForDecl__ExpAssignment_3 ) ) )
            // InternalGo.g:1587:1: ( ( rule__ForDecl__ExpAssignment_3 ) )
            {
            // InternalGo.g:1587:1: ( ( rule__ForDecl__ExpAssignment_3 ) )
            // InternalGo.g:1588:2: ( rule__ForDecl__ExpAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForDeclAccess().getExpAssignment_3()); 
            }
            // InternalGo.g:1589:2: ( rule__ForDecl__ExpAssignment_3 )
            // InternalGo.g:1589:3: rule__ForDecl__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForDecl__ExpAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForDeclAccess().getExpAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__3__Impl"


    // $ANTLR start "rule__ForDecl__Group__4"
    // InternalGo.g:1597:1: rule__ForDecl__Group__4 : rule__ForDecl__Group__4__Impl ;
    public final void rule__ForDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1601:1: ( rule__ForDecl__Group__4__Impl )
            // InternalGo.g:1602:2: rule__ForDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__4"


    // $ANTLR start "rule__ForDecl__Group__4__Impl"
    // InternalGo.g:1608:1: rule__ForDecl__Group__4__Impl : ( '}' ) ;
    public final void rule__ForDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1612:1: ( ( '}' ) )
            // InternalGo.g:1613:1: ( '}' )
            {
            // InternalGo.g:1613:1: ( '}' )
            // InternalGo.g:1614:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForDeclAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForDeclAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__Group__4__Impl"


    // $ANTLR start "rule__ForClause__Group__0"
    // InternalGo.g:1624:1: rule__ForClause__Group__0 : rule__ForClause__Group__0__Impl rule__ForClause__Group__1 ;
    public final void rule__ForClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1628:1: ( rule__ForClause__Group__0__Impl rule__ForClause__Group__1 )
            // InternalGo.g:1629:2: rule__ForClause__Group__0__Impl rule__ForClause__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ForClause__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForClause__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__0"


    // $ANTLR start "rule__ForClause__Group__0__Impl"
    // InternalGo.g:1636:1: rule__ForClause__Group__0__Impl : ( () ) ;
    public final void rule__ForClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1640:1: ( ( () ) )
            // InternalGo.g:1641:1: ( () )
            {
            // InternalGo.g:1641:1: ( () )
            // InternalGo.g:1642:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getForClauseAction_0()); 
            }
            // InternalGo.g:1643:2: ()
            // InternalGo.g:1643:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getForClauseAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__0__Impl"


    // $ANTLR start "rule__ForClause__Group__1"
    // InternalGo.g:1651:1: rule__ForClause__Group__1 : rule__ForClause__Group__1__Impl rule__ForClause__Group__2 ;
    public final void rule__ForClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1655:1: ( rule__ForClause__Group__1__Impl rule__ForClause__Group__2 )
            // InternalGo.g:1656:2: rule__ForClause__Group__1__Impl rule__ForClause__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ForClause__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForClause__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__1"


    // $ANTLR start "rule__ForClause__Group__1__Impl"
    // InternalGo.g:1663:1: rule__ForClause__Group__1__Impl : ( ( rule__ForClause__InitAssignment_1 )? ) ;
    public final void rule__ForClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1667:1: ( ( ( rule__ForClause__InitAssignment_1 )? ) )
            // InternalGo.g:1668:1: ( ( rule__ForClause__InitAssignment_1 )? )
            {
            // InternalGo.g:1668:1: ( ( rule__ForClause__InitAssignment_1 )? )
            // InternalGo.g:1669:2: ( rule__ForClause__InitAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getInitAssignment_1()); 
            }
            // InternalGo.g:1670:2: ( rule__ForClause__InitAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING_DECL)||(LA20_0>=20 && LA20_0<=21)||LA20_0==27||(LA20_0>=30 && LA20_0<=33)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGo.g:1670:3: rule__ForClause__InitAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForClause__InitAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getInitAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__1__Impl"


    // $ANTLR start "rule__ForClause__Group__2"
    // InternalGo.g:1678:1: rule__ForClause__Group__2 : rule__ForClause__Group__2__Impl rule__ForClause__Group__3 ;
    public final void rule__ForClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1682:1: ( rule__ForClause__Group__2__Impl rule__ForClause__Group__3 )
            // InternalGo.g:1683:2: rule__ForClause__Group__2__Impl rule__ForClause__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ForClause__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForClause__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__2"


    // $ANTLR start "rule__ForClause__Group__2__Impl"
    // InternalGo.g:1690:1: rule__ForClause__Group__2__Impl : ( ';' ) ;
    public final void rule__ForClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1694:1: ( ( ';' ) )
            // InternalGo.g:1695:1: ( ';' )
            {
            // InternalGo.g:1695:1: ( ';' )
            // InternalGo.g:1696:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getSemicolonKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__2__Impl"


    // $ANTLR start "rule__ForClause__Group__3"
    // InternalGo.g:1705:1: rule__ForClause__Group__3 : rule__ForClause__Group__3__Impl rule__ForClause__Group__4 ;
    public final void rule__ForClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1709:1: ( rule__ForClause__Group__3__Impl rule__ForClause__Group__4 )
            // InternalGo.g:1710:2: rule__ForClause__Group__3__Impl rule__ForClause__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ForClause__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForClause__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__3"


    // $ANTLR start "rule__ForClause__Group__3__Impl"
    // InternalGo.g:1717:1: rule__ForClause__Group__3__Impl : ( ( rule__ForClause__ConditionAssignment_3 )? ) ;
    public final void rule__ForClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1721:1: ( ( ( rule__ForClause__ConditionAssignment_3 )? ) )
            // InternalGo.g:1722:1: ( ( rule__ForClause__ConditionAssignment_3 )? )
            {
            // InternalGo.g:1722:1: ( ( rule__ForClause__ConditionAssignment_3 )? )
            // InternalGo.g:1723:2: ( rule__ForClause__ConditionAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getConditionAssignment_3()); 
            }
            // InternalGo.g:1724:2: ( rule__ForClause__ConditionAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING_DECL)||(LA21_0>=20 && LA21_0<=21)||LA21_0==27||(LA21_0>=30 && LA21_0<=33)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGo.g:1724:3: rule__ForClause__ConditionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForClause__ConditionAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getConditionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__3__Impl"


    // $ANTLR start "rule__ForClause__Group__4"
    // InternalGo.g:1732:1: rule__ForClause__Group__4 : rule__ForClause__Group__4__Impl rule__ForClause__Group__5 ;
    public final void rule__ForClause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1736:1: ( rule__ForClause__Group__4__Impl rule__ForClause__Group__5 )
            // InternalGo.g:1737:2: rule__ForClause__Group__4__Impl rule__ForClause__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ForClause__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForClause__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__4"


    // $ANTLR start "rule__ForClause__Group__4__Impl"
    // InternalGo.g:1744:1: rule__ForClause__Group__4__Impl : ( ';' ) ;
    public final void rule__ForClause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1748:1: ( ( ';' ) )
            // InternalGo.g:1749:1: ( ';' )
            {
            // InternalGo.g:1749:1: ( ';' )
            // InternalGo.g:1750:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getSemicolonKeyword_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__4__Impl"


    // $ANTLR start "rule__ForClause__Group__5"
    // InternalGo.g:1759:1: rule__ForClause__Group__5 : rule__ForClause__Group__5__Impl ;
    public final void rule__ForClause__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1763:1: ( rule__ForClause__Group__5__Impl )
            // InternalGo.g:1764:2: rule__ForClause__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForClause__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__5"


    // $ANTLR start "rule__ForClause__Group__5__Impl"
    // InternalGo.g:1770:1: rule__ForClause__Group__5__Impl : ( ( rule__ForClause__PostAssignment_5 )? ) ;
    public final void rule__ForClause__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1774:1: ( ( ( rule__ForClause__PostAssignment_5 )? ) )
            // InternalGo.g:1775:1: ( ( rule__ForClause__PostAssignment_5 )? )
            {
            // InternalGo.g:1775:1: ( ( rule__ForClause__PostAssignment_5 )? )
            // InternalGo.g:1776:2: ( rule__ForClause__PostAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getPostAssignment_5()); 
            }
            // InternalGo.g:1777:2: ( rule__ForClause__PostAssignment_5 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalGo.g:1777:3: rule__ForClause__PostAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForClause__PostAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getPostAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGo.g:1786:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1790:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGo.g:1791:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGo.g:1798:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__Expr1Assignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1802:1: ( ( ( rule__Condition__Expr1Assignment_0 ) ) )
            // InternalGo.g:1803:1: ( ( rule__Condition__Expr1Assignment_0 ) )
            {
            // InternalGo.g:1803:1: ( ( rule__Condition__Expr1Assignment_0 ) )
            // InternalGo.g:1804:2: ( rule__Condition__Expr1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpr1Assignment_0()); 
            }
            // InternalGo.g:1805:2: ( rule__Condition__Expr1Assignment_0 )
            // InternalGo.g:1805:3: rule__Condition__Expr1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Expr1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpr1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGo.g:1813:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1817:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGo.g:1818:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGo.g:1825:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ComparadorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1829:1: ( ( ( rule__Condition__ComparadorAssignment_1 ) ) )
            // InternalGo.g:1830:1: ( ( rule__Condition__ComparadorAssignment_1 ) )
            {
            // InternalGo.g:1830:1: ( ( rule__Condition__ComparadorAssignment_1 ) )
            // InternalGo.g:1831:2: ( rule__Condition__ComparadorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getComparadorAssignment_1()); 
            }
            // InternalGo.g:1832:2: ( rule__Condition__ComparadorAssignment_1 )
            // InternalGo.g:1832:3: rule__Condition__ComparadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ComparadorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getComparadorAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalGo.g:1840:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1844:1: ( rule__Condition__Group__2__Impl )
            // InternalGo.g:1845:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalGo.g:1851:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__Expr2Assignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1855:1: ( ( ( rule__Condition__Expr2Assignment_2 ) ) )
            // InternalGo.g:1856:1: ( ( rule__Condition__Expr2Assignment_2 ) )
            {
            // InternalGo.g:1856:1: ( ( rule__Condition__Expr2Assignment_2 ) )
            // InternalGo.g:1857:2: ( rule__Condition__Expr2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpr2Assignment_2()); 
            }
            // InternalGo.g:1858:2: ( rule__Condition__Expr2Assignment_2 )
            // InternalGo.g:1858:3: rule__Condition__Expr2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Expr2Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpr2Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__IDList__Group_1__0"
    // InternalGo.g:1867:1: rule__IDList__Group_1__0 : rule__IDList__Group_1__0__Impl rule__IDList__Group_1__1 ;
    public final void rule__IDList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1871:1: ( rule__IDList__Group_1__0__Impl rule__IDList__Group_1__1 )
            // InternalGo.g:1872:2: rule__IDList__Group_1__0__Impl rule__IDList__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__IDList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IDList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__Group_1__0"


    // $ANTLR start "rule__IDList__Group_1__0__Impl"
    // InternalGo.g:1879:1: rule__IDList__Group_1__0__Impl : ( ( rule__IDList__IdListAssignment_1_0 ) ) ;
    public final void rule__IDList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1883:1: ( ( ( rule__IDList__IdListAssignment_1_0 ) ) )
            // InternalGo.g:1884:1: ( ( rule__IDList__IdListAssignment_1_0 ) )
            {
            // InternalGo.g:1884:1: ( ( rule__IDList__IdListAssignment_1_0 ) )
            // InternalGo.g:1885:2: ( rule__IDList__IdListAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDListAccess().getIdListAssignment_1_0()); 
            }
            // InternalGo.g:1886:2: ( rule__IDList__IdListAssignment_1_0 )
            // InternalGo.g:1886:3: rule__IDList__IdListAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__IDList__IdListAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDListAccess().getIdListAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__Group_1__0__Impl"


    // $ANTLR start "rule__IDList__Group_1__1"
    // InternalGo.g:1894:1: rule__IDList__Group_1__1 : rule__IDList__Group_1__1__Impl rule__IDList__Group_1__2 ;
    public final void rule__IDList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1898:1: ( rule__IDList__Group_1__1__Impl rule__IDList__Group_1__2 )
            // InternalGo.g:1899:2: rule__IDList__Group_1__1__Impl rule__IDList__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__IDList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IDList__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__Group_1__1"


    // $ANTLR start "rule__IDList__Group_1__1__Impl"
    // InternalGo.g:1906:1: rule__IDList__Group_1__1__Impl : ( ',' ) ;
    public final void rule__IDList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1910:1: ( ( ',' ) )
            // InternalGo.g:1911:1: ( ',' )
            {
            // InternalGo.g:1911:1: ( ',' )
            // InternalGo.g:1912:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDListAccess().getCommaKeyword_1_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDListAccess().getCommaKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__Group_1__1__Impl"


    // $ANTLR start "rule__IDList__Group_1__2"
    // InternalGo.g:1921:1: rule__IDList__Group_1__2 : rule__IDList__Group_1__2__Impl ;
    public final void rule__IDList__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1925:1: ( rule__IDList__Group_1__2__Impl )
            // InternalGo.g:1926:2: rule__IDList__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IDList__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__Group_1__2"


    // $ANTLR start "rule__IDList__Group_1__2__Impl"
    // InternalGo.g:1932:1: rule__IDList__Group_1__2__Impl : ( ( rule__IDList__ListAssignment_1_2 ) ) ;
    public final void rule__IDList__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1936:1: ( ( ( rule__IDList__ListAssignment_1_2 ) ) )
            // InternalGo.g:1937:1: ( ( rule__IDList__ListAssignment_1_2 ) )
            {
            // InternalGo.g:1937:1: ( ( rule__IDList__ListAssignment_1_2 ) )
            // InternalGo.g:1938:2: ( rule__IDList__ListAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDListAccess().getListAssignment_1_2()); 
            }
            // InternalGo.g:1939:2: ( rule__IDList__ListAssignment_1_2 )
            // InternalGo.g:1939:3: rule__IDList__ListAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__IDList__ListAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDListAccess().getListAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__Group_1__2__Impl"


    // $ANTLR start "rule__VarDecl__Group__0"
    // InternalGo.g:1948:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1952:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // InternalGo.g:1953:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__VarDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__0"


    // $ANTLR start "rule__VarDecl__Group__0__Impl"
    // InternalGo.g:1960:1: rule__VarDecl__Group__0__Impl : ( ( rule__VarDecl__SignatureAssignment_0 ) ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1964:1: ( ( ( rule__VarDecl__SignatureAssignment_0 ) ) )
            // InternalGo.g:1965:1: ( ( rule__VarDecl__SignatureAssignment_0 ) )
            {
            // InternalGo.g:1965:1: ( ( rule__VarDecl__SignatureAssignment_0 ) )
            // InternalGo.g:1966:2: ( rule__VarDecl__SignatureAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getSignatureAssignment_0()); 
            }
            // InternalGo.g:1967:2: ( rule__VarDecl__SignatureAssignment_0 )
            // InternalGo.g:1967:3: rule__VarDecl__SignatureAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__SignatureAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getSignatureAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__0__Impl"


    // $ANTLR start "rule__VarDecl__Group__1"
    // InternalGo.g:1975:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1979:1: ( rule__VarDecl__Group__1__Impl )
            // InternalGo.g:1980:2: rule__VarDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__1"


    // $ANTLR start "rule__VarDecl__Group__1__Impl"
    // InternalGo.g:1986:1: rule__VarDecl__Group__1__Impl : ( ( rule__VarDecl__Group_1__0 )? ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:1990:1: ( ( ( rule__VarDecl__Group_1__0 )? ) )
            // InternalGo.g:1991:1: ( ( rule__VarDecl__Group_1__0 )? )
            {
            // InternalGo.g:1991:1: ( ( rule__VarDecl__Group_1__0 )? )
            // InternalGo.g:1992:2: ( rule__VarDecl__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getGroup_1()); 
            }
            // InternalGo.g:1993:2: ( rule__VarDecl__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=34 && LA23_0<=35)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGo.g:1993:3: rule__VarDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDecl__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group__1__Impl"


    // $ANTLR start "rule__VarDecl__Group_1__0"
    // InternalGo.g:2002:1: rule__VarDecl__Group_1__0 : rule__VarDecl__Group_1__0__Impl rule__VarDecl__Group_1__1 ;
    public final void rule__VarDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2006:1: ( rule__VarDecl__Group_1__0__Impl rule__VarDecl__Group_1__1 )
            // InternalGo.g:2007:2: rule__VarDecl__Group_1__0__Impl rule__VarDecl__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__VarDecl__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDecl__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__0"


    // $ANTLR start "rule__VarDecl__Group_1__0__Impl"
    // InternalGo.g:2014:1: rule__VarDecl__Group_1__0__Impl : ( ( rule__VarDecl__Alternatives_1_0 ) ) ;
    public final void rule__VarDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2018:1: ( ( ( rule__VarDecl__Alternatives_1_0 ) ) )
            // InternalGo.g:2019:1: ( ( rule__VarDecl__Alternatives_1_0 ) )
            {
            // InternalGo.g:2019:1: ( ( rule__VarDecl__Alternatives_1_0 ) )
            // InternalGo.g:2020:2: ( rule__VarDecl__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getAlternatives_1_0()); 
            }
            // InternalGo.g:2021:2: ( rule__VarDecl__Alternatives_1_0 )
            // InternalGo.g:2021:3: rule__VarDecl__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__0__Impl"


    // $ANTLR start "rule__VarDecl__Group_1__1"
    // InternalGo.g:2029:1: rule__VarDecl__Group_1__1 : rule__VarDecl__Group_1__1__Impl rule__VarDecl__Group_1__2 ;
    public final void rule__VarDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2033:1: ( rule__VarDecl__Group_1__1__Impl rule__VarDecl__Group_1__2 )
            // InternalGo.g:2034:2: rule__VarDecl__Group_1__1__Impl rule__VarDecl__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__VarDecl__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDecl__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__1"


    // $ANTLR start "rule__VarDecl__Group_1__1__Impl"
    // InternalGo.g:2041:1: rule__VarDecl__Group_1__1__Impl : ( ( rule__VarDecl__ArrayAssignment_1_1 )? ) ;
    public final void rule__VarDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2045:1: ( ( ( rule__VarDecl__ArrayAssignment_1_1 )? ) )
            // InternalGo.g:2046:1: ( ( rule__VarDecl__ArrayAssignment_1_1 )? )
            {
            // InternalGo.g:2046:1: ( ( rule__VarDecl__ArrayAssignment_1_1 )? )
            // InternalGo.g:2047:2: ( rule__VarDecl__ArrayAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getArrayAssignment_1_1()); 
            }
            // InternalGo.g:2048:2: ( rule__VarDecl__ArrayAssignment_1_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGo.g:2048:3: rule__VarDecl__ArrayAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDecl__ArrayAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getArrayAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__1__Impl"


    // $ANTLR start "rule__VarDecl__Group_1__2"
    // InternalGo.g:2056:1: rule__VarDecl__Group_1__2 : rule__VarDecl__Group_1__2__Impl ;
    public final void rule__VarDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2060:1: ( rule__VarDecl__Group_1__2__Impl )
            // InternalGo.g:2061:2: rule__VarDecl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__2"


    // $ANTLR start "rule__VarDecl__Group_1__2__Impl"
    // InternalGo.g:2067:1: rule__VarDecl__Group_1__2__Impl : ( ( rule__VarDecl__ExpressaoAssignment_1_2 ) ) ;
    public final void rule__VarDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2071:1: ( ( ( rule__VarDecl__ExpressaoAssignment_1_2 ) ) )
            // InternalGo.g:2072:1: ( ( rule__VarDecl__ExpressaoAssignment_1_2 ) )
            {
            // InternalGo.g:2072:1: ( ( rule__VarDecl__ExpressaoAssignment_1_2 ) )
            // InternalGo.g:2073:2: ( rule__VarDecl__ExpressaoAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getExpressaoAssignment_1_2()); 
            }
            // InternalGo.g:2074:2: ( rule__VarDecl__ExpressaoAssignment_1_2 )
            // InternalGo.g:2074:3: rule__VarDecl__ExpressaoAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__VarDecl__ExpressaoAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getExpressaoAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__Group_1__2__Impl"


    // $ANTLR start "rule__SignatureDel__Group__0"
    // InternalGo.g:2083:1: rule__SignatureDel__Group__0 : rule__SignatureDel__Group__0__Impl rule__SignatureDel__Group__1 ;
    public final void rule__SignatureDel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2087:1: ( rule__SignatureDel__Group__0__Impl rule__SignatureDel__Group__1 )
            // InternalGo.g:2088:2: rule__SignatureDel__Group__0__Impl rule__SignatureDel__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SignatureDel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SignatureDel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDel__Group__0"


    // $ANTLR start "rule__SignatureDel__Group__0__Impl"
    // InternalGo.g:2095:1: rule__SignatureDel__Group__0__Impl : ( ( rule__SignatureDel__TipoDeclAssignment_0 )? ) ;
    public final void rule__SignatureDel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2099:1: ( ( ( rule__SignatureDel__TipoDeclAssignment_0 )? ) )
            // InternalGo.g:2100:1: ( ( rule__SignatureDel__TipoDeclAssignment_0 )? )
            {
            // InternalGo.g:2100:1: ( ( rule__SignatureDel__TipoDeclAssignment_0 )? )
            // InternalGo.g:2101:2: ( rule__SignatureDel__TipoDeclAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureDelAccess().getTipoDeclAssignment_0()); 
            }
            // InternalGo.g:2102:2: ( rule__SignatureDel__TipoDeclAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=32 && LA25_0<=33)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGo.g:2102:3: rule__SignatureDel__TipoDeclAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SignatureDel__TipoDeclAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureDelAccess().getTipoDeclAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDel__Group__0__Impl"


    // $ANTLR start "rule__SignatureDel__Group__1"
    // InternalGo.g:2110:1: rule__SignatureDel__Group__1 : rule__SignatureDel__Group__1__Impl rule__SignatureDel__Group__2 ;
    public final void rule__SignatureDel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2114:1: ( rule__SignatureDel__Group__1__Impl rule__SignatureDel__Group__2 )
            // InternalGo.g:2115:2: rule__SignatureDel__Group__1__Impl rule__SignatureDel__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SignatureDel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SignatureDel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDel__Group__1"


    // $ANTLR start "rule__SignatureDel__Group__1__Impl"
    // InternalGo.g:2122:1: rule__SignatureDel__Group__1__Impl : ( ( rule__SignatureDel__IdAssignment_1 ) ) ;
    public final void rule__SignatureDel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2126:1: ( ( ( rule__SignatureDel__IdAssignment_1 ) ) )
            // InternalGo.g:2127:1: ( ( rule__SignatureDel__IdAssignment_1 ) )
            {
            // InternalGo.g:2127:1: ( ( rule__SignatureDel__IdAssignment_1 ) )
            // InternalGo.g:2128:2: ( rule__SignatureDel__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureDelAccess().getIdAssignment_1()); 
            }
            // InternalGo.g:2129:2: ( rule__SignatureDel__IdAssignment_1 )
            // InternalGo.g:2129:3: rule__SignatureDel__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SignatureDel__IdAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureDelAccess().getIdAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDel__Group__1__Impl"


    // $ANTLR start "rule__SignatureDel__Group__2"
    // InternalGo.g:2137:1: rule__SignatureDel__Group__2 : rule__SignatureDel__Group__2__Impl ;
    public final void rule__SignatureDel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2141:1: ( rule__SignatureDel__Group__2__Impl )
            // InternalGo.g:2142:2: rule__SignatureDel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignatureDel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDel__Group__2"


    // $ANTLR start "rule__SignatureDel__Group__2__Impl"
    // InternalGo.g:2148:1: rule__SignatureDel__Group__2__Impl : ( ( rule__SignatureDel__TypeAssignment_2 )? ) ;
    public final void rule__SignatureDel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2152:1: ( ( ( rule__SignatureDel__TypeAssignment_2 )? ) )
            // InternalGo.g:2153:1: ( ( rule__SignatureDel__TypeAssignment_2 )? )
            {
            // InternalGo.g:2153:1: ( ( rule__SignatureDel__TypeAssignment_2 )? )
            // InternalGo.g:2154:2: ( rule__SignatureDel__TypeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureDelAccess().getTypeAssignment_2()); 
            }
            // InternalGo.g:2155:2: ( rule__SignatureDel__TypeAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25||(LA26_0>=36 && LA26_0<=39)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGo.g:2155:3: rule__SignatureDel__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SignatureDel__TypeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureDelAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDel__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalGo.g:2164:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2168:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalGo.g:2169:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalGo.g:2176:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__IdAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2180:1: ( ( ( rule__Assignment__IdAssignment_0 ) ) )
            // InternalGo.g:2181:1: ( ( rule__Assignment__IdAssignment_0 ) )
            {
            // InternalGo.g:2181:1: ( ( rule__Assignment__IdAssignment_0 ) )
            // InternalGo.g:2182:2: ( rule__Assignment__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getIdAssignment_0()); 
            }
            // InternalGo.g:2183:2: ( rule__Assignment__IdAssignment_0 )
            // InternalGo.g:2183:3: rule__Assignment__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__IdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalGo.g:2191:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2195:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalGo.g:2196:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalGo.g:2203:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Group_1__0 )? ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2207:1: ( ( ( rule__Assignment__Group_1__0 )? ) )
            // InternalGo.g:2208:1: ( ( rule__Assignment__Group_1__0 )? )
            {
            // InternalGo.g:2208:1: ( ( rule__Assignment__Group_1__0 )? )
            // InternalGo.g:2209:2: ( rule__Assignment__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }
            // InternalGo.g:2210:2: ( rule__Assignment__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGo.g:2210:3: rule__Assignment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalGo.g:2218:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2222:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalGo.g:2223:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalGo.g:2230:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__Alternatives_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2234:1: ( ( ( rule__Assignment__Alternatives_2 ) ) )
            // InternalGo.g:2235:1: ( ( rule__Assignment__Alternatives_2 ) )
            {
            // InternalGo.g:2235:1: ( ( rule__Assignment__Alternatives_2 ) )
            // InternalGo.g:2236:2: ( rule__Assignment__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAlternatives_2()); 
            }
            // InternalGo.g:2237:2: ( rule__Assignment__Alternatives_2 )
            // InternalGo.g:2237:3: rule__Assignment__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // InternalGo.g:2245:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2249:1: ( rule__Assignment__Group__3__Impl )
            // InternalGo.g:2250:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // InternalGo.g:2256:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ExpressaoAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2260:1: ( ( ( rule__Assignment__ExpressaoAssignment_3 ) ) )
            // InternalGo.g:2261:1: ( ( rule__Assignment__ExpressaoAssignment_3 ) )
            {
            // InternalGo.g:2261:1: ( ( rule__Assignment__ExpressaoAssignment_3 ) )
            // InternalGo.g:2262:2: ( rule__Assignment__ExpressaoAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressaoAssignment_3()); 
            }
            // InternalGo.g:2263:2: ( rule__Assignment__ExpressaoAssignment_3 )
            // InternalGo.g:2263:3: rule__Assignment__ExpressaoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ExpressaoAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressaoAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group_1__0"
    // InternalGo.g:2272:1: rule__Assignment__Group_1__0 : rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 ;
    public final void rule__Assignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2276:1: ( rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1 )
            // InternalGo.g:2277:2: rule__Assignment__Group_1__0__Impl rule__Assignment__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Assignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__0"


    // $ANTLR start "rule__Assignment__Group_1__0__Impl"
    // InternalGo.g:2284:1: rule__Assignment__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Assignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2288:1: ( ( '[' ) )
            // InternalGo.g:2289:1: ( '[' )
            {
            // InternalGo.g:2289:1: ( '[' )
            // InternalGo.g:2290:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1__1"
    // InternalGo.g:2299:1: rule__Assignment__Group_1__1 : rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 ;
    public final void rule__Assignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2303:1: ( rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2 )
            // InternalGo.g:2304:2: rule__Assignment__Group_1__1__Impl rule__Assignment__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Assignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__1"


    // $ANTLR start "rule__Assignment__Group_1__1__Impl"
    // InternalGo.g:2311:1: rule__Assignment__Group_1__1__Impl : ( ( rule__Assignment__QtdAssignment_1_1 ) ) ;
    public final void rule__Assignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2315:1: ( ( ( rule__Assignment__QtdAssignment_1_1 ) ) )
            // InternalGo.g:2316:1: ( ( rule__Assignment__QtdAssignment_1_1 ) )
            {
            // InternalGo.g:2316:1: ( ( rule__Assignment__QtdAssignment_1_1 ) )
            // InternalGo.g:2317:2: ( rule__Assignment__QtdAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getQtdAssignment_1_1()); 
            }
            // InternalGo.g:2318:2: ( rule__Assignment__QtdAssignment_1_1 )
            // InternalGo.g:2318:3: rule__Assignment__QtdAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__QtdAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getQtdAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group_1__2"
    // InternalGo.g:2326:1: rule__Assignment__Group_1__2 : rule__Assignment__Group_1__2__Impl ;
    public final void rule__Assignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2330:1: ( rule__Assignment__Group_1__2__Impl )
            // InternalGo.g:2331:2: rule__Assignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__2"


    // $ANTLR start "rule__Assignment__Group_1__2__Impl"
    // InternalGo.g:2337:1: rule__Assignment__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Assignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2341:1: ( ( ']' ) )
            // InternalGo.g:2342:1: ( ']' )
            {
            // InternalGo.g:2342:1: ( ']' )
            // InternalGo.g:2343:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1__2__Impl"


    // $ANTLR start "rule__EXPRESSAOLINHA__Group_0__0"
    // InternalGo.g:2353:1: rule__EXPRESSAOLINHA__Group_0__0 : rule__EXPRESSAOLINHA__Group_0__0__Impl rule__EXPRESSAOLINHA__Group_0__1 ;
    public final void rule__EXPRESSAOLINHA__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2357:1: ( rule__EXPRESSAOLINHA__Group_0__0__Impl rule__EXPRESSAOLINHA__Group_0__1 )
            // InternalGo.g:2358:2: rule__EXPRESSAOLINHA__Group_0__0__Impl rule__EXPRESSAOLINHA__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__EXPRESSAOLINHA__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EXPRESSAOLINHA__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAOLINHA__Group_0__0"


    // $ANTLR start "rule__EXPRESSAOLINHA__Group_0__0__Impl"
    // InternalGo.g:2365:1: rule__EXPRESSAOLINHA__Group_0__0__Impl : ( ( rule__EXPRESSAOLINHA__ExpAssignment_0_0 ) ) ;
    public final void rule__EXPRESSAOLINHA__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2369:1: ( ( ( rule__EXPRESSAOLINHA__ExpAssignment_0_0 ) ) )
            // InternalGo.g:2370:1: ( ( rule__EXPRESSAOLINHA__ExpAssignment_0_0 ) )
            {
            // InternalGo.g:2370:1: ( ( rule__EXPRESSAOLINHA__ExpAssignment_0_0 ) )
            // InternalGo.g:2371:2: ( rule__EXPRESSAOLINHA__ExpAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOLINHAAccess().getExpAssignment_0_0()); 
            }
            // InternalGo.g:2372:2: ( rule__EXPRESSAOLINHA__ExpAssignment_0_0 )
            // InternalGo.g:2372:3: rule__EXPRESSAOLINHA__ExpAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSAOLINHA__ExpAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOLINHAAccess().getExpAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAOLINHA__Group_0__0__Impl"


    // $ANTLR start "rule__EXPRESSAOLINHA__Group_0__1"
    // InternalGo.g:2380:1: rule__EXPRESSAOLINHA__Group_0__1 : rule__EXPRESSAOLINHA__Group_0__1__Impl ;
    public final void rule__EXPRESSAOLINHA__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2384:1: ( rule__EXPRESSAOLINHA__Group_0__1__Impl )
            // InternalGo.g:2385:2: rule__EXPRESSAOLINHA__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSAOLINHA__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAOLINHA__Group_0__1"


    // $ANTLR start "rule__EXPRESSAOLINHA__Group_0__1__Impl"
    // InternalGo.g:2391:1: rule__EXPRESSAOLINHA__Group_0__1__Impl : ( ( rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1 ) ) ;
    public final void rule__EXPRESSAOLINHA__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2395:1: ( ( ( rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1 ) ) )
            // InternalGo.g:2396:1: ( ( rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1 ) )
            {
            // InternalGo.g:2396:1: ( ( rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1 ) )
            // InternalGo.g:2397:2: ( rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOLINHAAccess().getExplinhaAssignment_0_1()); 
            }
            // InternalGo.g:2398:2: ( rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1 )
            // InternalGo.g:2398:3: rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOLINHAAccess().getExplinhaAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAOLINHA__Group_0__1__Impl"


    // $ANTLR start "rule__EXPRESSAO__Group_0__0"
    // InternalGo.g:2407:1: rule__EXPRESSAO__Group_0__0 : rule__EXPRESSAO__Group_0__0__Impl rule__EXPRESSAO__Group_0__1 ;
    public final void rule__EXPRESSAO__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2411:1: ( rule__EXPRESSAO__Group_0__0__Impl rule__EXPRESSAO__Group_0__1 )
            // InternalGo.g:2412:2: rule__EXPRESSAO__Group_0__0__Impl rule__EXPRESSAO__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__EXPRESSAO__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EXPRESSAO__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__Group_0__0"


    // $ANTLR start "rule__EXPRESSAO__Group_0__0__Impl"
    // InternalGo.g:2419:1: rule__EXPRESSAO__Group_0__0__Impl : ( () ) ;
    public final void rule__EXPRESSAO__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2423:1: ( ( () ) )
            // InternalGo.g:2424:1: ( () )
            {
            // InternalGo.g:2424:1: ( () )
            // InternalGo.g:2425:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getEXPRESSAOAction_0_0()); 
            }
            // InternalGo.g:2426:2: ()
            // InternalGo.g:2426:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getEXPRESSAOAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__Group_0__0__Impl"


    // $ANTLR start "rule__EXPRESSAO__Group_0__1"
    // InternalGo.g:2434:1: rule__EXPRESSAO__Group_0__1 : rule__EXPRESSAO__Group_0__1__Impl ;
    public final void rule__EXPRESSAO__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2438:1: ( rule__EXPRESSAO__Group_0__1__Impl )
            // InternalGo.g:2439:2: rule__EXPRESSAO__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSAO__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__Group_0__1"


    // $ANTLR start "rule__EXPRESSAO__Group_0__1__Impl"
    // InternalGo.g:2445:1: rule__EXPRESSAO__Group_0__1__Impl : ( ( rule__EXPRESSAO__DeclFunctionAssignment_0_1 ) ) ;
    public final void rule__EXPRESSAO__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2449:1: ( ( ( rule__EXPRESSAO__DeclFunctionAssignment_0_1 ) ) )
            // InternalGo.g:2450:1: ( ( rule__EXPRESSAO__DeclFunctionAssignment_0_1 ) )
            {
            // InternalGo.g:2450:1: ( ( rule__EXPRESSAO__DeclFunctionAssignment_0_1 ) )
            // InternalGo.g:2451:2: ( rule__EXPRESSAO__DeclFunctionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getDeclFunctionAssignment_0_1()); 
            }
            // InternalGo.g:2452:2: ( rule__EXPRESSAO__DeclFunctionAssignment_0_1 )
            // InternalGo.g:2452:3: rule__EXPRESSAO__DeclFunctionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EXPRESSAO__DeclFunctionAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getDeclFunctionAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__Group_0__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalGo.g:2461:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2465:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalGo.g:2466:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ArrayValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__0"


    // $ANTLR start "rule__ArrayValue__Group__0__Impl"
    // InternalGo.g:2473:1: rule__ArrayValue__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2477:1: ( ( '{' ) )
            // InternalGo.g:2478:1: ( '{' )
            {
            // InternalGo.g:2478:1: ( '{' )
            // InternalGo.g:2479:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group__1"
    // InternalGo.g:2488:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2492:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalGo.g:2493:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ArrayValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__1"


    // $ANTLR start "rule__ArrayValue__Group__1__Impl"
    // InternalGo.g:2500:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__LitAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2504:1: ( ( ( rule__ArrayValue__LitAssignment_1 ) ) )
            // InternalGo.g:2505:1: ( ( rule__ArrayValue__LitAssignment_1 ) )
            {
            // InternalGo.g:2505:1: ( ( rule__ArrayValue__LitAssignment_1 ) )
            // InternalGo.g:2506:2: ( rule__ArrayValue__LitAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getLitAssignment_1()); 
            }
            // InternalGo.g:2507:2: ( rule__ArrayValue__LitAssignment_1 )
            // InternalGo.g:2507:3: rule__ArrayValue__LitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__LitAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getLitAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group__2"
    // InternalGo.g:2515:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2519:1: ( rule__ArrayValue__Group__2__Impl )
            // InternalGo.g:2520:2: rule__ArrayValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__2"


    // $ANTLR start "rule__ArrayValue__Group__2__Impl"
    // InternalGo.g:2526:1: rule__ArrayValue__Group__2__Impl : ( '}' ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2530:1: ( ( '}' ) )
            // InternalGo.g:2531:1: ( '}' )
            {
            // InternalGo.g:2531:1: ( '}' )
            // InternalGo.g:2532:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getRightCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__2__Impl"


    // $ANTLR start "rule__LiteraisList__Group_1__0"
    // InternalGo.g:2542:1: rule__LiteraisList__Group_1__0 : rule__LiteraisList__Group_1__0__Impl rule__LiteraisList__Group_1__1 ;
    public final void rule__LiteraisList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2546:1: ( rule__LiteraisList__Group_1__0__Impl rule__LiteraisList__Group_1__1 )
            // InternalGo.g:2547:2: rule__LiteraisList__Group_1__0__Impl rule__LiteraisList__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__LiteraisList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LiteraisList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__Group_1__0"


    // $ANTLR start "rule__LiteraisList__Group_1__0__Impl"
    // InternalGo.g:2554:1: rule__LiteraisList__Group_1__0__Impl : ( ( rule__LiteraisList__LitAssignment_1_0 ) ) ;
    public final void rule__LiteraisList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2558:1: ( ( ( rule__LiteraisList__LitAssignment_1_0 ) ) )
            // InternalGo.g:2559:1: ( ( rule__LiteraisList__LitAssignment_1_0 ) )
            {
            // InternalGo.g:2559:1: ( ( rule__LiteraisList__LitAssignment_1_0 ) )
            // InternalGo.g:2560:2: ( rule__LiteraisList__LitAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteraisListAccess().getLitAssignment_1_0()); 
            }
            // InternalGo.g:2561:2: ( rule__LiteraisList__LitAssignment_1_0 )
            // InternalGo.g:2561:3: rule__LiteraisList__LitAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LiteraisList__LitAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteraisListAccess().getLitAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__Group_1__0__Impl"


    // $ANTLR start "rule__LiteraisList__Group_1__1"
    // InternalGo.g:2569:1: rule__LiteraisList__Group_1__1 : rule__LiteraisList__Group_1__1__Impl rule__LiteraisList__Group_1__2 ;
    public final void rule__LiteraisList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2573:1: ( rule__LiteraisList__Group_1__1__Impl rule__LiteraisList__Group_1__2 )
            // InternalGo.g:2574:2: rule__LiteraisList__Group_1__1__Impl rule__LiteraisList__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__LiteraisList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LiteraisList__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__Group_1__1"


    // $ANTLR start "rule__LiteraisList__Group_1__1__Impl"
    // InternalGo.g:2581:1: rule__LiteraisList__Group_1__1__Impl : ( ',' ) ;
    public final void rule__LiteraisList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2585:1: ( ( ',' ) )
            // InternalGo.g:2586:1: ( ',' )
            {
            // InternalGo.g:2586:1: ( ',' )
            // InternalGo.g:2587:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteraisListAccess().getCommaKeyword_1_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteraisListAccess().getCommaKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__Group_1__1__Impl"


    // $ANTLR start "rule__LiteraisList__Group_1__2"
    // InternalGo.g:2596:1: rule__LiteraisList__Group_1__2 : rule__LiteraisList__Group_1__2__Impl ;
    public final void rule__LiteraisList__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2600:1: ( rule__LiteraisList__Group_1__2__Impl )
            // InternalGo.g:2601:2: rule__LiteraisList__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteraisList__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__Group_1__2"


    // $ANTLR start "rule__LiteraisList__Group_1__2__Impl"
    // InternalGo.g:2607:1: rule__LiteraisList__Group_1__2__Impl : ( ( rule__LiteraisList__LitAssignment_1_2 ) ) ;
    public final void rule__LiteraisList__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2611:1: ( ( ( rule__LiteraisList__LitAssignment_1_2 ) ) )
            // InternalGo.g:2612:1: ( ( rule__LiteraisList__LitAssignment_1_2 ) )
            {
            // InternalGo.g:2612:1: ( ( rule__LiteraisList__LitAssignment_1_2 ) )
            // InternalGo.g:2613:2: ( rule__LiteraisList__LitAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteraisListAccess().getLitAssignment_1_2()); 
            }
            // InternalGo.g:2614:2: ( rule__LiteraisList__LitAssignment_1_2 )
            // InternalGo.g:2614:3: rule__LiteraisList__LitAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LiteraisList__LitAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteraisListAccess().getLitAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__Group_1__2__Impl"


    // $ANTLR start "rule__BINARY_EXP__Group_0__0"
    // InternalGo.g:2623:1: rule__BINARY_EXP__Group_0__0 : rule__BINARY_EXP__Group_0__0__Impl rule__BINARY_EXP__Group_0__1 ;
    public final void rule__BINARY_EXP__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2627:1: ( rule__BINARY_EXP__Group_0__0__Impl rule__BINARY_EXP__Group_0__1 )
            // InternalGo.g:2628:2: rule__BINARY_EXP__Group_0__0__Impl rule__BINARY_EXP__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__BINARY_EXP__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BINARY_EXP__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__Group_0__0"


    // $ANTLR start "rule__BINARY_EXP__Group_0__0__Impl"
    // InternalGo.g:2635:1: rule__BINARY_EXP__Group_0__0__Impl : ( ( rule__BINARY_EXP__BasicAssignment_0_0 ) ) ;
    public final void rule__BINARY_EXP__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2639:1: ( ( ( rule__BINARY_EXP__BasicAssignment_0_0 ) ) )
            // InternalGo.g:2640:1: ( ( rule__BINARY_EXP__BasicAssignment_0_0 ) )
            {
            // InternalGo.g:2640:1: ( ( rule__BINARY_EXP__BasicAssignment_0_0 ) )
            // InternalGo.g:2641:2: ( rule__BINARY_EXP__BasicAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPAccess().getBasicAssignment_0_0()); 
            }
            // InternalGo.g:2642:2: ( rule__BINARY_EXP__BasicAssignment_0_0 )
            // InternalGo.g:2642:3: rule__BINARY_EXP__BasicAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BINARY_EXP__BasicAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPAccess().getBasicAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__Group_0__0__Impl"


    // $ANTLR start "rule__BINARY_EXP__Group_0__1"
    // InternalGo.g:2650:1: rule__BINARY_EXP__Group_0__1 : rule__BINARY_EXP__Group_0__1__Impl rule__BINARY_EXP__Group_0__2 ;
    public final void rule__BINARY_EXP__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2654:1: ( rule__BINARY_EXP__Group_0__1__Impl rule__BINARY_EXP__Group_0__2 )
            // InternalGo.g:2655:2: rule__BINARY_EXP__Group_0__1__Impl rule__BINARY_EXP__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__BINARY_EXP__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BINARY_EXP__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__Group_0__1"


    // $ANTLR start "rule__BINARY_EXP__Group_0__1__Impl"
    // InternalGo.g:2662:1: rule__BINARY_EXP__Group_0__1__Impl : ( ( rule__BINARY_EXP__Alternatives_0_1 ) ) ;
    public final void rule__BINARY_EXP__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2666:1: ( ( ( rule__BINARY_EXP__Alternatives_0_1 ) ) )
            // InternalGo.g:2667:1: ( ( rule__BINARY_EXP__Alternatives_0_1 ) )
            {
            // InternalGo.g:2667:1: ( ( rule__BINARY_EXP__Alternatives_0_1 ) )
            // InternalGo.g:2668:2: ( rule__BINARY_EXP__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPAccess().getAlternatives_0_1()); 
            }
            // InternalGo.g:2669:2: ( rule__BINARY_EXP__Alternatives_0_1 )
            // InternalGo.g:2669:3: rule__BINARY_EXP__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BINARY_EXP__Alternatives_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPAccess().getAlternatives_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__Group_0__1__Impl"


    // $ANTLR start "rule__BINARY_EXP__Group_0__2"
    // InternalGo.g:2677:1: rule__BINARY_EXP__Group_0__2 : rule__BINARY_EXP__Group_0__2__Impl ;
    public final void rule__BINARY_EXP__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2681:1: ( rule__BINARY_EXP__Group_0__2__Impl )
            // InternalGo.g:2682:2: rule__BINARY_EXP__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BINARY_EXP__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__Group_0__2"


    // $ANTLR start "rule__BINARY_EXP__Group_0__2__Impl"
    // InternalGo.g:2688:1: rule__BINARY_EXP__Group_0__2__Impl : ( ( rule__BINARY_EXP__BinabasicAssignment_0_2 ) ) ;
    public final void rule__BINARY_EXP__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2692:1: ( ( ( rule__BINARY_EXP__BinabasicAssignment_0_2 ) ) )
            // InternalGo.g:2693:1: ( ( rule__BINARY_EXP__BinabasicAssignment_0_2 ) )
            {
            // InternalGo.g:2693:1: ( ( rule__BINARY_EXP__BinabasicAssignment_0_2 ) )
            // InternalGo.g:2694:2: ( rule__BINARY_EXP__BinabasicAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPAccess().getBinabasicAssignment_0_2()); 
            }
            // InternalGo.g:2695:2: ( rule__BINARY_EXP__BinabasicAssignment_0_2 )
            // InternalGo.g:2695:3: rule__BINARY_EXP__BinabasicAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__BINARY_EXP__BinabasicAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPAccess().getBinabasicAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__Group_0__2__Impl"


    // $ANTLR start "rule__FunctionType__Group__0"
    // InternalGo.g:2704:1: rule__FunctionType__Group__0 : rule__FunctionType__Group__0__Impl rule__FunctionType__Group__1 ;
    public final void rule__FunctionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2708:1: ( rule__FunctionType__Group__0__Impl rule__FunctionType__Group__1 )
            // InternalGo.g:2709:2: rule__FunctionType__Group__0__Impl rule__FunctionType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FunctionType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__0"


    // $ANTLR start "rule__FunctionType__Group__0__Impl"
    // InternalGo.g:2716:1: rule__FunctionType__Group__0__Impl : ( 'func' ) ;
    public final void rule__FunctionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2720:1: ( ( 'func' ) )
            // InternalGo.g:2721:1: ( 'func' )
            {
            // InternalGo.g:2721:1: ( 'func' )
            // InternalGo.g:2722:2: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionTypeAccess().getFuncKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionTypeAccess().getFuncKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__0__Impl"


    // $ANTLR start "rule__FunctionType__Group__1"
    // InternalGo.g:2731:1: rule__FunctionType__Group__1 : rule__FunctionType__Group__1__Impl rule__FunctionType__Group__2 ;
    public final void rule__FunctionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2735:1: ( rule__FunctionType__Group__1__Impl rule__FunctionType__Group__2 )
            // InternalGo.g:2736:2: rule__FunctionType__Group__1__Impl rule__FunctionType__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__FunctionType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__1"


    // $ANTLR start "rule__FunctionType__Group__1__Impl"
    // InternalGo.g:2743:1: rule__FunctionType__Group__1__Impl : ( ( rule__FunctionType__NomeAssignment_1 ) ) ;
    public final void rule__FunctionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2747:1: ( ( ( rule__FunctionType__NomeAssignment_1 ) ) )
            // InternalGo.g:2748:1: ( ( rule__FunctionType__NomeAssignment_1 ) )
            {
            // InternalGo.g:2748:1: ( ( rule__FunctionType__NomeAssignment_1 ) )
            // InternalGo.g:2749:2: ( rule__FunctionType__NomeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionTypeAccess().getNomeAssignment_1()); 
            }
            // InternalGo.g:2750:2: ( rule__FunctionType__NomeAssignment_1 )
            // InternalGo.g:2750:3: rule__FunctionType__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__NomeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionTypeAccess().getNomeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__1__Impl"


    // $ANTLR start "rule__FunctionType__Group__2"
    // InternalGo.g:2758:1: rule__FunctionType__Group__2 : rule__FunctionType__Group__2__Impl rule__FunctionType__Group__3 ;
    public final void rule__FunctionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2762:1: ( rule__FunctionType__Group__2__Impl rule__FunctionType__Group__3 )
            // InternalGo.g:2763:2: rule__FunctionType__Group__2__Impl rule__FunctionType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FunctionType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__2"


    // $ANTLR start "rule__FunctionType__Group__2__Impl"
    // InternalGo.g:2770:1: rule__FunctionType__Group__2__Impl : ( ( rule__FunctionType__AssinaturaAssignment_2 ) ) ;
    public final void rule__FunctionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2774:1: ( ( ( rule__FunctionType__AssinaturaAssignment_2 ) ) )
            // InternalGo.g:2775:1: ( ( rule__FunctionType__AssinaturaAssignment_2 ) )
            {
            // InternalGo.g:2775:1: ( ( rule__FunctionType__AssinaturaAssignment_2 ) )
            // InternalGo.g:2776:2: ( rule__FunctionType__AssinaturaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionTypeAccess().getAssinaturaAssignment_2()); 
            }
            // InternalGo.g:2777:2: ( rule__FunctionType__AssinaturaAssignment_2 )
            // InternalGo.g:2777:3: rule__FunctionType__AssinaturaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__AssinaturaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionTypeAccess().getAssinaturaAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__2__Impl"


    // $ANTLR start "rule__FunctionType__Group__3"
    // InternalGo.g:2785:1: rule__FunctionType__Group__3 : rule__FunctionType__Group__3__Impl ;
    public final void rule__FunctionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2789:1: ( rule__FunctionType__Group__3__Impl )
            // InternalGo.g:2790:2: rule__FunctionType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__3"


    // $ANTLR start "rule__FunctionType__Group__3__Impl"
    // InternalGo.g:2796:1: rule__FunctionType__Group__3__Impl : ( ( rule__FunctionType__BlocoAssignment_3 )? ) ;
    public final void rule__FunctionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2800:1: ( ( ( rule__FunctionType__BlocoAssignment_3 )? ) )
            // InternalGo.g:2801:1: ( ( rule__FunctionType__BlocoAssignment_3 )? )
            {
            // InternalGo.g:2801:1: ( ( rule__FunctionType__BlocoAssignment_3 )? )
            // InternalGo.g:2802:2: ( rule__FunctionType__BlocoAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionTypeAccess().getBlocoAssignment_3()); 
            }
            // InternalGo.g:2803:2: ( rule__FunctionType__BlocoAssignment_3 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalGo.g:2803:3: rule__FunctionType__BlocoAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionType__BlocoAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionTypeAccess().getBlocoAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group__3__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalGo.g:2812:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2816:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalGo.g:2817:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Signature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalGo.g:2824:1: rule__Signature__Group__0__Impl : ( ruleParameters ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2828:1: ( ( ruleParameters ) )
            // InternalGo.g:2829:1: ( ruleParameters )
            {
            // InternalGo.g:2829:1: ( ruleParameters )
            // InternalGo.g:2830:2: ruleParameters
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalGo.g:2839:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2843:1: ( rule__Signature__Group__1__Impl )
            // InternalGo.g:2844:2: rule__Signature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalGo.g:2850:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__RetornoAssignment_1 )? ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2854:1: ( ( ( rule__Signature__RetornoAssignment_1 )? ) )
            // InternalGo.g:2855:1: ( ( rule__Signature__RetornoAssignment_1 )? )
            {
            // InternalGo.g:2855:1: ( ( rule__Signature__RetornoAssignment_1 )? )
            // InternalGo.g:2856:2: ( rule__Signature__RetornoAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getRetornoAssignment_1()); 
            }
            // InternalGo.g:2857:2: ( rule__Signature__RetornoAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13||LA29_0==25||(LA29_0>=36 && LA29_0<=39)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGo.g:2857:3: rule__Signature__RetornoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__RetornoAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getRetornoAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Result__Group_0__0"
    // InternalGo.g:2866:1: rule__Result__Group_0__0 : rule__Result__Group_0__0__Impl rule__Result__Group_0__1 ;
    public final void rule__Result__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2870:1: ( rule__Result__Group_0__0__Impl rule__Result__Group_0__1 )
            // InternalGo.g:2871:2: rule__Result__Group_0__0__Impl rule__Result__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Result__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Result__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_0__0"


    // $ANTLR start "rule__Result__Group_0__0__Impl"
    // InternalGo.g:2878:1: rule__Result__Group_0__0__Impl : ( () ) ;
    public final void rule__Result__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2882:1: ( ( () ) )
            // InternalGo.g:2883:1: ( () )
            {
            // InternalGo.g:2883:1: ( () )
            // InternalGo.g:2884:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultAccess().getResultAction_0_0()); 
            }
            // InternalGo.g:2885:2: ()
            // InternalGo.g:2885:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultAccess().getResultAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_0__0__Impl"


    // $ANTLR start "rule__Result__Group_0__1"
    // InternalGo.g:2893:1: rule__Result__Group_0__1 : rule__Result__Group_0__1__Impl ;
    public final void rule__Result__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2897:1: ( rule__Result__Group_0__1__Impl )
            // InternalGo.g:2898:2: rule__Result__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Result__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_0__1"


    // $ANTLR start "rule__Result__Group_0__1__Impl"
    // InternalGo.g:2904:1: rule__Result__Group_0__1__Impl : ( ( rule__Result__ParametrosAssignment_0_1 ) ) ;
    public final void rule__Result__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2908:1: ( ( ( rule__Result__ParametrosAssignment_0_1 ) ) )
            // InternalGo.g:2909:1: ( ( rule__Result__ParametrosAssignment_0_1 ) )
            {
            // InternalGo.g:2909:1: ( ( rule__Result__ParametrosAssignment_0_1 ) )
            // InternalGo.g:2910:2: ( rule__Result__ParametrosAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultAccess().getParametrosAssignment_0_1()); 
            }
            // InternalGo.g:2911:2: ( rule__Result__ParametrosAssignment_0_1 )
            // InternalGo.g:2911:3: rule__Result__ParametrosAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Result__ParametrosAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultAccess().getParametrosAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__Group_0__1__Impl"


    // $ANTLR start "rule__Parameters__Group__0"
    // InternalGo.g:2920:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2924:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalGo.g:2925:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Parameters__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0"


    // $ANTLR start "rule__Parameters__Group__0__Impl"
    // InternalGo.g:2932:1: rule__Parameters__Group__0__Impl : ( () ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2936:1: ( ( () ) )
            // InternalGo.g:2937:1: ( () )
            {
            // InternalGo.g:2937:1: ( () )
            // InternalGo.g:2938:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getParametersAction_0()); 
            }
            // InternalGo.g:2939:2: ()
            // InternalGo.g:2939:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getParametersAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0__Impl"


    // $ANTLR start "rule__Parameters__Group__1"
    // InternalGo.g:2947:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl rule__Parameters__Group__2 ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2951:1: ( rule__Parameters__Group__1__Impl rule__Parameters__Group__2 )
            // InternalGo.g:2952:2: rule__Parameters__Group__1__Impl rule__Parameters__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Parameters__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1"


    // $ANTLR start "rule__Parameters__Group__1__Impl"
    // InternalGo.g:2959:1: rule__Parameters__Group__1__Impl : ( ruleABRE_PARENTESES ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2963:1: ( ( ruleABRE_PARENTESES ) )
            // InternalGo.g:2964:1: ( ruleABRE_PARENTESES )
            {
            // InternalGo.g:2964:1: ( ruleABRE_PARENTESES )
            // InternalGo.g:2965:2: ruleABRE_PARENTESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getABRE_PARENTESESParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleABRE_PARENTESES();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getABRE_PARENTESESParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1__Impl"


    // $ANTLR start "rule__Parameters__Group__2"
    // InternalGo.g:2974:1: rule__Parameters__Group__2 : rule__Parameters__Group__2__Impl rule__Parameters__Group__3 ;
    public final void rule__Parameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2978:1: ( rule__Parameters__Group__2__Impl rule__Parameters__Group__3 )
            // InternalGo.g:2979:2: rule__Parameters__Group__2__Impl rule__Parameters__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Parameters__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__2"


    // $ANTLR start "rule__Parameters__Group__2__Impl"
    // InternalGo.g:2986:1: rule__Parameters__Group__2__Impl : ( ( rulePARAMETERS_LIST )? ) ;
    public final void rule__Parameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:2990:1: ( ( ( rulePARAMETERS_LIST )? ) )
            // InternalGo.g:2991:1: ( ( rulePARAMETERS_LIST )? )
            {
            // InternalGo.g:2991:1: ( ( rulePARAMETERS_LIST )? )
            // InternalGo.g:2992:2: ( rulePARAMETERS_LIST )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getPARAMETERS_LISTParserRuleCall_2()); 
            }
            // InternalGo.g:2993:2: ( rulePARAMETERS_LIST )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGo.g:2993:3: rulePARAMETERS_LIST
                    {
                    pushFollow(FOLLOW_2);
                    rulePARAMETERS_LIST();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getPARAMETERS_LISTParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__2__Impl"


    // $ANTLR start "rule__Parameters__Group__3"
    // InternalGo.g:3001:1: rule__Parameters__Group__3 : rule__Parameters__Group__3__Impl ;
    public final void rule__Parameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3005:1: ( rule__Parameters__Group__3__Impl )
            // InternalGo.g:3006:2: rule__Parameters__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__3"


    // $ANTLR start "rule__Parameters__Group__3__Impl"
    // InternalGo.g:3012:1: rule__Parameters__Group__3__Impl : ( ruleFECHA_PARENTESES ) ;
    public final void rule__Parameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3016:1: ( ( ruleFECHA_PARENTESES ) )
            // InternalGo.g:3017:1: ( ruleFECHA_PARENTESES )
            {
            // InternalGo.g:3017:1: ( ruleFECHA_PARENTESES )
            // InternalGo.g:3018:2: ruleFECHA_PARENTESES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParametersAccess().getFECHA_PARENTESESParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleFECHA_PARENTESES();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParametersAccess().getFECHA_PARENTESESParserRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__3__Impl"


    // $ANTLR start "rule__BLOCK__Group__0"
    // InternalGo.g:3028:1: rule__BLOCK__Group__0 : rule__BLOCK__Group__0__Impl rule__BLOCK__Group__1 ;
    public final void rule__BLOCK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3032:1: ( rule__BLOCK__Group__0__Impl rule__BLOCK__Group__1 )
            // InternalGo.g:3033:2: rule__BLOCK__Group__0__Impl rule__BLOCK__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BLOCK__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BLOCK__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLOCK__Group__0"


    // $ANTLR start "rule__BLOCK__Group__0__Impl"
    // InternalGo.g:3040:1: rule__BLOCK__Group__0__Impl : ( () ) ;
    public final void rule__BLOCK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3044:1: ( ( () ) )
            // InternalGo.g:3045:1: ( () )
            {
            // InternalGo.g:3045:1: ( () )
            // InternalGo.g:3046:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBLOCKAccess().getBLOCKAction_0()); 
            }
            // InternalGo.g:3047:2: ()
            // InternalGo.g:3047:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBLOCKAccess().getBLOCKAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLOCK__Group__0__Impl"


    // $ANTLR start "rule__BLOCK__Group__1"
    // InternalGo.g:3055:1: rule__BLOCK__Group__1 : rule__BLOCK__Group__1__Impl rule__BLOCK__Group__2 ;
    public final void rule__BLOCK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3059:1: ( rule__BLOCK__Group__1__Impl rule__BLOCK__Group__2 )
            // InternalGo.g:3060:2: rule__BLOCK__Group__1__Impl rule__BLOCK__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__BLOCK__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BLOCK__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLOCK__Group__1"


    // $ANTLR start "rule__BLOCK__Group__1__Impl"
    // InternalGo.g:3067:1: rule__BLOCK__Group__1__Impl : ( '{' ) ;
    public final void rule__BLOCK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3071:1: ( ( '{' ) )
            // InternalGo.g:3072:1: ( '{' )
            {
            // InternalGo.g:3072:1: ( '{' )
            // InternalGo.g:3073:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBLOCKAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBLOCKAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLOCK__Group__1__Impl"


    // $ANTLR start "rule__BLOCK__Group__2"
    // InternalGo.g:3082:1: rule__BLOCK__Group__2 : rule__BLOCK__Group__2__Impl rule__BLOCK__Group__3 ;
    public final void rule__BLOCK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3086:1: ( rule__BLOCK__Group__2__Impl rule__BLOCK__Group__3 )
            // InternalGo.g:3087:2: rule__BLOCK__Group__2__Impl rule__BLOCK__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__BLOCK__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BLOCK__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLOCK__Group__2"


    // $ANTLR start "rule__BLOCK__Group__2__Impl"
    // InternalGo.g:3094:1: rule__BLOCK__Group__2__Impl : ( ( rule__BLOCK__ListaDeComandosAssignment_2 )* ) ;
    public final void rule__BLOCK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3098:1: ( ( ( rule__BLOCK__ListaDeComandosAssignment_2 )* ) )
            // InternalGo.g:3099:1: ( ( rule__BLOCK__ListaDeComandosAssignment_2 )* )
            {
            // InternalGo.g:3099:1: ( ( rule__BLOCK__ListaDeComandosAssignment_2 )* )
            // InternalGo.g:3100:2: ( rule__BLOCK__ListaDeComandosAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBLOCKAccess().getListaDeComandosAssignment_2()); 
            }
            // InternalGo.g:3101:2: ( rule__BLOCK__ListaDeComandosAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING_DECL)||(LA31_0>=20 && LA31_0<=21)||LA31_0==27||(LA31_0>=30 && LA31_0<=33)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGo.g:3101:3: rule__BLOCK__ListaDeComandosAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__BLOCK__ListaDeComandosAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBLOCKAccess().getListaDeComandosAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLOCK__Group__2__Impl"


    // $ANTLR start "rule__BLOCK__Group__3"
    // InternalGo.g:3109:1: rule__BLOCK__Group__3 : rule__BLOCK__Group__3__Impl ;
    public final void rule__BLOCK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3113:1: ( rule__BLOCK__Group__3__Impl )
            // InternalGo.g:3114:2: rule__BLOCK__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BLOCK__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLOCK__Group__3"


    // $ANTLR start "rule__BLOCK__Group__3__Impl"
    // InternalGo.g:3120:1: rule__BLOCK__Group__3__Impl : ( '}' ) ;
    public final void rule__BLOCK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3124:1: ( ( '}' ) )
            // InternalGo.g:3125:1: ( '}' )
            {
            // InternalGo.g:3125:1: ( '}' )
            // InternalGo.g:3126:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBLOCKAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBLOCKAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLOCK__Group__3__Impl"


    // $ANTLR start "rule__PARAMETERS_LIST__Group__0"
    // InternalGo.g:3136:1: rule__PARAMETERS_LIST__Group__0 : rule__PARAMETERS_LIST__Group__0__Impl rule__PARAMETERS_LIST__Group__1 ;
    public final void rule__PARAMETERS_LIST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3140:1: ( rule__PARAMETERS_LIST__Group__0__Impl rule__PARAMETERS_LIST__Group__1 )
            // InternalGo.g:3141:2: rule__PARAMETERS_LIST__Group__0__Impl rule__PARAMETERS_LIST__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PARAMETERS_LIST__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PARAMETERS_LIST__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETERS_LIST__Group__0"


    // $ANTLR start "rule__PARAMETERS_LIST__Group__0__Impl"
    // InternalGo.g:3148:1: rule__PARAMETERS_LIST__Group__0__Impl : ( rulePARAMETER ) ;
    public final void rule__PARAMETERS_LIST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3152:1: ( ( rulePARAMETER ) )
            // InternalGo.g:3153:1: ( rulePARAMETER )
            {
            // InternalGo.g:3153:1: ( rulePARAMETER )
            // InternalGo.g:3154:2: rulePARAMETER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePARAMETER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETERS_LIST__Group__0__Impl"


    // $ANTLR start "rule__PARAMETERS_LIST__Group__1"
    // InternalGo.g:3163:1: rule__PARAMETERS_LIST__Group__1 : rule__PARAMETERS_LIST__Group__1__Impl ;
    public final void rule__PARAMETERS_LIST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3167:1: ( rule__PARAMETERS_LIST__Group__1__Impl )
            // InternalGo.g:3168:2: rule__PARAMETERS_LIST__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PARAMETERS_LIST__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETERS_LIST__Group__1"


    // $ANTLR start "rule__PARAMETERS_LIST__Group__1__Impl"
    // InternalGo.g:3174:1: rule__PARAMETERS_LIST__Group__1__Impl : ( ( rule__PARAMETERS_LIST__Group_1__0 )* ) ;
    public final void rule__PARAMETERS_LIST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3178:1: ( ( ( rule__PARAMETERS_LIST__Group_1__0 )* ) )
            // InternalGo.g:3179:1: ( ( rule__PARAMETERS_LIST__Group_1__0 )* )
            {
            // InternalGo.g:3179:1: ( ( rule__PARAMETERS_LIST__Group_1__0 )* )
            // InternalGo.g:3180:2: ( rule__PARAMETERS_LIST__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERS_LISTAccess().getGroup_1()); 
            }
            // InternalGo.g:3181:2: ( rule__PARAMETERS_LIST__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==24) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGo.g:3181:3: rule__PARAMETERS_LIST__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__PARAMETERS_LIST__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERS_LISTAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETERS_LIST__Group__1__Impl"


    // $ANTLR start "rule__PARAMETERS_LIST__Group_1__0"
    // InternalGo.g:3190:1: rule__PARAMETERS_LIST__Group_1__0 : rule__PARAMETERS_LIST__Group_1__0__Impl rule__PARAMETERS_LIST__Group_1__1 ;
    public final void rule__PARAMETERS_LIST__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3194:1: ( rule__PARAMETERS_LIST__Group_1__0__Impl rule__PARAMETERS_LIST__Group_1__1 )
            // InternalGo.g:3195:2: rule__PARAMETERS_LIST__Group_1__0__Impl rule__PARAMETERS_LIST__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__PARAMETERS_LIST__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PARAMETERS_LIST__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETERS_LIST__Group_1__0"


    // $ANTLR start "rule__PARAMETERS_LIST__Group_1__0__Impl"
    // InternalGo.g:3202:1: rule__PARAMETERS_LIST__Group_1__0__Impl : ( ',' ) ;
    public final void rule__PARAMETERS_LIST__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3206:1: ( ( ',' ) )
            // InternalGo.g:3207:1: ( ',' )
            {
            // InternalGo.g:3207:1: ( ',' )
            // InternalGo.g:3208:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERS_LISTAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERS_LISTAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETERS_LIST__Group_1__0__Impl"


    // $ANTLR start "rule__PARAMETERS_LIST__Group_1__1"
    // InternalGo.g:3217:1: rule__PARAMETERS_LIST__Group_1__1 : rule__PARAMETERS_LIST__Group_1__1__Impl ;
    public final void rule__PARAMETERS_LIST__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3221:1: ( rule__PARAMETERS_LIST__Group_1__1__Impl )
            // InternalGo.g:3222:2: rule__PARAMETERS_LIST__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PARAMETERS_LIST__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETERS_LIST__Group_1__1"


    // $ANTLR start "rule__PARAMETERS_LIST__Group_1__1__Impl"
    // InternalGo.g:3228:1: rule__PARAMETERS_LIST__Group_1__1__Impl : ( ( rule__PARAMETERS_LIST__PARAMETERAssignment_1_1 ) ) ;
    public final void rule__PARAMETERS_LIST__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3232:1: ( ( ( rule__PARAMETERS_LIST__PARAMETERAssignment_1_1 ) ) )
            // InternalGo.g:3233:1: ( ( rule__PARAMETERS_LIST__PARAMETERAssignment_1_1 ) )
            {
            // InternalGo.g:3233:1: ( ( rule__PARAMETERS_LIST__PARAMETERAssignment_1_1 ) )
            // InternalGo.g:3234:2: ( rule__PARAMETERS_LIST__PARAMETERAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERAssignment_1_1()); 
            }
            // InternalGo.g:3235:2: ( rule__PARAMETERS_LIST__PARAMETERAssignment_1_1 )
            // InternalGo.g:3235:3: rule__PARAMETERS_LIST__PARAMETERAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PARAMETERS_LIST__PARAMETERAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETERS_LIST__Group_1__1__Impl"


    // $ANTLR start "rule__PARAMETER__Group__0"
    // InternalGo.g:3244:1: rule__PARAMETER__Group__0 : rule__PARAMETER__Group__0__Impl rule__PARAMETER__Group__1 ;
    public final void rule__PARAMETER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3248:1: ( rule__PARAMETER__Group__0__Impl rule__PARAMETER__Group__1 )
            // InternalGo.g:3249:2: rule__PARAMETER__Group__0__Impl rule__PARAMETER__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PARAMETER__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PARAMETER__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETER__Group__0"


    // $ANTLR start "rule__PARAMETER__Group__0__Impl"
    // InternalGo.g:3256:1: rule__PARAMETER__Group__0__Impl : ( ( rule__PARAMETER__IdAssignment_0 ) ) ;
    public final void rule__PARAMETER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3260:1: ( ( ( rule__PARAMETER__IdAssignment_0 ) ) )
            // InternalGo.g:3261:1: ( ( rule__PARAMETER__IdAssignment_0 ) )
            {
            // InternalGo.g:3261:1: ( ( rule__PARAMETER__IdAssignment_0 ) )
            // InternalGo.g:3262:2: ( rule__PARAMETER__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERAccess().getIdAssignment_0()); 
            }
            // InternalGo.g:3263:2: ( rule__PARAMETER__IdAssignment_0 )
            // InternalGo.g:3263:3: rule__PARAMETER__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PARAMETER__IdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERAccess().getIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETER__Group__0__Impl"


    // $ANTLR start "rule__PARAMETER__Group__1"
    // InternalGo.g:3271:1: rule__PARAMETER__Group__1 : rule__PARAMETER__Group__1__Impl ;
    public final void rule__PARAMETER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3275:1: ( rule__PARAMETER__Group__1__Impl )
            // InternalGo.g:3276:2: rule__PARAMETER__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PARAMETER__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETER__Group__1"


    // $ANTLR start "rule__PARAMETER__Group__1__Impl"
    // InternalGo.g:3282:1: rule__PARAMETER__Group__1__Impl : ( ( rule__PARAMETER__TipoAssignment_1 ) ) ;
    public final void rule__PARAMETER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3286:1: ( ( ( rule__PARAMETER__TipoAssignment_1 ) ) )
            // InternalGo.g:3287:1: ( ( rule__PARAMETER__TipoAssignment_1 ) )
            {
            // InternalGo.g:3287:1: ( ( rule__PARAMETER__TipoAssignment_1 ) )
            // InternalGo.g:3288:2: ( rule__PARAMETER__TipoAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERAccess().getTipoAssignment_1()); 
            }
            // InternalGo.g:3289:2: ( rule__PARAMETER__TipoAssignment_1 )
            // InternalGo.g:3289:3: rule__PARAMETER__TipoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PARAMETER__TipoAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERAccess().getTipoAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETER__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // InternalGo.g:3298:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3302:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalGo.g:3303:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // InternalGo.g:3310:1: rule__ArrayType__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3314:1: ( ( '[' ) )
            // InternalGo.g:3315:1: ( '[' )
            {
            // InternalGo.g:3315:1: ( '[' )
            // InternalGo.g:3316:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // InternalGo.g:3325:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3329:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalGo.g:3330:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // InternalGo.g:3337:1: rule__ArrayType__Group__1__Impl : ( ( rule__ArrayType__QtdAssignment_1 )? ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3341:1: ( ( ( rule__ArrayType__QtdAssignment_1 )? ) )
            // InternalGo.g:3342:1: ( ( rule__ArrayType__QtdAssignment_1 )? )
            {
            // InternalGo.g:3342:1: ( ( rule__ArrayType__QtdAssignment_1 )? )
            // InternalGo.g:3343:2: ( rule__ArrayType__QtdAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeAccess().getQtdAssignment_1()); 
            }
            // InternalGo.g:3344:2: ( rule__ArrayType__QtdAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_NUMERO) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGo.g:3344:3: rule__ArrayType__QtdAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__QtdAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeAccess().getQtdAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__2"
    // InternalGo.g:3352:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3356:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalGo.g:3357:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2"


    // $ANTLR start "rule__ArrayType__Group__2__Impl"
    // InternalGo.g:3364:1: rule__ArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3368:1: ( ( ']' ) )
            // InternalGo.g:3369:1: ( ']' )
            {
            // InternalGo.g:3369:1: ( ']' )
            // InternalGo.g:3370:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__3"
    // InternalGo.g:3379:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3383:1: ( rule__ArrayType__Group__3__Impl )
            // InternalGo.g:3384:2: rule__ArrayType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3"


    // $ANTLR start "rule__ArrayType__Group__3__Impl"
    // InternalGo.g:3390:1: rule__ArrayType__Group__3__Impl : ( ( rule__ArrayType__BasicAssignment_3 ) ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3394:1: ( ( ( rule__ArrayType__BasicAssignment_3 ) ) )
            // InternalGo.g:3395:1: ( ( rule__ArrayType__BasicAssignment_3 ) )
            {
            // InternalGo.g:3395:1: ( ( rule__ArrayType__BasicAssignment_3 ) )
            // InternalGo.g:3396:2: ( rule__ArrayType__BasicAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeAccess().getBasicAssignment_3()); 
            }
            // InternalGo.g:3397:2: ( rule__ArrayType__BasicAssignment_3 )
            // InternalGo.g:3397:3: rule__ArrayType__BasicAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__BasicAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeAccess().getBasicAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3__Impl"


    // $ANTLR start "rule__Init__ElementsAssignment"
    // InternalGo.g:3406:1: rule__Init__ElementsAssignment : ( ruleGoDecl ) ;
    public final void rule__Init__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3410:1: ( ( ruleGoDecl ) )
            // InternalGo.g:3411:2: ( ruleGoDecl )
            {
            // InternalGo.g:3411:2: ( ruleGoDecl )
            // InternalGo.g:3412:3: ruleGoDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitAccess().getElementsGoDeclParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGoDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitAccess().getElementsGoDeclParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Init__ElementsAssignment"


    // $ANTLR start "rule__BOOL_OP__AndAssignment_0"
    // InternalGo.g:3421:1: rule__BOOL_OP__AndAssignment_0 : ( ( '&' ) ) ;
    public final void rule__BOOL_OP__AndAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3425:1: ( ( ( '&' ) ) )
            // InternalGo.g:3426:2: ( ( '&' ) )
            {
            // InternalGo.g:3426:2: ( ( '&' ) )
            // InternalGo.g:3427:3: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOL_OPAccess().getAndAmpersandKeyword_0_0()); 
            }
            // InternalGo.g:3428:3: ( '&' )
            // InternalGo.g:3429:4: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOL_OPAccess().getAndAmpersandKeyword_0_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOL_OPAccess().getAndAmpersandKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOL_OPAccess().getAndAmpersandKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL_OP__AndAssignment_0"


    // $ANTLR start "rule__BOOL_OP__OrAssignment_1"
    // InternalGo.g:3440:1: rule__BOOL_OP__OrAssignment_1 : ( ( '||' ) ) ;
    public final void rule__BOOL_OP__OrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3444:1: ( ( ( '||' ) ) )
            // InternalGo.g:3445:2: ( ( '||' ) )
            {
            // InternalGo.g:3445:2: ( ( '||' ) )
            // InternalGo.g:3446:3: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOL_OPAccess().getOrVerticalLineVerticalLineKeyword_1_0()); 
            }
            // InternalGo.g:3447:3: ( '||' )
            // InternalGo.g:3448:4: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOL_OPAccess().getOrVerticalLineVerticalLineKeyword_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOL_OPAccess().getOrVerticalLineVerticalLineKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOL_OPAccess().getOrVerticalLineVerticalLineKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL_OP__OrAssignment_1"


    // $ANTLR start "rule__BOOLEAN_VALUE__VerdadeiroAssignment_0"
    // InternalGo.g:3459:1: rule__BOOLEAN_VALUE__VerdadeiroAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BOOLEAN_VALUE__VerdadeiroAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3463:1: ( ( ( 'true' ) ) )
            // InternalGo.g:3464:2: ( ( 'true' ) )
            {
            // InternalGo.g:3464:2: ( ( 'true' ) )
            // InternalGo.g:3465:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEAN_VALUEAccess().getVerdadeiroTrueKeyword_0_0()); 
            }
            // InternalGo.g:3466:3: ( 'true' )
            // InternalGo.g:3467:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEAN_VALUEAccess().getVerdadeiroTrueKeyword_0_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEAN_VALUEAccess().getVerdadeiroTrueKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEAN_VALUEAccess().getVerdadeiroTrueKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN_VALUE__VerdadeiroAssignment_0"


    // $ANTLR start "rule__BOOLEAN_VALUE__FalsoAssignment_1"
    // InternalGo.g:3478:1: rule__BOOLEAN_VALUE__FalsoAssignment_1 : ( ( 'false' ) ) ;
    public final void rule__BOOLEAN_VALUE__FalsoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3482:1: ( ( ( 'false' ) ) )
            // InternalGo.g:3483:2: ( ( 'false' ) )
            {
            // InternalGo.g:3483:2: ( ( 'false' ) )
            // InternalGo.g:3484:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEAN_VALUEAccess().getFalsoFalseKeyword_1_0()); 
            }
            // InternalGo.g:3485:3: ( 'false' )
            // InternalGo.g:3486:4: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEAN_VALUEAccess().getFalsoFalseKeyword_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEAN_VALUEAccess().getFalsoFalseKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEAN_VALUEAccess().getFalsoFalseKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN_VALUE__FalsoAssignment_1"


    // $ANTLR start "rule__GoDecl__VarAssignment_0"
    // InternalGo.g:3497:1: rule__GoDecl__VarAssignment_0 : ( ruleVarDecl ) ;
    public final void rule__GoDecl__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3501:1: ( ( ruleVarDecl ) )
            // InternalGo.g:3502:2: ( ruleVarDecl )
            {
            // InternalGo.g:3502:2: ( ruleVarDecl )
            // InternalGo.g:3503:3: ruleVarDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoDeclAccess().getVarVarDeclParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoDeclAccess().getVarVarDeclParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoDecl__VarAssignment_0"


    // $ANTLR start "rule__GoDecl__FuncAssignment_1"
    // InternalGo.g:3512:1: rule__GoDecl__FuncAssignment_1 : ( ruleFunctionType ) ;
    public final void rule__GoDecl__FuncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3516:1: ( ( ruleFunctionType ) )
            // InternalGo.g:3517:2: ( ruleFunctionType )
            {
            // InternalGo.g:3517:2: ( ruleFunctionType )
            // InternalGo.g:3518:3: ruleFunctionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoDeclAccess().getFuncFunctionTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFunctionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoDeclAccess().getFuncFunctionTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoDecl__FuncAssignment_1"


    // $ANTLR start "rule__GoDecl__ExpressaoAssignment_2"
    // InternalGo.g:3527:1: rule__GoDecl__ExpressaoAssignment_2 : ( ruleEXPRESSAOLINHA ) ;
    public final void rule__GoDecl__ExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3531:1: ( ( ruleEXPRESSAOLINHA ) )
            // InternalGo.g:3532:2: ( ruleEXPRESSAOLINHA )
            {
            // InternalGo.g:3532:2: ( ruleEXPRESSAOLINHA )
            // InternalGo.g:3533:3: ruleEXPRESSAOLINHA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGoDeclAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGoDeclAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoDecl__ExpressaoAssignment_2"


    // $ANTLR start "rule__ForDecl__ClauseAssignment_1"
    // InternalGo.g:3542:1: rule__ForDecl__ClauseAssignment_1 : ( ruleForClause ) ;
    public final void rule__ForDecl__ClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3546:1: ( ( ruleForClause ) )
            // InternalGo.g:3547:2: ( ruleForClause )
            {
            // InternalGo.g:3547:2: ( ruleForClause )
            // InternalGo.g:3548:3: ruleForClause
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForDeclAccess().getClauseForClauseParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleForClause();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForDeclAccess().getClauseForClauseParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__ClauseAssignment_1"


    // $ANTLR start "rule__ForDecl__ExpAssignment_3"
    // InternalGo.g:3557:1: rule__ForDecl__ExpAssignment_3 : ( ruleEXPRESSAOLINHA ) ;
    public final void rule__ForDecl__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3561:1: ( ( ruleEXPRESSAOLINHA ) )
            // InternalGo.g:3562:2: ( ruleEXPRESSAOLINHA )
            {
            // InternalGo.g:3562:2: ( ruleEXPRESSAOLINHA )
            // InternalGo.g:3563:3: ruleEXPRESSAOLINHA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForDeclAccess().getExpEXPRESSAOLINHAParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForDeclAccess().getExpEXPRESSAOLINHAParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForDecl__ExpAssignment_3"


    // $ANTLR start "rule__ForClause__InitAssignment_1"
    // InternalGo.g:3572:1: rule__ForClause__InitAssignment_1 : ( ruleInitStmt ) ;
    public final void rule__ForClause__InitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3576:1: ( ( ruleInitStmt ) )
            // InternalGo.g:3577:2: ( ruleInitStmt )
            {
            // InternalGo.g:3577:2: ( ruleInitStmt )
            // InternalGo.g:3578:3: ruleInitStmt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getInitInitStmtParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInitStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getInitInitStmtParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__InitAssignment_1"


    // $ANTLR start "rule__ForClause__ConditionAssignment_3"
    // InternalGo.g:3587:1: rule__ForClause__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__ForClause__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3591:1: ( ( ruleCondition ) )
            // InternalGo.g:3592:2: ( ruleCondition )
            {
            // InternalGo.g:3592:2: ( ruleCondition )
            // InternalGo.g:3593:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getConditionConditionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getConditionConditionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__ConditionAssignment_3"


    // $ANTLR start "rule__ForClause__PostAssignment_5"
    // InternalGo.g:3602:1: rule__ForClause__PostAssignment_5 : ( rulePostStmt ) ;
    public final void rule__ForClause__PostAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3606:1: ( ( rulePostStmt ) )
            // InternalGo.g:3607:2: ( rulePostStmt )
            {
            // InternalGo.g:3607:2: ( rulePostStmt )
            // InternalGo.g:3608:3: rulePostStmt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForClauseAccess().getPostPostStmtParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePostStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForClauseAccess().getPostPostStmtParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForClause__PostAssignment_5"


    // $ANTLR start "rule__InitStmt__DeclAssignment"
    // InternalGo.g:3617:1: rule__InitStmt__DeclAssignment : ( ruleGoDecl ) ;
    public final void rule__InitStmt__DeclAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3621:1: ( ( ruleGoDecl ) )
            // InternalGo.g:3622:2: ( ruleGoDecl )
            {
            // InternalGo.g:3622:2: ( ruleGoDecl )
            // InternalGo.g:3623:3: ruleGoDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitStmtAccess().getDeclGoDeclParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGoDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitStmtAccess().getDeclGoDeclParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitStmt__DeclAssignment"


    // $ANTLR start "rule__PostStmt__DeclAssignment"
    // InternalGo.g:3632:1: rule__PostStmt__DeclAssignment : ( ruleGoDecl ) ;
    public final void rule__PostStmt__DeclAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3636:1: ( ( ruleGoDecl ) )
            // InternalGo.g:3637:2: ( ruleGoDecl )
            {
            // InternalGo.g:3637:2: ( ruleGoDecl )
            // InternalGo.g:3638:3: ruleGoDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostStmtAccess().getDeclGoDeclParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGoDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostStmtAccess().getDeclGoDeclParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostStmt__DeclAssignment"


    // $ANTLR start "rule__Condition__Expr1Assignment_0"
    // InternalGo.g:3647:1: rule__Condition__Expr1Assignment_0 : ( ruleEXPRESSAO ) ;
    public final void rule__Condition__Expr1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3651:1: ( ( ruleEXPRESSAO ) )
            // InternalGo.g:3652:2: ( ruleEXPRESSAO )
            {
            // InternalGo.g:3652:2: ( ruleEXPRESSAO )
            // InternalGo.g:3653:3: ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpr1EXPRESSAOParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpr1EXPRESSAOParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Expr1Assignment_0"


    // $ANTLR start "rule__Condition__ComparadorAssignment_1"
    // InternalGo.g:3662:1: rule__Condition__ComparadorAssignment_1 : ( ruleCOMPARISON ) ;
    public final void rule__Condition__ComparadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3666:1: ( ( ruleCOMPARISON ) )
            // InternalGo.g:3667:2: ( ruleCOMPARISON )
            {
            // InternalGo.g:3667:2: ( ruleCOMPARISON )
            // InternalGo.g:3668:3: ruleCOMPARISON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getComparadorCOMPARISONParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getComparadorCOMPARISONParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ComparadorAssignment_1"


    // $ANTLR start "rule__Condition__Expr2Assignment_2"
    // InternalGo.g:3677:1: rule__Condition__Expr2Assignment_2 : ( ruleEXPRESSAO ) ;
    public final void rule__Condition__Expr2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3681:1: ( ( ruleEXPRESSAO ) )
            // InternalGo.g:3682:2: ( ruleEXPRESSAO )
            {
            // InternalGo.g:3682:2: ( ruleEXPRESSAO )
            // InternalGo.g:3683:3: ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpr2EXPRESSAOParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpr2EXPRESSAOParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Expr2Assignment_2"


    // $ANTLR start "rule__IDList__IdListAssignment_0"
    // InternalGo.g:3692:1: rule__IDList__IdListAssignment_0 : ( RULE_ID ) ;
    public final void rule__IDList__IdListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3696:1: ( ( RULE_ID ) )
            // InternalGo.g:3697:2: ( RULE_ID )
            {
            // InternalGo.g:3697:2: ( RULE_ID )
            // InternalGo.g:3698:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDListAccess().getIdListIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDListAccess().getIdListIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__IdListAssignment_0"


    // $ANTLR start "rule__IDList__IdListAssignment_1_0"
    // InternalGo.g:3707:1: rule__IDList__IdListAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__IDList__IdListAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3711:1: ( ( RULE_ID ) )
            // InternalGo.g:3712:2: ( RULE_ID )
            {
            // InternalGo.g:3712:2: ( RULE_ID )
            // InternalGo.g:3713:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDListAccess().getIdListIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDListAccess().getIdListIDTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__IdListAssignment_1_0"


    // $ANTLR start "rule__IDList__ListAssignment_1_2"
    // InternalGo.g:3722:1: rule__IDList__ListAssignment_1_2 : ( ruleIDList ) ;
    public final void rule__IDList__ListAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3726:1: ( ( ruleIDList ) )
            // InternalGo.g:3727:2: ( ruleIDList )
            {
            // InternalGo.g:3727:2: ( ruleIDList )
            // InternalGo.g:3728:3: ruleIDList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDListAccess().getListIDListParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIDList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDListAccess().getListIDListParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDList__ListAssignment_1_2"


    // $ANTLR start "rule__VarDecl__SignatureAssignment_0"
    // InternalGo.g:3737:1: rule__VarDecl__SignatureAssignment_0 : ( ruleSignatureDel ) ;
    public final void rule__VarDecl__SignatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3741:1: ( ( ruleSignatureDel ) )
            // InternalGo.g:3742:2: ( ruleSignatureDel )
            {
            // InternalGo.g:3742:2: ( ruleSignatureDel )
            // InternalGo.g:3743:3: ruleSignatureDel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getSignatureSignatureDelParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignatureDel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getSignatureSignatureDelParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__SignatureAssignment_0"


    // $ANTLR start "rule__VarDecl__AtribuicaoAssignment_1_0_0"
    // InternalGo.g:3752:1: rule__VarDecl__AtribuicaoAssignment_1_0_0 : ( ruleIGUAL ) ;
    public final void rule__VarDecl__AtribuicaoAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3756:1: ( ( ruleIGUAL ) )
            // InternalGo.g:3757:2: ( ruleIGUAL )
            {
            // InternalGo.g:3757:2: ( ruleIGUAL )
            // InternalGo.g:3758:3: ruleIGUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getAtribuicaoIGUALParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIGUAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getAtribuicaoIGUALParserRuleCall_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__AtribuicaoAssignment_1_0_0"


    // $ANTLR start "rule__VarDecl__ProntAssignment_1_0_1"
    // InternalGo.g:3767:1: rule__VarDecl__ProntAssignment_1_0_1 : ( rulePONTOSIGUAL ) ;
    public final void rule__VarDecl__ProntAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3771:1: ( ( rulePONTOSIGUAL ) )
            // InternalGo.g:3772:2: ( rulePONTOSIGUAL )
            {
            // InternalGo.g:3772:2: ( rulePONTOSIGUAL )
            // InternalGo.g:3773:3: rulePONTOSIGUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getProntPONTOSIGUALParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePONTOSIGUAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getProntPONTOSIGUALParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__ProntAssignment_1_0_1"


    // $ANTLR start "rule__VarDecl__ArrayAssignment_1_1"
    // InternalGo.g:3782:1: rule__VarDecl__ArrayAssignment_1_1 : ( ruleArrayType ) ;
    public final void rule__VarDecl__ArrayAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3786:1: ( ( ruleArrayType ) )
            // InternalGo.g:3787:2: ( ruleArrayType )
            {
            // InternalGo.g:3787:2: ( ruleArrayType )
            // InternalGo.g:3788:3: ruleArrayType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getArrayArrayTypeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getArrayArrayTypeParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__ArrayAssignment_1_1"


    // $ANTLR start "rule__VarDecl__ExpressaoAssignment_1_2"
    // InternalGo.g:3797:1: rule__VarDecl__ExpressaoAssignment_1_2 : ( ruleEXPRESSAO ) ;
    public final void rule__VarDecl__ExpressaoAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3801:1: ( ( ruleEXPRESSAO ) )
            // InternalGo.g:3802:2: ( ruleEXPRESSAO )
            {
            // InternalGo.g:3802:2: ( ruleEXPRESSAO )
            // InternalGo.g:3803:3: ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclAccess().getExpressaoEXPRESSAOParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclAccess().getExpressaoEXPRESSAOParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__ExpressaoAssignment_1_2"


    // $ANTLR start "rule__SignatureDel__TipoDeclAssignment_0"
    // InternalGo.g:3812:1: rule__SignatureDel__TipoDeclAssignment_0 : ( ruleTIPO ) ;
    public final void rule__SignatureDel__TipoDeclAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3816:1: ( ( ruleTIPO ) )
            // InternalGo.g:3817:2: ( ruleTIPO )
            {
            // InternalGo.g:3817:2: ( ruleTIPO )
            // InternalGo.g:3818:3: ruleTIPO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureDelAccess().getTipoDeclTIPOParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTIPO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureDelAccess().getTipoDeclTIPOParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDel__TipoDeclAssignment_0"


    // $ANTLR start "rule__SignatureDel__IdAssignment_1"
    // InternalGo.g:3827:1: rule__SignatureDel__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__SignatureDel__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3831:1: ( ( RULE_ID ) )
            // InternalGo.g:3832:2: ( RULE_ID )
            {
            // InternalGo.g:3832:2: ( RULE_ID )
            // InternalGo.g:3833:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureDelAccess().getIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureDelAccess().getIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDel__IdAssignment_1"


    // $ANTLR start "rule__SignatureDel__TypeAssignment_2"
    // InternalGo.g:3842:1: rule__SignatureDel__TypeAssignment_2 : ( ruleTypes ) ;
    public final void rule__SignatureDel__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3846:1: ( ( ruleTypes ) )
            // InternalGo.g:3847:2: ( ruleTypes )
            {
            // InternalGo.g:3847:2: ( ruleTypes )
            // InternalGo.g:3848:3: ruleTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureDelAccess().getTypeTypesParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureDelAccess().getTypeTypesParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDel__TypeAssignment_2"


    // $ANTLR start "rule__Assignment__IdAssignment_0"
    // InternalGo.g:3857:1: rule__Assignment__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3861:1: ( ( RULE_ID ) )
            // InternalGo.g:3862:2: ( RULE_ID )
            {
            // InternalGo.g:3862:2: ( RULE_ID )
            // InternalGo.g:3863:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__IdAssignment_0"


    // $ANTLR start "rule__Assignment__QtdAssignment_1_1"
    // InternalGo.g:3872:1: rule__Assignment__QtdAssignment_1_1 : ( RULE_NUMERO ) ;
    public final void rule__Assignment__QtdAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3876:1: ( ( RULE_NUMERO ) )
            // InternalGo.g:3877:2: ( RULE_NUMERO )
            {
            // InternalGo.g:3877:2: ( RULE_NUMERO )
            // InternalGo.g:3878:3: RULE_NUMERO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getQtdNUMEROTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_NUMERO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getQtdNUMEROTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__QtdAssignment_1_1"


    // $ANTLR start "rule__Assignment__IgualAssignment_2_0"
    // InternalGo.g:3887:1: rule__Assignment__IgualAssignment_2_0 : ( ruleIGUAL ) ;
    public final void rule__Assignment__IgualAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3891:1: ( ( ruleIGUAL ) )
            // InternalGo.g:3892:2: ( ruleIGUAL )
            {
            // InternalGo.g:3892:2: ( ruleIGUAL )
            // InternalGo.g:3893:3: ruleIGUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getIgualIGUALParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIGUAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getIgualIGUALParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__IgualAssignment_2_0"


    // $ANTLR start "rule__Assignment__DoisAssignment_2_1"
    // InternalGo.g:3902:1: rule__Assignment__DoisAssignment_2_1 : ( rulePONTOSIGUAL ) ;
    public final void rule__Assignment__DoisAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3906:1: ( ( rulePONTOSIGUAL ) )
            // InternalGo.g:3907:2: ( rulePONTOSIGUAL )
            {
            // InternalGo.g:3907:2: ( rulePONTOSIGUAL )
            // InternalGo.g:3908:3: rulePONTOSIGUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getDoisPONTOSIGUALParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePONTOSIGUAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getDoisPONTOSIGUALParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__DoisAssignment_2_1"


    // $ANTLR start "rule__Assignment__ExpressaoAssignment_3"
    // InternalGo.g:3917:1: rule__Assignment__ExpressaoAssignment_3 : ( ruleEXPRESSAOLINHA ) ;
    public final void rule__Assignment__ExpressaoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3921:1: ( ( ruleEXPRESSAOLINHA ) )
            // InternalGo.g:3922:2: ( ruleEXPRESSAOLINHA )
            {
            // InternalGo.g:3922:2: ( ruleEXPRESSAOLINHA )
            // InternalGo.g:3923:3: ruleEXPRESSAOLINHA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressaoEXPRESSAOLINHAParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ExpressaoAssignment_3"


    // $ANTLR start "rule__TIPO__VariavelAssignment_0"
    // InternalGo.g:3932:1: rule__TIPO__VariavelAssignment_0 : ( ruleVar ) ;
    public final void rule__TIPO__VariavelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3936:1: ( ( ruleVar ) )
            // InternalGo.g:3937:2: ( ruleVar )
            {
            // InternalGo.g:3937:2: ( ruleVar )
            // InternalGo.g:3938:3: ruleVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTIPOAccess().getVariavelVarParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTIPOAccess().getVariavelVarParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIPO__VariavelAssignment_0"


    // $ANTLR start "rule__TIPO__ConstanteAssignment_1"
    // InternalGo.g:3947:1: rule__TIPO__ConstanteAssignment_1 : ( ruleConst ) ;
    public final void rule__TIPO__ConstanteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3951:1: ( ( ruleConst ) )
            // InternalGo.g:3952:2: ( ruleConst )
            {
            // InternalGo.g:3952:2: ( ruleConst )
            // InternalGo.g:3953:3: ruleConst
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTIPOAccess().getConstanteConstParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTIPOAccess().getConstanteConstParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIPO__ConstanteAssignment_1"


    // $ANTLR start "rule__Var__VarAssignment"
    // InternalGo.g:3962:1: rule__Var__VarAssignment : ( ( 'var' ) ) ;
    public final void rule__Var__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3966:1: ( ( ( 'var' ) ) )
            // InternalGo.g:3967:2: ( ( 'var' ) )
            {
            // InternalGo.g:3967:2: ( ( 'var' ) )
            // InternalGo.g:3968:3: ( 'var' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVarVarKeyword_0()); 
            }
            // InternalGo.g:3969:3: ( 'var' )
            // InternalGo.g:3970:4: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAccess().getVarVarKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVarVarKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAccess().getVarVarKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__VarAssignment"


    // $ANTLR start "rule__Const__ConstAssignment"
    // InternalGo.g:3981:1: rule__Const__ConstAssignment : ( ( 'const' ) ) ;
    public final void rule__Const__ConstAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:3985:1: ( ( ( 'const' ) ) )
            // InternalGo.g:3986:2: ( ( 'const' ) )
            {
            // InternalGo.g:3986:2: ( ( 'const' ) )
            // InternalGo.g:3987:3: ( 'const' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstAccess().getConstConstKeyword_0()); 
            }
            // InternalGo.g:3988:3: ( 'const' )
            // InternalGo.g:3989:4: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstAccess().getConstConstKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstAccess().getConstConstKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstAccess().getConstConstKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__ConstAssignment"


    // $ANTLR start "rule__IGUAL__IgualAssignment"
    // InternalGo.g:4000:1: rule__IGUAL__IgualAssignment : ( ( '=' ) ) ;
    public final void rule__IGUAL__IgualAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4004:1: ( ( ( '=' ) ) )
            // InternalGo.g:4005:2: ( ( '=' ) )
            {
            // InternalGo.g:4005:2: ( ( '=' ) )
            // InternalGo.g:4006:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIGUALAccess().getIgualEqualsSignKeyword_0()); 
            }
            // InternalGo.g:4007:3: ( '=' )
            // InternalGo.g:4008:4: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIGUALAccess().getIgualEqualsSignKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIGUALAccess().getIgualEqualsSignKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIGUALAccess().getIgualEqualsSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGUAL__IgualAssignment"


    // $ANTLR start "rule__PONTOSIGUAL__OpAssignment"
    // InternalGo.g:4019:1: rule__PONTOSIGUAL__OpAssignment : ( ( ':=' ) ) ;
    public final void rule__PONTOSIGUAL__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4023:1: ( ( ( ':=' ) ) )
            // InternalGo.g:4024:2: ( ( ':=' ) )
            {
            // InternalGo.g:4024:2: ( ( ':=' ) )
            // InternalGo.g:4025:3: ( ':=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPONTOSIGUALAccess().getOpColonEqualsSignKeyword_0()); 
            }
            // InternalGo.g:4026:3: ( ':=' )
            // InternalGo.g:4027:4: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPONTOSIGUALAccess().getOpColonEqualsSignKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPONTOSIGUALAccess().getOpColonEqualsSignKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPONTOSIGUALAccess().getOpColonEqualsSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PONTOSIGUAL__OpAssignment"


    // $ANTLR start "rule__EXPRESSAOLINHA__ExpAssignment_0_0"
    // InternalGo.g:4038:1: rule__EXPRESSAOLINHA__ExpAssignment_0_0 : ( ruleEXPRESSAO ) ;
    public final void rule__EXPRESSAOLINHA__ExpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4042:1: ( ( ruleEXPRESSAO ) )
            // InternalGo.g:4043:2: ( ruleEXPRESSAO )
            {
            // InternalGo.g:4043:2: ( ruleEXPRESSAO )
            // InternalGo.g:4044:3: ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAOLINHA__ExpAssignment_0_0"


    // $ANTLR start "rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1"
    // InternalGo.g:4053:1: rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1 : ( ruleEXPRESSAOLINHA ) ;
    public final void rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4057:1: ( ( ruleEXPRESSAOLINHA ) )
            // InternalGo.g:4058:2: ( ruleEXPRESSAOLINHA )
            {
            // InternalGo.g:4058:2: ( ruleEXPRESSAOLINHA )
            // InternalGo.g:4059:3: ruleEXPRESSAOLINHA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOLINHAAccess().getExplinhaEXPRESSAOLINHAParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAOLINHA();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOLINHAAccess().getExplinhaEXPRESSAOLINHAParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1"


    // $ANTLR start "rule__EXPRESSAOLINHA__ExpAssignment_1"
    // InternalGo.g:4068:1: rule__EXPRESSAOLINHA__ExpAssignment_1 : ( ruleEXPRESSAO ) ;
    public final void rule__EXPRESSAOLINHA__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4072:1: ( ( ruleEXPRESSAO ) )
            // InternalGo.g:4073:2: ( ruleEXPRESSAO )
            {
            // InternalGo.g:4073:2: ( ruleEXPRESSAO )
            // InternalGo.g:4074:3: ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOLINHAAccess().getExpEXPRESSAOParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAOLINHA__ExpAssignment_1"


    // $ANTLR start "rule__EXPRESSAO__DeclFunctionAssignment_0_1"
    // InternalGo.g:4083:1: rule__EXPRESSAO__DeclFunctionAssignment_0_1 : ( ruleFunctionType ) ;
    public final void rule__EXPRESSAO__DeclFunctionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4087:1: ( ( ruleFunctionType ) )
            // InternalGo.g:4088:2: ( ruleFunctionType )
            {
            // InternalGo.g:4088:2: ( ruleFunctionType )
            // InternalGo.g:4089:3: ruleFunctionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFunctionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__DeclFunctionAssignment_0_1"


    // $ANTLR start "rule__EXPRESSAO__VariaveisAssignment_1"
    // InternalGo.g:4098:1: rule__EXPRESSAO__VariaveisAssignment_1 : ( ruleVarDecl ) ;
    public final void rule__EXPRESSAO__VariaveisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4102:1: ( ( ruleVarDecl ) )
            // InternalGo.g:4103:2: ( ruleVarDecl )
            {
            // InternalGo.g:4103:2: ( ruleVarDecl )
            // InternalGo.g:4104:3: ruleVarDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__VariaveisAssignment_1"


    // $ANTLR start "rule__EXPRESSAO__BasicAssignment_2"
    // InternalGo.g:4113:1: rule__EXPRESSAO__BasicAssignment_2 : ( ruleLITERAIS_BASICOS ) ;
    public final void rule__EXPRESSAO__BasicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4117:1: ( ( ruleLITERAIS_BASICOS ) )
            // InternalGo.g:4118:2: ( ruleLITERAIS_BASICOS )
            {
            // InternalGo.g:4118:2: ( ruleLITERAIS_BASICOS )
            // InternalGo.g:4119:3: ruleLITERAIS_BASICOS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLITERAIS_BASICOS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__BasicAssignment_2"


    // $ANTLR start "rule__EXPRESSAO__Binary_expAssignment_3"
    // InternalGo.g:4128:1: rule__EXPRESSAO__Binary_expAssignment_3 : ( ruleBINARY_EXP ) ;
    public final void rule__EXPRESSAO__Binary_expAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4132:1: ( ( ruleBINARY_EXP ) )
            // InternalGo.g:4133:2: ( ruleBINARY_EXP )
            {
            // InternalGo.g:4133:2: ( ruleBINARY_EXP )
            // InternalGo.g:4134:3: ruleBINARY_EXP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getBinary_expBINARY_EXPParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBINARY_EXP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getBinary_expBINARY_EXPParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__Binary_expAssignment_3"


    // $ANTLR start "rule__EXPRESSAO__DeclFunctionAssignment_4"
    // InternalGo.g:4143:1: rule__EXPRESSAO__DeclFunctionAssignment_4 : ( ruleFunctionType ) ;
    public final void rule__EXPRESSAO__DeclFunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4147:1: ( ( ruleFunctionType ) )
            // InternalGo.g:4148:2: ( ruleFunctionType )
            {
            // InternalGo.g:4148:2: ( ruleFunctionType )
            // InternalGo.g:4149:3: ruleFunctionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFunctionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFunctionTypeParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__DeclFunctionAssignment_4"


    // $ANTLR start "rule__EXPRESSAO__AssignmentAssignment_5"
    // InternalGo.g:4158:1: rule__EXPRESSAO__AssignmentAssignment_5 : ( ruleAssignment ) ;
    public final void rule__EXPRESSAO__AssignmentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4162:1: ( ( ruleAssignment ) )
            // InternalGo.g:4163:2: ( ruleAssignment )
            {
            // InternalGo.g:4163:2: ( ruleAssignment )
            // InternalGo.g:4164:3: ruleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getAssignmentAssignmentParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getAssignmentAssignmentParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__AssignmentAssignment_5"


    // $ANTLR start "rule__EXPRESSAO__VariaveisAssignment_6"
    // InternalGo.g:4173:1: rule__EXPRESSAO__VariaveisAssignment_6 : ( ruleVarDecl ) ;
    public final void rule__EXPRESSAO__VariaveisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4177:1: ( ( ruleVarDecl ) )
            // InternalGo.g:4178:2: ( ruleVarDecl )
            {
            // InternalGo.g:4178:2: ( ruleVarDecl )
            // InternalGo.g:4179:3: ruleVarDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVarDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getVariaveisVarDeclParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__VariaveisAssignment_6"


    // $ANTLR start "rule__EXPRESSAO__ForAssignment_7"
    // InternalGo.g:4188:1: rule__EXPRESSAO__ForAssignment_7 : ( ruleForDecl ) ;
    public final void rule__EXPRESSAO__ForAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4192:1: ( ( ruleForDecl ) )
            // InternalGo.g:4193:2: ( ruleForDecl )
            {
            // InternalGo.g:4193:2: ( ruleForDecl )
            // InternalGo.g:4194:3: ruleForDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getForForDeclParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleForDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getForForDeclParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__ForAssignment_7"


    // $ANTLR start "rule__EXPRESSAO__BasicAssignment_8"
    // InternalGo.g:4203:1: rule__EXPRESSAO__BasicAssignment_8 : ( ruleLITERAIS_BASICOS ) ;
    public final void rule__EXPRESSAO__BasicAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4207:1: ( ( ruleLITERAIS_BASICOS ) )
            // InternalGo.g:4208:2: ( ruleLITERAIS_BASICOS )
            {
            // InternalGo.g:4208:2: ( ruleLITERAIS_BASICOS )
            // InternalGo.g:4209:3: ruleLITERAIS_BASICOS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLITERAIS_BASICOS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__BasicAssignment_8"


    // $ANTLR start "rule__EXPRESSAO__ArrayValueAssignment_9"
    // InternalGo.g:4218:1: rule__EXPRESSAO__ArrayValueAssignment_9 : ( ruleArrayValue ) ;
    public final void rule__EXPRESSAO__ArrayValueAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4222:1: ( ( ruleArrayValue ) )
            // InternalGo.g:4223:2: ( ruleArrayValue )
            {
            // InternalGo.g:4223:2: ( ruleArrayValue )
            // InternalGo.g:4224:3: ruleArrayValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEXPRESSAOAccess().getArrayValueArrayValueParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEXPRESSAOAccess().getArrayValueArrayValueParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSAO__ArrayValueAssignment_9"


    // $ANTLR start "rule__ArrayValue__LitAssignment_1"
    // InternalGo.g:4233:1: rule__ArrayValue__LitAssignment_1 : ( ruleLiteraisList ) ;
    public final void rule__ArrayValue__LitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4237:1: ( ( ruleLiteraisList ) )
            // InternalGo.g:4238:2: ( ruleLiteraisList )
            {
            // InternalGo.g:4238:2: ( ruleLiteraisList )
            // InternalGo.g:4239:3: ruleLiteraisList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getLitLiteraisListParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteraisList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getLitLiteraisListParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__LitAssignment_1"


    // $ANTLR start "rule__LiteraisList__LitAssignment_0"
    // InternalGo.g:4248:1: rule__LiteraisList__LitAssignment_0 : ( ruleLITERAIS_BASICOS ) ;
    public final void rule__LiteraisList__LitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4252:1: ( ( ruleLITERAIS_BASICOS ) )
            // InternalGo.g:4253:2: ( ruleLITERAIS_BASICOS )
            {
            // InternalGo.g:4253:2: ( ruleLITERAIS_BASICOS )
            // InternalGo.g:4254:3: ruleLITERAIS_BASICOS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteraisListAccess().getLitLITERAIS_BASICOSParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLITERAIS_BASICOS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteraisListAccess().getLitLITERAIS_BASICOSParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__LitAssignment_0"


    // $ANTLR start "rule__LiteraisList__LitAssignment_1_0"
    // InternalGo.g:4263:1: rule__LiteraisList__LitAssignment_1_0 : ( ruleLITERAIS_BASICOS ) ;
    public final void rule__LiteraisList__LitAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4267:1: ( ( ruleLITERAIS_BASICOS ) )
            // InternalGo.g:4268:2: ( ruleLITERAIS_BASICOS )
            {
            // InternalGo.g:4268:2: ( ruleLITERAIS_BASICOS )
            // InternalGo.g:4269:3: ruleLITERAIS_BASICOS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteraisListAccess().getLitLITERAIS_BASICOSParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLITERAIS_BASICOS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteraisListAccess().getLitLITERAIS_BASICOSParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__LitAssignment_1_0"


    // $ANTLR start "rule__LiteraisList__LitAssignment_1_2"
    // InternalGo.g:4278:1: rule__LiteraisList__LitAssignment_1_2 : ( ruleLiteraisList ) ;
    public final void rule__LiteraisList__LitAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4282:1: ( ( ruleLiteraisList ) )
            // InternalGo.g:4283:2: ( ruleLiteraisList )
            {
            // InternalGo.g:4283:2: ( ruleLiteraisList )
            // InternalGo.g:4284:3: ruleLiteraisList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteraisListAccess().getLitLiteraisListParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteraisList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteraisListAccess().getLitLiteraisListParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteraisList__LitAssignment_1_2"


    // $ANTLR start "rule__LITERAIS_BASICOS__NumeroAssignment_0"
    // InternalGo.g:4293:1: rule__LITERAIS_BASICOS__NumeroAssignment_0 : ( RULE_NUMERO ) ;
    public final void rule__LITERAIS_BASICOS__NumeroAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4297:1: ( ( RULE_NUMERO ) )
            // InternalGo.g:4298:2: ( RULE_NUMERO )
            {
            // InternalGo.g:4298:2: ( RULE_NUMERO )
            // InternalGo.g:4299:3: RULE_NUMERO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLITERAIS_BASICOSAccess().getNumeroNUMEROTerminalRuleCall_0_0()); 
            }
            match(input,RULE_NUMERO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLITERAIS_BASICOSAccess().getNumeroNUMEROTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LITERAIS_BASICOS__NumeroAssignment_0"


    // $ANTLR start "rule__LITERAIS_BASICOS__StringAssignment_1"
    // InternalGo.g:4308:1: rule__LITERAIS_BASICOS__StringAssignment_1 : ( RULE_STRING_DECL ) ;
    public final void rule__LITERAIS_BASICOS__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4312:1: ( ( RULE_STRING_DECL ) )
            // InternalGo.g:4313:2: ( RULE_STRING_DECL )
            {
            // InternalGo.g:4313:2: ( RULE_STRING_DECL )
            // InternalGo.g:4314:3: RULE_STRING_DECL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLITERAIS_BASICOSAccess().getStringSTRING_DECLTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING_DECL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLITERAIS_BASICOSAccess().getStringSTRING_DECLTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LITERAIS_BASICOS__StringAssignment_1"


    // $ANTLR start "rule__LITERAIS_BASICOS__BooleanoAssignment_2"
    // InternalGo.g:4323:1: rule__LITERAIS_BASICOS__BooleanoAssignment_2 : ( ruleBOOLEAN_VALUE ) ;
    public final void rule__LITERAIS_BASICOS__BooleanoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4327:1: ( ( ruleBOOLEAN_VALUE ) )
            // InternalGo.g:4328:2: ( ruleBOOLEAN_VALUE )
            {
            // InternalGo.g:4328:2: ( ruleBOOLEAN_VALUE )
            // InternalGo.g:4329:3: ruleBOOLEAN_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLITERAIS_BASICOSAccess().getBooleanoBOOLEAN_VALUEParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBOOLEAN_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLITERAIS_BASICOSAccess().getBooleanoBOOLEAN_VALUEParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LITERAIS_BASICOS__BooleanoAssignment_2"


    // $ANTLR start "rule__BINARY_EXP__BasicAssignment_0_0"
    // InternalGo.g:4338:1: rule__BINARY_EXP__BasicAssignment_0_0 : ( ruleLITERAIS_BASICOS ) ;
    public final void rule__BINARY_EXP__BasicAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4342:1: ( ( ruleLITERAIS_BASICOS ) )
            // InternalGo.g:4343:2: ( ruleLITERAIS_BASICOS )
            {
            // InternalGo.g:4343:2: ( ruleLITERAIS_BASICOS )
            // InternalGo.g:4344:3: ruleLITERAIS_BASICOS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPAccess().getBasicLITERAIS_BASICOSParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLITERAIS_BASICOS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPAccess().getBasicLITERAIS_BASICOSParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__BasicAssignment_0_0"


    // $ANTLR start "rule__BINARY_EXP__BoolAssignment_0_1_0"
    // InternalGo.g:4353:1: rule__BINARY_EXP__BoolAssignment_0_1_0 : ( ruleBOOL_OP ) ;
    public final void rule__BINARY_EXP__BoolAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4357:1: ( ( ruleBOOL_OP ) )
            // InternalGo.g:4358:2: ( ruleBOOL_OP )
            {
            // InternalGo.g:4358:2: ( ruleBOOL_OP )
            // InternalGo.g:4359:3: ruleBOOL_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPAccess().getBoolBOOL_OPParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBOOL_OP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPAccess().getBoolBOOL_OPParserRuleCall_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__BoolAssignment_0_1_0"


    // $ANTLR start "rule__BINARY_EXP__AritAssignment_0_1_1"
    // InternalGo.g:4368:1: rule__BINARY_EXP__AritAssignment_0_1_1 : ( ruleARIT_OP ) ;
    public final void rule__BINARY_EXP__AritAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4372:1: ( ( ruleARIT_OP ) )
            // InternalGo.g:4373:2: ( ruleARIT_OP )
            {
            // InternalGo.g:4373:2: ( ruleARIT_OP )
            // InternalGo.g:4374:3: ruleARIT_OP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPAccess().getAritARIT_OPParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleARIT_OP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPAccess().getAritARIT_OPParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__AritAssignment_0_1_1"


    // $ANTLR start "rule__BINARY_EXP__BinabasicAssignment_0_2"
    // InternalGo.g:4383:1: rule__BINARY_EXP__BinabasicAssignment_0_2 : ( ruleBINARY_EXP ) ;
    public final void rule__BINARY_EXP__BinabasicAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4387:1: ( ( ruleBINARY_EXP ) )
            // InternalGo.g:4388:2: ( ruleBINARY_EXP )
            {
            // InternalGo.g:4388:2: ( ruleBINARY_EXP )
            // InternalGo.g:4389:3: ruleBINARY_EXP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPAccess().getBinabasicBINARY_EXPParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBINARY_EXP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPAccess().getBinabasicBINARY_EXPParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__BinabasicAssignment_0_2"


    // $ANTLR start "rule__BINARY_EXP__Unique_basicAssignment_1"
    // InternalGo.g:4398:1: rule__BINARY_EXP__Unique_basicAssignment_1 : ( ruleLITERAIS_BASICOS ) ;
    public final void rule__BINARY_EXP__Unique_basicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4402:1: ( ( ruleLITERAIS_BASICOS ) )
            // InternalGo.g:4403:2: ( ruleLITERAIS_BASICOS )
            {
            // InternalGo.g:4403:2: ( ruleLITERAIS_BASICOS )
            // InternalGo.g:4404:3: ruleLITERAIS_BASICOS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBINARY_EXPAccess().getUnique_basicLITERAIS_BASICOSParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLITERAIS_BASICOS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBINARY_EXPAccess().getUnique_basicLITERAIS_BASICOSParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BINARY_EXP__Unique_basicAssignment_1"


    // $ANTLR start "rule__FunctionType__NomeAssignment_1"
    // InternalGo.g:4413:1: rule__FunctionType__NomeAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionType__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4417:1: ( ( RULE_ID ) )
            // InternalGo.g:4418:2: ( RULE_ID )
            {
            // InternalGo.g:4418:2: ( RULE_ID )
            // InternalGo.g:4419:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionTypeAccess().getNomeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionTypeAccess().getNomeIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__NomeAssignment_1"


    // $ANTLR start "rule__FunctionType__AssinaturaAssignment_2"
    // InternalGo.g:4428:1: rule__FunctionType__AssinaturaAssignment_2 : ( ruleSignature ) ;
    public final void rule__FunctionType__AssinaturaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4432:1: ( ( ruleSignature ) )
            // InternalGo.g:4433:2: ( ruleSignature )
            {
            // InternalGo.g:4433:2: ( ruleSignature )
            // InternalGo.g:4434:3: ruleSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionTypeAccess().getAssinaturaSignatureParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionTypeAccess().getAssinaturaSignatureParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__AssinaturaAssignment_2"


    // $ANTLR start "rule__FunctionType__BlocoAssignment_3"
    // InternalGo.g:4443:1: rule__FunctionType__BlocoAssignment_3 : ( ruleBLOCK ) ;
    public final void rule__FunctionType__BlocoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4447:1: ( ( ruleBLOCK ) )
            // InternalGo.g:4448:2: ( ruleBLOCK )
            {
            // InternalGo.g:4448:2: ( ruleBLOCK )
            // InternalGo.g:4449:3: ruleBLOCK
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionTypeAccess().getBlocoBLOCKParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBLOCK();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionTypeAccess().getBlocoBLOCKParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__BlocoAssignment_3"


    // $ANTLR start "rule__Signature__RetornoAssignment_1"
    // InternalGo.g:4458:1: rule__Signature__RetornoAssignment_1 : ( ruleResult ) ;
    public final void rule__Signature__RetornoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4462:1: ( ( ruleResult ) )
            // InternalGo.g:4463:2: ( ruleResult )
            {
            // InternalGo.g:4463:2: ( ruleResult )
            // InternalGo.g:4464:3: ruleResult
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getRetornoResultParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleResult();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getRetornoResultParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__RetornoAssignment_1"


    // $ANTLR start "rule__Result__ParametrosAssignment_0_1"
    // InternalGo.g:4473:1: rule__Result__ParametrosAssignment_0_1 : ( ruleParameters ) ;
    public final void rule__Result__ParametrosAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4477:1: ( ( ruleParameters ) )
            // InternalGo.g:4478:2: ( ruleParameters )
            {
            // InternalGo.g:4478:2: ( ruleParameters )
            // InternalGo.g:4479:3: ruleParameters
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultAccess().getParametrosParametersParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultAccess().getParametrosParametersParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__ParametrosAssignment_0_1"


    // $ANTLR start "rule__Result__TipoAssignment_1"
    // InternalGo.g:4488:1: rule__Result__TipoAssignment_1 : ( ruleTypes ) ;
    public final void rule__Result__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4492:1: ( ( ruleTypes ) )
            // InternalGo.g:4493:2: ( ruleTypes )
            {
            // InternalGo.g:4493:2: ( ruleTypes )
            // InternalGo.g:4494:3: ruleTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultAccess().getTipoTypesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultAccess().getTipoTypesParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Result__TipoAssignment_1"


    // $ANTLR start "rule__BLOCK__ListaDeComandosAssignment_2"
    // InternalGo.g:4503:1: rule__BLOCK__ListaDeComandosAssignment_2 : ( ruleEXPRESSAO ) ;
    public final void rule__BLOCK__ListaDeComandosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4507:1: ( ( ruleEXPRESSAO ) )
            // InternalGo.g:4508:2: ( ruleEXPRESSAO )
            {
            // InternalGo.g:4508:2: ( ruleEXPRESSAO )
            // InternalGo.g:4509:3: ruleEXPRESSAO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBLOCKAccess().getListaDeComandosEXPRESSAOParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEXPRESSAO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBLOCKAccess().getListaDeComandosEXPRESSAOParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BLOCK__ListaDeComandosAssignment_2"


    // $ANTLR start "rule__PARAMETERS_LIST__PARAMETERAssignment_1_1"
    // InternalGo.g:4518:1: rule__PARAMETERS_LIST__PARAMETERAssignment_1_1 : ( rulePARAMETER ) ;
    public final void rule__PARAMETERS_LIST__PARAMETERAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4522:1: ( ( rulePARAMETER ) )
            // InternalGo.g:4523:2: ( rulePARAMETER )
            {
            // InternalGo.g:4523:2: ( rulePARAMETER )
            // InternalGo.g:4524:3: rulePARAMETER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERPARAMETERParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePARAMETER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERPARAMETERParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETERS_LIST__PARAMETERAssignment_1_1"


    // $ANTLR start "rule__PARAMETER__IdAssignment_0"
    // InternalGo.g:4533:1: rule__PARAMETER__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__PARAMETER__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4537:1: ( ( RULE_ID ) )
            // InternalGo.g:4538:2: ( RULE_ID )
            {
            // InternalGo.g:4538:2: ( RULE_ID )
            // InternalGo.g:4539:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERAccess().getIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERAccess().getIdIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETER__IdAssignment_0"


    // $ANTLR start "rule__PARAMETER__TipoAssignment_1"
    // InternalGo.g:4548:1: rule__PARAMETER__TipoAssignment_1 : ( ruleTypes ) ;
    public final void rule__PARAMETER__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4552:1: ( ( ruleTypes ) )
            // InternalGo.g:4553:2: ( ruleTypes )
            {
            // InternalGo.g:4553:2: ( ruleTypes )
            // InternalGo.g:4554:3: ruleTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPARAMETERAccess().getTipoTypesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPARAMETERAccess().getTipoTypesParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAMETER__TipoAssignment_1"


    // $ANTLR start "rule__Types__BasicAssignment_0"
    // InternalGo.g:4563:1: rule__Types__BasicAssignment_0 : ( ruleBasicType ) ;
    public final void rule__Types__BasicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4567:1: ( ( ruleBasicType ) )
            // InternalGo.g:4568:2: ( ruleBasicType )
            {
            // InternalGo.g:4568:2: ( ruleBasicType )
            // InternalGo.g:4569:3: ruleBasicType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypesAccess().getBasicBasicTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypesAccess().getBasicBasicTypeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__BasicAssignment_0"


    // $ANTLR start "rule__Types__ArrayAssignment_1"
    // InternalGo.g:4578:1: rule__Types__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__Types__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4582:1: ( ( ruleArrayType ) )
            // InternalGo.g:4583:2: ( ruleArrayType )
            {
            // InternalGo.g:4583:2: ( ruleArrayType )
            // InternalGo.g:4584:3: ruleArrayType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypesAccess().getArrayArrayTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypesAccess().getArrayArrayTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__ArrayAssignment_1"


    // $ANTLR start "rule__ArrayType__QtdAssignment_1"
    // InternalGo.g:4593:1: rule__ArrayType__QtdAssignment_1 : ( RULE_NUMERO ) ;
    public final void rule__ArrayType__QtdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4597:1: ( ( RULE_NUMERO ) )
            // InternalGo.g:4598:2: ( RULE_NUMERO )
            {
            // InternalGo.g:4598:2: ( RULE_NUMERO )
            // InternalGo.g:4599:3: RULE_NUMERO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeAccess().getQtdNUMEROTerminalRuleCall_1_0()); 
            }
            match(input,RULE_NUMERO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeAccess().getQtdNUMEROTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__QtdAssignment_1"


    // $ANTLR start "rule__ArrayType__BasicAssignment_3"
    // InternalGo.g:4608:1: rule__ArrayType__BasicAssignment_3 : ( ruleBasicType ) ;
    public final void rule__ArrayType__BasicAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4612:1: ( ( ruleBasicType ) )
            // InternalGo.g:4613:2: ( ruleBasicType )
            {
            // InternalGo.g:4613:2: ( ruleBasicType )
            // InternalGo.g:4614:3: ruleBasicType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeAccess().getBasicBasicTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeAccess().getBasicBasicTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__BasicAssignment_3"


    // $ANTLR start "rule__BasicType__StringAssignment_0"
    // InternalGo.g:4623:1: rule__BasicType__StringAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__BasicType__StringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4627:1: ( ( ( 'string' ) ) )
            // InternalGo.g:4628:2: ( ( 'string' ) )
            {
            // InternalGo.g:4628:2: ( ( 'string' ) )
            // InternalGo.g:4629:3: ( 'string' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getStringStringKeyword_0_0()); 
            }
            // InternalGo.g:4630:3: ( 'string' )
            // InternalGo.g:4631:4: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getStringStringKeyword_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getStringStringKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getStringStringKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__StringAssignment_0"


    // $ANTLR start "rule__BasicType__IntAssignment_1"
    // InternalGo.g:4642:1: rule__BasicType__IntAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__BasicType__IntAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4646:1: ( ( ( 'int' ) ) )
            // InternalGo.g:4647:2: ( ( 'int' ) )
            {
            // InternalGo.g:4647:2: ( ( 'int' ) )
            // InternalGo.g:4648:3: ( 'int' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getIntIntKeyword_1_0()); 
            }
            // InternalGo.g:4649:3: ( 'int' )
            // InternalGo.g:4650:4: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getIntIntKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getIntIntKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getIntIntKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__IntAssignment_1"


    // $ANTLR start "rule__BasicType__FloatAssignment_2"
    // InternalGo.g:4661:1: rule__BasicType__FloatAssignment_2 : ( ( 'float' ) ) ;
    public final void rule__BasicType__FloatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4665:1: ( ( ( 'float' ) ) )
            // InternalGo.g:4666:2: ( ( 'float' ) )
            {
            // InternalGo.g:4666:2: ( ( 'float' ) )
            // InternalGo.g:4667:3: ( 'float' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getFloatFloatKeyword_2_0()); 
            }
            // InternalGo.g:4668:3: ( 'float' )
            // InternalGo.g:4669:4: 'float'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getFloatFloatKeyword_2_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getFloatFloatKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getFloatFloatKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__FloatAssignment_2"


    // $ANTLR start "rule__BasicType__BooleanAssignment_3"
    // InternalGo.g:4680:1: rule__BasicType__BooleanAssignment_3 : ( ( 'bool' ) ) ;
    public final void rule__BasicType__BooleanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4684:1: ( ( ( 'bool' ) ) )
            // InternalGo.g:4685:2: ( ( 'bool' ) )
            {
            // InternalGo.g:4685:2: ( ( 'bool' ) )
            // InternalGo.g:4686:3: ( 'bool' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getBooleanBoolKeyword_3_0()); 
            }
            // InternalGo.g:4687:3: ( 'bool' )
            // InternalGo.g:4688:4: 'bool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicTypeAccess().getBooleanBoolKeyword_3_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getBooleanBoolKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicTypeAccess().getBooleanBoolKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__BooleanAssignment_3"


    // $ANTLR start "rule__COMPARISON__IgualAssignment_0"
    // InternalGo.g:4699:1: rule__COMPARISON__IgualAssignment_0 : ( ( '==' ) ) ;
    public final void rule__COMPARISON__IgualAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4703:1: ( ( ( '==' ) ) )
            // InternalGo.g:4704:2: ( ( '==' ) )
            {
            // InternalGo.g:4704:2: ( ( '==' ) )
            // InternalGo.g:4705:3: ( '==' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getIgualEqualsSignEqualsSignKeyword_0_0()); 
            }
            // InternalGo.g:4706:3: ( '==' )
            // InternalGo.g:4707:4: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getIgualEqualsSignEqualsSignKeyword_0_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getIgualEqualsSignEqualsSignKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getIgualEqualsSignEqualsSignKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPARISON__IgualAssignment_0"


    // $ANTLR start "rule__COMPARISON__MaiorigualqueAssignment_1"
    // InternalGo.g:4718:1: rule__COMPARISON__MaiorigualqueAssignment_1 : ( ( '>=' ) ) ;
    public final void rule__COMPARISON__MaiorigualqueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4722:1: ( ( ( '>=' ) ) )
            // InternalGo.g:4723:2: ( ( '>=' ) )
            {
            // InternalGo.g:4723:2: ( ( '>=' ) )
            // InternalGo.g:4724:3: ( '>=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getMaiorigualqueGreaterThanSignEqualsSignKeyword_1_0()); 
            }
            // InternalGo.g:4725:3: ( '>=' )
            // InternalGo.g:4726:4: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getMaiorigualqueGreaterThanSignEqualsSignKeyword_1_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getMaiorigualqueGreaterThanSignEqualsSignKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getMaiorigualqueGreaterThanSignEqualsSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPARISON__MaiorigualqueAssignment_1"


    // $ANTLR start "rule__COMPARISON__MenorigualqueAssignment_2"
    // InternalGo.g:4737:1: rule__COMPARISON__MenorigualqueAssignment_2 : ( ( '<=' ) ) ;
    public final void rule__COMPARISON__MenorigualqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4741:1: ( ( ( '<=' ) ) )
            // InternalGo.g:4742:2: ( ( '<=' ) )
            {
            // InternalGo.g:4742:2: ( ( '<=' ) )
            // InternalGo.g:4743:3: ( '<=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getMenorigualqueLessThanSignEqualsSignKeyword_2_0()); 
            }
            // InternalGo.g:4744:3: ( '<=' )
            // InternalGo.g:4745:4: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getMenorigualqueLessThanSignEqualsSignKeyword_2_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getMenorigualqueLessThanSignEqualsSignKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getMenorigualqueLessThanSignEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPARISON__MenorigualqueAssignment_2"


    // $ANTLR start "rule__COMPARISON__MaiorqueAssignment_3"
    // InternalGo.g:4756:1: rule__COMPARISON__MaiorqueAssignment_3 : ( ( '>' ) ) ;
    public final void rule__COMPARISON__MaiorqueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4760:1: ( ( ( '>' ) ) )
            // InternalGo.g:4761:2: ( ( '>' ) )
            {
            // InternalGo.g:4761:2: ( ( '>' ) )
            // InternalGo.g:4762:3: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getMaiorqueGreaterThanSignKeyword_3_0()); 
            }
            // InternalGo.g:4763:3: ( '>' )
            // InternalGo.g:4764:4: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getMaiorqueGreaterThanSignKeyword_3_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getMaiorqueGreaterThanSignKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getMaiorqueGreaterThanSignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPARISON__MaiorqueAssignment_3"


    // $ANTLR start "rule__COMPARISON__MenorqueAssignment_4"
    // InternalGo.g:4775:1: rule__COMPARISON__MenorqueAssignment_4 : ( ( '<' ) ) ;
    public final void rule__COMPARISON__MenorqueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGo.g:4779:1: ( ( ( '<' ) ) )
            // InternalGo.g:4780:2: ( ( '<' ) )
            {
            // InternalGo.g:4780:2: ( ( '<' ) )
            // InternalGo.g:4781:3: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getMenorqueLessThanSignKeyword_4_0()); 
            }
            // InternalGo.g:4782:3: ( '<' )
            // InternalGo.g:4783:4: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCOMPARISONAccess().getMenorqueLessThanSignKeyword_4_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getMenorqueLessThanSignKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCOMPARISONAccess().getMenorqueLessThanSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPARISON__MenorqueAssignment_4"

    // $ANTLR start synpred4_InternalGo
    public final void synpred4_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1050:2: ( ( ( rule__GoDecl__VarAssignment_0 ) ) )
        // InternalGo.g:1050:2: ( ( rule__GoDecl__VarAssignment_0 ) )
        {
        // InternalGo.g:1050:2: ( ( rule__GoDecl__VarAssignment_0 ) )
        // InternalGo.g:1051:3: ( rule__GoDecl__VarAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGoDeclAccess().getVarAssignment_0()); 
        }
        // InternalGo.g:1052:3: ( rule__GoDecl__VarAssignment_0 )
        // InternalGo.g:1052:4: rule__GoDecl__VarAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__GoDecl__VarAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalGo

    // $ANTLR start synpred5_InternalGo
    public final void synpred5_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1056:2: ( ( ( rule__GoDecl__FuncAssignment_1 ) ) )
        // InternalGo.g:1056:2: ( ( rule__GoDecl__FuncAssignment_1 ) )
        {
        // InternalGo.g:1056:2: ( ( rule__GoDecl__FuncAssignment_1 ) )
        // InternalGo.g:1057:3: ( rule__GoDecl__FuncAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGoDeclAccess().getFuncAssignment_1()); 
        }
        // InternalGo.g:1058:3: ( rule__GoDecl__FuncAssignment_1 )
        // InternalGo.g:1058:4: rule__GoDecl__FuncAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__GoDecl__FuncAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalGo

    // $ANTLR start synpred10_InternalGo
    public final void synpred10_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1161:2: ( ( ( rule__EXPRESSAOLINHA__Group_0__0 ) ) )
        // InternalGo.g:1161:2: ( ( rule__EXPRESSAOLINHA__Group_0__0 ) )
        {
        // InternalGo.g:1161:2: ( ( rule__EXPRESSAOLINHA__Group_0__0 ) )
        // InternalGo.g:1162:3: ( rule__EXPRESSAOLINHA__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRESSAOLINHAAccess().getGroup_0()); 
        }
        // InternalGo.g:1163:3: ( rule__EXPRESSAOLINHA__Group_0__0 )
        // InternalGo.g:1163:4: rule__EXPRESSAOLINHA__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__EXPRESSAOLINHA__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalGo

    // $ANTLR start synpred11_InternalGo
    public final void synpred11_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1182:2: ( ( ( rule__EXPRESSAO__Group_0__0 ) ) )
        // InternalGo.g:1182:2: ( ( rule__EXPRESSAO__Group_0__0 ) )
        {
        // InternalGo.g:1182:2: ( ( rule__EXPRESSAO__Group_0__0 ) )
        // InternalGo.g:1183:3: ( rule__EXPRESSAO__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRESSAOAccess().getGroup_0()); 
        }
        // InternalGo.g:1184:3: ( rule__EXPRESSAO__Group_0__0 )
        // InternalGo.g:1184:4: rule__EXPRESSAO__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__EXPRESSAO__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalGo

    // $ANTLR start synpred12_InternalGo
    public final void synpred12_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1188:2: ( ( ( rule__EXPRESSAO__VariaveisAssignment_1 ) ) )
        // InternalGo.g:1188:2: ( ( rule__EXPRESSAO__VariaveisAssignment_1 ) )
        {
        // InternalGo.g:1188:2: ( ( rule__EXPRESSAO__VariaveisAssignment_1 ) )
        // InternalGo.g:1189:3: ( rule__EXPRESSAO__VariaveisAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRESSAOAccess().getVariaveisAssignment_1()); 
        }
        // InternalGo.g:1190:3: ( rule__EXPRESSAO__VariaveisAssignment_1 )
        // InternalGo.g:1190:4: rule__EXPRESSAO__VariaveisAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__EXPRESSAO__VariaveisAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalGo

    // $ANTLR start synpred13_InternalGo
    public final void synpred13_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1194:2: ( ( ( rule__EXPRESSAO__BasicAssignment_2 ) ) )
        // InternalGo.g:1194:2: ( ( rule__EXPRESSAO__BasicAssignment_2 ) )
        {
        // InternalGo.g:1194:2: ( ( rule__EXPRESSAO__BasicAssignment_2 ) )
        // InternalGo.g:1195:3: ( rule__EXPRESSAO__BasicAssignment_2 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRESSAOAccess().getBasicAssignment_2()); 
        }
        // InternalGo.g:1196:3: ( rule__EXPRESSAO__BasicAssignment_2 )
        // InternalGo.g:1196:4: rule__EXPRESSAO__BasicAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__EXPRESSAO__BasicAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalGo

    // $ANTLR start synpred14_InternalGo
    public final void synpred14_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1200:2: ( ( ( rule__EXPRESSAO__Binary_expAssignment_3 ) ) )
        // InternalGo.g:1200:2: ( ( rule__EXPRESSAO__Binary_expAssignment_3 ) )
        {
        // InternalGo.g:1200:2: ( ( rule__EXPRESSAO__Binary_expAssignment_3 ) )
        // InternalGo.g:1201:3: ( rule__EXPRESSAO__Binary_expAssignment_3 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRESSAOAccess().getBinary_expAssignment_3()); 
        }
        // InternalGo.g:1202:3: ( rule__EXPRESSAO__Binary_expAssignment_3 )
        // InternalGo.g:1202:4: rule__EXPRESSAO__Binary_expAssignment_3
        {
        pushFollow(FOLLOW_2);
        rule__EXPRESSAO__Binary_expAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalGo

    // $ANTLR start synpred15_InternalGo
    public final void synpred15_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1206:2: ( ( ( rule__EXPRESSAO__DeclFunctionAssignment_4 ) ) )
        // InternalGo.g:1206:2: ( ( rule__EXPRESSAO__DeclFunctionAssignment_4 ) )
        {
        // InternalGo.g:1206:2: ( ( rule__EXPRESSAO__DeclFunctionAssignment_4 ) )
        // InternalGo.g:1207:3: ( rule__EXPRESSAO__DeclFunctionAssignment_4 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRESSAOAccess().getDeclFunctionAssignment_4()); 
        }
        // InternalGo.g:1208:3: ( rule__EXPRESSAO__DeclFunctionAssignment_4 )
        // InternalGo.g:1208:4: rule__EXPRESSAO__DeclFunctionAssignment_4
        {
        pushFollow(FOLLOW_2);
        rule__EXPRESSAO__DeclFunctionAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalGo

    // $ANTLR start synpred17_InternalGo
    public final void synpred17_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1218:2: ( ( ( rule__EXPRESSAO__VariaveisAssignment_6 ) ) )
        // InternalGo.g:1218:2: ( ( rule__EXPRESSAO__VariaveisAssignment_6 ) )
        {
        // InternalGo.g:1218:2: ( ( rule__EXPRESSAO__VariaveisAssignment_6 ) )
        // InternalGo.g:1219:3: ( rule__EXPRESSAO__VariaveisAssignment_6 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRESSAOAccess().getVariaveisAssignment_6()); 
        }
        // InternalGo.g:1220:3: ( rule__EXPRESSAO__VariaveisAssignment_6 )
        // InternalGo.g:1220:4: rule__EXPRESSAO__VariaveisAssignment_6
        {
        pushFollow(FOLLOW_2);
        rule__EXPRESSAO__VariaveisAssignment_6();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalGo

    // $ANTLR start synpred19_InternalGo
    public final void synpred19_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1230:2: ( ( ( rule__EXPRESSAO__BasicAssignment_8 ) ) )
        // InternalGo.g:1230:2: ( ( rule__EXPRESSAO__BasicAssignment_8 ) )
        {
        // InternalGo.g:1230:2: ( ( rule__EXPRESSAO__BasicAssignment_8 ) )
        // InternalGo.g:1231:3: ( rule__EXPRESSAO__BasicAssignment_8 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEXPRESSAOAccess().getBasicAssignment_8()); 
        }
        // InternalGo.g:1232:3: ( rule__EXPRESSAO__BasicAssignment_8 )
        // InternalGo.g:1232:4: rule__EXPRESSAO__BasicAssignment_8
        {
        pushFollow(FOLLOW_2);
        rule__EXPRESSAO__BasicAssignment_8();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalGo

    // $ANTLR start synpred40_InternalGo
    public final void synpred40_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:1777:3: ( rule__ForClause__PostAssignment_5 )
        // InternalGo.g:1777:3: rule__ForClause__PostAssignment_5
        {
        pushFollow(FOLLOW_2);
        rule__ForClause__PostAssignment_5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalGo

    // $ANTLR start synpred46_InternalGo
    public final void synpred46_InternalGo_fragment() throws RecognitionException {   
        // InternalGo.g:2803:3: ( rule__FunctionType__BlocoAssignment_3 )
        // InternalGo.g:2803:3: rule__FunctionType__BlocoAssignment_3
        {
        pushFollow(FOLLOW_2);
        rule__FunctionType__BlocoAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalGo

    // Delegated rules

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
    public final boolean synpred40_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalGo_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalGo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalGo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String dfa_1s = "\45\uffff";
    static final String dfa_2s = "\3\4\1\0\1\4\1\uffff\1\0\1\uffff\1\15\1\4\1\31\1\0\4\16\1\5\1\uffff\1\4\1\32\1\44\1\31\10\16\1\5\1\32\1\44\4\16";
    static final String dfa_3s = "\1\41\2\4\1\0\1\4\1\uffff\1\0\1\uffff\1\15\1\16\1\47\1\0\4\30\1\32\1\uffff\1\4\1\32\2\47\10\30\2\32\1\47\4\30";
    static final String dfa_4s = "\5\uffff\1\3\1\uffff\1\1\11\uffff\1\2\23\uffff";
    static final String dfa_5s = "\3\uffff\1\1\2\uffff\1\2\4\uffff\1\0\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\2\5\15\uffff\2\5\5\uffff\1\4\2\uffff\2\5\1\1\1\2",
            "\1\6",
            "\1\6",
            "\1\uffff",
            "\1\10",
            "",
            "\1\uffff",
            "",
            "\1\11",
            "\1\12\11\uffff\1\13",
            "\1\20\12\uffff\1\14\1\15\1\16\1\17",
            "\1\uffff",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\23\24\uffff\1\24",
            "",
            "\1\25",
            "\1\24",
            "\1\26\1\27\1\30\1\31",
            "\1\36\12\uffff\1\32\1\33\1\34\1\35",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\37\24\uffff\1\40",
            "\1\40",
            "\1\41\1\42\1\43\1\44",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22",
            "\1\13\11\uffff\1\22"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1045:1: rule__GoDecl__Alternatives : ( ( ( rule__GoDecl__VarAssignment_0 ) ) | ( ( rule__GoDecl__FuncAssignment_1 ) ) | ( ( rule__GoDecl__ExpressaoAssignment_2 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalGo()) ) {s = 17;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalGo()) ) {s = 7;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalGo()) ) {s = 7;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\4\12\0\2\uffff";
    static final String dfa_9s = "\1\41\12\0\2\uffff";
    static final String dfa_10s = "\13\uffff\1\1\1\2";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\1\5\1\6\15\uffff\1\11\1\12\5\uffff\1\1\2\uffff\1\7\1\10\1\2\1\3",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1156:1: rule__EXPRESSAOLINHA__Alternatives : ( ( ( rule__EXPRESSAOLINHA__Group_0__0 ) ) | ( ( rule__EXPRESSAOLINHA__ExpAssignment_1 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGo()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index9_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\60\uffff";
    static final String dfa_14s = "\4\4\1\31\4\0\2\uffff\1\15\1\0\6\uffff\1\4\1\31\1\0\4\16\1\5\2\uffff\1\4\1\32\1\44\1\31\10\16\1\5\1\32\1\44\4\16";
    static final String dfa_15s = "\1\41\3\4\1\43\4\0\2\uffff\1\15\1\0\6\uffff\1\16\1\47\1\0\4\30\1\32\2\uffff\1\4\1\32\2\47\10\30\2\32\1\47\4\30";
    static final String dfa_16s = "\11\uffff\1\10\1\12\2\uffff\1\6\1\2\1\7\1\3\1\4\1\11\10\uffff\1\1\1\5\23\uffff";
    static final String dfa_17s = "\4\uffff\1\4\1\3\1\1\1\0\1\6\3\uffff\1\5\10\uffff\1\2\32\uffff}>";
    static final String[] dfa_18s = {
            "\1\4\1\5\1\6\15\uffff\1\11\1\12\5\uffff\1\1\2\uffff\1\7\1\10\1\2\1\3",
            "\1\13",
            "\1\14",
            "\1\14",
            "\1\15\10\uffff\2\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\23",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\11\uffff\1\25",
            "\1\32\12\uffff\1\26\1\27\1\30\1\31",
            "\1\uffff",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\36\24\uffff\1\37",
            "",
            "",
            "\1\40",
            "\1\37",
            "\1\41\1\42\1\43\1\44",
            "\1\51\12\uffff\1\45\1\46\1\47\1\50",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\52\24\uffff\1\53",
            "\1\53",
            "\1\54\1\55\1\56\1\57",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35",
            "\1\25\11\uffff\1\35"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1177:1: rule__EXPRESSAO__Alternatives : ( ( ( rule__EXPRESSAO__Group_0__0 ) ) | ( ( rule__EXPRESSAO__VariaveisAssignment_1 ) ) | ( ( rule__EXPRESSAO__BasicAssignment_2 ) ) | ( ( rule__EXPRESSAO__Binary_expAssignment_3 ) ) | ( ( rule__EXPRESSAO__DeclFunctionAssignment_4 ) ) | ( ( rule__EXPRESSAO__AssignmentAssignment_5 ) ) | ( ( rule__EXPRESSAO__VariaveisAssignment_6 ) ) | ( ( rule__EXPRESSAO__ForAssignment_7 ) ) | ( ( rule__EXPRESSAO__BasicAssignment_8 ) ) | ( ( rule__EXPRESSAO__ArrayValueAssignment_9 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGo()) ) {s = 16;}

                        else if ( (synpred14_InternalGo()) ) {s = 17;}

                        else if ( (synpred19_InternalGo()) ) {s = 18;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGo()) ) {s = 16;}

                        else if ( (synpred14_InternalGo()) ) {s = 17;}

                        else if ( (synpred19_InternalGo()) ) {s = 18;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_21 = input.LA(1);

                         
                        int index10_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalGo()) ) {s = 27;}

                        else if ( (synpred15_InternalGo()) ) {s = 28;}

                         
                        input.seek(index10_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGo()) ) {s = 16;}

                        else if ( (synpred14_InternalGo()) ) {s = 17;}

                        else if ( (synpred19_InternalGo()) ) {s = 18;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_4==25||(LA10_4>=34 && LA10_4<=35)) ) {s = 13;}

                        else if ( (synpred12_InternalGo()) ) {s = 14;}

                        else if ( (synpred17_InternalGo()) ) {s = 15;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_12 = input.LA(1);

                         
                        int index10_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalGo()) ) {s = 14;}

                        else if ( (synpred17_InternalGo()) ) {s = 15;}

                         
                        input.seek(index10_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalGo()) ) {s = 16;}

                        else if ( (synpred14_InternalGo()) ) {s = 17;}

                        else if ( (synpred19_InternalGo()) ) {s = 18;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\14\uffff";
    static final String dfa_20s = "\1\13\13\uffff";
    static final String dfa_21s = "\1\4\11\uffff\1\0\1\uffff";
    static final String dfa_22s = "\1\41\11\uffff\1\0\1\uffff";
    static final String dfa_23s = "\1\uffff\1\1\11\uffff\1\2";
    static final String dfa_24s = "\12\uffff\1\0\1\uffff}>";
    static final String[] dfa_25s = {
            "\3\1\15\uffff\1\1\1\12\5\uffff\1\1\2\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1777:2: ( rule__ForClause__PostAssignment_5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalGo()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\24\uffff";
    static final String dfa_27s = "\1\2\23\uffff";
    static final String dfa_28s = "\1\4\1\0\22\uffff";
    static final String dfa_29s = "\1\54\1\0\22\uffff";
    static final String dfa_30s = "\2\uffff\1\2\20\uffff\1\1";
    static final String dfa_31s = "\1\uffff\1\0\22\uffff}>";
    static final String[] dfa_32s = {
            "\3\2\15\uffff\1\2\1\1\2\2\3\uffff\1\2\2\uffff\4\2\6\uffff\5\2",
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
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "2803:2: ( rule__FunctionType__BlocoAssignment_3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalGo()) ) {s = 19;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003C8300072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000003C8B00070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000003C8300070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000003CA300070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000F002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000C02000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000060L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000300F8000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000F002002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000003C8700070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000F000000000L});

}