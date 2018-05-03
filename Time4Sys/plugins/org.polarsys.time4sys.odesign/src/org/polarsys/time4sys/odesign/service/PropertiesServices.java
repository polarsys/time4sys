/*******************************************************************************
 * Copyright (c) 2017, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.sam.SamPackage;
import org.polarsys.time4sys.marte.srm.SrmPackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

/**
 * The services class used by the Properties View support.
 */
public class PropertiesServices {

	public List<EStructuralFeature> removeFeaturesToHide(EObject ctx, Collection<EStructuralFeature> unfiltered) {
		List<EStructuralFeature> toBeFiltered = Lists.newArrayList(unfiltered);
		
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE_CONNECTOR__SOURCE_PORT);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE__OWNED_PORT);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE__PSERVICES);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE_INSTANCE__PORT);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE_INSTANCE__TYPE);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE_INTERFACE__OWNED_SERVICE);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE__PSERVICES);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE_PORT__PINTERFACE);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE_PORT__RINTERFACE);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE__RSERVICES);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE_USAGE__USED_RESOURCE);
		toBeFiltered.remove(GrmPackage.Literals.RESOURCE_SERVICE__CONTEXT);
	
		toBeFiltered.remove(GqamPackage.Literals.BEHAVIOR_SCENARIO__PARENT_STEP);
		toBeFiltered.remove(GqamPackage.Literals.PIN__PATTERN);
		toBeFiltered.remove(GqamPackage.Literals.STEP__PROBABILITY);
	
		toBeFiltered.remove(SrmPackage.Literals.DEVICE_BROKER__CLOSE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.DEVICE_BROKER__OPEN_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.DEVICE_BROKER__CONTROL_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.DEVICE_BROKER__DEVICES);
		toBeFiltered.remove(SrmPackage.Literals.DEVICE_BROKER__READ_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.DEVICE_BROKER__WRITE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.INTERRUPT_RESOURCE__VECTOR_ELEMENTS);
		toBeFiltered.remove(SrmPackage.Literals.MEMORY_BROKER__MAP_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.MEMORY_BROKER__LOCK_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.MEMORY_BROKER__UNLOCK_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.MEMORY_BROKER__UNMAP_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.MEMORY_PARTITION__EXIT_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.MEMORY_PARTITION__FORK_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.MEMORY_PARTITION__MEMORY_SPACES);
		toBeFiltered.remove(SrmPackage.Literals.MESSAGE_COM_RESOURCE__RECEIVE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.MESSAGE_COM_RESOURCE__SEND_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.NOTIFICATION_RESOURCE__CLEAR_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.NOTIFICATION_RESOURCE__FLUSH_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.NOTIFICATION_RESOURCE__SIGNAL_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.NOTIFICATION_RESOURCE__MASK_ELEMENTS);
		toBeFiltered.remove(SrmPackage.Literals.NOTIFICATION_RESOURCE__WAIT_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_RESOURCE__CREATE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_RESOURCE__DELETE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SHARED_DATA_COM_RESOURCE__READ_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_RESOURCE__CREATE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_RESOURCE__DELETE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_RESOURCE__INITIALIZE_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_RESOURCE__STATE_ELEMENTS);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS);
		toBeFiltered.remove(SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES);
	
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_WIRE__SOURCE_PIN);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_WIRE__TARGET_PIN);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_PROCESSING_MEMORY__REPL_POLICY);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_PROCESSING_MEMORY__WRITE_POLICY);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPONENT__RCONDITIONS);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_PLD__PLD_TECHNOLOGY);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPONENT__PRICE);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPONENT__POS_X);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPONENT__POS_Y);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPONENT__WEIGHT);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPONENT__RCONDITIONS);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPONENT__AREA);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPONENT__DIMENSION);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPONENT__GRID);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_COMPUTING_RESOURCE__OP_FREQUENCIES);
		toBeFiltered.remove(HrmPackage.Literals.HARDWARE_CHIP__TECHNOLOGY);
		toBeFiltered.remove(GrmPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR);		
		
		toBeFiltered.remove(NfpPackage.Literals.COMPOSITE_DISTRIBUTION__PARTS);
		toBeFiltered.remove(NfpPackage.Literals.DISCRETE_DISTRIBUTION__BUCKETS);
		toBeFiltered.remove(NfpPackage.Literals.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__MU);
		toBeFiltered.remove(NfpPackage.Literals.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__SIGMA);
		toBeFiltered.remove(NfpPackage.Literals.GENERALIZED_EXTREME_VALUE_DISTRIBUTION__XI);

		/*
		 * reorder features
		 */
		PriorityComparator<EStructuralFeature> comparator = new PriorityComparator<EStructuralFeature>(ImmutableList.of(
				EcorePackage.Literals.ENAMED_ELEMENT__NAME, EcorePackage.Literals.ETYPED_ELEMENT__ETYPE,
				EcorePackage.Literals.ETYPED_ELEMENT__LOWER_BOUND, EcorePackage.Literals.ETYPED_ELEMENT__UPPER_BOUND,
				EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS_NAME,
				EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME,
				EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL,
				EcorePackage.Literals.EREFERENCE__EOPPOSITE, EcorePackage.Literals.EREFERENCE__CONTAINMENT,
				EcorePackage.Literals.ESTRUCTURAL_FEATURE__TRANSIENT,
				EcorePackage.Literals.ESTRUCTURAL_FEATURE__DERIVED));
		return Ordering.from(comparator).sortedCopy(toBeFiltered);
	}

	class PriorityComparator<T> implements Comparator<T> {
		private final List<T> values;

		public PriorityComparator(List<T> values) {
			this.values = values;
		}

		@Override
		public int compare(T o1, T o2) {
			int idx1 = values.indexOf(o1);
			int idx2 = values.indexOf(o2);
			if (idx1 > -1) {
				return idx2 > -1 ? idx1 - idx2 : -1;
			}
			return idx2 > -1 ? 1 : 0;
		}
	}

