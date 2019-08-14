package test.runners.calendar;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/features/calendar",
		glue= {"test/stepDefinitions"}
)
public class CalendarRunner {

}
