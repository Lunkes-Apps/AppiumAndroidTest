package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import org.junit.AfterClass;

import cucumber.api.java.After;





public class BaseTest {
	
	@AfterClass
	public static void finish() {
		System.out.print("After Class\n");
		killDriver();
	}

//	@After
//	public void tearDown() {
//		System.out.print("After\n");
////		screenShot();
//		getDriver().resetApp();
//	}

}
