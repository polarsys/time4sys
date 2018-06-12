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
package org.polarsys.time4sys.builder.design.arinc653;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EAnnotation;
import org.polarsys.time4sys.builder.design.Annotations;
import org.polarsys.time4sys.builder.design.ProcessorBuilder;
import org.polarsys.time4sys.builder.design.TableDrivenSchedPolicyBuilder;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

/**
 * @author Utilisateur
 *
 */
public class Arinc653PlatformBuilder {

	private static final String PLATFORM_ATTR = "platform";
	

	public static Arinc653PlatformBuilder as(final HardwareProcessor value) {
		final Arinc653DesignBuilder db = Arinc653DesignBuilder.containing(value);
		return new Arinc653PlatformBuilder(db, value);
	}
	
	public static boolean isInstance(final HardwareProcessor proc) {
		final String platAttr = Annotations.getAttr(proc, Arinc653Builder.ARINC653_URL, PLATFORM_ATTR);
		if (platAttr != null) {
			try {
				return Boolean.parseBoolean(platAttr);
			} catch (Exception e) {
			}
		}
		return false;
	}
	
	private ProcessorBuilder processorBuilder;
	private TableDrivenSchedPolicyBuilder schedBuilder;
	private Arinc653DesignBuilder designBuilder;
	private Arinc653MIFBuilder[] mifsArray;
	private Duration mifDuration;

	public Arinc653PlatformBuilder(final Arinc653DesignBuilder designBuilder) {
		this(designBuilder, designBuilder.hasAProcessor());
	}
	
	public Arinc653PlatformBuilder(final Arinc653DesignBuilder builder, final ProcessorBuilder procBuilder) {
		designBuilder = builder;
		processorBuilder = procBuilder;
		final EAnnotation annot = processorBuilder.annotate(Arinc653Builder.ARINC653_URL);
		if (!Boolean.TRUE.toString().equals(annot.getDetails().get(PLATFORM_ATTR))) {
			annot.getDetails().put(PLATFORM_ATTR, Boolean.TRUE.toString());
		}
		schedBuilder = processorBuilder.underTableDrivenSchedPolicy();
	}
	
	public TableDrivenSchedPolicyBuilder getSchedBuilder() {
		return schedBuilder;
	}

	public Arinc653PlatformBuilder(final Arinc653DesignBuilder db, final HardwareProcessor proc) {
		this(db, new ProcessorBuilder(db, proc));
	}

	public Arinc653PlatformBuilder called(final String name) {
		processorBuilder.called(name);
		schedBuilder.called(name + " Main Scheduler");
		return this;
	}

	@Deprecated
	public Arinc653PlatformBuilder thatRuns(final Arinc653MIFBuilder... mifs) {
		assert(mifs != null);
		assert(processorBuilder != null);
		mifsArray = mifs;
		for(Arinc653MIFBuilder aMIF: mifs) {
			addPartition(aMIF);
		}
		if (mifDuration != null) {
			schedBuilder.withMIFDuration(mifDuration);
		}
		return this;
	}
	
	public Arinc653PlatformBuilder thatRuns(final Arinc653PartitionBuilder... mifs) {
		assert(mifs != null);
		assert(processorBuilder != null);
		mifsArray = mifs;
		for(Arinc653PartitionBuilder aMIF: mifs) {
			addPartition(aMIF);
		}
		if (mifDuration != null) {
			schedBuilder.withMIFDuration(mifDuration);
		}
		return this;
	}
	

	@Deprecated
	public Arinc653PlatformBuilder runs(final Arinc653MIFBuilder... mifs) {
		return thatRuns(mifs);
	}

	public Arinc653PlatformBuilder runs(final Arinc653PartitionBuilder... mifs) {
		return thatRuns(mifs);
	}
	
	public Arinc653PlatformBuilder withMIFDuration(final String value) {
		mifDuration = NfpFactory.eINSTANCE.createDurationFromString(value);
		schedBuilder.withMIFDuration(mifDuration);
		return this;
	}

	@Deprecated
	public Collection<Arinc653MIFBuilder> getMIF() {
		return Collections.emptyList();
	}

	@Deprecated
	public long countMIF() {
		return processorBuilder.countTasks();
	}
	
	public long countPartition() {
		return processorBuilder.countTasks();
	}

	@Deprecated
	public Arinc653MIFBuilder getMIF(int i) {
		return mifsArray[i];
	}
	
	public Arinc653PartitionBuilder getPartition(int i) {
		return (Arinc653PartitionBuilder)mifsArray[i];
	}

	public Duration getMAFDuration() {
		return schedBuilder.getMAFDuration();
	}
	
	public Duration computeMAFDuration() {
		return schedBuilder.computeMAFDuration();
	}
	
	public void updateFrameCycleTime() {
		schedBuilder.updateFrameCycleTime();
	}
	
	public Duration getMIFDuration() {
		return schedBuilder.getMIFDuration();
	}

	public HardwareProcessor build() {
		final HardwareProcessor result = processorBuilder.build();
		if (mifsArray != null) {
			for(Arinc653MIFBuilder mifB: mifsArray) {
				mifB.build(designBuilder);
			}
		}
		schedBuilder.build();
		return result;
	}
	
	@Deprecated
	public Arinc653PlatformBuilder addPartition(final Arinc653MIFBuilder aMIF) {
		Duration mif = null;
		try {
			mif = schedBuilder.getMIFDuration();
		} catch (Exception e) {
			
		}
		processorBuilder.addOwnedResource(aMIF.build(designBuilder));
		processorBuilder.addSchedulable(aMIF.build(designBuilder));
		schedBuilder.addEntry(aMIF.getOrCreateTableEntry());
		aMIF.build(designBuilder);
		if (mif != null) {
			schedBuilder.updateScheduleEntries(mif);
		}
		return this;
	}

	public Arinc653PlatformBuilder addPartition(final Arinc653PartitionBuilder aPartition) {
		Duration mif = null;
		try {
			mif = schedBuilder.getMIFDuration();
		} catch (Exception e) {
			
		}
		processorBuilder.addOwnedResource(aPartition.build(designBuilder));
		processorBuilder.addSchedulable(aPartition.build(designBuilder));
		schedBuilder.addEntry(aPartition.getOrCreateTableEntry());
		aPartition.build(designBuilder);
		if (mif != null && aPartition.getOrCreateTableEntry().getTimeSlot().isEmpty()) {
			schedBuilder.updateScheduleEntries(mif);
		}
		return this;
	}

	/**
	 * Mark the underlying processor as not an Arinc653 platform.
	 */
	public void setNotAPlatform() {
		Annotations.setAttr(processorBuilder.build(), Arinc653Builder.ARINC653_URL, PLATFORM_ATTR, Boolean.FALSE.toString());
	}

}
