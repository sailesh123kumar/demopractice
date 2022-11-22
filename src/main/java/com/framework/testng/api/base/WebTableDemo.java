package com.framework.testng.api.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/");
		
		//2nd column = table[@id='table01']//tbody//tr//td[2]
		//header =//table[@id='table01']//tr
		
//		List<WebElement> row = driver.findElements(By.xpath("//table[@id='table01']//tr"));
//		System.out.println("No of rows" + row.size());
//		for (int i = 0; i < row.size(); i++) {
//			String text = row.get(i).getText();
//			System.out.println(text);
//		}
		List<WebElement> heading = driver.findElements(By.xpath("//table[@id='table01']//th"));
		System.out.println(heading.get(1).getText());
		driver.close();
		

	}

}
