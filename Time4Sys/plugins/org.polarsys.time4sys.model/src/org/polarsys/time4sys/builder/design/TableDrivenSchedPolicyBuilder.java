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
package org.polarsys.time4sys.builder.design;

import java.util.HashSet;
import java.util.Set;

import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;
import org.polarsys.time4sys.marte.grm.TableDrivenSchedule;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

/**
 * @author Utilisateur
 *
 */
public class TableDrivenSchedPolicyBuilder {

	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;
	
	private Scheduler scheduler;
	private SchedulingPolicy policy;
	private TableDrivenSchedule schedule;

	public TableDrivenSchedPolicyBuilder(final Scheduler mainScheduler) {
		scheduler = mainScheduler;
		policy = scheduler.getPolicy();
		policy.setPolicy(SchedPolicyKind.TIME_TABLE_DRIVEN);
		schedule = GrmFactory.eINSTANCE.createTableDrivenSchedule();
		policy.setSchedule(schedule);
	}

	public void withMIFDuration(final Duration mif) {
		for(TableEntryType entry: schedule.getEntries()) {
			entry.getTimeSlot().clear();
			entry.getTimeSlot().add(mif);
		}
	}

	public Duration getMIFDuration() {
		final Set<Duration> allMIFs = new HashSet<Duration>();
		for(TableEntryType entry: schedule.getEntries()) {
			allMIFs.addAll(entry.getTimeSlot());
		}
		if (allMIFs.size() == 1) {
			return allMIFs.iterator().next();
		} else {
			throw new IllegalStateException("MIFs' duration are not all the same.");
		}
	}

	public Duration getMAFDuration() {
		Duration sum = nfpFactory.createDurationFromString("0ms"); 
		for(TableEntryType entry: schedule.getEntries()) {
			for(Duration t: entry.getTimeSlot()) {
				sum = sum.add(t);
			}
		}
		return sum;
	}

	public void addEntry(final TableEntryType entry) {
		schedule.getEntries().add(entry);
	}

}
