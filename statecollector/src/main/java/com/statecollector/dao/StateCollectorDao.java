package com.statecollector.dao;

import org.springframework.data.repository.CrudRepository;

import com.statecollector.entity.AnsweredUserForms;


public interface StateCollectorDao extends CrudRepository<AnsweredUserForms, String> {
	
	
	

}
