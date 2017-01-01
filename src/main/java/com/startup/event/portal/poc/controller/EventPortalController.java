package com.startup.event.portal.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.startup.event.portal.poc.model.Locations;
import com.startup.event.portal.poc.repository.LocationsRepository;
import com.startup.event.portal.poc.repository.VenuesRepository;

@RestController
@RequestMapping(
		path = "/",
		consumes = MediaType.APPLICATION_JSON_VALUE,
		produces = MediaType.APPLICATION_JSON_VALUE,
		method = { RequestMethod.GET, RequestMethod.POST })

public class EventPortalController {

	@Autowired
	private LocationsRepository locationsRepository;

	@Autowired
	private VenuesRepository venuesRepository;

	@RequestMapping(value = "/getLocations", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Locations>> getLocations() {
		List<Locations> locations = (List<Locations>) locationsRepository.findAll();
		return new ResponseEntity<List<Locations>>(locations, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getVenueFilterParams", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Locations>> getVenueFilterParams() {
		List<Locations> locations = (List<Locations>) locationsRepository.findAll();
		return new ResponseEntity<List<Locations>>(locations, HttpStatus.OK);
	}
	

}
