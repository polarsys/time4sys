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
package org.polarsys.time4sys.constraints.model.constraints.utils;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.constraints.model.constraints.AnalysisParameter;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer;
import org.polarsys.time4sys.constraints.model.constraints.LatencyConstraint;
import org.polarsys.time4sys.analysis.AnalyzedSystem;

public class ConstraintContainerUtil {

	public static final String USED_PREFERRED_ANALYSIS = "UsedPreferredAnalysis";

	public static String getConstraintParameter(AnalyzedSystem analyzedSystem,
			String parameterName) {
		if(analyzedSystem.getConstraintContainer() instanceof ConstraintContainer){
			ConstraintContainer cc = (ConstraintContainer) analyzedSystem.getConstraintContainer();
			for(AnalysisParameter param: cc.getAnalysisParameters()){
				if(param.getKey().equals(parameterName)){
					return param.getValue();
				}
			}
		}
		return null;
	}
	
	public static LatencyConstraint getLatencyConstraintForElement(AnalyzedSystem analyzedSystem, EObject element){
		if(analyzedSystem.getConstraintContainer() instanceof ConstraintContainer){
			ConstraintContainer cc = (ConstraintContainer) analyzedSystem.getConstraintContainer();
			for(LatencyConstraint latencyConstraint: cc.getLatencyConstraints()){
				if(element.equals(latencyConstraint.getFrom()) || element.equals(latencyConstraint.getTo())){
					return latencyConstraint;
				}
			}
		}
		return null;
	}

}
