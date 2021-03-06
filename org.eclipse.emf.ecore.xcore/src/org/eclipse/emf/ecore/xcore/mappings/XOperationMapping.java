package org.eclipse.emf.ecore.xcore.mappings;

import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.xtext.common.types.JvmOperation;

public class XOperationMapping extends AbstractMapping
{
	private EOperation eOperation;
	private GenOperation genOperation;
	private JvmOperation jvmOperation;

	public EOperation getEOperation()
  {
  	return eOperation;
  }

	public void setEOperation(EOperation eOperation)
  {
  	this.eOperation = eOperation;
  }

	public GenOperation getGenOperation()
  {
  	return genOperation;
  }

	public void setGenOperation(GenOperation genOperation)
  {
  	this.genOperation = genOperation;
  }

	public JvmOperation getJvmOperation()
  {
  	return jvmOperation;
  }

	public void setJvmOperation(JvmOperation jvmOperation)
  {
  	this.jvmOperation = jvmOperation;
  }
	
	
}
