/*******************************************************************************
 * Copyright (c) 2016, 2018 Artal Technologies and others.
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
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;

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
