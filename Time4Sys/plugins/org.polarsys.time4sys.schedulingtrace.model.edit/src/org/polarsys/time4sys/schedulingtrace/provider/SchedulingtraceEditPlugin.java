/**
 */
package org.polarsys.time4sys.schedulingtrace.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;

import org.polarsys.time4sys.marte.gqam.provider.GqamEditPlugin;

import org.polarsys.time4sys.marte.grm.provider.GrmEditPlugin;

import org.polarsys.time4sys.marte.hrm.provider.HrmEditPlugin;

import org.polarsys.time4sys.marte.nfp.annotation.provider.Nfp_AnnotationEditPlugin;

import org.polarsys.time4sys.marte.nfp.coreelements.provider.CoreElementsEditPlugin;

import org.polarsys.time4sys.trace.provider.TraceEditPlugin;

/**
 * This is the central singleton for the Schedulingtrace edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SchedulingtraceEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SchedulingtraceEditPlugin INSTANCE = new SchedulingtraceEditPlugin();

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
	public SchedulingtraceEditPlugin() {
		super
		  (new ResourceLocator [] {
		     CoreElementsEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     GqamEditPlugin.INSTANCE,
		     GrmEditPlugin.INSTANCE,
		     HrmEditPlugin.INSTANCE,
		     Nfp_AnnotationEditPlugin.INSTANCE,
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
	public static class Implementation extends EclipsePlugin {
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
