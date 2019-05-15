package Library;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ObjectMap.ObjectMap;

public class Base {
	
	public static WebDriver driver;
	public static Library myLib;
	public static ObjectMap objmap;
	public static String workingDir = System.getProperty("user.dir");
	public static ObjectMap map = new ObjectMap(workingDir + "\\objectpropertiesfile\\objectmap.properties");
	
	@BeforeMethod
	public void beforeEachTest() {
		myLib = new Library(driver);	
		driver = myLib.startChromeBrowser();
		//driver = myLib.startFirefoxBrowser();
		//driver = myLib.startIEBrowser();	

	}

	@AfterMethod
	public void afterEachTest(ITestResult result) {
//		if(ITestResult.FAILURE == result.getStatus())
//		{
//			myLib.captureScreenshot(result.getTestName(), "target/screenshots/");
//		}
		myLib.customWait(5);
		if (driver != null) {
			driver.quit();
		}
	}

}
