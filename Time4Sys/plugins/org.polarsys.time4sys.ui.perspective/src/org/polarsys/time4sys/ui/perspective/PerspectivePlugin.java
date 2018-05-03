/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/

package org.polarsys.time4sys.ui.perspective;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class PerspectivePlugin extends AbstractUIPlugin {
  /**
   * The shared instance
   */
  private static PerspectivePlugin __plugin;

  /*
   * 
   */
  public static final String PLUGIN_ID = "org.polarsys.time4sys.ui.perspective"; //$NON-NLS-1$

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(BundleContext context_p) throws Exception {
    super.start(context_p);
    __plugin = this;
  }

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  @Override
  public void stop(BundleContext context_p) throws Exception {
    super.stop(context_p);
    __plugin = null;
  }

  /**
   * Returns the shared instance
   * @return the shared instance
   */
  public static PerspectivePlugin getDefault() {
    return __plugin;
  }
}
