package org.demoframe.testPom;

import java.util.concurrent.TimeUnit;

import org.demframe.genric.BaseTest;
import org.demframe.genric.ExcelData;
import org.demoframe.pom.ActiaddTask;
import org.demoframe.pom.ActitimeHome;
import org.demoframe.pom.ActitimeLogin;
import org.testng.annotations.Test;

public class TestActitimeLogin extends BaseTest {
	@Test
	public void validLogin() throws Exception {
		String user = ExcelData.readCell(excel_path, loginparameter, 1, 0);
		String pass = ExcelData.readCell(excel_path, loginparameter, 1, 1);
		driver.manage().timeouts().implicitlyWait(To, TimeUnit.SECONDS);
		ActitimeLogin atl = new ActitimeLogin(driver);
		atl.sendUsername(user);
		atl.sendPassword(pass);
		atl.clicklogin();

		// atl.timetrack();

		ActitimeHome ah = new ActitimeHome(driver);
		ah.varifyHpIsDisplayed(driver, "Enter", To);

		ActiaddTask ad1 = new ActiaddTask(driver);
		ad1.addTask(driver);
		ad1.dropdown();
		ad1.newCust();

		String userName = ExcelData.readCell(excel_path, userNameparameter, 1, 0);
		ad1.customerName(userName);

		String projectName = ExcelData.readCell(excel_path, userNameparameter, 1, 1);
		ad1.projectName(projectName);

		String tasKname = ExcelData.readCell(excel_path, taskParameter, 2, 0);
		ad1.taskName(tasKname);

		String estiTime = ExcelData.readCell(excel_path, taskParameter, 2, 1);
		ad1.estimateTime(estiTime);

		ad1.deadLineDate();
		ad1.calender();
		ad1.year();
		ad1.month(driver);
		ad1.day();
		ad1.creatTask();
		// ad1.textElement();
	}
}