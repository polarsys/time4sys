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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceInterface;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.parts.OtherPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ResourcePortOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	public ResourcePortOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject resourcePort, String editing_mode) {
		super(editingContext, resourcePort, editing_mode);
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
			
			final ResourcePort resourcePort = (ResourcePort)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.pInterface)) {
				pInterfaceSettings = new ReferencesTableSettings(resourcePort, GrmPackage.eINSTANCE.getResourcePort_PInterface());
				otherPart.initPInterface(pInterfaceSettings);
			}
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.rInterface)) {
				rInterfaceSettings = new ReferencesTableSettings(resourcePort, GrmPackage.eINSTANCE.getResourcePort_RInterface());
				otherPart.initRInterface(rInterfaceSettings);
			}
			// init filters
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.pInterface)) {
				otherPart.addFilterToPInterface(new EObjectFilter(GrmPackage.Literals.RESOURCE_INTERFACE));
				// Start of user code for additional businessfilters for pInterface
				// End of user code
			}
			if (isAccessible(GrmViewsRepository.Other.OtherProperties.rInterface)) {
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
		if (editorKey == GrmViewsRepository.Other.OtherProperties.pInterface) {
			return GrmPackage.eINSTANCE.getResourcePort_PInterface();
		}
		if (editorKey == GrmViewsRepository.Other.OtherProperties.rInterface) {
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
		ResourcePort resourcePort = (ResourcePort)semanticObject;
		if (GrmViewsRepository.Other.OtherProperties.pInterface == event.getAffectedEditor()) {
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
		if (GrmViewsRepository.Other.OtherProperties.rInterface == event.getAffectedEditor()) {
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
			if (GrmPackage.eINSTANCE.getResourcePort_PInterface().equals(msg.getFeature())  && isAccessible(GrmViewsRepository.Other.OtherProperties.pInterface))
				otherPart.updatePInterface();
			if (GrmPackage.eINSTANCE.getResourcePort_RInterface().equals(msg.getFeature())  && isAccessible(GrmViewsRepository.Other.OtherProperties.rInterface))
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
			GrmPackage.eINSTANCE.getResourcePort_PInterface(),
			GrmPackage.eINSTANCE.getResourcePort_RInterface()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GrmViewsRepository.Other.OtherProperties.pInterface || key == GrmViewsRepository.Other.OtherProperties.rInterface || key == GrmViewsRepository.Other.OtherProperties.class;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
