package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MyWomenDaoIntf;
import com.model.Workingwomen;

@Service("myWomenService")
public class MyWomenServicempl implements MyWomenServiceIntf {

	@Autowired(required=true)
	MyWomenDaoIntf myWomenDao;

	@Transactional
	public boolean insertWorkingwomen(Workingwomen ww) {
		System.out.println("service is called");
		boolean flag=myWomenDao.insertWorkingwomen(ww);
		return flag;
	}

	@Transactional
	public List<Workingwomen> getUsers() {
		List<Workingwomen> list=myWomenDao.getUsers();
		return list;
	}

	@Transactional
	public int approvedList(int wid) {
		int result = myWomenDao.approvedList(wid);
		return result;
	}

	@Transactional
	public List<Workingwomen> approvedrecords() {
		List<Workingwomen> list=myWomenDao.approvedrecords();
		return list;
	}
	
}
