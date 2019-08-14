package page.calendar;

import org.openqa.selenium.By;

import core.BasePage;
import utils.DateHelper;

public class MainPage extends BasePage{
	
	public MainPage() {
		super("com.google.android.calendar", "com.android.calendar.event.LaunchInfoActivity");
	}
	
	private static final String NEXT_ID = "com.google.android.calendar:id/right_arrow";
	private static final String GOTIT_ID = "com.google.android.calendar:id/done_button";
	private static final String ACTION_BUTTON_ID = "com.google.android.calendar:id/floating_action_button";
	
	public void clickOnToDay() {
		DateHelper dh = new DateHelper();
		String today = dh.getToDayWithFormatter("EEEE d MMMM yyyy");
		String desc = today + ", Open Day View";		
		click(By.xpath("//android.view.View[@content-desc=\""+ desc +"\"]"));		
	}
	
	public void clickOnNext() {
		click(By.id(NEXT_ID));
	}
	
	public void clickOnGotIt() {
		click(By.id(GOTIT_ID));
	}
	
	public void clickActionButton() {
		click(By.id(ACTION_BUTTON_ID));
	}

}
