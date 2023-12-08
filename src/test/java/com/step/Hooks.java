package com.step;



import com.Testbase.TestBase;
import com.pageobject.FacebookLoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase {
	
	public Hooks() {
		
		super();
	}
	
	@Before
	public void launchbrowser() {
		Browsersetup("Chrome");
		

	}
	
	
	@After
	public void teardowm() {
		driver.quit();

	}

}

