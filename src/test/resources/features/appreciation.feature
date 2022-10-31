@wip
Feature: User I should be able to upload files and pictures while sending appreciation

  #@NEXTBASE-1425
  Background: User should be on the users dashboard
    Given user is on the login page

  @NEXTBASE-1426
  Scenario Outline: 1 - Scenario of uploading multiple files
    When user logs in as a "<userType>"
    And user clicks on the -More-, -Appreciation- and the -Upload files- icon in order
    And user clicks to the -Upload files and images- box and upload multiple files
    Then user should see the multiple files that uploaded
    Examples:
      | userType       |
      | Human Resource |
      | Helpdesk       |
      | Marketing      |

  @NEXTBASE-1427
  Scenario Outline: 2- Scenario of uploading different format
    When user logs in as a "<userType>"
    And user clicks on the -More-, -Appreciation- and the -Upload files- icon in order
    And user clicks to the -Upload files and images- box and upload different files
    Then user should see the different files that uploaded
    Examples:
      | userType       |
      | Human Resource |
      | Helpdesk       |
      | Marketing      |

  @NEXTBASE-1428
  Scenario Outline: 3- Scenario of uploading picture
    When user logs in as a "<userType>"
    And user clicks on the -More-, -Appreciation- and the -Upload files- icon in order
    And user clicks to the -Upload files and images- box and upload pictures
    Then user should see the pictures that uploaded
    Examples:
      | userType       |
      | Human Resource |
      | Helpdesk       |
      | Marketing      |

  @NEXTBASE-1429
  Scenario Outline: 4- Scenario of verifying the uploaded picture itself in Activity Stream
    When user logs in as a "<userType>"
    And user clicks on the -More-, -Appreciation- and the -Upload files- icon in order
    And user clicks to the -Upload files and images- box and upload a picture
    And user clicks to the send button
    Then user should see the picture itself in Activity Stream
    Examples:
      | userType       |
      | Human Resource |
      | Helpdesk       |
      | Marketing      |

  @NEXTBASE-1430
  Scenario Outline: 5- Scenario of inserting the files and images into text
    When user logs in as a "<userType>"
    And user clicks on the -More-, -Appreciation- and the -Upload files- icon in order
    And user clicks to the -Upload files and images- box and upload a picture and a file
    And user clicks to the -Insert in text- button
    Then user should see the picture and file are in the text
    Examples:
      | userType       |
      | Human Resource |
      | Helpdesk       |
      | Marketing      |

  @NEXTBASE-1431
  Scenario Outline: 6- Scenario of checking the -allow a recipient to edit documents- check box
    When user logs in as a "<userType>"
    And user clicks on the -More-, -Appreciation- and the -Upload files- icon in order
    And user clicks to the -Upload files and images- box and upload a file
    Then user should check the -allow a recipient to edit documents- check box
    Examples:
      | userType       |
      | Human Resource |
      | Helpdesk       |
      | Marketing      |

  @NEXTBASE-1432
  Scenario Outline: 7- Scenario of removing files and images at any time before sending
    When user logs in as a "<userType>"
    And user clicks on the -More-, -Appreciation- and the -Upload files- icon in order
    And user clicks to the -Upload files and images- box and upload a file
    And user clicks to the remove button
    Examples:
      | userType       |
      | Human Resource |
      | Helpdesk       |
      | Marketing      |

  @NEXTBASE-1433
  Scenario Outline: 8- Scenario of renaming the file before sending
    When user logs in as a "<userType>"
    And user clicks on the -More-, -Appreciation- and the -Upload files- icon in order
    And user clicks to the -Upload files and images- box and upload a file
    And user clicks to the edit button
    Then user should see the renamed file as a loaded file
    Examples:
      | userType       |
      | Human Resource |
      | Helpdesk       |
      | Marketing      |