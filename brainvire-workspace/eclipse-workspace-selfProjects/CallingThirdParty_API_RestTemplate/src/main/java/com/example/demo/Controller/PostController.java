package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.PostServiceImpl;

@RestController
@RequestMapping("/api")
public class PostController {
	
	@Autowired
	private PostServiceImpl impl;
	
	@GetMapping("/getPost")
	List<Map<String, Object>> getAllPost(){
		return this.impl.getPost();
		
	}

}
