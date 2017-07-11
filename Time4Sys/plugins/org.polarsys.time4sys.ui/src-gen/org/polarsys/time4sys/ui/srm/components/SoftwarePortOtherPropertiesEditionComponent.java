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
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceInterface;
import org.polarsys.time4sys.marte.srm.SoftwarePort;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class SoftwarePortOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String OTHER_PART = "Other"; //$NON-NLS-1$

	
	/**
	 * Settings for pInterface ReferencesTable
	 */
	private ReferencesTableSettings pInterfaceSettings;
	
	/**
	 * Settings for rInterface ReferencesTable
	 */
	private ReferencesTableSettings rInterfaceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoftwarePortOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject softwarePort, String editing_mode) {
		super(editingContext, softwarePort, editing_mode);
		parts = new String[] { OTHER_PART };
		repositoryKey = SrmViewsRepository.class;
		partKey = SrmViewsRepository.Other.class;
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
			
			final SoftwarePort softwarePort = (SoftwarePort)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Other.Properties.packetSize)) {
				otherPart.setPacketSize(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, softwarePort.getPacketSize()));
			}
			
			if (isAccessible(SrmViewsRepository.Other.Properties.pInterface)) {
				pInterfaceSettings = new ReferencesTableSettings(softwarePort, GrmPackage.eINSTANCE.getResourcePort_PInterface());
				otherPart.initPInterface(pInterfaceSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.rInterface)) {
				rInterfaceSettings = new ReferencesTableSettings(softwarePort, GrmPackage.eINSTANCE.getResourcePort_RInterface());
				otherPart.initRInterface(rInterfaceSettings);
			}
			// init filters
			
			if (isAccessible(SrmViewsRepository.Other.Properties.pInterface)) {
				otherPart.addFilterToPInterface(new EObjectFilter(GrmPackage.Literals.RESOURCE_INTERFACE));
				// Start of user code for additional businessfilters for pInterface
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.rInterface)) {
				otherPart.addFilterToRInterface(new EObjectFilter(GrmPackage.Literals.RESOURCE_INTERFACE));
				// Start of user code for additional businessfilters for rInterface
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
		if (editorKey == SrmViewsRepository.Other.Properties.packetSize) {
			return GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.pInterface) {
			return GrmPackage.eINSTANCE.getResourcePort_PInterface();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.rInterface) {
			return GrmPackage.eINSTANCE.getResourcePort_RInterface();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoftwarePort softwarePort = (SoftwarePort)semanticObject;
		if (SrmViewsRepository.Other.Properties.packetSize == event.getAffectedEditor()) {
			softwarePort.setPacketSize((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.Other.Properties.pInterface == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceInterface) {
					pInterfaceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				pInterfaceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				pInterfaceSettings.move(event.getNewIndex(), (ResourceInterface) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.rInterface == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceInterface) {
					rInterfaceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				rInterfaceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				rInterfaceSettings.move(event.getNewIndex(), (ResourceInterface) event.getNewValue());
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
			OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			if (GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.packetSize)) {
				if (msg.getNewValue() != null) {
					otherPart.setPacketSize(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setPacketSize("");
				}
			}
			if (GrmPackage.eINSTANCE.getResourcePort_PInterface().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.pInterface))
				otherPart.updatePInterface();
			if (GrmPackage.eINSTANCE.getResourcePort_RInterface().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.rInterface))
				otherPart.updateRInterface();
			
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
			GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize(),
			GrmPackage.eINSTANCE.getResourcePort_PInterface(),
			GrmPackage.eINSTANCE.getResourcePort_RInterface()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Other.Properties.packetSize || key == SrmViewsRepository.Other.Properties.pInterface || key == SrmViewsRepository.Other.Properties.rInterface || key == SrmViewsRepository.Other.Properties.class;
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
				if (SrmViewsRepository.Other.Properties.packetSize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize().getEAttributeType(), newValue);
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
