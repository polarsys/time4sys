package eclipseview.polarsys.ui.graphmodel;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import eclipseview.polarsys.ui.components.Color;
import eclipseview.polarsys.ui.components.GraphModel;
import eclipseview.polarsys.ui.controller.PolarsysGraphController;

public class PolarsysGraphView {
	// ViewPart {

	private Graph graphObj;
	private int layoutObj = 1;
	private Composite parent;
	private PolarsysGraphController controller;

	public static final String ID = "org.polarsys.time4sys.marte.analysisrepository.graphic.view";

	/**
	 * default constructor
	 */
	public PolarsysGraphView() {
		controller = new PolarsysGraphController(this);
	}

	/**
	 * constructor with param
	 * 
	 * @param parent
	 */
	public PolarsysGraphView(Composite parent) {

		// Graph Will Hold All Other Objects
		this.parent = parent;
		controller = new PolarsysGraphController(this);
		graphObj = new Graph(parent, SWT.NONE);

	}

	/*
	 * @Override public void setFocus() {}
	 */

	/*
	 * @Override public void dispose() { super.dispose(); }
	 */

	/**
	 * add a node to graph
	 * 
	 * @param graph
	 * @param style
	 * @param label
	 */
	public GraphNode createGraphNode(int style, String label) {
		GraphNode node = new GraphNode(graphObj, SWT.NONE, label);
		return node;
	}

	/**
	 * add a node to graph
	 * 
	 * @param graph
	 * @param style
	 * @param label
	 */
	public GraphNode createGraphNode(int style) {
		GraphNode node = new GraphNode(graphObj, SWT.NONE);
		return node;
	}

	/**
	 * get graph node by name
	 * 
	 * @param nodeName
	 * @return
	 */
	public List<GraphNode> getGraphNodebyName(String nodeName) {

		List<GraphNode> crpdNodes = new ArrayList<GraphNode>();
		for (Object node : graphObj.getNodes()) {
			if (((GraphNode) node).getText().trim().compareTo(nodeName.trim()) == 0)
				crpdNodes.add((GraphNode) node);
		}
		return crpdNodes;

	}

	/**
	 * add connection to graph
	 * 
	 * @param graph
	 * @param source
	 * @param target
	 * @param style
	 * @return
	 */
	public GraphConnection createGraphConnection(GraphNode source, GraphNode target, int style) {
		GraphConnection connection = new GraphConnection(graphObj, SWT.NONE, source, target);
		return connection;
	}

	/**
	 * add connection to graph
	 * 
	 * @param graph
	 * @param source
	 * @param target
	 * @param style
	 * @return
	 */
	public GraphConnection createGraphConnection(GraphNode source, GraphNode target, int style, String label) {
		GraphConnection connection = new GraphConnection(graphObj, SWT.NONE, source, target);
		connection.setText(label);
		return connection;
	}

	/**
	 * set text for node
	 * 
	 * @param node
	 * @param text
	 */
	public void setText(GraphNode node, String text) {
		node.setText(text);
	}

	/**
	 * set text for connection
	 * 
	 * @param connection
	 * @param text
	 */
	public void setText(GraphConnection connection, String text) {
		connection.setText(text);
	}

