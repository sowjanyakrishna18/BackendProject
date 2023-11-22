package com.data.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.simplilearn.entity.Student;
import com.data.simplilearn.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void SaveAllStudents(List<Student> students)
	{
		studentRepository.saveAll(students);
	}
	public void SaveStudent(Student student)
	{
		studentRepository.save(student);
	}
	public List<Student> getAllStudents()
	{
		return studentRepository.findAll();
	}
	

}
