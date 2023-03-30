package org.polarsys.time4sys.graphics.partition.ui;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Region;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;
import org.polarsys.time4sys.graphics.partition.Partition;
import org.polarsys.time4sys.graphics.partition.Slot;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

public class PartitionViewPart extends ViewPart {

	public static final String ID = "org.polarsys.time4sys.graphics.partition.PartitionView"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Table table;
	private Table table_1;
	private Canvas canvas;
	private Map<Partition,Table> partitionsTables = new HashMap<Partition,Table>();
	private Map<Partition,TableItem> partitionsItems = new HashMap<Partition,TableItem>();
	
	private java.util.List<Partition> partitions = new ArrayList<Partition>();
	
	private ColorPalette colorPalette = new ColorPalette(Display.getCurrent());
	
	private Map<Partition,Color> partitionColor = new HashMap<Partition,Color>();
	private Composite parent;
	private Composite container;
	private String cpuName = "";
	
	public void setPartitions(java.util.List<Partition> parts){
//		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//		PartitionViewPart view = (PartitionViewPart) page.findView("org.polarsys.time4sys.graphics.partition.PartitionView");	
		partitions.clear();
		partitions.addAll(parts);
	}
	
//	private Table table;

	public PartitionViewPart() {
	}
	
	public void reinit() {
		if(parent != null) {
			if(container != null) {
				if(!container.isDisposed()) {
					container.dispose();
					partitionsTables.clear();
					partitionsItems.clear();
					partitionColor.clear();
					createPartControl(parent);
					parent.layout();
				}
			}
		}
	}

	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		
//		Partition userPartition = new Partition();
//		userPartition.setName("User");
//		userPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("0ms"),NfpFactory.eINSTANCE.createDurationFromString("150ms"));
//		userPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("250ms"),NfpFactory.eINSTANCE.createDurationFromString("330ms"));
//		partitions.add(userPartition);
//		
//		Partition utilsPartition = new Partition();
//		utilsPartition.setName("Utils");
//		utilsPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("150ms"),NfpFactory.eINSTANCE.createDurationFromString("250ms"));
//		utilsPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("340ms"),NfpFactory.eINSTANCE.createDurationFromString("500ms"));
//		partitions.add(utilsPartition);
//		
//		Partition reservedPartition = new Partition();
//		reservedPartition.setName("Reserved");
//		reservedPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("500ms"),NfpFactory.eINSTANCE.createDurationFromString("800ms"));
//		partitions.add(reservedPartition);
		
		/* Init Partitions colors */	
		for(int i=0; i<partitions.size();i++){
			partitionColor.put(partitions.get(i), colorPalette.getColor(i));
		}
		
		createContent(parent);
		
//		createActions();
//		initializeToolBar();
//		initializeMenu();
	}
	

	public void createContent(Composite parent){
		this.container = toolkit.createComposite(parent, SWT.NONE);
		toolkit.paintBordersFor(container);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(1, false));
		
		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		GridData gd_lblNewLabel_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel_1.horizontalIndent = 5;
		lblNewLabel_1.setLayoutData(gd_lblNewLabel_1);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		toolkit.adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText(cpuName);
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		composite_1.setLayout(new GridLayout(1, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		toolkit.adapt(composite_1);
		toolkit.paintBordersFor(composite_1);
		
		canvas = new Canvas(composite_1, SWT.NONE);
		canvas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		GridData gd_canvas = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_canvas.minimumHeight = 100;
		gd_canvas.heightHint = 135;
		canvas.setLayoutData(gd_canvas);
		toolkit.adapt(canvas);
		toolkit.paintBordersFor(canvas);
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		composite_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		composite_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		toolkit.adapt(composite_2);
		toolkit.paintBordersFor(composite_2);
		composite_2.setLayout(new GridLayout(2, false));
		
		Composite comboComposite = new Composite(composite_2, SWT.NONE);
		GridData gd_comboComposite = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
		gd_comboComposite.widthHint = 180;
		comboComposite.setLayoutData(gd_comboComposite);
		comboComposite.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		comboComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		toolkit.adapt(comboComposite);
		toolkit.paintBordersFor(comboComposite);
		comboComposite.setLayout(new GridLayout(1, false));
		
		Label lblNewLabel = new Label(comboComposite, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		toolkit.adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Partitions:");
				
		Table partitionsTable = new Table(comboComposite, SWT.BORDER | SWT.CHECK /*| SWT.VIRTUAL*/);
		partitionsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.adapt(partitionsTable);
		toolkit.paintBordersFor(partitionsTable);
		partitionsTable.setHeaderVisible(false);
		partitionsTable.setLinesVisible(false);
		
		TableColumn tblclmnNewColumn = new TableColumn(partitionsTable, SWT.NONE);
		tblclmnNewColumn.setWidth(145);
		//tblclmnNewColumn.setText("start");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(partitionsTable, SWT.NONE);
		tblclmnNewColumn_1.setWidth(20);
		
		StackLayout sLayout = new StackLayout();
		
		Composite composite_3 = new Composite(composite_2, SWT.NONE);
		composite_3.setLayout(sLayout);
		GridData gd_composite_3 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_composite_3.verticalIndent = 0;
		composite_3.setLayoutData(gd_composite_3);
		toolkit.adapt(composite_3);
		toolkit.paintBordersFor(composite_3);	
		
		Label lblNewLabel_2 = new Label(composite_3, SWT.NONE);
		lblNewLabel_2.setAlignment(SWT.CENTER);
		toolkit.adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("Select partition to edit time slots...");
		
		for(Partition part: partitions){
			TableEditor editor = new TableEditor(partitionsTable);
			editor.grabHorizontal = true;
			TableItem tableItem = new TableItem(partitionsTable, SWT.NONE);
			tableItem.setChecked(true);
			tableItem.setText(0,part.getName());
			
			Canvas cellCanvas = new Canvas(partitionsTable,SWT.NONE);
			cellCanvas.addPaintListener(new PaintListener() {
				public void paintControl(PaintEvent e) {
					e.gc.setAlpha(100);
					e.gc.setBackground(partitionColor.get(part));
					e.gc.fillRectangle(0,0,20,22);//cellCanvas.getBounds());
				}
			});
			editor.setEditor(cellCanvas, tableItem, 1);
			
			tableItem.setData(part);
			
			Table table = createTable(part,composite_3);
			partitionsTables.put(part,table);
			partitionsItems.put(part, tableItem);
		}
		
		partitionsTable.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
				Table table = (Table)e.getSource();
				if(table.getSelectionIndex() != -1){
					// MEMO: use Data
					for(Entry<Partition,Table> entry: partitionsTables.entrySet()){					
						if(table.getItem(table.getSelectionIndex()).getText(0).equals(entry.getKey().getName())){
							sLayout.topControl = entry.getValue().getParent();
							break;
						}
					}
				}
				canvas.redraw(0,0,canvas.getSize().x,50,false);
				
				composite_3.layout();
			}
		});
		
		//table_1 = createTable(composite_3);

