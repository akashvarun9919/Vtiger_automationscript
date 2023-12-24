package com.evs.vtiger.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.eva.vtiger.genericmethods.GenericMethods;

import com.eva.vtiger.genericmethods.commonReusableMethods;

public class MarketingAccountTestCases {
	public static GenericMethods webElemntGenObj = new GenericMethods();

	public void verifyVT001verifyAccountCreation() {
		commonReusableMethods lObj = new commonReusableMethods();
		webElemntGenObj.genrateExtentTest("verifyLoginScript");
//	    lObj.verifyLoginScript();
		lObj.verifyHomePageScript();
		boolean verfyExpectedAccountLinkEnable = true;
		boolean verfyActualAccountLinkEnable = webElemntGenObj.isEnabled(By.xpath("//a[text()='Accounts']"),
				"Account Link");
		webElemntGenObj.verify_Act_Exp_ResultForEnabled(verfyExpectedAccountLinkEnable, verfyActualAccountLinkEnable,
				"Account Link Enabled");
		webElemntGenObj.click(By.xpath("//table[@class='level2Bg']//a[text()='Accounts']"), "Accounts link");
		webElemntGenObj.printTableData(("//table[@class='lvt small']"), "Account Table");
		webElemntGenObj.getTableColumnDataListByColumnNumber("//table[@class='lvt small']", 3, "Account");
//		webElemntGenObj.getTableColumnSizeCout("//table[@class='lvt small']//td[@class='lvtCol']", "Coulmn Size");
//		webElemntGenObj.getTableRowSizeCout("//input[@name='selected_id']", "Marketing Account Row Count");//tr[@class='lvtColData']//td//input[@type='checkbox']
//		webElemntGenObj.checkAllCheckBoxes("//input[@name='selected_id']", "Marketing Account");
//		webElemntGenObj.click(By.xpath("//img[@title='Create Account...']"),"Plus Icon Img");
//		webElemntGenObj.sendKeys(By.xpath("//input[@name='accountname']"), "Satish Kumar","AccountName");
//		webElemntGenObj.sendKeys(By.xpath("//input[@name='website']"), "www.myvtiger.com","website");
//		webElemntGenObj.click(By.xpath("//input[@value='T']"),"Group Checkbox");
//		webElemntGenObj.sendKeys(By.xpath("//input[@id='email1']"), "saileshkumar01@gmail.com","Email ID");
//		webElemntGenObj.sendKeys(By.xpath("//textarea[@name='bill_street']"), "Jaunpur-Bhagalpur","Bill Street");
//		webElemntGenObj.sendKeys(By.xpath("//input[@name='bill_country']"), "Kenya","Bill Country");
//		webElemntGenObj.click(
//				By.xpath("//textarea[@name='description']/ancestor::tr/following-sibling::tr//input[@title='Save [Alt+S]']"),"Save Buttton");
//		webElemntGenObj.quite();
	}

	public void verifyVT002verifyEditAccount() throws InterruptedException {

	}

	public void verifyVT003verifyDuplicateAccount() {

	}

	public void verifyVT004verifyImportAccount() {

	}

	public void verifyVT005verifyExportAccount() {

	}

	public void verifyVT006verifySearchAccount() {

	}

	public void verifyVT006verifyDeleteAccount() {

	}
}
