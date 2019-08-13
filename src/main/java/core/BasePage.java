package core;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {
	
		
	public BasePage(String appPackage,String appActivity) {
		getDriver(appPackage, appActivity);
	}

	protected void click(By by) {
		getDriver().findElement(by).click();
	}
	
	protected String getText(By by) {
		return getDriver().findElement(by).getText();
	}

}
