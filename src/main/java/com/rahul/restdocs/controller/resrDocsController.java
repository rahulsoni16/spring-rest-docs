package com.rahul.restdocs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class resrDocsController {

	@GetMapping(path="/name")
	public String getName(){
		return "A Dummy Name";		
	}
}
