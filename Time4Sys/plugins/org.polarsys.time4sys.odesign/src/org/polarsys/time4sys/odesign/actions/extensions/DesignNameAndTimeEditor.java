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
package org.polarsys.time4sys.odesign.actions.extensions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.ExecutionStep;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.hrm.HardwareComputingResource;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.odesign.service.MarteServices;

// WARNING This NameAndTimeEditor class only treat the time !
public class DesignNameAndTimeEditor implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		NfpFactory nfpFactory = NfpFactory.eINSTANCE;
		for (EObject sel : selections) {
			if (sel instanceof ExecutionStep) {
				ExecutionStep step = (ExecutionStep) sel;

				// String is in the form: Name[bcet,wcet]unit
				// example: Op1[3,4]ms
				String name = (String) parameters.get("nameAndTime");
				String[] names = name.split("\\[");

				if (names.length > 1) {
					// setTime(selections, names[1].trim());
					String[] values = names[1].trim().split(":");
					String[] unit = values[1].trim().split("]");

					if (values.length > 1) {
						if (unit.length > 1) {
							step.setBestCET(nfpFactory.createDurationFromString(values[0].trim() + unit[1].trim()));
							step.setWorstCET(nfpFactory.createDurationFromString(unit[0].trim() + unit[1].trim()));
						}
					}
					if (!names[0].trim().equals("")) {
						step.setName(names[0].trim());
					}

				} else if (names.length == 1) {
					step.setName(names[0].trim());
				}
			}
			if (sel instanceof SoftwareSchedulableResource) {
				SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) sel;

				// String is in the form: value unit
				// example: 40ms
				String offsetDuration = (String) parameters.get("offsetDuration");
				String periodDuration = (String) parameters.get("periodDuration");
				String jitterDuration = (String) parameters.get("jitterDuration");

				WorkloadEvent we = null;

				if (swSchedRes.eContainer() instanceof HardwareComputingResource) {
					if (swSchedRes.eContainer().eContainer() instanceof ResourcePackage) {
						if (swSchedRes.eContainer().eContainer().eContainer() instanceof DesignModel) {
							we = MarteServices.getWorkloadEvent(swSchedRes,
									(DesignModel) swSchedRes.eContainer().eContainer().eContainer());
						}
					}
				}

				if (we != null) {
					if (we.getPattern() instanceof PeriodicPattern) {
						PeriodicPattern pattern = (PeriodicPattern) we.getPattern();
						if (offsetDuration != null) {
							pattern.setPhase(nfpFactory.createDurationFromString(offsetDuration));
						}
						if (periodDuration != null) {
							pattern.setPeriod(nfpFactory.createDurationFromString(periodDuration));
						}
						if (jitterDuration != null) {
							pattern.setJitter(nfpFactory.createDurationFromString(jitterDuration));
						}
					}
				}
			}
		}
	}
}
