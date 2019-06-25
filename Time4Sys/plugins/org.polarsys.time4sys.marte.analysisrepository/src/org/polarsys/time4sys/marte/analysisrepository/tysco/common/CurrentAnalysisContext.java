/*******************************************************************************
 * Copyright (c) 2018-2019 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Aurelien DIDIER- initial API and implementation
 *
 *******************************************************************************/
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
