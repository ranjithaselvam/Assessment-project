package com.atmecs.project.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Easy to choose or select an option given under any drop downs.
 * @author ranjitha.selvam
 *
 */
public class DropDown {
	static WebDriver driver;
	public static void select(String xpath,String values)
	{
		WebElement selectElement = driver.findElement(By.xpath(xpath));
		Select select=new Select(selectElement);
		select.selectByValue(values);
	}
	public static void selectIndex(String xpath,int values)
	{
		WebElement selectElement = driver.findElement(By.xpath(xpath));
		Select select=new Select(selectElement);
		select.selectByIndex(values);
	}

	public static void selectVisibleText(String xpath,String values)
	{
		WebElement selectElement = driver.findElement(By.xpath(xpath));
		Select select=new Select(selectElement);
		select.deselectByVisibleText(values);
	}


	

}




























