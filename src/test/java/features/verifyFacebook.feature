@login
Feature: Verify Facebook login page

  @no_param
  Scenario: Scenario have no parameter
   # Given Open faebook application
    When Input to username textbox
    And Input to Password textbox
    And Click to Submit button
   # And Close application
 
  @param
  Scenario: Scenario have parameter
   # Given Open faebook application
    When Input to username textbox with "automationtest@gmail.com"
    And Input to Password textbox with "123456"
    And Click to Submit button
   # And Close application

  @param_no_mark
  Scenario: Scenario have parameter and no mark
    #Given Open faebook application
    When Input to username textbox with automationtest@gmail.com
    And Input to Password textbox with 123456
    And Click to Submit button
    #And Close application

  @multiple_param
  Scenario: Scenario have multiple parameter
   # Given Open faebook application
    When Input to username with "automationtest@gmail.com" and Password with "123456"
    And Click to Submit button
   # And Close application

  @datatable_step
  Scenario Outline: Scenario have multiple parameter
   # Given Open faebook application
    When Input to username and Password
      | Username   | Password   |
      | <Username> | <Password> |
    And Click to Submit button
   # And Close application

    Examples: 
      | Username                 | Password |
      | automationtest@gmail.com |   123456 |

  @datatable_scenario
  Scenario Outline: Data Table in Scenario
   # Given Open faebook application
    When Input to username textbox with "<Username>"
    And Input to Password textbox with "<Password>"
    And Click to Submit button
   # And Close application

    Examples: 
      | Username               | Password |
      | automation01@gmail.com |   123456 | 
      | automation02@gmail.com |   123456 | 
