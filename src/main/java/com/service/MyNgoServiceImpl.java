package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MyNgoDaoIntf;
import com.model.Hostel;
import com.model.Ngotable;
import com.model.Training;


@Service("MyNgoService")
public class MyNgoServiceImpl implements MyNgoServiceIntf{
	
	@Autowired(required=true)
	MyNgoDaoIntf MyNgoDao;

	@Transactional
	public boolean insertngo(Ngotable ngo) {
		System.out.println("service ngo is called");
		boolean flag=MyNgoDao.insertngo(ngo);
		return flag;
	}
	@Transactional
	public List<Ngotable> getNgo() {
		List<Ngotable> list=MyNgoDao.getNgo();
		return list;
	}
	@Transactional
	public boolean inserttraining(Training training) {
		System.out.println("service is called");
		boolean flag=MyNgoDao.inserttraining(training);
		return flag;
	}
	@Transactional
	public List<Training> getTraining() {
		List<Training> list=MyNgoDao.gettraining();
		return list;
	}
	@Transactional
	public boolean insertForm(Hostel hostel) {
		System.out.println("service called");
		boolean flag=MyNgoDao.insertForm(hostel);
		return flag;
	}
	@Transactional
	public List<Hostel> getUserh() {
		List<Hostel> list=MyNgoDao.getUserh();
		return list;
	}

}
