package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepositry.Locators;
import com.utilities.CommonFunctions;
import com.utilities.StaticVariables;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Apple_Vacations extends StaticVariables {

	Locators loc = new Locators();
	CommonFunctions comFun = new CommonFunctions();

	@Test
	public void f() throws Exception {

		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream("./src/test/resources/testdata/td.properties");
		prop.load(fi);
		
		comFun.OpenTheURL(prop.getProperty("Vacation_URL"));
		comFun.moveToOneElement(loc.Vacation_Source);
		
		
		
		
		
		
		
		comFun.ClickByLocator(loc.Vacation_Search);

	}

	@BeforeTest
	public void beforeTest() {
		comFun.ChromeBrowserLaunch();

	}

	@AfterTest
	public void afterTest() {
		comFun.Close();
	}

}
