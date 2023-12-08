
Feature: OrangeHRM


  Scenario Outline: LoginModule with valid and invalid Credatials
    Given user navigate url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
     When user enter the username  "<username>" in the orangeHRMLOGIN 
     And  user enter the password  "<Password>" in the orangeHRMLOGIN
     And  user clicks on the Login button orangeHRMLOGIN
    Then I verify the "<status>" in step

    Examples: 
      | username  | Password | status  |
      | Admin |     admin123 | OrangeHRM |
      | dfghj |     sdfghj | Fail    |

      
      