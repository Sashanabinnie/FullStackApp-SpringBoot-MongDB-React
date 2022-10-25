package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "attraction")
public class Attraction {
	
	@Id
	private String id;
	
	private String attractionName;
	
	private String attractionDescription;
	
	private String attractionState;
	
	private String attractionCity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttractionName() {
		return attractionName;
	}

	public void setAttractionName(String attractionName) {
		this.attractionName = attractionName;
	}

	public String getAttractionDescription() {
		return attractionDescription;
	}

	public void setAttractionDescription(String attractionDescription) {
		this.attractionDescription = attractionDescription;
	}

	public String getAttractionState() {
		return attractionState;
	}

	public void setAttractionState(String attractionState) {
		this.attractionState = attractionState;
	}

	public String getAttractionCity() {
		return attractionCity;
	}

	public void setAttractionCity(String attractionCity) {
		this.attractionCity = attractionCity;
	}
	
	

}