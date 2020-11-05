/*
 * generated by Xtext 2.22.0
 */
package tdt4250.pseudocode.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import tdt4250.pseudocode.PcodeRuntimeModule;
import tdt4250.pseudocode.PcodeStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class PcodeIdeSetup extends PcodeStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new PcodeRuntimeModule(), new PcodeIdeModule()));
	}
	
}
