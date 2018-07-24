package com.fil.topic;

public class Topic {
	
	private String id;
	private String courseName;
	private String description;
	
	public Topic(){
		
	}
	
	public Topic(String id, String courseName, String description) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.description = description;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
