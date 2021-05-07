package org.demoframe.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class ActitimeHome {
	public void varifyHpIsDisplayed(WebDriver driver, String title, long timeout) {
		WebDriverWait ww = new WebDriverWait(driver, timeout);
	
		if (ww.until(ExpectedConditions.titleContains(title)))
			Reporter.log("home page is displayed");
		else {
			Reporter.log("home page is not  displayed");
			Assert.fail();
		}
	}

	public ActitimeHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}