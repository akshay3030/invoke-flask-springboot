package com.springboot.flask.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class FlaskService {

	//@Inject is javax.inject.Inject JavaEE5 way of dependency injection
	//@Autowired is spring way of doing it

	//POST
	public String processFlaskRequest(JsonNode modelInput,String modelname){

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:9091/calculate?model_name="+modelname;
		return restTemplate.postForObject(url, modelInput, String.class);

	}


}
