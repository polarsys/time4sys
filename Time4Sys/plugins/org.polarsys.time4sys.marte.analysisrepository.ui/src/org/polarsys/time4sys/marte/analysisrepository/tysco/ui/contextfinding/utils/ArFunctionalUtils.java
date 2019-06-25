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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue;
import org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule;
import org.polarsys.time4sys.marte.analysisrepository.tysco.JunctionType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.util.LanguageValidatorUtils;
//
//import fr.ensma.analysisrepository.xtext.IdentificationRuleLanguageStandaloneSetup;

public class ArFunctionalUtils {
	
	private static String title = "Tysco Message";
	public static String defaultOutputFileName = "analysisOutput.xml";
	
	
	public static String runAnalysis(String analysisExecpath, 
											String toolName,
											String inputModelPath,
											String outputModelPath) {
		
		// test
		//System.out.println("Analysis exec path: "+analysisExecpath);
		//System.out.println("Tool name: "+toolName);
		//System.out.println("Input model path: "+inputModelPath);
		//System.out.println("Output model path: "+outputModelPath);

		
		ProcessBuilder processBuilder = new ProcessBuilder(analysisExecpath,toolName,inputModelPath,outputModelPath);
		String outputMessage = "";
		
		try {
			Process process = processBuilder.start();
			
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));

			// read the output from the command
			String o = null;
			while ((o = stdInput.readLine()) != null) {
				outputMessage +=o;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return outputMessage;
		
	}
	
	
	/**
	 * Verify if an expression is conform to identification rule language's syntax
	 * @param expression
	 * @return
	 */
//	public static boolean isIrLangConstraint(String expression) {
//		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
//		Injector injector = new IdentificationRuleLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
//		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
//		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//	
//		Resource resource = resourceSet.createResource(URI.createURI("dummy:/model/example.ir"));
//		InputStream in = new ByteArrayInputStream(expression.getBytes());
//		try {
//			resource.load(in, resourceSet.getLoadOptions());
//		} catch (IOException e) {
//			e.printStackTrace();
//			return false;
//		}
//		IdentificationRule rule = (IdentificationRule) resource.getContents().get(0);
//		if (rule!=null) return true;
//		else return false;
//	}
	
