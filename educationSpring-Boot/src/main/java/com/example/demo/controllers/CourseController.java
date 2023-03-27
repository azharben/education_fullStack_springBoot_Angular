package com.example.demo.controllers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Course;
import com.example.demo.services.CoursService;


@CrossOrigin("*")
@RequestMapping("api/course")
@RestController


public class CourseController {
	
	@Autowired
	private  CoursService coursService;
	
	/*
	 * @PostMapping public ResponseEntity<Course> addCours(@RequestBody Course c) {
	 * System.out.println("Received course: " + c); Course newCourse =
	 * coursService.addCours(c); return new ResponseEntity<>(newCourse,
	 * HttpStatus.CREATED); }
	 */
	@PostMapping
	public Course addCours(@RequestBody Course c) {	
		return coursService.addCours(c);
	}
	@GetMapping("/{id}")
	public Course getCoursById(@PathVariable Long id) {
		
		return  coursService.getCoursById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCoursById(@PathVariable Long id) {

		 coursService.deleteCoursById(id);
		
	}

	@GetMapping
	public List<Course> getAllCourses() {

		return coursService.getAllCourses();
	}

	@PostMapping("/{id}")
	public Course kharya	(Course c) {

		return coursService.editCours(c);
	}
}
