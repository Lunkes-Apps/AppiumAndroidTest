package core;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {
	
	private String appPackage;
	private String appActivity;
	private static AndroidDriver<MobileElement> driver;
	
	public BasePage(String appPackage,String appActivity) {
		this.driver = DriverFactory.getDriver(appPackage, appActivity);
	}

	

}
