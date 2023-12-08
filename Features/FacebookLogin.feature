
Feature: Facebook
  
 @Login
  Scenario: Facebook_Login
    Given user navigate the facebook url "https://www.facebook.com/"
    When user enter the username  "asdfgh" in the username Field 
    And  user enter the password  "12345678" in the Password Field
    And  user clicks on the Login button
    Then  i need to verify invalid username "Invalid username or password"
    
    
    
    @PIM
    Scenario: PIM_Module
    Given user click on the PIM  buttton
    When  user enter the Firstname 
    And   user enter entyer the last name 
    And   user enter the  middle name
    
    
    @Admin
    Scenario: AdminModule
    Given user giving the role Admin
   
    

