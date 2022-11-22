package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class GlobalAction extends ProjectSpecificMethods {
	

	
	
	public GlobalAction clickonNewEvent() throws InterruptedException {
		Thread.sleep(3000);
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='New Event']"));
		reportStep("ClickOn NewEvent should open NewEvent window", "pass");
		return this;
	}
	

	public GlobalAction clickandTypeSubject(String data) {
		type(locateElement(Locators.XPATH, "//input[@class='slds-combobox__input slds-input']"), data);
		reportStep("Should allow to enter text in SearchBox", "pass");
		return this;
	}
	
	public GlobalAction clickonCheckBox() {
		click(locateElement(Locators.XPATH, "//input[@type='checkbox']"));
		reportStep("ClickOn NewEvent should open NewEvent window", "pass");
		return this;
	}
	
	public GlobalAction selectSearchContacts() {
		click(locateElement(Locators.XPATH, "//input[@title='Search Contacts']"));
		reportStep("ClickOn NewEvent should open NewEvent window", "pass");
		return this;
	}
	
	public GlobalAction selectContact() {
		click(locateElement(Locators.XPATH, "//div[@title='Neel Sourav']"));
		reportStep("ClickOn NewEvent should open NewEvent window", "pass");
		return this;
	}
	
	
	
	public GlobalAction clickandTypeLocation(String data) {
		type(locateElement(Locators.XPATH, "//input[@class=' input']"), data);
		reportStep("Should allow to enter text in Location", "pass");
		return this;
	}
	

	public GlobalAction clickonSaveButton() {
		click(locateElement(Locators.XPATH, "//button[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton']"));
		reportStep("Should save the Entered Details", "pass");
		return this;
	}
	
	public NewTask clickonNewTask(){
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='New Task']"));
		reportStep("ClickOn NewTask should open NewEvent window", "pass");
		return new NewTask();
	}
	

}
