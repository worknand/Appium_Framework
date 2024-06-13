package com.codestudio.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass extends ExtentReportManager {
	
	static AndroidDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilities=new DesiredCapabilities();

		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "14.0");
		capabilities.setCapability("udid", "63854d07bfc2");
		capabilities.setCapability("deviceName", "POCO M6 Pro 5G");
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("chromedriverExecutable", "C:\\Users\\nanda\\eclipse-workspace\\AppiumFramework\\drivers\\chromedriver-win64\\chromedriver.exe");

		/* The number of seconds appium server should wait for clients 
		 * to send commands before  deciding
		 * that the client has gone away and the session
		 * should shut down
		 */
		capabilities.setCapability("appium:newCommandTimeout", 60);
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver=new AndroidDriver(url,capabilities);
		
		System.out.println("Application started");

	}

	
	
	@AfterTest
	public void teardown() {
		
        System.out.println("Successfully completed");
		
		driver.quit();

	}

}
