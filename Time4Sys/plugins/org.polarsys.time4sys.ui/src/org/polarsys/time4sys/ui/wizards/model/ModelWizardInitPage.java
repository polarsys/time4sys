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

package org.polarsys.time4sys.ui.wizards.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * The model initialization wizard page.
 */
public class ModelWizardInitPage extends WizardPage {

	protected Combo initialObjectField;

	protected List<String> encodings;

	protected Combo encodingField;

	protected ModifyListener validator = new ModifyListener() {
		public void modifyText(ModifyEvent e) {
			setPageComplete(validatePage());
		}
	};

	/**
	 * Pass in the selection.
	 *
	 * @param pageId
	 *            Page Id
	 */
	public ModelWizardInitPage(String pageId) {
		super(pageId);
	}

	public void createControl(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		{
			final GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			layout.verticalSpacing = 12;
			composite.setLayout(layout);

			final GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			composite.setLayoutData(data);
		}

		final Label containerLabel = new Label(composite, SWT.LEFT);
		{
			containerLabel.setText("Model Object:");

			final GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			containerLabel.setLayoutData(data);
		}

		initialObjectField = new Combo(composite, SWT.BORDER);
		{
			final GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			initialObjectField.setLayoutData(data);
		}

		for (final String objectName : getInitialObjectNames()) {
			initialObjectField.add(objectName);
		}

		initialObjectField.select(0);
		initialObjectField.addModifyListener(validator);

		setPageComplete(validatePage());
		setControl(composite);
	}

	/**
	 * Get initial object name.
	 *
	 * @return Name
	 */
	public String getInitialObjectName() {
		return initialObjectField.getText();
	}

	private List<String> getInitialObjectNames() {
		final List<String> names = new ArrayList<String>();
		names.add("Project");
		names.add("Design");
		names.add("Analysis");
		return names;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.clearSelection();
				encodingField.setFocus();
			} else {
				initialObjectField.setFocus();
			}
		}
	}

	protected boolean validatePage() {
		return getInitialObjectName() != null;
	}

}
