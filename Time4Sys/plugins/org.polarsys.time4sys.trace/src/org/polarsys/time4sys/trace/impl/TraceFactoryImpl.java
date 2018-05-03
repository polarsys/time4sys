/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.trace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.time4sys.marte.nfp.DataSize;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.trace.DataSizeValueChangeEvent;
import org.polarsys.time4sys.trace.DurationValueChangeEvent;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.MessageEvent;
import org.polarsys.time4sys.trace.MessageEventKind;
import org.polarsys.time4sys.trace.NumberValueChangeEvent;
import org.polarsys.time4sys.trace.ObjectValueChangeEvent;
import org.polarsys.time4sys.trace.Properties;
import org.polarsys.time4sys.trace.ResourceEvent;
import org.polarsys.time4sys.trace.ResourceEventKind;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.SchedulingEventKind;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.TraceFactory;
import org.polarsys.time4sys.trace.TracePackage;
import org.polarsys.time4sys.trace.ValueChangeEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceFactoryImpl extends EFactoryImpl implements TraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceFactory init() {
		try {
			TraceFactory theTraceFactory = (TraceFactory)EPackage.Registry.INSTANCE.getEFactory(TracePackage.eNS_URI);
			if (theTraceFactory != null) {
				return theTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TracePackage.TRACE: return createTrace();
			case TracePackage.EVENT: return createEvent();
			case TracePackage.RESOURCE_EVENT: return createResourceEvent();
			case TracePackage.SCHEDULING_EVENT: return createSchedulingEvent();
			case TracePackage.MESSAGE_EVENT: return createMessageEvent();
			case TracePackage.SLICE: return createSlice();
			case TracePackage.PROPERTIES: return createProperties();
			case TracePackage.VALUE_CHANGE_EVENT: return createValueChangeEvent();
			case TracePackage.OBJECT_VALUE_CHANGE_EVENT: return createObjectValueChangeEvent();
			case TracePackage.DURATION_VALUE_CHANGE_EVENT: return createDurationValueChangeEvent();
			case TracePackage.DATA_SIZE_VALUE_CHANGE_EVENT: return createDataSizeValueChangeEvent();
			case TracePackage.NUMBER_VALUE_CHANGE_EVENT: return createNumberValueChangeEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TracePackage.SCHEDULING_EVENT_KIND:
				return createSchedulingEventKindFromString(eDataType, initialValue);
			case TracePackage.RESOURCE_EVENT_KIND:
				return createResourceEventKindFromString(eDataType, initialValue);
			case TracePackage.MESSAGE_EVENT_KIND:
				return createMessageEventKindFromString(eDataType, initialValue);
			case TracePackage.SLICE_KIND:
				return createSliceKindFromString(eDataType, initialValue);
			case TracePackage.NFP_DURATION:
				return createNFP_DurationFromString(eDataType, initialValue);
			case TracePackage.NFP_TIME_INTERVAL:
				return createNFP_TimeIntervalFromString(eDataType, initialValue);
			case TracePackage.ENUMBER:
				return createENumberFromString(eDataType, initialValue);
			case TracePackage.NFP_DATA_SIZE:
				return createNFP_DataSizeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TracePackage.SCHEDULING_EVENT_KIND:
				return convertSchedulingEventKindToString(eDataType, instanceValue);
			case TracePackage.RESOURCE_EVENT_KIND:
				return convertResourceEventKindToString(eDataType, instanceValue);
			case TracePackage.MESSAGE_EVENT_KIND:
				return convertMessageEventKindToString(eDataType, instanceValue);
			case TracePackage.SLICE_KIND:
				return convertSliceKindToString(eDataType, instanceValue);
			case TracePackage.NFP_DURATION:
				return convertNFP_DurationToString(eDataType, instanceValue);
			case TracePackage.NFP_TIME_INTERVAL:
				return convertNFP_TimeIntervalToString(eDataType, instanceValue);
			case TracePackage.ENUMBER:
				return convertENumberToString(eDataType, instanceValue);
			case TracePackage.NFP_DATA_SIZE:
				return convertNFP_DataSizeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEvent createResourceEvent() {
		ResourceEventImpl resourceEvent = new ResourceEventImpl();
		return resourceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingEvent createSchedulingEvent() {
		SchedulingEventImpl schedulingEvent = new SchedulingEventImpl();
		return schedulingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEvent createMessageEvent() {
		MessageEventImpl messageEvent = new MessageEventImpl();
		return messageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slice createSlice() {
		SliceImpl slice = new SliceImpl();
		return slice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueChangeEvent createValueChangeEvent() {
		ValueChangeEventImpl valueChangeEvent = new ValueChangeEventImpl();
		return valueChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectValueChangeEvent createObjectValueChangeEvent() {
		ObjectValueChangeEventImpl objectValueChangeEvent = new ObjectValueChangeEventImpl();
		return objectValueChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationValueChangeEvent createDurationValueChangeEvent() {
		DurationValueChangeEventImpl durationValueChangeEvent = new DurationValueChangeEventImpl();
		return durationValueChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeValueChangeEvent createDataSizeValueChangeEvent() {
		DataSizeValueChangeEventImpl dataSizeValueChangeEvent = new DataSizeValueChangeEventImpl();
		return dataSizeValueChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValueChangeEvent createNumberValueChangeEvent() {
		NumberValueChangeEventImpl numberValueChangeEvent = new NumberValueChangeEventImpl();
		return numberValueChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingEventKind createSchedulingEventKindFromString(EDataType eDataType, String initialValue) {
		SchedulingEventKind result = SchedulingEventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEventKind createResourceEventKindFromString(EDataType eDataType, String initialValue) {
		ResourceEventKind result = ResourceEventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEventKind createMessageEventKindFromString(EDataType eDataType, String initialValue) {
		MessageEventKind result = MessageEventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliceKind createSliceKindFromString(EDataType eDataType, String initialValue) {
		SliceKind result = SliceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSliceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Duration createNFP_DurationFromString(EDataType eDataType, String initialValue) {
		return NfpFactory.eINSTANCE.createDurationFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertNFP_DurationToString(EDataType eDataType, Object instanceValue) {
		assert(instanceValue == null || instanceValue instanceof Duration);
		return NfpFactory.eINSTANCE.convertDurationToString((Duration)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimeInterval createNFP_TimeIntervalFromString(EDataType eDataType, String initialValue) {
		return NfpFactory.eINSTANCE.createTimeIntervalFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertNFP_TimeIntervalToString(EDataType eDataType, Object instanceValue) {
		assert(instanceValue == null || instanceValue instanceof TimeInterval);
		return NfpFactory.eINSTANCE.convertTimeIntervalToString((TimeInterval)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Number createENumberFromString(EDataType eDataType, String initialValue) {
		return (Number)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize createNFP_DataSizeFromString(EDataType eDataType, String initialValue) {
		return (DataSize)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNFP_DataSizeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracePackage getTracePackage() {
		return (TracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TracePackage getPackage() {
		return TracePackage.eINSTANCE;
	}

} //TraceFactoryImpl
