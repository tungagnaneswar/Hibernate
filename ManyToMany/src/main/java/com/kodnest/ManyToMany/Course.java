package com.kodnest.ManyToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String title;
	
	@ManyToMany(mappedBy = "courselist", cascade = CascadeType.ALL)
	List<Student> stulist;

	public Course() {
		super();
	}

	public Course(String title, List<Student> stulist) {
		super();
		this.title = title;
		this.stulist = stulist;
	}

	public Course(int id, String title, List<Student> stulist) {
		super();
		this.id = id;
		this.title = title;
		this.stulist = stulist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Student> getStulist() {
		return stulist;
	}

	public void setStulist(List<Student> stulist) {
		this.stulist = stulist;
	}
	
}
