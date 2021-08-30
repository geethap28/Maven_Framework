package com.testscenarios;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.objectrepositry.Locators;
import com.utilities.CommonFunctions;
import com.utilities.StaticVariables;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login extends StaticVariables {


	@Test
	public void fb() throws Exception {

		CommonFunctions cf = new CommonFunctions();
		cf.ChromeBrowserLaunch();

		FileInputStream fi = new FileInputStream("./src/test/resources/testdata//fb.properties");
		Properties prop = new Properties();
		prop.load(fi);

		Locators fbLoc = new Locators();

		driver.get(prop.getProperty("fb_URL"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.findElement(fbLoc.FB_EMAIL_EDITBOX).sendKeys(prop.getProperty("email"));
//		driver.findElement(fbLoc.FB_PASS_EDITBOX).sendKeys(prop.getProperty("pass"));
//		driver.findElement(fbLoc.FB_LOGIN_EDITBOX).click();
		
		cf.SendkeyByAnyLocator(fbLoc.FB_EMAIL_EDITBOX, prop.getProperty("email"));
		cf.SendkeyByAnyLocator(fbLoc.FB_PASS_EDITBOX, prop.getProperty("pass"));
		cf.ClickByLocator(fbLoc.FB_LOGIN_EDITBOX);
	
	}


}
