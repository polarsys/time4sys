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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.grm.StorageResource;
import org.polarsys.time4sys.marte.srm.MemoryPartition;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class MemoryPartitionOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for forkServices ReferencesTable
	 */
	private ReferencesTableSettings forkServicesSettings;
	
	/**
	 * Settings for exitServices ReferencesTable
	 */
	private ReferencesTableSettings exitServicesSettings;
	
	/**
	 * Settings for memorySpaces ReferencesTable
	 */
	private ReferencesTableSettings memorySpacesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MemoryPartitionOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject memoryPartition, String editing_mode) {
		super(editingContext, memoryPartition, editing_mode);
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
			
			final MemoryPartition memoryPartition = (MemoryPartition)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Other.Properties.pServices)) {
				pServicesSettings = new ReferencesTableSettings(memoryPartition, GrmPackage.eINSTANCE.getResource_PServices());
				otherPart.initPServices(pServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.rServices)) {
				rServicesSettings = new ReferencesTableSettings(memoryPartition, GrmPackage.eINSTANCE.getResource_RServices());
				otherPart.initRServices(rServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.createServices)) {
				createServicesSettings = new ReferencesTableSettings(memoryPartition, SrmPackage.eINSTANCE.getSoftwareResource_CreateServices());
				otherPart.initCreateServices(createServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.deleteServices)) {
				deleteServicesSettings = new ReferencesTableSettings(memoryPartition, SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices());
				otherPart.initDeleteServices(deleteServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.initializeServices)) {
				initializeServicesSettings = new ReferencesTableSettings(memoryPartition, SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices());
				otherPart.initInitializeServices(initializeServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.forkServices)) {
				forkServicesSettings = new ReferencesTableSettings(memoryPartition, SrmPackage.eINSTANCE.getMemoryPartition_ForkServices());
				otherPart.initForkServices(forkServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.exitServices)) {
				exitServicesSettings = new ReferencesTableSettings(memoryPartition, SrmPackage.eINSTANCE.getMemoryPartition_ExitServices());
				otherPart.initExitServices(exitServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.memorySpaces)) {
				memorySpacesSettings = new ReferencesTableSettings(memoryPartition, SrmPackage.eINSTANCE.getMemoryPartition_MemorySpaces());
				otherPart.initMemorySpaces(memorySpacesSettings);
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
			if (isAccessible(SrmViewsRepository.Other.Properties.forkServices)) {
				otherPart.addFilterToForkServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for forkServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.exitServices)) {
				otherPart.addFilterToExitServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for exitServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.memorySpaces)) {
				otherPart.addFilterToMemorySpaces(new EObjectFilter(GrmPackage.Literals.STORAGE_RESOURCE));
				// Start of user code for additional businessfilters for memorySpaces
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
		if (editorKey == SrmViewsRepository.Other.Properties.forkServices) {
			return SrmPackage.eINSTANCE.getMemoryPartition_ForkServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.exitServices) {
			return SrmPackage.eINSTANCE.getMemoryPartition_ExitServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.memorySpaces) {
			return SrmPackage.eINSTANCE.getMemoryPartition_MemorySpaces();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MemoryPartition memoryPartition = (MemoryPartition)semanticObject;
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
		if (SrmViewsRepository.Other.Properties.forkServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					forkServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				forkServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				forkServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.exitServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					exitServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				exitServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				exitServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.memorySpaces == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof StorageResource) {
					memorySpacesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				memorySpacesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				memorySpacesSettings.move(event.getNewIndex(), (StorageResource) event.getNewValue());
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
			if (SrmPackage.eINSTANCE.getMemoryPartition_ForkServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.forkServices))
				otherPart.updateForkServices();
			if (SrmPackage.eINSTANCE.getMemoryPartition_ExitServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.exitServices))
				otherPart.updateExitServices();
			if (SrmPackage.eINSTANCE.getMemoryPartition_MemorySpaces().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.memorySpaces))
				otherPart.updateMemorySpaces();
			
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
			GrmPackage.eINSTANCE.getResource_PServices(),
			GrmPackage.eINSTANCE.getResource_RServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_CreateServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices(),
			SrmPackage.eINSTANCE.getMemoryPartition_ForkServices(),
			SrmPackage.eINSTANCE.getMemoryPartition_ExitServices(),
			SrmPackage.eINSTANCE.getMemoryPartition_MemorySpaces()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Other.Properties.pServices || key == SrmViewsRepository.Other.Properties.rServices || key == SrmViewsRepository.Other.Properties.createServices || key == SrmViewsRepository.Other.Properties.deleteServices || key == SrmViewsRepository.Other.Properties.initializeServices || key == SrmViewsRepository.Other.Properties.forkServices || key == SrmViewsRepository.Other.Properties.exitServices || key == SrmViewsRepository.Other.Properties.memorySpaces || key == SrmViewsRepository.Other.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.managedResource || key == SrmViewsRepository.Timing.Properties.resCtrlPolicy || key == SrmViewsRepository.Timing.Properties.concurrentResources;
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
