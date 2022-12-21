package com.StudentManagmentSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagmentSystem.ModelClasses.Course;
import com.StudentManagmentSystem.ModelClasses.Student;
@Repository
   public interface StudentRepo extends JpaRepository<Student,Integer> {

	public List<Student> findAllByStudentCode(Integer code);
	public List<Student> findAllByStudentName(String name);

}
