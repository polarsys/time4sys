/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and code
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * @author loic
 *
 */
public class ActivationPropagator extends AbstractTransformation {

	public static final String TRANS_NAME = ActivationPropagator.class.getSimpleName();
	public static final String CTRL2DATAFLOW_RULE = "control2data-flow rule";

	public static Transformation transform(final Project project, final DesignModel source) {
		return new ActivationPropagator(project, source).transform();
	}
	
	protected Queue<Link> controlFlowOutputPinWithCauseLnks = new LinkedList<>();
	private Context control2dataFlow;
	
	/**
	 * @param project
	 * @param source
	 */
	public ActivationPropagator(final Project project, final DesignModel source) {
		super(project, source, TRANS_NAME);
	}

	@Override
	public void createRules() {
		super.createRules();
		control2dataFlow = mappingFactory.createContext(CTRL2DATAFLOW_RULE);
		mapping.getRules().add(control2dataFlow);
	}
	
	@Override
	public void copied(final EObject source, final Link lnk, final EObject theCopy) {
		if (source instanceof OutputPin && ((OutputPin)source).isIsControl()) {
			final Step sourceStep = (Step)source.eContainer();
			if (sourceStep.getCause() != null && !sourceStep.getCause().isEmpty()) {
				controlFlowOutputPinWithCauseLnks.add(lnk);
			}
		}
	}

	@Override
	protected void finalize(final DesignModel target) {
		while(!controlFlowOutputPinWithCauseLnks.isEmpty()) {
			final Link lnk = controlFlowOutputPinWithCauseLnks.poll();
			final OutputPin originalOutputPin = ((OutputPin)lnk.getUniqueSourceValue(IdentityDerivation.ORIGINAL_ROLE));
			final OutputPin copyOutputPin = ((OutputPin)lnk.getUniqueTargetValue(IdentityDerivation.COPY_ROLE));
			final Step copyStepWithCause = (Step)copyOutputPin.eContainer();
			copyOutputPin.setIsControl(false);
			lnk.setRationale(control2dataFlow);
			for (InputPin copyInputPin: copyOutputPin.getSuccessors()) {
				copyInputPin.setIsControl(false);
				for(Link lnkInput: mapping.getLinksForSlice(copyInputPin)) {
					lnkInput.setRationale(control2dataFlow);
					final InputPin originalInputPin = (InputPin) lnkInput.getUniqueSourceValue(COPY_ROLE);
					final Step copyNextStep = ((Step)copyInputPin.eContainer());
					propagateWorkloadEvt(target, originalOutputPin, originalInputPin, copyStepWithCause, copyNextStep);
					for(OutputPin outputPinWithNewlyCause: copyNextStep.getOutputPin()) {
						controlFlowOutputPinWithCauseLnks.addAll(mapping.getLinksForSlice(outputPinWithNewlyCause));
					}
				}
				
			}
		}
	}

	private void propagateWorkloadEvt(
			final DesignModel copyDesign,
			final OutputPin originalOutputPin,
			final InputPin originalInputPin,
			final Step copyStepWithCause,
			final Step copyNextStep) {
		
		final Copier copier = new EcoreUtil.Copier();
		final Collection<WorkloadEvent> copyCauses = copier.copyAll(copyStepWithCause.getCause());
		copier.copyReferences();
		for(WorkloadEvent evt: copyCauses) {
			evt.setName(evt.getName() + "_x_" + copyNextStep.getName());
		}
		copyDesign.getWorkloadBehavior().getDemand().addAll(copyCauses);
		copyNextStep.getCause().addAll(copyCauses);
		//TODO create link
	}

}
