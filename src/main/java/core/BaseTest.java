package core;

import static core.DriverFactory.killDriver;
import static core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.AfterClass;



public class BaseTest {
	
	@AfterClass
	public static void finish() {
		killDriver();
	}

	@After
	public void tearDown() {
//		screenShot();
		getDriver().resetApp();
	}

}
