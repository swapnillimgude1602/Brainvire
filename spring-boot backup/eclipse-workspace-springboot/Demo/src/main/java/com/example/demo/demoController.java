package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class demoController {
	
	@RequestMapping("/response")
	public String resp() {
		return "hello its a response..!";
		
	}

}
