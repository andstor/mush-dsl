/*
 * generated by Xtext 2.22.0
 */
package tdt4250.mush.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import tdt4250.mush.xtext.MushRuntimeModule;
import tdt4250.mush.xtext.MushStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MushIdeSetup extends MushStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MushRuntimeModule(), new MushIdeModule()));
	}
	
}
