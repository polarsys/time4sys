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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.polarsys.time4sys.marte.gqam.ConnectorKind;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.ui.views.gqam.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class PrecedenceRelationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String GENERAL_PART = "General"; //$NON-NLS-1$

	
	/**
	 * Settings for predec ReferencesTable
	 */
	private ReferencesTableSettings predecSettings;
	
	/**
	 * Settings for succes ReferencesTable
	 */
	private ReferencesTableSettings succesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PrecedenceRelationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject precedenceRelation, String editing_mode) {
		super(editingContext, precedenceRelation, editing_mode);
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
			
			final PrecedenceRelation precedenceRelation = (PrecedenceRelation)elt;
			final GeneralPropertiesEditionPart generalPart = (GeneralPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(GqamViewsRepository.General.Properties.connectorKind)) {
				generalPart.initConnectorKind(EEFUtils.choiceOfValues(precedenceRelation, GqamPackage.eINSTANCE.getPrecedenceRelation_ConnectorKind()), precedenceRelation.getConnectorKind());
			}
			if (isAccessible(GqamViewsRepository.General.Properties.predec)) {
				predecSettings = new ReferencesTableSettings(precedenceRelation, GqamPackage.eINSTANCE.getPrecedenceRelation_Predec());
				generalPart.initPredec(predecSettings);
			}
			if (isAccessible(GqamViewsRepository.General.Properties.succes)) {
				succesSettings = new ReferencesTableSettings(precedenceRelation, GqamPackage.eINSTANCE.getPrecedenceRelation_Succes());
				generalPart.initSucces(succesSettings);
			}
			// init filters
			
			if (isAccessible(GqamViewsRepository.General.Properties.predec)) {
				generalPart.addFilterToPredec(new EObjectFilter(GqamPackage.Literals.STEP));
				// Start of user code for additional businessfilters for predec
				// End of user code
			}
			if (isAccessible(GqamViewsRepository.General.Properties.succes)) {
				generalPart.addFilterToSucces(new EObjectFilter(GqamPackage.Literals.STEP));
				// Start of user code for additional businessfilters for succes
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
		if (editorKey == GqamViewsRepository.General.Properties.connectorKind) {
			return GqamPackage.eINSTANCE.getPrecedenceRelation_ConnectorKind();
		}
		if (editorKey == GqamViewsRepository.General.Properties.predec) {
			return GqamPackage.eINSTANCE.getPrecedenceRelation_Predec();
		}
		if (editorKey == GqamViewsRepository.General.Properties.succes) {
			return GqamPackage.eINSTANCE.getPrecedenceRelation_Succes();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PrecedenceRelation precedenceRelation = (PrecedenceRelation)semanticObject;
		if (GqamViewsRepository.General.Properties.connectorKind == event.getAffectedEditor()) {
			precedenceRelation.setConnectorKind((ConnectorKind)event.getNewValue());
		}
		if (GqamViewsRepository.General.Properties.predec == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Step) {
					predecSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				predecSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				predecSettings.move(event.getNewIndex(), (Step) event.getNewValue());
			}
		}
		if (GqamViewsRepository.General.Properties.succes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Step) {
					succesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				succesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				succesSettings.move(event.getNewIndex(), (Step) event.getNewValue());
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
			if (GqamPackage.eINSTANCE.getPrecedenceRelation_ConnectorKind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(GqamViewsRepository.General.Properties.connectorKind))
				generalPart.setConnectorKind((ConnectorKind)msg.getNewValue());
			
			if (GqamPackage.eINSTANCE.getPrecedenceRelation_Predec().equals(msg.getFeature())  && isAccessible(GqamViewsRepository.General.Properties.predec))
				generalPart.updatePredec();
			if (GqamPackage.eINSTANCE.getPrecedenceRelation_Succes().equals(msg.getFeature())  && isAccessible(GqamViewsRepository.General.Properties.succes))
				generalPart.updateSucces();
			
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
			GqamPackage.eINSTANCE.getPrecedenceRelation_ConnectorKind(),
			GqamPackage.eINSTANCE.getPrecedenceRelation_Predec(),
			GqamPackage.eINSTANCE.getPrecedenceRelation_Succes()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == GqamViewsRepository.General.Properties.connectorKind || key == GqamViewsRepository.General.Properties.predec || key == GqamViewsRepository.General.Properties.succes || key == GqamViewsRepository.General.Properties.class;
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
				if (GqamViewsRepository.General.Properties.connectorKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GqamPackage.eINSTANCE.getPrecedenceRelation_ConnectorKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GqamPackage.eINSTANCE.getPrecedenceRelation_ConnectorKind().getEAttributeType(), newValue);
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
