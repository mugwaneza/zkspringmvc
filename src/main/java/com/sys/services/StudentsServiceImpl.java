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
	public Students getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);}

	@Transactional
	@Override
	public void SaveEmployee(Students stud) {
		// TODO Auto-generated method stub
		repo.save(stud);
	}
	
	@Transactional
	@Override
	public void UpdateEmployee(Students stud) {
		repo.save(stud);
	}

	@Override
	public void DeleteEmployee(Students employserv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Students> getAllEmployees() {
		return repo.findAll();
	}

	


}
