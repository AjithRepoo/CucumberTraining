package com.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PIMModule1 {
	
	
	@Given("user click on the PIM  buttton")
	public void user_click_on_the_pim_buttton() {
		System.out.println("ser_click_on_the_pim_buttto");
	  
	}

	@When("user enter the Firstname")
	public void user_enter_the_firstname() {
	    System.out.println("user_enter_the_firstname");
	}

	@When("user enter entyer the last name")
	public void user_enter_entyer_the_last_name() {
		System.out.println("user_enter_entyer_the_last_name");
	   
	}

	@When("user enter the  middle name")
	public void user_enter_the_middle_name() {
	   
	}
}
