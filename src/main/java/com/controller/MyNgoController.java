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

import com.model.Hostel;
import com.model.Ngotable;
import com.model.Training;
import com.model.Users;
import com.service.MyNgoServiceIntf;


@Controller("MyNgoController")
public class MyNgoController {
	
	
	//anjana----(NGO, Training, Hostel)
	
	//--------------------------------------NGO----------------------------------------------
	
	@Autowired
	MyNgoServiceIntf MyNgoService;
	
	@RequestMapping(value="/xyz",method=RequestMethod.GET)   // job for NGO - logged
	public String getNgo(HttpSession session){
		 String username=(String)session.getAttribute("userid");
		 String role=(String)session.getAttribute("role");
		 if(username==null || role==null || role.equalsIgnoreCase("ngo")==false){
			 return "login";
		 }
		 else
		 	return "Ngo";

	}
	
	@RequestMapping(value="/ngo",method=RequestMethod.POST)
	public ModelAndView insertngo(HttpServletRequest request,HttpServletResponse response,HttpSession session, @RequestParam("file") MultipartFile files[]) throws ParseException{
		Ngotable ngotable= new Ngotable();
		
		String username = request.getParameter("ncertificate");
		for (int i = 0; i < files.length; i++) {
			String filename="";
			if(i==0)
			{
				filename=(username+i)+".pdf";
			}
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
                ngotable.setNcertificate(filename);
				
				
				
				System.out.println("Server File Location="+ serverFile.getAbsolutePath());
				} catch (Exception e) {
				System.out.println( "You failed to upload " + (username+i) + " => " + e.getMessage());
			}
		}
		
		System.out.println("controller called");
		String nname=request.getParameter("nname");
		String nman=request.getParameter("nman");
		String nloc=request.getParameter("nloc");
		String nobj=request.getParameter("nobj");
		String contact=request.getParameter("contact");
		
		Ngotable ngo= new Ngotable();
		ngo.setNname(nname);
		ngo.setNman(nman);
		ngo.setNloc(nloc);
		ngo.setNobj(nobj);
		ngo.setContact(contact);
		
		Users  users= new Users();
		String userid=(String)session.getAttribute("userid");
		users.setUserid(userid);
		ngo.setUsers(users);
		
		System.out.println(nobj);
		boolean flag= MyNgoService.insertngo(ngo);
		ModelAndView mav=new ModelAndView();
		mav.addObject("nname",nname);
		if(flag)
			mav.addObject("status","Registration Successful");
		else
			mav.addObject("status","Registration Unsuccessful");
		
		if(nobj.equals("training"))
				mav.setViewName("training");
		else
				mav.setViewName("hostel");
			
	
		return mav;
		
		
	
	}
	//-----------------------------------TRAINING------------------------------------------
	
	@RequestMapping(value="/training",method=RequestMethod.GET)
	public ModelAndView maketraining(HttpServletRequest request,HttpServletResponse response) throws ParseException{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("training");
		return mav;
		
	}
	
	@RequestMapping(value="/training",method=RequestMethod.POST)
	public ModelAndView inserttraining(HttpServletRequest request,HttpServletResponse response, HttpSession session) throws ParseException{
		
		String tname=request.getParameter("tname");
		String tduration=request.getParameter("tduration");
		String ttype=request.getParameter("ttype");
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		Date sdate=formatter.parse(request.getParameter("sdate")); 
		Date edate=formatter.parse(request.getParameter("edate"));
		Date nbatch=formatter.parse(request.getParameter("nbatch"));
		
		
		Training training = new Training();
		training.setTname(tname);
		training.setTtype(ttype);
		training.setTduration(tduration);
		training.setSdate(sdate);
		training.setEdate(edate);
		training.setNbatch(nbatch);
		
//		Ngotable ngotable = new Ngotable();
//		int nid=(int)session.getAttribute("nid");
//		ngotable.setNid(nid);
		
//		training.setNgo(ngotable);
//		
		boolean flag= MyNgoService.inserttraining(training);
		ModelAndView mav=new ModelAndView();
		mav.addObject("tname",tname);
		if(flag)
			mav.addObject("status","Registration Successful");
		else
			mav.addObject("status","Registration Unsuccessful");
		
		mav.setViewName("NgoRegistered");
		return mav;
		
	}
	@RequestMapping(value="/NgoRegistered",method=RequestMethod.GET)
	public ModelAndView ViewUser1(){
		List<Training> list=MyNgoService.getTraining();
		System.out.println(list.size());
		ModelAndView mav=new ModelAndView("viewtrainingrecord");
		mav.addObject("obj",list);
		return  mav;
	}	
	
	//--------------------------------Hostel-----------------------------------

	
	@RequestMapping(value="/hostel",method=RequestMethod.GET)
	public String getQueryform2(){
		return "hostel";
	}
	@RequestMapping(value="/hostel", method=RequestMethod.POST)
	public ModelAndView insertForm1(HttpServletRequest request,HttpServletResponse response) throws ParseException{
	
	
		String hname = request.getParameter("hname");
		String haddress = request.getParameter("haddress");
		int roomcount = Integer.parseInt(request.getParameter("roomcount"));
		
		Hostel hostel = new Hostel();
		hostel.setHname(hname);
		hostel.setHaddress(haddress);
		hostel.setRoomcount(roomcount);
		boolean flag=MyNgoService.insertForm(hostel);
		System.out.println("Flag:"+flag);
		ModelAndView mav=new ModelAndView();
		mav.addObject("name",hname);
		if(flag)
			mav.addObject("message is accepted");
		else
			mav.addObject("sorry.........message is not accecepted");
		mav.setViewName("viewhostel");
		return mav;
	}
	
	@RequestMapping(value="/viewhostel",method=RequestMethod.GET)
	public ModelAndView ViewUser2(){
		List<Hostel> list=MyNgoService.getUserh();
		System.out.println(list.size());
		ModelAndView mav=new ModelAndView("viewhostelrecord");
		mav.addObject("obj",list);
		return  mav;
	}	

	
}
