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
package org.polarsys.time4sys.odesign.service;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

public class OffsetServices implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject sel : selections) {
			if (sel instanceof SoftwareSchedulableResource) {
				SoftwareSchedulableResource schedRes = (SoftwareSchedulableResource) sel;

				// String is in the form: value unit
				// example: 40ms
				String value = (String) parameters.get("offsetParams");
				Duration duration = NfpFactory.eINSTANCE.createDurationFromString(value);

			}
			if (sel instanceof EndToEndFlow) {
				EndToEndFlow endToEndFlow = (EndToEndFlow) sel;
				// String is in the form: value unit
				// example: 40ms
				String value = (String) parameters.get("offsetParams");
				Duration duration = NfpFactory.eINSTANCE.createDurationFromString(value);
				endToEndFlow.setEndToEndDeadline(duration);
			}
		}

	}

}
