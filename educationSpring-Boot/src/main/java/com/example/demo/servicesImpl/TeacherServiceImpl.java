package com.example.demo.servicesImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Teacher;
import com.example.demo.repositories.TeacherRepository;

import com.example.demo.services.TeacherService;

@Service
public class TeacherServiceImpl  implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public Teacher addTeacher(Teacher t) {
		// TODO Auto-generated method stub
		return teacherRepository.save(t);
	}

	@Override
	public Teacher getTeacherById(Long id) {
		// TODO Auto-generated method stub
		Optional<Teacher> teacher = teacherRepository.findById(id);
		return teacher.isPresent()  ? teacher.get() : null;
	}

	@Override
	public void deleteTeacherById(Long id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);
		
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher editTeacher(Teacher t) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
