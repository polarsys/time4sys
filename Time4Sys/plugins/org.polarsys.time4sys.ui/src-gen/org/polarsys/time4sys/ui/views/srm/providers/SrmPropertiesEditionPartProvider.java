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
package org.polarsys.time4sys.ui.views.srm.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.forms.GeneralPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.srm.parts.forms.OtherPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.srm.parts.forms.TimingPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.srm.parts.impl.GeneralPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.srm.parts.impl.OtherPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.srm.parts.impl.TimingPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class SrmPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == SrmViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == SrmViewsRepository.General.class) {
			if (kind == SrmViewsRepository.SWT_KIND)
				return new GeneralPropertiesEditionPartImpl(component);
			if (kind == SrmViewsRepository.FORM_KIND)
				return new GeneralPropertiesEditionPartForm(component);
		}
		if (key == SrmViewsRepository.Timing.class) {
			if (kind == SrmViewsRepository.SWT_KIND)
				return new TimingPropertiesEditionPartImpl(component);
			if (kind == SrmViewsRepository.FORM_KIND)
				return new TimingPropertiesEditionPartForm(component);
		}
		if (key == SrmViewsRepository.Other.class) {
			if (kind == SrmViewsRepository.SWT_KIND)
				return new OtherPropertiesEditionPartImpl(component);
			if (kind == SrmViewsRepository.FORM_KIND)
				return new OtherPropertiesEditionPartForm(component);
		}
		return null;
	}

}
