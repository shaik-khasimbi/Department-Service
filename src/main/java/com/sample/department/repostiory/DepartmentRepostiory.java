package com.sample.department.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.department.entity.Department;

@Repository
public interface DepartmentRepostiory extends JpaRepository<Department, Long> {

	Department findByDepartmentId(long departmentId);


}
