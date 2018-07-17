/*
 * generated by Xtext 2.14.0
 */
grammar InternalGo;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.ufcg.compiler.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleInit
entryRuleInit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitRule()); }
	iv_ruleInit=ruleInit
	{ $current=$iv_ruleInit.current; }
	EOF;

// Rule Init
ruleInit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getInitAccess().getElementsGoDeclParserRuleCall_0());
			}
			lv_elements_0_0=ruleGoDecl
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getInitRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"com.ufcg.compiler.Go.GoDecl");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleGoDecl
entryRuleGoDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoDeclRule()); }
	iv_ruleGoDecl=ruleGoDecl
	{ $current=$iv_ruleGoDecl.current; }
	EOF;

// Rule GoDecl
ruleGoDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getGoDeclAccess().getVarVarDeclParserRuleCall_0_0());
				}
				lv_var_0_0=ruleVarDecl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGoDeclRule());
					}
					set(
						$current,
						"var",
						lv_var_0_0,
						"com.ufcg.compiler.Go.VarDecl");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getGoDeclAccess().getFuncFUNCAOParserRuleCall_1_0());
				}
				lv_func_1_0=ruleFUNCAO
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGoDeclRule());
					}
					set(
						$current,
						"func",
						lv_func_1_0,
						"com.ufcg.compiler.Go.FUNCAO");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVarDecl
entryRuleVarDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarDeclRule()); }
	iv_ruleVarDecl=ruleVarDecl
	{ $current=$iv_ruleVarDecl.current; }
	EOF;

// Rule VarDecl
ruleVarDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getVarDeclAccess().getTipoDeclTIPOParserRuleCall_0_0());
				}
				lv_tipoDecl_0_0=ruleTIPO
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarDeclRule());
					}
					set(
						$current,
						"tipoDecl",
						lv_tipoDecl_0_0,
						"com.ufcg.compiler.Go.TIPO");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getVarDeclAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarDeclRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVarDeclAccess().getAtribuicaoIGUALParserRuleCall_2_0());
				}
				lv_atribuicao_2_0=ruleIGUAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarDeclRule());
					}
					set(
						$current,
						"atribuicao",
						lv_atribuicao_2_0,
						"com.ufcg.compiler.Go.IGUAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVarDeclAccess().getExpressaoEXPRESSAOParserRuleCall_3_0());
				}
				lv_expressao_3_0=ruleEXPRESSAO
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVarDeclRule());
					}
					set(
						$current,
						"expressao",
						lv_expressao_3_0,
						"com.ufcg.compiler.Go.EXPRESSAO");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTIPO
entryRuleTIPO returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTIPORule()); }
	iv_ruleTIPO=ruleTIPO
	{ $current=$iv_ruleTIPO.current; }
	EOF;

// Rule TIPO
ruleTIPO returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_variavel_0_0='var'
				{
					newLeafNode(lv_variavel_0_0, grammarAccess.getTIPOAccess().getVariavelVarKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTIPORule());
					}
					setWithLastConsumed($current, "variavel", lv_variavel_0_0, "var");
				}
			)
		)
		    |
		(
			(
				lv_constante_1_0='const'
				{
					newLeafNode(lv_constante_1_0, grammarAccess.getTIPOAccess().getConstanteConstKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTIPORule());
					}
					setWithLastConsumed($current, "constante", lv_constante_1_0, "const");
				}
			)
		)
	)
;

// Entry rule entryRuleIGUAL
entryRuleIGUAL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIGUALRule()); }
	iv_ruleIGUAL=ruleIGUAL
	{ $current=$iv_ruleIGUAL.current; }
	EOF;

// Rule IGUAL
ruleIGUAL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_igual_0_0='='
			{
				newLeafNode(lv_igual_0_0, grammarAccess.getIGUALAccess().getIgualEqualsSignKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIGUALRule());
				}
				setWithLastConsumed($current, "igual", lv_igual_0_0, "=");
			}
		)
	)
;

// Entry rule entryRuleEXPRESSAO
entryRuleEXPRESSAO returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEXPRESSAORule()); }
	iv_ruleEXPRESSAO=ruleEXPRESSAO
	{ $current=$iv_ruleEXPRESSAO.current; }
	EOF;

