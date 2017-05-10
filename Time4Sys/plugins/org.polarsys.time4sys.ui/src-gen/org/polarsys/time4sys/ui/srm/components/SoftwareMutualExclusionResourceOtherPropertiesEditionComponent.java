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

import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class SoftwareMutualExclusionResourceOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for createServices ReferencesTable
	 */
	private ReferencesTableSettings createServicesSettings;
	
	/**
	 * Settings for deleteServices ReferencesTable
	 */
	private ReferencesTableSettings deleteServicesSettings;
	
	/**
	 * Settings for initializeServices ReferencesTable
	 */
	private ReferencesTableSettings initializeServicesSettings;
	
	/**
	 * Settings for acquireServices ReferencesTable
	 */
	private ReferencesTableSettings acquireServicesSettings;
	
	/**
	 * Settings for releaseServices ReferencesTable
	 */
	private ReferencesTableSettings releaseServicesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoftwareMutualExclusionResourceOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject softwareMutualExclusionResource, String editing_mode) {
		super(editingContext, softwareMutualExclusionResource, editing_mode);
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
			
			final SoftwareMutualExclusionResource softwareMutualExclusionResource = (SoftwareMutualExclusionResource)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Other.Properties.packetSize)) {
				otherPart.setPacketSize(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, softwareMutualExclusionResource.getPacketSize()));
			}
			
			if (isAccessible(SrmViewsRepository.Other.Properties.pServices)) {
				pServicesSettings = new ReferencesTableSettings(softwareMutualExclusionResource, GrmPackage.eINSTANCE.getResource_PServices());
				otherPart.initPServices(pServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.rServices)) {
				rServicesSettings = new ReferencesTableSettings(softwareMutualExclusionResource, GrmPackage.eINSTANCE.getResource_RServices());
				otherPart.initRServices(rServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.createServices)) {
				createServicesSettings = new ReferencesTableSettings(softwareMutualExclusionResource, SrmPackage.eINSTANCE.getSoftwareResource_CreateServices());
				otherPart.initCreateServices(createServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.deleteServices)) {
				deleteServicesSettings = new ReferencesTableSettings(softwareMutualExclusionResource, SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices());
				otherPart.initDeleteServices(deleteServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.initializeServices)) {
				initializeServicesSettings = new ReferencesTableSettings(softwareMutualExclusionResource, SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices());
				otherPart.initInitializeServices(initializeServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction)) {
				otherPart.setIsIntraMemoryPartitionInteraction(softwareMutualExclusionResource.isIsIntraMemoryPartitionInteraction());
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.acquireServices)) {
				acquireServicesSettings = new ReferencesTableSettings(softwareMutualExclusionResource, SrmPackage.eINSTANCE.getSoftwareMutualExclusionResource_AcquireServices());
				otherPart.initAcquireServices(acquireServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.releaseServices)) {
				releaseServicesSettings = new ReferencesTableSettings(softwareMutualExclusionResource, SrmPackage.eINSTANCE.getSoftwareMutualExclusionResource_ReleaseServices());
				otherPart.initReleaseServices(releaseServicesSettings);
			}
			// init filters
			
			if (isAccessible(SrmViewsRepository.Other.Properties.pServices)) {
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
			if (isAccessible(SrmViewsRepository.Other.Properties.rServices)) {
				otherPart.addFilterToRServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for rServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.createServices)) {
				otherPart.addFilterToCreateServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for createServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.deleteServices)) {
				otherPart.addFilterToDeleteServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for deleteServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.initializeServices)) {
				otherPart.addFilterToInitializeServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for initializeServices
				// End of user code
			}
			
			if (isAccessible(SrmViewsRepository.Other.Properties.acquireServices)) {
				otherPart.addFilterToAcquireServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for acquireServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.releaseServices)) {
				otherPart.addFilterToReleaseServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for releaseServices
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
		if (editorKey == SrmViewsRepository.Other.Properties.pServices) {
			return GrmPackage.eINSTANCE.getResource_PServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.rServices) {
			return GrmPackage.eINSTANCE.getResource_RServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.createServices) {
			return SrmPackage.eINSTANCE.getSoftwareResource_CreateServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.deleteServices) {
			return SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.initializeServices) {
			return SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction) {
			return SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.acquireServices) {
			return SrmPackage.eINSTANCE.getSoftwareMutualExclusionResource_AcquireServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.releaseServices) {
			return SrmPackage.eINSTANCE.getSoftwareMutualExclusionResource_ReleaseServices();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoftwareMutualExclusionResource softwareMutualExclusionResource = (SoftwareMutualExclusionResource)semanticObject;
		if (SrmViewsRepository.Other.Properties.packetSize == event.getAffectedEditor()) {
			softwareMutualExclusionResource.setPacketSize((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.Other.Properties.pServices == event.getAffectedEditor()) {
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
		if (SrmViewsRepository.Other.Properties.rServices == event.getAffectedEditor()) {
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
		if (SrmViewsRepository.Other.Properties.createServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					createServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				createServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				createServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.deleteServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					deleteServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				deleteServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				deleteServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.initializeServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					initializeServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				initializeServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				initializeServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction == event.getAffectedEditor()) {
			softwareMutualExclusionResource.setIsIntraMemoryPartitionInteraction((Boolean)event.getNewValue());
		}
		if (SrmViewsRepository.Other.Properties.acquireServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					acquireServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				acquireServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				acquireServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.releaseServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					releaseServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				releaseServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				releaseServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
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
			if (GrmPackage.eINSTANCE.getResource_PServices().equals(msg.getFeature()) && isAccessible(SrmViewsRepository.Other.Properties.pServices))
				otherPart.updatePServices();
			if (GrmPackage.eINSTANCE.getResource_RServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.rServices))
				otherPart.updateRServices();
			if (SrmPackage.eINSTANCE.getSoftwareResource_CreateServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.createServices))
				otherPart.updateCreateServices();
			if (SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.deleteServices))
				otherPart.updateDeleteServices();
			if (SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.initializeServices))
				otherPart.updateInitializeServices();
			if (SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction))
				otherPart.setIsIntraMemoryPartitionInteraction((Boolean)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getSoftwareMutualExclusionResource_AcquireServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.acquireServices))
				otherPart.updateAcquireServices();
			if (SrmPackage.eINSTANCE.getSoftwareMutualExclusionResource_ReleaseServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.releaseServices))
				otherPart.updateReleaseServices();
			
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
			GrmPackage.eINSTANCE.getResource_PServices(),
			GrmPackage.eINSTANCE.getResource_RServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_CreateServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices(),
			SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction(),
			SrmPackage.eINSTANCE.getSoftwareMutualExclusionResource_AcquireServices(),
			SrmPackage.eINSTANCE.getSoftwareMutualExclusionResource_ReleaseServices()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Other.Properties.packetSize || key == SrmViewsRepository.Other.Properties.pServices || key == SrmViewsRepository.Other.Properties.rServices || key == SrmViewsRepository.Other.Properties.createServices || key == SrmViewsRepository.Other.Properties.deleteServices || key == SrmViewsRepository.Other.Properties.initializeServices || key == SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction || key == SrmViewsRepository.Other.Properties.acquireServices || key == SrmViewsRepository.Other.Properties.releaseServices || key == SrmViewsRepository.Other.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.managedResource || key == SrmViewsRepository.Timing.Properties.resCtrlPolicy || key == SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction;
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
				if (SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction().getEAttributeType(), newValue);
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
