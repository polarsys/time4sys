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
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.ui.views.gqam.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class StepGeneralPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	/**
	 * Settings for concurRes EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings concurResSettings;
	
	/**
	 * Settings for root EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings rootSettings;
	
	/**
	 * Settings for parentStep EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parentStepSettings;
	
	/**
	 * Settings for scenario EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings scenarioSettings;
	
	/**
	 * Settings for childScenario EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings childScenarioSettings;
	
	/**
	 * Settings for inputRel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings inputRelSettings;
	
	/**
	 * Settings for outputRel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings outputRelSettings;
	
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
	public StepGeneralPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject step, String editing_mode) {
		super(editingContext, step, editing_mode);
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
			
			final Step step = (Step)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GqamViewsRepository.General.Properties.name))
				generalPart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, step.getName()));
			
			if (isAccessible(GqamViewsRepository.General.Properties.isAtomic)) {
				generalPart.setIsAtomic(step.isIsAtomic());
			}
			if (isAccessible(GqamViewsRepository.General.Properties.repetitions)) {
				generalPart.setRepetitions(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, step.getRepetitions()));
			}
			
			if (isAccessible(GqamViewsRepository.General.Properties.probability)) {
				generalPart.setProbability(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, step.getProbability()));
			}
			
			if (isAccessible(GqamViewsRepository.General.Properties.priority)) {
				generalPart.setPriority(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, step.getPriority()));
			}
			
			if (isAccessible(GqamViewsRepository.General.Properties.serviceCount)) {
				generalPart.setServiceCount(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, step.getServiceCount()));
			}
			
			if (isAccessible(GqamViewsRepository.General.Properties.concurRes)) {
				// init part
				concurResSettings = new EObjectFlatComboSettings(step, GqamPackage.eINSTANCE.getStep_ConcurRes());
				generalPart.initConcurRes(concurResSettings);
				// set the button mode
				generalPart.setConcurResButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.root)) {
				// init part
				rootSettings = new EObjectFlatComboSettings(step, GqamPackage.eINSTANCE.getBehaviorScenario_Root());
				generalPart.initRoot(rootSettings);
				// set the button mode
				generalPart.setRootButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.parentStep)) {
				// init part
				parentStepSettings = new EObjectFlatComboSettings(step, GqamPackage.eINSTANCE.getBehaviorScenario_ParentStep());
				generalPart.initParentStep(parentStepSettings);
				// set the button mode
				generalPart.setParentStepButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.scenario)) {
				// init part
				scenarioSettings = new EObjectFlatComboSettings(step, GqamPackage.eINSTANCE.getStep_Scenario());
				generalPart.initScenario(scenarioSettings);
				// set the button mode
				generalPart.setScenarioButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.childScenario)) {
				// init part
				childScenarioSettings = new EObjectFlatComboSettings(step, GqamPackage.eINSTANCE.getStep_ChildScenario());
				generalPart.initChildScenario(childScenarioSettings);
				// set the button mode
				generalPart.setChildScenarioButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.inputRel)) {
				// init part
				inputRelSettings = new EObjectFlatComboSettings(step, GqamPackage.eINSTANCE.getStep_InputRel());
				generalPart.initInputRel(inputRelSettings);
				// set the button mode
				generalPart.setInputRelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.outputRel)) {
				// init part
				outputRelSettings = new EObjectFlatComboSettings(step, GqamPackage.eINSTANCE.getStep_OutputRel());
				generalPart.initOutputRel(outputRelSettings);
				// set the button mode
				generalPart.setOutputRelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.steps)) {
				stepsSettings = new ReferencesTableSettings(step, GqamPackage.eINSTANCE.getBehaviorScenario_Steps());
				generalPart.initSteps(stepsSettings);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.cause)) {
				causeSettings = new ReferencesTableSettings(step, GqamPackage.eINSTANCE.getBehaviorScenario_Cause());
				generalPart.initCause(causeSettings);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.connectors)) {
				connectorsSettings = new ReferencesTableSettings(step, GqamPackage.eINSTANCE.getBehaviorScenario_Connectors());
				generalPart.initConnectors(connectorsSettings);
			}
			// init filters
			
			
			
			
			
			
			if (isAccessible(GqamViewsRepository.General.Properties.concurRes)) {
				generalPart.addFilterToConcurRes(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SchedulableResource); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for concurRes
				// End of user code
			}
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
			if (isAccessible(GqamViewsRepository.General.Properties.scenario)) {
				generalPart.addFilterToScenario(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof BehaviorScenario); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for scenario
				// End of user code
			}
			if (isAccessible(GqamViewsRepository.General.Properties.childScenario)) {
				generalPart.addFilterToChildScenario(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof BehaviorScenario); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for childScenario
				// End of user code
			}
			if (isAccessible(GqamViewsRepository.General.Properties.inputRel)) {
				generalPart.addFilterToInputRel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof PrecedenceRelation); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for inputRel
				// End of user code
			}
			if (isAccessible(GqamViewsRepository.General.Properties.outputRel)) {
				generalPart.addFilterToOutputRel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof PrecedenceRelation); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for outputRel
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
		if (editorKey == GqamViewsRepository.General.Properties.isAtomic) {
			return GqamPackage.eINSTANCE.getStep_IsAtomic();
		}
		if (editorKey == GqamViewsRepository.General.Properties.repetitions) {
			return GqamPackage.eINSTANCE.getStep_Repetitions();
		}
		if (editorKey == GqamViewsRepository.General.Properties.probability) {
			return GqamPackage.eINSTANCE.getStep_Probability();
		}
		if (editorKey == GqamViewsRepository.General.Properties.priority) {
			return GqamPackage.eINSTANCE.getStep_Priority();
		}
		if (editorKey == GqamViewsRepository.General.Properties.serviceCount) {
			return GqamPackage.eINSTANCE.getStep_ServiceCount();
		}
		if (editorKey == GqamViewsRepository.General.Properties.concurRes) {
			return GqamPackage.eINSTANCE.getStep_ConcurRes();
		}
		if (editorKey == GqamViewsRepository.General.Properties.root) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_Root();
		}
		if (editorKey == GqamViewsRepository.General.Properties.parentStep) {
			return GqamPackage.eINSTANCE.getBehaviorScenario_ParentStep();
		}
		if (editorKey == GqamViewsRepository.General.Properties.scenario) {
			return GqamPackage.eINSTANCE.getStep_Scenario();
		}
		if (editorKey == GqamViewsRepository.General.Properties.childScenario) {
			return GqamPackage.eINSTANCE.getStep_ChildScenario();
		}
		if (editorKey == GqamViewsRepository.General.Properties.inputRel) {
			return GqamPackage.eINSTANCE.getStep_InputRel();
		}
		if (editorKey == GqamViewsRepository.General.Properties.outputRel) {
			return GqamPackage.eINSTANCE.getStep_OutputRel();
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
		Step step = (Step)semanticObject;
		if (GqamViewsRepository.General.Properties.name == event.getAffectedEditor()) {
			step.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (GqamViewsRepository.General.Properties.isAtomic == event.getAffectedEditor()) {
			step.setIsAtomic((Boolean)event.getNewValue());
		}
		if (GqamViewsRepository.General.Properties.repetitions == event.getAffectedEditor()) {
			step.setRepetitions((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (GqamViewsRepository.General.Properties.probability == event.getAffectedEditor()) {
			step.setProbability((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (GqamViewsRepository.General.Properties.priority == event.getAffectedEditor()) {
			step.setPriority((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (GqamViewsRepository.General.Properties.serviceCount == event.getAffectedEditor()) {
			step.setServiceCount((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (GqamViewsRepository.General.Properties.concurRes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				concurResSettings.setToReference((SchedulableResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SchedulableResource eObject = GrmFactory.eINSTANCE.createSchedulableResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				concurResSettings.setToReference(eObject);
			}
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
		if (GqamViewsRepository.General.Properties.scenario == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				scenarioSettings.setToReference((BehaviorScenario)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BehaviorScenario eObject = GqamFactory.eINSTANCE.createBehaviorScenario();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				scenarioSettings.setToReference(eObject);
			}
		}
		if (GqamViewsRepository.General.Properties.childScenario == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				childScenarioSettings.setToReference((BehaviorScenario)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BehaviorScenario eObject = GqamFactory.eINSTANCE.createBehaviorScenario();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				childScenarioSettings.setToReference(eObject);
			}
		}
		if (GqamViewsRepository.General.Properties.inputRel == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				inputRelSettings.setToReference((PrecedenceRelation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				PrecedenceRelation eObject = GqamFactory.eINSTANCE.createPrecedenceRelation();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				inputRelSettings.setToReference(eObject);
			}
		}
		if (GqamViewsRepository.General.Properties.outputRel == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				outputRelSettings.setToReference((PrecedenceRelation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				PrecedenceRelation eObject = GqamFactory.eINSTANCE.createPrecedenceRelation();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				outputRelSettings.setToReference(eObject);
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
			if (GqamPackage.eINSTANCE.getStep_IsAtomic().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.isAtomic))
				generalPart.setIsAtomic((Boolean)msg.getNewValue());
			
			if (GqamPackage.eINSTANCE.getStep_Repetitions().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.repetitions)) {
				if (msg.getNewValue() != null) {
					generalPart.setRepetitions(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					generalPart.setRepetitions("");
				}
			}
			if (GqamPackage.eINSTANCE.getStep_Probability().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.probability)) {
				if (msg.getNewValue() != null) {
					generalPart.setProbability(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					generalPart.setProbability("");
				}
			}
			if (GqamPackage.eINSTANCE.getStep_Priority().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.priority)) {
				if (msg.getNewValue() != null) {
					generalPart.setPriority(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setPriority("");
				}
			}
			if (GqamPackage.eINSTANCE.getStep_ServiceCount().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.serviceCount)) {
				if (msg.getNewValue() != null) {
					generalPart.setServiceCount(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					generalPart.setServiceCount("");
				}
			}
			if (GqamPackage.eINSTANCE.getStep_ConcurRes().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.concurRes))
				generalPart.setConcurRes((EObject)msg.getNewValue());
			if (GqamPackage.eINSTANCE.getBehaviorScenario_Root().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.root))
				generalPart.setRoot((EObject)msg.getNewValue());
			if (GqamPackage.eINSTANCE.getBehaviorScenario_ParentStep().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.parentStep))
				generalPart.setParentStep((EObject)msg.getNewValue());
			if (GqamPackage.eINSTANCE.getStep_Scenario().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.scenario))
				generalPart.setScenario((EObject)msg.getNewValue());
			if (GqamPackage.eINSTANCE.getStep_ChildScenario().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.childScenario))
				generalPart.setChildScenario((EObject)msg.getNewValue());
			if (GqamPackage.eINSTANCE.getStep_InputRel().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.inputRel))
				generalPart.setInputRel((EObject)msg.getNewValue());
			if (GqamPackage.eINSTANCE.getStep_OutputRel().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.outputRel))
				generalPart.setOutputRel((EObject)msg.getNewValue());
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
			GqamPackage.eINSTANCE.getStep_IsAtomic(),
			GqamPackage.eINSTANCE.getStep_Repetitions(),
			GqamPackage.eINSTANCE.getStep_Probability(),
			GqamPackage.eINSTANCE.getStep_Priority(),
			GqamPackage.eINSTANCE.getStep_ServiceCount(),
			GqamPackage.eINSTANCE.getStep_ConcurRes(),
			GqamPackage.eINSTANCE.getBehaviorScenario_Root(),
			GqamPackage.eINSTANCE.getBehaviorScenario_ParentStep(),
			GqamPackage.eINSTANCE.getStep_Scenario(),
			GqamPackage.eINSTANCE.getStep_ChildScenario(),
			GqamPackage.eINSTANCE.getStep_InputRel(),
			GqamPackage.eINSTANCE.getStep_OutputRel(),
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
		return key == GqamViewsRepository.General.Properties.name || key == GqamViewsRepository.General.Properties.isAtomic || key == GqamViewsRepository.General.Properties.repetitions || key == GqamViewsRepository.General.Properties.probability || key == GqamViewsRepository.General.Properties.priority || key == GqamViewsRepository.General.Properties.serviceCount || key == GqamViewsRepository.General.Properties.concurRes || key == GqamViewsRepository.General.Properties.root || key == GqamViewsRepository.General.Properties.parentStep || key == GqamViewsRepository.General.Properties.scenario || key == GqamViewsRepository.General.Properties.childScenario || key == GqamViewsRepository.General.Properties.inputRel || key == GqamViewsRepository.General.Properties.outputRel || key == GqamViewsRepository.General.Properties.steps || key == GqamViewsRepository.General.Properties.cause || key == GqamViewsRepository.General.Properties.connectors || key == GqamViewsRepository.General.Properties.class;
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
				if (GqamViewsRepository.General.Properties.isAtomic == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getStep_IsAtomic().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getStep_IsAtomic().getEAttributeType(), newValue);
				}
				if (GqamViewsRepository.General.Properties.repetitions == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getStep_Repetitions().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getStep_Repetitions().getEAttributeType(), newValue);
				}
				if (GqamViewsRepository.General.Properties.probability == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getStep_Probability().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getStep_Probability().getEAttributeType(), newValue);
				}
				if (GqamViewsRepository.General.Properties.priority == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getStep_Priority().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getStep_Priority().getEAttributeType(), newValue);
				}
				if (GqamViewsRepository.General.Properties.serviceCount == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getStep_ServiceCount().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getStep_ServiceCount().getEAttributeType(), newValue);
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
