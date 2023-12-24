package com.eva.vtiger.genericmethods;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dev.failsafe.internal.util.Assert;

public class commonReusableMethods {

	public static GenericMethods webElemntGenObj = new GenericMethods();

	public void verifyLoginScript() {

	
		webElemntGenObj.launchedBrowser("ChromeBrowser");
		webElemntGenObj.openUrl("http://localhost:8888/");
		String verfyExpectedURL = "http://localhost:8888/";
		String verifyActualURL = webElemntGenObj.getCurrentURL();
		webElemntGenObj.verify_Act_Exp_ResultForString(verfyExpectedURL, verifyActualURL, "currentURL");
		String verfyExpectedTitle = "vtiger CRM 5 - Commercial Open Source CRM";
		String verifyActualTitle = webElemntGenObj.getTittle();
		webElemntGenObj.verify_Act_Exp_ResultForString(verfyExpectedTitle, verifyActualTitle, "title");
		boolean verfyExpectedUserNameDis = true;
		boolean verifyActualUsernameDis = webElemntGenObj.isDisplayed(By.xpath("//input[@name='user_name']"),
				"UserName");
		webElemntGenObj.verify_Act_Exp_ResultForDisplayed(verfyExpectedUserNameDis, verifyActualUsernameDis,
				"UserName Textbox Display");
		boolean verfyExpectedUsernameEnable = true;
		boolean verifyActualUserNameEnable = webElemntGenObj.isEnabled(By.xpath("//input[@name='user_name']"),
				"UserName");
		webElemntGenObj.verify_Act_Exp_ResultForDisplayed(verfyExpectedUsernameEnable, verifyActualUserNameEnable,
				"UserName Textbox Enabled");
		webElemntGenObj.clear(By.xpath("//input[@name='user_name']"), "UserName");
		webElemntGenObj.sendKeys(By.name("user_name"), "admin", "User Name");
		String verfyExpectedValueUserNameTextbox = "admi";
		String verfyActualValueUserNameTextbox = webElemntGenObj.getAttribute(By.xpath("//input[@type='text']"),
				"value", "UserName Textbox populated");
		webElemntGenObj.verify_Act_Exp_ResultForString(verfyExpectedValueUserNameTextbox,
				verfyActualValueUserNameTextbox, "username");
		boolean verfyExpectedUserPassDis = true;
		boolean verfyActualUserPassDis = webElemntGenObj.isDisplayed(By.xpath("//input[@name='user_password']"),
				"UserPassword");
		webElemntGenObj.verify_Act_Exp_ResultForDisplayed(verfyExpectedUserPassDis, verfyActualUserPassDis,
				"UserPassword Textbox Display");
		boolean verfyExpectedUserPassEnable = true;
		boolean verfyActualUserPassEnable = webElemntGenObj.isEnabled(By.xpath("//input[@name='user_password']"),
				"UserPassword");
		webElemntGenObj.verify_Act_Exp_ResultForDisplayed(verfyExpectedUserPassEnable, verfyActualUserPassEnable,
				"UserPassword Textbox Enabled");
		webElemntGenObj.clear(By.xpath("//input[@name='user_password']"), "UserPassword");
		webElemntGenObj.sendKeys(By.xpath("//input[@name='user_password']"), "admin", "UserPassword");
		String verfyExpectedValueUserPasswordTextbox = "admin";
		/*
		 * String
		 * verfyActualValueUserPasswordTextbox=webElemntGenObj.getAttribute(By.xpath(
		 * "//input[@type='password']"), "value","UserPassword Textbox Masked");
		 * webElemntGenObj.verify_Act_Exp_ResultForString(
		 * verfyExpectedValueUserPasswordTextbox,verfyActualValueUserPasswordTextbox);
		 * webElemntGenObj.selectOptionsByContains(By.xpath(
		 * "//select[@name='login_theme']"), "Color Theme", "alpha"); int
		 * verfyExpectedColorDropDownSize=4; int verfyActualColorDropDownSize
		 * =webElemntGenObj.getAllOptionsSize(By.xpath("//select[@name='login_theme']")
		 * ,"Color Theme");
		 * webElemntGenObj.Verify_Act_Exp_ResultForInt(verfyExpectedColorDropDownSize,
		 * verfyActualColorDropDownSize, "Color Theme"); List<String>ColorDropDownText=
		 * webElemntGenObj.getAllOptionsText(By.xpath("//select[@name='login_theme']"),
		 * "Color Theme"); String verfyActualColorDropDownText=null; for (int i = 0; i <
		 * ColorDropDownText.size(); i++) {
		 * verfyActualColorDropDownText=ColorDropDownText.get(i);
		 * System.out.println(verfyActualColorDropDownText); } // String[]
		 * listColorText= {"alphagrey","bluelagoon","softed","woodspice"}; // String
		 * verfyExpectedColorDropDownText=null; // for (int i = 0; i <
		 * ColorDropDownText.size(); i++) { //
		 * verfyExpectedColorDropDownText=ColorDropDownText.get(i); //
		 * System.out.println(verfyExpectedColorDropDownText); // } //
		 * webElemntGenObj.Verify_Act_Exp_ResultForString(verfyActualColorDropDownText,
		 * verfyExpectedColorDropDownText); String
		 * verfyExpectedColorDropdownOption="alphagrey"; String
		 * verfyActualColorDropdownOption=webElemntGenObj.getSelectedFirstOption(By.
		 * xpath("//select[@name='login_theme']"), "Color Theme");
		 * webElemntGenObj.verify_Act_Exp_ResultForString(
		 * verfyExpectedColorDropdownOption, verfyActualColorDropdownOption);
		 * webElemntGenObj.selectByVisibleText(By.xpath(
		 * "//select[@name='login_language']"), "US English", "Language"); String
		 * verfyExpectedLanguageDropdownOption="US English"; String
		 * verfyActualLanguageDropdownOption=webElemntGenObj.getSelectedFirstOption(By.
		 * xpath("//select[@name='login_language']"), "Language");
		 * webElemntGenObj.verify_Act_Exp_ResultForString(
		 * verfyExpectedLanguageDropdownOption, verfyActualLanguageDropdownOption);
		 * boolean verfyExpectedLoginButtonEnable=true; boolean
		 * verfyActualLoginButtonEnable=webElemntGenObj.isEnabled(By.xpath(
		 * "//input[@name='Login']"),"Login Button");
		 * webElemntGenObj.verify_Act_Exp_ResultForBoolean(
		 * verfyExpectedLoginButtonEnable, verfyActualLoginButtonEnable,
		 * "Login Buttton Enabled");
		 */
		webElemntGenObj.click(By.name("Login"), "Login Button");
//	webElemntGenObj.quite();
	}

