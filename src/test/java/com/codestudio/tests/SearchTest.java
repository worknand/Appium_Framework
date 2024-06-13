package com.codestudio.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.codestudio.pages.GoogleSearchPage;

public class SearchTest extends BaseClass {
	
	
	@Test
	public void test1() throws InterruptedException {
		
		ExtentTest test1=extent.createTest("Test1","SearchTestDemo");
		test1.log(Status.INFO, "Test1 has started");
		
		GoogleSearchPage googleSearchPage=new GoogleSearchPage(driver);
		
		driver.get("https://www.google.com/");
		test1.log(Status.PASS, "WebPage opened");
		
		googleSearchPage.EnterSearchData("Australia");
		test1.log(Status.PASS, "Entered Text");
		
	    googleSearchPage.enterKey();
	    test1.log(Status.PASS, "Entered");
	    
	    Thread.sleep(5000);
	}

}
