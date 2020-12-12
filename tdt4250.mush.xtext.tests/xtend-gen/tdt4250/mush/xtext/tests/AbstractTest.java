package tdt4250.mush.xtext.tests;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import tdt4250.mush.xtext.tests.MushInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(MushInjectorProvider.class)
@SuppressWarnings("all")
public abstract class AbstractTest {
  protected abstract void test(final CharSequence document) throws Exception;
  
  @Test
  public void test1() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Quicksort(list with number t,  number left, number right)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("i equals left");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("j equals right");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("pivot = t[left plus ((right minus left) divide 2)]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("while i<=j");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while (t at i) < pivot");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("i++");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while (t at j) > pivot");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("j--");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if i <= j");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("exchange t at i with t at j");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("i++");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("j--");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if left < j");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Quicksort(t,left,j)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if i < right");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Quicksort(t,i,right)");
    _builder.newLine();
    _builder.newLine();
    this.test(_builder);
  }
  
  @Test
  public void test2() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("executable ReverseNumber(number nr)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("lastDigit equals nr modulo 10");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("reverse equals 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("reverse equals ((reverse times 10) plus lastDigit)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("nr equals nr divide 10");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("while nr biggerThen 0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("lastDigit equals nr modulo 10");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("reverse equals (reverse times 10) plus lastDigit");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("nr equals nr divide 10");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("print line reverse");
    _builder.newLine();
    _builder.newLine();
    this.test(_builder);
  }
  
  @Test
  public void test3() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("MatrixMultiplication(list with list with number m1,list with list with number m2)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("newM equals new list with list with number");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for 0 to ((size of m2) minus 1)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("p equals new list with number");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for 0 to ((size of (m2 at 0)) minus 1)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("p add 0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("newM add  p");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("x equals 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("i equals 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("l equals 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("while (x != ((size of m1))) ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("y equals 0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while (y != ((size of (m2 at 0))))");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("z equals 0");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("i equals 0\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("while (z != (size of (m2 at y)))");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("l equals ((m1[x][z]) times (m2[z][y]))");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("i += l");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("z++");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("newM set x,y to i");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("y++");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x++");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return newM");
    _builder.newLine();
    this.test(_builder);
  }
}
