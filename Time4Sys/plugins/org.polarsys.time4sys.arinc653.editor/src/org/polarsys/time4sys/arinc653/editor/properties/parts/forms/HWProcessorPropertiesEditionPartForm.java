package org.polarsys.time4sys.arinc653.editor.properties.parts.forms;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.time4sys.arinc653.editor.properties.filters.HardwareProcessorFilter;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;

public class HWProcessorPropertiesEditionPartForm extends AbstractPropertySection {

	private Text labelText;
	private ModifyListener listener;
	private HardwareProcessor selected;

	public HWProcessorPropertiesEditionPartForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		selected = HardwareProcessorFilter.SINGLETON.unwrap(selection);
		if (selected != null) {
			labelText.setText(selected.getName());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	 public void createControls(Composite parent,
             TabbedPropertySheetPage aTabbedPropertySheetPage) {
	super.createControls(parent, aTabbedPropertySheetPage);
    Composite composite = getWidgetFactory()
           .createFlatFormComposite(parent);
       FormData data;

       labelText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
       data = new FormData();
    data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
       data.right = new FormAttachment(100, 0);
    data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
       labelText.setLayoutData(data);
       //labelText.addModifyListener(listener);

       CLabel labelLabel = getWidgetFactory()
           .createCLabel(composite, "Label:"); //$NON-NLS-1$
       data = new FormData();
       data.left = new FormAttachment(0, 0);
       data.right = new FormAttachment(labelText,
           -ITabbedPropertyConstants.HSPACE);
       data.top = new FormAttachment(labelText, 0, SWT.CENTER);
       labelLabel.setLayoutData(data);       
   }
}
