/*
 * generated by Xtext 2.22.0
 */
package tdt4250.pseudocode.tests

import com.google.inject.Inject
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.util.EmfFormatter
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import tdt4250.pseudocode.Model

@ExtendWith(InjectionExtension)
@InjectWith(PcodeInjectorProvider)
class PcodeParsingTest {
    @Inject ParseHelper<Model> parseHelper

    @Inject extension ISerializer serializer


    @Inject extension CompilationTestHelper
    val code = '''
        
        
        Quicksort(list with list with number t, number left, number right)
            i = t[0]
            o = size of t
        '''

    /*val code = '''
     * 	ANNABELLE(nUMBeR alder, Number hoyde)
     * 	i = 2
     * 	i += 8
     * 	i++
     * 	s=9
     * 	if 9==2 then
     * 		s= 0
     * 	
     '''*/
    @Test def void parseModel() {
        val result = parseHelper.parse(code)
        println(EmfFormatter.objToStr(result))
        val errors = result.eResource.errors
        Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
    }

    @Test def compileModel() {
        parseModel()
        //val result = parseHelper.parse(code)
        compile(code)[it -> println(it)]
       //code.assertCompilesTo('''''')
        
    }
    
    @Test def void formatModel() {
		val model = parseHelper.parse(code)
        println(EmfFormatter.objToStr(model))
		val result = serializer.serialize(model, SaveOptions::newBuilder.format().options)
		println(result)

	}
}
