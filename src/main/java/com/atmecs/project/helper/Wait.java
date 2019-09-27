package com.atmecs.project.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.project.constants.Constants;


	/**
	 * Wait for some time to load the element and execute at different interval time.
	 * @author ranjitha.selvam
	 *
	 */
	public class Wait {
		public static void explicitWait(WebDriver driver,String xpath)
		{
			WebDriverWait wait=new WebDriverWait(driver, Constants.page_load_timeout);
			WebElement element;
			element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			element.click();
			}
		public static void implicitWait(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Constants.page_load_timeout, TimeUnit.SECONDS);
		}
		}




