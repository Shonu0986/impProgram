package org.demoframe.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiaddTask {

	@FindBy(xpath = "//div[@id='addTaskButtonId']/div")
	private WebElement addtadk;

	@FindBy(xpath = "//tbody/tr[1]/descendant::div[@class='dropdownButton']")
	private WebElement dropdown;

	@FindBy(xpath = "//div[@class='searchItemList']/div[contains(.,'- New Customer -')]")
	private WebElement newcus;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Name']")
	private WebElement name;

	@FindBy(xpath = "//input[@placeholder='Enter Project Name']")
	private WebElement project;

	@FindBy(xpath = "//tbody/tr[1]/td[@class='nameCell first']/input[1]")
	private WebElement task;

	@FindBy(xpath = "//tr[1]/descendant::td[@class='estimateCell']/input[1]")
	private WebElement estimate;

	@FindBy(xpath = "//tbody/tr[@id='ext-gen40']/descendant::td[2]/em[1]/button[contains(.,'set deadline')]")
	private WebElement deadLine;
	@FindBy(xpath = "//button[@id=\"ext-gen91\"]")
	private WebElement clkCalener;

	@FindBy(xpath = "//a[contains(.,'2017')]")
	private WebElement year;

	@FindBy(xpath = "//a[contains(.,'Jul')]")
	private WebElement month;

	@FindBy(xpath = "//span[contains(.,'17')]")
	private WebElement day;

	@FindBy(xpath = "//div[@class='components_button withPlusIcon']")
	private WebElement creatTask;

	/*
	 * @FindBy(xpath =
	 * "//div[@class=\"nameAndCommentsContainer clickableTask\"]/div/div/div[contains(.,'Automation')]"
	 * ) private WebElement elementText;
	 */
	public ActiaddTask(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void addTask(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(addtadk).doubleClick().build().perform();
	}

	public void dropdown() throws InterruptedException {
		Thread.sleep(3000);
		dropdown.click();
	}

	public void newCust() {

		newcus.click();

	}

	public void customerName(String userName) {

		name.sendKeys(userName);
	}

	public void projectName(String projectName) {
		project.sendKeys(projectName);
	}

	public void taskName(String tasKname) {
		task.sendKeys(tasKname);
	}

	public void estimateTime(String estiTime) {
		estimate.sendKeys(estiTime);
	}

	public void deadLineDate() {

		deadLine.click();
	}

	public void calender() {

		clkCalener.click();
	}

	public void year() {
		year.click();

	}

	public void month(WebDriver driver) {

		Actions a = new Actions(driver);
		a.moveToElement(month).doubleClick().perform();

	}

	public void day() {
		day.click();

	}

	public void creatTask() {
		creatTask.click();

	}
	/*
	 * public void textElement() {
	 * 
	 * 
	 * }
	 */

}
