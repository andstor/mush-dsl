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
			Quicksort(list with number t,  number left, number right)
				i equals left
				j equals right
				pivot = t[left plus ((right minus left) divide 2)]
				while i<=j
					while (t at i) < pivot
						i++
					while (t at j) > pivot
						j--
					if i <= j
						exchange t at i with t at j
						i++
						j--
					if left < j
						Quicksort(t,left,j)
					if i < right
						Quicksort(t,i,right)

		'''.test
	}

	@Test def void test2() throws Exception {
		'''
			executable ReverseNumber(number nr)
				lastDigit equals nr modulo 10
				reverse equals 0
				reverse equals ((reverse times 10) plus lastDigit)
				nr equals nr divide 10
				while nr biggerThen 0
					lastDigit equals nr modulo 10
					reverse equals (reverse times 10) plus lastDigit
					nr equals nr divide 10
				print line reverse

		'''.test
	}

	@Test def void test3() throws Exception {
		'''
			MatrixMultiplication(list with list with number m1,list with list with number m2)
				newM equals new list with list with number
				for 0 to ((size of m2) minus 1)
					p equals new list with number
					for 0 to ((size of (m2 at 0)) minus 1)
						p add 0
					newM add  p
				x equals 0
				i equals 0
				l equals 0
				while (x != ((size of m1))) 
					y equals 0
					while (y != ((size of (m2 at 0))))
						z equals 0
						i equals 0	
						while (z != (size of (m2 at y)))
							l equals ((m1[x][z]) times (m2[z][y]))
							i += l
							z++
						newM set x,y to i
						y++
					x++
				return newM
		'''.test
	}
}
