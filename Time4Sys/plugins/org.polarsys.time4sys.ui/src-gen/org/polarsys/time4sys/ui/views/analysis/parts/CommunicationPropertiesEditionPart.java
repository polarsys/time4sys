/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.views.analysis.parts;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface CommunicationPropertiesEditionPart {

	/**
	 * @return the name
	 * @generated
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * @generated
	 */
	public void setName(String newValue);




	/**
	 * Init the ports
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPorts(ReferencesTableSettings settings);

	/**
	 * Update the ports
	 * @param newValue the ports to update
	 * @generated
	 */
	public void updatePorts();

	/**
	 * Adds the given filter to the ports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToPorts(ViewerFilter filter);

	/**
	 * Adds the given filter to the ports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToPorts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ports table
	 * @generated
	 */
	public boolean isContainedInPortsTable(EObject element);


	/**
	 * @return the behaviorKind
	 * @generated
	 */
	public Enumerator getBehaviorKind();

	/**
	 * Init the behaviorKind
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initBehaviorKind(Object input, Enumerator current);

	/**
	 * Defines a new behaviorKind
	 * @param newValue the new behaviorKind to set
	 * @generated
	 */
	public void setBehaviorKind(Enumerator newValue);


	/**
	 * @return the parent
	 * @generated
	 */
	public EObject getParent_();

	/**
	 * Init the parent
	 * @param settings the combo setting
	 */
	public void initParent_(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parent
	 * @param newValue the new parent to set
	 * @generated
	 */
	public void setParent_(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter);

	/**
	 * Adds the given filter to the parent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter);


	/**
	 * @return the scheduledBy
	 * @generated
	 */
	public EObject getScheduledBy();

	/**
	 * Init the scheduledBy
	 * @param settings the combo setting
	 */
	public void initScheduledBy(EObjectFlatComboSettings settings);

	/**
	 * Defines a new scheduledBy
	 * @param newValue the new scheduledBy to set
	 * @generated
	 */
	public void setScheduledBy(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setScheduledByButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the scheduledBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToScheduledBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the scheduledBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToScheduledBy(ViewerFilter filter);


	/**
	 * @return the CET
	 * @generated
	 */
	public String getCET();

	/**
	 * Defines a new CET
	 * @param newValue the new CET to set
	 * @generated
	 */
	public void setCET(String newValue);




	/**
	 * Init the schedulingParameters
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSchedulingParameters(ReferencesTableSettings settings);

	/**
	 * Update the schedulingParameters
	 * @param newValue the schedulingParameters to update
	 * @generated
	 */
	public void updateSchedulingParameters();

	/**
	 * Adds the given filter to the schedulingParameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToSchedulingParameters(ViewerFilter filter);

	/**
	 * Adds the given filter to the schedulingParameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToSchedulingParameters(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the schedulingParameters table
	 * @generated
	 */
	public boolean isContainedInSchedulingParametersTable(EObject element);


	/**
	 * @return the originalName
	 * @generated
	 */
	public String getOriginalName();

	/**
	 * Defines a new originalName
	 * @param newValue the new originalName to set
	 * @generated
	 */
	public void setOriginalName(String newValue);


	/**
	 * @return the bus
	 * @generated
	 */
	public EObject getBus();

	/**
	 * Init the bus
	 * @param settings the combo setting
	 */
	public void initBus(EObjectFlatComboSettings settings);

	/**
	 * Defines a new bus
	 * @param newValue the new bus to set
	 * @generated
	 */
	public void setBus(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setBusButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the bus edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToBus(ViewerFilter filter);

	/**
	 * Adds the given filter to the bus edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToBus(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
