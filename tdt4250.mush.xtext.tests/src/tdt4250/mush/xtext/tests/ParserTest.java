package tdt4250.mush.xtext.tests;

import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import tdt4250.mush.model.Model;

import com.google.inject.Inject;

public class ParserTest extends AbstractTest {
	@Inject
	private ParseHelper<Model> parseHelper;

	@Inject
	private ValidationTestHelper validationTestHelper;

	@Override
	protected void test(CharSequence document) throws Exception {
		validationTestHelper.assertNoErrors(parseHelper.parse(document));
	}
}
