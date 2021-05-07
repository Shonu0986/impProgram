package org.demframe.genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoconstant {

	public WebDriver driver = null;
	public String browserName = null;
	public String url = null;

	@BeforeMethod
	public void openBrowser() throws Exception {

		browserName = ExcelData.readValue(excel_path, browserInfoSheet, "browsername");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(chrome_key, chrome_value);
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(chrome_key, chrome_value);
			driver = new ChromeDriver();
		} else {
			driver = null;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(To, TimeUnit.SECONDS);
		url = ExcelData.readValue(excel_path, browserInfoSheet, "URL");
		driver.get(url);

	}

	@AfterMethod
	public void CloseBrowser(ITestResult itestresult) throws Exception {
		int status = itestresult.getStatus();
		String name = itestresult.getName();
		if (status == 1) {
			Reporter.log("TestCase : " + name + " is pass", true);
		} else {
			ScreenShot.TakePic(driver, name + ssExt, screenShotFolder);
			Reporter.log("TestCase : " + name + " is fail", true);

		}
		driver.close();

	}

}
