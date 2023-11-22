package com.data.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.simplilearn.entity.Student;
import com.data.simplilearn.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/saveStudents")
	public ResponseEntity<String> saveStudent(@RequestBody List<Student> students) {
		// Validate the request and call the service to change the password
		studentService.SaveAllStudents(students);
		return ResponseEntity.ok("Students Saved successfully");
	}

	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		// Validate the request and call the service to change the password
		studentService.SaveStudent(student);
		return ResponseEntity.ok("Student Saved successfully");
	}

	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

}
