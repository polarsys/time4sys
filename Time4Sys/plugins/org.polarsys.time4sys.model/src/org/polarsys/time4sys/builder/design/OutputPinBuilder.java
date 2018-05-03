/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class OutputPinBuilder extends PinBuilder<OutputPin, OutputPinBuilder> {
	
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;	
	
	public OutputPinBuilder() {
		super(gqamFactory.createOutputPin());
	}
	
	public OutputPinBuilder(final OutputPin value) {
		super(value);
	}

	public OutputPinBuilder(final Step step) {
		this();
		step.getOutputPin().add(pin);
	}

	@Override
	protected OutputPinBuilder self() {
		return this;
	}
	
	public int getSizeOfSuccessors() {
		return pin.getSuccessors().size();
	}

	public void thatActivates(StepBuilder... successors) {
		for(StepBuilder st: successors) {
			pin.getSuccessors().add(st.hasAtLeastOneInputPin().build());
		}
	}
	
	public void thatActivates(InputPinBuilder... successors) {
		for(InputPinBuilder st: successors) {
			pin.getSuccessors().add(st.build());
		}
	}
}
