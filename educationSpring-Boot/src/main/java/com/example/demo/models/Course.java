package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;


@Entity
@Table(name = "COURSE")
public class Course {

	@Id
	@Column(name="COURSE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String price;
	private String nbrPlaces;
	private String description; 
	private Long teacherId;
	
	/*
	 * @ManyToOne(targetEntity = Teacher.class)
	 * 
	 * @JoinColumn(name = "TEACHER_ID", nullable = true) private Long teacherId;
	 * 
	 * */
	 public void setTeacherId(Long teacherId) { this.teacherId = teacherId; }
	 

	public Long getTeacherId() {
		return teacherId;
	}
	 
	public Course() {
	
		// TODO Auto-generated constructor stub
	}
	public Course(String title, String description, String price, String nbrPlaces, Long teacherId) {
		
		this.title = title;
		this.description = description;
		this.price = price;
		this.nbrPlaces = nbrPlaces;
		this.teacherId=teacherId;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNbrPlaces() {
		return nbrPlaces;
	}
	public void setNbrPlaces(String nbrPlaces) {
		this.nbrPlaces = nbrPlaces;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", price=" + price + ", nbrPlaces=" + nbrPlaces
				+ ", description=" + description + ", teacherId=" + teacherId + "]";
	}
	
	
}
