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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceUsage;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.TransmModeKind;
import org.polarsys.time4sys.ui.views.grm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class CommunicationMediaGeneralPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for mainScheduler EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings mainSchedulerSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CommunicationMediaGeneralPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject communicationMedia, String editing_mode) {
		super(editingContext, communicationMedia, editing_mode);
		parts = new String[] { GENERAL_PART };
		repositoryKey = GrmViewsRepository.class;
		partKey = GrmViewsRepository.General.class;
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
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GrmViewsRepository.General.Properties.name))
				generalPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, communicationMedia.getName()));
			
			if (isAccessible(GrmViewsRepository.General.Properties.ownedResource)) {
				ownedResourceSettings = new ReferencesTableSettings(communicationMedia, GrmPackage.eINSTANCE.getResource_OwnedResource());
				generalPart.initOwnedResource(ownedResourceSettings);
			}
			if (isAccessible(GrmViewsRepository.General.Properties.resMult)) {
				generalPart.setResMult(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, communicationMedia.getResMult()));
			}
			
			if (isAccessible(GrmViewsRepository.General.Properties.isProtected)) {
				generalPart.setIsProtected(communicationMedia.isIsProtected());
			}
			if (isAccessible(GrmViewsRepository.General.Properties.isActive)) {
				generalPart.setIsActive(communicationMedia.isIsActive());
			}
			if (isAccessible(GrmViewsRepository.General.Properties.ownedPort)) {
				ownedPortSettings = new ReferencesTableSettings(communicationMedia, GrmPackage.eINSTANCE.getResource_OwnedPort());
				generalPart.initOwnedPort(ownedPortSettings);
			}
			if (isAccessible(GrmViewsRepository.General.Properties.ownedConnector)) {
				ownedConnectorSettings = new ReferencesTableSettings(communicationMedia, GrmPackage.eINSTANCE.getResource_OwnedConnector());
				generalPart.initOwnedConnector(ownedConnectorSettings);
			}
			if (isAccessible(GrmViewsRepository.General.Properties.usedBy)) {
				usedBySettings = new ReferencesTableSettings(communicationMedia, GrmPackage.eINSTANCE.getResource_UsedBy());
				generalPart.initUsedBy(usedBySettings);
			}
			if (isAccessible(GrmViewsRepository.General.Properties.speedFactor)) {
				generalPart.setSpeedFactor(EEFConverterUtil.convertToString(EcorePackage.Literals.EFLOAT, communicationMedia.getSpeedFactor()));
			}
			
			if (isAccessible(GrmViewsRepository.General.Properties.mainScheduler)) {
				// init part
				mainSchedulerSettings = new EObjectFlatComboSettings(communicationMedia, GrmPackage.eINSTANCE.getProcessingResource_MainScheduler());
				generalPart.initMainScheduler(mainSchedulerSettings);
				// set the button mode
				generalPart.setMainSchedulerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GrmViewsRepository.General.Properties.elementSize)) {
				generalPart.setElementSize(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, communicationMedia.getElementSize()));
			}
			
			if (isAccessible(GrmViewsRepository.General.Properties.transmMode)) {
				generalPart.initTransmMode(EEFUtils.choiceOfValues(communicationMedia, GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode()), communicationMedia.getTransmMode());
			}
			// init filters
			
			if (isAccessible(GrmViewsRepository.General.Properties.ownedResource)) {
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
			
			
			
			if (isAccessible(GrmViewsRepository.General.Properties.ownedPort)) {
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
			if (isAccessible(GrmViewsRepository.General.Properties.ownedConnector)) {
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
			if (isAccessible(GrmViewsRepository.General.Properties.usedBy)) {
				generalPart.addFilterToUsedBy(new EObjectFilter(GrmPackage.Literals.RESOURCE_USAGE));
				// Start of user code for additional businessfilters for usedBy
				// End of user code
			}
			
			if (isAccessible(GrmViewsRepository.General.Properties.mainScheduler)) {
				generalPart.addFilterToMainScheduler(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Scheduler); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for mainScheduler
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
		if (editorKey == GrmViewsRepository.General.Properties.name) {
			return EcorePackage.eINSTANCE.getENamedElement_Name();
		}
		if (editorKey == GrmViewsRepository.General.Properties.ownedResource) {
			return GrmPackage.eINSTANCE.getResource_OwnedResource();
		}
		if (editorKey == GrmViewsRepository.General.Properties.resMult) {
			return GrmPackage.eINSTANCE.getResource_ResMult();
		}
		if (editorKey == GrmViewsRepository.General.Properties.isProtected) {
			return GrmPackage.eINSTANCE.getResource_IsProtected();
		}
		if (editorKey == GrmViewsRepository.General.Properties.isActive) {
			return GrmPackage.eINSTANCE.getResource_IsActive();
		}
		if (editorKey == GrmViewsRepository.General.Properties.ownedPort) {
			return GrmPackage.eINSTANCE.getResource_OwnedPort();
		}
		if (editorKey == GrmViewsRepository.General.Properties.ownedConnector) {
			return GrmPackage.eINSTANCE.getResource_OwnedConnector();
		}
		if (editorKey == GrmViewsRepository.General.Properties.usedBy) {
			return GrmPackage.eINSTANCE.getResource_UsedBy();
		}
		if (editorKey == GrmViewsRepository.General.Properties.speedFactor) {
			return GrmPackage.eINSTANCE.getProcessingResource_SpeedFactor();
		}
		if (editorKey == GrmViewsRepository.General.Properties.mainScheduler) {
			return GrmPackage.eINSTANCE.getProcessingResource_MainScheduler();
		}
		if (editorKey == GrmViewsRepository.General.Properties.elementSize) {
			return GrmPackage.eINSTANCE.getCommunicationMedia_ElementSize();
		}
		if (editorKey == GrmViewsRepository.General.Properties.transmMode) {
			return GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode();
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
		if (GrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
			communicationMedia.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (GrmViewsRepository.General.Properties.ownedResource == event.getAffectedEditor()) {
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
		if (GrmViewsRepository.General.Properties.resMult == event.getAffectedEditor()) {
			communicationMedia.setResMult((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (GrmViewsRepository.General.Properties.isProtected == event.getAffectedEditor()) {
			communicationMedia.setIsProtected((Boolean)event.getNewValue());
		}
		if (GrmViewsRepository.General.Properties.isActive == event.getAffectedEditor()) {
			communicationMedia.setIsActive((Boolean)event.getNewValue());
		}
		if (GrmViewsRepository.General.Properties.ownedPort == event.getAffectedEditor()) {
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
		if (GrmViewsRepository.General.Properties.ownedConnector == event.getAffectedEditor()) {
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
		if (GrmViewsRepository.General.Properties.usedBy == event.getAffectedEditor()) {
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
		if (GrmViewsRepository.General.Properties.speedFactor == event.getAffectedEditor()) {
			communicationMedia.setSpeedFactor((EEFConverterUtil.createFloatFromString(EcorePackage.Literals.EFLOAT, (String)event.getNewValue())));
		}
		if (GrmViewsRepository.General.Properties.mainScheduler == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				mainSchedulerSettings.setToReference((Scheduler)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Scheduler eObject = GrmFactory.eINSTANCE.createScheduler();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				mainSchedulerSettings.setToReference(eObject);
			}
		}
		if (GrmViewsRepository.General.Properties.elementSize == event.getAffectedEditor()) {
			communicationMedia.setElementSize((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (GrmViewsRepository.General.Properties.transmMode == event.getAffectedEditor()) {
			communicationMedia.setTransmMode((TransmModeKind)event.getNewValue());
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
			if (EcorePackage.eINSTANCE.getENamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.name)) {
				if (msg.getNewValue() != null) {
					generalPart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setName("");
				}
			}
			if (GrmPackage.eINSTANCE.getResource_OwnedResource().equals(msg.getFeature()) && isAccessible(GrmViewsRepository.General.Properties.ownedResource))
				generalPart.updateOwnedResource();
			if (GrmPackage.eINSTANCE.getResource_ResMult().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.resMult)) {
				if (msg.getNewValue() != null) {
					generalPart.setResMult(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setResMult("");
				}
			}
			if (GrmPackage.eINSTANCE.getResource_IsProtected().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.isProtected))
				generalPart.setIsProtected((Boolean)msg.getNewValue());
			
			if (GrmPackage.eINSTANCE.getResource_IsActive().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.isActive))
				generalPart.setIsActive((Boolean)msg.getNewValue());
			
			if (GrmPackage.eINSTANCE.getResource_OwnedPort().equals(msg.getFeature()) && isAccessible(GrmViewsRepository.General.Properties.ownedPort))
				generalPart.updateOwnedPort();
			if (GrmPackage.eINSTANCE.getResource_OwnedConnector().equals(msg.getFeature()) && isAccessible(GrmViewsRepository.General.Properties.ownedConnector))
				generalPart.updateOwnedConnector();
			if (GrmPackage.eINSTANCE.getResource_UsedBy().equals(msg.getFeature())  && isAccessible(GrmViewsRepository.General.Properties.usedBy))
				generalPart.updateUsedBy();
			if (GrmPackage.eINSTANCE.getProcessingResource_SpeedFactor().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.speedFactor)) {
				if (msg.getNewValue() != null) {
					generalPart.setSpeedFactor(EcoreUtil.convertToString(EcorePackage.Literals.EFLOAT, msg.getNewValue()));
				} else {
					generalPart.setSpeedFactor("");
				}
			}
			if (GrmPackage.eINSTANCE.getProcessingResource_MainScheduler().equals(msg.getFeature()) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.mainScheduler))
				generalPart.setMainScheduler((EObject)msg.getNewValue());
			if (GrmPackage.eINSTANCE.getCommunicationMedia_ElementSize().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GrmViewsRepository.General.Properties.elementSize)) {
				if (msg.getNewValue() != null) {
					generalPart.setElementSize(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setElementSize("");
				}
			}
			if (GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(GrmViewsRepository.General.Properties.transmMode))
				generalPart.setTransmMode((TransmModeKind)msg.getNewValue());
			
			
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
			EcorePackage.eINSTANCE.getENamedElement_Name(),
			GrmPackage.eINSTANCE.getResource_OwnedResource(),
			GrmPackage.eINSTANCE.getResource_ResMult(),
			GrmPackage.eINSTANCE.getResource_IsProtected(),
			GrmPackage.eINSTANCE.getResource_IsActive(),
			GrmPackage.eINSTANCE.getResource_OwnedPort(),
			GrmPackage.eINSTANCE.getResource_OwnedConnector(),
			GrmPackage.eINSTANCE.getResource_UsedBy(),
			GrmPackage.eINSTANCE.getProcessingResource_SpeedFactor(),
			GrmPackage.eINSTANCE.getProcessingResource_MainScheduler(),
			GrmPackage.eINSTANCE.getCommunicationMedia_ElementSize(),
			GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GrmViewsRepository.General.Properties.name || key == GrmViewsRepository.General.Properties.ownedResource || key == GrmViewsRepository.General.Properties.resMult || key == GrmViewsRepository.General.Properties.isProtected || key == GrmViewsRepository.General.Properties.isActive || key == GrmViewsRepository.General.Properties.ownedPort || key == GrmViewsRepository.General.Properties.ownedConnector || key == GrmViewsRepository.General.Properties.usedBy || key == GrmViewsRepository.General.Properties.speedFactor || key == GrmViewsRepository.General.Properties.mainScheduler || key == GrmViewsRepository.General.Properties.elementSize || key == GrmViewsRepository.General.Properties.transmMode || key == GrmViewsRepository.General.Properties.class;
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
				if (GrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getENamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EcorePackage.eINSTANCE.getENamedElement_Name().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.General.Properties.resMult == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getResource_ResMult().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getResource_ResMult().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.General.Properties.isProtected == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getResource_IsProtected().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getResource_IsProtected().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.General.Properties.isActive == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getResource_IsActive().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getResource_IsActive().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.General.Properties.speedFactor == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getProcessingResource_SpeedFactor().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getProcessingResource_SpeedFactor().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.General.Properties.elementSize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationMedia_ElementSize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationMedia_ElementSize().getEAttributeType(), newValue);
				}
				if (GrmViewsRepository.General.Properties.transmMode == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationMedia_TransmMode().getEAttributeType(), newValue);
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
