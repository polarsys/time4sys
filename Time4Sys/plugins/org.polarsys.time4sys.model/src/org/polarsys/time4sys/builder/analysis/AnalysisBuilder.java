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

import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.SchedulableElement;
import org.polarsys.time4sys.analysis.Task;
import org.polarsys.time4sys.marte.gqam.Step;

/**
 * @author loic
 *
 */
public class AnalysisBuilder {

	private AnalyzedSystem sys;

	/**
	 * @param anaSys 
	 * 
	 */
	public AnalysisBuilder(final AnalyzedSystem anaSys) {
		assert(anaSys != null);
		this.sys = anaSys;
	}
	
	public AnalyzedSystem build() {
		return sys;
	}

	public int countTasks() {
		return sys.getSchedulableElements().size();
	}

	public TaskBuilder hasATask() {
		final Task task = AnalysisFactory.eINSTANCE.createTask();
		sys.getSchedulableElements().add(task);
		return new TaskBuilder(this, task);
	}

	public TaskBuilder nthTask(final int order) {
		int counter = 0;
		for(SchedulableElement elt: sys.getSchedulableElements()) {
			if (elt instanceof Task) {
				counter++;
				if (counter == order) {
					return new TaskBuilder(this, (Task)elt);
				}
			}
		}
		return null;
	}
	
	public TaskBuilder firstTask() {
		return nthTask(1);
	}

	public TaskBuilder secondTask() {
		return nthTask(2);
	}

	public TaskBuilder task(final String name) {
		for(SchedulableElement elt: sys.getSchedulableElements()) {
			if (elt instanceof Task) {
				if (name.equals(elt.getName())) {
					return new TaskBuilder(this, (Task)elt);
				}
			}
		}
		return null;
	}

	public TaskBuilder mappingOf(final Step step) {
		return task(step.getConcurRes().getName() + " - " + step.getName());
	}

	public SchedulerBuilder hasAScheduler() {
		return new SchedulerBuilder(this);
	}

	public ComputingResourceBuilder hasComputingResource() {
		return new ComputingResourceBuilder(this);
	}

}
