#Author: Liseth Troncoso

Feature: Search for an order in opencart
  As an Opencart client
  I want to search for an order with its attributes
  To can see the invoice of the order

  Background:
    Given Liseth open the page Opencart

  @OrderInvoiceSuccessful
  Scenario Outline: Order search successful
    And she log in with the credentials
      | username | password |
      | demo     | demo     |
    When she looks for an order
      | Order   | Customer   | Status   | Total   | Date Added   | Date Modified   |
      | <Order> | <Customer> | <Status> | <Total> | <Date Added> | <Date Modified> |
    Then she can see the <Order> in the invoice

    Examples:
      | Order  | Customer       | Status  | Total  | Date Added | Date Modified |
      | 16881  | Nalla Sharanya | Pending | 105    | 2022-05-23 | 2022-05-23    |