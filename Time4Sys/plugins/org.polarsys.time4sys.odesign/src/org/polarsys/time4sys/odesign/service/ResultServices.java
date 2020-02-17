/*******************************************************************************
 * Copyright (c) 2016, 2018 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *     Loïc Fejoz      - Arinc653 related implemenetation , Liu & Layland related
 *******************************************************************************/
package org.polarsys.time4sys.odesign.service;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.MappableArtefact;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;
import org.polarsys.time4sys.results.results.AbstractTaskResult;
import org.polarsys.time4sys.results.results.AnalysisResultSet;
import org.polarsys.time4sys.results.results.AtomicResult;
import org.polarsys.time4sys.results.results.TaskChainResult;
import org.polarsys.time4sys.results.results.TaskResult;

public class ResultServices {

	private static ResultServices instance;

	public static ResultServices getService() {
		if (instance == null) {
			instance = new ResultServices();
		}
		return instance;
	}

	static AnalysisResultSet ars;

	public static Object getSourceMapping(TaskResult target, AnalysisResultSet rsc) {
		ars = rsc;
		for (Link link : rsc.getMapping().getLinksForSlice(target)) {
			for (MappableArtefact obj : link.getSources()) {
				return obj.getValue();
			}
		}
		return target;
	}

	public static Object getSourceMappingName(EObject target) {
		for (Link link : ars.getMapping().getLinksForSlice(target)) {
			for (MappableArtefact obj : link.getSources()) {
				if (obj.getValue() instanceof NamedElement) {
					return ((NamedElement) obj.getValue()).getName();
				}
			}
		}
		return ((ENamedElement) target).getName();
	}

	public static String getLoad(EObject res) {
		if (res instanceof AtomicResult && ((AtomicResult) res).getLoad() != 0) {
			return String.valueOf(((AtomicResult) res).getLoad()) + " %";
		}
		if (res instanceof AbstractTaskResult && ((AbstractTaskResult) res).getLoad() != 0) {
			return String.valueOf(((AbstractTaskResult) res).getLoad()) + " %";
		}
		if (res instanceof TaskChainResult && ((TaskChainResult) res).getLoad() != 0) {
			return String.valueOf(((TaskChainResult) res).getLoad()) + " %";
		}
		return "";
	}

}
