package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.controller.SendMail;
import com.example.pojo.User;
import com.example.service.MailService;
@Service
public class MailServiceImpl implements MailService{
	@Autowired
	JavaMailSender sender;
	@Autowired
	SendMail mail;

   
	@Override
	public void sendNotification(User u) {
		// TODO Auto-generated method stub
		//SimpleMailMessage mail=new SimpleMailMessage();
			mail.setTo(u.getEmail());
			mail.setSubject(u.getSubject());
			mail.setText(u.getMessage());
			sender.send(mail);
			System.out.println("mail sent successfully...");
	}
	
	
		
}