	/**
	 * set color
	 * 
	 * @param node
	 * @param color
	 */
	public void setColor(GraphNode node, Color color) {
		if (color == Color.BLACK) {
			node.setBorderColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		} else if (color == Color.BLUE) {
			node.setBorderColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLUE));
		} else if (color == Color.RED) {
			node.setBorderColor(parent.getDisplay().getSystemColor(SWT.COLOR_RED));
		} else if (color == Color.GREEN) {
			node.setBorderColor(parent.getDisplay().getSystemColor(SWT.COLOR_GREEN));
		} else if (color == Color.YELLOW) {
			node.setBorderColor(parent.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		}
	}

	/**
	 * set color
	 * 
	 * @param node
	 * @param color
	 */
	public void setBackGroundColor(GraphNode node, Color color) {
		if (color == Color.BLACK) {
			node.setBackgroundColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		} else if (color == Color.BLUE) {
			node.setBackgroundColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLUE));
		} else if (color == Color.RED) {
			node.setBackgroundColor(parent.getDisplay().getSystemColor(SWT.COLOR_RED));
		} else if (color == Color.GREEN) {
			node.setBackgroundColor(parent.getDisplay().getSystemColor(SWT.COLOR_GREEN));
		} else if (color == Color.YELLOW) {
			node.setBackgroundColor(parent.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		}
	}

	/**
	 * set figure for node
	 * 
	 * @param node
	 * @param figure
	 */
	public void setNodeFigure(GraphNode node, Image figure) {
		node.setImage(figure);
	}

	/**
	 * set figure for node
	 * 
	 * @param node
	 * @param figurePath
	 */
	public void setNodeFigure(GraphNode node, String figurePath) {

		Display display = parent.getDisplay();
		Image figure = new Image(display, figurePath);
		setNodeFigure(node, figure);

	}

	/**
	 * set figure for connection
	 * 
	 * @param connection
	 * @param figure
	 */
	public void setConnectionFigure(GraphConnection connection, Image figure) {
		connection.setImage(figure);
	}

	/**
	 * set figure for connection
	 * 
	 * @param connection
	 * @param figure
	 */
	public void setConnectionFigure(GraphConnection connection, String figurePath) {
		Display display = parent.getDisplay();
		Image figure = new Image(display, figurePath);
		connection.setImage(figure);
	}

	/**
	 * set color
	 * 
	 * @param node
	 * @param color
	 */
	public void setColor(GraphConnection connection, Color color) {
		if (color == Color.BLACK) {
			connection.changeLineColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		} else if (color == Color.BLUE) {
			connection.changeLineColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLUE));
		} else if (color == Color.RED) {
			connection.changeLineColor(parent.getDisplay().getSystemColor(SWT.COLOR_RED));
		} else if (color == Color.GREEN) {
			connection.changeLineColor(parent.getDisplay().getSystemColor(SWT.COLOR_GREEN));
		} else if (color == Color.YELLOW) {
			connection.changeLineColor(parent.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		}
	}

	/********************* Layout ***********************/

	/**
	 * set tree layout algorithm
	 */
	public void setTreeLayoutAlgorithm() {
		graphObj.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
	}

	/**
	 * set spring layout algorithm
	 */
	public void setSpringLayoutAlgorithm() {
		graphObj.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
	}

	/**
	 * set layout manager
	 */
	public void setLayoutManager() {
		switch (layoutObj) {
		case 1:
			graphObj.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			layoutObj++;
			break;
		case 2:
			graphObj.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			layoutObj = 1;
			break;
		}
	}

	/**
	 * get controller
	 * 
	 * @return
	 */
	public PolarsysGraphController getCtrl() {
		return controller;
	}

	public void setController(PolarsysGraphController ctrl) {
		controller = ctrl;
	}

	/**
	 * visualize the graph
	 */
	public void visualize(GraphModel graphModel) {

		Shell parentShell = parent.getShell();
		Display display = parentShell.getDisplay();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		PolarsysGraphView view = new PolarsysGraphView(shell);
		PolarsysGraphController ctrl = view.getCtrl();
		ctrl.visualize(graphModel);
		view.setTreeLayoutAlgorithm();

		shell.open();
		shell.setFocus();
		shell.setActive();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/*
	 * public static void main(String[] args) { new PolarsysGraphView(); }
	 */

	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		PolarsysGraphView view = new PolarsysGraphView(shell);

		GraphNode node1 = view.createGraphNode(SWT.NONE, "");
		view.setNodeFigure(node1, "icons/place_1_token.png");
		GraphNode node2 = view.createGraphNode(SWT.NONE, "");
		view.setNodeFigure(node2, "icons/place_no_token.png");
		GraphConnection conn = view.createGraphConnection(node1, node2, SWT.NONE);
		view.setConnectionFigure(conn, "icons/simple_connection.png");

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
