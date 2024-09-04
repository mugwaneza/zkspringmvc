package com.sys.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import com.sys.entity.Students;
import com.sys.repository.StudentsRepository;


@Service
public class StudentsServiceImpl implements StudentsService {

	
	 @WireVariable
	private StudentsRepository repo;

	@Override
	public Students getStudentsById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void SaveStudents(Students student) {
		repo.save(student);
	}

	@Override
	public List<Students> getAllStudents() {
		return repo.findAll();
	}

	

	


}
