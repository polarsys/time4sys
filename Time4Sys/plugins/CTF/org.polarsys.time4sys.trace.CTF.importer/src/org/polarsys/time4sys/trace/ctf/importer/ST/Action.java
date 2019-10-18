/*******************************************************************************
 * Copyright (c) 2019 Link Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Khouloud BOUDHHIR / Oualid KHAYATI - initial API and implementation
 *******************************************************************************/

package org.polarsys.time4sys.trace.ctf.importer.ST;

/**
An implementation of the class Action

* The following features are implemented:
* - ActionName
* 
* @author Khouloud
*
*/
public class Action {
    private String mActionName;

    public Action(String actionName) {
        mActionName = actionName;
    }

    String getActionName() {
        return mActionName;
    }

    public String toString() {
        return mActionName;
    }

}