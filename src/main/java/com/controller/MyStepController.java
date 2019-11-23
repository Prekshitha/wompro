package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.model.Step;
import com.model.Sukanya;
import com.service.MyStepServiceIntf;
import com.service.MySukanyaServiceIntf;

public class MyStepController {

	

	@Autowired
	MyStepServiceIntf myUserService;
	@RequestMapping(value="/step",method=RequestMethod.GET)
	public String getQueryform11(HttpSession session){
		String username=(String)session.getAttribute("userid");
		 String role=(String)session.getAttribute("role");
		 if(username==null || role==null || role.equalsIgnoreCase("workingwomen")==false){
			 return "login";
		 }
		 else
		 
		return "step";
	}
	
	@RequestMapping(value="/step1", method=RequestMethod.POST)
	 public ModelAndView addUser211(HttpServletRequest request, HttpServletResponse response, @RequestParam("file") MultipartFile files[]) throws ParseException{
	//public ModelAndView insertContact(HttpServletRequest request,HttpServletResponse response) throws ParseException{
		Step step = new Step();
		String username = request.getParameter("aadhar");
		for (int i = 0; i < files.length; i++) {
			String filename="";
			if(i==0)
				
				filename=(username+i)+".pdf";
				else if(i==1)
					filename=(username+i)+".pdf";
				else if(i==2)
					filename=(username+i)+".pdf";
			MultipartFile file = files[i];
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()+ File.separator + filename);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				
				if(i==0)
                step.setAadhar_file(filename);
				else if(i==1)
				step.setPan(filename);
				else if(i==2)
				step.setCourse(filename);
				
				
				System.out.println("Server File Location="+ serverFile.getAbsolutePath());
				} catch (Exception e) {
				System.out.println( "You failed to upload " + (username+i) + " => " + e.getMessage());
			}
		}
	
	String id=request.getParameter("stepid");
	String name=request.getParameter("name");
	String aadhar=request.getParameter("aadhar");
 	SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
	Date stepdob=formatter1.parse(request.getParameter("stepdob")); 
	String marital=request.getParameter("marital");
	String qualification=request.getParameter("qualification");
	String fathername=request.getParameter("fathername");
	String mothername=request.getParameter("mothername");
	String spousename=request.getParameter("spousename");
	String child=request.getParameter("child");
	String address=request.getParameter("address");
	String stepemail=request.getParameter("stepemail");

	
	Step step1 = new Step();
	step1.setName(name);
	step1.setAadhar(aadhar);
	step1.setStepdob(stepdob);
	step1.setMarital(marital);
	step1.setQualification(qualification);
	step1.setFathername(fathername);
	step1.setMothername(mothername);
	step1.setSpousename(spousename);
	step1.setChild(child);
	step1.setAddress(address);
	step1.setStepemail(stepemail);
	
	boolean flag=myUserService.insertStepForm(step1);
	ModelAndView mav=new ModelAndView();
	mav.addObject("name",name);
	
	if(flag)
		mav.addObject("status","Your details are successfully inserted");
	else
		mav.addObject("status","sorry.........data is not inserted");
	mav.setViewName("viewstep");
	return mav;
	}
	/*@RequestMapping(value="/viewstep",method=RequestMethod.GET)
	public ModelAndView ViewUser(){
		List<Step> list=myUserService.getUserstep();
		System.out.println(list.size());
		ModelAndView mav=new ModelAndView("viewsteprecord");
		mav.addObject("obj",list);
		return  mav;
	}*/

}
