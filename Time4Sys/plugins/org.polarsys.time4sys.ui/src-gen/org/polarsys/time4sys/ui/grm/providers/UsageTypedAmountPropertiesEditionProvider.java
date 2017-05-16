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

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.UsageTypedAmount;

import org.polarsys.time4sys.ui.grm.components.UsageTypedAmountGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.grm.components.UsageTypedAmountOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.grm.components.UsageTypedAmountPropertiesEditionComponent;
import org.polarsys.time4sys.ui.grm.components.UsageTypedAmountTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class UsageTypedAmountPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public UsageTypedAmountPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public UsageTypedAmountPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof UsageTypedAmount) 
					&& (GrmPackage.Literals.USAGE_TYPED_AMOUNT == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof UsageTypedAmount) && (UsageTypedAmountGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || UsageTypedAmountTimingPropertiesEditionComponent.TIMING_PART.equals(part) || UsageTypedAmountOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof UsageTypedAmount) && (refinement == UsageTypedAmountGeneralPropertiesEditionComponent.class || refinement == UsageTypedAmountTimingPropertiesEditionComponent.class || refinement == UsageTypedAmountOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof UsageTypedAmount) && ((UsageTypedAmountGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == UsageTypedAmountGeneralPropertiesEditionComponent.class) || (UsageTypedAmountTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == UsageTypedAmountTimingPropertiesEditionComponent.class) || (UsageTypedAmountOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == UsageTypedAmountOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof UsageTypedAmount) {
			return new UsageTypedAmountPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof UsageTypedAmount) {
			if (UsageTypedAmountGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new UsageTypedAmountGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (UsageTypedAmountTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new UsageTypedAmountTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (UsageTypedAmountOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new UsageTypedAmountOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof UsageTypedAmount) {
			if (UsageTypedAmountGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == UsageTypedAmountGeneralPropertiesEditionComponent.class)
				return new UsageTypedAmountGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (UsageTypedAmountTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == UsageTypedAmountTimingPropertiesEditionComponent.class)
				return new UsageTypedAmountTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (UsageTypedAmountOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == UsageTypedAmountOtherPropertiesEditionComponent.class)
				return new UsageTypedAmountOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && GrmPackage.Literals.USAGE_TYPED_AMOUNT == eObj.eClass();
		}
		
	}

}
