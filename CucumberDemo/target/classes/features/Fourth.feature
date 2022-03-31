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

    Scenario Outline: A user wants to update the status of any potentially completed todos
        Given the user has <complete> completed todos and <incomplete> incomplete todos in their list of todos
        When the user hits the CHECK TODOS button
        Then <complete> of the todos will be marked as complete on the page
        And there should be a total of <total> todos listed on the page

        Examples:
            | complete | incomplete | total   |
            | 3        | 6          | 9       |
            | 10       | 1          | 11      |
            | 4        | 19         | 23      |