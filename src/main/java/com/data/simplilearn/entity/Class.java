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

public class Class {
	@Id
	private Integer id;
	private String className;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="class_id")
	private List<Subject> subjectClass;

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class(Integer id, String className, List<Subject> subjectClass) {
		super();
		this.id = id;
		this.className = className;
		this.subjectClass = subjectClass;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Subject> getSubjectClass() {
		return subjectClass;
	}

	public void setSubjectClass(List<Subject> subjectClass) {
		this.subjectClass = subjectClass;
	}

}
