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

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.nfp.Duration;
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
	
	public Arinc653MIFBuilder() {
		taskBuilder = new TaskBuilder();
	}

	public Arinc653MIFBuilder called(String value) {
		taskBuilder.called(value);
		return this;
	}

	public Arinc653MIFBuilder ofTimeBudget(String string) {
		// TODO Auto-generated method stub
		return this;
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
			throw new IllegalStateException("getMIFDuration cannot be called until it has been built");
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
		return taskBuilder.build(designBuilder);
	}
}
