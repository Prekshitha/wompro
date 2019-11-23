package com.service;

import java.util.List;

import com.model.Step;

public interface MyStepServiceIntf {

	public boolean insertStepForm( Step step);
	public List<Step> getUserstep();
}
