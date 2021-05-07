package org.demframe.genric;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void TakePic(WebDriver driver, String name,String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		// File screenShotSave = new File(".//"+name+".png");
		
		File screenShotSave = new File(path+name);

		Files.copy(screenshot, screenShotSave);

	}

}
