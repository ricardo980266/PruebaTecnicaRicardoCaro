#Author
#Date
#Description
@SmokeFeature
Feature: Feauture to test login functionality

  @smoketest
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then verify user validation

    Examples: 
      | username                | password  |
      | ricardo.caro@cun.edu.co | 123456789 |
      | user1                   |    123456 |
