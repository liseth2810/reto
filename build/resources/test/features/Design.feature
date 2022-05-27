#Author: Liseth Troncoso

Feature: See the topic editor of a section field
  As an Opencart client
  I want to search for the subject of the account section
  To see your Twig template.

  Background:
    Given Liseth open the page Opencart

  @SeeThemeSuccessful
  Scenario Outline: See theme successful
    And she log in with the credentials
      | username   | password   |
      | <username> | <password> |
    When search for the subject of the affiliate field
    Then she can see the Twig template
    Examples:
      | username | password |
      | demo     | demo     |