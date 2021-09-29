package com.example.SimpleRestApisApplication.controller;

import com.example.SimpleRestApisApplication.models.PostRequest;
import com.example.SimpleRestApisApplication.models.PostResponse;
import com.example.SimpleRestApisApplication.models.SampleResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

public class WebController {
    
    @RequestMapping("/sample")
	public SampleResponse Sample(@RequestParam(value = "name",
	defaultValue = "Robot") String name) {
		SampleResponse response = new SampleResponse();
		response.setId(1);
		response.setMessage("Your name is "+name);
		return response;

	}
    @RequestMapping(value = "/test", method = RequestMethod.POST)
      public PostResponse Test(@RequestBody PostRequest inputPayload) {
	PostResponse response = new PostResponse();
	response.setId(inputPayload.getId()*100);
	response.setMessage("Name : " + inputPayload.getName());
	response.setExtra("Location" + inputPayload.getLocation());
	return response;
}

    
}
