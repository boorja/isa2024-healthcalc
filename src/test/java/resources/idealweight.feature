
@tag
Feature: Ideal Weight
    As a user, I want to know my ideal weight so that i can set a goal for my fitness journey

    @tag1
        Scenario Outline: Try getting ideal weight with correct parameters
        Given I am an app user
        When I input my gender <g> and height <h> correctly
        Then the calculator returns the ideal weight <res>
            
        Examples:
            |  g  |  h  |   res   |
            | 'm' | 175 |  56.85  |
            | 'w' | 181 |  57.81  |
            | 'w' | 167 |  45.07  |

     @tag2
        Scenario Outline: try getting ideal weight with incorrect parameters
        Given I am an app user
        When I input my gender <g> and height <h> incorrectly
        Then the calculator returns an error
            
        Examples:
            |  g  |    h   |
            | 'r' |   175  | 
            | 'w' |  -180  |