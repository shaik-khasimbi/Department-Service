package com.sample.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.department.entity.Department;
import com.sample.department.repostiory.DepartmentRepostiory;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepostiory departmentRepostiory;


	public Department saveDepartment(Department department) {
		System.out.println("name :"+ department.getDepartmentName());
		return departmentRepostiory.save(department);
	}


	public Department findDepartmentById(long departmentId) {
		return departmentRepostiory.findByDepartmentId(departmentId);
	}

	public Department updateDepartmentDetails(Department department) {
		Department existingDeaprtmentDeatils = new Department();
		if(String.valueOf(department.getDepartmentId()) != null) {
		 existingDeaprtmentDeatils = departmentRepostiory.findByDepartmentId(department.getDepartmentId());
		 existingDeaprtmentDeatils.setDepartmentAddress(department.getDepartmentAddress());
		}
		
		return departmentRepostiory.save(existingDeaprtmentDeatils);
	}


}
