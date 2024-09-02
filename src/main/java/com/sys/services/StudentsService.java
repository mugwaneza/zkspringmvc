package com.sys.services;

import java.util.List;

import com.sys.entity.Students;

public interface StudentsService {

	public Students getEmployeeById(Long id);
	public void  SaveEmployee(Students student);
	public void  UpdateEmployee(Students student);
	public void  DeleteEmployee(Students student);
	public List<Students> getAllEmployees();

}