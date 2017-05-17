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
package org.polarsys.time4sys.transformations;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.MappableArtefact;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.SlidingWindowPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * @author loic
 *
 */
public class ToPeriodicDerivation extends IdentityDerivation {
	
	public static final String STEP_RULE_NAME = "Sliding to Periodic Step".intern();
	public static final String PATTERN_RULE_NAME = "Sliding to Periodic Pattern".intern();
	public static final String TRANS_NAME = "Sliding to Periodic Transformation".intern();
	
	public static Transformation getOrApply(final Project project) {
		return getOrApply(project, project.getDesign());
	}
	
	public static Transformation getOrApply(final Project project, final DesignModel source) {
		// Search for a previously applied transformation
		for(Transformation tr: project.getTransformations()) {
			final Context transKind = tr.getMapping().getRationale();
			if (transKind != null) {
				if (TRANS_NAME.equals(transKind.getName())) {
					final EObject srcModel = tr.getMapping().getSubLinks().get(0).getUniqueSourceValue("original");
					if (source.equals(srcModel)) {
						return tr;
					}
				}
			}
		}
		// else apply
		return ToPeriodicDerivation.duplicate(project, source);
	}

	public static Transformation duplicate(final Project project, final DesignModel source) {
		return new ToPeriodicDerivation(project, source).transform();
	}

	protected Context slide2periodic;
	private Context slide2periodicStep;
	private Context slide2periodicMapping;

	public ToPeriodicDerivation(final Project project, final DesignModel source) {
		super(project, source);
	}
	
	public Transformation transform() {
		final Transformation result = super.transform();
		result.getMapping().setRationale(slide2periodicMapping);
		return result;
	}
	
	public void createRules() {
		super.createRules();
		slide2periodicMapping = mappingFactory.createContext(TRANS_NAME);
		mapping.getRules().add(slide2periodicMapping);
		slide2periodic = mappingFactory.createContext(PATTERN_RULE_NAME);
		mapping.getRules().add(slide2periodic);
		slide2periodicStep = mappingFactory.createContext(STEP_RULE_NAME);
		mapping.getRules().add(slide2periodicStep);
	}
	
	protected void finalize(final DesignModel target) {
		for(WorkloadEvent evt: target.getWorkloadBehavior().getDemand()) {
			if (evt.getPattern() instanceof SlidingWindowPattern) {
				finalizeSlidingWindowPattern(evt);
			}
		}
	}

	protected void finalizeSlidingWindowPattern(final WorkloadEvent evt) {
		// Replace SlidingWindowPattern by a periodic pattern
		final SlidingWindowPattern previousPattern = (SlidingWindowPattern)evt.getPattern();
		final PeriodicPattern newPattern = GqamFactory.eINSTANCE.createPeriodicPattern();
		// Period is window size
		newPattern.setPeriod(previousPattern.getWindowSize());
		newPattern.setJitter(previousPattern.getJitter());
		newPattern.setPhase(previousPattern.getPhase());
		newPattern.setReference(previousPattern.getReference());
		evt.setPattern(newPattern);
		// Update arrival pattern link
		final Link copyLnk = getUniqueLinkFor(previousPattern);
		final MappableArtefact patternArtefact = copyLnk.getTargets().get(0);
		assert(previousPattern == patternArtefact.getValue());
		patternArtefact.setValue(newPattern);
		patternArtefact.setName("modified");
		copyLnk.setRationale(slide2periodic);
		final BehaviorScenario step = evt.getEffect();
		copyLnk.getTargets().add(mappingFactory.createMappableArtefact("step", step));
		assert(step instanceof Step);
		// Update wcet of step
		step.setWorstCET(step.getWorstCET().multiply(previousPattern.getNbEvents()));
		// Update step link
		final Link stepLnk = getUniqueLinkFor(step);
		final MappableArtefact stepArtefact = stepLnk.getTargets().get(0);
		stepArtefact.setName("modified");
		stepLnk.setRationale(slide2periodicStep);
		final Step targetStep = (Step)stepArtefact.getValue();
		assert(targetStep == step);
		final ArrivalPattern originalPattern = (ArrivalPattern)copyLnk.getSources().get(0).getValue();
		stepLnk.getSources().add(mappingFactory.createMappableArtefact("pattern", originalPattern));
	}
}
