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

import com.StudentManagmentSystem.Exceptions.StudentException;
import com.StudentManagmentSystem.ModelClasses.Course;
import com.StudentManagmentSystem.ModelClasses.Student;
import com.StudentManagmentSystem.ServiceIMPL.AdminServiceIMPL;
import com.StudentManagmentSystem.Services.AdminServices;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminServiceIMPL adminService;
	
	@PostMapping("/savestudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student stu){
		Student student=adminService.admitStudent(stu);
		
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
		
		
		
		
	}
	@PostMapping("/savecourse")
	public ResponseEntity<Course> saveCourse(@RequestBody Course cours){
		Course course=adminService.uploadCourseDetail(cours);
		
		return new ResponseEntity<Course>(course,HttpStatus.CREATED);
		
		
		
		
	}
	
	@PostMapping("/allstudent")
	public ResponseEntity<List<Student>> findStudentByCourse(@RequestBody Course cours){
		List<Student>list=adminService.findStudentByCourse(cours);
		
		return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
        
		
		
		
		
	}
	@GetMapping("/students/{name}")
	public ResponseEntity<List<Student>> allStudentByName(@PathVariable("name") String sname) throws StudentException{
		List<Student> list=adminService.findByName(sname);
		return new ResponseEntity<List<Student>>(list,HttpStatus.ACCEPTED);
		

		
		
	}


}
