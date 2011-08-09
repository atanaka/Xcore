package org.eclipse.emf.ecore.xcore.tests.validation;

import org.eclipse.emf.ecore.xcore.XcoreInjectorProvider;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.parameterized.AbstractParameterizedXtextTest;
import org.eclipse.xtext.junit4.parameterized.ResourceURIs;
import org.eclipse.xtext.resource.XtextResource;

@InjectWith(XcoreInjectorProvider.class)
@ResourceURIs(baseDir = "src/org/eclipse/emf/ecore/xcore/tests/validation", fileExtensions = "xcore")
public class XcoreValidationTest extends AbstractParameterizedXtextTest
{
	public XcoreValidationTest(XtextResource resource, int offset, String[] params)
	{
		super(resource, offset, params);
	}
}
