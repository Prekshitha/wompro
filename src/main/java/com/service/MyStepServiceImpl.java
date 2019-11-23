package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MyStepDaoIntf;
import com.model.Step;
@Service("myUserService")
public class MyStepServiceImpl implements MyStepServiceIntf{
	@Autowired(required=true)
	MyStepDaoIntf myUserDao;

	@Transactional
	public boolean insertStepForm(Step step) {
		System.out.println("service called");
		boolean flag=myUserDao.insertStepForm(step);
		return flag;
	}
	@Transactional
	public List<Step> getUserstep() {
		List<Step> list=myUserDao.getUserstep();
		return list;
	}
}
