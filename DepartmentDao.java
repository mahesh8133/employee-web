package com.web.dao;

import com.web.domain.Department;

public interface DepartmentDao {

	public void createDepartment(Department department);

	public void updateDepartment(Department department);

	public void deleteDepartment(Department department);

	public Department findDepartmentById(int departmentId);

}