	/**
	 * Parse identification rule constraint
	 * @param expression
	 * @return IdentificationRule
	 */
//	public static IdentificationRule parseIrLangConstraint(String expression) {
//		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
//		Injector injector = new IdentificationRuleLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
//		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
//		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//		Resource resource = resourceSet.createResource(URI.createURI("dummy:/model/example.ir"));
//		InputStream in = new ByteArrayInputStream(expression.getBytes());
//		try {
//			resource.load(in, resourceSet.getLoadOptions());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		IdentificationRule rule = (IdentificationRule) resource.getContents().get(0);
//		return rule;
//	}
	
	
	/**
	 * Check if a rule is written in OCL
	 * @param constraint
	 * @return
	 */
	public static boolean isOCLConstraint(String constraint,EObject root) {
		if (constraint==null||constraint.trim().compareTo("")==0) {
			return false;
		}
		
		return LanguageValidatorUtils.oclParseQuery(root,constraint);
	}
	
	
	/**
	 * Check for appropriate contexts
	 * @return list of appropriate contexts
	 */
	public static List<ContextModel> findAppropriateContexts(AnalysisRepository repository,List<Result> rs) {
		List<ContextModel> allContexts = repository.getAllContextModels();
		List<ContextModel> contextsFound = new ArrayList<ContextModel>();
		
		for (ContextModel ct : allContexts) {			
			if (ct.getRuleGroups().size()>0) {
				RuleGroup truthGroup = ct.getRootGroup();
				if (truthGroup!=null) {
					if (groupCheck(truthGroup,rs)) contextsFound.add(ct);
				}
			}
		}
		
		return contextsFound;
	}
	
	
	/**
	 * Check for appropriate contexts
	 * @return list of appropriate contexts
	 */
	public static List<ContextModel> findAppropriateContexts(AnalysisRepository repository,List<Result> rs,List<List<Integer>> violatedGroupIdLists) {
		List<ContextModel> allContexts = repository.getAllContextModels();
		List<ContextModel> contextsFound = new ArrayList<ContextModel>();
		
		for (ContextModel ct : allContexts) {
			List<Integer> violatedGroupIdList = new ArrayList<Integer>();
			if (ct.getRuleGroups().size()>0) {
				RuleGroup ruleGroup = ct.getRootGroup();
				if (ruleGroup!=null) {
					if (groupCheck(ruleGroup,rs,violatedGroupIdList)) {
						contextsFound.add(ct);
					} else {
						// Representation 
						// group is invalid -->  (Group: red)
						violatedGroupIdList.add(ruleGroup.getId());
					}
				}
			}
			violatedGroupIdLists.add(violatedGroupIdList);
		}
		
		return contextsFound;
	}
	
	
	/**
	 * Check if group satisfy expected value
	 * @param group
	 * @return 
	 * 		true if evaluated value on group satisfies expected value
	 * 		false other	
	 */
	private static boolean groupCheck(RuleGroup group,List<Result> rs) {
		
		//if (group==null) return false;
		
		// Conjunction, expected value, sub groups
		JunctionType junction = group.getJunctionType();
		List<ExpectedEvaluationValue> expectedValues = group.getExpectedRuleValues();
		List<RuleGroup> subGroups = group.getSubGroups();
		
		if (junction==JunctionType.AND) {
			
			// All direct identification rules must respect their expected value
			for (ExpectedEvaluationValue expVal : expectedValues) {
				IdentificationRule associatedRule = expVal.getAssociatedRule();
				Result evaluatedResult = getIdentificationRuleEvaluatedResultById(rs, associatedRule.getId());
				if (!isMatched(expVal,evaluatedResult)) {
					System.out.println("Not matched: expected value: "+expVal+", evaluated result: "+evaluatedResult.getEvaluatedResult());
					return false;
				}
			}
			
			// All sub-groups must be valid
			for (RuleGroup gr : subGroups) {
				if (!groupCheck(gr, rs)) {
					System.out.println("Group which is not valid: "+gr.getJunctionType()+", description: "+gr.getDescription());
					return false;
				}
			}
			
			return true;
			
		} else if (junction==JunctionType.OR) {
			
			// Exist at least a rule respects its expected value or a valid group
			int count = 0;
			for (ExpectedEvaluationValue expVal : expectedValues) {
				IdentificationRule associatedRule = expVal.getAssociatedRule();
				Result evaluatedResult = getIdentificationRuleEvaluatedResultById(rs, associatedRule.getId());
				if (isMatched(expVal,evaluatedResult)) count++;
			}
			
			for (RuleGroup gr : subGroups) {
				if (groupCheck(gr, rs)) count++;
			}
			
			if (count>0) return true;
			else {
				System.out.println("Group which is not valid: "+group.getJunctionType()+", description: "+group.getDescription());
				return false;
			}
			
		} else if (junction==JunctionType.XOR) {
			
			// Exist only one rule that respects its expected value or a valid group
			int count = 0;
			for (ExpectedEvaluationValue expVal : expectedValues) {
				IdentificationRule associatedRule = expVal.getAssociatedRule();
				Result evaluatedResult = getIdentificationRuleEvaluatedResultById(rs, associatedRule.getId());
				if (isMatched(expVal,evaluatedResult)) count++;
			}
			
			for (RuleGroup gr : subGroups) {
				if (groupCheck(gr, rs)) count++;
			}
			
			if (count==1) return true;
			else {
				System.out.println("Group which is not valid: "+group.getJunctionType()+", description: "+group.getDescription());
				return false;
			}
		} 
		return false;
	}

