package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepositry.Locators;
import com.utilities.CommonFunctions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Switch_Tabs {
	
	Locators loc=new Locators();
	CommonFunctions cf=new CommonFunctions();
	
	
  @Test
  public void f() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  cf.OpenTheURL("Tab_URL");
  }

  @AfterTest
  public void afterTest() {
	  cf.Close();
  }
  
}
