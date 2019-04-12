/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.analysis.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.internal.EMFModelValidationPlugin;
import org.eclipse.emf.validation.internal.service.AbstractGetConstraintsOperation;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.osgi.framework.Bundle;
import org.polarsys.time4sys.analysis.tools.helpers.ActivityExplorerContributionHelper;

public class ContextValidationActivities extends AbstractHyperlinkAdapter {

	public ContextValidationActivities() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
		// TODO Auto-generated constructor stub
	}

	public ContextValidationActivities(EObject root) {
		super(root);
		// TODO Auto-generated constructor stub
	}

	@Deprecated
	@Override
	/**Used before integration of the analysis repository*/
	protected void linkPressed(HyperlinkEvent event, EObject root, Session session) {
		// TODO Auto-generated method stub
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		Bundle bundle = Activator.getDefault().getBundle();
		// IContributor contributor =
		// ContributorFactoryOSGi.createContributor(bundle);
		List<String> rulesId = new ArrayList<>();
		for (IConfigurationElement analysisExtension : registry
				.getConfigurationElementsFor(ActivityExplorerContributionHelper.Analysis_Extension_ID)) {
			for (IConfigurationElement analysisContext : analysisExtension.getChildren("context")) {
				for (IConfigurationElement externalContext : getReferencedExtension(registry, analysisContext,
						"org.polarsys.time4sys.analysis.tools.analysisContexts", "contextId")) {
					for (IConfigurationElement rule : externalContext.getChildren("rules")) {
						rulesId.add(rule.getAttribute("ruleId"));
					}
				}
			}
			//Peut être à t'on seulement besoin du context
			//Si le context est OK -> On récupère le ClientSelector et on le passe à true
			// -> on fait un validate
			//On repasse le contexte Selector à false.
			for (IConfigurationElement constraintProvider : getAllReferencedExtension(registry,
					"org.eclipse.emf.validation.constraintProviders")) {
				for (IConfigurationElement constraints : constraintProvider.getChildren("constraints")) {
					//System.out.println(constraints.getAttribute("categories"));
					for (IConfigurationElement constraint : constraints.getChildren("constraint")) {
						if (rulesId.contains(constraint.getAttribute("id"))) {
							try {
								AbstractModelConstraint clazz = (AbstractModelConstraint) constraint
										.createExecutableExtension("class");
								ConstraintSeverity severity = ConstraintSeverity.getInstance(constraint.getAttribute("severity"));
								int status = Integer.valueOf(constraint.getAttribute("statusCode"));
								String name = constraint.getAttribute("name");
								
								Diagnostician.INSTANCE.validate(root);
							} catch (CoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}

	private List<IConfigurationElement> getReferencedExtension(IExtensionRegistry registry,
			IConfigurationElement analysisContext, String externalExtensionPointId, String attributeId) {
		List<IConfigurationElement> result = new ArrayList<IConfigurationElement>();
		String contextId = analysisContext.getAttribute(attributeId);
		for (IConfigurationElement extension : registry.getConfigurationElementsFor(externalExtensionPointId)) {
			if (contextId != null && contextId.equals(extension.getAttribute(attributeId))) {
				result.add(extension);
			}
		}
		return result;
	}

	private List<IConfigurationElement> getAllReferencedExtension(IExtensionRegistry registry,
			String externalExtensionPointId) {
		List<IConfigurationElement> result = new ArrayList<IConfigurationElement>();
		for (IConfigurationElement extension : registry.getConfigurationElementsFor(externalExtensionPointId)) {
			result.add(extension);
		}
		return result;
	}

//	 To create a new Descriptor
//	private final IConstraintDescriptor createDescriptor(int status, ConstraintSeverity severity, String name) {
//		IConstraintDescriptor descriptor = new AbstractConstraintDescriptor() {
//
//			public boolean targetsTypeOf(EObject object) {
//				return false;
//			}
//
//			public boolean targetsEvent(Notification notification) {
//				return false;
//			}
//
//			public int getStatusCode() {
//				return status;
//			}
//
//			public ConstraintSeverity getSeverity() {
//				return severity;
//			}
//
//			public String getPluginId() {
//				return EMFModelValidationPlugin.getPluginId();
//			}
//
//			public String getName() {
//				return name; //$NON-NLS-1$
//			}
//
//			public String getMessagePattern() {
//				return ""; //$NON-NLS-1$
//			}
//
//			public String getId() {
//				return getPluginId() + ".resourceMarker"; //$NON-NLS-1$
//			}
//
//			public EvaluationMode<?> getEvaluationMode() {
//				return EvaluationMode.BATCH;
//			}
//
//			public String getDescription() {
//				return null;
//			}
//
//			public String getBody() {
//				return null;
//			}
//		};
//		return descriptor;
//	}

	// To create a Constraint with this descriptor

	
	//To run validation: cf https://stackoverflow.com/questions/3667867/run-emf-validation-of-an-ecore-model-outside-of-eclipse
//	EValidator.Registry.INSTANCE.put(YourPackage.eINSTANCE, new YourValidator());
//
//	BasicDiagnostic diagnostics = new BasicDiagnostic();
//	boolean valid = true;
//	for (EObject eo : yourResource.getContents()) {
//	    Map<Object, Object> context = new HashMap<Object, Object>();
//	    valid &= Diagnostician.INSTANCE.validate(eo, diagnostics, context);
//	}

}
