package com.StudentManagmentSystem.ModelClasses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	private Integer courseId;
	private String courseName;
	private String description;
	private String courseType;
	private double duration;
	private String courseTopic;
	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
//	@JsonBackReference

	private List<Student> students;
	
	
	
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Integer courseId, String courseName, String description, String courseType, double duration,
			String courseTopic, List<Student> students) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.courseType = courseType;
		this.duration = duration;
		this.courseTopic = courseTopic;
		this.students = students;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public double isDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getCourseTopic() {
		return courseTopic;
	}

	public void setCourseTopic(String courseTopic) {
		this.courseTopic = courseTopic;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