// Rule EXPRESSAO
ruleEXPRESSAO returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getBasicLITERAIS_BASICOSParserRuleCall_0_0());
				}
				lv_basic_0_0=ruleLITERAIS_BASICOS
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
					}
					set(
						$current,
						"basic",
						lv_basic_0_0,
						"com.ufcg.compiler.Go.LITERAIS_BASICOS");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getEXPRESSAOAccess().getDeclFunctionFUNCAOParserRuleCall_1_0());
				}
				lv_declFunction_1_0=ruleFUNCAO
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEXPRESSAORule());
					}
					set(
						$current,
						"declFunction",
						lv_declFunction_1_0,
						"com.ufcg.compiler.Go.FUNCAO");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLITERAIS_BASICOS
entryRuleLITERAIS_BASICOS returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLITERAIS_BASICOSRule()); }
	iv_ruleLITERAIS_BASICOS=ruleLITERAIS_BASICOS
	{ $current=$iv_ruleLITERAIS_BASICOS.current; }
	EOF;

// Rule LITERAIS_BASICOS
ruleLITERAIS_BASICOS returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getLITERAIS_BASICOSAccess().getNumeroNUMEROParserRuleCall_0_0());
				}
				lv_numero_0_0=ruleNUMERO
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLITERAIS_BASICOSRule());
					}
					set(
						$current,
						"numero",
						lv_numero_0_0,
						"com.ufcg.compiler.Go.NUMERO");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getLITERAIS_BASICOSAccess().getStringSTRING_DECLParserRuleCall_1_0());
				}
				lv_string_1_0=ruleSTRING_DECL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLITERAIS_BASICOSRule());
					}
					set(
						$current,
						"string",
						lv_string_1_0,
						"com.ufcg.compiler.Go.STRING_DECL");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFUNCAO
entryRuleFUNCAO returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFUNCAORule()); }
	iv_ruleFUNCAO=ruleFUNCAO
	{ $current=$iv_ruleFUNCAO.current; }
	EOF;

// Rule FUNCAO
ruleFUNCAO returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_func_0_0='func'
				{
					newLeafNode(lv_func_0_0, grammarAccess.getFUNCAOAccess().getFuncFuncKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFUNCAORule());
					}
					setWithLastConsumed($current, "func", lv_func_0_0, "func");
				}
			)
		)
		(
			(
				lv_nome_1_0=RULE_ID
				{
					newLeafNode(lv_nome_1_0, grammarAccess.getFUNCAOAccess().getNomeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFUNCAORule());
					}
					setWithLastConsumed(
						$current,
						"nome",
						lv_nome_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFUNCAOAccess().getABRE_PARENTESESABRE_PARENTESESParserRuleCall_2_0());
				}
				lv_ABRE_PARENTESES_2_0=ruleABRE_PARENTESES
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFUNCAORule());
					}
					set(
						$current,
						"ABRE_PARENTESES",
						lv_ABRE_PARENTESES_2_0,
						"com.ufcg.compiler.Go.ABRE_PARENTESES");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFUNCAOAccess().getPARAMETERS_LISTPARAMETERS_LISTParserRuleCall_3_0());
				}
				lv_PARAMETERS_LIST_3_0=rulePARAMETERS_LIST
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFUNCAORule());
					}
					set(
						$current,
						"PARAMETERS_LIST",
						lv_PARAMETERS_LIST_3_0,
						"com.ufcg.compiler.Go.PARAMETERS_LIST");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFUNCAOAccess().getFECHA_PARENTESESFECHA_PARENTESESParserRuleCall_4_0());
				}
				lv_FECHA_PARENTESES_4_0=ruleFECHA_PARENTESES
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFUNCAORule());
					}
					set(
						$current,
						"FECHA_PARENTESES",
						lv_FECHA_PARENTESES_4_0,
						"com.ufcg.compiler.Go.FECHA_PARENTESES");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFUNCAOAccess().getBlocoBLOCKParserRuleCall_5_0());
				}
				lv_bloco_5_0=ruleBLOCK
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFUNCAORule());
					}
					set(
						$current,
						"bloco",
						lv_bloco_5_0,
						"com.ufcg.compiler.Go.BLOCK");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleABRE_PARENTESES
entryRuleABRE_PARENTESES returns [String current=null]:
	{ newCompositeNode(grammarAccess.getABRE_PARENTESESRule()); }
	iv_ruleABRE_PARENTESES=ruleABRE_PARENTESES
	{ $current=$iv_ruleABRE_PARENTESES.current.getText(); }
	EOF;

