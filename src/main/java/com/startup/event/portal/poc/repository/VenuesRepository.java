package com.startup.event.portal.poc.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.startup.event.portal.poc.model.VenueDetails;

@Repository
public class VenuesRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public Collection<VenueDetails> searchVenues(String text) {
		return mongoTemplate.find(Query.query(new Criteria().elemMatch(Criteria.where("test"))
						), VenueDetails.class);
	}
}
