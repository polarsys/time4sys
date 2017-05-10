/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.views.analysis.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;

import org.polarsys.time4sys.ui.views.analysis.parts.forms.AnalyzedSystemPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.CommunicationPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.CommunicationResourcePropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.ComputingResourcePropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.ConstraintContainerPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.DelayPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.EventModelPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.FragmentPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.InputPortPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.InputStimulusPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.MemoryResourcePropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.MutualExclusionResourcePropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.OffsetPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.OutputPortPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.OutputStimulusPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.ProtectionParameterValuePropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.ProtectionProtocolPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.RequiredProtectionParameterPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.RequiredSchedulingParameterPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.ResourceProtectionParameterValuePropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.ResourceSchedulingParameterValuePropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.ResultContainerPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.SchedulerParameterValuePropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.SchedulerPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.TaskPropertiesEditionPartForm;
import org.polarsys.time4sys.ui.views.analysis.parts.forms.TwcaEventModelPropertiesEditionPartForm;

import org.polarsys.time4sys.ui.views.analysis.parts.impl.AnalyzedSystemPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.CommunicationPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.CommunicationResourcePropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.ComputingResourcePropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.ConstraintContainerPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.DelayPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.EventModelPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.FragmentPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.InputPortPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.InputStimulusPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.MemoryResourcePropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.MutualExclusionResourcePropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.OffsetPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.OutputPortPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.OutputStimulusPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.ProtectionParameterValuePropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.ProtectionProtocolPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.RequiredProtectionParameterPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.RequiredSchedulingParameterPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.ResourceProtectionParameterValuePropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.ResourceSchedulingParameterValuePropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.ResultContainerPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.SchedulerParameterValuePropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.SchedulerPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.TaskPropertiesEditionPartImpl;
import org.polarsys.time4sys.ui.views.analysis.parts.impl.TwcaEventModelPropertiesEditionPartImpl;

/**
 * 
 * @generated
 */
public class AnalysisPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * @generated
	 */
	public boolean provides(Object key) {
		return key == AnalysisViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * @generated
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == AnalysisViewsRepository.AnalyzedSystem.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new AnalyzedSystemPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new AnalyzedSystemPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.Communication.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new CommunicationPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new CommunicationPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.CommunicationResource.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new CommunicationResourcePropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new CommunicationResourcePropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.ComputingResource.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new ComputingResourcePropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new ComputingResourcePropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.ConstraintContainer.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new ConstraintContainerPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new ConstraintContainerPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.Delay.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new DelayPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new DelayPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.EventModel.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new EventModelPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new EventModelPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.Fragment.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new FragmentPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new FragmentPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.InputPort.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new InputPortPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new InputPortPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.InputStimulus.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new InputStimulusPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new InputStimulusPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.MemoryResource.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new MemoryResourcePropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new MemoryResourcePropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.MutualExclusionResource.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new MutualExclusionResourcePropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new MutualExclusionResourcePropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.Offset.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new OffsetPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new OffsetPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.OutputPort.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new OutputPortPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new OutputPortPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.OutputStimulus.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new OutputStimulusPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new OutputStimulusPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.ProtectionParameterValue.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new ProtectionParameterValuePropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new ProtectionParameterValuePropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.ProtectionProtocol.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new ProtectionProtocolPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new ProtectionProtocolPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.RequiredProtectionParameter.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new RequiredProtectionParameterPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new RequiredProtectionParameterPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.RequiredSchedulingParameter.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new RequiredSchedulingParameterPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new RequiredSchedulingParameterPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.ResourceSchedulingParameterValue.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new ResourceSchedulingParameterValuePropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new ResourceSchedulingParameterValuePropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.ResultContainer.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new ResultContainerPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new ResultContainerPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.SchedulerParameterValue.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new SchedulerParameterValuePropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new SchedulerParameterValuePropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.Scheduler.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new SchedulerPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new SchedulerPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.Task.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new TaskPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new TaskPropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.ResourceProtectionParameterValue.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new ResourceProtectionParameterValuePropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new ResourceProtectionParameterValuePropertiesEditionPartForm(component);
		}
		if (key == AnalysisViewsRepository.TwcaEventModel.class) {
			if (kind == AnalysisViewsRepository.SWT_KIND)
				return new TwcaEventModelPropertiesEditionPartImpl(component);
			if (kind == AnalysisViewsRepository.FORM_KIND)
				return new TwcaEventModelPropertiesEditionPartForm(component);
		}
		return null;
	}

}
