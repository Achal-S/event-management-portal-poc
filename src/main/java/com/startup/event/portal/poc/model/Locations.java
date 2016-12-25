package com.startup.event.portal.poc.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "location")
public class Locations {

	private String id;
	private String locationName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
