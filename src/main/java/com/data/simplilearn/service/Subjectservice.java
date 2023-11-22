package com.data.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.simplilearn.entity.Subject;
import com.data.simplilearn.entity.Teacher;
import com.data.simplilearn.repository.SubjectRepository;

@Service
public class Subjectservice {
	@Autowired
	private SubjectRepository subjectRepository;
	
	public void SaveAllSubjects(List<Subject> subjects)
	{
		subjectRepository.saveAll(subjects);
	}
	public void SaveSubject(Subject subject)
	{
		subjectRepository.save(subject);
	}
	public List<Subject> getAllSubjects()
	{
		return subjectRepository.findAll();
	}


}
