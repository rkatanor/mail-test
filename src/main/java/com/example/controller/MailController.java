package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.User;
import com.example.service.MailService;

@RestController
@RequestMapping(value = "ws/payroll")
public class MailController {
	@Autowired
	MailService service;
	
	@RequestMapping(value = "/login")
	public String login() {
		System.out.println("logged in sending mail..");
		User user=new User();
		user.setEmail("rkatanor@gmail.com");
		user.setSubject("Testing Spring Mail ");
		user.setMessage("Hello Raj");
		service.sendNotification(user);
		return "notification sent to "+user.getEmail();
	}
	@RequestMapping("/hello")
	public String hello() {
		return "hello heroku ...nice to meet you again again...lilly";
	}
}
