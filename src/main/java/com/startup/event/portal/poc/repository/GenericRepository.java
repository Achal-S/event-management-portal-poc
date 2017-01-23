package com.startup.event.portal.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.startup.event.portal.poc.model.Locations;

@Repository
public interface GenericRepository<T> extends CrudRepository<T, String>{

}
