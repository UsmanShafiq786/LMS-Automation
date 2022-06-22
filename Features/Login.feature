Feature: Smoke test Suite for LMS

  Background:
    Given user launch Chrome browser
    When  User open the URL "http://dev.lms.empg.com"

    Scenario: successful login with valid credentials
      And  User enter the email as  "usman.shafique@empglabs.com" & password as "123456"
      And  User click on login button
      Then user should be redirected to url "http://dev.lms.empg.com/mvc_index.php?m=cclm&body=index&c=dashboard&section=dashboard#"
      And Close the browser
      
    Scenario: Unsuccessful login with invalid Email & Valid password
       And  User enter the email as  "usman.shafique123@empglabs.com" & password as "123456"
       And  User click on login button
       Then  Verify the Title should be "Invalid Username / Password."
       And Close the browser

    Scenario: Unsuccessful login with valid Email & Invalid password
       And  User enter the email as  "usman.shafique@empglabs.com" & password as "12345611"
       And  User click on login button
       Then Verify the Title should be "Invalid Username / Password."
       And Close the browser

    Scenario: Verify click on Forgot password link
      And User click on the forgot password link
      Then User redirected to the url "http://dev.lms.empg.com/forgot_password.php"
      Then Verify the Title should be "Forgot Password ?"
      And Close the browser

    Scenario: Verify Reset Password with wrong email ID
      And  User click on Forgot password link
      Then User redirected to the url "http://dev.lms.empg.com/forgot_password.php"
      And  User enter an email as "usman.ali"
      And  User click on Reset Password button
      Then Verify the Title is "Invalid Email"
      And Close the browser

    Scenario: Verify Reset Password with Valid email ID
      And  User click on Forgot password link
      Then User redirected to the url "http://dev.lms.empg.com/forgot_password.php"
      And  User enter an email as "usman.shafique@empglabs.com"
      And  User click on Reset Password button
      Then Verify the Success message "An Email With Password Reset Instructions Has Been Sent To You. Please Follow The Link To Proceed!"
      And Close the browser

    Scenario: Verify Reset Password email is being sent to user
      And  User click on Forgot password link
      Then User redirected to the url "http://dev.lms.empg.com/forgot_password.php"
      And  User enter an email as "usman.shafique@empglabs.com"
      And  User click on Reset Password button
      And  Close the browser




      

