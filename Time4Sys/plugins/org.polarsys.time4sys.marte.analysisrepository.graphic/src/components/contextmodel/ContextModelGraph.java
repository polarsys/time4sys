package components.contextmodel;

import java.util.ArrayList;
import java.util.List;

import com.mxgraph.layout.mxCompactTreeLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;

public class ContextModelGraph extends mxGraph {

	/** Graph's components */
	private Object parent;
	private List<Object> nodeList;
	private List<Object> edgeList;

	private static int delta = 50;
	
	private mxGraphComponent graphComponent;
	
	
	/**
	 * Default constructor
	 */
	public ContextModelGraph() {
		
		reset();
        parent = getDefaultParent();
        graphComponent = new mxGraphComponent(this);
        nodeList = new ArrayList<Object>();
        edgeList = new ArrayList<Object>();
        adjustGraphConfig();
	}
	
	/**
	 * Add a node to graph
	 * @param nodeLabel
	 * @return
	 */
	public Object addNode(String nodeLabel) {
		getModel().beginUpdate();
		Object vertex = insertVertex(parent,null,nodeLabel,delta,delta,30,30);
		delta+=30;
		nodeList.add(vertex);
		cellsFolded(new Object[] {vertex}, true, true);
		getModel().endUpdate();
		
		refresh();
		return vertex;
	}
	
	/**
	 * Add an edge to graph
	 * @param edgeLabel
	 * @param sourceNode
	 * @param targetNode
	 * @return
	 */
	public Object addEdge(String edgeLabel,Object sourceNode, Object targetNode) {
        getModel().beginUpdate();
        Object edge = insertEdge(parent, null, edgeLabel, sourceNode, targetNode);
        edgeList.add(edge);
        getModel().endUpdate();
        refresh();
		return edge;
	}
	
	/**
	 * Set color for the node
	 * @param node
	 * @param colorName
	 */
	public void setNodeColor(Object node,String colorName) {
		setCellStyles(mxConstants.STYLE_FILLCOLOR, colorName, new Object[]{node});
	}
	
	
	/**
	 * Set color for the node
	 * @param node
	 * @param colorName
	 */
	public void setNodeTextColor(Object node,String colorName) {
		setCellStyles(mxConstants.STYLE_FONTCOLOR, colorName, new Object[]{node});
	}
	
	
	/**
	 * Set color for the nodes
	 * @param node
	 * @param colorName
	 */
	public void setNodesColor(Object[] nodes,String colorName) {
		setCellStyles(mxConstants.STYLE_FILLCOLOR, colorName,nodes);
	}

	
	/**
	 * Set color for the edge
	 * @param edge
	 * @param colorName
	 */
	public void setEdgeColor(Object edge,String colorName) {
		setCellStyles(mxConstants.STYLE_STROKECOLOR, colorName, new Object[]{edge});
	}
	
	/**
	 * Set color for the edges
	 * @param edges
	 * @param colorName
	 */
	public void setEdgesColor(Object[] edges,String colorName) {
		setCellStyles(mxConstants.STYLE_STROKECOLOR, colorName,edges);
	}
	
	/**
	 * Get node whose name is nodeLable from NodeList
	 * @param nodeLabel
	 * @return
	 */
	public Object getNodeByLabel(String nodeLabel) {
		for (Object o : nodeList) {
			if (((mxCell)o).getValue().toString().compareTo(nodeLabel)==0) return o;
		}
		return null;
	}
	
	
	/**
	 * @param 
	 * @return
	 */
	public Object getEdgeByLabel(String sourceNodeLabel,String targetNodeLabel) {
		for (Object o : edgeList) {
			String source = (String) ((mxCell)o).getSource().getValue();
			String target = (String) ((mxCell)o).getTarget().getValue();
			if (source.compareTo(sourceNodeLabel)==0 && target.compareTo(targetNodeLabel)==0) return o;
		}
		return null;
	}
	/**
	 * Refresh the ui
	 */
	public void refresh() {
		graphComponent.setFoldingEnabled(true);
		//graphComponent.refresh();
	}
	
	
	/**
	 * Adjust graph configuration
	 */
	private void adjustGraphConfig() {
        mxCompactTreeLayout layout = new mxCompactTreeLayout(this);
		//mxHierarchicalLayout layout = new mxHierarchicalLayout(this);
        
        layout.setLevelDistance(120);
        layout.setNodeDistance(120);
//        layout.setEdgeRouting(true);
        layout.setUseBoundingBox(true);
        layout.execute(getDefaultParent());
        
        //final mxGraphComponent graphComponent = new mxGraphComponent(trafficGraphVisual);
        //pnlGraphVisual.add(graphComponent, BorderLayout.CENTER);
        //new mxHierarchicalLayout(this).execute(this.getDefaultParent());
        //new mxParallelEdgeLayout(this).execute(this.getDefaultParent());
	}
	
	
	public mxGraphComponent getGraphComponent() {
		return graphComponent;
	}

	public void setGraphComponent(mxGraphComponent graphComponent) {
		this.graphComponent = graphComponent;
	}
	
	private void reset() {
		delta = 50;
	}
	
	/*
	public static void main(String[] args) {
		final JFrame frame = new JFrame();
        frame.setSize(300, 300);
        JPanel panel = new JPanel();
        panel.setSize(frame.getMaximumSize().width,frame.getMaximumSize().height);
        
        ContextModelGraph graph = new ContextModelGraph();
        
        graph.addNode("node1");
        
        panel.setLayout(new BorderLayout());
        panel.add(graph.getGraphComponent(), BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/
}
