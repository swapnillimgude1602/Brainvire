package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Department;
import com.example.demo.Repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department addDept(Department department) {

		Department addDept = this.departmentRepository.save(department);
		System.out.println("--Department Inserted--");
		return addDept;
	}

	public List<Department> getAllDepartments() {
		List<Department> getAllDepartment = this.departmentRepository.findAll();
		return getAllDepartment;
	}

	public Department updateDepartment(Department department, int departmentid) {
		department.setDepartmentId(departmentid);
		Department update = this.departmentRepository.save(department);
		System.out.println("--Department Updated--");
		return update;
	}

	public void deleteDepartment(int departmentid) {
		this.departmentRepository.deleteById(departmentid);
		System.out.println("--Department Deleted--");
	}
}
