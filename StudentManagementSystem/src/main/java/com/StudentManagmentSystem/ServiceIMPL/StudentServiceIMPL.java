package com.StudentManagmentSystem.ServiceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.StudentManagmentSystem.DTO.StudentCourseDto;
import com.StudentManagmentSystem.DTO.StudentDto;
import com.StudentManagmentSystem.Exceptions.CourseNotFoundException;
import com.StudentManagmentSystem.Exceptions.StudentException;
import com.StudentManagmentSystem.ModelClasses.Course;
import com.StudentManagmentSystem.ModelClasses.Student;
import com.StudentManagmentSystem.Repository.CourseRepo;
import com.StudentManagmentSystem.Repository.StudentRepo;
import com.StudentManagmentSystem.Services.StudentService;

public class StudentServiceIMPL  implements StudentService{
@Autowired
private StudentRepo studentrepo;
@Autowired
private CourseRepo courserepo;


	@Override
	public Student updateDetail(StudentDto stDto) throws StudentException {
	   Optional<Student> opt=studentrepo.findById(stDto.getStudentCode());
	    if(opt.isEmpty()) {
	    	throw new StudentException("Student not found");
	    }
	    else {
	    	Student st=opt.get();
	    	st.setMobileNumber(stDto.getMobileNo());
	    	st.setEmail(stDto.getEmail());
	    	studentrepo.save(st);
	    	return st;
	    	
	    }
		
	}

	@Override
	public List<Course> courseByStudent_id(Integer Student_id) throws CourseNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course deletCourse(StudentCourseDto stCo) throws StudentException, CourseNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
