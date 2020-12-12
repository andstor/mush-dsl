/*
 * generated by Xtext 2.22.0
 */
package tdt4250.mush.xtext.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import tdt4250.mush.model.Model

@ExtendWith(InjectionExtension)
@InjectWith(MushInjectorProvider)
class ModelTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void loadModel() {
		val model = parseHelper.parse('''
			Hello Xtext!
		''')
		
		//val function = model.functions.get(0) as Function
        //Assert.assertEquals("Sort", function.name)

        //val function = model.functions.get(0) as Function
        //Assert.assertEquals("Sort", function.name)
        //Assert.assertEquals("open", rule.deviceState.name)
	}
}
