package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MyStepDaoIntf;
import com.model.Step;
@Service("myStepService")
public class MyStepServiceImpl implements MyStepServiceIntf{
	@Autowired(required=true)
	MyStepDaoIntf myStepDao;

	@Transactional
	public boolean insertStepForm(Step step) {
		System.out.println("service called");
		boolean flag=myStepDao.insertStepForm(step);
		return flag;
	}
	@Transactional
	public List<Step> getUserstep() {
		List<Step> list=myStepDao.getUserstep();
		return list;
	}
}