//		Spinner spinner = new Spinner(composite_2, SWT.BORDER);
//		toolkit.adapt(spinner);
//		toolkit.paintBordersFor(spinner);
		
//		spinner.addSelectionListener(new SelectionListener(){
//
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				canvas.redraw();
//				
//			}
//
//			@Override
//			public void widgetDefaultSelected(SelectionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}});
		
		Map<Region,String> regionTooltip = new HashMap<Region,String>();
		
		CanvasPaintListener canvasPaintListener = new CanvasPaintListener();
		canvasPaintListener.partitions = partitions;
		canvasPaintListener.partitionsItems = partitionsItems;
		canvasPaintListener.regionTooltip = regionTooltip;
		canvasPaintListener.partitionColor = partitionColor;
		
		canvas.addPaintListener(canvasPaintListener);		
		canvas.addMouseMoveListener(new MouseMoveListener(){

			@Override
			public void mouseMove(MouseEvent e) {
				for(Region r: canvasPaintListener.regionTooltip.keySet()){
					if(r.contains(e.x, e.y)){
						String tooltip = canvasPaintListener.regionTooltip.get(r);
						if(canvas.getToolTipText()==null || !canvas.getToolTipText().equals(tooltip)){
							canvas.setToolTipText(tooltip);
						}
						return;
					}
				}
				canvas.setToolTipText("");
				
			}});
	}

	private Table createTable(Partition partition, Composite parent) {	
		Composite tableComposite = new Composite(parent, SWT.NONE);
		tableComposite.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		tableComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		toolkit.adapt(tableComposite);
		toolkit.paintBordersFor(tableComposite);
		
		tableComposite.setLayout(new GridLayout(2, false));
		
		Label slotLabel = new Label(tableComposite, SWT.NONE);
		slotLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		toolkit.adapt(slotLabel, true, true);
		slotLabel.setText("Time Slots:");
		
		Table table = new Table(tableComposite, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		toolkit.adapt(table);
		toolkit.paintBordersFor(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setData(partition);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("start");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("end");
		
		for(Slot slot:partition.getSlots()){
			TableItem tableItem = new TableItem(table, SWT.NONE);
			tableItem.setText(0,slot.getStart().toString());
			tableItem.setText(1,slot.getEnd().toString());
			tableItem.setData(slot);
		}
		
		final TableEditor editor = new TableEditor(table);
		
		table.addListener(SWT.MouseDown, new Listener() {
			public void handleEvent(Event event) {
				Rectangle clientArea = table.getClientArea();
				Point pt = new Point(event.x, event.y);
				int index = table.getTopIndex();
				while (index < table.getItemCount()) {
					boolean visible = false;
					final TableItem item = table.getItem(index);
					for (int i = 0; i < table.getColumnCount(); i++) {
						Rectangle rect = item.getBounds(i);
						if (rect.contains(pt)) {
							final int column = i;
							final Text text = new Text(table, SWT.NONE);
							Listener textListener = new Listener() {
								public void handleEvent(final Event e) {
									switch (e.type) {
									case SWT.FocusOut:
										item.setText(column, text.getText());
										updateSlot(item);
										text.dispose();
										break;
									case SWT.Traverse:
										switch (e.detail) {
										case SWT.TRAVERSE_RETURN:
											item.setText(column, text.getText());
											updateSlot(item);
											canvas.redraw();
											text.dispose();
											//FALL THROUGH
										case SWT.TRAVERSE_ESCAPE:
											text.dispose();
											e.doit = false;
										}
										break;
									}
								}

								private void updateSlot(TableItem item) {
									Slot slot = (Slot) item.getData();
									slot.setStart(NfpFactory.eINSTANCE.createDurationFromString(item.getText(0)));
									slot.setEnd(NfpFactory.eINSTANCE.createDurationFromString(item.getText(1)));
									updateSlotMaxEnd();
								}
							};
							text.addListener(SWT.FocusOut, textListener);
							text.addListener(SWT.Traverse, textListener);
							editor.setEditor(text, item, i);
							text.setText(item.getText(i));
							text.selectAll();
							text.setFocus();
							return;
						}
						if (!visible && rect.intersects(clientArea)) {
							visible = true;
						}
					}
					if (!visible)
						return;
					index++;
				}
			}
		});
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		
		Composite buttonComposite = new Composite(tableComposite, SWT.NONE);
		buttonComposite.setLayout(new GridLayout(1, false));
		buttonComposite.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
		buttonComposite.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		buttonComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		toolkit.adapt(buttonComposite);
		toolkit.paintBordersFor(buttonComposite);
		
		Composite addRemoveComposite = new Composite(buttonComposite, SWT.NONE);
		GridLayout gl_addRemoveComposite = new GridLayout(1, false);
		gl_addRemoveComposite.marginWidth = 0;
		addRemoveComposite.setLayout(gl_addRemoveComposite);
		addRemoveComposite.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 1));
		addRemoveComposite.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		addRemoveComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		toolkit.adapt(addRemoveComposite);
		toolkit.paintBordersFor(addRemoveComposite);
		
		Button addButton = new Button(addRemoveComposite,SWT.NONE);
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		addButton.setText("ADD SLOT");
		addButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				/* compute item text (= last indt1) */
				TableItem item = new TableItem(table, SWT.NONE);
				item.setText(new String[] { "0ms","0ms" });
				Slot newSlot = new Slot(NfpFactory.eINSTANCE.createDurationFromString("0ms"),NfpFactory.eINSTANCE.createDurationFromString("0ms"));
				partition.getSlots().add(newSlot);
				item.setData(newSlot);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		Button removeButton = new Button(addRemoveComposite,SWT.NONE);
		removeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		removeButton.setText("REMOVE SLOT");
		removeButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				/* compute item text (= last indt1) */
				int selectedIndex = table.getSelectionIndex();
				if(selectedIndex == -1){
					return;
				}
				Slot slot = (Slot) table.getItem(selectedIndex).getData();
				partition.getSlots().remove(slot);
				updateSlotMaxEnd();
				table.remove(table.getSelectionIndex());
				canvas.redraw();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		Button saveButton = new Button(buttonComposite,SWT.NONE);
		saveButton.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, false, false, 1, 1));
		saveButton.setText("SAVE");
		saveButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				saveChanges();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		return table;
	}

	protected void saveChanges() {
		PartitionDisplayer.updatePartitions();
	}

	protected void updateSlotMaxEnd() {
		Slot.maxEnd = 0;
		for(Partition partition: partitions){
			for(Slot slot: partition.getSlots()){
				if(slot.getEndValue() > Slot.maxEnd){
					Slot.maxEnd = slot.getEndValue();
				}
			}
		}
		
	}

	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager manager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
	
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(750, 400);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		PartitionViewPart viewPart = new PartitionViewPart();
		viewPart.initExample();
		viewPart.createPartControl(shell);
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public void initExample() {		
		Partition userPartition = new Partition();
		userPartition.setName("User");
		userPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("0ms"),NfpFactory.eINSTANCE.createDurationFromString("150ms"));
		userPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("250ms"),NfpFactory.eINSTANCE.createDurationFromString("330ms"));
		partitions.add(userPartition);
		
		Partition utilsPartition = new Partition();
		utilsPartition.setName("Utils");
		utilsPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("150ms"),NfpFactory.eINSTANCE.createDurationFromString("250ms"));
		utilsPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("340ms"),NfpFactory.eINSTANCE.createDurationFromString("500ms"));
		partitions.add(utilsPartition);
		
		Partition reservedPartition = new Partition();
		reservedPartition.setName("Reserved");
		reservedPartition.addSlot(NfpFactory.eINSTANCE.createDurationFromString("500ms"),NfpFactory.eINSTANCE.createDurationFromString("800ms"));
		partitions.add(reservedPartition);		
		
	}

	public void setCPUName(String name) {
		this.cpuName = name;
		
	}
}
