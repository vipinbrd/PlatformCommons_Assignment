package com.StudentManagmentSystem.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentManagmentSystem.DTO.StudentCourseDto;
import com.StudentManagmentSystem.DTO.StudentDto;
import com.StudentManagmentSystem.Exceptions.CourseNotFoundException;
import com.StudentManagmentSystem.Exceptions.StudentException;
import com.StudentManagmentSystem.ModelClasses.Course;
import com.StudentManagmentSystem.ModelClasses.Student;

public interface StudentService {

	public Student updateDetail(StudentDto stDto) throws StudentException;
	public List<Course>courseByStudent_id(Integer Student_id)throws CourseNotFoundException;
	public Course deletCourse(StudentCourseDto stCo) throws StudentException,CourseNotFoundException;
	

}
