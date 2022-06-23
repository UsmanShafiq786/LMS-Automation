Feature: Smoke test suit for LMS

  Background:

@regression
   Scenario: Verify click on CPML Department
       Given User is successfully logged in with email "usman.shafique@empglabs.com" & password as "123456" on "http://dev.lms.empg.com"
       And  Click on Department icon
       Then User click on CPML "1" Department
  @regression
   Scenario: Verify click on Project Advertising Department
       Given User is successfully logged in with email "usman.shafique@empglabs.com" & password as "123456" on "http://dev.lms.empg.com"
       And  Click on Department icon
       Then User click on Project Advertising Department
  @regression
   Scenario: Verify click on Project Advertising Department
       Given User is successfully logged in with email "usman.shafique@empglabs.com" & password as "123456" on "http://dev.lms.empg.com"
       And  Click on Department icon
       Then User click on Partner Department
  @regression
   Scenario: Verify click on Project Advertising Department
        Given User is successfully logged in with email "usman.shafique@empglabs.com" & password as "123456" on "http://dev.lms.empg.com"
        And  Click on Department icon
        Then User click on Secondary Department
  @regression
   Scenario: Verify click on Project Advertising Department
        Given User is successfully logged in with email "usman.shafique@empglabs.com" & password as "123456" on "http://dev.lms.empg.com"
        And  Click on Department icon
        Then User click on Olx Department
  @regression
   Scenario: Verify click on Project Advertising Department
        Given User is successfully logged in with email "usman.shafique@empglabs.com" & password as "123456" on "http://dev.lms.empg.com"
        And  Click on Department icon
        Then User click on OLX RE Department
  @regression
  Scenario: Verify click on Project Advertising Department
        Given User is successfully logged in with email "usman.shafique@empglabs.com" & password as "123456" on "http://dev.lms.empg.com"
        And  Click on Department icon
        Then User click on OLX Auto Inspection Department



