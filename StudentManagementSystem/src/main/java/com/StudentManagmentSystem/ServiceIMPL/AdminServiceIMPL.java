package com.StudentManagmentSystem.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagmentSystem.Exceptions.StudentException;
import com.StudentManagmentSystem.ModelClasses.Course;
import com.StudentManagmentSystem.ModelClasses.Student;
import com.StudentManagmentSystem.Repository.CourseRepo;
import com.StudentManagmentSystem.Repository.StudentRepo;
import com.StudentManagmentSystem.Services.AdminServices;
@Service
public class AdminServiceIMPL implements AdminServices {
	@Autowired
   private StudentRepo studentrepo;
	@Autowired
	private CourseRepo courserepo;
	@Override
	public Student admitStudent(Student student) {
		Student savedStudent =studentrepo.save(student);
		
		return savedStudent;
	}

	@Override
	public Course uploadCourseDetail(Course course) {
	Course courses=courserepo.save(course);
		return courses;
	}

	@Override
	public List<Student> findStudentByCourse(Course course) {
	    List<Student>list=studentrepo.findAllByStudentCode(course.getCourseId());
		return list;
	}

	@Override
	public List<Student> findByName(String studentName) throws StudentException {
	List<Student>list=studentrepo.findAllByStudentName(studentName);
	if(list.size()==0)
		throw new StudentException("No student found for given name");
		return list;
	}

}
