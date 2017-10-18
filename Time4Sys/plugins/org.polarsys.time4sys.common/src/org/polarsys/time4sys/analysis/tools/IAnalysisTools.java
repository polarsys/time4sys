package org.polarsys.time4sys.analysis.tools;

import org.eclipse.emf.ecore.EObject;

public interface IAnalysisTools {

    static final String IANALYSIS_TOOLS_ID =
            "org.polarsys.time4sys.analysis.tools";

	public void execute();
	
	public void execute(EObject obj);
}
