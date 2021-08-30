package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepositry.Locators;
import com.utilities.CommonFunctions;
import com.utilities.StaticVariables;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WebTable extends StaticVariables {
	CommonFunctions cf = new CommonFunctions();
	Locators loc = new Locators();

	@Test
	public void f() throws Exception {

		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream("./src/test/resources/testdata/td.properties");
		prop.load(fi);

		cf.OpenTheURL(prop.getProperty("WebTable_URL"));
		cf.implicitwait(5000);
		cf.ClickByLocator(loc.Table_Edit);


		driver.findElement(loc.update_fname).clear();
		cf.SendkeyByAnyLocator(loc.update_fname, prop.getProperty("fname"));
		driver.findElement(loc.update_lname).clear();
		cf.SendkeyByAnyLocator(loc.update_lname, prop.getProperty("lname"));
		driver.findElement(loc.update_mdname).clear();
		cf.SendkeyByAnyLocator(loc.update_mdname, prop.getProperty("mailid"));
		cf.implicitwait(5000);
		cf.ClickByLocator(loc.update_button);
	}

	@BeforeTest
	public void beforeTest() {
		cf.ChromeBrowserLaunch();
	}

	@AfterTest
	public void afterTest() {

	}

}
