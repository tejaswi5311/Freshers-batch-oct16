package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
@RequestMapping(value="/login", method = RequestMethod.GET)
public String loginpage() {
	return "login";
}
@RequestMapping(value="/login", method = RequestMethod.POST)
public String welcomepage(ModelMap model,@RequestParam String userid, @RequestParam String password) {
	if(userid.equals("admin")&& password.equals("root")) {
	
	return "welcome";	
	}
	model.put("error","please provide correct userid or password");
	return "login";
}


	
}