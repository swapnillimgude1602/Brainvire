package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Department;
import com.example.demo.Service.DepartmentImpl;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DepartmentImpl departmentImpl;

	@PostMapping("/add")
	public Department save(@RequestBody Department dept ) {
		return this.departmentImpl.saveDept(dept);
	}
	
//	@GetMapping("/disp/{id}")
	@RequestMapping(value="/disp/{id}", method = RequestMethod.GET)
	public Department dispbyId(@PathVariable("id") int id) {
		return this.departmentImpl.findbyId(id);
		
	}
	
	@GetMapping("/{id}")
	public Department dispId(@PathVariable("id") int id) {
		return this.departmentImpl.findId(id);
		
	}
	

}
	