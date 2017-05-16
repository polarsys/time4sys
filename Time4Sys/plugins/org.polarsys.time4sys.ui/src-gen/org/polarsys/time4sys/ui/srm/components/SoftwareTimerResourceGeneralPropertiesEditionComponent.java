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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.ResourceUsage;

import org.polarsys.time4sys.marte.srm.SoftwareTimerResource;

import org.polarsys.time4sys.ui.views.srm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class SoftwareTimerResourceGeneralPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for start EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings startSettings;
	
	/**
	 * Settings for set EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings setSettings;
	
	/**
	 * Settings for get EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings getSettings;
	
	/**
	 * Settings for reset EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings resetSettings;
	
	/**
	 * Settings for pause EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings pauseSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoftwareTimerResourceGeneralPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject softwareTimerResource, String editing_mode) {
		super(editingContext, softwareTimerResource, editing_mode);
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
			
			final SoftwareTimerResource softwareTimerResource = (SoftwareTimerResource)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.General.Properties.name))
				generalPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, softwareTimerResource.getName()));
			
			if (isAccessible(SrmViewsRepository.General.Properties.ownedResource)) {
				ownedResourceSettings = new ReferencesTableSettings(softwareTimerResource, GrmPackage.eINSTANCE.getResource_OwnedResource());
				generalPart.initOwnedResource(ownedResourceSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.resMult)) {
				generalPart.setResMult(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, softwareTimerResource.getResMult()));
			}
			
			if (isAccessible(SrmViewsRepository.General.Properties.isProtected)) {
				generalPart.setIsProtected(softwareTimerResource.isIsProtected());
			}
			if (isAccessible(SrmViewsRepository.General.Properties.isActive)) {
				generalPart.setIsActive(softwareTimerResource.isIsActive());
			}
			if (isAccessible(SrmViewsRepository.General.Properties.ownedPort)) {
				ownedPortSettings = new ReferencesTableSettings(softwareTimerResource, GrmPackage.eINSTANCE.getResource_OwnedPort());
				generalPart.initOwnedPort(ownedPortSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.ownedConnector)) {
				ownedConnectorSettings = new ReferencesTableSettings(softwareTimerResource, GrmPackage.eINSTANCE.getResource_OwnedConnector());
				generalPart.initOwnedConnector(ownedConnectorSettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.usedBy)) {
				usedBySettings = new ReferencesTableSettings(softwareTimerResource, GrmPackage.eINSTANCE.getResource_UsedBy());
				generalPart.initUsedBy(usedBySettings);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.start)) {
				// init part
				startSettings = new EObjectFlatComboSettings(softwareTimerResource, GrmPackage.eINSTANCE.getTimerResource_Start());
				generalPart.initStart(startSettings);
				// set the button mode
				generalPart.setStartButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.set)) {
				// init part
				setSettings = new EObjectFlatComboSettings(softwareTimerResource, GrmPackage.eINSTANCE.getTimerResource_Set());
				generalPart.initSet(setSettings);
				// set the button mode
				generalPart.setSetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.get)) {
				// init part
				getSettings = new EObjectFlatComboSettings(softwareTimerResource, GrmPackage.eINSTANCE.getTimerResource_Get());
				generalPart.initGet(getSettings);
				// set the button mode
				generalPart.setGetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.reset)) {
				// init part
				resetSettings = new EObjectFlatComboSettings(softwareTimerResource, GrmPackage.eINSTANCE.getTimerResource_Reset());
				generalPart.initReset(resetSettings);
				// set the button mode
				generalPart.setResetButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SrmViewsRepository.General.Properties.pause)) {
				// init part
				pauseSettings = new EObjectFlatComboSettings(softwareTimerResource, GrmPackage.eINSTANCE.getTimerResource_Pause());
				generalPart.initPause(pauseSettings);
				// set the button mode
				generalPart.setPauseButtonMode(ButtonsModeEnum.BROWSE);
			}
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
			if (isAccessible(SrmViewsRepository.General.Properties.start)) {
				generalPart.addFilterToStart(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ResourceService);
					}
					
				});
				// Start of user code for additional businessfilters for start
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.General.Properties.set)) {
				generalPart.addFilterToSet(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ResourceService);
					}
					
				});
				// Start of user code for additional businessfilters for set
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.General.Properties.get)) {
				generalPart.addFilterToGet(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ResourceService);
					}
					
				});
				// Start of user code for additional businessfilters for get
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.General.Properties.reset)) {
				generalPart.addFilterToReset(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ResourceService);
					}
					
				});
				// Start of user code for additional businessfilters for reset
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.General.Properties.pause)) {
				generalPart.addFilterToPause(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ResourceService);
					}
					
				});
				// Start of user code for additional businessfilters for pause
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
		if (editorKey == SrmViewsRepository.General.Properties.start) {
			return GrmPackage.eINSTANCE.getTimerResource_Start();
		}
		if (editorKey == SrmViewsRepository.General.Properties.set) {
			return GrmPackage.eINSTANCE.getTimerResource_Set();
		}
		if (editorKey == SrmViewsRepository.General.Properties.get) {
			return GrmPackage.eINSTANCE.getTimerResource_Get();
		}
		if (editorKey == SrmViewsRepository.General.Properties.reset) {
			return GrmPackage.eINSTANCE.getTimerResource_Reset();
		}
		if (editorKey == SrmViewsRepository.General.Properties.pause) {
			return GrmPackage.eINSTANCE.getTimerResource_Pause();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoftwareTimerResource softwareTimerResource = (SoftwareTimerResource)semanticObject;
		if (SrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
			softwareTimerResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
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
			softwareTimerResource.setResMult((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.General.Properties.isProtected == event.getAffectedEditor()) {
			softwareTimerResource.setIsProtected((Boolean)event.getNewValue());
		}
		if (SrmViewsRepository.General.Properties.isActive == event.getAffectedEditor()) {
			softwareTimerResource.setIsActive((Boolean)event.getNewValue());
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
		if (SrmViewsRepository.General.Properties.start == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				startSettings.setToReference((ResourceService)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ResourceService eObject = GrmFactory.eINSTANCE.createResourceService();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				startSettings.setToReference(eObject);
			}
		}
		if (SrmViewsRepository.General.Properties.set == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				setSettings.setToReference((ResourceService)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ResourceService eObject = GrmFactory.eINSTANCE.createResourceService();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				setSettings.setToReference(eObject);
			}
		}
		if (SrmViewsRepository.General.Properties.get == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				getSettings.setToReference((ResourceService)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ResourceService eObject = GrmFactory.eINSTANCE.createResourceService();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				getSettings.setToReference(eObject);
			}
		}
		if (SrmViewsRepository.General.Properties.reset == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				resetSettings.setToReference((ResourceService)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ResourceService eObject = GrmFactory.eINSTANCE.createResourceService();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				resetSettings.setToReference(eObject);
			}
		}
		if (SrmViewsRepository.General.Properties.pause == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				pauseSettings.setToReference((ResourceService)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ResourceService eObject = GrmFactory.eINSTANCE.createResourceService();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				pauseSettings.setToReference(eObject);
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
			if (GrmPackage.eINSTANCE.getTimerResource_Start().equals(msg.getFeature()) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.start))
				generalPart.setStart((EObject)msg.getNewValue());
			if (GrmPackage.eINSTANCE.getTimerResource_Set().equals(msg.getFeature()) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.set))
				generalPart.setSet((EObject)msg.getNewValue());
			if (GrmPackage.eINSTANCE.getTimerResource_Get().equals(msg.getFeature()) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.get))
				generalPart.setGet((EObject)msg.getNewValue());
			if (GrmPackage.eINSTANCE.getTimerResource_Reset().equals(msg.getFeature()) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.reset))
				generalPart.setReset((EObject)msg.getNewValue());
			if (GrmPackage.eINSTANCE.getTimerResource_Pause().equals(msg.getFeature()) && generalPart != null && isAccessible(SrmViewsRepository.General.Properties.pause))
				generalPart.setPause((EObject)msg.getNewValue());
			
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
			GrmPackage.eINSTANCE.getTimerResource_Start(),
			GrmPackage.eINSTANCE.getTimerResource_Set(),
			GrmPackage.eINSTANCE.getTimerResource_Get(),
			GrmPackage.eINSTANCE.getTimerResource_Reset(),
			GrmPackage.eINSTANCE.getTimerResource_Pause()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.name || key == SrmViewsRepository.General.Properties.ownedResource || key == SrmViewsRepository.General.Properties.resMult || key == SrmViewsRepository.General.Properties.isProtected || key == SrmViewsRepository.General.Properties.isActive || key == SrmViewsRepository.General.Properties.ownedPort || key == SrmViewsRepository.General.Properties.ownedConnector || key == SrmViewsRepository.General.Properties.usedBy || key == SrmViewsRepository.General.Properties.start || key == SrmViewsRepository.General.Properties.set || key == SrmViewsRepository.General.Properties.get || key == SrmViewsRepository.General.Properties.reset || key == SrmViewsRepository.General.Properties.pause || key == SrmViewsRepository.General.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.start || key == SrmViewsRepository.General.Properties.set || key == SrmViewsRepository.General.Properties.get || key == SrmViewsRepository.General.Properties.reset || key == SrmViewsRepository.General.Properties.pause;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
