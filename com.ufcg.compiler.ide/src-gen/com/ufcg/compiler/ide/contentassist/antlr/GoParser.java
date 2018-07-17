/*
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiler.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ufcg.compiler.ide.contentassist.antlr.internal.InternalGoParser;
import com.ufcg.compiler.services.GoGrammarAccess;
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
			builder.put(grammarAccess.getGoDeclAccess().getAlternatives(), "rule__GoDecl__Alternatives");
			builder.put(grammarAccess.getTIPOAccess().getAlternatives(), "rule__TIPO__Alternatives");
			builder.put(grammarAccess.getEXPRESSAOAccess().getAlternatives(), "rule__EXPRESSAO__Alternatives");
			builder.put(grammarAccess.getLITERAIS_BASICOSAccess().getAlternatives(), "rule__LITERAIS_BASICOS__Alternatives");
			builder.put(grammarAccess.getTypesAccess().getAlternatives(), "rule__Types__Alternatives");
			builder.put(grammarAccess.getVarDeclAccess().getGroup(), "rule__VarDecl__Group__0");
			builder.put(grammarAccess.getFUNCAOAccess().getGroup(), "rule__FUNCAO__Group__0");
			builder.put(grammarAccess.getBLOCKAccess().getGroup(), "rule__BLOCK__Group__0");
			builder.put(grammarAccess.getPARAMETERS_LISTAccess().getGroup(), "rule__PARAMETERS_LIST__Group__0");
			builder.put(grammarAccess.getPARAMETERS_LISTAccess().getGroup_1(), "rule__PARAMETERS_LIST__Group_1__0");
			builder.put(grammarAccess.getPARAMETERAccess().getGroup(), "rule__PARAMETER__Group__0");
			builder.put(grammarAccess.getInitAccess().getElementsAssignment(), "rule__Init__ElementsAssignment");
			builder.put(grammarAccess.getGoDeclAccess().getVarAssignment_0(), "rule__GoDecl__VarAssignment_0");
			builder.put(grammarAccess.getGoDeclAccess().getFuncAssignment_1(), "rule__GoDecl__FuncAssignment_1");
			builder.put(grammarAccess.getVarDeclAccess().getTipoDeclAssignment_0(), "rule__VarDecl__TipoDeclAssignment_0");
			builder.put(grammarAccess.getVarDeclAccess().getIdAssignment_1(), "rule__VarDecl__IdAssignment_1");
			builder.put(grammarAccess.getVarDeclAccess().getAtribuicaoAssignment_2(), "rule__VarDecl__AtribuicaoAssignment_2");
			builder.put(grammarAccess.getVarDeclAccess().getExpressaoAssignment_3(), "rule__VarDecl__ExpressaoAssignment_3");
			builder.put(grammarAccess.getTIPOAccess().getVariavelAssignment_0(), "rule__TIPO__VariavelAssignment_0");
			builder.put(grammarAccess.getTIPOAccess().getConstanteAssignment_1(), "rule__TIPO__ConstanteAssignment_1");
			builder.put(grammarAccess.getIGUALAccess().getIgualAssignment(), "rule__IGUAL__IgualAssignment");
			builder.put(grammarAccess.getEXPRESSAOAccess().getBasicAssignment_0(), "rule__EXPRESSAO__BasicAssignment_0");
			builder.put(grammarAccess.getEXPRESSAOAccess().getDeclFunctionAssignment_1(), "rule__EXPRESSAO__DeclFunctionAssignment_1");
			builder.put(grammarAccess.getLITERAIS_BASICOSAccess().getNumeroAssignment_0(), "rule__LITERAIS_BASICOS__NumeroAssignment_0");
			builder.put(grammarAccess.getLITERAIS_BASICOSAccess().getStringAssignment_1(), "rule__LITERAIS_BASICOS__StringAssignment_1");
			builder.put(grammarAccess.getFUNCAOAccess().getFuncAssignment_0(), "rule__FUNCAO__FuncAssignment_0");
			builder.put(grammarAccess.getFUNCAOAccess().getNomeAssignment_1(), "rule__FUNCAO__NomeAssignment_1");
			builder.put(grammarAccess.getFUNCAOAccess().getABRE_PARENTESESAssignment_2(), "rule__FUNCAO__ABRE_PARENTESESAssignment_2");
			builder.put(grammarAccess.getFUNCAOAccess().getPARAMETERS_LISTAssignment_3(), "rule__FUNCAO__PARAMETERS_LISTAssignment_3");
			builder.put(grammarAccess.getFUNCAOAccess().getFECHA_PARENTESESAssignment_4(), "rule__FUNCAO__FECHA_PARENTESESAssignment_4");
			builder.put(grammarAccess.getFUNCAOAccess().getBlocoAssignment_5(), "rule__FUNCAO__BlocoAssignment_5");
			builder.put(grammarAccess.getBLOCKAccess().getListaDeComandosAssignment_2(), "rule__BLOCK__ListaDeComandosAssignment_2");
			builder.put(grammarAccess.getPARAMETERS_LISTAccess().getPARAMETERAssignment_1_1(), "rule__PARAMETERS_LIST__PARAMETERAssignment_1_1");
			builder.put(grammarAccess.getPARAMETERAccess().getIdAssignment_0(), "rule__PARAMETER__IdAssignment_0");
			builder.put(grammarAccess.getPARAMETERAccess().getTipoAssignment_1(), "rule__PARAMETER__TipoAssignment_1");
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
