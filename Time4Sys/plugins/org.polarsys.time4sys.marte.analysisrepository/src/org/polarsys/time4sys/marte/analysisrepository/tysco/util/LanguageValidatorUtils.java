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
package org.polarsys.time4sys.marte.analysisrepository.tysco.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType;

public class LanguageValidatorUtils {
	
	/**
	 * Parse a query expression to check if it is well formed
	 * @param object
	 * @param expression
	 * @return
	 */
	public static boolean oclParseQuery(EObject object, String expression) {
		// handle easy case
		if (object==null||expression==null||expression.trim().compareTo("")==0) return false;
		
		// expression != null
		boolean valid;
		@SuppressWarnings("unused")
		OCLExpression<EClassifier> query = null;
		
		try {
			OCL<?,EClassifier,?,?,?,?,?,?,?,Constraint,EClass,EObject> ocl;
			ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			
			// create an ONL helper object
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
			helper.setContext(object.eClass());
			query = helper.createQuery(expression);
			
			// record success
			valid = true;
		} catch (ParserException e) {
			System.out.println("Constraint not validated: "+expression);
			valid = false;
			System.out.println(e.getLocalizedMessage());
		}
		return valid;
	}
	
	
	/**
	 * Parse a query expression to check if it is well formed
	 * @param classifier
	 * @param expression
	 * @return
	 */
	public static boolean oclParseQuery(EClassifier classifier, String expression) {
		// handle easy case
		if (classifier==null||expression==null||expression.trim().compareTo("")==0) return false;
		
		// expression != null
		boolean valid;
		@SuppressWarnings("unused")
		OCLExpression<EClassifier> query = null;
		
		try {
			OCL<?,EClassifier,?,?,?,?,?,?,?,Constraint,EClass,EObject> ocl;
			ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			
			// create an ONL helper object
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
			helper.setContext(classifier);
			query = helper.createQuery(expression);
			
			// record success
			valid = true;
		} catch (ParserException e) {
			valid = false;
			System.out.println(e.getLocalizedMessage());
		}
		return valid;
	}
	
	
	/**
	 * Parse an invariant to check if it is well formed
	 * @param obj : object to be validated
	 * @param classifier : class of object
	 * @param expression
	 * @return
	 */
	public static boolean oclEvaluateInvariant(EObject obj,EClassifier classifier,String expression) {
		
		// easy case
		if (classifier==null||expression==null||expression.trim().compareTo("")==0) return false;
	
		// check invariant
		Constraint invariant = null;
		
		try {
			OCL<?,EClassifier,?,?,?,?,?,?,?,Constraint,EClass,EObject> ocl;
			ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			
			// create an ONL helper object
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
			helper.setContext(classifier);
			invariant = helper.createInvariant(expression);
			
			// Parsing success ---> invariant is well formed
			Query<EClassifier,EClass,EObject> eval = ocl.createQuery(invariant);
			return eval.check(obj);
		} catch (ParserException e) {
			System.out.println(e.getLocalizedMessage());
			return false;
		}
	}
	
	/**
	 * Parse an invariant to check if it is well formed
	 * @param object
	 * @param expression
	 * @return
	 */
	public static EvaluationResultType oclEvaluateInvariant(EObject object,String expression) {
		
		// easy case
		if (object==null||expression==null||expression.trim().compareTo("")==0) return EvaluationResultType.UNDEFINED;
		
		Constraint invariant = null;
		
		try {
			OCL<?,EClassifier,?,?,?,?,?,?,?,Constraint,EClass,EObject> ocl;
			ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			
			// create an ONL helper object
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
			helper.setContext(object.eClass());
			invariant = helper.createInvariant(expression);
			
			// record success
			Query<EClassifier,EClass,EObject> eval = ocl.createQuery(invariant);
			boolean result= eval.check(object);
			if (result) {
				return EvaluationResultType.TRUE;
			} else {
				return EvaluationResultType.FALSE;
			}
		} catch (ParserException e) {
			System.out.println(e.getLocalizedMessage());
			return EvaluationResultType.UNDEFINED;
		}
	}
	
	
//	public static boolean irlangParseQuery(String expression) {
//		
//		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
//		Injector injector = new IdentificationRuleLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
//		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
//		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.ir"));
//		InputStream in = new ByteArrayInputStream(expression.getBytes());
//		try {
//			resource.load(in, resourceSet.getLoadOptions());
//		} catch (IOException e) {
//			e.printStackTrace();
//			return false;
//		}
//		Expression model = (Expression) resource.getContents().get(0);
//		
//		return model!=null;
//	}

}
