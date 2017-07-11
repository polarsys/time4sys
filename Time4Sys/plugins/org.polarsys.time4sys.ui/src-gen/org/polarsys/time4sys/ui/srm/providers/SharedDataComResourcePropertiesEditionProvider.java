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
import org.polarsys.time4sys.marte.srm.SharedDataComResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.srm.components.SharedDataComResourceGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.SharedDataComResourceOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.SharedDataComResourcePropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.SharedDataComResourceTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class SharedDataComResourcePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public SharedDataComResourcePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public SharedDataComResourcePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof SharedDataComResource) 
					&& (SrmPackage.Literals.SHARED_DATA_COM_RESOURCE == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof SharedDataComResource) && (SharedDataComResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || SharedDataComResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part) || SharedDataComResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof SharedDataComResource) && (refinement == SharedDataComResourceGeneralPropertiesEditionComponent.class || refinement == SharedDataComResourceTimingPropertiesEditionComponent.class || refinement == SharedDataComResourceOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof SharedDataComResource) && ((SharedDataComResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == SharedDataComResourceGeneralPropertiesEditionComponent.class) || (SharedDataComResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == SharedDataComResourceTimingPropertiesEditionComponent.class) || (SharedDataComResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == SharedDataComResourceOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof SharedDataComResource) {
			return new SharedDataComResourcePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof SharedDataComResource) {
			if (SharedDataComResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new SharedDataComResourceGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SharedDataComResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new SharedDataComResourceTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SharedDataComResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new SharedDataComResourceOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof SharedDataComResource) {
			if (SharedDataComResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == SharedDataComResourceGeneralPropertiesEditionComponent.class)
				return new SharedDataComResourceGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SharedDataComResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == SharedDataComResourceTimingPropertiesEditionComponent.class)
				return new SharedDataComResourceTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SharedDataComResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == SharedDataComResourceOtherPropertiesEditionComponent.class)
				return new SharedDataComResourceOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && SrmPackage.Literals.SHARED_DATA_COM_RESOURCE == eObj.eClass();
		}
		
	}

}
