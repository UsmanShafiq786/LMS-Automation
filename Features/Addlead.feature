Feature: AddLead into LMS

    Scenario: User should be able to open add lead window
      Given User is successfully logged in with email "usman.shafique@empglabs.com" & password as "123456" on "http://dev.lms.empg.com"
      Then User click on plus icon from header on dashboard url "http://dev.lms.empg.com/mvc_index.php?m=cclm&body=index&c=dashboard&section=dashboard#"
      And  User click on Create lead option

    Scenario: User should be able to select project
      Given User is successfully logged in with email "usman.shafique@empglabs.com" & password as "123456" on "http://dev.lms.empg.com"
      Then User click on plus icon from header on dashboard url "http://dev.lms.empg.com/mvc_index.php?m=cclm&body=index&c=dashboard&section=dashboard#"
      And  User click on Create lead option
      And  User click on select dropdown


