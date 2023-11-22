package com.data.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.data.simplilearn.entity.Class;

import com.data.simplilearn.service.ClassService;



@RestController
public class ClassController {
	@Autowired
	private ClassService classService;
	
	@PostMapping("/saveClasses")
    public ResponseEntity<String> saveClasses(@RequestBody List<Class> classes) {
        // Validate the request and call the service to change the password
		classService.saveAllClasses(classes);
        return ResponseEntity.ok("Classes Saved successfully");
    } 
	
	@PostMapping("/saveClass")
    public ResponseEntity<String> saveClass(@RequestBody Class SingleClass) {
        // Validate the request and call the service to change the password
		classService.saveClass(SingleClass);
        return ResponseEntity.ok("Classes Saved successfully");
    }
	@GetMapping("/getAllClasses")
	public List<Class> getAllClasses()
	{
		return classService.getAllClasses();
	}

}
