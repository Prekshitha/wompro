package com.service;

import com.model.Users;

public interface MyUserServiceIntf 
{

	public boolean insertUser(Users user);
	public Users userLogin(Users user);
	public boolean changePassword(String username,String opwd, String npwd);
	public void enterPassword(String email_id,String contact_number, String password);
	public Users checkEmail(Users user);
	
	
}
