package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Department;
import com.example.demo.Repository.DepartmentRepository;

@Service
public class DepartmentImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDept(Department dept) {
		// TODO Auto-generated method stub
		return this.departmentRepository.save(dept);
	}

	@Override
	public Department findbyId(int deptId) {
		// TODO Auto-generated method stub
		return this.departmentRepository.findByDeptId(deptId);
	}
	
	public Department findId(int id) {
		return this.departmentRepository.findById(id).orElseThrow();
		
	}
	
}
