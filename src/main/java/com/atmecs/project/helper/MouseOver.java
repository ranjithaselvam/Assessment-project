package com.atmecs.project.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void move(WebDriver driver,String xpath)
	{
		WebElement findElement = driver.findElement(By.xpath(xpath));
		Actions action=new Actions(driver);
		action.moveToElement(findElement).perform();
			
	}
	public static void click(WebDriver driver,String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	

}
