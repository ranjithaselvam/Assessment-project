package com.atmecs.project.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
/**
 * To verify the page title(get title of the page).
 * @author ranjitha.selvam
 *
 */
public class PageGetTitle {
	public static String title(WebDriver driver,String xpath)
	{
		WebElement findElement = driver.findElement(By.xpath(xpath));
		String text = findElement.getText();
		System.out.println("Title :"+text);
		return text;
	}

}
