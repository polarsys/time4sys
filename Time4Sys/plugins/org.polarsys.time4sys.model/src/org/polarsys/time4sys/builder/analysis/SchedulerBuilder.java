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
package org.polarsys.time4sys.builder.analysis;

import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.RequiredSchedulingParameter;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.SchedulerPolicyKind;

public class SchedulerBuilder {

	private AnalysisBuilder analysis;
	private Scheduler sched;
	private String name;

	public SchedulerBuilder(final AnalysisBuilder analysisBuilder) {
		this(analysisBuilder, null);
	}

	public SchedulerBuilder(final AnalysisBuilder analysisBuilder, final Scheduler scheduler) {
		analysis = analysisBuilder;
		sched = scheduler;
	}

	public SchedulerBuilder withPolicy(final SchedulerPolicyKind kind) {
		build();
		assert(sched != null);
		sched.setPolicyKind(kind);
		final RequiredSchedulingParameter deadline = AnalysisFactory.eINSTANCE.createRequiredSchedulingParameter();
		deadline.setName("Deadline");
		sched.getRequiredParameters().add(deadline);
		final RequiredSchedulingParameter priority = AnalysisFactory.eINSTANCE.createRequiredSchedulingParameter();
		priority.setName("FixedPriority");
		sched.getRequiredParameters().add(priority);
		return this;
	}

	public Scheduler build() {
		if (sched != null) {
			return sched;
		}
		sched = AnalysisFactory.eINSTANCE.createScheduler();
		sched.setName(name);
		analysis.build().getSchedulers().add(sched);
		return sched;
	}

	public SchedulerBuilder called(final String value) {
		name = value;
		return this;
	}

}
