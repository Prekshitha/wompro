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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.model.Sukanya;
import com.service.MySukanyaServiceIntf;

@Controller("mySukController")
public class MySukanyaController {


	@Autowired
	MySukanyaServiceIntf mySukService;
	@RequestMapping(value="/sukanya",method=RequestMethod.GET)
	public String getQueryform1(HttpSession session){
		String username=(String)session.getAttribute("userid");
		 String role=(String)session.getAttribute("role");
		 if(username==null || role==null || role.equalsIgnoreCase("workingwomen")==false){
			 return "login";
			 
		 }
		 else
		 
		return "sukanya";
	}

	
	@RequestMapping(value="/sukanya1", method=RequestMethod.POST)
	 public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,  @RequestParam("file") MultipartFile files[])throws ParseException{
		Sukanya sukanya = new Sukanya();
		
		String username = request.getParameter("gaadhar");
		for (int i = 0; i < files.length; i++) {
			String filename="";
			if(i==0)
				
				filename=(username+i)+".pdf";
				else if(i==1)
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
                sukanya.setDob_certificate(filename);
				else if(i==1)
					sukanya.setGuardian_aadhar(filename);
				
				
				
				System.out.println("Server File Location="+ serverFile.getAbsolutePath());
				} catch (Exception e) {
				System.out.println( "You failed to upload " + (username+i) + " => " + e.getMessage());
			}
		}
	

		
		String gname = request.getParameter("gname");
		String cname = request.getParameter("cname");
		SimpleDateFormat formatter2=new SimpleDateFormat("yyyy-MM-dd");
		Date udob=formatter2.parse(request.getParameter("udob")); 
		String nationality = request.getParameter("nationality");
		String gaadhar = request.getParameter("gaadhar");
		String address = request.getParameter("address");
		
		Sukanya sukanya3 = new Sukanya();
		sukanya3.setCname(cname);
		sukanya3.setGname(gname);
		sukanya3.setUdob(udob);
		sukanya3.setNationality(nationality);
		sukanya3.setGaadhar(gaadhar);
		sukanya3.setAddress(address);
		boolean flag= mySukService.insertForm(sukanya3);
		System.out.println("Flag:"+flag);
		ModelAndView mav=new ModelAndView();
		mav.addObject("name",gname);
		if(flag)
			mav.addObject("message is accepted");
		else
			mav.addObject("sorry.........message is not accecepted");
		mav.setViewName("viewsukanya");
		return mav;
	}
	
	@RequestMapping(value="/viewsukanya",method=RequestMethod.GET)
	public ModelAndView ViewUser(){
		List<Sukanya> list=mySukService.getUser();
		System.out.println(list.size());
		ModelAndView mav=new ModelAndView("viewsukanyarecord");
		mav.addObject("obj",list);
		return  mav;
	}
}