	/**
	 * Check if group satisfy expected value
	 * @param group
	 * @return 
	 * 		true if evaluated value on group satisfies expected value
	 * 		false other	
	 */
	private static boolean groupCheck(RuleGroup group,List<Result> rs,List<Integer> violatedGroupIdList) {
		
		boolean valid = true;
		
		// Conjunction, expected value, sub groups
		JunctionType junction = group.getJunctionType();
		List<ExpectedEvaluationValue> expectedValues = group.getExpectedRuleValues();
		List<RuleGroup> subGroups = group.getSubGroups();
		
		if (junction==JunctionType.AND) {
			
			// All direct identification rules must respect their expected value
			for (ExpectedEvaluationValue expVal : expectedValues) {
				IdentificationRule associatedRule = expVal.getAssociatedRule();
				Result evaluatedResult = getIdentificationRuleEvaluatedResultById(rs, associatedRule.getId());
				if (!isMatched(expVal,evaluatedResult)) {
					System.out.println("Not matched: expected value: "+expVal+", evaluated result: "+evaluatedResult.getEvaluatedResult());
					//return false;
					valid&=false;
				}
			}
			
			// All sub-groups must be valid
			for (RuleGroup gr : subGroups) {
				if (!groupCheck(gr,rs,violatedGroupIdList)) {
					System.out.println("Group which is not valid: "+gr.getJunctionType()+", description: "+gr.getDescription());
					//return false;
					valid&=false;
				}
			}
			
			//return true;
			
		} else if (junction==JunctionType.OR) {
			
			// Exist at least a rule respects its expected value or a valid group
			int count = 0;
			for (ExpectedEvaluationValue expVal : expectedValues) {
				IdentificationRule associatedRule = expVal.getAssociatedRule();
				Result evaluatedResult = getIdentificationRuleEvaluatedResultById(rs, associatedRule.getId());
				if (isMatched(expVal,evaluatedResult)) count++;
			}
			
			for (RuleGroup gr : subGroups) {
				if (groupCheck(gr,rs,violatedGroupIdList)) count++;
			}
			
			if (count>0){
				valid&=true;
				//return true;
			} else {
				System.out.println("Group which is not valid: "+group.getJunctionType()+", description: "+group.getDescription());
				valid&=false;
				//return false;
			}
			
		} else if (junction==JunctionType.XOR) {
			
			// Exist only one rule that respects its expected value or a valid group
			int count = 0;
			for (ExpectedEvaluationValue expVal : expectedValues) {
				IdentificationRule associatedRule = expVal.getAssociatedRule();
				Result evaluatedResult = getIdentificationRuleEvaluatedResultById(rs, associatedRule.getId());
				if (isMatched(expVal,evaluatedResult)) count++;
			}
			
			for (RuleGroup gr : subGroups) {
				if (groupCheck(gr,rs,violatedGroupIdList)) count++;
			}
			
			if (count==1) {
				valid&=true;
				//return true;
			}
			else {
				System.out.println("Group which is not valid: "+group.getJunctionType()+", description: "+group.getDescription());
				//return false;
				valid&=false;
			}
		} 
		//return false;
		if (!valid) violatedGroupIdList.add(group.getId());
		return valid;
	}
	
	
	/**
	 * Get rule by id from a set of rules
	 * @param rulesSet
	 * @param id
	 * @return
	 */
	//private static IdentificationRule getRuleById(List<IdentificationRule> rulesSet,int id) {
	//	for (IdentificationRule r : rulesSet) {
	//		if (r.getId()==id) return r;
	//	}
	//	return null;
	//}
	
	/**
	 * Get result corresponding to rule id
	 * @param rs: list of evaluated results
	 * @param id
	 * @return
	 */
	public static Result getIdentificationRuleEvaluatedResultById(List<Result> rs,int id) {
		for (Result result : rs) {
			if (result.getRefId()==id) return result;
		}
		return null;
	}
	
	/**
	 * Check if expected result and evaluated result of an identification rule is matched
	 * @param expectedVal
	 * @param resultVal
	 * @return
	 */
	private static boolean isMatched(ExpectedEvaluationValue expectedVal, Result resultVal) {
		if (expectedVal.getValue()==TruthType.TRUE && resultVal.getEvaluatedResult()==EvaluationResultType.TRUE) return true;
		else if (expectedVal.getValue()==TruthType.FALSE && resultVal.getEvaluatedResult()==EvaluationResultType.FALSE) return true;
		else if (expectedVal.getValue()==TruthType.NEUTRAL 
								&& (resultVal.getEvaluatedResult()==EvaluationResultType.TRUE||
										resultVal.getEvaluatedResult()==EvaluationResultType.FALSE)) return true;
		return false;
	}
	
	
	public static void errorMessage(String mess) {
		if (mess!=null) JOptionPane.showMessageDialog(null,mess,title,JOptionPane.ERROR_MESSAGE);
	}
	
	public static void informationMessage(String mess) {
		if (mess!=null) JOptionPane.showMessageDialog(null,mess, title,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void plainMessage(String mess) {
		if (mess!=null) JOptionPane.showMessageDialog(null,mess, title,JOptionPane.PLAIN_MESSAGE);
	}
	
	public static boolean confirmMessage(String mess) {
		if (mess==null) return false;
		int opt = JOptionPane.showConfirmDialog(null,mess);
		if (opt==JOptionPane.YES_OPTION) return true;
		return false;
	}
}
