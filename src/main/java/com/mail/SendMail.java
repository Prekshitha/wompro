package com.mail;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMail
{
		SendMail sendmail;
//		private String email;
		public boolean sendmail(String email) 
		{
			boolean flag = false;
			final String from = "women.empower12345@gmail.com";
			String to = email;
			final String password = "group@123";
			String host =  "smtp.gmail.com";
			String port = "587";
		
			Properties props = new Properties();
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.socketFactory.port", "465");
		
		
		
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", port);
			Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() 
			{
				protected PasswordAuthentication getPasswordAuthentication()
				{
					return new PasswordAuthentication(from,password);
				}
		});
			
		// compose message
		try 
		{
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Reset password link");
			message.setText("http://localhost:8084/women/enterpassword.do");
			// send message
			flag = true;
			Transport.send(message);
			System.out.println("message sent successfully");
		} 
		catch (MessagingException e)
		{
			System.out.println(e);
		}
		return flag;
	}
}

