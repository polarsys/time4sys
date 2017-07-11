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
package org.polarsys.time4sys.ui.views.hrm.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface TimingPropertiesEditionPart {

	/**
	 * @return the replPolicy
	 * 
	 */
	public Enumerator getReplPolicy();

	/**
	 * Init the replPolicy
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initReplPolicy(Object input, Enumerator current);

	/**
	 * Defines a new replPolicy
	 * @param newValue the new replPolicy to set
	 * 
	 */
	public void setReplPolicy(Enumerator newValue);


	/**
	 * @return the writePolicy
	 * 
	 */
	public Enumerator getWritePolicy();

	/**
	 * Init the writePolicy
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initWritePolicy(Object input, Enumerator current);

	/**
	 * Defines a new writePolicy
	 * @param newValue the new writePolicy to set
	 * 
	 */
	public void setWritePolicy(Enumerator newValue);


	/**
	 * @return the clock
	 * 
	 */
	public EObject getClock();

	/**
	 * Init the clock
	 * @param settings the combo setting
	 */
	public void initClock(EObjectFlatComboSettings settings);

	/**
	 * Defines a new clock
	 * @param newValue the new clock to set
	 * 
	 */
	public void setClock(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setClockButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the clock edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToClock(ViewerFilter filter);

	/**
	 * Adds the given filter to the clock edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToClock(ViewerFilter filter);


	/**
	 * @return the timings
	 * 
	 */
	public EList getTimings();

	/**
	 * Defines a new timings
	 * @param newValue the new timings to set
	 * 
	 */
	public void setTimings(EList newValue);

	/**
	 * Add a value to the timings multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToTimings(Object newValue);

	/**
	 * Remove a value to the timings multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToTimings(Object newValue);


	/**
	 * @return the inputClock
	 * 
	 */
	public EObject getInputClock();

	/**
	 * Init the inputClock
	 * @param settings the combo setting
	 */
	public void initInputClock(EObjectFlatComboSettings settings);

	/**
	 * Defines a new inputClock
	 * @param newValue the new inputClock to set
	 * 
	 */
	public void setInputClock(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInputClockButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the inputClock edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInputClock(ViewerFilter filter);

	/**
	 * Adds the given filter to the inputClock edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInputClock(ViewerFilter filter);




	/**
	 * Init the accCtrlPolicy
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAccCtrlPolicy(ReferencesTableSettings settings);

	/**
	 * Update the accCtrlPolicy
	 * @param newValue the accCtrlPolicy to update
	 * 
	 */
	public void updateAccCtrlPolicy();

	/**
	 * Adds the given filter to the accCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAccCtrlPolicy(ViewerFilter filter);

	/**
	 * Adds the given filter to the accCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAccCtrlPolicy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the accCtrlPolicy table
	 * 
	 */
	public boolean isContainedInAccCtrlPolicyTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
