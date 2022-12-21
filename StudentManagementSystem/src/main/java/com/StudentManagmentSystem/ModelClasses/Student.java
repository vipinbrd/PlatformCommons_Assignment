package com.StudentManagmentSystem.ModelClasses;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer studentCode;
	private String studentName;
	private String gender;
	private String email;
	private String mobileNumber;
	private LocalDate dateOfBirth;
	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "sa_fk", referencedColumnName = "studentCode")
	private List<Address> address;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Student_course", joinColumns = {
			@JoinColumn(name = "student_id", referencedColumnName = "studentCode") }, inverseJoinColumns = {
					@JoinColumn(name = "course_id", referencedColumnName = "courseId")

	})
	@JsonManagedReference
	private List<Course> courses;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentCode, String studentName, String gender, String email, String mobileNumber,
			LocalDate dateOfBirth, List<Address> address, List<Course> courses) {
		super();
		this.studentCode = studentCode;
		studentName = studentName;
		this.gender = gender;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.courses = courses;
	}

	public Integer getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(Integer studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	

}
