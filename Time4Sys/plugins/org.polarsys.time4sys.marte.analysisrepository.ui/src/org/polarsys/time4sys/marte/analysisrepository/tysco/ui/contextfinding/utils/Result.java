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