// Rule ABRE_PARENTESES
ruleABRE_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='('
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getABRE_PARENTESESAccess().getLeftParenthesisKeyword());
	}
;

// Entry rule entryRuleFECHA_PARENTESES
entryRuleFECHA_PARENTESES returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFECHA_PARENTESESRule()); }
	iv_ruleFECHA_PARENTESES=ruleFECHA_PARENTESES
	{ $current=$iv_ruleFECHA_PARENTESES.current.getText(); }
	EOF;

// Rule FECHA_PARENTESES
ruleFECHA_PARENTESES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw=')'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getFECHA_PARENTESESAccess().getRightParenthesisKeyword());
	}
;

// Entry rule entryRuleBLOCK
entryRuleBLOCK returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBLOCKRule()); }
	iv_ruleBLOCK=ruleBLOCK
	{ $current=$iv_ruleBLOCK.current; }
	EOF;

// Rule BLOCK
ruleBLOCK returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBLOCKAccess().getBLOCKAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getBLOCKAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBLOCKAccess().getListaDeComandosEXPRESSAOParserRuleCall_2_0());
				}
				lv_listaDeComandos_2_0=ruleEXPRESSAO
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBLOCKRule());
					}
					add(
						$current,
						"listaDeComandos",
						lv_listaDeComandos_2_0,
						"com.ufcg.compiler.Go.EXPRESSAO");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getBLOCKAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRulePARAMETERS_LIST
entryRulePARAMETERS_LIST returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPARAMETERS_LISTRule()); }
	iv_rulePARAMETERS_LIST=rulePARAMETERS_LIST
	{ $current=$iv_rulePARAMETERS_LIST.current; }
	EOF;

// Rule PARAMETERS_LIST
rulePARAMETERS_LIST returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERParserRuleCall_0());
		}
		this_PARAMETER_0=rulePARAMETER
		{
			$current = $this_PARAMETER_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getPARAMETERS_LISTAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERPARAMETERParserRuleCall_1_1_0());
					}
					lv_PARAMETER_2_0=rulePARAMETER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPARAMETERS_LISTRule());
						}
						add(
							$current,
							"PARAMETER",
							lv_PARAMETER_2_0,
							"com.ufcg.compiler.Go.PARAMETER");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePARAMETER
entryRulePARAMETER returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPARAMETERRule()); }
	iv_rulePARAMETER=rulePARAMETER
	{ $current=$iv_rulePARAMETER.current; }
	EOF;

// Rule PARAMETER
rulePARAMETER returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_id_0_0=RULE_ID
				{
					newLeafNode(lv_id_0_0, grammarAccess.getPARAMETERAccess().getIdIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPARAMETERRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPARAMETERAccess().getTipoTypesParserRuleCall_1_0());
				}
				lv_tipo_1_0=ruleTypes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPARAMETERRule());
					}
					set(
						$current,
						"tipo",
						lv_tipo_1_0,
						"com.ufcg.compiler.Go.Types");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTypes
entryRuleTypes returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypesRule()); }
	iv_ruleTypes=ruleTypes
	{ $current=$iv_ruleTypes.current.getText(); }
	EOF;

// Rule Types
ruleTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='string'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypesAccess().getStringKeyword_0());
		}
		    |
		kw='int'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypesAccess().getIntKeyword_1());
		}
		    |
		kw='float'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypesAccess().getFloatKeyword_2());
		}
		    |
		kw='boolean'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypesAccess().getBooleanKeyword_3());
		}
	)
;

// Entry rule entryRuleNUMERO
entryRuleNUMERO returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNUMERORule()); }
	iv_ruleNUMERO=ruleNUMERO
	{ $current=$iv_ruleNUMERO.current.getText(); }
	EOF;

// Rule NUMERO
ruleNUMERO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INT_0=RULE_INT
	{
		$current.merge(this_INT_0);
	}
	{
		newLeafNode(this_INT_0, grammarAccess.getNUMEROAccess().getINTTerminalRuleCall());
	}
;

// Entry rule entryRuleSTRING_DECL
entryRuleSTRING_DECL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSTRING_DECLRule()); }
	iv_ruleSTRING_DECL=ruleSTRING_DECL
	{ $current=$iv_ruleSTRING_DECL.current.getText(); }
	EOF;

// Rule STRING_DECL
ruleSTRING_DECL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getSTRING_DECLAccess().getIDTerminalRuleCall());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
