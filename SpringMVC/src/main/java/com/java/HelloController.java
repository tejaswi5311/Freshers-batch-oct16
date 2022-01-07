package com.java;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller  
public class HelloController {
	@RequestMapping("/index")
	public ModelAndView add(HttpServletRequest request) {
		ModelAndView m = new ModelAndView();
		m.setViewName("helloworld.jsp");
		return m;
	}
    

}
