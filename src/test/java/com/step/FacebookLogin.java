package com.step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Testbase.TestBase;
import com.pageobject.FacebookLoginPage;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin extends TestBase {
	
	
	
	
	FacebookLoginPage fb  = new FacebookLoginPage();
	public FacebookLogin() {
		super();
	}
	
	@Given("user navigate the facebook url {string}")
	public void user_navigate_the_facebook_url(String url) {
		
		System.out.println(url);
		driver.get("https://www.facebook.com/");
		
	   
	}

	@When("user enter the username  {string} in the username Field")
	public void user_enter_the_username_in_the_username_field(String username) {
	    fb.enterusename(username);
	}

	@And("user enter the password  {string} in the Password Field")
	public void user_enter_the_password_in_the_password_field(String password) {
	fb.enterpassword(password);
	}

	@And("user clicks on the Login button")
	public void user_clicks_on_the_login_button() {
	   fb.clickLoginButton();
	}

	@Then("i need to verify invalid username {string}")
	public void i_need_to_verify_invalid_username(String verify) {
		String text = driver.findElement(By.xpath("//*[text()='Invalid username or password']")).getText();
	    Assert.assertEquals(text,verify);
		
		
	}
	
	


}
