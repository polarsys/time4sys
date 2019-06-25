/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 *
 *******************************************************************************/
package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils;

import eclipseview.polarsys.ui.components.Connection;
import eclipseview.polarsys.ui.components.GraphModel;
import eclipseview.polarsys.ui.components.GraphModelFactory;
import eclipseview.polarsys.ui.components.Node;



public class GraphModelUtils {

	/**
	 * create node and add to graph model
	 * @param nodeLabel
	 * @param graph
	 * @param factory
	 * @return
	 */
	public static Node createNode(String nodeLabel, GraphModel graph, GraphModelFactory factory) {
		Node node = factory.createNode();
		node.setLabel(nodeLabel);
		graph.getAllNodes().add(node);
		
		return node;
	}
	
	/**
	 * create Connection
	 * @param connectionLabel
	 * @param graph
	 * @param factory
	 * @return
	 */
	public static Connection createConnection(String connectionLabel, GraphModel graph,GraphModelFactory factory) {
		Connection conn = factory.createConnection();
		conn.setLabel(connectionLabel);
		graph.getAllConnections().add(conn);
		
		return conn;
	}
	
	/**
	 * parent shell
	 * @param graphModel
	 * @param parentShell
	 
	public static void visualizeGraph(GraphModel graphModel,Shell parentShell) {
		
		Display display = parentShell.getDisplay();
		Shell shell = new Shell(display);
		shell.open();
		shell.setLayout(new FillLayout());
		
		Display display = parentShell.getDisplay();
		
		PolarsysGraphView view = new PolarsysGraphView(parentShell);
		view.getCtrl().visualize(graphModel);
		view.setTreeLayoutAlgorithm();
        while (!parentShell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
				
	}*/
}
