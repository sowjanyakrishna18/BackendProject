package com.data.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.simplilearn.repository.ClassRepository;

import com.data.simplilearn.entity.Class;

@Service

public class ClassService {
	@Autowired
	private ClassRepository classRepository;

	public void saveAllClasses(List<Class> classes) {
		classRepository.saveAll(classes);
	}

	public List<Class> getAllClasses() {
		return classRepository.findAll();
	}

	public void saveClass(Class singleClass) {
		classRepository.save(singleClass);
		
	}

}
