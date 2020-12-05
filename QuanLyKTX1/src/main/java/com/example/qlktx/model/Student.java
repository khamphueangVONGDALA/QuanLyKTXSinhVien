package com.example.qlktx.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable {
	@Id
	private Integer id;
	
	@Column(name="name",length = 20)
	private String name;
	
	@Column(name="CMT",length = 20)
	private String CMT;
	
	@Column(name="DOB",length = 20)	
	private String dob;
	
	@Column(name="classroom",length = 15)
	private String classroom;
	
	@Column(name="hometown",length = 40)
	private String hometown;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCMT() {
		return CMT;
	}

	public void setCMT(String cMT) {
		CMT = cMT;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(Integer id, String name, String cMT, String dob, String classroom, String hometown) {
		super();
		this.id = id;
		this.name = name;
		CMT = cMT;
		this.dob = dob;
		this.classroom = classroom;
		this.hometown = hometown;
	}

	public Student() {
		super();
	}

	
	
}
