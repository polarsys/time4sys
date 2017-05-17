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
import org.polarsys.time4sys.marte.grm.CommunicationMedia;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class CommunicationMediaBuilder {

	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;
	
	private DesignBuilder designBuilder;
	private CommunicationMedia bus;
	

	public CommunicationMediaBuilder(DesignBuilder designBuilder, CommunicationMedia bus) {
		this.bus = bus;
		this.designBuilder = designBuilder;
	}

	public CommunicationMediaBuilder called(final String name) {
		bus.setName(name);
		return this;
	}

	public CommunicationMediaBuilder thatEmits(final CommunicationChannelBuilder... packets) {
		for(CommunicationChannelBuilder tb: packets) {
			bus.getOwnedResource().add(tb.build(designBuilder));
			
		}
		return this;
	}
	
	public CommunicationMediaBuilder thatEmits(final StepBuilder... steps) {
		for(StepBuilder step: steps) {
			bus.getOwnedResource().add(step.getTask().build(designBuilder));
		}
		return this;
	}
	
	public CommunicationMediaBuilder under(final SchedPolicyKind polKind) {
		final Scheduler sched = grmFactory.createScheduler();
		bus.getOwnedResource().add(sched);
		sched.getProcessingUnits().add(bus);
		bus.setMainScheduler(sched);
		final SchedulingPolicy pol = grmFactory.createSchedulingPolicy(polKind);
		sched.setPolicy(pol);
		for(Resource res: bus.getOwnedResource()) {
			if (res instanceof SchedulableResource) {
				sched.getSchedulableResource().add((SchedulableResource)res);
			}
		}
		return this;
	}
}
