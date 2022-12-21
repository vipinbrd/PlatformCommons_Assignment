package com.StudentManagmentSystem.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagmentSystem.ModelClasses.Course;
@Repository
public interface CourseRepo  extends JpaRepository<Course, Integer>{




}
