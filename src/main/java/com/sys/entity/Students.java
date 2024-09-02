package com.sys.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 @Entity
 @Table(name="students")
public class Students {
	 
	     @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	     
	    @Column(name = "sd_fname",nullable = false)    
	    private String sd_fname;
	    
	    @Column(name = "sd_lname",nullable = false)    
	    private String sd_lname;
	    
	    @Column(name = "date",nullable = false)    
		@Temporal(TemporalType.TIMESTAMP)
	    private Date  date;

		public Students(long id, String sd_fname, String sd_lname) {
			this.id = id;
	        this.sd_fname = sd_fname;
	        this.sd_lname = sd_lname;

		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

	

		public String getSd_fname() {
			return sd_fname;
		}

		public void setSd_fname(String sd_fname) {
			this.sd_fname = sd_fname;
		}

		public String getSd_lname() {
			return sd_lname;
		}

		public void setSd_lname(String sd_lname) {
			this.sd_lname = sd_lname;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
		

}
