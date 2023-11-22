package com.data.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.simplilearn.entity.Subject;
import com.data.simplilearn.service.Subjectservice;

@RestController
public class SubjectController {
	@Autowired
	private Subjectservice subjectService;

	@PostMapping("/saveSubjects")
	public ResponseEntity<String> saveClasses(@RequestBody List<Subject> subjects) {
		// Validate the request and call the service to change the password
		subjectService.SaveAllSubjects(subjects);
		return ResponseEntity.ok("Teachers Saved successfully");
	}

	@PostMapping("/saveSubject")
	public ResponseEntity<String> saveClass(@RequestBody Subject subject) {
		// Validate the request and call the service to change the password
		subjectService.SaveSubject(subject);
		return ResponseEntity.ok("Teacher Saved successfully");
	}

	@GetMapping("/getAllSubjects")
	public List<Subject> getAllSubjects() {
		return subjectService.getAllSubjects();
	}

}
