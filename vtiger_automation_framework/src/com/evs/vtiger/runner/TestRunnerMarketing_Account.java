package com.evs.vtiger.runner;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.eva.vtiger.genericmethods.GenericMethods;
import com.evs.vtiger.testscript.MarketingAccountTestCases;

public class TestRunnerMarketing_Account {

	public static void main(String[] args) throws InterruptedException {
		GenericMethods gM=  new GenericMethods();
		gM.genrateExtentReport();
		MarketingAccountTestCases mATCObj= new MarketingAccountTestCases();
		mATCObj.verifyVT001verifyAccountCreation();
		
//		mATCObj.verifyVT002verifyEditAccount();
//		mATCObj.verifyVT003verifyDuplicateAccount();
//		mATCObj.verifyVT004verifyImportAccount();
//		mATCObj.verifyVT005verifyExportAccount();
//		mATCObj.verifyVT006verifySearchAccount();
		gM.flushReport();
		
	}

}
