package com.data.simplilearn.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Subject {
	@Id
	private Integer id;
	private String subjectName;

	@ManyToOne
	@JoinColumn(name = "subject_id")
	private Class subjectClass;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(Integer id, String subjectName) {
		super();
		this.id = id;
		this.subjectName = subjectName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Class getSubjectClass() {
		return subjectClass;
	}

	public void setSubjectClass(Class subjectClass) {
		this.subjectClass = subjectClass;
	}

}
