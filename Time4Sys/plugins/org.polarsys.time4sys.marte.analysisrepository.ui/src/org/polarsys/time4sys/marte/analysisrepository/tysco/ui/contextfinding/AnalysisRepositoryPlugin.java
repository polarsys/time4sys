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
package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class AnalysisRepositoryPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static AnalysisRepositoryPlugin plugin;

	//The identifiers for the preferences	
	public static final String ANALYSIS_REPOSITORY = "AnalysisRepositoryPath";
	
	public AnalysisRepositoryPlugin() {
		plugin = this;
	}

	public static AnalysisRepositoryPlugin getDefault() {
		return plugin;
	}

	/** 
	 * Initializes a preference store with default preference values 
	 * for this plug-in.
	 */
	protected void initializeDefaultPreferences(IPreferenceStore store) {
		store.setDefault(ANALYSIS_REPOSITORY, "");
	}

}
