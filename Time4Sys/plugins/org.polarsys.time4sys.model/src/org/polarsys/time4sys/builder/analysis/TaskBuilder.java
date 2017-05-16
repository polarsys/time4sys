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
package org.polarsys.time4sys.builder.analysis;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.analysis.EventModel;
import org.polarsys.time4sys.analysis.Offset;
import org.polarsys.time4sys.analysis.RequiredSchedulingParameter;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.SchedulerParameterValue;
import org.polarsys.time4sys.analysis.Task;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * @author loic
 *
 */
public class TaskBuilder {

	private AnalysisBuilder analysis;
	private Task task;

	/**
	 * @param task 
	 * @param analysisBuilder 
	 * 
	 */
	public TaskBuilder(AnalysisBuilder analysisBuilder, Task task) {
		this.analysis = analysisBuilder;
		this.task = task;
	}

	public TaskBuilder called(String name) {
		task.setName(name);
		return this;
	}

	public Duration getPeriod() {
		return task.getEventModel().getPeriod();
	}
	
	public Duration getWCET() {
		return task.getCET().getMax();
	}
	
	public Duration getBCET() {
		return task.getCET().getMin();
	}

	public TaskBuilder withEventModel(final EventModel value) {
		task.setEventModel(value);
		return this;
	}
	
	public TimeInterval getCET() {
		TimeInterval cet = task.getCET();
		if (cet == null) {
			cet = NfpFactory.eINSTANCE.createTimeInterval();
			task.setCET(cet);
		}
		return cet;
	}

	public TaskBuilder ofBCET(final Duration value) {
		getCET().setMin(value);
		return this;
	}

	public TaskBuilder ofWCET(final Duration value) {
		getCET().setMax(value);
		return this;
	}

	public String getName() {
		return task.getName();
	}

	public Task build() {
		return task;
	}

	public Duration getOffset() {
		final EList<Offset> offsets = task.getEventModel().getOffsets();
		if (offsets.isEmpty()) {
			return NfpFactory.eINSTANCE.createDurationFromString("0ms");
		}
		return offsets.get(0).getValue();
	}

	private SchedulerParameterValue getSchedulingParameters(final String key) {
		assert(key != null);
		for(SchedulerParameterValue v: task.getSchedulingParameters()) {
			if (key.equals(v.getType().getName())) {
				return v;
			}
		}
		return null;
	}
	
	private SchedulerParameterValue setSchedulingParameters(final String key, final String value) {
		assert(key != null);
		for(SchedulerParameterValue v: task.getSchedulingParameters()) {
			if (key.equals(v.getType().getName())) {
				v.setValue(value);
				return v;
			}
		}
		assert(task.getScheduledBy() != null);
		for(RequiredSchedulingParameter param: task.getScheduledBy().getRequiredParameters()) {
			if (key.equals(param.getName())) {
				final SchedulerParameterValue p = AnalysisFactory.eINSTANCE.createSchedulerParameterValue();
				p.setType(param);
				p.setValue(value);
				task.getSchedulingParameters().add(p);
				return p;
			}
		}
		return null;
	}
	
	public Duration getDeadline() {
		final SchedulerParameterValue schedParam = getSchedulingParameters("Deadline");
		if (schedParam == null) {
			return null;
		}
		return NfpFactory.eINSTANCE.createDurationFromString(schedParam.getValue());
	}

	public int getPriority() {
		final SchedulerParameterValue schedParam = getSchedulingParameters("FixedPriority");
		if (schedParam == null) {
			return Integer.MIN_VALUE;
		}
		return Integer.parseInt(schedParam.getValue());
	}
	
	public void setPriority(int value) {
		setSchedulingParameters("FixedPriority", Integer.toString(value));
	}

	public void setDeadline(final String value) {
		final SchedulerParameterValue p = setSchedulingParameters("Deadline", value);
		assert(p != null);
	}
	
	public void setDeadline(final Duration maxDeadline) {
		setDeadline(NfpFactory.eINSTANCE.convertDurationToString(maxDeadline));
		assert(maxDeadline.equals(getDeadline()));
	}

	public void setOffset(Duration maxOffset) {
		final List<Offset> offsets = task.getEventModel().getOffsets();
		final Offset o;
		if (offsets.isEmpty()) {
			o = AnalysisFactory.eINSTANCE.createOffset();
			offsets.add(o);
		} else {
			o = offsets.get(0);
		}
		o.setValue(maxOffset);
	}

	public TaskBuilder withScheduler(final Scheduler scheduler) {
		task.setScheduledBy(scheduler);
		return this;
	}

	/**
	 * set offset to given value and update deadline accordingly.
	 * @param maxOffset
	 */
	public void updateOffset(Duration value) {
		final Duration oldDeadline = getDeadline();
		if (oldDeadline != null) {
			final Duration oldOffset = getOffset();
			if (oldOffset != null && !value.equals(oldOffset)) {
				final Duration newDeadline = oldDeadline.sub(value.sub(oldOffset));
				setDeadline(newDeadline);
			}
		}
		setOffset(value);
		assert(value.equals(getOffset()));
	}

	/**
	 * Set Deadline only if no value or greater value
	 * @param value
	 */
	public void updateDeadline(Duration value) {
		final Duration oldDeadline = getDeadline();
		if (oldDeadline != null && oldDeadline.notZero() && oldDeadline.compareTo(value) > 0) {
			setDeadline(value);
		}
	}

	public ComputingResource getMappedTo() {
		return task.getMappedTo();
	}

	public TaskBuilder setMappedTo(ComputingResource value) {
		task.setMappedTo(value);
		return this;
	}

	public SchedulerBuilder getScheduledBy() {
		return new SchedulerBuilder(analysis, task.getScheduledBy());
	}

}
