package com.app.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginControllerService {
	//@Autowired
  public String Check(String username,String password)
  {
		System.out.print("Test");
	  if(username.equals("amit")&&password.equals("123"))
	  {
		  return "Login Successful";
	  }
	  else
	  {
		  return "Incorrect Login Details";
	  }
  }
}
