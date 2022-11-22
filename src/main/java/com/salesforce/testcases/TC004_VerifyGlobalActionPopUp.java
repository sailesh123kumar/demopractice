package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.GlobalAction;
import com.salesforce.pages.LoginPage;

public class TC004_VerifyGlobalActionPopUp extends ProjectSpecificMethods {
	
	@BeforeTest
    public void setValues() {
        testcaseName = "Global Action Popup Window";
        testDescription ="Verify Login functionality with positive data";
        authors="Sailesh";
        category ="Integration Testing";
        excelFileName="TestData";
        sheetName="NewEvent";
	}
	
	


	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password,String subject, String location) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickonGA()
		.clickonNewEvent()
		.clickandTypeSubject(subject)
		.clickonCheckBox()
		.selectSearchContacts()
		.clickandTypeLocation(location)
		.clickonSaveButton();

	}
	}
