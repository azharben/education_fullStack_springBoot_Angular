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
	private String specialty;
	private String expreience;
	private String email;
	
	public Teacher() {
		
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, String specialty, String expreience, String email) {
		
		this.id = id;
		this.name = name;
		this.specialty = specialty;
		this.expreience = expreience;
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
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getExpreience() {
		return expreience;
	}
	public void setExpreience(String expreience) {
		this.expreience = expreience;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", specialty=" + specialty + ", expreience=" + expreience
				+ ", email=" + email + "]";
	}

	
	
	

}
