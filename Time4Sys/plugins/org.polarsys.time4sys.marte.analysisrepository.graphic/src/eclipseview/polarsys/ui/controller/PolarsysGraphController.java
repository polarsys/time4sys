package eclipseview.polarsys.ui.controller;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;

import eclipseview.polarsys.ui.components.Color;
import eclipseview.polarsys.ui.components.Connection;
import eclipseview.polarsys.ui.components.GraphModel;
import eclipseview.polarsys.ui.components.Node;
import eclipseview.polarsys.ui.graphmodel.PolarsysGraphView;

public class PolarsysGraphController {

	// user interface
	private PolarsysGraphView ui;
	
	/**
	 * default constructor 
	 */
	public PolarsysGraphController() {}
	
	/**
	 * constructor with param
	 * @param ui
	 */
	public PolarsysGraphController(PolarsysGraphView view) {
		ui = view;
	}
	
	/**
	 * visualize a graph
	 * @param graph
	 */
	public void visualize(GraphModel graph) {
		
		// create nodes
		List<Node> allNodes = graph.getAllNodes();
		List<GraphNode> allNodeUIs = new ArrayList<GraphNode>();
		
		for (Node node : allNodes) {
			
			String nodeLabel = node.getLabel();
			Color nodeColor = node.getColor();
			GraphNode graphNode = ui.createGraphNode(SWT.NONE, nodeLabel);
			ui.setColor(graphNode,nodeColor);
			allNodeUIs.add(graphNode);
			
		}
		
		// create connection
		List<Connection> allConnections = graph.getAllConnections();
		for (Connection conn : allConnections) {
			
			Color connectionColor = conn.getColor();
			GraphNode source = getNodeUiFromLabel(allNodeUIs,conn.getSource().getLabel());
			GraphNode target = getNodeUiFromLabel(allNodeUIs,conn.getTarget().getLabel());
			if (source!=null && target!=null) {
				GraphConnection graphConnection = ui.createGraphConnection(source,target,SWT.NONE);
				ui.setColor(graphConnection,connectionColor);
			}			
		}
	}


	/**
	 * get graph node from UI by label
	 * @param allNodeUis
	 * @param label
	 * @return
	 */
	private static GraphNode getNodeUiFromLabel(List<GraphNode> allNodeUis,String label) {
		
		for (GraphNode n : allNodeUis) {
			if (n.getText().trim().compareTo(label.trim())==0) return n;
		}
		
		return null;
	}
	
	
	/************************* Getter and Setter *****************************/
	public PolarsysGraphView getView() {
		return ui;
	}

}
