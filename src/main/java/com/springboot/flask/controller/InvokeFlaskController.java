package com.springboot.flask.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.springboot.flask.service.FlaskService;



@RestController
@RequestMapping("/invoke")
public class InvokeFlaskController {

	//@Inject is javax.inject.Inject JavaEE5 way of dependency injection
	//@Autowired is spring way of doing it
	
	@Autowired
	FlaskService flaskService;
	
	/*
	@Autowired
	AWSCredentialsProvider awsCredentialsProvider;

	@Autowired
	ClientConfiguration clientConfiguration;*/

	//POST, default method is GET
	@RequestMapping(value="/sbootflask",method=RequestMethod.POST)
	public String executeLambda(@RequestBody JsonNode modeldata,@RequestParam String modelname){
		
		return flaskService.processFlaskRequest(modeldata,modelname);
	}
	
	@RequestMapping(value="/health",method=RequestMethod.GET)
	public String health(){
		return HttpStatus.OK.toString();
	}

}
