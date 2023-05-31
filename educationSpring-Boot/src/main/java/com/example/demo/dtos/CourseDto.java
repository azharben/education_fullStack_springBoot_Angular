package com.example.demo.dtos;

public class CourseDto {
	
	private Long id;
	private String title;
	private String price;
	private String nbrPlaces;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}
	private Long teacherId;
	private String description;
	
	
	
	
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

	

}
