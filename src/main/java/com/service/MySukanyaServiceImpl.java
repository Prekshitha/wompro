package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MySukanyaDaoIntf;
import com.model.Sukanya;

@Service("mySukService")
public class MySukanyaServiceImpl implements MySukanyaServiceIntf {

	@Autowired(required=true)
	MySukanyaDaoIntf mySukDao;

	@Transactional
	public boolean insertForm(Sukanya sukanya) {
		System.out.println("service called");
		boolean flag=mySukDao.insertForm(sukanya);
		return flag;
	}

	@Transactional
	public List<Sukanya> getUser() {

		List<Sukanya> list=mySukDao.getUser();
		return list;
	}

}
