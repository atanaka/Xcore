/*
 * generated by Xtext
 */
package org.eclipse.emf.ecore.xcore;

import org.eclipse.emf.ecore.xcore.linking.XcoreLazyLinker;
import org.eclipse.xtext.linking.ILinker;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class XcoreRuntimeModule extends org.eclipse.emf.ecore.xcore.AbstractXcoreRuntimeModule 
{
  @Override
  public Class<? extends ILinker> bindILinker() 
  {
    return XcoreLazyLinker.class;
  }
}