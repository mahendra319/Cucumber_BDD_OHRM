package com.qa.ohrm.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {

	WebDriver driver;
	@Given("^user already on Login Page$")
	public void user_already_on_Login_Page()  {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

	@When("^Login Page title is OrangeHRM$")
	public void login_Page_title_is_OrangeHRM()  {
	   
		System.out.println("Login Page Title");
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password()  {
	 System.out.println("user enter username and password");
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button()  {
	
		System.out.println("Click Login Button");
	}

	@Then("^user on Dashboard page$")
	public void user_on_Dashboard_page()  {
	   
		System.out.println("User on Dashboard Page");
	}
	
}
