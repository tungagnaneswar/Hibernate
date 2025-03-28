package com.kodnest.ManyToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course", 
	joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
	public List<Course> courselist;

	public Student() {
		super();
	}

	public Student(String name, List<Course> courselist) {
		super();
		this.name = name;
		this.courselist = courselist;
	}

	public Student(int id, String name, List<Course> courselist) {
		super();
		this.id = id;
		this.name = name;
		this.courselist = courselist;
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

	public List<Course> getCourselist() {
		return courselist;
	}

	public void setCourselist(List<Course> courselist) {
		this.courselist = courselist;
	}
	
	
}
