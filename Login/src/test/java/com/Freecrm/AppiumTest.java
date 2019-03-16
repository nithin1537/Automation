package com.Freecrm;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppiumTest {
	
	
	@BeforeClass
	public void initiatebrowser() {
		
		System.out.println("browser initiated in mobile: develop branch 1");
		
	}
	
	@BeforeMethod
	public void launch() {
		
		System.out.println("application launched in mobile: develop branch 1");
		
	}
	
	@Test
	public void test() {
		
		System.out.println("application tested in mobile: develop branch 1");
		
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
