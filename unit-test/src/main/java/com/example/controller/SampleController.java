package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.junitdemo.SampleTestFile;

@RestController
public class SampleController {
	
	@Autowired
	private SampleTestFile sampleFile;
	
	@GetMapping("/add")
	public int add(@RequestParam int a,@RequestParam int b ) {
		return sampleFile.add(a, b);
	}

}
