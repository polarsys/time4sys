/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.model.time4sys.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.polarsys.time4sys.design.provider.DesignEditPlugin;
import org.polarsys.time4sys.mapping.provider.MappingEditPlugin;
import org.polarsys.time4sys.marte.gqam.provider.AllocEditPlugin;
import org.polarsys.time4sys.marte.gqam.provider.GqamEditPlugin;
import org.polarsys.time4sys.marte.grm.provider.GrmEditPlugin;
import org.polarsys.time4sys.marte.nfp.annotation.provider.Nfp_AnnotationEditPlugin;
import org.polarsys.time4sys.marte.nfp.coreelements.provider.CoreElementsEditPlugin;
import org.polarsys.time4sys.marte.sam.provider.SamEditPlugin;
import org.polarsys.time4sys.trace.provider.TraceEditPlugin;

/**
 * This is the central singleton for the Time4sys edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Time4sysEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Time4sysEditPlugin INSTANCE = new Time4sysEditPlugin();

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
	public Time4sysEditPlugin() {
		super
		  (new ResourceLocator [] {
		     AllocEditPlugin.INSTANCE,
		     DesignEditPlugin.INSTANCE,
		     GqamEditPlugin.INSTANCE,
		     GrmEditPlugin.INSTANCE,
		     MappingEditPlugin.INSTANCE,
		     TraceEditPlugin.INSTANCE,
		     CoreElementsEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     Nfp_AnnotationEditPlugin.INSTANCE,
		     SamEditPlugin.INSTANCE,
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
