package com.example.demo.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.CourseDto;
import com.example.demo.models.Course;
import com.example.demo.repositories.CourseRepository;
import com.example.demo.services.CoursService;

@Service
public class CourseServiceImpl implements CoursService{
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course addCours(Course c) {
		// TODO Auto-generated method stub
		return courseRepository.save(c);
	}
	
	@Override
	public Course getCoursById(Long id) {
		// TODO Auto-generated method stub
		Optional<Course> cours = courseRepository.findById(id);
		return cours.isPresent()  ? cours.get() : null;
	}

	@Override
	public void deleteCoursById(Long id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
		
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Course editCours(Course c) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
