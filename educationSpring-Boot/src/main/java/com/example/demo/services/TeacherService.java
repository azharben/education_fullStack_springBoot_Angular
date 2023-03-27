package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Teacher;

public interface TeacherService {

	
	public Teacher addTeacher(Teacher t);

	public Teacher editTeacher(Teacher t);

	public Teacher getTeacherById(Long id);
	
	public void deleteTeacherById(Long id);
	
	public List<Teacher> getAllTeachers();
}
