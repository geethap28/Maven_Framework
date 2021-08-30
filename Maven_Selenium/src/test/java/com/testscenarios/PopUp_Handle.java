package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepositry.Locators;
import com.utilities.CommonFunctions;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class PopUp_Handle {

	CommonFunctions cf = new CommonFunctions();
	Locators loc = new Locators();

	@Test
	public void f() throws Exception {

		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream("./src/test/resources/testdata/td.properties");
		prop.load(fi);

		cf.OpenTheURL(prop.getProperty("Tab_URL"));
		Thread.sleep(2000);

		// cf.ClickByLocator(loc.PopUp_Button);
		cf.PopUpToNavigateWindow();
		cf.implicitwait(2000);
		cf.PopUpToCloseChildWindow();

	}

	@BeforeTest
	public void beforeTest() {
		cf.ChromeBrowserLaunch();
	}

	@AfterTest
	public void afterTest() {
		// cf.Close();
	}

}
