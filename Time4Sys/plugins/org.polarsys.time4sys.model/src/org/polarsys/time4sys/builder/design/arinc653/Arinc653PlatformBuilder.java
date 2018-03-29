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

import java.util.Collection;
import java.util.Collections;

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

	private ProcessorBuilder processorBuilder;
	private TableDrivenSchedPolicyBuilder schedBuilder;
	private Arinc653DesignBuilder designBuilder;
	private Arinc653MIFBuilder[] mifsArray;

	public Arinc653PlatformBuilder(final Arinc653DesignBuilder builder) {
		designBuilder = builder;
		processorBuilder = designBuilder.hasAProcessor();
		schedBuilder = processorBuilder.underTableDrivenSchedPolicy();
	}

	public Arinc653PlatformBuilder called(final String name) {
		processorBuilder.called(name);
		schedBuilder.called(name + " Main Scheduler");
		return this;
	}

	public Arinc653PlatformBuilder thatRuns(final Arinc653MIFBuilder... mifs) {
		assert(mifs != null);
		assert(processorBuilder != null);
		mifsArray = mifs;
		for(Arinc653MIFBuilder aMIF: mifs) {
			processorBuilder.addOwnedResource(aMIF.build(designBuilder));
			processorBuilder.addSchedulable(aMIF.build(designBuilder));
			schedBuilder.addEntry(aMIF.getOrCreateTableEntry());
		}
		return this;
	}

	public Arinc653PlatformBuilder withMIFDuration(final String value) {
		final Duration t = NfpFactory.eINSTANCE.createDurationFromString(value);
		schedBuilder.withMIFDuration(t);
		return this;
	}

	public Collection<Arinc653MIFBuilder> getMIF() {
		return Collections.emptyList();
	}

	public long countMIF() {
		return processorBuilder.countTasks();
	}

	public Arinc653MIFBuilder getMIF(int i) {
		return mifsArray[i];
	}

	public Duration getMAFDuration() {
		return schedBuilder.getMAFDuration();
	}

	public HardwareProcessor build() {
		final HardwareProcessor result = processorBuilder.build();
		for(Arinc653MIFBuilder mifB: mifsArray) {
			mifB.build(designBuilder);
		}
		schedBuilder.build();
		return result;
	}

}
