package com.evs.vtiger.runner;

import com.evs.vtiger.testscript.MarketingLeadsTestCases;

public class TestRunnerMarketing_Leads {

	public static void main(String[] args) {
		MarketingLeadsTestCases mLTCObj= new MarketingLeadsTestCases();
		mLTCObj.verifyVT001verifyLoginPage();
		mLTCObj.verifyVT002verifyHomePage();
		mLTCObj.verifyVT003verifyMarketingPage();
		mLTCObj.verifyVT004verifyLeadPage();
		mLTCObj.verifyVT005verifyPlusIcon();
		mLTCObj.verifyVT006verifyLeadAccountCreationPage();
		mLTCObj.verifyVT007verifyLeadAccountEditPage();
		mLTCObj.verifyVT008verifyLeadAccountDuplicatePage();
		mLTCObj.verifyVT009verifyFileImportInLeadAccount();
		mLTCObj.verifyVT010verifyLeadAccountFileExport();
		mLTCObj.verifyVT011verifyLeadAccountDelete();
		
		
		
		
		
		
		
	}

}
