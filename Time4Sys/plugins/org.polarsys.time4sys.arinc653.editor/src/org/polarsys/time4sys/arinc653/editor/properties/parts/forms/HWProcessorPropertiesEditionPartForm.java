package org.polarsys.time4sys.arinc653.editor.properties.parts.forms;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.time4sys.arinc653.editor.properties.filters.HardwareProcessorFilter;
import org.polarsys.time4sys.arinc653.editor.properties.sources.PlatformPropertySource;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;

public class HWProcessorPropertiesEditionPartForm extends AbstractPropertySection {

	private Text labelText;
	private ModifyListener listener;
	private HardwareProcessor selected;
	private PropertySheetPage page;
	private IWorkbenchPage workbenchPage;

	public HWProcessorPropertiesEditionPartForm() {
		super();
		page = new PropertySheetPage();
		page.setPropertySourceProvider(new IPropertySourceProvider() {

			@Override
			public IPropertySource getPropertySource(Object object) {
				if (object instanceof HardwareProcessor) {
					assert(object == selected);
					return new PlatformPropertySource(selected, workbenchPage);
				}
				return null;
			}
		});
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		workbenchPage = part.getSite().getPage();
		selected = HardwareProcessorFilter.SINGLETON.unwrap(selection);
		if (selected != null) {
			/*page.selectionChanged(part, selection);
			page.handleEntrySelection(selection);*/
			//labelText.setText(selected.getName());
			page.selectionChanged(part, new StructuredSelection(selected));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
//		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
//		FormData data;
//
//		labelText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
//		data = new FormData();
//		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
//		data.right = new FormAttachment(100, 0);
//		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
//		labelText.setLayoutData(data);
//		// labelText.addModifyListener(listener);
//
//		CLabel labelLabel = getWidgetFactory().createCLabel(composite, "Label:"); //$NON-NLS-1$
//		data = new FormData();
//		data.left = new FormAttachment(0, 0);
//		data.right = new FormAttachment(labelText, -ITabbedPropertyConstants.HSPACE);
//		data.top = new FormAttachment(labelText, 0, SWT.CENTER);
//		labelLabel.setLayoutData(data);

		page.createControl(parent);
	}

	@Override
	public void dispose() {
		page.dispose();
	}
	
	public void refresh() {
		page.refresh();
	}
}
