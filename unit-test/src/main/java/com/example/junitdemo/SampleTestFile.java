package com.example.junitdemo;

import org.springframework.stereotype.Service;

@Service
public class SampleTestFile {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	
	public int multipy(int a, int b) {
		return a * b;
	}
	
	
	public String checkAndPrint(String a) {
		if("starting".equals(a))
			return "Welcome";
		else 
			 throw new NullPointerException("Param ."+a+". passed is wrong");
	}

}
