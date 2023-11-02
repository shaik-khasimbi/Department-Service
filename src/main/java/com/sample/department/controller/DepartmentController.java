package com.sample.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.department.entity.Department;
import com.sample.department.service.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.print(department);
		return departmentService.saveDepartment(department);
	}
	

	@GetMapping("/getdepartment/{id}")
	public Department findDepartmentById(@PathVariable("id") long departmentId) {
		System.out.println("departmentId" + departmentId);
		return departmentService.findDepartmentById(departmentId);
		
	}
	
	@PostMapping("/updateDepartment")
	public Department updateDepartmentDetails(@RequestBody Department department) {
		return departmentService.updateDepartmentDetails(department);
		
	}
}