	public void verifyHomePageScript() {

		verifyLoginScript();
		/*
		 * webElemntGenObj.launchedBrowser("ChromeBrowser");
		 * webElemntGenObj.openUrl("http://localhost:8888/"); String
		 * verfyExpectedURL="http://localhost:8888/"; String
		 * verifyActualURL=webElemntGenObj.getCurrentURL();
		 * webElemntGenObj.verify_Act_Exp_ResultForString(verfyExpectedURL,
		 * verifyActualURL); String
		 * verfyExpectedTitle="vtiger CRM 5 - Commercial Open Source CRM"; String
		 * verifyActualTitle=webElemntGenObj.getTittle();
		 * webElemntGenObj.verify_Act_Exp_ResultForString(verfyExpectedTitle,
		 * verifyActualTitle); boolean verfyExpectedUserNameDis=true; boolean
		 * verifyActualUsernameDis=webElemntGenObj.isDisplayed(By.xpath(
		 * "//input[@name='user_name']"),"UserName");
		 * webElemntGenObj.verify_Act_Exp_ResultForBoolean(verfyExpectedUserNameDis,
		 * verifyActualUsernameDis,"UserName Textbox Display"); boolean
		 * verfyExpectedUsernameEnable=true; boolean
		 * verifyActualUserNameEnable=webElemntGenObj.isEnabled(By.xpath(
		 * "//input[@name='user_name']"),"UserName");
		 * webElemntGenObj.verify_Act_Exp_ResultForBoolean(verfyExpectedUsernameEnable,
		 * verifyActualUserNameEnable,"UserName Textbox Enabled");
		 * webElemntGenObj.clear(By.xpath("//input[@name='user_name']"),"UserName");
		 * webElemntGenObj.sendKeys( By.name("user_name"),"admin","User Name"); String
		 * verfyExpectedValueUserNameTextbox="admin"; String
		 * verfyActualValueUserNameTextbox=webElemntGenObj.getAttribute(By.xpath(
		 * "//input[@type='text']"), "value","UserName Textbox populated");
		 * webElemntGenObj.verify_Act_Exp_ResultForString(
		 * verfyExpectedValueUserNameTextbox,verfyActualValueUserNameTextbox); boolean
		 * verfyExpectedUserPassDis=true; boolean
		 * verfyActualUserPassDis=webElemntGenObj.isDisplayed(By.xpath(
		 * "//input[@name='user_password']"),"UserPassword");
		 * webElemntGenObj.verify_Act_Exp_ResultForBoolean(verfyExpectedUserPassDis,
		 * verfyActualUserPassDis,"UserPassword Textbox Display"); boolean
		 * verfyExpectedUserPassEnable=true; boolean
		 * verfyActualUserPassEnable=webElemntGenObj.isEnabled(By.xpath(
		 * "//input[@name='user_password']"),"UserPassword");
		 * webElemntGenObj.verify_Act_Exp_ResultForBoolean(verfyExpectedUserPassEnable,
		 * verfyActualUserPassEnable, "UserPassword Textbox Enabled");
		 * webElemntGenObj.clear(By.xpath("//input[@name='user_password']"),
		 * "UserPassword");
		 * webElemntGenObj.sendKeys(By.xpath("//input[@name='user_password']"),
		 * "admin","UserPassword"); String
		 * verfyExpectedValueUserPasswordTextbox="admin"; String
		 * verfyActualValueUserPasswordTextbox=webElemntGenObj.getAttribute(By.xpath(
		 * "//input[@type='password']"), "value","UserPassword Textbox Masked");
		 * webElemntGenObj.verify_Act_Exp_ResultForString(
		 * verfyExpectedValueUserPasswordTextbox,verfyActualValueUserPasswordTextbox);
		 * webElemntGenObj.selectOptionsByContains(By.xpath(
		 * "//select[@name='login_theme']"), "Color Theme", "alpha"); int
		 * verfyExpectedColorDropDownSize=4; int verfyActualColorDropDownSize
		 * =webElemntGenObj.getAllOptionsSize(By.xpath("//select[@name='login_theme']")
		 * ,"Color Theme");
		 * webElemntGenObj.Verify_Act_Exp_ResultForInt(verfyExpectedColorDropDownSize,
		 * verfyActualColorDropDownSize, "Color Theme"); List<String>ColorDropDownText=
		 * webElemntGenObj.getAllOptionsText(By.xpath("//select[@name='login_theme']"),
		 * "Color Theme"); String verfyActualColorDropDownText=null; for (int i = 0; i <
		 * ColorDropDownText.size(); i++) {
		 * verfyActualColorDropDownText=ColorDropDownText.get(i);
		 * System.out.println(verfyActualColorDropDownText); } // String[]
		 * listColorText= {"alphagrey","bluelagoon","softed","woodspice"}; // String
		 * verfyExpectedColorDropDownText=null; // for (int i = 0; i <
		 * ColorDropDownText.size(); i++) { //
		 * verfyExpectedColorDropDownText=ColorDropDownText.get(i); //
		 * System.out.println(verfyExpectedColorDropDownText); // } //
		 * webElemntGenObj.Verify_Act_Exp_ResultForString(verfyActualColorDropDownText,
		 * verfyExpectedColorDropDownText); String
		 * verfyExpectedColorDropdownOption="alphagrey"; String
		 * verfyActualColorDropdownOption=webElemntGenObj.getSelectedFirstOption(By.
		 * xpath("//select[@name='login_theme']"), "Color Theme");
		 * webElemntGenObj.verify_Act_Exp_ResultForString(
		 * verfyExpectedColorDropdownOption, verfyActualColorDropdownOption);
		 * webElemntGenObj.selectByVisibleText(By.xpath(
		 * "//select[@name='login_language']"), "US English", "Language"); String
		 * verfyExpectedLanguageDropdownOption="US English"; String
		 * verfyActualLanguageDropdownOption=webElemntGenObj.getSelectedFirstOption(By.
		 * xpath("//select[@name='login_language']"), "Language");
		 * webElemntGenObj.verify_Act_Exp_ResultForString(
		 * verfyExpectedLanguageDropdownOption, verfyActualLanguageDropdownOption);
		 * boolean verfyExpectedLoginButtonEnable=true; boolean
		 * verfyActualLoginButtonEnable=webElemntGenObj.isEnabled(By.xpath(
		 * "//input[@name='Login']"),"Login Button");
		 * webElemntGenObj.verify_Act_Exp_ResultForBoolean(
		 * verfyExpectedLoginButtonEnable, verfyActualLoginButtonEnable,
		 * "Login Buttton Enabled");
		 * webElemntGenObj.click(By.name("Login"),"Login Button");
		 * webElemntGenObj.actionClickandHold(By.xpath(
		 * "//td[@class='homePageMatrixHdr']//b[contains(text(),'Quotes')]"),
		 * "Hold Account Details"); webElemntGenObj.implicitlyWait(60);
		 * webElemntGenObj.actionRelease(By.xpath(
		 * "//td[@class='homePageMatrixHdr']//b[contains(text(),'Accounts')]"),
		 * "Release Hold Account Details"); boolean
		 * verfyExpectedMarketingLinkEnable=true;
		 * webElemntGenObj.click(By.linkText("Gmail Bookmarklet"), "Gmail Book Mark ");
		 * webElemntGenObj.switchWindowToFrame(By.xpath(
		 * "//iframe[@id='__vtigerBookmarkletFrame__']"),
		 * "Gmail Book Mark Handle By Frame"); webElemntGenObj.clear(By.id("subject"),
		 * "Gmail Book Mark 'Subject'"); webElemntGenObj.sendKeys(By.id("subject"),
		 * "My Name", "Gmail Book Mark 'Subject'");
		 * webElemntGenObj.switchFrameToWindow();
		 * webElemntGenObj.click(By.xpath("//img[@title='Close Window']"),
		 * "Gmail Book Mark Frame closed"); //
		 * webElemntGenObj.click(By.linkText("Feedback"), "Feedback Link"); //
		 * webElemntGenObj.windowHandlesByURL(
		 * "https://vtiger.com/products/crm/feedback-thankyou.php"); //
		 * webElemntGenObj.click(By.xpath("//input[@value='suggestion']"),
		 * "suggestion ChekBox"); // webElemntGenObj.
		 * windowHandlesByTitle("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM"
		 * ); webElemntGenObj.scrollByjavaScript(By.xpath("//a[@target='_blank'][2]"),
		 * "Scroll Page Top to Bottom"); boolean
		 * verfyActualMarketingLinkEnable=webElemntGenObj.isEnabled(By.xpath(
		 * "//a[text()='Marketing']"), "Marketing Link");
		 * webElemntGenObj.verify_Act_Exp_ResultForBoolean(
		 * verfyExpectedMarketingLinkEnable, verfyActualMarketingLinkEnable,
		 * "Marketing Link Enabled");
		 * webElemntGenObj.mouseOverByjavaScript(By.xpath("//a[text()='Marketing']"),
		 * "MouseOver ");
		 */
		webElemntGenObj.click(By.xpath("//a[text()='Marketing']"), "Marketing link");

	}
}