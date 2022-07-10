package com.greatlearning.javafsd.studentmanagement.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="student")
@Entity(name = "student_entity")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StudentID")
	private int id;


	@Column(name="StudentName")
	private String studentName;


	@Column(name="Department")
	private String department;
	
	@Column(name="Country")
	private String country;
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
public Student(String studentName, String department, String country) {
		
		this.studentName = studentName;
		this.department = department;
		this.country = country;
	}
	
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", studentName=" + studentName + ", department=" + department + ", country=" + country + "]";
	}

}
