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
package org.polarsys.time4sys.ui.views.design.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.polarsys.time4sys.ui.views.design.parts.DesignViewsRepository;
import org.polarsys.time4sys.ui.views.design.parts.forms.DesignModelPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.design.parts.impl.DesignModelPropertiesEditionPartImpl;

/**
 * 
 * @generated
 */
public class DesignPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * @generated
	 */
	public boolean provides(Object key) {
		return key == DesignViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * @generated
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == DesignViewsRepository.DesignModel.class) {
			if (kind == DesignViewsRepository.SWT_KIND)
				return new DesignModelPropertiesEditionPartImpl(component);
			if (kind == DesignViewsRepository.FORM_KIND)
				return new DesignModelPropertiesEditionPartForm(component);
		}
		return null;
	}

}
