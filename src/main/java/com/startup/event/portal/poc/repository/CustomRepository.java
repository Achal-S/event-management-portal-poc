package com.startup.event.portal.poc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void save(Object objectToSave){
		mongoTemplate.insert(objectToSave);
	}
}
