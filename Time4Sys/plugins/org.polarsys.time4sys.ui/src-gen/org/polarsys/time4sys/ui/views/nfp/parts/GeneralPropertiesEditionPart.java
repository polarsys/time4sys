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
package org.polarsys.time4sys.ui.views.nfp.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface GeneralPropertiesEditionPart {

	/**
	 * @return the value
	 * 
	 */
	public String getValue();

	/**
	 * Defines a new value
	 * @param newValue the new value to set
	 * 
	 */
	public void setValue(String newValue);


	/**
	 * @return the unit
	 * 
	 */
	public Enumerator getUnit();

	/**
	 * Init the unit
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initUnit(Object input, Enumerator current);

	/**
	 * Defines a new unit
	 * @param newValue the new unit to set
	 * 
	 */
	public void setUnit(Enumerator newValue);


	/**
	 * @return the minOpen
	 * 
	 */
	public Boolean getMinOpen();

	/**
	 * Defines a new minOpen
	 * @param newValue the new minOpen to set
	 * 
	 */
	public void setMinOpen(Boolean newValue);


	/**
	 * @return the maxOpen
	 * 
	 */
	public Boolean getMaxOpen();

	/**
	 * Defines a new maxOpen
	 * @param newValue the new maxOpen to set
	 * 
	 */
	public void setMaxOpen(Boolean newValue);


	/**
	 * @return the best
	 * 
	 */
	public String getBest();

	/**
	 * Defines a new best
	 * @param newValue the new best to set
	 * 
	 */
	public void setBest(String newValue);


	/**
	 * @return the worst
	 * 
	 */
	public String getWorst();

	/**
	 * Defines a new worst
	 * @param newValue the new worst to set
	 * 
	 */
	public void setWorst(String newValue);


	/**
	 * @return the clock
	 * 
	 */
	public String getClock();

	/**
	 * Defines a new clock
	 * @param newValue the new clock to set
	 * 
	 */
	public void setClock(String newValue);


	/**
	 * @return the precision
	 * 
	 */
	public String getPrecision();

	/**
	 * Defines a new precision
	 * @param newValue the new precision to set
	 * 
	 */
	public void setPrecision(String newValue);


	/**
	 * @return the min
	 * 
	 */
	public EObject getMin();

	/**
	 * Init the min
	 * @param settings the combo setting
	 */
	public void initMin(EObjectFlatComboSettings settings);

	/**
	 * Defines a new min
	 * @param newValue the new min to set
	 * 
	 */
	public void setMin(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMinButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the min edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMin(ViewerFilter filter);

	/**
	 * Adds the given filter to the min edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMin(ViewerFilter filter);


	/**
	 * @return the max
	 * 
	 */
	public EObject getMax();

	/**
	 * Init the max
	 * @param settings the combo setting
	 */
	public void initMax(EObjectFlatComboSettings settings);

	/**
	 * Defines a new max
	 * @param newValue the new max to set
	 * 
	 */
	public void setMax(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMaxButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the max edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMax(ViewerFilter filter);

	/**
	 * Adds the given filter to the max edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMax(ViewerFilter filter);





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
