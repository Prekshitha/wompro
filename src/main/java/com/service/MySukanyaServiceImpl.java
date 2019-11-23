package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MySukanyaDaoIntf;
import com.model.Sukanya;

@Service("myUserService")
public class MySukanyaServiceImpl implements MySukanyaServiceIntf {

	@Autowired(required=true)
	MySukanyaDaoIntf myUserDao;

	@Transactional
	public boolean insertForm(Sukanya sukanya) {
		System.out.println("service called");
		boolean flag=myUserDao.insertForm(sukanya);
		return flag;
	}

	@Transactional
	public List<Sukanya> getUser() {

		List<Sukanya> list=myUserDao.getUser();
		return list;
	}

}
