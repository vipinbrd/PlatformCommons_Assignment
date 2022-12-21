package com.StudentManagmentSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagmentSystem.DTO.StudentCourseDto;
import com.StudentManagmentSystem.DTO.StudentDto;
import com.StudentManagmentSystem.Exceptions.CourseNotFoundException;
import com.StudentManagmentSystem.Exceptions.StudentException;
import com.StudentManagmentSystem.ModelClasses.Course;
import com.StudentManagmentSystem.ModelClasses.Student;
import com.StudentManagmentSystem.ServiceIMPL.StudentServiceIMPL;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceIMPL studentService;
	@PostMapping("/update")
	public ResponseEntity<Student> updateDetail(@RequestBody StudentDto stDto){
		Student student=null;
		 try {
			student=studentService.updateDetail(stDto);
		} catch (StudentException e) {
		
			e.printStackTrace();
		}
		
		
		
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
		
		
		
	}
	
	 @GetMapping("/update/{id}")
	public ResponseEntity<List<Course>> courseByStudent_id(@PathVariable("id") Integer Student_id){
		 List<Course> list=null;
		 try {
			list=studentService.courseByStudent_id(Student_id);
			
		} catch (CourseNotFoundException e) {
			
			e.printStackTrace();
		}
		 
		return new ResponseEntity<List<Course>>(list,HttpStatus.ACCEPTED);
	}
	 
	 @PostMapping("/delete")
	 public ResponseEntity<Course> deletCourse(@RequestBody StudentCourseDto stCo) throws StudentException, CourseNotFoundException {
		Course course= studentService.deletCourse(stCo);
		 
		return new ResponseEntity<Course>(course,HttpStatus.CREATED);
		 
	 }
}
