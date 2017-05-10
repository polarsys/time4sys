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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceUsage;

import org.polarsys.time4sys.marte.srm.InterruptKind;
import org.polarsys.time4sys.marte.srm.InterruptResource;
import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.MessageComResource;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.SharedDataComResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.marte.srm.SrmPackage;

import org.polarsys.time4sys.ui.views.srm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class InterruptResourceGeneralPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	/**
	 * Settings for ownedResource ReferencesTable
	 */
	protected ReferencesTableSettings ownedResourceSettings;
	
	/**
	 * Settings for ownedPort ReferencesTable
	 */
	protected ReferencesTableSettings ownedPortSettings;
	
	/**
	 * Settings for ownedConnector ReferencesTable
	 */
	protected ReferencesTableSettings ownedConnectorSettings;
	
	/**
	 * Settings for usedBy ReferencesTable
	 */
	private ReferencesTableSettings usedBySettings;
	
	/**
	 * Settings for managedResource ReferencesTable
	 */
	private ReferencesTableSettings managedResourceSettings;
	
	/**
	 * Settings for adressSpace EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings adressSpaceSettings;
	
	/**
	 * Settings for sharedDataResources ReferencesTable
	 */
	private ReferencesTableSettings sharedDataResourcesSettings;
	
	/**
	 * Settings for messageResources ReferencesTable
	 */
	private ReferencesTableSettings messageResourcesSettings;
	
	/**
	 * Settings for notificationResources ReferencesTable
	 */
	private ReferencesTableSettings notificationResourcesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public InterruptResourceGeneralPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject interruptResource, String editing_mode) {
		super(editingContext, interruptResource, editing_mode);
		parts = new String[] { GENERAL_PART };
		repositoryKey = SrmViewsRepository.class;
		partKey = SrmViewsRepository.General.class;
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
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.General.Properties.name))
				generalPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, interruptResource.getName()));
			
			if (isAccessible(SrmViewsRepository.General.Properties.ownedResource)) {
				ownedResourceSettings = new ReferencesTableSettings(interruptResource, GrmPackage.eINSTANCE.getResource_OwnedResource());
				generalPart.initOwnedResource(ownedResourceSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.resMult)) {
				generalPart.setResMult(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, interruptResource.getResMult()));
			}
			
			if (isAccessible(SrmViewsRepository.General.Properties.isProtected)) {
				generalPart.setIsProtected(interruptResource.isIsProtected());
			}
			if (isAccessible(SrmViewsRepository.General.Properties.isActive)) {
				generalPart.setIsActive(interruptResource.isIsActive());
			}
			if (isAccessible(SrmViewsRepository.General.Properties.ownedPort)) {
				ownedPortSettings = new ReferencesTableSettings(interruptResource, GrmPackage.eINSTANCE.getResource_OwnedPort());
				generalPart.initOwnedPort(ownedPortSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.ownedConnector)) {
				ownedConnectorSettings = new ReferencesTableSettings(interruptResource, GrmPackage.eINSTANCE.getResource_OwnedConnector());
				generalPart.initOwnedConnector(ownedConnectorSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.usedBy)) {
				usedBySettings = new ReferencesTableSettings(interruptResource, GrmPackage.eINSTANCE.getResource_UsedBy());
				generalPart.initUsedBy(usedBySettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.managedResource)) {
				managedResourceSettings = new ReferencesTableSettings(interruptResource, GrmPackage.eINSTANCE.getResourceManager_ManagedResource());
				generalPart.initManagedResource(managedResourceSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.memorySizeFootprint)) {
				generalPart.setMemorySizeFootprint(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, interruptResource.getMemorySizeFootprint()));
			}
			
			if (isAccessible(SrmViewsRepository.General.Properties.stateElements))
				generalPart.setStateElements(interruptResource.getStateElements());
			
			if (isAccessible(SrmViewsRepository.General.Properties.identifierElements))
				generalPart.setIdentifierElements(interruptResource.getIdentifierElements());
			
			if (isAccessible(SrmViewsRepository.General.Properties.adressSpace)) {
				// init part
				adressSpaceSettings = new EObjectFlatComboSettings(interruptResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_AdressSpace());
				generalPart.initAdressSpace(adressSpaceSettings);
				// set the button mode
				generalPart.setAdressSpaceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.periodElements))
				generalPart.setPeriodElements(interruptResource.getPeriodElements());
			
			if (isAccessible(SrmViewsRepository.General.Properties.activationCapacity)) {
				generalPart.setActivationCapacity(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, interruptResource.getActivationCapacity()));
			}
			
			if (isAccessible(SrmViewsRepository.General.Properties.sharedDataResources)) {
				sharedDataResourcesSettings = new ReferencesTableSettings(interruptResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_SharedDataResources());
				generalPart.initSharedDataResources(sharedDataResourcesSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.messageResources)) {
				messageResourcesSettings = new ReferencesTableSettings(interruptResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_MessageResources());
				generalPart.initMessageResources(messageResourcesSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.notificationResources)) {
				notificationResourcesSettings = new ReferencesTableSettings(interruptResource, SrmPackage.eINSTANCE.getSoftwareConcurrentResource_NotificationResources());
				generalPart.initNotificationResources(notificationResourcesSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.entryPoints))
				generalPart.setEntryPoints(interruptResource.getEntryPoints());
			
			if (isAccessible(SrmViewsRepository.General.Properties.kind)) {
				generalPart.initKind(EEFUtils.choiceOfValues(interruptResource, SrmPackage.eINSTANCE.getInterruptResource_Kind()), interruptResource.getKind());
			}
			if (isAccessible(SrmViewsRepository.General.Properties.isrEntryPoints))
				generalPart.setIsrEntryPoints(interruptResource.getIsrEntryPoints());
			
			// init filters
			
			if (isAccessible(SrmViewsRepository.General.Properties.ownedResource)) {
				generalPart.addFilterToOwnedResource(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Resource); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ownedResource
				// End of user code
			}
			
			
			
			if (isAccessible(SrmViewsRepository.General.Properties.ownedPort)) {
				generalPart.addFilterToOwnedPort(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResourcePort); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ownedPort
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.General.Properties.ownedConnector)) {
				generalPart.addFilterToOwnedConnector(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResourceConnector); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ownedConnector
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.General.Properties.usedBy)) {
				generalPart.addFilterToUsedBy(new EObjectFilter(GrmPackage.Literals.RESOURCE_USAGE));
				// Start of user code for additional businessfilters for usedBy
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.General.Properties.managedResource)) {
				generalPart.addFilterToManagedResource(new EObjectFilter(GrmPackage.Literals.RESOURCE));
				// Start of user code for additional businessfilters for managedResource
				// End of user code
			}
			
			
			
			if (isAccessible(SrmViewsRepository.General.Properties.adressSpace)) {
				generalPart.addFilterToAdressSpace(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof MemoryPartition); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for adressSpace
				// End of user code
			}
			
			
			if (isAccessible(SrmViewsRepository.General.Properties.sharedDataResources)) {
				generalPart.addFilterToSharedDataResources(new EObjectFilter(SrmPackage.Literals.SHARED_DATA_COM_RESOURCE));
				// Start of user code for additional businessfilters for sharedDataResources
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.General.Properties.messageResources)) {
				generalPart.addFilterToMessageResources(new EObjectFilter(SrmPackage.Literals.MESSAGE_COM_RESOURCE));
				// Start of user code for additional businessfilters for messageResources
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.General.Properties.notificationResources)) {
				generalPart.addFilterToNotificationResources(new EObjectFilter(SrmPackage.Literals.NOTIFICATION_RESOURCE));
				// Start of user code for additional businessfilters for notificationResources
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
		if (editorKey == SrmViewsRepository.General.Properties.name) {
			return GrmPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == SrmViewsRepository.General.Properties.ownedResource) {
			return GrmPackage.eINSTANCE.getResource_OwnedResource();
		}
		if (editorKey == SrmViewsRepository.General.Properties.resMult) {
			return GrmPackage.eINSTANCE.getResource_ResMult();
		}
		if (editorKey == SrmViewsRepository.General.Properties.isProtected) {
			return GrmPackage.eINSTANCE.getResource_IsProtected();
		}
		if (editorKey == SrmViewsRepository.General.Properties.isActive) {
			return GrmPackage.eINSTANCE.getResource_IsActive();
		}
		if (editorKey == SrmViewsRepository.General.Properties.ownedPort) {
			return GrmPackage.eINSTANCE.getResource_OwnedPort();
		}
		if (editorKey == SrmViewsRepository.General.Properties.ownedConnector) {
			return GrmPackage.eINSTANCE.getResource_OwnedConnector();
		}
		if (editorKey == SrmViewsRepository.General.Properties.usedBy) {
			return GrmPackage.eINSTANCE.getResource_UsedBy();
		}
		if (editorKey == SrmViewsRepository.General.Properties.managedResource) {
			return GrmPackage.eINSTANCE.getResourceManager_ManagedResource();
		}
		if (editorKey == SrmViewsRepository.General.Properties.memorySizeFootprint) {
			return SrmPackage.eINSTANCE.getSoftwareResource_MemorySizeFootprint();
		}
		if (editorKey == SrmViewsRepository.General.Properties.stateElements) {
			return SrmPackage.eINSTANCE.getSoftwareResource_StateElements();
		}
		if (editorKey == SrmViewsRepository.General.Properties.identifierElements) {
			return SrmPackage.eINSTANCE.getSoftwareResource_IdentifierElements();
		}
		if (editorKey == SrmViewsRepository.General.Properties.adressSpace) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_AdressSpace();
		}
		if (editorKey == SrmViewsRepository.General.Properties.periodElements) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PeriodElements();
		}
		if (editorKey == SrmViewsRepository.General.Properties.activationCapacity) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ActivationCapacity();
		}
		if (editorKey == SrmViewsRepository.General.Properties.sharedDataResources) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_SharedDataResources();
		}
		if (editorKey == SrmViewsRepository.General.Properties.messageResources) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_MessageResources();
		}
		if (editorKey == SrmViewsRepository.General.Properties.notificationResources) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_NotificationResources();
		}
		if (editorKey == SrmViewsRepository.General.Properties.entryPoints) {
			return SrmPackage.eINSTANCE.getSoftwareConcurrentResource_EntryPoints();
		}
		if (editorKey == SrmViewsRepository.General.Properties.kind) {
			return SrmPackage.eINSTANCE.getInterruptResource_Kind();
		}
		if (editorKey == SrmViewsRepository.General.Properties.isrEntryPoints) {
			return SrmPackage.eINSTANCE.getInterruptResource_IsrEntryPoints();
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
		if (SrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
			interruptResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SrmViewsRepository.General.Properties.ownedResource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedResourceSettings, editingContext.getAdapterFactory());
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
				ownedResourceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedResourceSettings.move(event.getNewIndex(), (Resource) event.getNewValue());
			}
		}
		if (SrmViewsRepository.General.Properties.resMult == event.getAffectedEditor()) {
			interruptResource.setResMult((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.General.Properties.isProtected == event.getAffectedEditor()) {
			interruptResource.setIsProtected((Boolean)event.getNewValue());
		}
		if (SrmViewsRepository.General.Properties.isActive == event.getAffectedEditor()) {
			interruptResource.setIsActive((Boolean)event.getNewValue());
		}
		if (SrmViewsRepository.General.Properties.ownedPort == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedPortSettings, editingContext.getAdapterFactory());
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
				ownedPortSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedPortSettings.move(event.getNewIndex(), (ResourcePort) event.getNewValue());
			}
		}
		if (SrmViewsRepository.General.Properties.ownedConnector == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedConnectorSettings, editingContext.getAdapterFactory());
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
				ownedConnectorSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedConnectorSettings.move(event.getNewIndex(), (ResourceConnector) event.getNewValue());
			}
		}
		if (SrmViewsRepository.General.Properties.usedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceUsage) {
					usedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				usedBySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				usedBySettings.move(event.getNewIndex(), (ResourceUsage) event.getNewValue());
			}
		}
		if (SrmViewsRepository.General.Properties.managedResource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Resource) {
					managedResourceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				managedResourceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				managedResourceSettings.move(event.getNewIndex(), (Resource) event.getNewValue());
			}
		}
		if (SrmViewsRepository.General.Properties.memorySizeFootprint == event.getAffectedEditor()) {
			interruptResource.setMemorySizeFootprint((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.General.Properties.stateElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				interruptResource.getStateElements().clear();
				interruptResource.getStateElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.General.Properties.identifierElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				interruptResource.getIdentifierElements().clear();
				interruptResource.getIdentifierElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.General.Properties.adressSpace == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				adressSpaceSettings.setToReference((MemoryPartition)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				MemoryPartition eObject = SrmFactory.eINSTANCE.createMemoryPartition();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				adressSpaceSettings.setToReference(eObject);
			}
		}
		if (SrmViewsRepository.General.Properties.periodElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				interruptResource.getPeriodElements().clear();
				interruptResource.getPeriodElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.General.Properties.activationCapacity == event.getAffectedEditor()) {
			interruptResource.setActivationCapacity((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.General.Properties.sharedDataResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SharedDataComResource) {
					sharedDataResourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				sharedDataResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				sharedDataResourcesSettings.move(event.getNewIndex(), (SharedDataComResource) event.getNewValue());
			}
		}
		if (SrmViewsRepository.General.Properties.messageResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MessageComResource) {
					messageResourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				messageResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				messageResourcesSettings.move(event.getNewIndex(), (MessageComResource) event.getNewValue());
			}
		}
		if (SrmViewsRepository.General.Properties.notificationResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof NotificationResource) {
					notificationResourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				notificationResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				notificationResourcesSettings.move(event.getNewIndex(), (NotificationResource) event.getNewValue());
			}
		}
		if (SrmViewsRepository.General.Properties.entryPoints == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				interruptResource.getEntryPoints().clear();
				interruptResource.getEntryPoints().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.General.Properties.kind == event.getAffectedEditor()) {
			interruptResource.setKind((InterruptKind)event.getNewValue());
		}
		if (SrmViewsRepository.General.Properties.isrEntryPoints == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				interruptResource.getIsrEntryPoints().clear();
				interruptResource.getIsrEntryPoints().addAll(((EList) event.getNewValue()));
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
			GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			if (GrmPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.name)) {
				if (msg.getNewValue() != null) {
					generalPart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setName("");
				}
			}
			if (GrmPackage.eINSTANCE.getResource_OwnedResource().equals(msg.getFeature()) && isAccessible(SrmViewsRepository.General.Properties.ownedResource))
				generalPart.updateOwnedResource();
			if (GrmPackage.eINSTANCE.getResource_ResMult().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.resMult)) {
				if (msg.getNewValue() != null) {
					generalPart.setResMult(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setResMult("");
				}
			}
			if (GrmPackage.eINSTANCE.getResource_IsProtected().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.isProtected))
				generalPart.setIsProtected((Boolean)msg.getNewValue());
			
			if (GrmPackage.eINSTANCE.getResource_IsActive().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.isActive))
				generalPart.setIsActive((Boolean)msg.getNewValue());
			
			if (GrmPackage.eINSTANCE.getResource_OwnedPort().equals(msg.getFeature()) && isAccessible(SrmViewsRepository.General.Properties.ownedPort))
				generalPart.updateOwnedPort();
			if (GrmPackage.eINSTANCE.getResource_OwnedConnector().equals(msg.getFeature()) && isAccessible(SrmViewsRepository.General.Properties.ownedConnector))
				generalPart.updateOwnedConnector();
			if (GrmPackage.eINSTANCE.getResource_UsedBy().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.General.Properties.usedBy))
				generalPart.updateUsedBy();
			if (GrmPackage.eINSTANCE.getResourceManager_ManagedResource().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.General.Properties.managedResource))
				generalPart.updateManagedResource();
			if (SrmPackage.eINSTANCE.getSoftwareResource_MemorySizeFootprint().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.memorySizeFootprint)) {
				if (msg.getNewValue() != null) {
					generalPart.setMemorySizeFootprint(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setMemorySizeFootprint("");
				}
			}
			if (SrmPackage.eINSTANCE.getSoftwareResource_StateElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.stateElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					generalPart.setStateElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					generalPart.setStateElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					generalPart.setStateElements(newValueAsList);
				}
			}
			
			if (SrmPackage.eINSTANCE.getSoftwareResource_IdentifierElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.identifierElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					generalPart.setIdentifierElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					generalPart.setIdentifierElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					generalPart.setIdentifierElements(newValueAsList);
				}
			}
			
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_AdressSpace().equals(msg.getFeature()) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.adressSpace))
				generalPart.setAdressSpace((EObject)msg.getNewValue());
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PeriodElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.periodElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					generalPart.setPeriodElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					generalPart.setPeriodElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					generalPart.setPeriodElements(newValueAsList);
				}
			}
			
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ActivationCapacity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.activationCapacity)) {
				if (msg.getNewValue() != null) {
					generalPart.setActivationCapacity(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setActivationCapacity("");
				}
			}
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_SharedDataResources().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.General.Properties.sharedDataResources))
				generalPart.updateSharedDataResources();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_MessageResources().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.General.Properties.messageResources))
				generalPart.updateMessageResources();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_NotificationResources().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.General.Properties.notificationResources))
				generalPart.updateNotificationResources();
			if (SrmPackage.eINSTANCE.getSoftwareConcurrentResource_EntryPoints().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.entryPoints)) {
				if (msg.getNewValue() instanceof EList<?>) {
					generalPart.setEntryPoints((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					generalPart.setEntryPoints(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					generalPart.setEntryPoints(newValueAsList);
				}
			}
			
			if (SrmPackage.eINSTANCE.getInterruptResource_Kind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(SrmViewsRepository.General.Properties.kind))
				generalPart.setKind((InterruptKind)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getInterruptResource_IsrEntryPoints().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.isrEntryPoints)) {
				if (msg.getNewValue() instanceof EList<?>) {
					generalPart.setIsrEntryPoints((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					generalPart.setIsrEntryPoints(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					generalPart.setIsrEntryPoints(newValueAsList);
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
			GrmPackage.eINSTANCE.getNamedElement_Name(),
			GrmPackage.eINSTANCE.getResource_OwnedResource(),
			GrmPackage.eINSTANCE.getResource_ResMult(),
			GrmPackage.eINSTANCE.getResource_IsProtected(),
			GrmPackage.eINSTANCE.getResource_IsActive(),
			GrmPackage.eINSTANCE.getResource_OwnedPort(),
			GrmPackage.eINSTANCE.getResource_OwnedConnector(),
			GrmPackage.eINSTANCE.getResource_UsedBy(),
			GrmPackage.eINSTANCE.getResourceManager_ManagedResource(),
			SrmPackage.eINSTANCE.getSoftwareResource_MemorySizeFootprint(),
			SrmPackage.eINSTANCE.getSoftwareResource_StateElements(),
			SrmPackage.eINSTANCE.getSoftwareResource_IdentifierElements(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_AdressSpace(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PeriodElements(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ActivationCapacity(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_SharedDataResources(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_MessageResources(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_NotificationResources(),
			SrmPackage.eINSTANCE.getSoftwareConcurrentResource_EntryPoints(),
			SrmPackage.eINSTANCE.getInterruptResource_Kind(),
			SrmPackage.eINSTANCE.getInterruptResource_IsrEntryPoints()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.name || key == SrmViewsRepository.General.Properties.ownedResource || key == SrmViewsRepository.General.Properties.resMult || key == SrmViewsRepository.General.Properties.isProtected || key == SrmViewsRepository.General.Properties.isActive || key == SrmViewsRepository.General.Properties.ownedPort || key == SrmViewsRepository.General.Properties.ownedConnector || key == SrmViewsRepository.General.Properties.usedBy || key == SrmViewsRepository.General.Properties.managedResource || key == SrmViewsRepository.General.Properties.memorySizeFootprint || key == SrmViewsRepository.General.Properties.stateElements || key == SrmViewsRepository.General.Properties.identifierElements || key == SrmViewsRepository.General.Properties.adressSpace || key == SrmViewsRepository.General.Properties.periodElements || key == SrmViewsRepository.General.Properties.activationCapacity || key == SrmViewsRepository.General.Properties.sharedDataResources || key == SrmViewsRepository.General.Properties.messageResources || key == SrmViewsRepository.General.Properties.notificationResources || key == SrmViewsRepository.General.Properties.entryPoints || key == SrmViewsRepository.General.Properties.kind || key == SrmViewsRepository.General.Properties.isrEntryPoints || key == SrmViewsRepository.General.Properties.class;
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
				if (SrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.General.Properties.resMult == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getResource_ResMult().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getResource_ResMult().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.General.Properties.isProtected == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getResource_IsProtected().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getResource_IsProtected().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.General.Properties.isActive == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getResource_IsActive().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getResource_IsActive().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.General.Properties.memorySizeFootprint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getSoftwareResource_MemorySizeFootprint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareResource_MemorySizeFootprint().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.General.Properties.stateElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareResource_StateElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SrmViewsRepository.General.Properties.identifierElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareResource_IdentifierElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SrmViewsRepository.General.Properties.periodElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareConcurrentResource_PeriodElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SrmViewsRepository.General.Properties.activationCapacity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ActivationCapacity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareConcurrentResource_ActivationCapacity().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.General.Properties.entryPoints == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareConcurrentResource_EntryPoints().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SrmViewsRepository.General.Properties.kind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getInterruptResource_Kind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getInterruptResource_Kind().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.General.Properties.isrEntryPoints == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getInterruptResource_IsrEntryPoints().getEAttributeType(), iterator.next()));
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
