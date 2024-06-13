package com.codestudio.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	
	ExtentReports extent;
	ExtentSparkReporter spark;
	
	@BeforeSuite
	public void setupReport() {
		
		    extent = new ExtentReports();
	        spark = new ExtentSparkReporter("target/LatestReport.html");
	        extent.attachReporter(spark);
		
	}
	
	
	@AfterSuite
	public void teardownReport() {
		
		extent.flush();
		
	}

}
