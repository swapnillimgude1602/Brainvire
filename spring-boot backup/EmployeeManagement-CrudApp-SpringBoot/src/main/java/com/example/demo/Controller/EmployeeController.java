package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.Entity.Employee;
import com.example.demo.FileUpload.FileUploadDynamic;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
//	@Autowired
//	private FileUploadHelper fileUploadHelper;
	@Autowired
	private FileUploadDynamic fileUploadDynamic;

	@GetMapping("/getEmp")
	public List<Employee> getEmployees() {

		return this.employeeService.getAllEmployees();
	}

	@GetMapping("/getEmp/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return this.employeeService.getEmployeeById(id);
	}

	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee emp = this.employeeService.addEmployee(employee);
		return emp;
	}

	@DeleteMapping("/deleteEmp/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		this.employeeService.deleteEmployee(id);
	}

	@PutMapping("/updateEmp/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id) {
		Employee emp = this.employeeService.updateEmployee(employee, id);
		return emp;

	}

	@PostMapping("/upload-photo")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File is Emplty");
			}

			if (!file.getContentType().equals("image/jpeg")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Not a preferred type");

			}

			// boolean f = fileUploadHelper.uploadFile(file);
			boolean f = fileUploadDynamic.uploadFile(file);
			if (f) {

				// return ResponseEntity.ok("File uploaded Successfully"); //for static path
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/")
						.path(file.getOriginalFilename()).toUriString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong..!");

	}

}
