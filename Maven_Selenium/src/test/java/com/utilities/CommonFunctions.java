package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions extends StaticVariables {

	public void ChromeBrowserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// URL

	public void OpenTheURL(String URL) {
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		implicitwait(25);
	}

	// Implicit Wait

	public void implicitwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	//Quit the window
	public void Close() {
		driver.close();
	}
	
	
	// Checking EditBox is enabled & Editable

	public void SendkeyByAnyLocator(By locator, String inputData) {

		WebElement ele = driver.findElement(locator);
		System.out.println("*****For Editbox ******");
		if (ele.isDisplayed() && ele.isEnabled()) {
			ele.clear();
			ele.sendKeys(inputData);
		} else {
			System.out.println("Element is in disable state");
		}
	}
	
	
	//KeyBoard Keys :
	
	public void clearTexts(By Locator) {
		WebElement clear=driver.findElement(Locator);
		System.out.println("*****For Clear Text*****");
	if(clear.isDisplayed() && clear.isEnabled()) {
		clear.sendKeys(Keys.CONTROL+"a");
		clear.sendKeys(Keys.DELETE);
	}
		 else {
System.out.println("Element is in disable state");
	}
	}
	

	// Click button

	public void ClickByLocator(By locator) {
		WebElement eleClk = driver.findElement(locator);
		System.out.println("******For Click Button******");
		if (eleClk.isDisplayed() && eleClk.isEnabled()) {
			eleClk.click();
		} else {
			System.out.println("Click button is in disable state ");
		}
	}

	// College_Live Checkbox

	public void SelectByLocator(By locator) {

		WebElement eleChkBox = driver.findElement(locator);
		System.out.println("*****For checkbox******");
		if (eleChkBox.isDisplayed() && eleChkBox.isEnabled()) {
			eleChkBox.click();

		} else {
			System.out.println("Element Checkbox is in disable state");
		}
	}

	// College_LIve _Select_Dropdown
	public void SelectKeysByLocator(By Locator, String inputData) {

		WebElement eledropDown = driver.findElement(Locator);
		System.out.println("*****For Dropdown******");
		if (eledropDown.isDisplayed() && eledropDown.isEnabled()) {
			eledropDown.sendKeys(inputData);
		} else {
			System.out.println("Element is in disable state");
		}
	}

	// For Date

	public String timeStamp() {
		Date d = new Date();
		System.out.println("Today's Date :" + d);

		DateFormat df = new SimpleDateFormat("DD-MM-YYYY");
		String timestamp = df.format(d);
		return timestamp;
	}

	// For Screenshot

	public void TakeScreenShot(String filename) throws Exception {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("./src/test/resources/screenshots"+"_"+ filename + timeStamp() + ".JPEG"));

	}

	//PopUp Handles : 
	
	public void PopUpToCloseChildWindow() throws Exception {
		
		//Get MainWindow :
		
		String mainWindow=driver.getWindowHandle();
		System.out.println("Parent Window : "+ mainWindow);
		
		//Get Child Window:
		
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println("Child Windows : "+ allWindows);
		
		//Close PopUp : 
		
		for(String tab : allWindows)
		if (!mainWindow.equals(tab)) {
			driver.switchTo().window(tab);
			Thread.sleep(2000);
		} else {
             driver.close();
		}
		driver.switchTo().window(mainWindow);
	}
	
	
	//PopUp To Navigate Child Window
	
	public void PopUpToNavigateWindow() throws Exception {
		
		String mainWindow=driver.getWindowHandle();
		System.out.println("parent window is :"+ mainWindow);
		
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println("Child Windows is :" + allWindows);
		
		for (String popup : allWindows) {
			if(!mainWindow.equals(allWindows)) {
				driver.switchTo().window(popup);
			}
				driver.switchTo().window(mainWindow);
				Thread.sleep(2000);
			}
		}

	

	//SwitchToTab Details :
	
	public void SwitchToNewTAb() throws Exception {
		
		String CurrentHandle=driver.getWindowHandle();
		System.out.println("Parent window : "+ CurrentHandle);
		
		Set<String> AllHAndles=driver.getWindowHandles();
		System.out.println("Child Window :"+ AllHAndles);
		
		for (String abc : AllHAndles) {
		if (!CurrentHandle.equals(AllHAndles)) {
			driver.switchTo().window(abc);			
		}
		driver.switchTo().window(CurrentHandle);
		Thread.sleep(2000);
		}
	}	
	
	//Action Methods :
	
	public void moveToOneElement(By Locator) {
		try {
		WebElement ele=driver.findElement(Locator);
		Actions act=new Actions(driver);
		act.clickAndHold(ele).build().perform();
		}
		catch (Exception e) {
			System.out.println("Error in description"); 
		}	
	}
	

	
	};
	
	
	
	
	

