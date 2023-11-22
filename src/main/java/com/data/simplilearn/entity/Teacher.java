package com.data.simplilearn.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table

public class Teacher {

	@Id
	private Integer id;
	private String teacherName;

	@OneToMany
	@JoinColumn(name = "class_id")
	private List<Class> classTecher;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Integer id, String teacherName) {
		super();
		this.id = id;
		this.teacherName = teacherName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<Class> getClassTecher() {
		return classTecher;
	}

	public void setClassTecher(List<Class> classTecher) {
		this.classTecher = classTecher;
	}

}
