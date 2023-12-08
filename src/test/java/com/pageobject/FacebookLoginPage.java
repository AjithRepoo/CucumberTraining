package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Testbase.TestBase;

public class FacebookLoginPage extends TestBase {



    @FindBy(id = "email")
    public WebElement usernameInput;

    @FindBy(id = "pass")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;

    public FacebookLoginPage() {
        
        PageFactory.initElements(driver, this);
    }
    public void enterusename(String username) {
        usernameInput.sendKeys(username);
       
    }
    public void enterpassword( String password) {
		
    	 passwordInput.sendKeys(password);
	}
    

    public void clickLoginButton() {
        loginButton.click();
    }

}
