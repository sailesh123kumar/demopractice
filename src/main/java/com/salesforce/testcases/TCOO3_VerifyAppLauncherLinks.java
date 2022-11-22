package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TCOO3_VerifyAppLauncherLinks extends ProjectSpecificMethods {
	
	@BeforeTest
    public void setValues() {
        testcaseName = "AppLauncher Links";
        testDescription ="Verify Login functionality with positive data";
        authors="Sailesh";
        category ="Integration Testing";
        excelFileName="TestData";
        sheetName="LogIn";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickAppLauncher()
		.clickOnViewAll()
		.getLinkText()
		.closeWindow();


}
}
