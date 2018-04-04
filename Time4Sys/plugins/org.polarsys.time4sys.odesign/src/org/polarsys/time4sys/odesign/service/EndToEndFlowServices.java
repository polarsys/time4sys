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
package org.polarsys.time4sys.odesign.service;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;

public class EndToEndFlowServices {

	/**
	 * used in odesign
	 * 
	 * @param current
	 * @return current if it is a diagram or the diagram that contains current
	 *         if it is a DDiagramElement
	 */
	public EObject filterInvolved(EObject elem, DNodeContainer elementView ) {
			DNodeContainer node = (DNodeContainer) elementView;
			EObject obj = ((DSemanticDiagram) node.getParentDiagram()).getTarget();
			if (obj instanceof EndToEndFlow) {
				if (((EndToEndFlow) obj).getInvolvedElement().contains(elem)){
					return elem;
				}
			}
		return null;
	}
	
	/**
	 * used in odesign
	 * 
	 * @param current
	 * @return current if it is a diagram or the diagram that contains current
	 *         if it is a DDiagramElement
	 */
	public EObject filterInvolved(EObject elem, DSemanticDiagram diagram ) {
			EObject obj = ((DSemanticDiagram) diagram).getTarget();
			if (obj instanceof EndToEndFlow) {
				if (((EndToEndFlow) obj).getInvolvedElement().contains(elem)){
					return elem;
				}
			}
		return null;
	}
	
	/**
	 * used in odesign
	 * 
	 * @param current
	 * @return current if it is a diagram or the diagram that contains current
	 *         if it is a DDiagramElement
	 */
	public EObject removeInvolvement(EObject elem, DNodeContainer elementView ) {
			DNodeContainer node = (DNodeContainer) elementView;
			EObject obj = ((DSemanticDiagram) node.getParentDiagram()).getTarget();
			if (obj instanceof EndToEndFlow && elem instanceof Step) {
				EndToEndFlow etef = (EndToEndFlow) obj;
				Step step = (Step) elem;
				etef.getInvolvedElement().remove(step);
				etef.getInvolvedElement().removeAll(step.getInputPin());
				etef.getInvolvedElement().removeAll(step.getInputPin());
				for (InputPin input : step.getInputPin()) {
					etef.getInvolvedElement().removeAll(input.getPredecessors());
				}
				for (OutputPin output : step.getOutputPin()) {
					etef.getInvolvedElement().removeAll(output.getSuccessors());
				}
				etef.getInvolvedElement().removeAll(step.getOutputPin());
			}
		return null;
	}
}
