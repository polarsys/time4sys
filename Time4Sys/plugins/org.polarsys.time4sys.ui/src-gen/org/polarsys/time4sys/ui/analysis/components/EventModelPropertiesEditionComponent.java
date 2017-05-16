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
package org.polarsys.time4sys.ui.analysis.components;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.EventModel;
import org.polarsys.time4sys.analysis.EventModelContainer;
import org.polarsys.time4sys.analysis.Offset;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.EventModelPropertiesEditionPart;


/**
 * 
 * @generated
 */
public class EventModelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for offsets ReferencesTable
	 */
	protected ReferencesTableSettings offsetsSettings;
	
	/**
	 * Settings for parent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parent_Settings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public EventModelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eventModel, String editing_mode) {
		super(editingContext, eventModel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.EventModel.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * @generated
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final EventModel eventModel = (EventModel)elt;
			final EventModelPropertiesEditionPart basePart = (EventModelPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.EventModel.Properties.offsets)) {
				offsetsSettings = new ReferencesTableSettings(eventModel, AnalysisPackage.eINSTANCE.getEventModel_Offsets());
				basePart.initOffsets(offsetsSettings);
			}
			if (isAccessible(AnalysisViewsRepository.EventModel.Properties.period))
				basePart.setPeriod(EEFConverterUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, eventModel.getPeriod()));
			
			if (isAccessible(AnalysisViewsRepository.EventModel.Properties.jitter))
				basePart.setJitter(EEFConverterUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, eventModel.getJitter()));
			
			if (isAccessible(AnalysisViewsRepository.EventModel.Properties.dmin))
				basePart.setDmin(EEFConverterUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, eventModel.getDmin()));
			
			if (isAccessible(AnalysisViewsRepository.EventModel.Properties.parent_)) {
				// init part
				parent_Settings = new EObjectFlatComboSettings(eventModel, AnalysisPackage.eINSTANCE.getEventModel_Parent());
				basePart.initParent_(parent_Settings);
				// set the button mode
				basePart.setParent_ButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.EventModel.Properties.isSporadic)) {
				basePart.setIsSporadic(eventModel.isIsSporadic());
			}
			// init filters
			if (isAccessible(AnalysisViewsRepository.EventModel.Properties.offsets)) {
				basePart.addFilterToOffsets(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Offset); //$NON-NLS-1$ 
					}
			
				});
			}
			
			
			
			if (isAccessible(AnalysisViewsRepository.EventModel.Properties.parent_)) {
				basePart.addFilterToParent_(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EventModelContainer); //$NON-NLS-1$ 
					}
					
				});
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
		if (editorKey == AnalysisViewsRepository.EventModel.Properties.offsets) {
			return AnalysisPackage.eINSTANCE.getEventModel_Offsets();
		}
		if (editorKey == AnalysisViewsRepository.EventModel.Properties.period) {
			return AnalysisPackage.eINSTANCE.getEventModel_Period();
		}
		if (editorKey == AnalysisViewsRepository.EventModel.Properties.jitter) {
			return AnalysisPackage.eINSTANCE.getEventModel_Jitter();
		}
		if (editorKey == AnalysisViewsRepository.EventModel.Properties.dmin) {
			return AnalysisPackage.eINSTANCE.getEventModel_Dmin();
		}
		if (editorKey == AnalysisViewsRepository.EventModel.Properties.parent_) {
			return AnalysisPackage.eINSTANCE.getEventModel_Parent();
		}
		if (editorKey == AnalysisViewsRepository.EventModel.Properties.isSporadic) {
			return AnalysisPackage.eINSTANCE.getEventModel_IsSporadic();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EventModel eventModel = (EventModel)semanticObject;
		if (AnalysisViewsRepository.EventModel.Properties.offsets == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, offsetsSettings, editingContext.getAdapterFactory());
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
				offsetsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				offsetsSettings.move(event.getNewIndex(), (Offset) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.EventModel.Properties.period == event.getAffectedEditor()) {
			eventModel.setPeriod((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(AnalysisPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.EventModel.Properties.jitter == event.getAffectedEditor()) {
			eventModel.setJitter((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(AnalysisPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.EventModel.Properties.dmin == event.getAffectedEditor()) {
			eventModel.setDmin((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(AnalysisPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.EventModel.Properties.parent_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parent_Settings.setToReference((EventModelContainer)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, parent_Settings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (AnalysisViewsRepository.EventModel.Properties.isSporadic == event.getAffectedEditor()) {
			eventModel.setIsSporadic((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			EventModelPropertiesEditionPart basePart = (EventModelPropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getEventModel_Offsets().equals(msg.getFeature()) && isAccessible(AnalysisViewsRepository.EventModel.Properties.offsets))
				basePart.updateOffsets();
			if (AnalysisPackage.eINSTANCE.getEventModel_Period().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.EventModel.Properties.period)) {
				if (msg.getNewValue() != null) {
					basePart.setPeriod(EcoreUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					basePart.setPeriod("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getEventModel_Jitter().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.EventModel.Properties.jitter)) {
				if (msg.getNewValue() != null) {
					basePart.setJitter(EcoreUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					basePart.setJitter("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getEventModel_Dmin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.EventModel.Properties.dmin)) {
				if (msg.getNewValue() != null) {
					basePart.setDmin(EcoreUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					basePart.setDmin("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getEventModel_Parent().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.EventModel.Properties.parent_))
				basePart.setParent_((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getEventModel_IsSporadic().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.EventModel.Properties.isSporadic))
				basePart.setIsSporadic((Boolean)msg.getNewValue());
			
			
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
			AnalysisPackage.eINSTANCE.getEventModel_Offsets(),
			AnalysisPackage.eINSTANCE.getEventModel_Period(),
			AnalysisPackage.eINSTANCE.getEventModel_Jitter(),
			AnalysisPackage.eINSTANCE.getEventModel_Dmin(),
			AnalysisPackage.eINSTANCE.getEventModel_Parent(),
			AnalysisPackage.eINSTANCE.getEventModel_IsSporadic()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.EventModel.Properties.isSporadic;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (AnalysisViewsRepository.EventModel.Properties.period == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getEventModel_Period().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getEventModel_Period().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.EventModel.Properties.jitter == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getEventModel_Jitter().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getEventModel_Jitter().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.EventModel.Properties.dmin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getEventModel_Dmin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getEventModel_Dmin().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.EventModel.Properties.isSporadic == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getEventModel_IsSporadic().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getEventModel_IsSporadic().getEAttributeType(), newValue);
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
