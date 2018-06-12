/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.design;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import org.polarsys.time4sys.builder.design.arinc653.Arinc653Builder;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;
import org.polarsys.time4sys.marte.grm.TableDrivenSchedule;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * @author Utilisateur
 *
 */
public class TableDrivenSchedPolicyBuilder {

	public static final String MIF_ATTR = "mif_duration";

	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;

	private Scheduler scheduler;
	private SchedulingPolicy policy;
	private TableDrivenSchedule schedule;

	public TableDrivenSchedPolicyBuilder(final Scheduler mainScheduler) {
		scheduler = mainScheduler;
		policy = scheduler.getPolicy();
		if (policy.getPolicy() != SchedPolicyKind.TIME_TABLE_DRIVEN) {
			policy.setPolicy(SchedPolicyKind.TIME_TABLE_DRIVEN);
		}
		if (policy.getSchedule() instanceof TableDrivenSchedule) {
			schedule = (TableDrivenSchedule) policy.getSchedule();
		} else {
			schedule = GrmFactory.eINSTANCE.createTableDrivenSchedule();
			policy.setSchedule(schedule);
		}
	}

	public void withMIFDuration(final Duration mif) {
		Annotations.setAttr(schedule, Arinc653Builder.ARINC653_URL, MIF_ATTR, mif.toString());
		updateScheduleEntries(mif);
	}

	public void updateScheduleEntries(final Duration mif) {
		Duration currentOffset = NfpFactory.eINSTANCE.createDurationFromString("0ms");
		final Duration partitionDuration = mif.divide((long)schedule.getEntries().size());
		for (TableEntryType entry : schedule.getEntries()) {
			entry.getTimeSlot().clear();
			entry.getTimeSlot().add(partitionDuration);
			entry.getOffset().clear();
			entry.getOffset().add(currentOffset);
			currentOffset = currentOffset.add(partitionDuration);
		}
		schedule.setFrameCycleTime(currentOffset);
	}

	public Duration getMIFDuration() {
		final String mifValue = Annotations.getAttr(schedule, Arinc653Builder.ARINC653_URL, MIF_ATTR);
		if (mifValue != null) {
			return NfpFactory.eINSTANCE.createDurationFromString(mifValue);
		}
		final Duration zero = NfpFactory.eINSTANCE.createDurationFromString("0ms");
		final Map<Integer, Duration> mifDurations = new HashMap<>();
		for (TableEntryType entry : schedule.getEntries()) {
			int i = 0;
			for (TimeInterval slot : entry.getActivation()) {
				final Duration currentMifSum = mifDurations.getOrDefault(i, zero).add(slot.computeLength());
				mifDurations.put(i, currentMifSum);
				++i;
			}
		}
		if (mifDurations.isEmpty()) {
			return null;
		} else {
			boolean allSameMifDuration = false;
			final Duration firstDuration = mifDurations.values().iterator().next();
			allSameMifDuration = mifDurations.values().stream().allMatch(new Predicate<Duration>() {

				@Override
				public boolean test(final Duration t) {
					return firstDuration.equals(t);
				}

			});
			if (allSameMifDuration) {
				return mifDurations.values().iterator().next();
			} else {
				throw new IllegalStateException("MIFs' duration are not all the same.");
			}
		}
	}
	
	public void withFrameCycleTime(final Duration t) {
		schedule.setFrameCycleTime(t);
	}
	
	public void updateFrameCycleTime() {
		schedule.setFrameCycleTime(computeMAFDuration());
	}
	
	public Duration getFrameCycleTime() {
		return schedule.getFrameCycleTime();
	}

	public Duration getMAFDuration() {
		if (schedule.eIsSet(GrmPackage.eINSTANCE.getTableDrivenSchedule_FrameCycleTime())) {
			return schedule.getFrameCycleTime();
		}
		return computeMAFDuration();
	}

	public Duration computeMAFDuration() {
		Duration sum = nfpFactory.createDurationFromString("0ms");
		for (TableEntryType entry : schedule.getEntries()) {
			for (Duration t : entry.getTimeSlot()) {
				sum = sum.add(t);
			}
		}
		return sum;
	}

	public TableEntryType addEntry(final TableEntryType entry) {
		schedule.getEntries().add(entry);
		return entry;
	}

	public void build() {
		schedule.setFrameCycleTime(getMAFDuration());
	}

	public void called(final String name) {
		scheduler.setName(name);
	}

}
