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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
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
import org.polarsys.time4sys.marte.srm.MemoryBroker;
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class MemoryBrokerOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for lockServices ReferencesTable
	 */
	private ReferencesTableSettings lockServicesSettings;
	
	/**
	 * Settings for unlockServices ReferencesTable
	 */
	private ReferencesTableSettings unlockServicesSettings;
	
	/**
	 * Settings for mapServices ReferencesTable
	 */
	private ReferencesTableSettings mapServicesSettings;
	
	/**
	 * Settings for unmapServices ReferencesTable
	 */
	private ReferencesTableSettings unmapServicesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public MemoryBrokerOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject memoryBroker, String editing_mode) {
		super(editingContext, memoryBroker, editing_mode);
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
			
			final MemoryBroker memoryBroker = (MemoryBroker)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Other.Properties.pServices)) {
				pServicesSettings = new ReferencesTableSettings(memoryBroker, GrmPackage.eINSTANCE.getResource_PServices());
				otherPart.initPServices(pServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.rServices)) {
				rServicesSettings = new ReferencesTableSettings(memoryBroker, GrmPackage.eINSTANCE.getResource_RServices());
				otherPart.initRServices(rServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.createServices)) {
				createServicesSettings = new ReferencesTableSettings(memoryBroker, SrmPackage.eINSTANCE.getSoftwareResource_CreateServices());
				otherPart.initCreateServices(createServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.deleteServices)) {
				deleteServicesSettings = new ReferencesTableSettings(memoryBroker, SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices());
				otherPart.initDeleteServices(deleteServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.initializeServices)) {
				initializeServicesSettings = new ReferencesTableSettings(memoryBroker, SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices());
				otherPart.initInitializeServices(initializeServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.lockServices)) {
				lockServicesSettings = new ReferencesTableSettings(memoryBroker, SrmPackage.eINSTANCE.getMemoryBroker_LockServices());
				otherPart.initLockServices(lockServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.unlockServices)) {
				unlockServicesSettings = new ReferencesTableSettings(memoryBroker, SrmPackage.eINSTANCE.getMemoryBroker_UnlockServices());
				otherPart.initUnlockServices(unlockServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.mapServices)) {
				mapServicesSettings = new ReferencesTableSettings(memoryBroker, SrmPackage.eINSTANCE.getMemoryBroker_MapServices());
				otherPart.initMapServices(mapServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.unmapServices)) {
				unmapServicesSettings = new ReferencesTableSettings(memoryBroker, SrmPackage.eINSTANCE.getMemoryBroker_UnmapServices());
				otherPart.initUnmapServices(unmapServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.memoryBlockAddressElements))
				otherPart.setMemoryBlockAddressElements(memoryBroker.getMemoryBlockAddressElements());
			
			if (isAccessible(SrmViewsRepository.Other.Properties.memoryBlockSizeElements))
				otherPart.setMemoryBlockSizeElements(memoryBroker.getMemoryBlockSizeElements());
			
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
			if (isAccessible(SrmViewsRepository.Other.Properties.lockServices)) {
				otherPart.addFilterToLockServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for lockServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.unlockServices)) {
				otherPart.addFilterToUnlockServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for unlockServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.mapServices)) {
				otherPart.addFilterToMapServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for mapServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.unmapServices)) {
				otherPart.addFilterToUnmapServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for unmapServices
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
		if (editorKey == SrmViewsRepository.Other.Properties.lockServices) {
			return SrmPackage.eINSTANCE.getMemoryBroker_LockServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.unlockServices) {
			return SrmPackage.eINSTANCE.getMemoryBroker_UnlockServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.mapServices) {
			return SrmPackage.eINSTANCE.getMemoryBroker_MapServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.unmapServices) {
			return SrmPackage.eINSTANCE.getMemoryBroker_UnmapServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.memoryBlockAddressElements) {
			return SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockAddressElements();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.memoryBlockSizeElements) {
			return SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockSizeElements();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MemoryBroker memoryBroker = (MemoryBroker)semanticObject;
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
		if (SrmViewsRepository.Other.Properties.lockServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					lockServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				lockServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				lockServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.unlockServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					unlockServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				unlockServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				unlockServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.mapServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					mapServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				mapServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				mapServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.unmapServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					unmapServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				unmapServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				unmapServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.memoryBlockAddressElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				memoryBroker.getMemoryBlockAddressElements().clear();
				memoryBroker.getMemoryBlockAddressElements().addAll(((EList) event.getNewValue()));
			}
		}
		if (SrmViewsRepository.Other.Properties.memoryBlockSizeElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				memoryBroker.getMemoryBlockSizeElements().clear();
				memoryBroker.getMemoryBlockSizeElements().addAll(((EList) event.getNewValue()));
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
			if (SrmPackage.eINSTANCE.getMemoryBroker_LockServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.lockServices))
				otherPart.updateLockServices();
			if (SrmPackage.eINSTANCE.getMemoryBroker_UnlockServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.unlockServices))
				otherPart.updateUnlockServices();
			if (SrmPackage.eINSTANCE.getMemoryBroker_MapServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.mapServices))
				otherPart.updateMapServices();
			if (SrmPackage.eINSTANCE.getMemoryBroker_UnmapServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.unmapServices))
				otherPart.updateUnmapServices();
			if (SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockAddressElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.memoryBlockAddressElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					otherPart.setMemoryBlockAddressElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					otherPart.setMemoryBlockAddressElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					otherPart.setMemoryBlockAddressElements(newValueAsList);
				}
			}
			
			if (SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockSizeElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.memoryBlockSizeElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					otherPart.setMemoryBlockSizeElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					otherPart.setMemoryBlockSizeElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					otherPart.setMemoryBlockSizeElements(newValueAsList);
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
			GrmPackage.eINSTANCE.getResource_PServices(),
			GrmPackage.eINSTANCE.getResource_RServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_CreateServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices(),
			SrmPackage.eINSTANCE.getMemoryBroker_LockServices(),
			SrmPackage.eINSTANCE.getMemoryBroker_UnlockServices(),
			SrmPackage.eINSTANCE.getMemoryBroker_MapServices(),
			SrmPackage.eINSTANCE.getMemoryBroker_UnmapServices(),
			SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockAddressElements(),
			SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockSizeElements()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Other.Properties.pServices || key == SrmViewsRepository.Other.Properties.rServices || key == SrmViewsRepository.Other.Properties.createServices || key == SrmViewsRepository.Other.Properties.deleteServices || key == SrmViewsRepository.Other.Properties.initializeServices || key == SrmViewsRepository.Other.Properties.lockServices || key == SrmViewsRepository.Other.Properties.unlockServices || key == SrmViewsRepository.Other.Properties.mapServices || key == SrmViewsRepository.Other.Properties.unmapServices || key == SrmViewsRepository.Other.Properties.memoryBlockAddressElements || key == SrmViewsRepository.Other.Properties.memoryBlockSizeElements || key == SrmViewsRepository.Other.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.brokedResource || key == SrmViewsRepository.Timing.Properties.accCtrlPolicy || key == SrmViewsRepository.General.Properties.managedResource || key == SrmViewsRepository.Timing.Properties.resCtrlPolicy;
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
				if (SrmViewsRepository.Other.Properties.memoryBlockAddressElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockAddressElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (SrmViewsRepository.Other.Properties.memoryBlockSizeElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockSizeElements().getEAttributeType(), iterator.next()));
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
