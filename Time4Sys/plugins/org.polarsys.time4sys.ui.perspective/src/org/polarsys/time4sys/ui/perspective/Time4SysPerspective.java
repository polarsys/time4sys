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

package org.polarsys.time4sys.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * The Time4Sys perspective factory.
 */
public class Time4SysPerspective implements IPerspectiveFactory {
	/**
	 * The Time4Sys perspective identifier.
	 */
	public static final String PERSPECTIVE_ID = "org.polarsys.time4sys.ui.perspective"; //$NON-NLS-1$

	/**
	 * The model explorer view identifier.
	 */
	public static final String MODEL_EXPLORER_ID = "org.eclipse.sirius.ui.tools.views.model.explorer";

	/**
	 * The contextual explorer view identifier.
	 */
	public static final String CONTEXTUAL_EXPLORER_ID = "org.eclipse.amalgam.explorer.contextual.ui.view.ExplorerContextualID";

	/**
	 * The outline view identifier.
	 */
	public static final String OUTLINE_ID = IPageLayout.ID_OUTLINE;
	/**
	 * The property view identifier.
	 */
	public static final String PROPERTIES_ID = IPageLayout.ID_PROP_SHEET;
	/**
	 * The center area place holder identifier.
	 */
	public static final String CENTER_AREA = "center"; //$NON-NLS-1$

	/**
	 * The top left area place holder identifier.
	 */
	public static final String TOPLEFT_AREA = "topLeft"; //$NON-NLS-1$

	/**
	 * The bottom left area place holder identifier.
	 */
	public static final String BOTTOMLEFT_AREA = "bottomLeft"; //$NON-NLS-1$

	/**
	 * The bottom area place holder.
	 */
	public static final String BOTTOM_AREA = "bottom"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	@Override
	public void createInitialLayout(IPageLayout layout_p) {
		// Allow editors.
		layout_p.setEditorAreaVisible(true);
		layout_p.createPlaceholderFolder(CENTER_AREA, IPageLayout.LEFT, 0.99f, IPageLayout.ID_EDITOR_AREA);

		IFolderLayout topLeft = layout_p.createFolder(TOPLEFT_AREA, IPageLayout.LEFT,
				(IPageLayout.DEFAULT_VIEW_RATIO / 2), IPageLayout.ID_EDITOR_AREA);
		topLeft.addView(MODEL_EXPLORER_ID);

		IFolderLayout bottomLeft = layout_p.createFolder(BOTTOMLEFT_AREA, IPageLayout.BOTTOM,
				(IPageLayout.DEFAULT_VIEW_RATIO / 0.7f), TOPLEFT_AREA);
		bottomLeft.addView(OUTLINE_ID);

		IFolderLayout bottom = layout_p.createFolder(BOTTOM_AREA, IPageLayout.BOTTOM,
				(IPageLayout.DEFAULT_VIEW_RATIO / 0.7f), IPageLayout.ID_EDITOR_AREA);
		bottom.addView(PROPERTIES_ID);
		bottom.addView(CONTEXTUAL_EXPLORER_ID);
	}
}
