package com.statecollector.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "answered_user_forms")
@Data
public class AnsweredUserForms {
	
	@Id
	String userId;
	
	String formId;
	
	@Column(name = "qa_map")
	String qaMap;
	
}
