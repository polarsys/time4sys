/**
 */
package org.polarsys.time4sys.results.results.presentation;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;

import org.polarsys.time4sys.design.provider.DesignEditPlugin;

import org.polarsys.time4sys.mapping.provider.MappingEditPlugin;
import org.polarsys.time4sys.marte.gqam.provider.GqamEditPlugin;

import org.polarsys.time4sys.marte.grm.provider.GrmEditPlugin;

import org.polarsys.time4sys.marte.hrm.provider.HrmEditPlugin;

import org.polarsys.time4sys.marte.nfp.annotation.provider.Nfp_AnnotationEditPlugin;

import org.polarsys.time4sys.marte.nfp.coreelements.provider.CoreElementsEditPlugin;

import org.polarsys.time4sys.marte.nfp.provider.NfpEditPlugin;

import org.polarsys.time4sys.marte.sam.provider.SamEditPlugin;

import org.polarsys.time4sys.schedulingtrace.provider.SchedulingtraceEditPlugin;

import org.polarsys.time4sys.trace.provider.TraceEditPlugin;

/**
 * This is the central singleton for the Results editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ResultsEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ResultsEditorPlugin INSTANCE = new ResultsEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsEditorPlugin() {
		super
			(new ResourceLocator [] {
				CoreElementsEditPlugin.INSTANCE,
				DesignEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE,
				GqamEditPlugin.INSTANCE,
				GrmEditPlugin.INSTANCE,
				HrmEditPlugin.INSTANCE,
				MappingEditPlugin.INSTANCE,
				Nfp_AnnotationEditPlugin.INSTANCE,
				NfpEditPlugin.INSTANCE,
				SamEditPlugin.INSTANCE,
				SchedulingtraceEditPlugin.INSTANCE,
				TraceEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
