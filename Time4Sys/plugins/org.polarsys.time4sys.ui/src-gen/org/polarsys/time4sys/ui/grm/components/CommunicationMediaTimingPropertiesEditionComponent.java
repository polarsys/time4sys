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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.TimingPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class CommunicationMediaTimingPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String TIMING_PART = "Timing"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CommunicationMediaTimingPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject communicationMedia, String editing_mode) {
		super(editingContext, communicationMedia, editing_mode);
		parts = new String[] { TIMING_PART };
		repositoryKey = GrmViewsRepository.class;
		partKey = GrmViewsRepository.Timing.class;
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
			
			final CommunicationMedia communicationMedia = (CommunicationMedia)elt;
			final TimingPropertiesEditionPart timingPart = (TimingPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GrmViewsRepository.Timing.TimingProperties.capacity)) {
				timingPart.setCapacity(EEFConverterUtil.convertToString(EcorePackage.Literals.EFLOAT, communicationMedia.getCapacity()));
			}
			
			if (isAccessible(GrmViewsRepository.Timing.TimingProperties.packetTime)) {
				timingPart.setPacketTime(EEFConverterUtil.convertToString(EcorePackage.Literals.EFLOAT, communicationMedia.getPacketTime()));
			}
			
			if (isAccessible(GrmViewsRepository.Timing.TimingProperties.blockingTime)) {
				timingPart.setBlockingTime(EEFConverterUtil.convertToString(EcorePackage.Literals.EFLOAT, communicationMedia.getBlockingTime()));
			}
			
			// init filters
			
			
			
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
		if (editorKey == GrmViewsRepository.Timing.TimingProperties.capacity) {
			return GrmPackage.eINSTANCE.getCommunicationMedia_Capacity();
		}
		if (editorKey == GrmViewsRepository.Timing.TimingProperties.packetTime) {
			return GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime();
		}
		if (editorKey == GrmViewsRepository.Timing.TimingProperties.blockingTime) {
			return GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CommunicationMedia communicationMedia = (CommunicationMedia)semanticObject;
		if (GrmViewsRepository.Timing.TimingProperties.capacity == event.getAffectedEditor()) {
			communicationMedia.setCapacity((EEFConverterUtil.createFloatFromString(EcorePackage.Literals.EFLOAT, (String)event.getNewValue())));
		}
		if (GrmViewsRepository.Timing.TimingProperties.packetTime == event.getAffectedEditor()) {
			communicationMedia.setPacketTime((EEFConverterUtil.createFloatFromString(EcorePackage.Literals.EFLOAT, (String)event.getNewValue())));
		}
		if (GrmViewsRepository.Timing.TimingProperties.blockingTime == event.getAffectedEditor()) {
			communicationMedia.setBlockingTime((EEFConverterUtil.createFloatFromString(EcorePackage.Literals.EFLOAT, (String)event.getNewValue())));
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
			if (GrmPackage.eINSTANCE.getCommunicationMedia_Capacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GrmViewsRepository.Timing.TimingProperties.capacity)) {
				if (msg.getNewValue() != null) {
					timingPart.setCapacity(EcoreUtil.convertToString(EcorePackage.Literals.EFLOAT, msg.getNewValue()));
				} else {
					timingPart.setCapacity("");
				}
			}
			if (GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GrmViewsRepository.Timing.TimingProperties.packetTime)) {
				if (msg.getNewValue() != null) {
					timingPart.setPacketTime(EcoreUtil.convertToString(EcorePackage.Literals.EFLOAT, msg.getNewValue()));
				} else {
					timingPart.setPacketTime("");
				}
			}
			if (GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && timingPart != null && isAccessible(GrmViewsRepository.Timing.TimingProperties.blockingTime)) {
				if (msg.getNewValue() != null) {
					timingPart.setBlockingTime(EcoreUtil.convertToString(EcorePackage.Literals.EFLOAT, msg.getNewValue()));
				} else {
					timingPart.setBlockingTime("");
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
			GrmPackage.eINSTANCE.getCommunicationMedia_Capacity(),
			GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime(),
			GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GrmViewsRepository.Timing.TimingProperties.capacity || key == GrmViewsRepository.Timing.TimingProperties.packetTime || key == GrmViewsRepository.Timing.TimingProperties.blockingTime || key == GrmViewsRepository.Timing.TimingProperties.class;
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
				if (GrmViewsRepository.Timing.TimingProperties.capacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationMedia_Capacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationMedia_Capacity().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.Timing.TimingProperties.packetTime == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationMedia_PacketTime().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.Timing.TimingProperties.blockingTime == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationMedia_BlockingTime().getEAttributeType(), newValue);
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
