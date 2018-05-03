/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.analysis.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.IConstraintFilter;

public class Time4SysConstraintFilter implements IConstraintFilter{


	  /**
	   * Accept all constraints owned by the Common constraint category and the one defined by {@link #getFilterCategoryPath()}.
	   * @see org.eclipse.emf.validation.service.IConstraintFilter#accept(org.eclipse.emf.validation.service.IConstraintDescriptor, org.eclipse.emf.ecore.EObject)
	   */
	  public boolean accept(IConstraintDescriptor constraint_p, EObject target_p) {
	    boolean result = true;
	    //constraint_p.
	    return result;
	}

}
