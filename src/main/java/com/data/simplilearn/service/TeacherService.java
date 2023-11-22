package com.data.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.simplilearn.entity.Teacher;

import com.data.simplilearn.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	private TeacherRepository teacherRepository;
	
	public void SaveAllTeachers(List<Teacher> teachers)
	{
		teacherRepository.saveAll(teachers);
	}
	public void Saveteacher(Teacher teacher)
	{
		teacherRepository.save(teacher);
	}
	public List<Teacher> getAllTeachers()
	{
		return teacherRepository.findAll();
	}

}
