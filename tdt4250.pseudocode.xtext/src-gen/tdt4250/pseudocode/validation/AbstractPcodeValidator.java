/*
 * generated by Xtext 2.22.0
 */
package tdt4250.pseudocode.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPcodeValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(tdt4250.pseudocode.pseudocode.PseudocodePackage.eINSTANCE);
		result.add(EPackage.Registry.INSTANCE.getEPackage("platform:/plugin/tdt4250.pseudocode.model/model/pseudocode.ecore"));
		return result;
	}
}
