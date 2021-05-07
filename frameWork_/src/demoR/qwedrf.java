package demoR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class qwedrf {

	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotpassword;

	@FindBy(xpath = "//a[@class='content tt']")
	private WebElement timeTrack;

	@FindBy(xpath = "//div[@id='addTaskButtonId']")
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

	
	
	
	
	
	
	
	public void timetrack() {
		timeTrack.click();
	}

	public void addTask(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Actions a= new Actions(driver);
		a.moveToElement(addtadk).doubleClick().build().perform();
		}

	public void dropdown() throws InterruptedException {
		//Thread.sleep(3000);
		dropdown.click();
	}

	public void newCust() {

		newcus.click();

	}

	public void customerName() {

		name.sendKeys("SonuKr");
	}

	public void projectName() {
		project.sendKeys("automation");
	}

	public void taskName() {
		task.sendKeys("Finding_Nimo");
	}

	public void estimateTime() {
		estimate.sendKeys("48");
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

	public void forgetpassClick() {
		forgotpassword.click();
	}

}