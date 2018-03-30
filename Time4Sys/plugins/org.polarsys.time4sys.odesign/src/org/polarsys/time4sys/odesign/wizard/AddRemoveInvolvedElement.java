/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.CommunicationStep;
import org.polarsys.time4sys.marte.gqam.ExecutionStep;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.odesign.service.DiagramServices;

@SuppressWarnings("restriction")
public class AddRemoveInvolvedElement extends ShowHideWizard {

	public AddRemoveInvolvedElement() {
		super();
	}

	@Override
	protected void updateDiagram(EObject context, String elementToCreateMapping, final ShowHideWizard wizard) {
		final Collection<EObject> selectedElements = wizard.getSelectedEObjects();
		final Collection<EObject> unselectedElements = wizard.getUnselectedEObjects();
		if (context instanceof DNodeContainer) {
			DNodeContainer node = (DNodeContainer) context;
			Step stepContext = (Step) ((DNodeContainer) context).getTarget();
			EObject obj = ((DSemanticDiagram) node.getParentDiagram()).getTarget();

			if (obj instanceof EndToEndFlow) {
				EndToEndFlow etef = (EndToEndFlow) obj;
				for (EObject eObject : unselectedElements) {
					if (eObject instanceof Step) {
						Step step = (Step) eObject;
						for (InputPin inputPin : step.getInputPin()) {
							for (OutputPin outputPin : inputPin.getPredecessors()) {
								if (stepContext.getOutputPin().contains(outputPin)) {
									etef.getInvolvedElement().remove(inputPin);
									etef.getInvolvedElement().remove(outputPin);
								}
							}
						}
						etef.getInvolvedElement().remove(step);
					}
				}

				for (EObject eObject : selectedElements) {
					if (eObject instanceof Step) {
						Step step = (Step) eObject;
						for (InputPin inputPin : step.getInputPin()) {
							for (OutputPin outputPin : inputPin.getPredecessors()) {
								if (stepContext.getOutputPin().contains(outputPin)) {
									etef.getInvolvedElement().add(outputPin);
									etef.getInvolvedElement().add(inputPin);
								}
							}
						}
						etef.getInvolvedElement().add(step);
					}
				}
			}
		}
	}

}
