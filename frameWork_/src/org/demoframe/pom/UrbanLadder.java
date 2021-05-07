package org.demoframe.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UrbanLadder {

	@FindBy(xpath = "//a[@class='close-reveal-modal hide-mobile']")
	private WebElement close;

	@FindBy(xpath = "//ul[@class=\"topnav bodytext\"]/li[1]")
	private WebElement sale;

	@FindBy(xpath = "//ul[@class=\"topnav bodytext\"]/li")
	private WebElement all;

	public UrbanLadder(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
