package com.example.demo.Service;

import com.example.demo.Entity.Department;

public interface DepartmentService {

	Department saveDept(Department dept);
	Department findbyId(int deptId);
}
