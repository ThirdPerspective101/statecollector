package com.statecollector.entity;

import java.util.List;
import java.util.Map;

import lombok.Data;


@Data
public class SaveAnswerRequestEntity {
	
	private String userId;
	
	private List<Map<String, String>> qaMap;

}
