Feature: OrangeHRM Login  
    Scenario: Logo present on orangehrm home page  
         Given launch chrome browser        
         When Open orangehrm home page  
         Then verify that logo is present  
         And close browser
           