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
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.hrm.EnvCondition;
import org.polarsys.time4sys.marte.hrm.HardwarePin;
import org.polarsys.time4sys.marte.hrm.HardwareTimingResource;
import org.polarsys.time4sys.marte.hrm.HardwareWire;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.parts.OtherPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class HardwareTimingResourceOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String OTHER_PART = "Other"; //$NON-NLS-1$

	
	/**
	 * Settings for pServices ReferencesTable
	 */
	protected ReferencesTableSettings pServicesSettings;
	
	/**
	 * Settings for ownedPort ReferencesTable
	 */
	protected ReferencesTableSettings ownedPortSettings;
	
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
	 * Default constructor
	 * 
	 */
	public HardwareTimingResourceOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hardwareTimingResource, String editing_mode) {
		super(editingContext, hardwareTimingResource, editing_mode);
		parts = new String[] { OTHER_PART };
		repositoryKey = HrmViewsRepository.class;
		partKey = HrmViewsRepository.Other.class;
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
			
			final HardwareTimingResource hardwareTimingResource = (HardwareTimingResource)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HrmViewsRepository.Other.Properties.pServices)) {
				pServicesSettings = new ReferencesTableSettings(hardwareTimingResource, GrmPackage.eINSTANCE.getResource_PServices());
				otherPart.initPServices(pServicesSettings);
			}
			if (isAccessible(HrmViewsRepository.Other.Properties.ownedPort)) {
				ownedPortSettings = new ReferencesTableSettings(hardwareTimingResource, GrmPackage.eINSTANCE.getResource_OwnedPort());
				otherPart.initOwnedPort(ownedPortSettings);
			}
			if (isAccessible(HrmViewsRepository.Other.Properties.rServices)) {
				rServicesSettings = new ReferencesTableSettings(hardwareTimingResource, GrmPackage.eINSTANCE.getResource_RServices());
				otherPart.initRServices(rServicesSettings);
			}
			if (isAccessible(HrmViewsRepository.Other.Properties.dimension)) {
				otherPart.setDimension(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareTimingResource.getDimension()));
			}
			
			if (isAccessible(HrmViewsRepository.Other.Properties.posX)) {
				otherPart.setPosX(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareTimingResource.getPosX()));
			}
			
			if (isAccessible(HrmViewsRepository.Other.Properties.posY)) {
				otherPart.setPosY(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareTimingResource.getPosY()));
			}
			
			if (isAccessible(HrmViewsRepository.Other.Properties.grid)) {
				otherPart.setGrid(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareTimingResource.getGrid()));
			}
			
			if (isAccessible(HrmViewsRepository.Other.Properties.nbPins)) {
				otherPart.setNbPins(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareTimingResource.getNbPins()));
			}
			
			if (isAccessible(HrmViewsRepository.Other.Properties.weight)) {
				otherPart.setWeight(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareTimingResource.getWeight()));
			}
			
			if (isAccessible(HrmViewsRepository.Other.Properties.price)) {
				otherPart.setPrice(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareTimingResource.getPrice()));
			}
			
			if (isAccessible(HrmViewsRepository.Other.Properties.rConditions)) {
				rConditionsSettings = new ReferencesTableSettings(hardwareTimingResource, HrmPackage.eINSTANCE.getHardwareComponent_RConditions());
				otherPart.initRConditions(rConditionsSettings);
			}
			if (isAccessible(HrmViewsRepository.Other.Properties.ownedPin)) {
				ownedPinSettings = new ReferencesTableSettings(hardwareTimingResource, HrmPackage.eINSTANCE.getHardwareComponent_OwnedPin());
				otherPart.initOwnedPin(ownedPinSettings);
			}
			if (isAccessible(HrmViewsRepository.Other.Properties.ownedWire)) {
				ownedWireSettings = new ReferencesTableSettings(hardwareTimingResource, HrmPackage.eINSTANCE.getHardwareComponent_OwnedWire());
				otherPart.initOwnedWire(ownedWireSettings);
			}
			if (isAccessible(HrmViewsRepository.Other.Properties.technology)) {
				otherPart.setTechnology(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, hardwareTimingResource.getTechnology()));
			}
			
			// init filters
			if (isAccessible(HrmViewsRepository.Other.Properties.pServices)) {
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
			if (isAccessible(HrmViewsRepository.Other.Properties.ownedPort)) {
				otherPart.addFilterToOwnedPort(new ViewerFilter() {
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
			if (isAccessible(HrmViewsRepository.Other.Properties.rServices)) {
				otherPart.addFilterToRServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for rServices
				// End of user code
			}
			
			
			
			
			
			
			
			if (isAccessible(HrmViewsRepository.Other.Properties.rConditions)) {
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
			if (isAccessible(HrmViewsRepository.Other.Properties.ownedPin)) {
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
			if (isAccessible(HrmViewsRepository.Other.Properties.ownedWire)) {
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
		if (editorKey == HrmViewsRepository.Other.Properties.pServices) {
			return GrmPackage.eINSTANCE.getResource_PServices();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.ownedPort) {
			return GrmPackage.eINSTANCE.getResource_OwnedPort();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.rServices) {
			return GrmPackage.eINSTANCE.getResource_RServices();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.dimension) {
			return HrmPackage.eINSTANCE.getHardwareComponent_Dimension();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.posX) {
			return HrmPackage.eINSTANCE.getHardwareComponent_PosX();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.posY) {
			return HrmPackage.eINSTANCE.getHardwareComponent_PosY();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.grid) {
			return HrmPackage.eINSTANCE.getHardwareComponent_Grid();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.nbPins) {
			return HrmPackage.eINSTANCE.getHardwareComponent_NbPins();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.weight) {
			return HrmPackage.eINSTANCE.getHardwareComponent_Weight();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.price) {
			return HrmPackage.eINSTANCE.getHardwareComponent_Price();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.rConditions) {
			return HrmPackage.eINSTANCE.getHardwareComponent_RConditions();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.ownedPin) {
			return HrmPackage.eINSTANCE.getHardwareComponent_OwnedPin();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.ownedWire) {
			return HrmPackage.eINSTANCE.getHardwareComponent_OwnedWire();
		}
		if (editorKey == HrmViewsRepository.Other.Properties.technology) {
			return HrmPackage.eINSTANCE.getHardwareChip_Technology();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HardwareTimingResource hardwareTimingResource = (HardwareTimingResource)semanticObject;
		if (HrmViewsRepository.Other.Properties.pServices == event.getAffectedEditor()) {
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
		if (HrmViewsRepository.Other.Properties.ownedPort == event.getAffectedEditor()) {
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
		if (HrmViewsRepository.Other.Properties.rServices == event.getAffectedEditor()) {
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
		if (HrmViewsRepository.Other.Properties.dimension == event.getAffectedEditor()) {
			hardwareTimingResource.setDimension((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.Other.Properties.posX == event.getAffectedEditor()) {
			hardwareTimingResource.setPosX((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.Other.Properties.posY == event.getAffectedEditor()) {
			hardwareTimingResource.setPosY((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.Other.Properties.grid == event.getAffectedEditor()) {
			hardwareTimingResource.setGrid((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.Other.Properties.nbPins == event.getAffectedEditor()) {
			hardwareTimingResource.setNbPins((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.Other.Properties.weight == event.getAffectedEditor()) {
			hardwareTimingResource.setWeight((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.Other.Properties.price == event.getAffectedEditor()) {
			hardwareTimingResource.setPrice((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HrmViewsRepository.Other.Properties.rConditions == event.getAffectedEditor()) {
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
		if (HrmViewsRepository.Other.Properties.ownedPin == event.getAffectedEditor()) {
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
		if (HrmViewsRepository.Other.Properties.ownedWire == event.getAffectedEditor()) {
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
		if (HrmViewsRepository.Other.Properties.technology == event.getAffectedEditor()) {
			hardwareTimingResource.setTechnology((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
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
			if (GrmPackage.eINSTANCE.getResource_PServices().equals(msg.getFeature()) && isAccessible(HrmViewsRepository.Other.Properties.pServices))
				otherPart.updatePServices();
			if (GrmPackage.eINSTANCE.getResource_OwnedPort().equals(msg.getFeature()) && isAccessible(HrmViewsRepository.Other.Properties.ownedPort))
				otherPart.updateOwnedPort();
			if (GrmPackage.eINSTANCE.getResource_RServices().equals(msg.getFeature())  && isAccessible(HrmViewsRepository.Other.Properties.rServices))
				otherPart.updateRServices();
			if (HrmPackage.eINSTANCE.getHardwareComponent_Dimension().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.dimension)) {
				if (msg.getNewValue() != null) {
					otherPart.setDimension(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setDimension("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_PosX().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.posX)) {
				if (msg.getNewValue() != null) {
					otherPart.setPosX(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setPosX("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_PosY().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.posY)) {
				if (msg.getNewValue() != null) {
					otherPart.setPosY(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setPosY("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_Grid().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.grid)) {
				if (msg.getNewValue() != null) {
					otherPart.setGrid(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setGrid("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_NbPins().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.nbPins)) {
				if (msg.getNewValue() != null) {
					otherPart.setNbPins(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setNbPins("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_Weight().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.weight)) {
				if (msg.getNewValue() != null) {
					otherPart.setWeight(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setWeight("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_Price().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.price)) {
				if (msg.getNewValue() != null) {
					otherPart.setPrice(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setPrice("");
				}
			}
			if (HrmPackage.eINSTANCE.getHardwareComponent_RConditions().equals(msg.getFeature()) && isAccessible(HrmViewsRepository.Other.Properties.rConditions))
				otherPart.updateRConditions();
			if (HrmPackage.eINSTANCE.getHardwareComponent_OwnedPin().equals(msg.getFeature()) && isAccessible(HrmViewsRepository.Other.Properties.ownedPin))
				otherPart.updateOwnedPin();
			if (HrmPackage.eINSTANCE.getHardwareComponent_OwnedWire().equals(msg.getFeature()) && isAccessible(HrmViewsRepository.Other.Properties.ownedWire))
				otherPart.updateOwnedWire();
			if (HrmPackage.eINSTANCE.getHardwareChip_Technology().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(HrmViewsRepository.Other.Properties.technology)) {
				if (msg.getNewValue() != null) {
					otherPart.setTechnology(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setTechnology("");
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
			GrmPackage.eINSTANCE.getResource_OwnedPort(),
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
			HrmPackage.eINSTANCE.getHardwareChip_Technology()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == HrmViewsRepository.Other.Properties.pServices || key == HrmViewsRepository.Other.Properties.ownedPort || key == HrmViewsRepository.Other.Properties.rServices || key == HrmViewsRepository.Other.Properties.dimension || key == HrmViewsRepository.Other.Properties.posX || key == HrmViewsRepository.Other.Properties.posY || key == HrmViewsRepository.Other.Properties.grid || key == HrmViewsRepository.Other.Properties.nbPins || key == HrmViewsRepository.Other.Properties.weight || key == HrmViewsRepository.Other.Properties.price || key == HrmViewsRepository.Other.Properties.rConditions || key == HrmViewsRepository.Other.Properties.ownedPin || key == HrmViewsRepository.Other.Properties.ownedWire || key == HrmViewsRepository.Other.Properties.technology || key == HrmViewsRepository.Other.Properties.class;
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
				if (HrmViewsRepository.Other.Properties.dimension == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_Dimension().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_Dimension().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.Other.Properties.posX == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_PosX().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_PosX().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.Other.Properties.posY == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_PosY().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_PosY().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.Other.Properties.grid == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_Grid().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_Grid().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.Other.Properties.nbPins == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_NbPins().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_NbPins().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.Other.Properties.weight == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_Weight().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_Weight().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.Other.Properties.price == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareComponent_Price().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareComponent_Price().getEAttributeType(), newValue);
				}
				if (HrmViewsRepository.Other.Properties.technology == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HrmPackage.eINSTANCE.getHardwareChip_Technology().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HrmPackage.eINSTANCE.getHardwareChip_Technology().getEAttributeType(), newValue);
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
