package com.StudentManagmentSystem.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentManagmentSystem.Exceptions.StudentException;
import com.StudentManagmentSystem.ModelClasses.Course;
import com.StudentManagmentSystem.ModelClasses.Student;

public interface AdminServices {
	
	public Student admitStudent(Student student);
	public Course uploadCourseDetail(Course course);
	public List<Student> findStudentByCourse(Course course);
	public List<Student> findByName(String studentName) throws StudentException;

}
