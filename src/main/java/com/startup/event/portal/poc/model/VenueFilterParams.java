package com.startup.event.portal.poc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VenueFilterParamters")
public class VenueFilterParams {

	@Id
	private String id;

	private String venueType;
	private String capacity;
	private String features;

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getVenueType() {
		return venueType;
	}

	public final void setVenueType(String venueType) {
		this.venueType = venueType;
	}

	public final String getCapacity() {
		return capacity;
	}

	public final void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public final String getFeatures() {
		return features;
	}

	public final void setFeatures(String features) {
		this.features = features;
	}

}
