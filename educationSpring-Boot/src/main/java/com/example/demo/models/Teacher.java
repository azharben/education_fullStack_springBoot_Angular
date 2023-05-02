package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEACHER_ID")
	private Long id; 
	private String name;
	@Column(name = "SPECIALITY")
	private String speciality;
	private String experience;
	private String email;
	
	public Teacher() {
		
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, String speciality, String expreience, String email) {
		
		this.id = id;
		this.name = name;
		this.speciality = speciality;
		this.experience = experience;
		this.email = email;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", speciality=" + speciality + ", experience=" + experience
				+ ", email=" + email + "]";
	}

	
	
	

}
