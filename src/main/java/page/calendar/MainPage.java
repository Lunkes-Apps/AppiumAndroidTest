package page.calendar;

import core.BasePage;
import utils.DateHelper;

public class MainPage extends BasePage{
	
	public MainPage() {
		super("com.google.android.calendar", ".ICalLauncher");
	}
	
	private static final String TODAY_ID = "";
	
	public void clickOnToDay() {
		DateHelper dh = new DateHelper();
		String today = dh.getToDayWithFormatter("%A");
		System.out.print(today);
	}
	

}
