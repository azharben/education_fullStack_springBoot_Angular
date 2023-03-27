package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
	private int nbrePlaces;
	private String description; 
	
	
	
	  @OneToMany
	  
	  @JoinColumn(name = "TEACHER_ID", nullable = true) private Long techerId;
	  public void setTecherId(Long techerId) { this.techerId = techerId; } public
	  Long getTecherId() { return techerId; }
	 
	public Course() {
	
		// TODO Auto-generated constructor stub
	}
	public Course(String title, String description, String price, int nbrePlaces) {
		
		this.title = title;
		this.description = description;
		this.price = price;
		this.nbrePlaces = nbrePlaces;
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
	public int getNbrPlace() {
		return nbrePlaces;
	}
	public void setNbrPlace(int nbrePlaces) {
		this.nbrePlaces = nbrePlaces;
	}
	@Override
	public String toString() {
		return "Cours [title=" + title + ", description=" + description + ", price=" + price + ", nbrePlaces=" + nbrePlaces
				+ "]";
	}
	
	
}
