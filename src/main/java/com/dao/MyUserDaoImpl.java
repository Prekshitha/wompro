package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.model.Users;
@Repository("myUserDao")
public class MyUserDaoImpl implements MyUserDaoIntf
{
	@PersistenceContext
	EntityManager em;
	
	public boolean insertUser(Users user) 
	{
		
		boolean result = false;
		try
		{
			System.out.println("Dao is Called");
			
			em.persist(user);
	
			result = true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
		return result;	
	}
	
	public Users userLogin(Users user)
	{
		  	
			Users f = null;
			try
			{
				f = (Users)em.createQuery("SELECT f FROM Users f WHERE f.username=:username and f.password=:password")
			         .setParameter("username", user.getUsername())
			         .setParameter("password",user.getPassword())
			         .getSingleResult();
			}
			catch(Exception e) 
			{
				System.out.println(e); 
			}
			em.close();

			return f;
	}

	public boolean changePassword(String username, String opwd, String npwd) 
	{

		  boolean flag=false;
		   
		  Query query = em.createQuery("update Users u set u.password=:npwd where u.username=:username and u.password=:opwd");
		  query.setParameter("npwd", npwd);
		  query.setParameter("opwd", opwd);
		  query.setParameter("username", username);
		 
		  int r = query.executeUpdate();
		
		  em.close();
		  if(r>0)
			  flag=true;
		  return flag;
	}

	public boolean enterPassword(String email_id, String contact_number, String password) 
	{
		  boolean flag=false;
		  
		  Query q = em.createQuery("UPDATE Users s SET s.password=:password WHERE s.email_id=:email_id AND s.contact_number=:contact_number");
		 
		  q.setParameter("email_id", email_id);
		  q.setParameter("contact_number", contact_number);
		  q.setParameter("password", password);
		  
		  System.out.println(email_id);
		  System.out.println(password);
		  int r = q.executeUpdate();
		  
		  em.close();
		 
		  if(r>0)
			flag=true;
		  return flag;
	}
	/*public int checkEmail(String email_id) 
	{
		int result = 0;
		try
		{
			result= (Integer) em.createQuery("SELECT f FROM Users f WHERE f.email_id=:email_id")
		         .setParameter("email_id", email_id)
		         .getSingleResult();
		}
		catch(Exception e) 
		{
			System.out.println(e); 
		}
		em.close();
		return result;
	}*/
	public Users checkEmail(Users user)
	{
		String email_id=user.getEmail_id();
	
		Users r = null;
		try{
//		r = em.find(Login.class, login.getEmail());
			r=  (Users) em.createQuery("SELECT u FROM  Users u where  u.email_id=:email_id")
					 .setParameter("email_id", email_id)
					 .getSingleResult();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
		return r;
	}

}
