package org.polarsys.time4sys.marte.analysisrepository.tysco.common;

import org.polarsys.time4sys.design.DesignModel;

/** Singleton pattern*/
public class CurrentAnalysisContext {

		/** Private Constructor */
	private CurrentAnalysisContext() {
	}

	private static CurrentAnalysisContext INSTANCE = new CurrentAnalysisContext();

	public static CurrentAnalysisContext getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CurrentAnalysisContext();
		}
		return INSTANCE;
	}

	private DesignModel designModel;

	public DesignModel getDesignModel(){
		return designModel;
	};
	public void setDesignModel(DesignModel dm){
		designModel=dm;
	};
}
