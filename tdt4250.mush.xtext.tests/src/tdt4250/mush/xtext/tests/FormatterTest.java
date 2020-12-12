package tdt4250.mush.xtext.tests;

import org.eclipse.xtext.testing.formatter.FormatterTestHelper;

import com.google.inject.Inject;

public class FormatterTest extends AbstractTest {
	@Inject
	private FormatterTestHelper formatterTestHelper;

	@Override
	protected void test(CharSequence document) throws Exception {
		formatterTestHelper.assertFormatted(req -> req.setToBeFormatted(document));
	}
}
