/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.design.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.polarsys.time4sys.design.util.DesignAdapterFactory;

/**
 * 
 * @generated
 */
public class DesignEEFAdapterFactory extends DesignAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.design.util.DesignAdapterFactory#createDesignModelAdapter()
	 * @generated
	 */
	public Adapter createDesignModelAdapter() {
		return new DesignModelPropertiesEditionProvider();
	}

}
