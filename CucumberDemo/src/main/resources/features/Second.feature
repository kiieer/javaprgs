#TodoComplete.feature
Feature: Checking Todo Completion

    Background:
        Given a user is on the View Todos page
        And the user is logged in as a basic user

    Scenario: A user wants to update the status of any potentially completed todos
        Given the user has at least one completed todo in their list of todos
        When the user hits the CHECK TODOS button
        Then the completed todos will be marked as complete on the page

    Scenario: A user wants to use the update feature when there are no completed todos
        Given the user does not have a completed todo in their list of todos
        When the user hits the CHECK TODOS button
        Then none of the incomplete todos will be marked as complete on the page