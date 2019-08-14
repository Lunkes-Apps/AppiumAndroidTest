package core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> getDriver(String appPackage, String appActivity){
		if (driver == null) {
			createDriver(appPackage, appActivity);
		}
		return driver;
	}
	
	public static AndroidDriver<MobileElement> getDriver(){
		return driver;
	}
	
	
	private static void createDriver(String appPackage, String appActivity) {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", appPackage);
		desiredCapabilities.setCapability("appActivity", appActivity);
		desiredCapabilities.setCapability("noReset", "true");
		desiredCapabilities.setCapability("fullReset", "false");
		URL remoteUrl;
		try {
			remoteUrl = new URL("http://localhost:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public static void killDriver() {
		if(driver !=null) {
			driver.quit();
			driver = null;
		}
	}
}
