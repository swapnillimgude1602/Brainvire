package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class jspController {
	
	@RequestMapping("/home")
	public ModelAndView home() {
		//System.out.println("home page is this");
		return new ModelAndView("home");
	}
	
	@RequestMapping("/aboutus")
	public String Aboutus() {
		
		return "AboutUS";
	}

}
