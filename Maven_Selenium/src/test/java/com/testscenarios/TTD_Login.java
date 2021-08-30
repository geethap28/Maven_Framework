package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.objectrepositry.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TTD_Login {

	@Test
	public void ttdlogin() throws Exception {

		WebDriver driver;
		Locators loc=new Locators();
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		FileInputStream fi = new FileInputStream("./src/test/resources/testdata/td.properties");
		Properties prop = new Properties();
		prop.load(fi);

		driver.get(prop.getProperty("Ttd_URL"));
		driver.findElement(loc.TTD_FN_EDITBOX).sendKeys(prop.getProperty("fstName"));
		driver.findElement(loc.TTD_LN_EDITBOX).sendKeys(prop.getProperty("lstName"));
		driver.findElement(loc.TTD_MOBNO_EDITBOX).sendKeys(prop.getProperty("mobileNo"));
		driver.findElement(loc.TTD_DOB_EDITBOX).click();
		
		Select month = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		month.selectByVisibleText("December");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
		year.selectByVisibleText("1992");		
		driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();
		
		WebElement gender = driver.findElement(By.xpath("(//input[@name='gender'])[2]"));
		gender.click();
		
		driver.findElement(loc.TTD_ADD1_EDITBOX).sendKeys(prop.getProperty("address_1"));
		driver.findElement(loc.TTD_ADD2_EDITBOX).sendKeys(prop.getProperty("address_2"));
		driver.findElement(loc.TTD_CITY_EDITBOX).sendKeys(prop.getProperty("city_S"));
		
		Select country = new Select(driver.findElement(loc.TTD_CONTRY_EDITBOX));
		country.selectByVisibleText("India");
		
		Select state = new Select(driver.findElement(loc.TTD_ST_EDITBOX));
		state.selectByVisibleText("Andhra Pradesh");
		
		driver.findElement(loc.TTD_ZC_EDITBOX).sendKeys("tzipCode");
		
		Select idproof = new Select(driver.findElement(loc.TTD_PF_EDITBOX));
		idproof.selectByVisibleText("Aadhaar Card");
		
		driver.findElement(loc.TTD_PFID_EDITBOX).sendKeys(prop.getProperty("iproofId"));
		driver.findElement(loc.TTD_EMID_EDITBOX).sendKeys(prop.getProperty("email_Id"));
		driver.findElement(loc.TTD_PWD_EDITBOX).sendKeys(prop.getProperty("password"));
		driver.findElement(loc.TTD_RPWD_EDITBOX).sendKeys(prop.getProperty("re_password"));
		driver.findElement(loc.TTD_CONBTN_EDITBOX).click();

		String alertmsg = driver.findElement(By.xpath("//*[@id=\"ErrorMessagePopUp\"]/div[1]/div/div/div[1]"))
				.getText();
		System.out.println(alertmsg);

	}

}
