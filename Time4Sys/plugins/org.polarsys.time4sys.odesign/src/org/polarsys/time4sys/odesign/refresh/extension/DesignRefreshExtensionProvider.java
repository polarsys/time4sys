/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.refresh.extension;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtension;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtensionProvider;

public class DesignRefreshExtensionProvider implements IRefreshExtensionProvider {

  private static final DesignRefreshExtension REFRESH_EXTENSION = new DesignRefreshExtension();

  public DesignRefreshExtensionProvider() {
    // Nothing
  }

  /**
   * @see org.eclipse.sirius.business.api.refresh.IRefreshExtensionProvider#getRefreshExtension(org.eclipse.sirius.DDiagram)
   */
  public IRefreshExtension getRefreshExtension(DDiagram viewPoint_p) {
    return REFRESH_EXTENSION;
  }

  /**
   * @see org.eclipse.sirius.business.api.refresh.IRefreshExtensionProvider#provides(org.eclipse.sirius.DDiagram)
   */
  public boolean provides(DDiagram viewPoint_p) {
    String name = viewPoint_p.getDescription().getName();
    return name.endsWith("Design Architecture");
  }
}
