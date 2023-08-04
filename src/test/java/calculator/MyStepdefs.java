package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private String operator;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+), one operator ([\\^*/])$")
    public void twoInputValuesAnd(int arg0, int arg1, String arg2) {
        value1 = arg0;
        value2 = arg1;
        operator = arg2;
    }

    @When("^I operate on the two values$")
    public void iAddTheTwoValues() {
        result = calculator.calculate(value1, value2, operator);
        System.out.print(result);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}