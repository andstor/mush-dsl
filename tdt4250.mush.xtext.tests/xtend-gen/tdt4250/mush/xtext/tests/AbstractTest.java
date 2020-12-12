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
    _builder.append("DSL code here");
    _builder.newLine();
    this.test(_builder);
  }
  
  @Test
  public void test2() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Some other DSL code here");
    _builder.newLine();
    this.test(_builder);
  }
  
  @Test
  public void test3() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Another kind of DSL code here");
    _builder.newLine();
    this.test(_builder);
  }
}
