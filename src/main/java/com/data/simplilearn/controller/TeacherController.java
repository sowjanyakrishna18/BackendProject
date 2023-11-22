package com.data.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.data.simplilearn.entity.Teacher;
import com.data.simplilearn.service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("/saveTeachers")
    public ResponseEntity<String> saveClasses(@RequestBody List<Teacher> teachers) {
        // Validate the request and call the service to change the password
		teacherService.SaveAllTeachers(teachers);
        return ResponseEntity.ok("Teachers Saved successfully");
    } 
	
	@PostMapping("/saveTeacher")
    public ResponseEntity<String> saveClass(@RequestBody Teacher teacher) {
        // Validate the request and call the service to change the password
		teacherService.Saveteacher(teacher);
        return ResponseEntity.ok("Teacher Saved successfully");
    }
	@GetMapping("/getAllTeachers")
	public List<Teacher> getAllTeachers()
	{
		return teacherService.getAllTeachers();
	}


}
