package com.data.simplilearn.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	private Integer id;
	private String studentName;

	@ManyToOne
	@JoinColumn(name = "classroom_id")

	private Class studentClass;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String studentName, Class studentClass) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Class getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(Class studentClass) {
		this.studentClass = studentClass;
	}

}
