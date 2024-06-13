package com.codestudio.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codestudio.tests.BaseClass;

import io.appium.java_client.android.AndroidDriver;

public class GoogleSearchPage extends BaseClass {
	
	static AndroidDriver driver;
	 
	public GoogleSearchPage(AndroidDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(name="q")
	public static WebElement searchBox;
	
	public void EnterSearchData(String searchdata) {
		
		searchBox.sendKeys(searchdata);
		
	}
	
	public void enterKey() {
		
		searchBox.sendKeys(Keys.ENTER);
		
	}
	

}
