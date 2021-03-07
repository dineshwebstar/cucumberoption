package org.stepcase;

import org.data.BaseClass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefi extends BaseClass1 {
	
	
	@Given("user enter on fb login page")
	public void user_enter_on_fb_login_page() {

	}
	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement txtUsr = driver.findElement(By.id("email"));
		fill(txtUsr, "dinu");
		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, "pass");
	}

	@When("user click login button")
	public void user_click_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnClick(btnLogin);
	}

	@Then("user should login validate page")
	public void user_should_login_validate_page() {
	
		
	}
	


}
