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
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceControlPolicy;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.NotificationResourceKind;
import org.polarsys.time4sys.marte.srm.OccurencePolicyKind;
import org.polarsys.time4sys.marte.srm.QueuePolicyKind;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class NotificationResourceTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	/**
	 * Settings for resCtrlPolicy ReferencesTable
	 */
	protected ReferencesTableSettings resCtrlPolicySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public NotificationResourceTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject notificationResource, String editing_mode) {
		super(editingContext, notificationResource, editing_mode);
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
			
			final NotificationResource notificationResource = (NotificationResource)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Timing.Properties.resCtrlPolicy)) {
				resCtrlPolicySettings = new ReferencesTableSettings(notificationResource, GrmPackage.eINSTANCE.getResourceManager_ResCtrlPolicy());
				timingPart.initResCtrlPolicy(resCtrlPolicySettings);
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.waitingQueuePolicy)) {
				timingPart.initWaitingQueuePolicy(EEFUtils.choiceOfValues(notificationResource, SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueuePolicy()), notificationResource.getWaitingQueuePolicy());
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.waitingQueueCapacity)) {
				timingPart.setWaitingQueueCapacity(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, notificationResource.getWaitingQueueCapacity()));
			}
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.waitingPolicyElements))
				timingPart.setWaitingPolicyElements(notificationResource.getWaitingPolicyElements());
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.policy)) {
				timingPart.initPolicy(EEFUtils.choiceOfValues(notificationResource, SrmPackage.eINSTANCE.getNotificationResource_Policy()), notificationResource.getPolicy());
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.mechanism)) {
				timingPart.initMechanism(EEFUtils.choiceOfValues(notificationResource, SrmPackage.eINSTANCE.getNotificationResource_Mechanism()), notificationResource.getMechanism());
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.occurenceCountElements))
				timingPart.setOccurenceCountElements(notificationResource.getOccurenceCountElements());
			
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
		if (editorKey == SrmViewsRepository.Timing.Properties.waitingQueuePolicy) {
			return SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueuePolicy();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.waitingQueueCapacity) {
			return SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueueCapacity();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.waitingPolicyElements) {
			return SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingPolicyElements();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.policy) {
			return SrmPackage.eINSTANCE.getNotificationResource_Policy();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.mechanism) {
			return SrmPackage.eINSTANCE.getNotificationResource_Mechanism();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.occurenceCountElements) {
			return SrmPackage.eINSTANCE.getNotificationResource_OccurenceCountElements();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		NotificationResource notificationResource = (NotificationResource)semanticObject;
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
		if (SrmViewsRepository.Timing.Properties.waitingQueuePolicy == event.getAffectedEditor()) {
			notificationResource.setWaitingQueuePolicy((QueuePolicyKind)event.getNewValue());
		}
		if (SrmViewsRepository.Timing.Properties.waitingQueueCapacity == event.getAffectedEditor()) {
			notificationResource.setWaitingQueueCapacity((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.Timing.Properties.waitingPolicyElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				notificationResource.getWaitingPolicyElements().clear();
				notificationResource.getWaitingPolicyElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.Timing.Properties.policy == event.getAffectedEditor()) {
			notificationResource.setPolicy((OccurencePolicyKind)event.getNewValue());
		}
		if (SrmViewsRepository.Timing.Properties.mechanism == event.getAffectedEditor()) {
			notificationResource.setMechanism((NotificationResourceKind)event.getNewValue());
		}
		if (SrmViewsRepository.Timing.Properties.occurenceCountElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				notificationResource.getOccurenceCountElements().clear();
				notificationResource.getOccurenceCountElements().addAll(((EList) event.getNewValue()));
			}
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
			if (SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueuePolicy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(SrmViewsRepository.Timing.Properties.waitingQueuePolicy))
				timingPart.setWaitingQueuePolicy((QueuePolicyKind)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueueCapacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.waitingQueueCapacity)) {
				if (msg.getNewValue() != null) {
					timingPart.setWaitingQueueCapacity(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					timingPart.setWaitingQueueCapacity("");
				}
			}
			if (SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingPolicyElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.waitingPolicyElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					timingPart.setWaitingPolicyElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					timingPart.setWaitingPolicyElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					timingPart.setWaitingPolicyElements(newValueAsList);
				}
			}
			
			if (SrmPackage.eINSTANCE.getNotificationResource_Policy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(SrmViewsRepository.Timing.Properties.policy))
				timingPart.setPolicy((OccurencePolicyKind)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getNotificationResource_Mechanism().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(SrmViewsRepository.Timing.Properties.mechanism))
				timingPart.setMechanism((NotificationResourceKind)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getNotificationResource_OccurenceCountElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.occurenceCountElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					timingPart.setOccurenceCountElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					timingPart.setOccurenceCountElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					timingPart.setOccurenceCountElements(newValueAsList);
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
			SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueuePolicy(),
			SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueueCapacity(),
			SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingPolicyElements(),
			SrmPackage.eINSTANCE.getNotificationResource_Policy(),
			SrmPackage.eINSTANCE.getNotificationResource_Mechanism(),
			SrmPackage.eINSTANCE.getNotificationResource_OccurenceCountElements()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Timing.Properties.resCtrlPolicy || key == SrmViewsRepository.Timing.Properties.waitingQueuePolicy || key == SrmViewsRepository.Timing.Properties.waitingQueueCapacity || key == SrmViewsRepository.Timing.Properties.waitingPolicyElements || key == SrmViewsRepository.Timing.Properties.policy || key == SrmViewsRepository.Timing.Properties.mechanism || key == SrmViewsRepository.Timing.Properties.occurenceCountElements || key == SrmViewsRepository.Timing.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.managedResource || key == SrmViewsRepository.Timing.Properties.resCtrlPolicy || key == SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction || key == SrmViewsRepository.Timing.Properties.policy || key == SrmViewsRepository.Timing.Properties.mechanism;
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
				if (SrmViewsRepository.Timing.Properties.waitingQueuePolicy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueuePolicy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueuePolicy().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.waitingQueueCapacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueueCapacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueueCapacity().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.waitingPolicyElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingPolicyElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SrmViewsRepository.Timing.Properties.policy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getNotificationResource_Policy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getNotificationResource_Policy().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.mechanism == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getNotificationResource_Mechanism().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getNotificationResource_Mechanism().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.occurenceCountElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getNotificationResource_OccurenceCountElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
