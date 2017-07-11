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
package org.polarsys.time4sys.ui.grm.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;
import org.eclipse.jface.viewers.IFilter;
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.ui.grm.components.CommunicationMediaGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.grm.components.CommunicationMediaOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.grm.components.CommunicationMediaPropertiesEditionComponent;
import org.polarsys.time4sys.ui.grm.components.CommunicationMediaTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class CommunicationMediaPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public CommunicationMediaPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public CommunicationMediaPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof CommunicationMedia) 
					&& (GrmPackage.Literals.COMMUNICATION_MEDIA == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof CommunicationMedia) && (CommunicationMediaGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || CommunicationMediaTimingPropertiesEditionComponent.TIMING_PART.equals(part) || CommunicationMediaOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof CommunicationMedia) && (refinement == CommunicationMediaGeneralPropertiesEditionComponent.class || refinement == CommunicationMediaTimingPropertiesEditionComponent.class || refinement == CommunicationMediaOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof CommunicationMedia) && ((CommunicationMediaGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == CommunicationMediaGeneralPropertiesEditionComponent.class) || (CommunicationMediaTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == CommunicationMediaTimingPropertiesEditionComponent.class) || (CommunicationMediaOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == CommunicationMediaOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof CommunicationMedia) {
			return new CommunicationMediaPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof CommunicationMedia) {
			if (CommunicationMediaGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new CommunicationMediaGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (CommunicationMediaTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new CommunicationMediaTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (CommunicationMediaOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new CommunicationMediaOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof CommunicationMedia) {
			if (CommunicationMediaGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == CommunicationMediaGeneralPropertiesEditionComponent.class)
				return new CommunicationMediaGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (CommunicationMediaTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == CommunicationMediaTimingPropertiesEditionComponent.class)
				return new CommunicationMediaTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (CommunicationMediaOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == CommunicationMediaOtherPropertiesEditionComponent.class)
				return new CommunicationMediaOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

	/**
	 * Provides the filter used by the plugin.xml to assign part forms.
	 */
	public static class EditionFilter implements IFilter {
	
		/**
		 * {@inheritDoc}
		 * 
		 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
		 */
		public boolean select(Object toTest) {
			EObject eObj = EEFUtils.resolveSemanticObject(toTest);
			return eObj != null && GrmPackage.Literals.COMMUNICATION_MEDIA == eObj.eClass();
		}
		
	}

}
