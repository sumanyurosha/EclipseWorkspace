package com.fil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fil.services.LoginService;


@Controller
public class LoginController {
	
	LoginService service = new LoginService();
	
	
	@RequestMapping(value="/log", method=RequestMethod.GET)
	//@ResponseBody
    public String printHello() {
		System.out.println("hello");
		return "login";
   }
	@RequestMapping(value="/log", method=RequestMethod.POST)
	//@ResponseBody
	public String functionName(@RequestParam String name,@RequestParam String password,ModelMap model){
		
		if(service.validateUser(name, password)){
			model.put("name", name);
			model.put("password", password);
			
			return "welcome";
		}
		else{
			model.put("errorMsg","Invalid User!");
			return "login";
		}
		
	}
}
