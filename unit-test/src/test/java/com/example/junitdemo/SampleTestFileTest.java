package com.example.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SampleTestFileTest {
	
	SampleTestFile sampleFile;
	
	
	@BeforeEach
	public void initBean() {
		sampleFile = new SampleTestFile();
	}
	
	
	@Test
	public void checkadd() {
		assertEquals(33,sampleFile.add(17,16));
	}
	
	@Test
	public void checkMultiply() {
		assertNotEquals(10,sampleFile.multipy(1, 5));
	}
	
	@Test
	public void checkCondition() {
		Assertions.assertTrue(sampleFile.multipy(1, 5) < sampleFile.multipy(2, 5));
	}
	
	
	@Test
	public void checkAssertionAll() {
		Assertions.assertAll("Check Multiple assertions", 
				() -> Assertions.assertFalse(sampleFile.add(2, 4) < 5),
				() -> Assertions.assertEquals(6, sampleFile.add(2, 4))
				);
	}
	
	@Test
	public void testThrows() {
		NullPointerException ex =Assertions.assertThrows(NullPointerException.class, ()->{
			sampleFile.checkAndPrint("test");
		});
		assertEquals("Param .test. passed is wrong",ex.getMessage());
	}
	
}
