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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.polarsys.time4sys.analysis.Fragment;
import org.polarsys.time4sys.analysis.SchedulableElement;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

public class AnalysisNameAndTimeEditor implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		String name = (String) parameters.get("nameAndTime");

		String[] names = name.split("\\[");

		if (names.length > 1) {
			setTime(selections, "[" + names[1].trim());
			setName(selections, names[0].trim());
		} else if (names.length == 1) {
			setName(selections, names[0].trim());
		}

	}

	public String getFullLabel(Duration duration) {
		StringBuffer result = new StringBuffer();
		result.append(" (value: ");
		result.append(duration.getValue());
		result.append(", unit: ");
		result.append(duration.getUnit());
		return result.toString();
	}

	private void setTime(Collection<? extends EObject> selections, String time) {
		for (EObject sel : selections) {
			if (sel instanceof Fragment) {
				Fragment frag = (Fragment) sel;
				frag.setCET(NfpFactory.eINSTANCE.createTimeIntervalFromString(time));
			} else if (sel instanceof SchedulableElement) {
				SchedulableElement se = (SchedulableElement) sel;
				se.setCET(NfpFactory.eINSTANCE.createTimeInterval());
			}
		}
	}

	private void setName(Collection<? extends EObject> selections, String name) {
		for (EObject sel : selections) {
			if (sel instanceof Fragment) {
				Fragment frag = (Fragment) sel;
				frag.setName(name);
			} else if (sel instanceof SchedulableElement) {
				SchedulableElement se = (SchedulableElement) sel;
				se.setName(name);
			}
		}
	}

}
