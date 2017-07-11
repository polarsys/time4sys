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
package org.polarsys.time4sys.ui.grm.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.UsageTypedAmount;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.OtherPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class UsageTypedAmountOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String OTHER_PART = "Other"; //$NON-NLS-1$

	
	/**
	 * Settings for pServices ReferencesTable
	 */
	protected ReferencesTableSettings pServicesSettings;
	
	/**
	 * Settings for rServices ReferencesTable
	 */
	private ReferencesTableSettings rServicesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public UsageTypedAmountOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject usageTypedAmount, String editing_mode) {
		super(editingContext, usageTypedAmount, editing_mode);
		parts = new String[] { OTHER_PART };
		repositoryKey = GrmViewsRepository.class;
		partKey = GrmViewsRepository.Other.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final UsageTypedAmount usageTypedAmount = (UsageTypedAmount)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.pServices)) {
				pServicesSettings = new ReferencesTableSettings(usageTypedAmount, GrmPackage.eINSTANCE.getResource_PServices());
				otherPart.initPServices(pServicesSettings);
			}
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.rServices)) {
				rServicesSettings = new ReferencesTableSettings(usageTypedAmount, GrmPackage.eINSTANCE.getResource_RServices());
				otherPart.initRServices(rServicesSettings);
			}
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.allocatedmemory)) {
				otherPart.setAllocatedmemory(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, usageTypedAmount.getAllocatedmemory()));
			}
			
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.usedMemory)) {
				otherPart.setUsedMemory(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, usageTypedAmount.getUsedMemory()));
			}
			
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.powerPeak)) {
				otherPart.setPowerPeak(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, usageTypedAmount.getPowerPeak()));
			}
			
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.energy)) {
				otherPart.setEnergy(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, usageTypedAmount.getEnergy()));
			}
			
			// init filters
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.pServices)) {
				otherPart.addFilterToPServices(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResourceService); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for pServices
				// End of user code
			}
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.rServices)) {
				otherPart.addFilterToRServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for rServices
				// End of user code
			}
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == GrmViewsRepository.Other.OtherProperties.pServices) {
			return GrmPackage.eINSTANCE.getResource_PServices();
		}
		if (editorKey == GrmViewsRepository.Other.OtherProperties.rServices) {
			return GrmPackage.eINSTANCE.getResource_RServices();
		}
		if (editorKey == GrmViewsRepository.Other.OtherProperties.allocatedmemory) {
			return GrmPackage.eINSTANCE.getUsageTypedAmount_Allocatedmemory();
		}
		if (editorKey == GrmViewsRepository.Other.OtherProperties.usedMemory) {
			return GrmPackage.eINSTANCE.getUsageTypedAmount_UsedMemory();
		}
		if (editorKey == GrmViewsRepository.Other.OtherProperties.powerPeak) {
			return GrmPackage.eINSTANCE.getUsageTypedAmount_PowerPeak();
		}
		if (editorKey == GrmViewsRepository.Other.OtherProperties.energy) {
			return GrmPackage.eINSTANCE.getUsageTypedAmount_Energy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		UsageTypedAmount usageTypedAmount = (UsageTypedAmount)semanticObject;
		if (GrmViewsRepository.Other.OtherProperties.pServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, pServicesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				pServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				pServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (GrmViewsRepository.Other.OtherProperties.rServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					rServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				rServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				rServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (GrmViewsRepository.Other.OtherProperties.allocatedmemory == event.getAffectedEditor()) {
			usageTypedAmount.setAllocatedmemory((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (GrmViewsRepository.Other.OtherProperties.usedMemory == event.getAffectedEditor()) {
			usageTypedAmount.setUsedMemory((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (GrmViewsRepository.Other.OtherProperties.powerPeak == event.getAffectedEditor()) {
			usageTypedAmount.setPowerPeak((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (GrmViewsRepository.Other.OtherProperties.energy == event.getAffectedEditor()) {
			usageTypedAmount.setEnergy((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			if (GrmPackage.eINSTANCE.getResource_PServices().equals(msg.getFeature()) && isAccessible(GrmViewsRepository.Other.OtherProperties.pServices))
				otherPart.updatePServices();
			if (GrmPackage.eINSTANCE.getResource_RServices().equals(msg.getFeature())  && isAccessible(GrmViewsRepository.Other.OtherProperties.rServices))
				otherPart.updateRServices();
			if (GrmPackage.eINSTANCE.getUsageTypedAmount_Allocatedmemory().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(GrmViewsRepository.Other.OtherProperties.allocatedmemory)) {
				if (msg.getNewValue() != null) {
					otherPart.setAllocatedmemory(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setAllocatedmemory("");
				}
			}
			if (GrmPackage.eINSTANCE.getUsageTypedAmount_UsedMemory().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(GrmViewsRepository.Other.OtherProperties.usedMemory)) {
				if (msg.getNewValue() != null) {
					otherPart.setUsedMemory(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setUsedMemory("");
				}
			}
			if (GrmPackage.eINSTANCE.getUsageTypedAmount_PowerPeak().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(GrmViewsRepository.Other.OtherProperties.powerPeak)) {
				if (msg.getNewValue() != null) {
					otherPart.setPowerPeak(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setPowerPeak("");
				}
			}
			if (GrmPackage.eINSTANCE.getUsageTypedAmount_Energy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(GrmViewsRepository.Other.OtherProperties.energy)) {
				if (msg.getNewValue() != null) {
					otherPart.setEnergy(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setEnergy("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			GrmPackage.eINSTANCE.getResource_PServices(),
			GrmPackage.eINSTANCE.getResource_RServices(),
			GrmPackage.eINSTANCE.getUsageTypedAmount_Allocatedmemory(),
			GrmPackage.eINSTANCE.getUsageTypedAmount_UsedMemory(),
			GrmPackage.eINSTANCE.getUsageTypedAmount_PowerPeak(),
			GrmPackage.eINSTANCE.getUsageTypedAmount_Energy()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GrmViewsRepository.Other.OtherProperties.pServices || key == GrmViewsRepository.Other.OtherProperties.rServices || key == GrmViewsRepository.Other.OtherProperties.allocatedmemory || key == GrmViewsRepository.Other.OtherProperties.usedMemory || key == GrmViewsRepository.Other.OtherProperties.powerPeak || key == GrmViewsRepository.Other.OtherProperties.energy || key == GrmViewsRepository.Other.OtherProperties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (GrmViewsRepository.Other.OtherProperties.allocatedmemory == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getUsageTypedAmount_Allocatedmemory().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getUsageTypedAmount_Allocatedmemory().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.Other.OtherProperties.usedMemory == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getUsageTypedAmount_UsedMemory().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getUsageTypedAmount_UsedMemory().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.Other.OtherProperties.powerPeak == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getUsageTypedAmount_PowerPeak().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getUsageTypedAmount_PowerPeak().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.Other.OtherProperties.energy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getUsageTypedAmount_Energy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getUsageTypedAmount_Energy().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
