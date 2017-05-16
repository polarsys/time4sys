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
package org.polarsys.time4sys.ui.srm.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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
import org.polarsys.time4sys.marte.grm.ResourceControlPolicy;

import org.polarsys.time4sys.marte.srm.InterruptResource;
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class InterruptResourceTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	/**
	 * Settings for resCtrlPolicy ReferencesTable
	 */
	protected ReferencesTableSettings resCtrlPolicySettings;
	
	/**
	 * Settings for mutualExclusionResources ReferencesTable
	 */
	private ReferencesTableSettings mutualExclusionResourcesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public InterruptResourceTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject interruptResource, String editing_mode) {
		super(editingContext, interruptResource, editing_mode);
		parts = new String[] { TIMING_PART };
		repositoryKey = SrmViewsRepository.class;
		partKey = SrmViewsRepository.Timing.class;
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
			
			final InterruptResource interruptResource = (InterruptResource)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Timing.Properties.resCtrlPolicy)) {
				resCtrlPolicySettings = new ReferencesTableSettings(interruptResource, GrmPackage.eINSTANCE.getResourceManager_ResCtrlPolicy());
				timingPart.initResCtrlPolicy(resCtrlPolicySettings);
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.priorityElements))
				timingPart.setPriorityElements(interruptResource.getPriorityElements());
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.mutualExclusionResources)) {
				mutualExclusionResourcesSettings = new ReferencesTableSettings(interruptResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_MutualExclusionResources());
				timingPart.initMutualExclusionResources(mutualExclusionResourcesSettings);
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.arrivalPattern))
				timingPart.setArrivalPattern(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, interruptResource.getArrivalPattern()));
			
			// init filters
			if (isAccessible(SrmViewsRepository.Timing.Properties.resCtrlPolicy)) {
				timingPart.addFilterToResCtrlPolicy(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ResourceControlPolicy);
					}
			
				});
				// Start of user code for additional businessfilters for resCtrlPolicy
				// End of user code
			}
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.mutualExclusionResources)) {
				timingPart.addFilterToMutualExclusionResources(new EObjectFilter(SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE));
				// Start of user code for additional businessfilters for mutualExclusionResources
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
		if (editorKey == SrmViewsRepository.Timing.Properties.resCtrlPolicy) {
			return GrmPackage.eINSTANCE.getResourceManager_ResCtrlPolicy();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.priorityElements) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PriorityElements();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.mutualExclusionResources) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_MutualExclusionResources();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.arrivalPattern) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ArrivalPattern();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		InterruptResource interruptResource = (InterruptResource)semanticObject;
		if (SrmViewsRepository.Timing.Properties.resCtrlPolicy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resCtrlPolicySettings, editingContext.getAdapterFactory());
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
				resCtrlPolicySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resCtrlPolicySettings.move(event.getNewIndex(), (ResourceControlPolicy) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Timing.Properties.priorityElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				interruptResource.getPriorityElements().clear();
				interruptResource.getPriorityElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.Timing.Properties.mutualExclusionResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoftwareMutualExclusionResource) {
					mutualExclusionResourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				mutualExclusionResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				mutualExclusionResourcesSettings.move(event.getNewIndex(), (SoftwareMutualExclusionResource) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Timing.Properties.arrivalPattern == event.getAffectedEditor()) {
			interruptResource.setArrivalPattern((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			if (GrmPackage.eINSTANCE.getResourceManager_ResCtrlPolicy().equals(msg.getFeature()) && isAccessible(SrmViewsRepository.Timing.Properties.resCtrlPolicy))
				timingPart.updateResCtrlPolicy();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PriorityElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.priorityElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					timingPart.setPriorityElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					timingPart.setPriorityElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					timingPart.setPriorityElements(newValueAsList);
				}
			}
			
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_MutualExclusionResources().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Timing.Properties.mutualExclusionResources))
				timingPart.updateMutualExclusionResources();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ArrivalPattern().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.arrivalPattern)) {
				if (msg.getNewValue() != null) {
					timingPart.setArrivalPattern(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					timingPart.setArrivalPattern("");
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
			GrmPackage.eINSTANCE.getResourceManager_ResCtrlPolicy(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PriorityElements(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_MutualExclusionResources(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ArrivalPattern()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Timing.Properties.resCtrlPolicy || key == SrmViewsRepository.Timing.Properties.priorityElements || key == SrmViewsRepository.Timing.Properties.mutualExclusionResources || key == SrmViewsRepository.Timing.Properties.arrivalPattern || key == SrmViewsRepository.Timing.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.managedResource || key == SrmViewsRepository.Timing.Properties.resCtrlPolicy || key == SrmViewsRepository.General.Properties.kind || key == SrmViewsRepository.Other.Properties.isMaskable;
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
				if (SrmViewsRepository.Timing.Properties.priorityElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PriorityElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SrmViewsRepository.Timing.Properties.arrivalPattern == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ArrivalPattern().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ArrivalPattern().getEAttributeType(), newValue);
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
