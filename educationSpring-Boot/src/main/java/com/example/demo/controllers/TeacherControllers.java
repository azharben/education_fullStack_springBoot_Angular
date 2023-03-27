package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Teacher;
import com.example.demo.services.TeacherService;

@CrossOrigin("*")
@RequestMapping("api/teacher")
@RestController
public class TeacherControllers {
	@Autowired
	private  TeacherService teacherService;
	
	@PostMapping
	public Teacher addCours(@RequestBody Teacher t) {	
		return teacherService.addTeacher(t);
	}

	@GetMapping("/{id}")
	public Teacher getCoursById(@PathVariable Long id) {	
		return  teacherService.getTeacherById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCoursById(@PathVariable Long id) {

		teacherService.deleteTeacherById(id);
		
	}

	@GetMapping
	public List<Teacher> getAllCourses() {

		return teacherService.getAllTeachers();
	}

	@PostMapping("/{id}")
	public Teacher editTeacher	(Teacher t) {
		return teacherService.editTeacher(t);
	}
}
