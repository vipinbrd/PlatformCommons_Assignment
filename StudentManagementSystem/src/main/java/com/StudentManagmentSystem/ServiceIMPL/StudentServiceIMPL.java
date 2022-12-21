package com.StudentManagmentSystem.ServiceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagmentSystem.DTO.StudentCourseDto;
import com.StudentManagmentSystem.DTO.StudentDto;
import com.StudentManagmentSystem.Exceptions.CourseNotFoundException;
import com.StudentManagmentSystem.Exceptions.StudentException;
import com.StudentManagmentSystem.ModelClasses.Course;
import com.StudentManagmentSystem.ModelClasses.Student;
import com.StudentManagmentSystem.Repository.CourseRepo;
import com.StudentManagmentSystem.Repository.StudentRepo;
import com.StudentManagmentSystem.Services.StudentService;
@Service
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
		    List<Course> courses=courserepo.findAllByCourseId(Student_id);
		    if(courses.size()==0)
		    	throw new CourseNotFoundException("No course found for given id");
		return courses;
	}

	@Override
	public Course deletCourse(StudentCourseDto stCo) throws StudentException, CourseNotFoundException {
	  Optional<Student>opt=studentrepo.findById(stCo.getStudentCode());
	  if(opt.isEmpty()) throw new StudentException("Student not found  for given id");
	  Student  student=opt.get();
	    Course course=  courserepo.findById(stCo.getCourseId()).get();
	    if(course==null) throw new CourseNotFoundException("no course found for given id");
	     student.getCourses().add(course);
	     return course;
		
	}

}
