/*
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ufcg.compiladores.ide.contentassist.antlr.internal.InternalGoParser;
import com.ufcg.compiladores.services.GoGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class GoParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GoGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GoGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getBOOLEAN_VALUEAccess().getAlternatives(), "rule__BOOLEAN_VALUE__Alternatives");
			builder.put(grammarAccess.getGoDeclAccess().getAlternatives(), "rule__GoDecl__Alternatives");
			builder.put(grammarAccess.getForDeclAccess().getAlternatives_1(), "rule__ForDecl__Alternatives_1");
			builder.put(grammarAccess.getRangeDeclAccess().getAlternatives_2(), "rule__RangeDecl__Alternatives_2");
			builder.put(grammarAccess.getRangeDeclAccess().getAlternatives_4(), "rule__RangeDecl__Alternatives_4");
			builder.put(grammarAccess.getIDListAccess().getAlternatives(), "rule__IDList__Alternatives");
			builder.put(grammarAccess.getVarDeclAccess().getAlternatives_1(), "rule__VarDecl__Alternatives_1");
			builder.put(grammarAccess.getAssignmentAccess().getAlternatives_2(), "rule__Assignment__Alternatives_2");
			builder.put(grammarAccess.getTIPOAccess().getAlternatives(), "rule__TIPO__Alternatives");
			builder.put(grammarAccess.getEXPRESSAOLINHAAccess().getAlternatives(), "rule__EXPRESSAOLINHA__Alternatives");
			builder.put(grammarAccess.getEXPRESSAOAccess().getAlternatives(), "rule__EXPRESSAO__Alternatives");
			builder.put(grammarAccess.getReturnStmtAccess().getAlternatives_2(), "rule__ReturnStmt__Alternatives_2");
			builder.put(grammarAccess.getLiteraisListAccess().getAlternatives(), "rule__LiteraisList__Alternatives");
			builder.put(grammarAccess.getLITERAIS_BASICOSAccess().getAlternatives(), "rule__LITERAIS_BASICOS__Alternatives");
			builder.put(grammarAccess.getBINARY_EXPAccess().getAlternatives_1(), "rule__BINARY_EXP__Alternatives_1");
			builder.put(grammarAccess.getBINARY_EXPAccess().getAlternatives_2(), "rule__BINARY_EXP__Alternatives_2");
			builder.put(grammarAccess.getBINARY_EXPAccess().getAlternatives_3(), "rule__BINARY_EXP__Alternatives_3");
			builder.put(grammarAccess.getPARAMETERAccess().getAlternatives(), "rule__PARAMETER__Alternatives");
			builder.put(grammarAccess.getTypesAccess().getAlternatives(), "rule__Types__Alternatives");
			builder.put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
			builder.put(grammarAccess.getChamadaAccess().getAlternatives(), "rule__Chamada__Alternatives");
			builder.put(grammarAccess.getBOOL_OPAccess().getAlternatives(), "rule__BOOL_OP__Alternatives");
			builder.put(grammarAccess.getARIT_EXPRAccess().getAlternatives(), "rule__ARIT_EXPR__Alternatives");
			builder.put(grammarAccess.getARIT_EXPRAccess().getAlternatives_0_0(), "rule__ARIT_EXPR__Alternatives_0_0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getAlternatives_0_2(), "rule__ARIT_EXPR__Alternatives_0_2");
			builder.put(grammarAccess.getARIT_EXPRAccess().getAlternatives_1_0(), "rule__ARIT_EXPR__Alternatives_1_0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getAlternatives_2_1(), "rule__ARIT_EXPR__Alternatives_2_1");
			builder.put(grammarAccess.getARIT_OPAccess().getAlternatives(), "rule__ARIT_OP__Alternatives");
			builder.put(grammarAccess.getARIT_ATRAccess().getAlternatives(), "rule__ARIT_ATR__Alternatives");
			builder.put(grammarAccess.getCOMPARISONAccess().getAlternatives(), "rule__COMPARISON__Alternatives");
			builder.put(grammarAccess.getForDeclAccess().getGroup(), "rule__ForDecl__Group__0");
			builder.put(grammarAccess.getRangeDeclAccess().getGroup(), "rule__RangeDecl__Group__0");
			builder.put(grammarAccess.getForClauseAccess().getGroup(), "rule__ForClause__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getIDListAccess().getGroup_1(), "rule__IDList__Group_1__0");
			builder.put(grammarAccess.getVarDeclAccess().getGroup(), "rule__VarDecl__Group__0");
			builder.put(grammarAccess.getVarDeclAccess().getGroup_2(), "rule__VarDecl__Group_2__0");
			builder.put(grammarAccess.getSignatureDelAccess().getGroup(), "rule__SignatureDel__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup_1(), "rule__Assignment__Group_1__0");
			builder.put(grammarAccess.getEXPRESSAOLINHAAccess().getGroup_0(), "rule__EXPRESSAOLINHA__Group_0__0");
			builder.put(grammarAccess.getEXPRESSAOAccess().getGroup_0(), "rule__EXPRESSAO__Group_0__0");
			builder.put(grammarAccess.getReturnStmtAccess().getGroup(), "rule__ReturnStmt__Group__0");
			builder.put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
			builder.put(grammarAccess.getLiteraisListAccess().getGroup_1(), "rule__LiteraisList__Group_1__0");
			builder.put(grammarAccess.getBINARY_EXPAccess().getGroup(), "rule__BINARY_EXP__Group__0");
			builder.put(grammarAccess.getFunctionTypeAccess().getGroup(), "rule__FunctionType__Group__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup(), "rule__Signature__Group__0");
			builder.put(grammarAccess.getParametersAccess().getGroup(), "rule__Parameters__Group__0");
			builder.put(grammarAccess.getIfConditionAccess().getGroup(), "rule__IfCondition__Group__0");
			builder.put(grammarAccess.getElseIfConditionAccess().getGroup(), "rule__ElseIfCondition__Group__0");
			builder.put(grammarAccess.getElseConditionAccess().getGroup(), "rule__ElseCondition__Group__0");
			builder.put(grammarAccess.getElseConditionAccess().getGroup_1(), "rule__ElseCondition__Group_1__0");
			builder.put(grammarAccess.getBLOCKAccess().getGroup(), "rule__BLOCK__Group__0");
			builder.put(grammarAccess.getPARAMETERS_LISTAccess().getGroup(), "rule__PARAMETERS_LIST__Group__0");
			builder.put(grammarAccess.getPARAMETERS_LISTAccess().getGroup_2(), "rule__PARAMETERS_LIST__Group_2__0");
			builder.put(grammarAccess.getPARAMETERAccess().getGroup_0(), "rule__PARAMETER__Group_0__0");
			builder.put(grammarAccess.getPARAMETERAccess().getGroup_1(), "rule__PARAMETER__Group_1__0");
			builder.put(grammarAccess.getTypesAccess().getGroup_0(), "rule__Types__Group_0__0");
			builder.put(grammarAccess.getArrayTypeAccess().getGroup(), "rule__ArrayType__Group__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
			builder.put(grammarAccess.getBOOL_OPAccess().getGroup_0(), "rule__BOOL_OP__Group_0__0");
			builder.put(grammarAccess.getBOOL_OPAccess().getGroup_1(), "rule__BOOL_OP__Group_1__0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getGroup_0(), "rule__ARIT_EXPR__Group_0__0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getGroup_1(), "rule__ARIT_EXPR__Group_1__0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getGroup_2(), "rule__ARIT_EXPR__Group_2__0");
			builder.put(grammarAccess.getIfStmtAccess().getGroup(), "rule__IfStmt__Group__0");
			builder.put(grammarAccess.getInitAccess().getElementsAssignment(), "rule__Init__ElementsAssignment");
			builder.put(grammarAccess.getBOOLEAN_VALUEAccess().getVerdadeiroAssignment_0(), "rule__BOOLEAN_VALUE__VerdadeiroAssignment_0");
			builder.put(grammarAccess.getBOOLEAN_VALUEAccess().getFalsoAssignment_1(), "rule__BOOLEAN_VALUE__FalsoAssignment_1");
			builder.put(grammarAccess.getGoDeclAccess().getVarAssignment_0(), "rule__GoDecl__VarAssignment_0");
			builder.put(grammarAccess.getGoDeclAccess().getFuncAssignment_1(), "rule__GoDecl__FuncAssignment_1");
			builder.put(grammarAccess.getGoDeclAccess().getExpressaoAssignment_2(), "rule__GoDecl__ExpressaoAssignment_2");
			builder.put(grammarAccess.getForDeclAccess().getClauseAssignment_1_0(), "rule__ForDecl__ClauseAssignment_1_0");
			builder.put(grammarAccess.getForDeclAccess().getRangeAssignment_1_1(), "rule__ForDecl__RangeAssignment_1_1");
			builder.put(grammarAccess.getForDeclAccess().getComandosAssignment_3(), "rule__ForDecl__ComandosAssignment_3");
			builder.put(grammarAccess.getRangeDeclAccess().getIdListAssignment_1(), "rule__RangeDecl__IdListAssignment_1");
			builder.put(grammarAccess.getRangeDeclAccess().getIgualAssignment_2_0(), "rule__RangeDecl__IgualAssignment_2_0");
			builder.put(grammarAccess.getRangeDeclAccess().getOpAssignment_2_1(), "rule__RangeDecl__OpAssignment_2_1");
			builder.put(grammarAccess.getRangeDeclAccess().getVariavelAssignment_4_0(), "rule__RangeDecl__VariavelAssignment_4_0");
			builder.put(grammarAccess.getRangeDeclAccess().getFuncAssignment_4_1(), "rule__RangeDecl__FuncAssignment_4_1");
			builder.put(grammarAccess.getForClauseAccess().getInitAssignment_1(), "rule__ForClause__InitAssignment_1");
			builder.put(grammarAccess.getForClauseAccess().getConditionAssignment_3(), "rule__ForClause__ConditionAssignment_3");
			builder.put(grammarAccess.getForClauseAccess().getPostAssignment_5(), "rule__ForClause__PostAssignment_5");
			builder.put(grammarAccess.getInitStmtAccess().getVarDeclAssignment(), "rule__InitStmt__VarDeclAssignment");
			builder.put(grammarAccess.getPostStmtAccess().getArtAssignment(), "rule__PostStmt__ArtAssignment");
			builder.put(grammarAccess.getConditionAccess().getExpr1Assignment_0(), "rule__Condition__Expr1Assignment_0");
			builder.put(grammarAccess.getConditionAccess().getComparadorAssignment_1(), "rule__Condition__ComparadorAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getExpr2Assignment_2(), "rule__Condition__Expr2Assignment_2");
			builder.put(grammarAccess.getIDListAccess().getIdListAssignment_0(), "rule__IDList__IdListAssignment_0");
			builder.put(grammarAccess.getIDListAccess().getIdListAssignment_1_0(), "rule__IDList__IdListAssignment_1_0");
			builder.put(grammarAccess.getIDListAccess().getVirAssignment_1_1(), "rule__IDList__VirAssignment_1_1");
			builder.put(grammarAccess.getIDListAccess().getListAssignment_1_2(), "rule__IDList__ListAssignment_1_2");
			builder.put(grammarAccess.getVarDeclAccess().getSignatureAssignment_0(), "rule__VarDecl__SignatureAssignment_0");
			builder.put(grammarAccess.getVarDeclAccess().getAtribuicaoAssignment_1_0(), "rule__VarDecl__AtribuicaoAssignment_1_0");
			builder.put(grammarAccess.getVarDeclAccess().getProntAssignment_1_1(), "rule__VarDecl__ProntAssignment_1_1");
			builder.put(grammarAccess.getVarDeclAccess().getArrayAssignment_2_0(), "rule__VarDecl__ArrayAssignment_2_0");
			builder.put(grammarAccess.getVarDeclAccess().getExpressaoAssignment_2_1(), "rule__VarDecl__ExpressaoAssignment_2_1");
			builder.put(grammarAccess.getSignatureDelAccess().getTipoDeclAssignment_0(), "rule__SignatureDel__TipoDeclAssignment_0");
			builder.put(grammarAccess.getSignatureDelAccess().getIdAssignment_1(), "rule__SignatureDel__IdAssignment_1");
			builder.put(grammarAccess.getSignatureDelAccess().getTypeAssignment_2(), "rule__SignatureDel__TypeAssignment_2");
			builder.put(grammarAccess.getAssignmentAccess().getIdAssignment_0(), "rule__Assignment__IdAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getQtdAssignment_1_1(), "rule__Assignment__QtdAssignment_1_1");
			builder.put(grammarAccess.getAssignmentAccess().getIgualAssignment_2_0(), "rule__Assignment__IgualAssignment_2_0");
			builder.put(grammarAccess.getAssignmentAccess().getDoisAssignment_2_1(), "rule__Assignment__DoisAssignment_2_1");
			builder.put(grammarAccess.getAssignmentAccess().getExpressaoAssignment_3(), "rule__Assignment__ExpressaoAssignment_3");
			builder.put(grammarAccess.getTIPOAccess().getVariavelAssignment_0(), "rule__TIPO__VariavelAssignment_0");
			builder.put(grammarAccess.getTIPOAccess().getConstanteAssignment_1(), "rule__TIPO__ConstanteAssignment_1");
			builder.put(grammarAccess.getVarAccess().getVarAssignment(), "rule__Var__VarAssignment");
			builder.put(grammarAccess.getConstAccess().getConstAssignment(), "rule__Const__ConstAssignment");
			builder.put(grammarAccess.getIGUALAccess().getIgualAssignment(), "rule__IGUAL__IgualAssignment");
			builder.put(grammarAccess.getPONTOSIGUALAccess().getOpAssignment(), "rule__PONTOSIGUAL__OpAssignment");
			builder.put(grammarAccess.getEXPRESSAOLINHAAccess().getExpAssignment_0_0(), "rule__EXPRESSAOLINHA__ExpAssignment_0_0");
			builder.put(grammarAccess.getEXPRESSAOLINHAAccess().getExplinhaAssignment_0_1(), "rule__EXPRESSAOLINHA__ExplinhaAssignment_0_1");
			builder.put(grammarAccess.getEXPRESSAOLINHAAccess().getExpAssignment_1(), "rule__EXPRESSAOLINHA__ExpAssignment_1");
			builder.put(grammarAccess.getEXPRESSAOAccess().getDeclFunctionAssignment_0_1(), "rule__EXPRESSAO__DeclFunctionAssignment_0_1");
			builder.put(grammarAccess.getEXPRESSAOAccess().getBinary_expAssignment_1(), "rule__EXPRESSAO__Binary_expAssignment_1");
			builder.put(grammarAccess.getEXPRESSAOAccess().getBasicAssignment_2(), "rule__EXPRESSAO__BasicAssignment_2");
			builder.put(grammarAccess.getEXPRESSAOAccess().getAssignmentAssignment_3(), "rule__EXPRESSAO__AssignmentAssignment_3");
			builder.put(grammarAccess.getEXPRESSAOAccess().getForAssignment_4(), "rule__EXPRESSAO__ForAssignment_4");
			builder.put(grammarAccess.getEXPRESSAOAccess().getArrayValueAssignment_5(), "rule__EXPRESSAO__ArrayValueAssignment_5");
			builder.put(grammarAccess.getEXPRESSAOAccess().getVariaveisAssignment_6(), "rule__EXPRESSAO__VariaveisAssignment_6");
			builder.put(grammarAccess.getEXPRESSAOAccess().getChamAssignment_7(), "rule__EXPRESSAO__ChamAssignment_7");
			builder.put(grammarAccess.getEXPRESSAOAccess().getIfAssignment_8(), "rule__EXPRESSAO__IfAssignment_8");
			builder.put(grammarAccess.getReturnStmtAccess().getBasicAssignment_2_0(), "rule__ReturnStmt__BasicAssignment_2_0");
			builder.put(grammarAccess.getReturnStmtAccess().getFuncAssignment_2_1(), "rule__ReturnStmt__FuncAssignment_2_1");
			builder.put(grammarAccess.getReturnStmtAccess().getIdVarAssignment_2_2(), "rule__ReturnStmt__IdVarAssignment_2_2");
			builder.put(grammarAccess.getArrayValueAccess().getLitAssignment_1(), "rule__ArrayValue__LitAssignment_1");
			builder.put(grammarAccess.getLiteraisListAccess().getLitAssignment_0(), "rule__LiteraisList__LitAssignment_0");
			builder.put(grammarAccess.getLiteraisListAccess().getLitAssignment_1_0(), "rule__LiteraisList__LitAssignment_1_0");
			builder.put(grammarAccess.getLiteraisListAccess().getVirAssignment_1_1(), "rule__LiteraisList__VirAssignment_1_1");
			builder.put(grammarAccess.getLiteraisListAccess().getLitAssignment_1_2(), "rule__LiteraisList__LitAssignment_1_2");
			builder.put(grammarAccess.getLITERAIS_BASICOSAccess().getNumeroAssignment_0(), "rule__LITERAIS_BASICOS__NumeroAssignment_0");
			builder.put(grammarAccess.getLITERAIS_BASICOSAccess().getStringAssignment_1(), "rule__LITERAIS_BASICOS__StringAssignment_1");
			builder.put(grammarAccess.getLITERAIS_BASICOSAccess().getBooleanoAssignment_2(), "rule__LITERAIS_BASICOS__BooleanoAssignment_2");
			builder.put(grammarAccess.getBINARY_EXPAccess().getBasicAssignment_1_0(), "rule__BINARY_EXP__BasicAssignment_1_0");
			builder.put(grammarAccess.getBINARY_EXPAccess().getVarCalAssignment_1_1(), "rule__BINARY_EXP__VarCalAssignment_1_1");
			builder.put(grammarAccess.getBINARY_EXPAccess().getFuncAssignment_1_2(), "rule__BINARY_EXP__FuncAssignment_1_2");
			builder.put(grammarAccess.getBINARY_EXPAccess().getBoolAssignment_2_0(), "rule__BINARY_EXP__BoolAssignment_2_0");
			builder.put(grammarAccess.getBINARY_EXPAccess().getAritAssignment_2_1(), "rule__BINARY_EXP__AritAssignment_2_1");
			builder.put(grammarAccess.getBINARY_EXPAccess().getBasicAssignment_3_0(), "rule__BINARY_EXP__BasicAssignment_3_0");
			builder.put(grammarAccess.getBINARY_EXPAccess().getVarCalAssignment_3_1(), "rule__BINARY_EXP__VarCalAssignment_3_1");
			builder.put(grammarAccess.getBINARY_EXPAccess().getFuncAssignment_3_2(), "rule__BINARY_EXP__FuncAssignment_3_2");
			builder.put(grammarAccess.getFunctionTypeAccess().getNomeAssignment_1(), "rule__FunctionType__NomeAssignment_1");
			builder.put(grammarAccess.getFunctionTypeAccess().getAssinaturaAssignment_2(), "rule__FunctionType__AssinaturaAssignment_2");
			builder.put(grammarAccess.getFunctionTypeAccess().getBlocoAssignment_3(), "rule__FunctionType__BlocoAssignment_3");
			builder.put(grammarAccess.getSignatureAccess().getParamsAssignment_1(), "rule__Signature__ParamsAssignment_1");
			builder.put(grammarAccess.getSignatureAccess().getRetornoAssignment_2(), "rule__Signature__RetornoAssignment_2");
			builder.put(grammarAccess.getParametersAccess().getParamsAssignment_2(), "rule__Parameters__ParamsAssignment_2");
			builder.put(grammarAccess.getIfConditionAccess().getCondAssignment_1(), "rule__IfCondition__CondAssignment_1");
			builder.put(grammarAccess.getIfConditionAccess().getThenAssignment_3(), "rule__IfCondition__ThenAssignment_3");
			builder.put(grammarAccess.getElseConditionAccess().getThenAssignment_1_2(), "rule__ElseCondition__ThenAssignment_1_2");
			builder.put(grammarAccess.getBLOCKAccess().getListaDeComandosAssignment_2(), "rule__BLOCK__ListaDeComandosAssignment_2");
			builder.put(grammarAccess.getBLOCKAccess().getRetornoAssignment_3(), "rule__BLOCK__RetornoAssignment_3");
			builder.put(grammarAccess.getPARAMETERS_LISTAccess().getParamsAssignment_1(), "rule__PARAMETERS_LIST__ParamsAssignment_1");
			builder.put(grammarAccess.getPARAMETERS_LISTAccess().getVirAssignment_2_0(), "rule__PARAMETERS_LIST__VirAssignment_2_0");
			builder.put(grammarAccess.getPARAMETERS_LISTAccess().getParamsAssignment_2_1(), "rule__PARAMETERS_LIST__ParamsAssignment_2_1");
			builder.put(grammarAccess.getPARAMETERAccess().getBasicoAssignment_0_1(), "rule__PARAMETER__BasicoAssignment_0_1");
			builder.put(grammarAccess.getPARAMETERAccess().getIdAssignment_1_0(), "rule__PARAMETER__IdAssignment_1_0");
			builder.put(grammarAccess.getPARAMETERAccess().getTipoAssignment_1_1(), "rule__PARAMETER__TipoAssignment_1_1");
			builder.put(grammarAccess.getTypesAccess().getBasicAssignment_0_1(), "rule__Types__BasicAssignment_0_1");
			builder.put(grammarAccess.getTypesAccess().getArrayAssignment_1(), "rule__Types__ArrayAssignment_1");
			builder.put(grammarAccess.getArrayTypeAccess().getQtdAssignment_1(), "rule__ArrayType__QtdAssignment_1");
			builder.put(grammarAccess.getArrayTypeAccess().getBasicAssignment_3(), "rule__ArrayType__BasicAssignment_3");
			builder.put(grammarAccess.getBasicTypeAccess().getStringAssignment_0(), "rule__BasicType__StringAssignment_0");
			builder.put(grammarAccess.getBasicTypeAccess().getIntAssignment_1(), "rule__BasicType__IntAssignment_1");
			builder.put(grammarAccess.getBasicTypeAccess().getFloatAssignment_2(), "rule__BasicType__FloatAssignment_2");
			builder.put(grammarAccess.getBasicTypeAccess().getBooleanAssignment_3(), "rule__BasicType__BooleanAssignment_3");
			builder.put(grammarAccess.getVarCallAccess().getIdAssignment(), "rule__VarCall__IdAssignment");
			builder.put(grammarAccess.getFunctionCallAccess().getIdAssignment_0(), "rule__FunctionCall__IdAssignment_0");
			builder.put(grammarAccess.getFunctionCallAccess().getParamsAssignment_2(), "rule__FunctionCall__ParamsAssignment_2");
			builder.put(grammarAccess.getChamadaAccess().getChamAssignment_0(), "rule__Chamada__ChamAssignment_0");
			builder.put(grammarAccess.getChamadaAccess().getChamAssignment_1(), "rule__Chamada__ChamAssignment_1");
			builder.put(grammarAccess.getChamadaAccess().getChamAssignment_2(), "rule__Chamada__ChamAssignment_2");
			builder.put(grammarAccess.getARIT_EXPRAccess().getNum1Assignment_0_0_0(), "rule__ARIT_EXPR__Num1Assignment_0_0_0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getVar1Assignment_0_0_1(), "rule__ARIT_EXPR__Var1Assignment_0_0_1");
			builder.put(grammarAccess.getARIT_EXPRAccess().getOpAssignment_0_1(), "rule__ARIT_EXPR__OpAssignment_0_1");
			builder.put(grammarAccess.getARIT_EXPRAccess().getNum2Assignment_0_2_0(), "rule__ARIT_EXPR__Num2Assignment_0_2_0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getVar2Assignment_0_2_1(), "rule__ARIT_EXPR__Var2Assignment_0_2_1");
			builder.put(grammarAccess.getARIT_EXPRAccess().getNumAssignment_1_0_0(), "rule__ARIT_EXPR__NumAssignment_1_0_0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getVarAssignment_1_0_1(), "rule__ARIT_EXPR__VarAssignment_1_0_1");
			builder.put(grammarAccess.getARIT_EXPRAccess().getAtrAssignment_1_1(), "rule__ARIT_EXPR__AtrAssignment_1_1");
			builder.put(grammarAccess.getARIT_EXPRAccess().getAtrAssignment_2_0(), "rule__ARIT_EXPR__AtrAssignment_2_0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getNumAssignment_2_1_0(), "rule__ARIT_EXPR__NumAssignment_2_1_0");
			builder.put(grammarAccess.getARIT_EXPRAccess().getVarAssignment_2_1_1(), "rule__ARIT_EXPR__VarAssignment_2_1_1");
			builder.put(grammarAccess.getIfStmtAccess().getIfAssignment_0(), "rule__IfStmt__IfAssignment_0");
			builder.put(grammarAccess.getIfStmtAccess().getElseifAssignment_1(), "rule__IfStmt__ElseifAssignment_1");
			builder.put(grammarAccess.getIfStmtAccess().getElseAssignment_2(), "rule__IfStmt__ElseAssignment_2");
			builder.put(grammarAccess.getCOMPARISONAccess().getIgualAssignment_0(), "rule__COMPARISON__IgualAssignment_0");
			builder.put(grammarAccess.getCOMPARISONAccess().getMaiorigualqueAssignment_1(), "rule__COMPARISON__MaiorigualqueAssignment_1");
			builder.put(grammarAccess.getCOMPARISONAccess().getMenorigualqueAssignment_2(), "rule__COMPARISON__MenorigualqueAssignment_2");
			builder.put(grammarAccess.getCOMPARISONAccess().getMaiorqueAssignment_3(), "rule__COMPARISON__MaiorqueAssignment_3");
			builder.put(grammarAccess.getCOMPARISONAccess().getMenorqueAssignment_4(), "rule__COMPARISON__MenorqueAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GoGrammarAccess grammarAccess;

	@Override
	protected InternalGoParser createParser() {
		InternalGoParser result = new InternalGoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
