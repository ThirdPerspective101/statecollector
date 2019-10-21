package com.statecollector.controller;

import java.util.UUID;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.statecollector.dao.StateCollectorDao;
import com.statecollector.entity.AnsweredUserForms;
import com.statecollector.entity.SaveAnswerRequestEntity;


@RequestMapping("/statecollector")
@Controller
public class StateCollectorController {

	@Autowired
	private  StateCollectorDao stateCollectorDao;

	@PostMapping("/saveAnswer")
	@ResponseBody
	public String saveAnswer(@RequestBody SaveAnswerRequestEntity requestparam) {

		AnsweredUserForms AUF =  new AnsweredUserForms();

		AUF.setUserId(requestparam.getUserId());
		AUF.setFormId(UUID.randomUUID().toString());
		AUF.setQaMap(JSONObject.wrap(requestparam.getQaMap()).toString());
		
		stateCollectorDao.save(AUF);
		
		return AUF.getFormId();
	}

}
