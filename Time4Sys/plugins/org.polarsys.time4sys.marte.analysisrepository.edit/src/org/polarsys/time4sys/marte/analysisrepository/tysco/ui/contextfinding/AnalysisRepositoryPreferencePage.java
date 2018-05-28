package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class AnalysisRepositoryPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
 {
    /**
     * List of legal file extension suffixes, or <code>null</code>
     * for system defaults.
     */
    private String[] extensions = {"analysis"};

	private static final String message = "Specify neccessary informations to analysis context";
	
    public AnalysisRepositoryPreferencePage() {
        super(GRID);
    }

	@Override
	protected void createFieldEditors() {
        FileFieldEditor editor = new FileFieldEditor("PATH", "&Analysis Repository file:", getFieldEditorParent());
        extensions[0]="";
        editor.setFileExtensions(extensions);
		addField(editor);
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub
        setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.polarsys.time4sys.analysis.repository.preference"));
        setDescription(message);
    }

}
