 package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.GlobalAction;
import com.salesforce.pages.LoginPage;

public class TC005_VerifyNewTask extends ProjectSpecificMethods {
	
	@BeforeTest
    public void setValues() {
        testcaseName = "New Task Window in Global action";
        testDescription ="Verify Login functionality with positive data";
        authors="Sailesh";
        category ="Integration Testing";
        excelFileName="TestData";
        sheetName="NewTask";
	}
	
	


	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password,String subject) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickonGA()
		.clickonNewTask()
		.clickandTypeSubject(subject)
		.clickOnDate()
		.selectDate()
		.clickSearchContacts()
		.selectReqrdContact()
		.selectSearchAccount()
		.selectAccount()
		.clickOnStatus()
		.selectReqrdStatus()
		.clickOnSave();
		

	}
	}
