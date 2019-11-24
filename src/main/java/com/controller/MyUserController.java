package com.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mail.SendMail;
import com.model.Users;
import com.service.MyUserServiceIntf;

@Controller("myUserController")
public class MyUserController
{
	@Autowired
	MyUserServiceIntf myUserService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister2() 
	{
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new Users());
		return mav;
	 }
	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView insertUser(HttpServletRequest request,HttpServletResponse response) throws java.text.ParseException,IOException 
	{
	    
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date_of_birth = formatter1.parse(request.getParameter("date_of_birth")); 
		String password = request.getParameter("password");
		String email_id = request.getParameter("email_id");
		String contact_number = request.getParameter("contact_number");
		String role = request.getParameter("role");
		
		Users user = new Users();
		user.setName(name);
		user.setUsername(username);
		user.setPassword(password);
		user.setDate_of_birth(date_of_birth);
		user.setEmail_id(email_id);
		user.setContact_number(contact_number);
		user.setRole(role);
	
		boolean flag = myUserService.insertUser(user);
		if(flag)
		{

				ModelAndView mav = new ModelAndView("login");
			    mav.addObject("login", new Users());
			    return mav;
		}
		else
		{

			ModelAndView mav = new ModelAndView("register");
	        mav.addObject("user", new Users());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;
		}	
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView userLogin1(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new Users());
		return mav;
	}


	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView userLogin2(HttpServletRequest request, HttpServletResponse response, @ModelAttribute Users iuser) throws IOException 
	{
		ModelAndView mav = null;
		Users user = myUserService.userLogin(iuser);
		System.out.println("user:"+user);
	    if (user != null) 
	    {
	      HttpSession session= request.getSession();
	      session.setAttribute("userid", user.getUserid());
	      session.setAttribute("role", user.getRole());
	      System.out.println("role:"+ user.getRole());
	      mav = new ModelAndView();	      
	      if(user.getRole().equalsIgnoreCase("workingwomen"))
	      {
	    	  mav.setViewName("womenindex");
	      }
	      else if(user.getRole().equalsIgnoreCase("NGO"))
	      {
	    	  mav.setViewName("ngoindex");
	      }
	      else
	      {
	    	  mav.setViewName("adminindex");
	      }
	      
	    } 
	    else
	    {
	      mav = new ModelAndView("login");
	      mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	}
	
	@RequestMapping(value = "/changepassword", method = RequestMethod.GET)
	public ModelAndView changepwd1(HttpServletRequest request, HttpServletResponse response) 
	{
	    ModelAndView mav = new ModelAndView("changepassword");
	    return mav;
	}
	@RequestMapping(value = "/changepassword", method = RequestMethod.POST)
	public ModelAndView changepwd2(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		String username=(String)session.getAttribute("username");
		String opwd= request.getParameter("opassword");
	    String npwd= request.getParameter("npassword");
		System.out.println(username+"  "+opwd+"  "+npwd);
		boolean flag = myUserService.changePassword(username,opwd,npwd);
		if(flag) 
		{
			ModelAndView mav = new ModelAndView("welcome");
			mav.addObject("message", "Password is successfully updated");
	    	return mav;
		}
		else 
		{
			ModelAndView mav = new ModelAndView("changepassword");
			mav.addObject("message", "Password is not updated");
			return mav;
		}
	}
  

	  

/*	  @RequestMapping(value = "/nsendmail", method = RequestMethod.POST)
	  public ModelAndView sendmail2(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam("nemail") String email)
	  {
		  ModelAndView mav = null;
		  SendMail send = new SendMail();
		boolean flag = send.sendmail(email);
			  if(flag)
			  {	
					mav = new ModelAndView("enterpassword");
			  }
			  else
			  {
 
				  mav = new ModelAndView("forgetpassword");
				  mav.addObject("status", "Try Again");
			  }
 
	
			return mav;

	}*/
	  
	  
	  @RequestMapping(value = "/forgetpassword", method = RequestMethod.GET)
		public ModelAndView forgetpassword1(HttpServletRequest request, HttpServletResponse response) 
		{
		    ModelAndView mav = new ModelAndView("forgetpassword");
		    return mav;
		}
	  
	  @RequestMapping(value = "/enterpassword", method = RequestMethod.GET)
		public ModelAndView enterpassword1(HttpServletRequest request, HttpServletResponse response) 
		{
		    ModelAndView mav = new ModelAndView("enterpassword");
		    return mav;
		}
	  
	  @RequestMapping(value = "/enterpassword", method = RequestMethod.POST)
		public void enterpassword2(HttpServletRequest request, HttpServletResponse response) 
		{
		  	String email_id = request.getParameter("email_id");
		  	String contact_number = request.getParameter("contact_number");
		  	String password = request.getParameter("password");
		  	myUserService.enterPassword(email_id, contact_number, password);
		}
	  
	  	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
		public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) 
		{
		    ModelAndView mav = new ModelAndView("welcome");
		    return mav;
		}
	  	
	  	
		/*@RequestMapping(value = "/step", method = RequestMethod.GET)
		public ModelAndView step(HttpServletRequest request, HttpServletResponse response) 
		{
		    ModelAndView mav = new ModelAndView("step");
		    return mav;
		}*/
		
		@RequestMapping(value = "/index", method = RequestMethod.GET)
		public ModelAndView index(HttpServletRequest request, HttpServletResponse response) 
		{
		    ModelAndView mav = new ModelAndView("index");
		    return mav;
		}
		
		@RequestMapping(value = "/logout", method = RequestMethod.GET)
		public ModelAndView userlogout(HttpServletRequest request, HttpServletResponse response) 
		{
			 HttpSession session =request.getSession(false);
			 session.invalidate();
			 ModelAndView mav = new ModelAndView("index");
			 mav.addObject("index", new Users());
			 return mav;
		 }
		
		  @RequestMapping(value = "/sendmail", method = RequestMethod.POST)
		  public ModelAndView sendmail1(HttpServletRequest request, HttpServletResponse response, HttpSession session) 
		  {
			  SendMail send = new SendMail();
			  ModelAndView mav = null;
			String email_id=request.getParameter("email_id");
			Users user = new Users();
			user.setEmail_id(email_id);
			Users r=myUserService.checkEmail(user);
	
			  if(r!=null)
			  {
				  boolean flag = send.sendmail(email_id);
				  if(flag)
				  {	
						mav = new ModelAndView("forgetpassword");
						mav.addObject("status", "Link sent successfully");
				  }
				  else
				  {
	 
					  mav = new ModelAndView("forgetpassword");
					  mav.addObject("status", "Try Again");
				  }
	 
			  }
			  else
				{
	 
				  mav = new ModelAndView("forgetpassword");
				  mav.addObject("status", "Email Id does not exist");
				}
				return mav;
			 
		  }

}


