package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewTask extends ProjectSpecificMethods {

	public NewTask clickandTypeSubject(String data) {
		type(locateElement(Locators.XPATH, "//input[@class='slds-combobox__input slds-input']"), data);
		reportStep("Should allow to enter text in SearchBox", "pass");
		return this;
	}

	public NewTask clickOnDate() {
		click(locateElement(Locators.XPATH, "//input[@class='slds-input']"));
		reportStep("Date Window PopUp should open", "pass");
		return this;
	}

	public NewTask selectDate() {
		click(locateElement(Locators.XPATH, "//td[@class='slds-is-today']"));
		reportStep("Should select the required date from the pop up Window", "pass");
		return this;
	}

	public NewTask clickSearchContacts() {
		click(locateElement(Locators.XPATH,
				"(//input[@class='default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup'])[1]"));
		reportStep("Should open Contacts DropDown", "pass");
		return this;
	}

	public NewTask selectReqrdContact() {
		click(locateElement(Locators.XPATH, "//div[@title='Neel Sourav']"));
		reportStep("Should select the required contacts from the dropDown", "pass");
		return this;
	}

	public NewTask selectSearchAccount() {
		click(locateElement(Locators.XPATH, "//input[@title='Search Accounts']"));
		reportStep("Should open Contacts DropDown", "pass");
		return this;
	}

	public NewTask selectAccount() throws InterruptedException {
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//div[@title='Jay']"));
		
		reportStep("Should select the required contacts from the dropDown", "pass");
		return this;
	}

	public NewTask clickOnStatus() {
		click(locateElement(Locators.XPATH, "//a[text()='Not Started']"));
		reportStep("Should click the status dropDown", "pass");
		return this;
	}

	public NewTask selectReqrdStatus() {
		click(locateElement(Locators.XPATH, "//a[@title='In Progress']"));
		reportStep("Should click the required status", "pass");
		return this;
	}

	public NewTask clickOnSave() {
		click(locateElement(Locators.XPATH,
				"//button[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton']"));
		reportStep("Should click on save button", "pass");
		return this;
	}

}
