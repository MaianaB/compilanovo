/*
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiler.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GoAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/ufcg/compiler/parser/antlr/internal/InternalGo.tokens");
	}
}
