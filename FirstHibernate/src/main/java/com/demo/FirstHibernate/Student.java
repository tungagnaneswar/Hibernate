package com.demo.FirstHibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	private int id;

	@Column
	private String name;

	@Column
	private int marks;

	@Column
	private String email;

	public Student() {
		super();
	}

	public Student(int id, String name, int marks, String email) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", email=" + email + "]";
	}
	
	

}
