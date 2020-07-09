/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.wizard;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.CommunicationStep;
import org.polarsys.time4sys.marte.gqam.ExecutionStep;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.odesign.service.DiagramServices;

@SuppressWarnings("restriction")
public class ShowHideBSAndSteps extends ShowHideWizard {

	public ShowHideBSAndSteps() {
		super();
	}

	@Override
	protected void updateDiagram(EObject context, String elementToCreateMapping, final ShowHideWizard wizard) {
		final Collection<EObject> selectedElements = wizard.getSelectedEObjects();
		final Collection<EObject> unselectedElements = wizard.getUnselectedEObjects();

		for (EObject eObject : unselectedElements) {
			if (eObject instanceof BehaviorScenario) {
				for (EObject step : ((BehaviorScenario) eObject).getSteps()) {
					Collection<EObject> representations = new EObjectQuery(step)
							.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
					for (EObject representation : representations) {
						if (((DNodeSpec) representation).getParentDiagram().equals(context)) {
							DiagramServices.getDiagramServices().removeContainerView(representation);
						}
					}
				}
			}
			removeObjectInDiagram(context, eObject);
		}

		for (EObject eObject : selectedElements) {
			if (eObject instanceof BehaviorScenario) {
				DDiagram diag = (DDiagram) context;
				DiagramElementMapping mapping = DiagramServices.getDiagramServices()
						.getMappingByName(diag.getDescription(), elementToCreateMapping);
				if (mapping instanceof NodeMapping) {
					DiagramServices.getDiagramServices().createNode((NodeMapping) mapping, eObject, diag, diag);

					for (EObject step : ((BehaviorScenario) eObject).getSteps()) {
						if (step instanceof ExecutionStep) {
							SchedulableResource res = ((Step) step).getConcurRes();
							Collection<EObject> representations = new EObjectQuery(res)
									.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
							for (EObject representation : representations) {
								if ((representation instanceof DNodeContainer)
										&& ((DNodeContainer) representation).getParentDiagram().equals(context)) {
									DiagramElementMapping stepMapping = DiagramServices.getDiagramServices()
											.getMappingByName(diag.getDescription(), "ExecutionStep");
									DiagramServices.getDiagramServices().createNode((NodeMapping) stepMapping,
											step, (DNodeContainer) representation, diag);
								}
							}
						} else if (step instanceof CommunicationStep) {
							CommunicationResource res = ((CommunicationStep) step).getComRes();
							Collection<EObject> representations = new EObjectQuery(res)
									.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
							for (EObject representation : representations) {
								if ((representation instanceof DNodeContainer)
										&& ((DNodeContainer) representation).getParentDiagram().equals(context)) {
									DiagramElementMapping stepMapping = DiagramServices.getDiagramServices()
											.getMappingByName(diag.getDescription(), "ComStep");
									DiagramServices.getDiagramServices().createNode((NodeMapping) stepMapping,
											step, (DNodeContainer) representation, diag);
								}
							}
						}
					}
				}
			}
		}
	}
}
