package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Department;
import com.example.demo.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/addDept")
	public Department addDept(@RequestBody Department department) {
		Department addDept = this.departmentService.addDept(department);
		return addDept;
	}

	@GetMapping("/getDept")
	public List<Department> getDepartments() {
		List<Department> getDeptartments = this.departmentService.getAllDepartments();
		return getDeptartments;
	}

	@PutMapping("/updateDept/{deptid}")
	public Department updateDept(@RequestBody Department department, @PathVariable("deptid") int deptid) {
		Department update = this.departmentService.updateDepartment(department, deptid);
		return update;
	}

	@DeleteMapping("/deleteDept/{deptid}")
	public void deleteDept(@PathVariable("deptid") int deptid) {
		this.departmentService.deleteDepartment(deptid);
	}
}
