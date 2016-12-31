package com.startup.event.portal.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.startup.event.portal.poc.repository.LocationsRepository;
import com.startup.event.portal.poc.repository.VenuesRepository;

@RestController
public class EventPortalController {

	@Autowired
	private LocationsRepository locationsRepository;

	@Autowired
	private VenuesRepository venuesRepository;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hi";
	}
	
}
