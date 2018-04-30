/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.views.nfp.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.polarsys.time4sys.ui.views.nfp.parts.NfpViewsRepository;

import org.polarsys.time4sys.ui.views.nfp.parts.forms.GeneralPropertiesEditionPartForm;

import org.polarsys.time4sys.ui.views.nfp.parts.impl.GeneralPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class NfpPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == NfpViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == NfpViewsRepository.General.class) {
			if (kind == NfpViewsRepository.SWT_KIND)
				return new GeneralPropertiesEditionPartImpl(component);
			if (kind == NfpViewsRepository.FORM_KIND)
				return new GeneralPropertiesEditionPartForm(component);
		}
		return null;
	}

}
