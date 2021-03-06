/*
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.ide

import com.google.inject.Guice
import com.ufcg.compiladores.GoRuntimeModule
import com.ufcg.compiladores.GoStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class GoIdeSetup extends GoStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new GoRuntimeModule, new GoIdeModule))
	}
	
}
