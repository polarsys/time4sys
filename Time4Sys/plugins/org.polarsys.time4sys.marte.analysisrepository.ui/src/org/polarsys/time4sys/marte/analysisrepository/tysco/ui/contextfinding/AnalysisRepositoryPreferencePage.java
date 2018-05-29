package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class AnalysisRepositoryPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	/**
	 * List of legal file extension suffixes, or <code>null</code> for system
	 * defaults.
	 */
	private String[] extensions = { "*.tysco" };

	private static final String message = "Specify neccessary informations to analysis context";
	
	private FileFieldEditor editor;


	public AnalysisRepositoryPreferencePage() {
		super(GRID);
	}

	@Override
	protected void createFieldEditors() {
		editor = new FileFieldEditor("AnalysisRepositoryPath", "&Analysis Repository file:", getFieldEditorParent());
		editor.setFileExtensions(extensions);
		addField(editor);
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub
		setPreferenceStore(AnalysisRepositoryPlugin.getDefault().getPreferenceStore());
		setDescription(message);
	}

	protected IPreferenceStore doGetPreferenceStore() {
		return AnalysisRepositoryPlugin.getDefault().getPreferenceStore();
	}
	
	public boolean performOk() {
		editor.store();
		return super.performOk();
	}
	
	protected void performDefaults() {
		editor.loadDefault();
	}

}