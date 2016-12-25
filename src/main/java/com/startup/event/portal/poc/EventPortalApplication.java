package com.startup.event.portal.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.tests4geeks.tutorials.repository")
public class EventPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventPortalApplication.class, args);
	}
}
