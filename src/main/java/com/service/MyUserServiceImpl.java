package com.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MyUserDaoIntf;
import com.model.Users;

@Service("myUserService")
public class MyUserServiceImpl implements MyUserServiceIntf
{
	@Autowired(required=true)
	MyUserDaoIntf myUserDao;
	
	/*@Autowired
	UserDaoIntf myDaoUser;*/
	@Transactional
	public boolean insertUser(Users user) 
	{
		
		String uid ="U"+(int)(new Date().getTime());
		user.setUserid(uid);
		boolean flag = myUserDao.insertUser(user);
		
		
		return flag;
	}
	@Transactional
	public Users userLogin(Users user)
	{
		return myUserDao.userLogin(user);
	}
	@Transactional
	public boolean changePassword(String username, String opwd, String npwd) {
		
		return myUserDao.changePassword(username, opwd,  npwd);
	}
	@Transactional
	public void enterPassword(String email_id, String contact_number, String password)
	{
		myUserDao.enterPassword(email_id,contact_number,password);
	}
	
	@Transactional
	public Users checkEmail(Users user) {
		 
		return myUserDao.checkEmail(user);
	}
 
	

}
