package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC006_VerifyLogOut extends ProjectSpecificMethods {
	
	
	@BeforeTest
    public void setValues() {
        testcaseName = "VerifyLog Out functionality";
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
		.clickUserLogo()
		.clickOnLogout();
	}
}
