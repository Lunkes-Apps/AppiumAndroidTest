package test.stepDefinitions.calendar;


import core.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.calendar.MainPage;

public class StepsCalendarTest extends BaseTest{
	private MainPage calendar;
	
	@Given("^I launch the calendar$")
	public void i_launch_the_calendar() throws Throwable {
	   calendar = new MainPage();
	   
	}

	@When("^I press in today number$")
	public void i_press_in_today_number() throws Throwable {
	  calendar.clickOnToDay();	   
	}

	@When("^I press in event empty area$")
	public void i_press_in_event_empty_area() throws Throwable {
	   
	   
	}

	@When("^I press in new event$")
	public void i_press_in_new_event() throws Throwable {
	   
	   
	}

	@When("^I fill out the title of event$")
	public void i_fill_out_the_title_of_event() throws Throwable {
	   
	   
	}

	@When("^I press done$")
	public void i_press_done() throws Throwable {
	   
	   
	}

	@When("^I press save$")
	public void i_press_save() throws Throwable {
	   
	   
	}

	@Then("^The title should be displayed in event area$")
	public void the_title_should_be_displayed_in_event_area() throws Throwable {
	   
	   
	}

	@Then("^The title shoudl be displayed in main page$")
	public void the_title_shoudl_be_displayed_in_main_page() throws Throwable {
	   
	   
	}


}
