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

import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.Communication;
import org.polarsys.time4sys.analysis.CommunicationResource;
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.analysis.Scheduler;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.CommunicationResourcePropertiesEditionPart;


/**
 * 
 * @generated
 */
public class CommunicationResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	/**
	 * @generated
	 */
	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for scheduler EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings schedulerSettings;
	
	/**
	 * Settings for parent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings parent_Settings;
	
	/**
	 * Settings for links ReferencesTable
	 */
	private ReferencesTableSettings linksSettings;
	
	/**
	 * Settings for communicationsAffectedOn ReferencesTable
	 */
	private ReferencesTableSettings communicationsAffectedOnSettings;
	
	
	/**
	 * Default constructor
	 * @generated
	 */
	public CommunicationResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject communicationResource, String editing_mode) {
		super(editingContext, communicationResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AnalysisViewsRepository.class;
		partKey = AnalysisViewsRepository.CommunicationResource.class;
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
			
			final CommunicationResource communicationResource = (CommunicationResource)elt;
			final CommunicationResourcePropertiesEditionPart basePart = (CommunicationResourcePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, communicationResource.getName()));
			
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.scheduler)) {
				// init part
				schedulerSettings = new EObjectFlatComboSettings(communicationResource, AnalysisPackage.eINSTANCE.getResource_Scheduler());
				basePart.initScheduler(schedulerSettings);
				// set the button mode
				basePart.setSchedulerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.parent_)) {
				// init part
				parent_Settings = new EObjectFlatComboSettings(communicationResource, AnalysisPackage.eINSTANCE.getResource_Parent());
				basePart.initParent_(parent_Settings);
				// set the button mode
				basePart.setParent_ButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.speedFactor)) {
				basePart.setSpeedFactor(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, communicationResource.getSpeedFactor()));
			}
			
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.delay))
				basePart.setDelay(EEFConverterUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, communicationResource.getDelay()));
			
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.links)) {
				linksSettings = new ReferencesTableSettings(communicationResource, AnalysisPackage.eINSTANCE.getCommunicationResource_Links());
				basePart.initLinks(linksSettings);
			}
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn)) {
				communicationsAffectedOnSettings = new ReferencesTableSettings(communicationResource, AnalysisPackage.eINSTANCE.getCommunicationResource_CommunicationsAffectedOn());
				basePart.initCommunicationsAffectedOn(communicationsAffectedOnSettings);
			}
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.protocolName))
				basePart.setProtocolName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, communicationResource.getProtocolName()));
			
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.bandwidth)) {
				basePart.setBandwidth(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, communicationResource.getBandwidth()));
			}
			
			// init filters
			
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.scheduler)) {
				basePart.addFilterToScheduler(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Scheduler);
					}
					
				});
			}
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.parent_)) {
				basePart.addFilterToParent_(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof AnalyzedSystem);
					}
					
				});
			}
			
			
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.links)) {
				basePart.addFilterToLinks(new EObjectFilter(AnalysisPackage.Literals.COMPUTING_RESOURCE));
			}
			if (isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn)) {
				basePart.addFilterToCommunicationsAffectedOn(new EObjectFilter(AnalysisPackage.Literals.COMMUNICATION));
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
		if (editorKey == AnalysisViewsRepository.CommunicationResource.Properties.name) {
			return AnalysisPackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == AnalysisViewsRepository.CommunicationResource.Properties.scheduler) {
			return AnalysisPackage.eINSTANCE.getResource_Scheduler();
		}
		if (editorKey == AnalysisViewsRepository.CommunicationResource.Properties.parent_) {
			return AnalysisPackage.eINSTANCE.getResource_Parent();
		}
		if (editorKey == AnalysisViewsRepository.CommunicationResource.Properties.speedFactor) {
			return AnalysisPackage.eINSTANCE.getResource_SpeedFactor();
		}
		if (editorKey == AnalysisViewsRepository.CommunicationResource.Properties.delay) {
			return AnalysisPackage.eINSTANCE.getResource_Delay();
		}
		if (editorKey == AnalysisViewsRepository.CommunicationResource.Properties.links) {
			return AnalysisPackage.eINSTANCE.getCommunicationResource_Links();
		}
		if (editorKey == AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn) {
			return AnalysisPackage.eINSTANCE.getCommunicationResource_CommunicationsAffectedOn();
		}
		if (editorKey == AnalysisViewsRepository.CommunicationResource.Properties.protocolName) {
			return AnalysisPackage.eINSTANCE.getCommunicationResource_ProtocolName();
		}
		if (editorKey == AnalysisViewsRepository.CommunicationResource.Properties.bandwidth) {
			return AnalysisPackage.eINSTANCE.getCommunicationResource_Bandwidth();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CommunicationResource communicationResource = (CommunicationResource)semanticObject;
		if (AnalysisViewsRepository.CommunicationResource.Properties.name == event.getAffectedEditor()) {
			communicationResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.CommunicationResource.Properties.scheduler == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				schedulerSettings.setToReference((Scheduler)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Scheduler eObject = AnalysisFactory.eINSTANCE.createScheduler();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				schedulerSettings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.CommunicationResource.Properties.parent_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				parent_Settings.setToReference((AnalyzedSystem)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				AnalyzedSystem eObject = AnalysisFactory.eINSTANCE.createAnalyzedSystem();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				parent_Settings.setToReference(eObject);
			}
		}
		if (AnalysisViewsRepository.CommunicationResource.Properties.speedFactor == event.getAffectedEditor()) {
			communicationResource.setSpeedFactor((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (AnalysisViewsRepository.CommunicationResource.Properties.delay == event.getAffectedEditor()) {
			communicationResource.setDelay((org.polarsys.time4sys.marte.nfp.Duration)EEFConverterUtil.createFromString(AnalysisPackage.Literals.NFP_DURATION, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.CommunicationResource.Properties.links == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ComputingResource) {
					linksSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				linksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				linksSettings.move(event.getNewIndex(), (ComputingResource) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Communication) {
					communicationsAffectedOnSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				communicationsAffectedOnSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				communicationsAffectedOnSettings.move(event.getNewIndex(), (Communication) event.getNewValue());
			}
		}
		if (AnalysisViewsRepository.CommunicationResource.Properties.protocolName == event.getAffectedEditor()) {
			communicationResource.setProtocolName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (AnalysisViewsRepository.CommunicationResource.Properties.bandwidth == event.getAffectedEditor()) {
			communicationResource.setBandwidth((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			CommunicationResourcePropertiesEditionPart basePart = (CommunicationResourcePropertiesEditionPart)editingPart;
			if (AnalysisPackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getResource_Scheduler().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.scheduler))
				basePart.setScheduler((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getResource_Parent().equals(msg.getFeature()) && basePart != null && isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.parent_))
				basePart.setParent_((EObject)msg.getNewValue());
			if (AnalysisPackage.eINSTANCE.getResource_SpeedFactor().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.speedFactor)) {
				if (msg.getNewValue() != null) {
					basePart.setSpeedFactor(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setSpeedFactor("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getResource_Delay().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.delay)) {
				if (msg.getNewValue() != null) {
					basePart.setDelay(EcoreUtil.convertToString(AnalysisPackage.Literals.NFP_DURATION, msg.getNewValue()));
				} else {
					basePart.setDelay("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getCommunicationResource_Links().equals(msg.getFeature())  && isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.links))
				basePart.updateLinks();
			if (AnalysisPackage.eINSTANCE.getCommunicationResource_CommunicationsAffectedOn().equals(msg.getFeature())  && isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn))
				basePart.updateCommunicationsAffectedOn();
			if (AnalysisPackage.eINSTANCE.getCommunicationResource_ProtocolName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.protocolName)) {
				if (msg.getNewValue() != null) {
					basePart.setProtocolName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setProtocolName("");
				}
			}
			if (AnalysisPackage.eINSTANCE.getCommunicationResource_Bandwidth().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(AnalysisViewsRepository.CommunicationResource.Properties.bandwidth)) {
				if (msg.getNewValue() != null) {
					basePart.setBandwidth(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setBandwidth("");
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
			AnalysisPackage.eINSTANCE.getNamedElement_Name(),
			AnalysisPackage.eINSTANCE.getResource_Scheduler(),
			AnalysisPackage.eINSTANCE.getResource_Parent(),
			AnalysisPackage.eINSTANCE.getResource_SpeedFactor(),
			AnalysisPackage.eINSTANCE.getResource_Delay(),
			AnalysisPackage.eINSTANCE.getCommunicationResource_Links(),
			AnalysisPackage.eINSTANCE.getCommunicationResource_CommunicationsAffectedOn(),
			AnalysisPackage.eINSTANCE.getCommunicationResource_ProtocolName(),
			AnalysisPackage.eINSTANCE.getCommunicationResource_Bandwidth()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * @generated
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AnalysisViewsRepository.CommunicationResource.Properties.scheduler || key == AnalysisViewsRepository.CommunicationResource.Properties.parent_ || key == AnalysisViewsRepository.CommunicationResource.Properties.protocolName;
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
				if (AnalysisViewsRepository.CommunicationResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.CommunicationResource.Properties.speedFactor == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getResource_SpeedFactor().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getResource_SpeedFactor().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.CommunicationResource.Properties.delay == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getResource_Delay().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getResource_Delay().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.CommunicationResource.Properties.protocolName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getCommunicationResource_ProtocolName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getCommunicationResource_ProtocolName().getEAttributeType(), newValue);
				}
				if (AnalysisViewsRepository.CommunicationResource.Properties.bandwidth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(AnalysisPackage.eINSTANCE.getCommunicationResource_Bandwidth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AnalysisPackage.eINSTANCE.getCommunicationResource_Bandwidth().getEAttributeType(), newValue);
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
