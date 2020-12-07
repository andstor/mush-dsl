package tdt4250.pseudocode.formatting2;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.formatting.impl.DefaultNodeModelFormatter;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class PcodeNodeModelFormatter extends DefaultNodeModelFormatter {

	@Override
	public IFormattedRegion format(ICompositeNode root, int offset, int length) {
		Resource eResource = NodeModelUtils.findActualSemanticObjectFor(root).eResource();
		if (eResource.getErrors().size() > 0) {
			return new FormattedRegion(0, 0, "");
		}
		return super.format(root, offset, length);
	}

}