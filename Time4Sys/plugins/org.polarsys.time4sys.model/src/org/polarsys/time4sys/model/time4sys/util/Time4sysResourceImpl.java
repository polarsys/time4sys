/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.model.time4sys.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.model.time4sys.util.Time4sysResourceFactoryImpl
 * @generated
 */
public class Time4sysResourceImpl extends XMIResourceImpl {

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public Time4sysResourceImpl(URI uri) {
		super(uri);
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected boolean useUUIDs() {
		return true;
	}

	// @Override
	// public void load(Map<?, ?> options) throws IOException {
	//
	// Map<Object, Object> defaultLoadOptions = resourceSet.getLoadOptions();
	// defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
	// Boolean.TRUE);
	//
	// defaultLoadOptions.put(XMLResource.OPTION_RECORD_ANY_TYPE_NAMESPACE_DECLARATIONS,
	// Boolean.TRUE);
	//
	// XMIResource inputResource = (XMIResource)
	// resourceSet.getResource(URI.createFileURI(this.uri.path()), true);
	// try {
	// /*-Loading model from xmi file */
	// inputResource.load(defaultLoadOptions);
	// Object modelRoot = inputResource.getContents().get(0);
	//
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }

	// /*-Saving model back to the same xmi file */
	// public save{
	// try {
	// inputResource.save(defaultLoadOptions);
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	//
	// }

} // Time4sysResourceImpl
