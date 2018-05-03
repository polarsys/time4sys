/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.hrm.HardwareArbiter;
import org.polarsys.time4sys.marte.hrm.HardwareBus;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class BusBuilder {
	
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;

	private HardwareBus bus;
	private DesignBuilder designBuilder;

	/**
	 * @param designBuilder 
	 * @param bus 
	 * 
	 */
	public BusBuilder(DesignBuilder designBuilder, HardwareBus bus) {
		this.bus = bus;
		this.designBuilder = designBuilder;
	}

	public BusBuilder called(final String name) {
		bus.setName(name);
		return this;
	}

	public BusBuilder thatEmits(final TaskBuilder... tasks) {
		for(TaskBuilder tb: tasks) {
			bus.getOwnedResource().add(tb.build(designBuilder));
			
		}
		return this;
	}
	
	public BusBuilder thatEmits(final StepBuilder... steps) {
		for(StepBuilder step: steps) {
			bus.getOwnedResource().add(step.getTask().build(designBuilder));
		}
		return this;
	}

	public BusBuilder under(final HardwareArbiter arbiter) {
		bus.getArbiters().add(arbiter);
		return this;
	}

}
