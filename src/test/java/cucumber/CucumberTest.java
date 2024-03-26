package cucumber;


import org.junit.jupiter.api.Assertions;

import healthcalc.HealthCalcImpl;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTest {

    private HealthCalcImpl calc;
    private float res;
    private boolean error;
    
    @Before
    public void initialization() {
        calc = null;
        res = -1;
        error = true;
    }


    @Given("I am an app user")
    public void i_am_an_app_user() {
        calc = new HealthCalcImpl();
    }
    
    
    @When("I input my gender {string} and height {int} correctly")
    public void i_input_my_gender_and_height_correctly(String g, Integer h) throws Exception {
        res = calc.idealWeight(h, g.charAt(0));
    }
    @When("I input my gender {string} and height {int} incorrectly")
    public void i_input_my_gender_and_height_incorrectly(String g, Integer h) {
        try{
            res = calc.idealWeight(h, g.charAt(0));
        }catch(Exception e){
            error = true;
        }
    }
    @When("I input my weight {float}, height {int}, age {int} and gender {string} correctly")
    public void i_input_my_weight_height_age_and_gender_correctly(float w, int h, int a, String g) throws Exception {
        res = calc.basalMetabolicRate(w, h, g.charAt(0), a);
    }
    @When("I input my weight {float}, height {int}, age {int} and gender {string} incorrectly")
    public void i_input_my_weight_height_age_and_gender_incorrectly(float w, Integer h, Integer a, String g) {
        try{
            res = calc.basalMetabolicRate(w, h, g.charAt(0), a);
        }catch(Exception e){
            error = true;
        }
    }


    @Then("the calculator returns the ideal weight {float}")
    public void the_calculator_returns_the_ideal_weight(float expected) {
        Assertions.assertEquals(expected, res);   
    }
    @Then("the calculator returns the basal metabolic rate {float}")
    public void the_calculator_returns_the_basal_metabolic_rate(float expected) {
        Assertions.assertEquals(expected, res);   
    }
    @Then("the calculator returns an error")
    public void the_calculator_returns_an_error() {
        Assertions.assertTrue(error);  
    }
    
    
    
    
    
    
    
    


    


    




















}
