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
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.builder.design.Annotations;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.ProcessorBuilder;
import org.polarsys.time4sys.builder.design.ReferenceBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.marte.gqam.Reference;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.grm.SecondaryScheduler;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

/**
 * @author Loïc Fejoz
 *
 */
public class Arinc653MIFBuilder {
	
	public static final String PARTITION_ATTR = "partition";
	
	public static boolean hasASecondaryScheduler(final SoftwareSchedulableResource result) {
		return result.getOwnedResource().stream().anyMatch(new Predicate<Resource>() {
			@Override
			public boolean test(Resource value) {
				if (value instanceof SecondaryScheduler) {
					return ((SecondaryScheduler)value).getVirtualProcessingUnit().contains(result);
				}
				return false;
			}
		});
	}
	

	public static boolean isInstance(final SoftwareSchedulableResource task) {
		final String partAttr = Annotations.getAttr(task, Arinc653Builder.ARINC653_URL, PARTITION_ATTR);
		if (partAttr != null) {
			try {
				return Boolean.parseBoolean(partAttr);
			} catch (Exception e) {
			}
		}
		return false;
	}
	

	public static Arinc653MIFBuilder as(final SoftwareSchedulableResource value) {
		final Arinc653DesignBuilder db = Arinc653DesignBuilder.containing(value);
		return new Arinc653MIFBuilder(db, value);
	}

	public static Arinc653MIFBuilder aMIF() {
		return new Arinc653MIFBuilder();
	}
	
	public static Arinc653MIFBuilder aPartition() {
		return aMIF();
	}
	
	public static boolean isMIF(final SoftwareSchedulableResource aTask) {
		final TaskBuilder taskBuilder = new TaskBuilder(null, aTask);
		if (taskBuilder.hasAnnotation(Arinc653Builder.ARINC653_URL)) {
			final String partitionVal = taskBuilder.annotate(Arinc653Builder.ARINC653_URL).getDetails().get(PARTITION_ATTR);
			return (partitionVal != null) && Boolean.parseBoolean(partitionVal);
		}
		return false;
	}

	private TaskBuilder taskBuilder;
	private DesignBuilder designBuilder;
	private TaskBuilder[] subTasks;
	private SecondaryScheduler sched;
	private String timeBudget;
	private ReferenceBuilder ref;
	private ReferenceBuilder startRef;
	
	public Arinc653MIFBuilder() {
		taskBuilder = new TaskBuilder();
		taskBuilder.annotate(Arinc653Builder.ARINC653_URL).getDetails().put(PARTITION_ATTR, Boolean.TRUE.toString());
	}

	public Arinc653MIFBuilder(Arinc653DesignBuilder db, SoftwareSchedulableResource value) {
		taskBuilder = new TaskBuilder(db, value);
		designBuilder = db;
		final EAnnotation annot = taskBuilder.annotate(Arinc653Builder.ARINC653_URL);
		if (!Boolean.TRUE.toString().equals(annot.getDetails().get(PARTITION_ATTR))) {
			annot.getDetails().put(PARTITION_ATTR, Boolean.TRUE.toString());
		}
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
			//taskBuilder.ofWCET(value);
		}
		return this;
	}
	
	public Duration getTimeBudget() {
		return getOrCreateTableEntry().getInitialBudget();
	}

	public Arinc653MIFBuilder withOffset(final String offset) {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Not yet implemented");
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
		if (timeSlots == null || timeSlots.isEmpty()) {
			return null;
		}
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
		if (startRef != null) {
			startRef.called(getName() + "_start");
		}
		if (!hasASecondaryScheduler(result)) {
			under(SchedPolicyKind.FIXED_PRIORITY);
		}
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
			if (designBuilder != null) {
				tb.build(designBuilder);
			}
		}
		return this;
	}

	public Arinc653MIFBuilder under(SchedPolicyKind kind) {
		final SoftwareSchedulableResource mifTask = taskBuilder.build();
		if (sched == null) {
			for(Resource res: taskBuilder.getOwnedResource()) {
				if (res instanceof SecondaryScheduler) {
					final SecondaryScheduler secSched = (SecondaryScheduler)res;
					final EList<SchedulableResource> virtualProcs = secSched.getVirtualProcessingUnit();
					if (virtualProcs.isEmpty() || virtualProcs.contains(mifTask)) {
						sched = secSched;
						break;
					}
				}
			}
		}
		if (sched == null) {
			sched = GrmFactory.eINSTANCE.createSecondaryScheduler();
		}
		addOwnedResource(sched);
		if (!sched.getVirtualProcessingUnit().contains(mifTask)) {
			sched.getVirtualProcessingUnit().add(mifTask);
			sched.setName(mifTask.getName() + " Scheduler");
		}
		ProcessorBuilder.initSchedulerPolicy(sched, mifTask, kind);
		return this;
	}

	public SecondaryScheduler getScheduler() {
		return sched;
	}

	public EAnnotation annotate(final String source) {
		return taskBuilder.annotate(source);
	}

	public synchronized ReferenceBuilder reference() {
		if (ref == null) {
			// Search from annotation
			for(EObject obj: annotate(Arinc653Builder.ARINC653_URL).getReferences()) {
				if (obj instanceof Reference) {
					ref = new ReferenceBuilder((Reference)obj); 
				}
			}
			// Then by name
			final String refname = "Ref " + taskBuilder.getName();
			if (ref == null) {
				ref = designBuilder.reference(refname);
				if (ref != null) {
					annotate(Arinc653Builder.ARINC653_URL).getReferences().add(ref.build());
				}
			}
			// Finally build it if not found
			if (ref == null) {
				ref =  designBuilder.hasAReference().called(refname);
				annotate(Arinc653Builder.ARINC653_URL).getReferences().add(ref.build());
			}
		}
		return ref;
	}

	public Arinc653PlatformBuilder getPlatform() {
		final EObject container = taskBuilder.build().eContainer();
		if (container instanceof HardwareProcessor) {
			final Arinc653PlatformBuilder platform = Arinc653PlatformBuilder.as((HardwareProcessor)container);
			platform.addPartition(this);
			return platform;
		}
		return null;
	}

	public ReferenceBuilder hasAReference() {
		startRef = designBuilder.hasAReference();
		return startRef;
	}

}
