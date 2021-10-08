package com.app.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.demo.controller.service.LoginControllerService;



@Controller
public class LoginController {
	
	
	LoginControllerService a=new LoginControllerService();
	@RequestMapping("login")
	@ResponseBody
	public String Auth(@RequestParam String username,@RequestParam String password)
	{
		
	
	
		return 	a.Check(username, password);
		
	}
}