//	public List<EObject> removeSemanticElementsToHide(EObject ctx, Collection<EObject> unfiltered,
//			DSemanticDecorator selection) {
//		List<EObject> filtered = Lists.newArrayList();
//		for (EObject eObject : unfiltered) {
//			if (!(eObject instanceof EParameter)) {
//				filtered.add(eObject);
//			}
//		}
//		if (selection instanceof DEdge && ctx instanceof EClass
//				&& ((DEdge) selection).getActualMapping() instanceof EdgeMapping
//				&& "EC ESupertypes".equals(((EdgeMapping) ((DEdge) selection).getActualMapping()).getName())) {
//			filtered.addAll(((EClass) ctx).getEGenericSuperTypes());
//			for (EGenericType genType : ((EClass) ctx).getEGenericSuperTypes()) {
//				filtered.addAll(genType.getETypeArguments());
//			}
//		}
//
//		return filtered;
//	}
//
//	public EStringToStringMapEntryImpl getVisibleDocAnnotations(EObject self) {
//		if (self instanceof EModelElement) {
//			EAnnotation eAnnot = ((EModelElement) self).getEAnnotation(GEN_MODEL_PACKAGE_NS_URI);
//			if (eAnnot != null) {
//				for (EStringToStringMapEntryImpl mapEntry : Iterables.filter(eAnnot.getDetails(),
//						EStringToStringMapEntryImpl.class)) {
//					if ("documentation".equals(mapEntry.getKey())) {
//						return mapEntry;
//					}
//				}
//			}
//
//		} else if (self instanceof EAnnotation) {
//			for (EStringToStringMapEntryImpl mapEntry : Iterables.filter(((EAnnotation) self).getDetails(),
//					EStringToStringMapEntryImpl.class)) {
//				if ("documentation".equals(mapEntry.getKey())) {
//					return mapEntry;
//				}
//			}
//		} else if (self instanceof EStringToStringMapEntryImpl) {
//			if ("documentation".equals(((EStringToStringMapEntryImpl) self).getKey())) {
//				return (EStringToStringMapEntryImpl) self;
//			}
//		}
//		return null;
//	}
//
//	public EObject setDocAnnotation(EObject self, String value) {
//		if (self instanceof EModelElement) {
//			EAnnotation eAnnot = ((EModelElement) self).getEAnnotation(GEN_MODEL_PACKAGE_NS_URI);
//			if (eAnnot != null) {
//				for (EStringToStringMapEntryImpl mapEntry : Iterables.filter(eAnnot.getDetails(),
//						EStringToStringMapEntryImpl.class)) {
//					if ("documentation".equals(mapEntry.getKey())) {
//						mapEntry.setValue(value);
//					}
//				}
//			} else {
//				EAnnotation newAnnot = EcoreFactory.eINSTANCE.createEAnnotation();
//				newAnnot.setSource(GEN_MODEL_PACKAGE_NS_URI);
//				newAnnot.getDetails().put("documentation", value);
//				((EModelElement) self).getEAnnotations().add(newAnnot);
//			}
//
//		} else if (self instanceof EAnnotation) {
//			for (EStringToStringMapEntryImpl mapEntry : Iterables.filter(((EAnnotation) self).getDetails(),
//					EStringToStringMapEntryImpl.class)) {
//				if ("documentation".equals(mapEntry.getKey())) {
//					mapEntry.setValue(value);
//				}
//			}
//
//		} else if (self instanceof EStringToStringMapEntryImpl) {
//			if ("documentation".equals(((EStringToStringMapEntryImpl) self).getKey())) {
//				((EStringToStringMapEntryImpl) self).setValue(value);
//			}
//		}
//		return self;
//	}
//
//	public boolean isJavaFileGenerated(EObject cur) {
//		URI javaImplementationURI = getJavaImplementationURI(cur);
//		if (javaImplementationURI != null && cur.eResource() != null && cur.eResource().getResourceSet() != null
//				&& cur.eResource().getResourceSet().getURIConverter() != null) {
//			return cur.eResource().getResourceSet().getURIConverter().exists(javaImplementationURI,
//					Collections.EMPTY_MAP);
//		}
//		return false;
//	}
//
//	public String getJavaImplementationPath(EObject cur) {
//		URI targetFile = getJavaImplementationURI(cur);
//		if (targetFile != null) {
//			return targetFile.toString();
//		}
//		return null;
//	}
//
//	private URI getJavaImplementationURI(EObject cur) {
//		GenClassifier gClass = null;
//		if (cur instanceof GenFeature) {
//			gClass = ((GenFeature) cur).getGenClass();
//		}
//		if (cur instanceof GenEnumLiteral) {
//			gClass = ((GenEnumLiteral) cur).getGenEnum();
//		}
//		if (cur instanceof GenClassifier) {
//			gClass = (GenClassifier) cur;
//		}
//		if (cur instanceof GenEnum) {
//			gClass = (GenClassifier) cur;
//		}
//		String className = "";
//		if (gClass instanceof GenClass) {
//			className = ((GenClass) gClass).getClassName();
//		} else if (gClass instanceof GenEnum) {
//			className = ((GenEnum) gClass).getClassifierInstanceName();
//		}
//
//		if (gClass != null && gClass.getGenPackage() != null) {
//			String packageName = gClass.getGenPackage().getClassPackageName();
//			URI targetDirectory = URI.createURI(gClass.getGenPackage().getGenModel().getModelDirectory())
//					.appendSegments(packageName.split("\\."));
//			URI targetFile = targetDirectory.appendSegment(className + ".java");
//			return targetFile;
//		}
//		return null;
//	}
//
//	public String upperBoundDisplay(ETypedElement host) {
//		if (host.getUpperBound() == -1) {
//			return "*";
//		}
//		return Integer.valueOf(host.getUpperBound()).toString();
//	}
//
//	public ETypedElement setUpperBound(ETypedElement host, String newValue) {
//		if ("*".equals(newValue)) {
//			host.setUpperBound(-1);
//		} else {
//			host.setUpperBound(Integer.valueOf(newValue));
//		}
//		return host;
//	}
//
//	public EObject eGetMonoRef(EObject cur, EStructuralFeature ref) {
//		return (EObject) cur.eGet(ref);
//	}
//
//	public EObject moveUpInContainer(EObject cur) {
//		EObject container = cur.eContainer();
//		if (container != null) {
//			EList<EObject> siblings = (EList<EObject>) container.eGet(cur.eContainingFeature());
//			int oldPosition = siblings.indexOf(cur);
//			int newPosition = oldPosition - 1;
//			if (newPosition < 0) {
//				newPosition = 0;
//			}
//			siblings.move(newPosition, cur);
//		}
//		return cur;
//	}
//
//	public EObject moveDownInContainer(EObject cur) {
//		EObject container = cur.eContainer();
//		if (container != null) {
//			EList<EObject> siblings = (EList<EObject>) container.eGet(cur.eContainingFeature());
//			int oldPosition = siblings.indexOf(cur);
//			int newPosition = oldPosition + 1;
//			if (newPosition > siblings.size() - 1) {
//				newPosition = siblings.size() - 1;
//			}
//			siblings.move(newPosition, cur);
//		}
//		return cur;
//	}

}
