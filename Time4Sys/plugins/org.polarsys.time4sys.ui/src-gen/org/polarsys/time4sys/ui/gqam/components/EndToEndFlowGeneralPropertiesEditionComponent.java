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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.EndToEndFlow;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.ui.views.gqam.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class EndToEndFlowGeneralPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	/**
	 * Settings for endToEndScenario EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings endToEndScenarioSettings;
	
	/**
	 * Settings for endToEndStimuli ReferencesTable
	 */
	private ReferencesTableSettings endToEndStimuliSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EndToEndFlowGeneralPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject endToEndFlow, String editing_mode) {
		super(editingContext, endToEndFlow, editing_mode);
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
			
			final EndToEndFlow endToEndFlow = (EndToEndFlow)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GqamViewsRepository.General.Properties.isSchedulable)) {
				generalPart.setIsSchedulable(endToEndFlow.isIsSchedulable());
			}
			if (isAccessible(GqamViewsRepository.General.Properties.schedulabilitySlack)) {
				generalPart.setSchedulabilitySlack(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, endToEndFlow.getSchedulabilitySlack()));
			}
			
			if (isAccessible(GqamViewsRepository.General.Properties.endToEndScenario)) {
				// init part
				endToEndScenarioSettings = new EObjectFlatComboSettings(endToEndFlow, GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndScenario());
				generalPart.initEndToEndScenario(endToEndScenarioSettings);
				// set the button mode
				generalPart.setEndToEndScenarioButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.endToEndStimuli)) {
				endToEndStimuliSettings = new ReferencesTableSettings(endToEndFlow, GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndStimuli());
				generalPart.initEndToEndStimuli(endToEndStimuliSettings);
			}
			// init filters
			
			
			if (isAccessible(GqamViewsRepository.General.Properties.endToEndScenario)) {
				generalPart.addFilterToEndToEndScenario(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof BehaviorScenario);
					}
					
				});
				// Start of user code for additional businessfilters for endToEndScenario
				// End of user code
			}
			if (isAccessible(GqamViewsRepository.General.Properties.endToEndStimuli)) {
				generalPart.addFilterToEndToEndStimuli(new EObjectFilter(GqamPackage.Literals.WORKLOAD_EVENT));
				// Start of user code for additional businessfilters for endToEndStimuli
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
		if (editorKey == GqamViewsRepository.General.Properties.isSchedulable) {
			return GqamPackage.eINSTANCE.getEndToEndFlow_IsSchedulable();
		}
		if (editorKey == GqamViewsRepository.General.Properties.schedulabilitySlack) {
			return GqamPackage.eINSTANCE.getEndToEndFlow_SchedulabilitySlack();
		}
		if (editorKey == GqamViewsRepository.General.Properties.endToEndScenario) {
			return GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndScenario();
		}
		if (editorKey == GqamViewsRepository.General.Properties.endToEndStimuli) {
			return GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndStimuli();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EndToEndFlow endToEndFlow = (EndToEndFlow)semanticObject;
		if (GqamViewsRepository.General.Properties.isSchedulable == event.getAffectedEditor()) {
			endToEndFlow.setIsSchedulable((Boolean)event.getNewValue());
		}
		if (GqamViewsRepository.General.Properties.schedulabilitySlack == event.getAffectedEditor()) {
			endToEndFlow.setSchedulabilitySlack((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (GqamViewsRepository.General.Properties.endToEndScenario == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				endToEndScenarioSettings.setToReference((BehaviorScenario)event.getNewValue());
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
				endToEndScenarioSettings.setToReference(eObject);
			}
		}
		if (GqamViewsRepository.General.Properties.endToEndStimuli == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof WorkloadEvent) {
					endToEndStimuliSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				endToEndStimuliSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				endToEndStimuliSettings.move(event.getNewIndex(), (WorkloadEvent) event.getNewValue());
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
			if (GqamPackage.eINSTANCE.getEndToEndFlow_IsSchedulable().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.isSchedulable))
				generalPart.setIsSchedulable((Boolean)msg.getNewValue());
			
			if (GqamPackage.eINSTANCE.getEndToEndFlow_SchedulabilitySlack().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.schedulabilitySlack)) {
				if (msg.getNewValue() != null) {
					generalPart.setSchedulabilitySlack(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					generalPart.setSchedulabilitySlack("");
				}
			}
			if (GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndScenario().equals(msg.getFeature()) && generalPart != null && isAccessible(GqamViewsRepository.General.Properties.endToEndScenario))
				generalPart.setEndToEndScenario((EObject)msg.getNewValue());
			if (GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndStimuli().equals(msg.getFeature())  && isAccessible(GqamViewsRepository.General.Properties.endToEndStimuli))
				generalPart.updateEndToEndStimuli();
			
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
			GqamPackage.eINSTANCE.getEndToEndFlow_IsSchedulable(),
			GqamPackage.eINSTANCE.getEndToEndFlow_SchedulabilitySlack(),
			GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndScenario(),
			GqamPackage.eINSTANCE.getEndToEndFlow_EndToEndStimuli()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GqamViewsRepository.General.Properties.isSchedulable || key == GqamViewsRepository.General.Properties.schedulabilitySlack || key == GqamViewsRepository.General.Properties.endToEndScenario || key == GqamViewsRepository.General.Properties.endToEndStimuli || key == GqamViewsRepository.General.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == GqamViewsRepository.General.Properties.endToEndScenario;
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
				if (GqamViewsRepository.General.Properties.isSchedulable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getEndToEndFlow_IsSchedulable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getEndToEndFlow_IsSchedulable().getEAttributeType(), newValue);
				}
				if (GqamViewsRepository.General.Properties.schedulabilitySlack == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getEndToEndFlow_SchedulabilitySlack().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getEndToEndFlow_SchedulabilitySlack().getEAttributeType(), newValue);
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
