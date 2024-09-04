package com.sys.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sys.entity.Students;
import com.sys.services.StudentsService;

 @Controller
public class StudentController {

	 
	 @Autowired
	 StudentsService stuservice ;
		

	 @GetMapping("/demo")
	public String Dashboard() throws SQLException {
		 
		 
	List<Students>list=	 stuservice.getAllStudents();
	 Students list2=	 stuservice.getStudentsById(1L);
	
		/*
		 * for(Students stu: list) {
		 * 
		 * System.out.print(stu.getSd_fname().toString()); }
		 */
	 
	  System.out.print(list2.getSd_fname().toString());

		return "views/login";
	}
	
	
    }
