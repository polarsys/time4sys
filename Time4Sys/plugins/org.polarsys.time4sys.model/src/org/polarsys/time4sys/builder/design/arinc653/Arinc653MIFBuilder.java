/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.design.arinc653;

import java.util.function.Predicate;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.ProcessorBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.grm.SecondaryScheduler;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

/**
 * @author Utilisateur
 *
 */
public class Arinc653MIFBuilder {

	public static Arinc653MIFBuilder aMIF() {
		return new Arinc653MIFBuilder();
	}
	
	public static Arinc653MIFBuilder aPartition() {
		return aMIF();
	}

	private TaskBuilder taskBuilder;
	private DesignBuilder designBuilder;
	private TaskBuilder[] subTasks;
	private SecondaryScheduler sched;
	private String timeBudget;
	
	public Arinc653MIFBuilder() {
		taskBuilder = new TaskBuilder();
	}

	public Arinc653MIFBuilder called(String value) {
		taskBuilder.called(value);
		return this;
	}

	public Arinc653MIFBuilder ofTimeBudget(final String value) {
		timeBudget = value;
		if (designBuilder != null) {
			final Duration d = NfpFactory.eINSTANCE.createDurationFromString(value);
			getOrCreateTableEntry().setInitialBudget(d);
		}
		return this;
	}
	
	public Duration getTimeBudget() {
		return getOrCreateTableEntry().getInitialBudget();
	}

	public Arinc653MIFBuilder withOffset(String string) {
		// TODO Auto-generated method stub
		return this;
	}

	public Arinc653MIFBuilder withNoOffset() {
		return withOffset("0ms");
	}

	public Arinc653MIFBuilder withMIFDuration(final Duration t) {
		getOrCreateTableEntry().getTimeSlot().add(t);
		return this;
	}
	
	public TableEntryType getOrCreateTableEntry() {
		if (designBuilder == null) {
			throw new IllegalStateException("getOrCreateTableEntry cannot be called until it has been built");
		}
		SoftwareSchedulableResource raw = taskBuilder.build(designBuilder);
		for(SchedulingParameter param: raw.getSchedParams()) {
			if (param instanceof TableEntryType) {
				return (TableEntryType)param;
			}
		}
		final TableEntryType entry = GrmFactory.eINSTANCE.createTableEntryType();
		raw.getSchedParams().add(entry);
		return entry;
	}

	public Duration getMIFDuration() {
		
		final EList<Duration> timeSlots = getOrCreateTableEntry().getTimeSlot();
		return timeSlots.get(0);
	}

	public String getName() {
		return taskBuilder.getName();
	}

	public SoftwareSchedulableResource build(final DesignBuilder designBuilder) {
		this.designBuilder = designBuilder;
		if (timeBudget != null) {
			ofTimeBudget(timeBudget);
		}
		final SoftwareSchedulableResource result = taskBuilder.build(designBuilder);
		if (subTasks != null) {
			for(TaskBuilder tb: subTasks) {
				tb.build(designBuilder);
			}
		}
		getOrCreateTableEntry().setName(getName() + " Slot");
		return result;
	}

	public SoftwareSchedulableResource build() {
		if (designBuilder == null) {
			throw new IllegalStateException("Build() cannot be called until it has been built with a DesignBuilder once.");
		}
		return taskBuilder.build();
	}
	
	public void addOwnedResource(final TaskBuilder tb) {
		taskBuilder.addOwnedResource(tb);
	}
	

	private void addOwnedResource(Resource res) {
		taskBuilder.addOwnedResource(res);
	}

	public long countTasks() {
		return taskBuilder.getOwnedResource().stream().filter(new Predicate<Resource>() {
			@Override
			public boolean test(Resource p) {
				return p instanceof SoftwareSchedulableResource;
			}
		}).count();
	}
	
	public Arinc653MIFBuilder runs(final TaskBuilder... tasks) {
		return thatRuns(tasks);
	}
	
	public Arinc653MIFBuilder thatRuns(final TaskBuilder... tasks) {
		subTasks = tasks;
		for(TaskBuilder tb: tasks) {
			addOwnedResource(tb);
		}
		return this;
	}

	public Arinc653MIFBuilder under(SchedPolicyKind kind) {
		sched = GrmFactory.eINSTANCE.createSecondaryScheduler();
		addOwnedResource(sched);
		final SoftwareSchedulableResource mifTask = taskBuilder.build();
		sched.getVirtualProcessingUnit().add(mifTask);
		sched.setName(mifTask.getName() + " Scheduler");
		ProcessorBuilder.initSchedulerPolicy(sched, mifTask, kind);
		return this;
	}

	public SecondaryScheduler getScheduler() {
		return sched;
	}

}