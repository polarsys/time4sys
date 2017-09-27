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
package org.polarsys.time4sys.ui.hrm.components;

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
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourceConnector;
import org.polarsys.time4sys.marte.grm.ResourceUsage;
import org.polarsys.time4sys.marte.hrm.HardwareDrive;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.ui.views.hrm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class HardwareDriveGeneralPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	/**
	 * Settings for ownedResource ReferencesTable
	 */
	protected ReferencesTableSettings ownedResourceSettings;
	
	/**
	 * Settings for ownedConnector ReferencesTable
	 */
	protected ReferencesTableSettings ownedConnectorSettings;
	
	/**
	 * Settings for usedBy ReferencesTable
	 */
	private ReferencesTableSettings usedBySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HardwareDriveGeneralPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareDrive, String editing_mode) {
		super(editingContext, hardwareDrive, editing_mode);
		parts = new String[] { GENERAL_PART };
		repositoryKey = HrmViewsRepository.class;
		partKey = HrmViewsRepository.General.class;
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
			
			final HardwareDrive hardwareDrive = (HardwareDrive)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HrmViewsRepository.General.Properties.name))
				generalPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, hardwareDrive.getName()));
			
			if (isAccessible(HrmViewsRepository.General.Properties.ownedResource)) {
				ownedResourceSettings = new ReferencesTableSettings(hardwareDrive, GrmPackage.eINSTANCE.getResource_OwnedResource());
				generalPart.initOwnedResource(ownedResourceSettings);
			}
			if (isAccessible(HrmViewsRepository.General.Properties.resMult)) {
				generalPart.setResMult(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareDrive.getResMult()));
			}
			
			if (isAccessible(HrmViewsRepository.General.Properties.isProtected)) {
				generalPart.setIsProtected(hardwareDrive.isIsProtected());
			}
			if (isAccessible(HrmViewsRepository.General.Properties.isActive)) {
				generalPart.setIsActive(hardwareDrive.isIsActive());
			}
			if (isAccessible(HrmViewsRepository.General.Properties.ownedConnector)) {
				ownedConnectorSettings = new ReferencesTableSettings(hardwareDrive, GrmPackage.eINSTANCE.getResource_OwnedConnector());
				generalPart.initOwnedConnector(ownedConnectorSettings);
			}
			if (isAccessible(HrmViewsRepository.General.Properties.usedBy)) {
				usedBySettings = new ReferencesTableSettings(hardwareDrive, GrmPackage.eINSTANCE.getResource_UsedBy());
				generalPart.initUsedBy(usedBySettings);
			}
			if (isAccessible(HrmViewsRepository.General.Properties.memorySize)) {
				generalPart.setMemorySize(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareDrive.getMemorySize()));
			}
			
			if (isAccessible(HrmViewsRepository.General.Properties.addressSize)) {
				generalPart.setAddressSize(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareDrive.getAddressSize()));
			}
			
			if (isAccessible(HrmViewsRepository.General.Properties.throughput)) {
				generalPart.setThroughput(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareDrive.getThroughput()));
			}
			
			// init filters
			
			if (isAccessible(HrmViewsRepository.General.Properties.ownedResource)) {
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
			
			
			
			if (isAccessible(HrmViewsRepository.General.Properties.ownedConnector)) {
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
			if (isAccessible(HrmViewsRepository.General.Properties.usedBy)) {
				generalPart.addFilterToUsedBy(new EObjectFilter(GrmPackage.Literals.RESOURCE_USAGE));
				// Start of user code for additional businessfilters for usedBy
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
		if (editorKey == HrmViewsRepository.General.Properties.name) {
			return EcorePackage.eINSTANCE.getENamedElement_Name();
		}
		if (editorKey == HrmViewsRepository.General.Properties.ownedResource) {
			return GrmPackage.eINSTANCE.getResource_OwnedResource();
		}
		if (editorKey == HrmViewsRepository.General.Properties.resMult) {
			return GrmPackage.eINSTANCE.getResource_ResMult();
		}
		if (editorKey == HrmViewsRepository.General.Properties.isProtected) {
			return GrmPackage.eINSTANCE.getResource_IsProtected();
		}
		if (editorKey == HrmViewsRepository.General.Properties.isActive) {
			return GrmPackage.eINSTANCE.getResource_IsActive();
		}
		if (editorKey == HrmViewsRepository.General.Properties.ownedConnector) {
			return GrmPackage.eINSTANCE.getResource_OwnedConnector();
		}
		if (editorKey == HrmViewsRepository.General.Properties.usedBy) {
			return GrmPackage.eINSTANCE.getResource_UsedBy();
		}
		if (editorKey == HrmViewsRepository.General.Properties.memorySize) {
			return HrmPackage.eINSTANCE.getHardwareMemory_MemorySize();
		}
		if (editorKey == HrmViewsRepository.General.Properties.addressSize) {
			return HrmPackage.eINSTANCE.getHardwareMemory_AddressSize();
		}
		if (editorKey == HrmViewsRepository.General.Properties.throughput) {
			return HrmPackage.eINSTANCE.getHardwareMemory_Throughput();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HardwareDrive hardwareDrive = (HardwareDrive)semanticObject;
		if (HrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
			hardwareDrive.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HrmViewsRepository.General.Properties.ownedResource == event.getAffectedEditor()) {
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
		if (HrmViewsRepository.General.Properties.resMult == event.getAffectedEditor()) {
			hardwareDrive.setResMult((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.General.Properties.isProtected == event.getAffectedEditor()) {
			hardwareDrive.setIsProtected((Boolean)event.getNewValue());
		}
		if (HrmViewsRepository.General.Properties.isActive == event.getAffectedEditor()) {
			hardwareDrive.setIsActive((Boolean)event.getNewValue());
		}
		if (HrmViewsRepository.General.Properties.ownedConnector == event.getAffectedEditor()) {
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
		if (HrmViewsRepository.General.Properties.usedBy == event.getAffectedEditor()) {
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
		if (HrmViewsRepository.General.Properties.memorySize == event.getAffectedEditor()) {
			hardwareDrive.setMemorySize((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.General.Properties.addressSize == event.getAffectedEditor()) {
			hardwareDrive.setAddressSize((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.General.Properties.throughput == event.getAffectedEditor()) {
			hardwareDrive.setThroughput((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
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
			if (EcorePackage.eINSTANCE.getENamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.name)) {
				if (msg.getNewValue() != null) {
					generalPart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setName("");
				}
			}
			if (GrmPackage.eINSTANCE.getResource_OwnedResource().equals(msg.getFeature()) && isAccessible(HrmViewsRepository.General.Properties.ownedResource))
				generalPart.updateOwnedResource();
			if (GrmPackage.eINSTANCE.getResource_ResMult().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.resMult)) {
				if (msg.getNewValue() != null) {
					generalPart.setResMult(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setResMult("");
				}
			}
			if (GrmPackage.eINSTANCE.getResource_IsProtected().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.isProtected))
				generalPart.setIsProtected((Boolean)msg.getNewValue());
			
			if (GrmPackage.eINSTANCE.getResource_IsActive().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.isActive))
				generalPart.setIsActive((Boolean)msg.getNewValue());
			
			if (GrmPackage.eINSTANCE.getResource_OwnedConnector().equals(msg.getFeature()) && isAccessible(HrmViewsRepository.General.Properties.ownedConnector))
				generalPart.updateOwnedConnector();
			if (GrmPackage.eINSTANCE.getResource_UsedBy().equals(msg.getFeature())  && isAccessible(HrmViewsRepository.General.Properties.usedBy))
				generalPart.updateUsedBy();
			if (HrmPackage.eINSTANCE.getHardwareMemory_MemorySize().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.memorySize)) {
				if (msg.getNewValue() != null) {
					generalPart.setMemorySize(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setMemorySize("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareMemory_AddressSize().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.addressSize)) {
				if (msg.getNewValue() != null) {
					generalPart.setAddressSize(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setAddressSize("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareMemory_Throughput().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(HrmViewsRepository.General.Properties.throughput)) {
				if (msg.getNewValue() != null) {
					generalPart.setThroughput(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setThroughput("");
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
			EcorePackage.eINSTANCE.getENamedElement_Name(),
			GrmPackage.eINSTANCE.getResource_OwnedResource(),
			GrmPackage.eINSTANCE.getResource_ResMult(),
			GrmPackage.eINSTANCE.getResource_IsProtected(),
			GrmPackage.eINSTANCE.getResource_IsActive(),
			GrmPackage.eINSTANCE.getResource_OwnedConnector(),
			GrmPackage.eINSTANCE.getResource_UsedBy(),
			HrmPackage.eINSTANCE.getHardwareMemory_MemorySize(),
			HrmPackage.eINSTANCE.getHardwareMemory_AddressSize(),
			HrmPackage.eINSTANCE.getHardwareMemory_Throughput()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == HrmViewsRepository.General.Properties.name || key == HrmViewsRepository.General.Properties.ownedResource || key == HrmViewsRepository.General.Properties.resMult || key == HrmViewsRepository.General.Properties.isProtected || key == HrmViewsRepository.General.Properties.isActive || key == HrmViewsRepository.General.Properties.ownedConnector || key == HrmViewsRepository.General.Properties.usedBy || key == HrmViewsRepository.General.Properties.memorySize || key == HrmViewsRepository.General.Properties.addressSize || key == HrmViewsRepository.General.Properties.throughput || key == HrmViewsRepository.General.Properties.class;
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
				if (HrmViewsRepository.General.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getENamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EcorePackage.eINSTANCE.getENamedElement_Name().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.resMult == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getResource_ResMult().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getResource_ResMult().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.isProtected == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getResource_IsProtected().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getResource_IsProtected().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.isActive == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getResource_IsActive().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getResource_IsActive().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.memorySize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareMemory_MemorySize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareMemory_MemorySize().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.addressSize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareMemory_AddressSize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareMemory_AddressSize().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.General.Properties.throughput == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareMemory_Throughput().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareMemory_Throughput().getEAttributeType(), newValue);
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
