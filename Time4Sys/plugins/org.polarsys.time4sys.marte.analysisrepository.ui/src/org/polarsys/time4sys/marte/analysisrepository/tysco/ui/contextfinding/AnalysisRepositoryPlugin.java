package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
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
