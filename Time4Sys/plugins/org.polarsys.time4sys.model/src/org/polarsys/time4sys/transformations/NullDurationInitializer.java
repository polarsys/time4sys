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
package org.polarsys.time4sys.transformations;

import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.Delay;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * Split Task for them to be in normal form: - only receiving message (data or
 * control-flow) at the start of the task - only sending message (data or
 * control-flow) at the end of the task - at most one activation per task NB:
 * Priorities and deadlines are left untouched. For that purpose,
 * see @org.polarsys.time4sys.transformations.ActivationPropagator
 * 
 * @author loic
 *
 */
public class NullDurationInitializer extends AbstractTransformation {

	public static final String TRANS_NAME = "Initialize null durations to 0 ms".intern();

	public static Transformation transform(final Project project, final DesignModel source) {
		return new NullDurationInitializer(project, source).transform();
	}

	private Set<Link> linksToBeUpdated = new LinkedHashSet<>();
	private Set<BehaviorScenario> bss = new LinkedHashSet<>();
	private Set<ArrivalPattern> aps = new LinkedHashSet<>();

	public NullDurationInitializer(final Project project, final DesignModel source) {
		super(project, source, TRANS_NAME);
	}

	@Override
	protected void finalize(final DesignModel target) {
		for (Link lnk : linksToBeUpdated) {
			lnk.setRationale(mainCtx);
		}
		for (BehaviorScenario bs : bss) {
			if (bs.getBestCET() == null) {
				bs.setBestCET(NfpFactory.eINSTANCE.createDurationFromString("0ms"));
			}
			if (source instanceof Delay) {
				Delay delay = (Delay) source;
				if (delay.getDuration() == null) {
					delay.setDuration(NfpFactory.eINSTANCE.createDurationFromString("0ms"));
				}
			}
		}
		for (ArrivalPattern ap : aps) {
			if (ap.getPhase() == null) {
				ap.setPhase(NfpFactory.eINSTANCE.createDurationFromString("0ms"));
			}
			if (ap.getJitter() == null) {
				ap.setJitter(NfpFactory.eINSTANCE.createDurationFromString("0ms"));
			}
		}
	}

	/**
	 * Lookup for Behavior Scenarios and Arrival Patterns and update nullable
	 * Durations.
	 */
	@Override
	public void copied(EObject source, Link lnk, EObject theCopy) {
		boolean hasChanged = false;
		if (source instanceof BehaviorScenario) {
			BehaviorScenario bs = (BehaviorScenario) source;
			if (bs.getBestCET() == null) {
				hasChanged = true;
			}
			if (source instanceof Delay) {
				Delay delay = (Delay) source;
				if (delay.getDuration() == null) {
					hasChanged = true;
				}
			}
			if (hasChanged) {
				bss.add((BehaviorScenario) theCopy);
			}
		}
		if (source instanceof ArrivalPattern) {
			ArrivalPattern ap = (ArrivalPattern) source;
			if (ap.getPhase() == null) {
				hasChanged = true;
			}
			if (ap.getJitter() == null) {
				hasChanged = true;
			}
			if (hasChanged) {
				aps.add((ArrivalPattern) theCopy);
			}
		}
		if (hasChanged) {
			linksToBeUpdated.add(lnk);
		}
	}
}
