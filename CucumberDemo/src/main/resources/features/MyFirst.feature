#TodoComplete.feature
Feature: Checking Todo Completion

    Scenario: A user wants to update the status of any potentially completed todos
        Given a user is on the View Todos page
        And the user is logged in as a basic user
        And the user has at least one completed todo in their list of todos
        When the user hits the CHECK TODOS button
        Then the completed todos will be marked as complete on the page