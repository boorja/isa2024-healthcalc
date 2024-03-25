
@tag
Feature: Basal Metabolic Rate (BMR)
    As a user, I want to know my BMR so that I can control my calory intake

    @tag1
        Scenario Outline: Try getting BMR with correct parameters
        Given I am an app user
        When I input my weight <w>, height <h>, age <a> and gender <g> correctly
        Then the calculator returns the ideal weight <res>
            
        Examples:
            |  g  |  h  |    w    |   a   |   value   |
            | 'm' | 175 |   88.6  |   21  |  1879.75  |
            | 'f' | 181 |   75.4  |   37  |  1539.25  |
            | 'f' | 167 |   59.2  |   65  |  1149.75  |

     @tag2
        Scenario Outline: try getting BMR with incorrect parameters
        Given I am an app user
        When I input my weight <w>, height <h>, age <a> and gender <g> incorrectly
        Then the calculator returns an error
            
        Examples:
            |  g  |   h  |     w     |    a    |
            | 'm' |  175 |    88.6   |   -12   |
            | 'f' |  181 |   -75.4   |    37   |
            | 'f' | -167 |    59.2   |    65   |
            | 'r' |  177 |    60.2   |    69   |