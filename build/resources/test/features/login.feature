#Author: Liseth Troncoso

Feature: Login to Opencart
  As an Opencart client
  I want to start session
  To browse the web page

  @LoginSuccessful
  Scenario Outline: Login successful
    Given Liseth open the page Opencart
    When she log in with the credentials
      | username   | password   |
      | <username> | <password> |
    Then she can browse the page
    Examples:
      | username | password |
      | demo     | demo     |


