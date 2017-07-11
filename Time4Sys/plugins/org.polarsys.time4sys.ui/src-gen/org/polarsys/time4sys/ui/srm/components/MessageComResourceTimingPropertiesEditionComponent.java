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
import org.polarsys.time4sys.marte.grm.TransmModeKind;
import org.polarsys.time4sys.marte.srm.MessageComResource;
import org.polarsys.time4sys.marte.srm.MessageResourceKind;
import org.polarsys.time4sys.marte.srm.QueuePolicyKind;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class MessageComResourceTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	/**
	 * Settings for resCtrlPolicy ReferencesTable
	 */
	protected ReferencesTableSettings resCtrlPolicySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MessageComResourceTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject messageComResource, String editing_mode) {
		super(editingContext, messageComResource, editing_mode);
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
			
			final MessageComResource messageComResource = (MessageComResource)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Timing.Properties.resCtrlPolicy)) {
				resCtrlPolicySettings = new ReferencesTableSettings(messageComResource, GrmPackage.eINSTANCE.getResourceManager_ResCtrlPolicy());
				timingPart.initResCtrlPolicy(resCtrlPolicySettings);
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.waitingQueuePolicy)) {
				timingPart.initWaitingQueuePolicy(EEFUtils.choiceOfValues(messageComResource, SrmPackage.eINSTANCE.getSoftwareInteractionResource_WaitingQueuePolicy()), messageComResource.getWaitingQueuePolicy());
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.waitingQueueCapacity)) {
				timingPart.setWaitingQueueCapacity(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, messageComResource.getWaitingQueueCapacity()));
			}
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.waitingPolicyElements))
				timingPart.setWaitingPolicyElements(messageComResource.getWaitingPolicyElements());
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.capacity)) {
				timingPart.setCapacity(EEFConverterUtil.convertToString(EcorePackage.Literals.EFLOAT, messageComResource.getCapacity()));
			}
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.packetTime)) {
				timingPart.setPacketTime(EEFConverterUtil.convertToString(EcorePackage.Literals.EFLOAT, messageComResource.getPacketTime()));
			}
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.blockingTime)) {
				timingPart.setBlockingTime(EEFConverterUtil.convertToString(EcorePackage.Literals.EFLOAT, messageComResource.getBlockingTime()));
			}
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.transmMode)) {
				timingPart.initTransmMode(EEFUtils.choiceOfValues(messageComResource, GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode()), messageComResource.getTransmMode());
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.isFixedMessageSize)) {
				timingPart.setIsFixedMessageSize(messageComResource.isIsFixedMessageSize());
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.messageSizeElements))
				timingPart.setMessageSizeElements(messageComResource.getMessageSizeElements());
			
			if (isAccessible(SrmViewsRepository.Timing.Properties.mechanism)) {
				timingPart.initMechanism(EEFUtils.choiceOfValues(messageComResource, SrmPackage.eINSTANCE.getMessageComResource_Mechanism()), messageComResource.getMechanism());
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.messageQueuePolicy)) {
				timingPart.initMessageQueuePolicy(EEFUtils.choiceOfValues(messageComResource, SrmPackage.eINSTANCE.getMessageComResource_MessageQueuePolicy()), messageComResource.getMessageQueuePolicy());
			}
			if (isAccessible(SrmViewsRepository.Timing.Properties.messageQueueCapacityElements))
				timingPart.setMessageQueueCapacityElements(messageComResource.getMessageQueueCapacityElements());
			
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
		if (editorKey == SrmViewsRepository.Timing.Properties.capacity) {
			return GrmPackage.eINSTANCE.getCommunicationMedia_Capacity();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.packetTime) {
			return GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.blockingTime) {
			return GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.transmMode) {
			return GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.isFixedMessageSize) {
			return SrmPackage.eINSTANCE.getMessageComResource_IsFixedMessageSize();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.messageSizeElements) {
			return SrmPackage.eINSTANCE.getMessageComResource_MessageSizeElements();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.mechanism) {
			return SrmPackage.eINSTANCE.getMessageComResource_Mechanism();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.messageQueuePolicy) {
			return SrmPackage.eINSTANCE.getMessageComResource_MessageQueuePolicy();
		}
		if (editorKey == SrmViewsRepository.Timing.Properties.messageQueueCapacityElements) {
			return SrmPackage.eINSTANCE.getMessageComResource_MessageQueueCapacityElements();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MessageComResource messageComResource = (MessageComResource)semanticObject;
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
			messageComResource.setWaitingQueuePolicy((QueuePolicyKind)event.getNewValue());
		}
		if (SrmViewsRepository.Timing.Properties.waitingQueueCapacity == event.getAffectedEditor()) {
			messageComResource.setWaitingQueueCapacity((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.Timing.Properties.waitingPolicyElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				messageComResource.getWaitingPolicyElements().clear();
				messageComResource.getWaitingPolicyElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.Timing.Properties.capacity == event.getAffectedEditor()) {
			messageComResource.setCapacity((EEFConverterUtil.createFloatFromString(EcorePackage.Literals.EFLOAT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.Timing.Properties.packetTime == event.getAffectedEditor()) {
			messageComResource.setPacketTime((EEFConverterUtil.createFloatFromString(EcorePackage.Literals.EFLOAT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.Timing.Properties.blockingTime == event.getAffectedEditor()) {
			messageComResource.setBlockingTime((EEFConverterUtil.createFloatFromString(EcorePackage.Literals.EFLOAT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.Timing.Properties.transmMode == event.getAffectedEditor()) {
			messageComResource.setTransmMode((TransmModeKind)event.getNewValue());
		}
		if (SrmViewsRepository.Timing.Properties.isFixedMessageSize == event.getAffectedEditor()) {
			messageComResource.setIsFixedMessageSize((Boolean)event.getNewValue());
		}
		if (SrmViewsRepository.Timing.Properties.messageSizeElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				messageComResource.getMessageSizeElements().clear();
				messageComResource.getMessageSizeElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.Timing.Properties.mechanism == event.getAffectedEditor()) {
			messageComResource.setMechanism((MessageResourceKind)event.getNewValue());
		}
		if (SrmViewsRepository.Timing.Properties.messageQueuePolicy == event.getAffectedEditor()) {
			messageComResource.setMessageQueuePolicy((QueuePolicyKind)event.getNewValue());
		}
		if (SrmViewsRepository.Timing.Properties.messageQueueCapacityElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				messageComResource.getMessageQueueCapacityElements().clear();
				messageComResource.getMessageQueueCapacityElements().addAll(((EList) event.getNewValue()));
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
			
			if (GrmPackage.eINSTANCE.getCommunicationMedia_Capacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.capacity)) {
				if (msg.getNewValue() != null) {
					timingPart.setCapacity(EcoreUtil.convertToString(EcorePackage.Literals.EFLOAT, msg.getNewValue()));
				} else {
					timingPart.setCapacity("");
				}
			}
			if (GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.packetTime)) {
				if (msg.getNewValue() != null) {
					timingPart.setPacketTime(EcoreUtil.convertToString(EcorePackage.Literals.EFLOAT, msg.getNewValue()));
				} else {
					timingPart.setPacketTime("");
				}
			}
			if (GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.blockingTime)) {
				if (msg.getNewValue() != null) {
					timingPart.setBlockingTime(EcoreUtil.convertToString(EcorePackage.Literals.EFLOAT, msg.getNewValue()));
				} else {
					timingPart.setBlockingTime("");
				}
			}
			if (GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(SrmViewsRepository.Timing.Properties.transmMode))
				timingPart.setTransmMode((TransmModeKind)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getMessageComResource_IsFixedMessageSize().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.isFixedMessageSize))
				timingPart.setIsFixedMessageSize((Boolean)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getMessageComResource_MessageSizeElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.messageSizeElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					timingPart.setMessageSizeElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					timingPart.setMessageSizeElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					timingPart.setMessageSizeElements(newValueAsList);
				}
			}
			
			if (SrmPackage.eINSTANCE.getMessageComResource_Mechanism().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(SrmViewsRepository.Timing.Properties.mechanism))
				timingPart.setMechanism((MessageResourceKind)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getMessageComResource_MessageQueuePolicy().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(SrmViewsRepository.Timing.Properties.messageQueuePolicy))
				timingPart.setMessageQueuePolicy((QueuePolicyKind)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getMessageComResource_MessageQueueCapacityElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(SrmViewsRepository.Timing.Properties.messageQueueCapacityElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					timingPart.setMessageQueueCapacityElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					timingPart.setMessageQueueCapacityElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					timingPart.setMessageQueueCapacityElements(newValueAsList);
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
			GrmPackage.eINSTANCE.getCommunicationMedia_Capacity(),
			GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime(),
			GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime(),
			GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode(),
			SrmPackage.eINSTANCE.getMessageComResource_IsFixedMessageSize(),
			SrmPackage.eINSTANCE.getMessageComResource_MessageSizeElements(),
			SrmPackage.eINSTANCE.getMessageComResource_Mechanism(),
			SrmPackage.eINSTANCE.getMessageComResource_MessageQueuePolicy(),
			SrmPackage.eINSTANCE.getMessageComResource_MessageQueueCapacityElements()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Timing.Properties.resCtrlPolicy || key == SrmViewsRepository.Timing.Properties.waitingQueuePolicy || key == SrmViewsRepository.Timing.Properties.waitingQueueCapacity || key == SrmViewsRepository.Timing.Properties.waitingPolicyElements || key == SrmViewsRepository.Timing.Properties.capacity || key == SrmViewsRepository.Timing.Properties.packetTime || key == SrmViewsRepository.Timing.Properties.blockingTime || key == SrmViewsRepository.Timing.Properties.transmMode || key == SrmViewsRepository.Timing.Properties.isFixedMessageSize || key == SrmViewsRepository.Timing.Properties.messageSizeElements || key == SrmViewsRepository.Timing.Properties.mechanism || key == SrmViewsRepository.Timing.Properties.messageQueuePolicy || key == SrmViewsRepository.Timing.Properties.messageQueueCapacityElements || key == SrmViewsRepository.Timing.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.managedResource || key == SrmViewsRepository.Timing.Properties.resCtrlPolicy || key == SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction || key == SrmViewsRepository.Timing.Properties.isFixedMessageSize;
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
				if (SrmViewsRepository.Timing.Properties.capacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationMedia_Capacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationMedia_Capacity().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.packetTime == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.blockingTime == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.transmMode == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.isFixedMessageSize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getMessageComResource_IsFixedMessageSize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getMessageComResource_IsFixedMessageSize().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.messageSizeElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getMessageComResource_MessageSizeElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SrmViewsRepository.Timing.Properties.mechanism == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getMessageComResource_Mechanism().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getMessageComResource_Mechanism().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.messageQueuePolicy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getMessageComResource_MessageQueuePolicy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getMessageComResource_MessageQueuePolicy().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Timing.Properties.messageQueueCapacityElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getMessageComResource_MessageQueueCapacityElements().getEAttributeType(), iterator.next()));
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
