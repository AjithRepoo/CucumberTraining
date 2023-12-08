package com.step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Testbase.TestBase;

import io.cucumber.java.en.*;

public class OrangeHRMLogin extends TestBase {
	
	
	@Given("user navigate url {string}")
	public void user_navigate_url(String url) throws InterruptedException {
	
	  driver.get(url);
	  Thread.sleep(6000);
		
	}

	@When("user enter the username  {string} in the orangeHRMLOGIN")
	public void user_enter_the_username_in_the_orange_hrmlogin(String username) {
		driver.findElement(By.name("username")).sendKeys(username);
	   
	}

	@When("user enter the password  {string} in the orangeHRMLOGIN")
	public void user_enter_the_password_in_the_orange_hrmlogin(String Password) {
	    driver.findElement(By.name("password")).sendKeys(Password);
		
	}
	@When("user clicks on the Login button orangeHRMLOGIN")
	public void user_clicks_on_the_login_button_orange_hrmlogin() {
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String Status) {
		String title = driver.getTitle();
		Assert.assertEquals(title,Status );		
	}
	
	
}
