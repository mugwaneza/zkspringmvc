package com.sys.services;

import java.util.List;

import com.sys.entity.Students;

public interface StudentsService {

	public Students getStudentsById(Long id);
	public void  SaveStudents(Students student);
	public List<Students> getAllStudents();

}