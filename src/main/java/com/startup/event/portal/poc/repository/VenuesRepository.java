package com.startup.event.portal.poc.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.startup.event.portal.poc.model.VenueDetails;
import com.startup.event.portal.poc.model.VenueFilterParams;

@Repository
public class VenuesRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public Collection<VenueDetails> searchVenues(String text) {
		return mongoTemplate.find(Query.query(Criteria.where("name").regex("^"+text+"^")), VenueDetails.class);
	}
	
	public VenueDetails findByVenueId(Object id) {
		return mongoTemplate.findById(id, VenueDetails.class);
	}
	
	public Collection<VenueFilterParams> getVenueFilterDetails(){
		return mongoTemplate.findAll(VenueFilterParams.class);
	}
}
