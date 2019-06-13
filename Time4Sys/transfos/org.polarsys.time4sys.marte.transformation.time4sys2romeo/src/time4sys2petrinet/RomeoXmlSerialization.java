/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
package time4sys2petrinet;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.service.component.annotations.Component;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.AnalysisRepositoryControler;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.WorkspaceUtils;
import org.polarsys.time4sys.marte.analysisrepository.tysco.util.AbstractExogenousTransformation;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import petrinet.Connection;
import petrinet.FlushArc;
import petrinet.Node;
import petrinet.NormalArc;
import petrinet.PetriNet;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.TimedInhibitorArc;
import petrinet.Transition;

public class RomeoXmlSerialization implements AbstractExogenousTransformation{
	/**
	 * load model
	 * @param filePath
	 * @return
	 */
	public static PetriNet loadModel(String filePath) {
		PetrinetPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("petrinet", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resource = resSet.getResource(URI.createURI(filePath),true);
		
		PetriNet petriNet = (PetriNet) resource.getContents().get(0);
		return petriNet;
	}
	
	/**
	 * 
	 * @param petriNet
	 * @param outputFilePath
	 */
	public static void romeoXmlSerialization(PetriNet petriNet,String outputFilePath) {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("TPN");
			doc.appendChild(rootElement);
			
			// Create place nodes
			for (Place place : petriNet.getPlaces()) {
				
				Element placeNode = doc.createElement("place");
				rootElement.appendChild(placeNode);
				
				Attr attr = doc.createAttribute("id");
				String id = place.getId().substring(1);
				attr.setValue(id);
				placeNode.setAttributeNode(attr);
				
				Attr attr2 = doc.createAttribute("identifier");
				String identifier = place.getId();
				attr2.setValue(identifier);
				placeNode.setAttributeNode(attr2);
				
				Attr attr3 = doc.createAttribute("label");
				String name = place.getName();
				attr3.setValue(name);
				placeNode.setAttributeNode(attr3);
				
				Attr attr4 = doc.createAttribute("initialMarking");
				String initialMarking = ""+place.getInitCount();
				attr4.setValue(initialMarking);
				placeNode.setAttributeNode(attr4);
				
				Attr attr5 = doc.createAttribute("eft");
				String eft = "0";
				attr5.setValue(eft);
				placeNode.setAttributeNode(attr5);

				Attr attr6 = doc.createAttribute("lft");
				String lft = "inf";
				attr6.setValue(lft);
				placeNode.setAttributeNode(attr6);

			}
			
			// Create transition nodes
			for (Transition transition : petriNet.getTransitions()) {
				
				Element transitionNode = doc.createElement("transition");
				rootElement.appendChild(transitionNode);
				
				Attr attr = doc.createAttribute("id");
				String id = transition.getId().substring(1);
				attr.setValue(id);
				transitionNode.setAttributeNode(attr);
				
				Attr attr2 = doc.createAttribute("identifier");
				String identifier = transition.getId();
				attr2.setValue(identifier);
				transitionNode.setAttributeNode(attr2);
				
				Attr attr3 = doc.createAttribute("label");
				String name = transition.getName();
				attr3.setValue(name);
				transitionNode.setAttributeNode(attr3);
				
				Attr attr4 = doc.createAttribute("eft");
				String eft = transition.getLowerBound();
				attr4.setValue(eft);
				transitionNode.setAttributeNode(attr4);
				
				Attr attr5 = doc.createAttribute("lft");
				String lft = transition.getUpperBound();
				attr5.setValue(lft);
				transitionNode.setAttributeNode(attr5);
				
				Attr attr6 = doc.createAttribute("eft_param");
				String eft_param = transition.getLowerBound();
				attr6.setValue(eft_param);
				transitionNode.setAttributeNode(attr6);
				
				Attr attr7 = doc.createAttribute("lft_param");
				String lft_param = transition.getUpperBound();
				attr7.setValue(lft_param);
				transitionNode.setAttributeNode(attr7);
				
				Attr attr8 = doc.createAttribute("speed");
				String speed = "1";
				attr8.setValue(speed);
				transitionNode.setAttributeNode(attr8);
				
				Attr attr9 = doc.createAttribute("cost");
				String cost = "0";
				attr9.setValue(cost);
				transitionNode.setAttributeNode(attr9);
				
				Attr attr10 = doc.createAttribute("unctrl");
				String unctrl = "0";
				attr10.setValue(unctrl);
				transitionNode.setAttributeNode(attr10);
				
				Attr attr11 = doc.createAttribute("obs");
				String obs = "1";
				attr11.setValue(obs);
				transitionNode.setAttributeNode(attr11);
				
				Attr attr12 = doc.createAttribute("guard");
				String guard = "";
				attr12.setValue(guard);
				transitionNode.setAttributeNode(attr12);
			}
			
			// create arc nodes
			List<NormalArc> allNormalArcs = new ArrayList<NormalArc>();
			List<TimedInhibitorArc> allTimedInhibitorArcs = new ArrayList<TimedInhibitorArc>();
			List<FlushArc> allFlushArcs = new ArrayList<FlushArc>();
			
			for (Connection conn : petriNet.getConnections()) {
				if (conn instanceof NormalArc) allNormalArcs.add((NormalArc)conn);
				else if (conn instanceof TimedInhibitorArc) allTimedInhibitorArcs.add((TimedInhibitorArc)conn);
				else if (conn instanceof FlushArc) allFlushArcs.add((FlushArc)conn);
			}
			
			for (NormalArc normalArc : allNormalArcs) {
				
				Element arcNode = doc.createElement("arc");
				rootElement.appendChild(arcNode);
				
				Node source = normalArc.getSource();
				Node target = normalArc.getTarget();
				if (source instanceof Place && target instanceof Transition) {
					
					Attr attr = doc.createAttribute("place");
					String place = source.getId().substring(1);
					attr.setValue(place);
					arcNode.setAttributeNode(attr);

					Attr attr1 = doc.createAttribute("transition");
					String transition = target.getId().substring(1);
					attr1.setValue(transition);
					arcNode.setAttributeNode(attr1);
					
					Attr attr2 = doc.createAttribute("type");
					String type = "PlaceTransition";
					attr2.setValue(type);
					arcNode.setAttributeNode(attr2);
					
				} else if (source instanceof Transition && target instanceof Place) {
					
					Attr attr = doc.createAttribute("place");
					String place = target.getId().substring(1);
					attr.setValue(place);
					arcNode.setAttributeNode(attr);
					
					Attr attr1 = doc.createAttribute("transition");
					String transition = source.getId().substring(1);
					attr1.setValue(transition);
					arcNode.setAttributeNode(attr1);
					
					Attr attr2 = doc.createAttribute("type");
					String type = "TransitionPlace";
					attr2.setValue(type);
					arcNode.setAttributeNode(attr2);
					
				}
				
				Attr attr3 = doc.createAttribute("weight");
				String weight="1";
				if (normalArc.getToken()==0 || normalArc.getToken()==1) {
					weight = "1";
				} else {
					weight = ""+normalArc.getToken();
				}
				attr3.setValue(weight);
				arcNode.setAttributeNode(attr3);
			}
			
			for (TimedInhibitorArc timedInhibitorArc : allTimedInhibitorArcs) {
				
				Element arcNode = doc.createElement("arc");
				rootElement.appendChild(arcNode);
			
				Node source = timedInhibitorArc.getSource();
				Node target = timedInhibitorArc.getTarget();

				Attr attr = doc.createAttribute("place");
				String place = source.getId().substring(1);
				attr.setValue(place);
				arcNode.setAttributeNode(attr);
				
				Attr attr1 = doc.createAttribute("transition");
				String transition = target.getId().substring(1);
				attr1.setValue(transition);
				arcNode.setAttributeNode(attr1);
				
				Attr attr2 = doc.createAttribute("type");
				String type = "timedInhibitor";
				attr2.setValue(type);
				arcNode.setAttributeNode(attr2);
				
				Attr attr3 = doc.createAttribute("weight");
				String weight = "1";
				attr3.setValue(weight);
				arcNode.setAttributeNode(attr3);
			}
			
			for (FlushArc flushArc : allFlushArcs) {
				Element arcNode = doc.createElement("arc");
				rootElement.appendChild(arcNode);
			
				Node source = flushArc.getSource();
				Node target = flushArc.getTarget();

				Attr attr = doc.createAttribute("place");
				String place = source.getId().substring(1);
				attr.setValue(place);
				arcNode.setAttributeNode(attr);
				
				Attr attr1 = doc.createAttribute("transition");
				String transition = target.getId().substring(1);
				attr1.setValue(transition);
				arcNode.setAttributeNode(attr1);
				
				Attr attr2 = doc.createAttribute("type");
				String type = "flush";
				attr2.setValue(type);
				arcNode.setAttributeNode(attr2);
				
				Attr attr3 = doc.createAttribute("weight");
				String weight = "1";
				attr3.setValue(weight);
				arcNode.setAttributeNode(attr3);
			}
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(outputFilePath));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);
	
		} catch (ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Romeo xml serialization
	 * @param inputFilePath
	 * @param outputFilePath
	 */
	public static void romeoXmlSerialization(String inputFilePath,String outputFilePath) {
		
		PetriNet petriNet = loadModel(inputFilePath);
		romeoXmlSerialization(petriNet, outputFilePath);
	}
	
	
//	public static void main(String[] args) {
//		
//		String inputFilePath = "model/lehoczky.petrinet";
//		String outputFilePath = "model/lehoczky.xml";
//		romeoXmlSerialization(inputFilePath, outputFilePath);
//	
//	}
	
	@Override
	public void transform(TestImplementation test) {
		// TODO Auto-generated method stub
		IProject currentProject = WorkspaceUtils.getProject();
		IFolder folder = WorkspaceUtils.createFolder(currentProject, AnalysisRepositoryControler.getFolder(test.getTestedFile()));
//		String outputFolderPath = folder.getLocation().toOSString()+File.separator+AnalysisRepositoryControler.getFileName(test.getTestedFile());
//		String inputFolderPath = folder.getLocation().toOSString()+File.separator+AnalysisRepositoryControler.getFileName(test.getTestResult());

		
		String inputFilePath = "model/lehoczky.petrinet";
		String outputFilePath = "model/lehoczky.xml";
		romeoXmlSerialization(inputFilePath, outputFilePath);

	}

}
