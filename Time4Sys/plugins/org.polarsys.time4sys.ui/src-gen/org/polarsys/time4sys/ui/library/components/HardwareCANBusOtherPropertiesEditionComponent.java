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
package org.polarsys.time4sys.ui.library.components;

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
import org.polarsys.time4sys.library.HardwareCANBus;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.hrm.EnvCondition;
import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HardwarePin;
import org.polarsys.time4sys.marte.hrm.HardwareWire;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.ui.views.library.parts.LibraryViewsRepository;
import org.polarsys.time4sys.ui.views.library.parts.OtherPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class HardwareCANBusOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for rConditions ReferencesTable
	 */
	protected ReferencesTableSettings rConditionsSettings;
	
	/**
	 * Settings for ownedPin ReferencesTable
	 */
	protected ReferencesTableSettings ownedPinSettings;
	
	/**
	 * Settings for ownedWire ReferencesTable
	 */
	protected ReferencesTableSettings ownedWireSettings;
	
	/**
	 * Settings for arbiters ReferencesTable
	 */
	private ReferencesTableSettings arbitersSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HardwareCANBusOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareCANBus, String editing_mode) {
		super(editingContext, hardwareCANBus, editing_mode);
		parts = new String[] { OTHER_PART };
		repositoryKey = LibraryViewsRepository.class;
		partKey = LibraryViewsRepository.Other.class;
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
			
			final HardwareCANBus hardwareCANBus = (HardwareCANBus)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(LibraryViewsRepository.Other.Properties.pServices)) {
				pServicesSettings = new ReferencesTableSettings(hardwareCANBus, GrmPackage.eINSTANCE.getResource_PServices());
				otherPart.initPServices(pServicesSettings);
			}
			if (isAccessible(LibraryViewsRepository.Other.Properties.rServices)) {
				rServicesSettings = new ReferencesTableSettings(hardwareCANBus, GrmPackage.eINSTANCE.getResource_RServices());
				otherPart.initRServices(rServicesSettings);
			}
			if (isAccessible(LibraryViewsRepository.Other.Properties.dimension)) {
				otherPart.setDimension(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getDimension()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.posX)) {
				otherPart.setPosX(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getPosX()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.posY)) {
				otherPart.setPosY(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getPosY()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.grid)) {
				otherPart.setGrid(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getGrid()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.nbPins)) {
				otherPart.setNbPins(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getNbPins()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.weight)) {
				otherPart.setWeight(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getWeight()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.price)) {
				otherPart.setPrice(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getPrice()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.rConditions)) {
				rConditionsSettings = new ReferencesTableSettings(hardwareCANBus, HrmPackage.eINSTANCE.getHardwareComponent_RConditions());
				otherPart.initRConditions(rConditionsSettings);
			}
			if (isAccessible(LibraryViewsRepository.Other.Properties.ownedPin)) {
				ownedPinSettings = new ReferencesTableSettings(hardwareCANBus, HrmPackage.eINSTANCE.getHardwareComponent_OwnedPin());
				otherPart.initOwnedPin(ownedPinSettings);
			}
			if (isAccessible(LibraryViewsRepository.Other.Properties.ownedWire)) {
				ownedWireSettings = new ReferencesTableSettings(hardwareCANBus, HrmPackage.eINSTANCE.getHardwareComponent_OwnedWire());
				otherPart.initOwnedWire(ownedWireSettings);
			}
			if (isAccessible(LibraryViewsRepository.Other.Properties.nbWires)) {
				otherPart.setNbWires(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getNbWires()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.arbiters)) {
				arbitersSettings = new ReferencesTableSettings(hardwareCANBus, HrmPackage.eINSTANCE.getHardwareMedia_Arbiters());
				otherPart.initArbiters(arbitersSettings);
			}
			if (isAccessible(LibraryViewsRepository.Other.Properties.addressWidth)) {
				otherPart.setAddressWidth(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getAddressWidth()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.wordWidth)) {
				otherPart.setWordWidth(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareCANBus.getWordWidth()));
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.isSerial)) {
				otherPart.setIsSerial(hardwareCANBus.isIsSerial());
			}
			// init filters
			if (isAccessible(LibraryViewsRepository.Other.Properties.pServices)) {
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
			if (isAccessible(LibraryViewsRepository.Other.Properties.rServices)) {
				otherPart.addFilterToRServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for rServices
				// End of user code
			}
			
			
			
			
			
			
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.rConditions)) {
				otherPart.addFilterToRConditions(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EnvCondition); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for rConditions
				// End of user code
			}
			if (isAccessible(LibraryViewsRepository.Other.Properties.ownedPin)) {
				otherPart.addFilterToOwnedPin(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof HardwarePin); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ownedPin
				// End of user code
			}
			if (isAccessible(LibraryViewsRepository.Other.Properties.ownedWire)) {
				otherPart.addFilterToOwnedWire(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof HardwareWire); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for ownedWire
				// End of user code
			}
			
			if (isAccessible(LibraryViewsRepository.Other.Properties.arbiters)) {
				otherPart.addFilterToArbiters(new EObjectFilter(HrmPackage.Literals.HARDWARE_ARBITER));
				// Start of user code for additional businessfilters for arbiters
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
		if (editorKey == LibraryViewsRepository.Other.Properties.pServices) {
			return GrmPackage.eINSTANCE.getResource_PServices();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.rServices) {
			return GrmPackage.eINSTANCE.getResource_RServices();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.dimension) {
			return HrmPackage.eINSTANCE.getHardwareComponent_Dimension();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.posX) {
			return HrmPackage.eINSTANCE.getHardwareComponent_PosX();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.posY) {
			return HrmPackage.eINSTANCE.getHardwareComponent_PosY();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.grid) {
			return HrmPackage.eINSTANCE.getHardwareComponent_Grid();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.nbPins) {
			return HrmPackage.eINSTANCE.getHardwareComponent_NbPins();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.weight) {
			return HrmPackage.eINSTANCE.getHardwareComponent_Weight();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.price) {
			return HrmPackage.eINSTANCE.getHardwareComponent_Price();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.rConditions) {
			return HrmPackage.eINSTANCE.getHardwareComponent_RConditions();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.ownedPin) {
			return HrmPackage.eINSTANCE.getHardwareComponent_OwnedPin();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.ownedWire) {
			return HrmPackage.eINSTANCE.getHardwareComponent_OwnedWire();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.nbWires) {
			return HrmPackage.eINSTANCE.getHardwareChannel_NbWires();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.arbiters) {
			return HrmPackage.eINSTANCE.getHardwareMedia_Arbiters();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.addressWidth) {
			return HrmPackage.eINSTANCE.getHardwareBus_AddressWidth();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.wordWidth) {
			return HrmPackage.eINSTANCE.getHardwareBus_WordWidth();
		}
		if (editorKey == LibraryViewsRepository.Other.Properties.isSerial) {
			return HrmPackage.eINSTANCE.getHardwareBus_IsSerial();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HardwareCANBus hardwareCANBus = (HardwareCANBus)semanticObject;
		if (LibraryViewsRepository.Other.Properties.pServices == event.getAffectedEditor()) {
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
		if (LibraryViewsRepository.Other.Properties.rServices == event.getAffectedEditor()) {
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
		if (LibraryViewsRepository.Other.Properties.dimension == event.getAffectedEditor()) {
			hardwareCANBus.setDimension((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.posX == event.getAffectedEditor()) {
			hardwareCANBus.setPosX((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.posY == event.getAffectedEditor()) {
			hardwareCANBus.setPosY((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.grid == event.getAffectedEditor()) {
			hardwareCANBus.setGrid((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.nbPins == event.getAffectedEditor()) {
			hardwareCANBus.setNbPins((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.weight == event.getAffectedEditor()) {
			hardwareCANBus.setWeight((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.price == event.getAffectedEditor()) {
			hardwareCANBus.setPrice((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.rConditions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rConditionsSettings, editingContext.getAdapterFactory());
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
				rConditionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				rConditionsSettings.move(event.getNewIndex(), (EnvCondition) event.getNewValue());
			}
		}
		if (LibraryViewsRepository.Other.Properties.ownedPin == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedPinSettings, editingContext.getAdapterFactory());
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
				ownedPinSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedPinSettings.move(event.getNewIndex(), (HardwarePin) event.getNewValue());
			}
		}
		if (LibraryViewsRepository.Other.Properties.ownedWire == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, ownedWireSettings, editingContext.getAdapterFactory());
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
				ownedWireSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownedWireSettings.move(event.getNewIndex(), (HardwareWire) event.getNewValue());
			}
		}
		if (LibraryViewsRepository.Other.Properties.nbWires == event.getAffectedEditor()) {
			hardwareCANBus.setNbWires((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.arbiters == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof HardwareArbiter) {
					arbitersSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				arbitersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				arbitersSettings.move(event.getNewIndex(), (HardwareArbiter) event.getNewValue());
			}
		}
		if (LibraryViewsRepository.Other.Properties.addressWidth == event.getAffectedEditor()) {
			hardwareCANBus.setAddressWidth((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.wordWidth == event.getAffectedEditor()) {
			hardwareCANBus.setWordWidth((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (LibraryViewsRepository.Other.Properties.isSerial == event.getAffectedEditor()) {
			hardwareCANBus.setIsSerial((Boolean)event.getNewValue());
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
			if (GrmPackage.eINSTANCE.getResource_PServices().equals(msg.getFeature()) && isAccessible(LibraryViewsRepository.Other.Properties.pServices))
				otherPart.updatePServices();
			if (GrmPackage.eINSTANCE.getResource_RServices().equals(msg.getFeature())  && isAccessible(LibraryViewsRepository.Other.Properties.rServices))
				otherPart.updateRServices();
			if (HrmPackage.eINSTANCE.getHardwareComponent_Dimension().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.dimension)) {
				if (msg.getNewValue() != null) {
					otherPart.setDimension(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setDimension("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_PosX().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.posX)) {
				if (msg.getNewValue() != null) {
					otherPart.setPosX(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setPosX("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_PosY().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.posY)) {
				if (msg.getNewValue() != null) {
					otherPart.setPosY(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setPosY("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_Grid().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.grid)) {
				if (msg.getNewValue() != null) {
					otherPart.setGrid(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setGrid("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_NbPins().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.nbPins)) {
				if (msg.getNewValue() != null) {
					otherPart.setNbPins(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setNbPins("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_Weight().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.weight)) {
				if (msg.getNewValue() != null) {
					otherPart.setWeight(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setWeight("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_Price().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.price)) {
				if (msg.getNewValue() != null) {
					otherPart.setPrice(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setPrice("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_RConditions().equals(msg.getFeature()) && isAccessible(LibraryViewsRepository.Other.Properties.rConditions))
				otherPart.updateRConditions();
			if (HrmPackage.eINSTANCE.getHardwareComponent_OwnedPin().equals(msg.getFeature()) && isAccessible(LibraryViewsRepository.Other.Properties.ownedPin))
				otherPart.updateOwnedPin();
			if (HrmPackage.eINSTANCE.getHardwareComponent_OwnedWire().equals(msg.getFeature()) && isAccessible(LibraryViewsRepository.Other.Properties.ownedWire))
				otherPart.updateOwnedWire();
			if (HrmPackage.eINSTANCE.getHardwareChannel_NbWires().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.nbWires)) {
				if (msg.getNewValue() != null) {
					otherPart.setNbWires(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setNbWires("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareMedia_Arbiters().equals(msg.getFeature())  && isAccessible(LibraryViewsRepository.Other.Properties.arbiters))
				otherPart.updateArbiters();
			if (HrmPackage.eINSTANCE.getHardwareBus_AddressWidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.addressWidth)) {
				if (msg.getNewValue() != null) {
					otherPart.setAddressWidth(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setAddressWidth("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareBus_WordWidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.wordWidth)) {
				if (msg.getNewValue() != null) {
					otherPart.setWordWidth(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setWordWidth("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareBus_IsSerial().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(LibraryViewsRepository.Other.Properties.isSerial))
				otherPart.setIsSerial((Boolean)msg.getNewValue());
			
			
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
			HrmPackage.eINSTANCE.getHardwareComponent_Dimension(),
			HrmPackage.eINSTANCE.getHardwareComponent_PosX(),
			HrmPackage.eINSTANCE.getHardwareComponent_PosY(),
			HrmPackage.eINSTANCE.getHardwareComponent_Grid(),
			HrmPackage.eINSTANCE.getHardwareComponent_NbPins(),
			HrmPackage.eINSTANCE.getHardwareComponent_Weight(),
			HrmPackage.eINSTANCE.getHardwareComponent_Price(),
			HrmPackage.eINSTANCE.getHardwareComponent_RConditions(),
			HrmPackage.eINSTANCE.getHardwareComponent_OwnedPin(),
			HrmPackage.eINSTANCE.getHardwareComponent_OwnedWire(),
			HrmPackage.eINSTANCE.getHardwareChannel_NbWires(),
			HrmPackage.eINSTANCE.getHardwareMedia_Arbiters(),
			HrmPackage.eINSTANCE.getHardwareBus_AddressWidth(),
			HrmPackage.eINSTANCE.getHardwareBus_WordWidth(),
			HrmPackage.eINSTANCE.getHardwareBus_IsSerial()		);
		return new NotificationFilter[] {filter,};
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
				if (LibraryViewsRepository.Other.Properties.dimension == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_Dimension().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_Dimension().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.posX == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_PosX().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_PosX().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.posY == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_PosY().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_PosY().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.grid == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_Grid().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_Grid().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.nbPins == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_NbPins().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_NbPins().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.weight == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_Weight().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_Weight().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.price == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_Price().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_Price().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.nbWires == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareChannel_NbWires().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareChannel_NbWires().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.addressWidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareBus_AddressWidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareBus_AddressWidth().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.wordWidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareBus_WordWidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareBus_WordWidth().getEAttributeType(), newValue);
				}
				if (LibraryViewsRepository.Other.Properties.isSerial == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareBus_IsSerial().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareBus_IsSerial().getEAttributeType(), newValue);
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
