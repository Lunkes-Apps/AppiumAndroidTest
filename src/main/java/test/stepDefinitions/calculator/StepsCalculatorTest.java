package test.stepDefinitions.calculator;

import static org.junit.Assert.assertEquals;

import core.BaseTest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.calculator.MainPage;

public class StepsCalculatorTest extends BaseTest{
	private MainPage calculator;
	
	@Before 
	public void setUp(){ 
		
	}
	
	@Given("^I launch the calculator$")
	public void i_launch_the_calculator() throws Throwable {
	    calculator = new MainPage();	    
	}

	
	@When("^I press number \"([^\"]*)\"$")
	public void i_press_number(String number) throws Throwable {
		calculator.pressNumber(number);

	}

	@When("^I press key plus$")
	public void i_press_key_plus() throws Throwable {
	    calculator.pressPlus();	    
	}

	@When("^I press key equal$")
	public void i_press_key_equal() throws Throwable {
		calculator.pressEQ();	    
	}

	@When("^I press key minus$")
	public void i_press_key_minus() throws Throwable {
	    calculator.pressMinus();
	    
	}

	@Then("^The calculator will display \"([^\"]*)\"$")
	public void the_calculator_will_display(String result) throws Throwable {
	    String actualResult = calculator.verifyResult();
		    
		assertEquals("The result: " + actualResult +" is not correct. It should be: " + result + " ",
				result, actualResult);
	    
	}	
	
}
