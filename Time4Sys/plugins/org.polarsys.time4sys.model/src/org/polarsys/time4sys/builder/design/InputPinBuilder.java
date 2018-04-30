/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
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
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class InputPinBuilder extends PinBuilder<InputPin,InputPinBuilder> {
	
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;	
	
	public InputPinBuilder() {
		super(gqamFactory.createInputPin());
	}
	
	public InputPinBuilder(final InputPin value) {
		super(value);
	}

	public InputPinBuilder(final Step step) {
		this();
		step.getInputPin().add(pin);
	}

	@Override
	protected InputPinBuilder self() {
		return this;
	}

	public int getSizeOfPredecessors() {
		return pin.getPredecessors().size();
	}
	
	public InputPinBuilder activatedBy(OutputPinBuilder... predecessors) {
		for(OutputPinBuilder pred: predecessors) {
			pred.thatActivates(this);
		}
		return this;
	}
	
	public InputPinBuilder activatedBy(StepBuilder... predecessors) {
		for(StepBuilder pred: predecessors) {
			pred.hasAtLeastOneOutputPin().thatActivates(this);
		}
		return this;
	}
}
