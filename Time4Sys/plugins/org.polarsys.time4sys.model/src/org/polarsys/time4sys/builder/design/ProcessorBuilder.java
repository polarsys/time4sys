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
/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import java.util.function.Predicate;

import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SoftwareScheduler;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class ProcessorBuilder {
	
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;

	private HardwareProcessor proc;
	private DesignBuilder designBuilder;

	/**
	 * @param designBuilder 
	 * @param proc 
	 * 
	 */
	public ProcessorBuilder(DesignBuilder designBuilder, HardwareProcessor proc) {
		this.proc = proc;
		this.designBuilder = designBuilder;
	}

	public ProcessorBuilder called(final String name) {
		proc.setName(name);
		return this;
	}

	public ProcessorBuilder thatRuns(final TaskBuilder... tasks) {
		for(TaskBuilder tb: tasks) {
			addOwnedResource(tb.build(designBuilder));
			
		}
		return this;
	}
	
	public ProcessorBuilder thatRuns(final StepBuilder... steps) {
		for(StepBuilder step: steps) {
			addOwnedResource(step.getTask().build(designBuilder));
		}
		return this;
	}
	
	public ProcessorBuilder runs(final TaskBuilder... tasks) {
		return thatRuns(tasks);
	}

	public ProcessorBuilder thatHandles(final AlarmBuilder... alarms) {
		for(AlarmBuilder alrm: alarms) {
			addOwnedResource(alrm.build(designBuilder));
		}
		return this;
	}
	
	public ProcessorBuilder under(final SchedPolicyKind polKind) {
		final SoftwareScheduler sched = srmFactory.createSoftwareScheduler();
		proc.getOwnedResource().add(sched);
		sched.getProcessingUnits().add(proc);
		proc.setMainScheduler(sched);
		final SchedulingPolicy pol = grmFactory.createSchedulingPolicy(polKind);
		sched.setPolicy(pol);
		for(Resource res: proc.getOwnedResource()) {
			if (res instanceof SchedulableResource) {
				sched.getSchedulableResource().add((SchedulableResource)res);
			}
		}
		return this;
	}
	

	public TableDrivenSchedPolicyBuilder underTableDrivenSchedPolicy() {
		under(SchedPolicyKind.TIME_TABLE_DRIVEN);
		return new TableDrivenSchedPolicyBuilder(proc.getMainScheduler());
	}

	public HardwareProcessor build() {
		return proc;
	}

	public void addOwnedResource(final SoftwareConcurrentResource value) {
		proc.getOwnedResource().add(value);
	}

	public long countTasks() {
		return proc.getOwnedResource().stream().filter(new Predicate<Resource>() {
			@Override
			public boolean test(Resource p) {
				return p instanceof SoftwareSchedulableResource;
			}
		}).count();
	}


}
