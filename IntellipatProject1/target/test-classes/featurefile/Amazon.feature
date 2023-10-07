Feature: Amazon validation

  @Amazon
    #Before Hooks
  Scenario: Search functionality of amazon
    Given user enters the "iphone" and click on search icon
    Then  Validate title of page

@Multi
    Scenario Outline: Multi validation
      Given user enters the "<Product>" and click on search button
      Examples:
        | Product |
        | iphone  |
        | tv      |


  @Dropdown

  Scenario: Validate dropdown value
    Given user extracts the vlaue of from the category dropdown

@DropdownValue
  Scenario: select value from dropdown
    Given user select value from the categorydropdown

  @MouseAction
  Scenario: validation of mouse action
    Given user select the babywishlist by mouse Action

    @DragAndDrop
    Scenario:   Drag and drop
      Given  user drag and drop the box

