package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectrepositry.Locators;
import com.utilities.CommonFunctions;
import com.utilities.StaticVariables;

public class Zonal_Test extends StaticVariables {

	CommonFunctions cf = new CommonFunctions();
	Locators zonLoc = new Locators();

	@Test
	public void zonal() throws Exception {

		cf.ChromeBrowserLaunch();
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/td.properties");
		Properties prop = new Properties();
		prop.load(fis);

		cf.OpenTheURL(prop.getProperty("Zonal_URL"));

		// move on iframes

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		// driver.switchTo().frame(driver.findElement(By.linkText("P-24Alist")));
		cf.ClickByLocator(zonLoc.ZONAL_BUTTON);
		Thread.sleep(2000);
		cf.TakeScreenShot("Zonal_Test");

	}
}
