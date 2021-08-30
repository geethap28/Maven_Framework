package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.objectrepositry.Locators;
import com.utilities.CommonFunctions;
import com.utilities.StaticVariables;

public class College_week_Live extends StaticVariables {
	
	CommonFunctions comFun = new CommonFunctions();
	Locators colLoc = new Locators();
	
	@Test // 5
	public void f() throws Exception {

		FileInputStream fi = new FileInputStream("./src/test/resources/testdata/collgtd.properties");
		Properties prop = new Properties();
		prop.load(fi);

		driver.get(prop.getProperty("ClgURL"));
		driver.manage().window().maximize();
		Thread.sleep(2000);

		comFun.SendkeyByAnyLocator(colLoc.CLG_FSTNAME_EDITBOX, prop.getProperty("FstName"));
		comFun.SendkeyByAnyLocator(colLoc.CLG_LSTNAME_EDITBOX, prop.getProperty("LstName"));
		comFun.SendkeyByAnyLocator(colLoc.CLG_EMAILID_EDITBOX, prop.getProperty("Emailid"));
		comFun.SendkeyByAnyLocator(colLoc.CLG_PWD_EDITBOX, prop.getProperty("Pswd"));
		comFun.SendkeyByAnyLocator(colLoc.CLG_CONPWD_EDITBOX, prop.getProperty("ConPwd"));
		comFun.SendkeyByAnyLocator(colLoc.CLG_PHNO_EDITBOX, prop.getProperty("PhNum"));

		comFun.SelectKeysByLocator(colLoc.CLG_COUN_DROPDOWN, prop.getProperty("Country"));
		comFun.SelectKeysByLocator(colLoc.CLG_ATDTYPE_DROPDOWN, prop.getProperty("AttnType"));
		comFun.SelectKeysByLocator(colLoc.CLG_TERM_DROPDOWN, prop.getProperty("TermStart"));
		
		comFun.SelectKeysByLocator(colLoc.CLG_MNTH_DROPDOWN, prop.getProperty("Month"));
		comFun.SelectKeysByLocator(colLoc.CLG_DAY_DROPDOWN, prop.getProperty("Day"));
		comFun.SelectKeysByLocator(colLoc.CLG_YEAR_DROPDOWN, prop.getProperty("Year"));
		
		comFun.ClickByLocator(colLoc.CLG_MOJINT_DROPDOWN);
		comFun.SelectKeysByLocator(colLoc.CLG_MOJINTBOX_DROPDOWN, prop.getProperty("MofInt"));	
		

		comFun.SelectByLocator(colLoc.CLG_QUE1_CHECKBOX);
		comFun.SelectByLocator(colLoc.CLG_QUE2_CHECKBOX);
		comFun.SelectByLocator(colLoc.CLG_QUE3_CHECKBOX);

		comFun.ClickByLocator(colLoc.CLG_SUBMIT_EDITBOX);

	}


	@BeforeSuite // 1
	public void beforeSuite() throws IOException, Exception {

		comFun.ChromeBrowserLaunch();
	}

	@AfterSuite // 9
	public void afterSuite() {
		

	}

}
