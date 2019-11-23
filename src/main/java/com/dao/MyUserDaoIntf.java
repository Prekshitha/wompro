package com.dao;

import com.model.Users;

public interface MyUserDaoIntf 
{
	public boolean insertUser(Users user);
	public Users userLogin(Users user);
	public boolean changePassword(String username,String opwd, String npwd);
	public boolean enterPassword(String email_id, String contact_number, String password);
	public int checkEmail(String email_id);
}
