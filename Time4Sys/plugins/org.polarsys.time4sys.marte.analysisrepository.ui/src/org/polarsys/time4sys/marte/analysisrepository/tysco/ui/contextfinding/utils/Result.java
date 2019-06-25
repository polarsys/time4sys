/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 *
 *******************************************************************************/
package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils;

import org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType;

public class Result {
	
	private int refId;
	private EvaluationResultType evaluatedResult;
	
	/**
	 * default constructor
	 */
	public Result() {}

	public Result(int refId,EvaluationResultType resultType) {
		this.refId = refId;
		this.evaluatedResult = resultType;
	}

	public int getRefId() {
		return refId;
	}

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public EvaluationResultType getEvaluatedResult() {
		return evaluatedResult;
	}

	public void setEvaluatedResult(EvaluationResultType evaluatedResult) {
		this.evaluatedResult = evaluatedResult;
	}
	
}
