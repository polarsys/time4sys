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
import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.srm.components.MemoryPartitionGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.MemoryPartitionOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.MemoryPartitionPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.MemoryPartitionTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class MemoryPartitionPropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public MemoryPartitionPropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public MemoryPartitionPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof MemoryPartition) 
					&& (SrmPackage.Literals.MEMORY_PARTITION == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof MemoryPartition) && (MemoryPartitionGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || MemoryPartitionTimingPropertiesEditionComponent.TIMING_PART.equals(part) || MemoryPartitionOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof MemoryPartition) && (refinement == MemoryPartitionGeneralPropertiesEditionComponent.class || refinement == MemoryPartitionTimingPropertiesEditionComponent.class || refinement == MemoryPartitionOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof MemoryPartition) && ((MemoryPartitionGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == MemoryPartitionGeneralPropertiesEditionComponent.class) || (MemoryPartitionTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == MemoryPartitionTimingPropertiesEditionComponent.class) || (MemoryPartitionOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == MemoryPartitionOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof MemoryPartition) {
			return new MemoryPartitionPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof MemoryPartition) {
			if (MemoryPartitionGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new MemoryPartitionGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (MemoryPartitionTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new MemoryPartitionTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (MemoryPartitionOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new MemoryPartitionOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof MemoryPartition) {
			if (MemoryPartitionGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == MemoryPartitionGeneralPropertiesEditionComponent.class)
				return new MemoryPartitionGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (MemoryPartitionTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == MemoryPartitionTimingPropertiesEditionComponent.class)
				return new MemoryPartitionTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (MemoryPartitionOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == MemoryPartitionOtherPropertiesEditionComponent.class)
				return new MemoryPartitionOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
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
			return eObj != null && SrmPackage.Literals.MEMORY_PARTITION == eObj.eClass();
		}
		
	}

}
