package com.framework.testng.api.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverLaunch {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("Java");
	//	List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		List<WebElement> linklist =driver.findElements(By.tagName("a"));

		for (int i = 0; i < linklist.size(); i++) {
			System.out.println(linklist.get(i).getText());
//
//			if (autoSuggestions.get(i).getText().contains("java online compiler")) {
//				
//				
//				autoSuggestions.get(i).click();
//				Thread.sleep(5000);
//				break;
			}
		
		System.out.println(linklist.size());
		System.out.println("Hello America remote");
		driver.close();
	}	
		
	}


