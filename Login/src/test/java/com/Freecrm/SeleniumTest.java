package com.Freecrm;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
	

	
	
	@BeforeClass
	public void initiatebrowser() {
		
		System.out.println("browser initiated in desktop-------------------------");
		
	}
	
	@BeforeMethod
	public void launch() {
		
		System.out.println("application launched in desktop------------------");
		
	}
	
	@Test
	public void test() {
		
		System.out.println("application tested in desktop");
		
	}
	@AfterMethod
	public void closeapp() {
		
		System.out.println("application closed in desktop");
		
	}
	@AfterClass
	public void quitBroswer() {
		
		System.out.println("browser quit in desktop");
		
	}
}
