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
package org.polarsys.time4sys.design.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.polarsys.time4sys.marte.nfp.coreelements.provider.CoreElementsEditPlugin;
import org.polarsys.time4sys.marte.gqam.provider.AllocEditPlugin;
import org.polarsys.time4sys.marte.gqam.provider.GqamEditPlugin;
import org.polarsys.time4sys.marte.grm.provider.GrmEditPlugin;
import org.polarsys.time4sys.marte.hrm.provider.HrmEditPlugin;
import org.polarsys.time4sys.marte.nfp.annotation.provider.Nfp_AnnotationEditPlugin;
import org.polarsys.time4sys.marte.sam.provider.SamEditPlugin;
import org.polarsys.time4sys.marte.srm.provider.SrmEditPlugin;

/**
 * This is the central singleton for the Design edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class DesignEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DesignEditPlugin INSTANCE = new DesignEditPlugin();

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
	public DesignEditPlugin() {
		super
		  (new ResourceLocator [] {
		     EcoreEditPlugin.INSTANCE,
		     GqamEditPlugin.INSTANCE,
		     GrmEditPlugin.INSTANCE,
		     SrmEditPlugin.INSTANCE,
		     HrmEditPlugin.INSTANCE,
		     AllocEditPlugin.INSTANCE,
		     SamEditPlugin.INSTANCE,
		     CoreElementsEditPlugin.INSTANCE,
		     Nfp_AnnotationEditPlugin.INSTANCE,
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
