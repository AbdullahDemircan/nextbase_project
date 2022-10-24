Feature: User I should be able to upload files and pictures while sending appreciation

  Background : For the scenarios in the feature file, user as a Help Desk is expected to login his/her account

    Given user is on the login page
    When user enters username and password
    And user clicks to the login button
    And user should see users email information on the home page
    And user click on the -More-
    And user click on the -Appreciation-

  Scenario: Scenario of uploading multiple files
    #User should be able to upload multiple files at the same time (Test with max 3 files.)

    When user clicks to the -Upload files- icon
    And user clicks to the -Upload files and images- box
    Then user should see url contains orders