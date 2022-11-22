package com.salesforce.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncher extends ProjectSpecificMethods {
	

	
	public  AppLauncher getLinkText() {
		List<WebElement> allLinks = locateElements(Locators.TAGNAME, "a");
		for (int i = 0; i <allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
			
		}
		System.out.println("=============================================");
		System.out.println(allLinks.size());
		return this;
		
		
		
	}
	
	public AppLauncher closeWindow() throws InterruptedException {
		Thread.sleep(3000);
		click(Locators.XPATH, "//span[text()='Close this window']");
		return this;
	}

	

	
	
	

}
