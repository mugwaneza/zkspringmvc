package com.sys.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sys.entity.Students;

 @Repository
public interface StudentsRepository  extends JpaRepository<Students, Long> {

}
