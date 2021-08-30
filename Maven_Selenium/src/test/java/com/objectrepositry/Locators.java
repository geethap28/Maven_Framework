package com.objectrepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators {

	// FB Locators
	
	public final By FB_EMAIL_EDITBOX = By.id("email");
	public final By FB_PASS_EDITBOX = By.id("pass");
	public final By FB_LOGIN_EDITBOX = By.name("login");

	// TTD Locators
	
	public final By TTD_FN_EDITBOX = By.name("fName");
	public final By TTD_LN_EDITBOX = By.name("lName");
	public final By TTD_MOBNO_EDITBOX = By.name("mobNo");
	public final By TTD_DOB_EDITBOX = By.id("regdob");
	public final By TTD_ADD1_EDITBOX = By.name("address1");
	public final By TTD_ADD2_EDITBOX = By.name("address2");
	public final By TTD_CITY_EDITBOX = By.name("cityS");
	public final By TTD_CONTRY_EDITBOX = By.name("countryS");
	public final By TTD_ST_EDITBOX = By.name("stateS");
	public final By TTD_ZC_EDITBOX = By.name("zipCode");
	public final By TTD_PF_EDITBOX = By.name("proofS");
	public final By TTD_PFID_EDITBOX = By.name("proofId");
	public final By TTD_EMID_EDITBOX = By.name("emailId");
	public final By TTD_PWD_EDITBOX = By.name("password");
	public final By TTD_RPWD_EDITBOX = By.name("repassword");
	public final By TTD_CONBTN_EDITBOX = By.id("regi_continue");

//College_Locators

	public final By CLG_FSTNAME_EDITBOX = By.id("firstName");
	public final By CLG_LSTNAME_EDITBOX = By.id("lastName");
	public final By CLG_EMAILID_EDITBOX = By.id("emailAddress");
	public final By CLG_PWD_EDITBOX = By.id("password");
	public final By CLG_CONPWD_EDITBOX = By.id("ConfirmPassword");
	public final By CLG_PHNO_EDITBOX = By.id("phoneNumber");

	public final By CLG_MNTH_DROPDOWN = By.id("questions_16_Month");
	public final By CLG_DAY_DROPDOWN = By.id("questions_16_DayOfMonth");
	public final By CLG_YEAR_DROPDOWN = By.id("questions_16_DOBYear");

	public final By CLG_COUN_DROPDOWN = By.id("country");
	public final By CLG_ATDTYPE_DROPDOWN = By.name("attendeeType");
	public final By CLG_TERM_DROPDOWN = By.id("questions[q_134]");

	public final By CLG_MOJINT_DROPDOWN = By.xpath("//*[@id=\"questions[q_19]\"]/div[1]");
	public final By CLG_MOJINTBOX_DROPDOWN = By.xpath("//*[@id=\"questions[q_19]\"]/div[2]/div[2]/label");
	public final By CLG_QUE1_CHECKBOX = By.id("questions[q_135]");
	public final By CLG_QUE2_CHECKBOX = By.id("questions[q_136]");
	public final By CLG_QUE3_CHECKBOX = By.id("questions[q_137]");
	public final By CLG_SUBMIT_EDITBOX = By.id("submit");
	
	
	//Zonal Locators
	
	public final By ZONAL_BUTTON=By.name("P-24Alist");
	
	//PopUp_ Handles :
	
	public final By PopUp_Button=By.xpath("//button[contains(text(),'Click to open new Window')]");
	
	
	//Vacations 
	
	
	public final By Vacation_Source=By.xpath("//input[@id='orgAC_value']");
	public final By Vacation_Destination=By.xpath("//input[@id='desAC_value']");
	public final By Vacation_Date_From=By.id("depDT_value");
	public final By Vacation_Date_to=By.id("datepicker-3084-7673-title");
	public final By Vacation_Search=By.id("scc_rt_submit");
	
	
	
	
	
	//WebTable
	
	public final By Table_Edit=By.xpath("//tbody/tr[@id='d2']/td[5]/button[1]");
	public final By update_fname=By.id("fn");
	public final By update_lname=By.id("ln");
	public final By update_mdname=By.id("mn");
	public final By update_button=By.id("up");
	
	

}