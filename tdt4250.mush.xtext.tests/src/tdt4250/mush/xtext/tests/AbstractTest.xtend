package tdt4250.mush.xtext.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(MushInjectorProvider)
abstract class AbstractTest {

	def protected abstract void test(CharSequence document) throws Exception

	@Test def void test1() throws Exception {
		'''
			DSL code here
		'''.test
	}

	@Test def void test2() throws Exception {
		'''
			Some other DSL code here
		'''.test
	}

	@Test def void test3() throws Exception {
		'''
			Another kind of DSL code here
		'''.test
	}
}
