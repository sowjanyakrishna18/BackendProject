package com.data.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.simplilearn.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
