package org.stepcase;

import org.data.BaseClass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass1 {
	
	@Before
	public void launBro() {
		
		loadBrowser();
		launchUrl("https://www.facebook.com/");
		
	}
	
	
	@After
	public void closeBrowser() {
		pageClose();
		

	}

}
