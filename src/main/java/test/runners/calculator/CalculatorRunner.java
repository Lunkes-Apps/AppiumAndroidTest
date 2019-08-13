package test.runners.calculator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/features/calculator",
		glue= {"test/stepDefinitions"}
)
public class CalculatorRunner {


}
