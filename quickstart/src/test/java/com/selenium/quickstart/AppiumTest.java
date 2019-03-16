package com.selenium.quickstart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppiumTest {
	
	
	@BeforeClass
	public void initiatebrowser() {
		
		System.out.println("browser initiated in mobile");
		
	}
	
	@BeforeMethod
	public void launch() {
		
		System.out.println("application launched in mobile");
		
	}
	
	@Test
	public void test() {
		
		System.out.println("application tested in mobile");
		
	}
	@AfterMethod
	public void closeapp() {
		
		System.out.println("application closed in mobile");
		
	}
	@AfterClass
	public void quitBroswer() {
		
		System.out.println("browser quit in mobile");
		
	}

}
