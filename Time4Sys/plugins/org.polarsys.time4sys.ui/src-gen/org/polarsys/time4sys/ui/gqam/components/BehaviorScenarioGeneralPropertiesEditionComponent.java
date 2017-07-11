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
package org.polarsys.time4sys.ui.gqam.components;

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
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.ui.views.gqam.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BehaviorScenarioGeneralPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	/**
	 * Settings for root EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings rootSettings;
	
	/**
	 * Settings for parentStep EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parentStepSettings;
	
	/**
	 * Settings for steps ReferencesTable
	 */
	protected ReferencesTableSettings stepsSettings;
	
	/**
	 * Settings for cause ReferencesTable
	 */
	private ReferencesTableSettings causeSettings;
	
	/**
	 * Settings for connectors ReferencesTable
	 */
	protected ReferencesTableSettings connectorsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BehaviorScenarioGeneralPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject behaviorScenario, String editing_mode) {
		super(editingContext, behaviorScenario, editing_mode);
		parts = new String[] { GENERAL_PART };
		repositoryKey = GqamViewsRepository.class;
		partKey = GqamViewsRepository.General.class;
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
			
			final BehaviorScenario behaviorScenario = (BehaviorScenario)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GqamViewsRepository.General.Properties.name))
				generalPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, behaviorScenario.getName()));
			
			if (isAccessible(GqamViewsRepository.General.Properties.root)) {
				// init part
				rootSettings = new EObjectFlatComboSettings(behaviorScenario, GqamPackage.eINSTANCE.getBehaviorScenario_Root());
				generalPart.initRoot(rootSettings);
				// set the button mode
				generalPart.setRootButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.parentStep)) {
				// init part
				parentStepSettings = new EObjectFlatComboSettings(behaviorScenario, GqamPackage.eINSTANCE.getBehaviorScenario_ParentStep());
				generalPart.initParentStep(parentStepSettings);
				// set the button mode
				generalPart.setParentStepButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.steps)) {
				stepsSettings = new ReferencesTableSettings(behaviorScenario, GqamPackage.eINSTANCE.getBehaviorScenario_Steps());
				generalPart.initSteps(stepsSettings);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.cause)) {
				causeSettings = new ReferencesTableSettings(behaviorScenario, GqamPackage.eINSTANCE.getBehaviorScenario_Cause());
				generalPart.initCause(causeSettings);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.connectors)) {
				connectorsSettings = new ReferencesTableSettings(behaviorScenario, GqamPackage.eINSTANCE.getBehaviorScenario_Connectors());
				generalPart.initConnectors(connectorsSettings);
			}
			// init filters
			
			if (isAccessible(GqamViewsRepository.General.Properties.root)) {
				generalPart.addFilterToRoot(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Step); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for root
				// End of user code
			}
			if (isAccessible(GqamViewsRepository.General.Properties.parentStep)) {
				generalPart.addFilterToParentStep(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Step); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for parentStep
				// End of user code
			}
			if (isAccessible(GqamViewsRepository.General.Properties.steps)) {
				generalPart.addFilterToSteps(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Step); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for steps
				// End of user code
			}
			if (isAccessible(GqamViewsRepository.General.Properties.cause)) {
				generalPart.addFilterToCause(new EObjectFilter(GqamPackage.Literals.WORKLOAD_EVENT));
				// Start of user code for additional businessfilters for cause
				// End of user code
			}
			if (isAccessible(GqamViewsRepository.General.Properties.connectors)) {
				generalPart.addFilterToConnectors(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof PrecedenceRelation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for connectors
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
		if (editorKey == GqamViewsRepository.General.Properties.name) {
			return GrmPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == GqamViewsRepository.General.Properties.root) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_Root();
		}
		if (editorKey == GqamViewsRepository.General.Properties.parentStep) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_ParentStep();
		}
		if (editorKey == GqamViewsRepository.General.Properties.steps) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_Steps();
		}
		if (editorKey == GqamViewsRepository.General.Properties.cause) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_Cause();
		}
		if (editorKey == GqamViewsRepository.General.Properties.connectors) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_Connectors();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BehaviorScenario behaviorScenario = (BehaviorScenario)semanticObject;
		if (GqamViewsRepository.General.Properties.name == event.getAffectedEditor()) {
			behaviorScenario.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (GqamViewsRepository.General.Properties.root == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				rootSettings.setToReference((Step)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Step eObject = GqamFactory.eINSTANCE.createStep();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				rootSettings.setToReference(eObject);
			}
		}
		if (GqamViewsRepository.General.Properties.parentStep == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parentStepSettings.setToReference((Step)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Step eObject = GqamFactory.eINSTANCE.createStep();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				parentStepSettings.setToReference(eObject);
			}
		}
		if (GqamViewsRepository.General.Properties.steps == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, stepsSettings, editingContext.getAdapterFactory());
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
				stepsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				stepsSettings.move(event.getNewIndex(), (Step) event.getNewValue());
			}
		}
		if (GqamViewsRepository.General.Properties.cause == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof WorkloadEvent) {
					causeSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				causeSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				causeSettings.move(event.getNewIndex(), (WorkloadEvent) event.getNewValue());
			}
		}
		if (GqamViewsRepository.General.Properties.connectors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, connectorsSettings, editingContext.getAdapterFactory());
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
				connectorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				connectorsSettings.move(event.getNewIndex(), (PrecedenceRelation) event.getNewValue());
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
			if (GrmPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.name)) {
				if (msg.getNewValue() != null) {
					generalPart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					generalPart.setName("");
				}
			}
			if (GqamPackage.eINSTANCE.getBehaviorScenario_Root().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.root))
				generalPart.setRoot((EObject)msg.getNewValue());
			if (GqamPackage.eINSTANCE.getBehaviorScenario_ParentStep().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.parentStep))
				generalPart.setParentStep((EObject)msg.getNewValue());
			if (GqamPackage.eINSTANCE.getBehaviorScenario_Steps().equals(msg.getFeature()) && isAccessible(GqamViewsRepository.General.Properties.steps))
				generalPart.updateSteps();
			if (GqamPackage.eINSTANCE.getBehaviorScenario_Cause().equals(msg.getFeature())  && isAccessible(GqamViewsRepository.General.Properties.cause))
				generalPart.updateCause();
			if (GqamPackage.eINSTANCE.getBehaviorScenario_Connectors().equals(msg.getFeature()) && isAccessible(GqamViewsRepository.General.Properties.connectors))
				generalPart.updateConnectors();
			
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
			GqamPackage.eINSTANCE.getBehaviorScenario_Root(),
			GqamPackage.eINSTANCE.getBehaviorScenario_ParentStep(),
			GqamPackage.eINSTANCE.getBehaviorScenario_Steps(),
			GqamPackage.eINSTANCE.getBehaviorScenario_Cause(),
			GqamPackage.eINSTANCE.getBehaviorScenario_Connectors()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GqamViewsRepository.General.Properties.name || key == GqamViewsRepository.General.Properties.root || key == GqamViewsRepository.General.Properties.parentStep || key == GqamViewsRepository.General.Properties.steps || key == GqamViewsRepository.General.Properties.cause || key == GqamViewsRepository.General.Properties.connectors || key == GqamViewsRepository.General.Properties.class;
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
				if (GqamViewsRepository.General.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
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
