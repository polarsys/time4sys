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
package org.polarsys.time4sys.ui.srm.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;
import org.eclipse.jface.viewers.IFilter;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.srm.components.NotificationResourceGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.NotificationResourceOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.NotificationResourcePropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.NotificationResourceTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class NotificationResourcePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public NotificationResourcePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public NotificationResourcePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof NotificationResource) 
					&& (SrmPackage.Literals.NOTIFICATION_RESOURCE == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof NotificationResource) && (NotificationResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || NotificationResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part) || NotificationResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof NotificationResource) && (refinement == NotificationResourceGeneralPropertiesEditionComponent.class || refinement == NotificationResourceTimingPropertiesEditionComponent.class || refinement == NotificationResourceOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof NotificationResource) && ((NotificationResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == NotificationResourceGeneralPropertiesEditionComponent.class) || (NotificationResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == NotificationResourceTimingPropertiesEditionComponent.class) || (NotificationResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == NotificationResourceOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof NotificationResource) {
			return new NotificationResourcePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof NotificationResource) {
			if (NotificationResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new NotificationResourceGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (NotificationResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new NotificationResourceTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (NotificationResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new NotificationResourceOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof NotificationResource) {
			if (NotificationResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == NotificationResourceGeneralPropertiesEditionComponent.class)
				return new NotificationResourceGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (NotificationResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == NotificationResourceTimingPropertiesEditionComponent.class)
				return new NotificationResourceTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (NotificationResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == NotificationResourceOtherPropertiesEditionComponent.class)
				return new NotificationResourceOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && SrmPackage.Literals.NOTIFICATION_RESOURCE == eObj.eClass();
		}
		
	}

}
