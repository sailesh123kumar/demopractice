package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='Home']"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}

	public HomePage clickAppLauncher() {
		click(Locators.XPATH, "//div[@class='slds-icon-waffle']");
		reportStep("ClickOnAppLauncher", "pass");
		return this;
	}

	public AppLauncher clickOnViewAll() throws InterruptedException {
		Thread.sleep(5000);
		click(Locators.XPATH, "//div[@class='slds-icon-waffle']");
		Thread.sleep(5000);
		reportStep("AppLauncherPage is Loaded", "pass");
		return new AppLauncher();
		

	}

	public GlobalAction clickonGA() throws InterruptedException {
		Thread.sleep(5000);

		clickUsingJs(locateElement(Locators.XPATH, "//div[@class='headerTrigger  tooltip-trigger uiTooltip']"));

		reportStep("GlobalAction PopUp window is open", "pass");
		return new GlobalAction();
	}

	public HomePage clickUserLogo() {
		click(Locators.XPATH, "//span[@class='uiImage']");
		reportStep("UserLogo", "pass");
		return this;
	}

	public HomePage clickOnLogout() {
		click(Locators.XPATH, "//a[text()='Log Out']");
		reportStep("User should be looged off", "pass");
		return this;
	}

}
