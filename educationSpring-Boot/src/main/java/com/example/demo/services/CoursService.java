package com.example.demo.services;

import java.util.List;

import com.example.demo.dtos.CourseDto;
import com.example.demo.models.Course;

public interface CoursService {
	public Course addCours(Course c);
	
	public Course editCours(Course c);

	public Course getCoursById(Long id);
	
	public void deleteCoursById(Long id);
	
	public List<Course> getAllCourses();
}
