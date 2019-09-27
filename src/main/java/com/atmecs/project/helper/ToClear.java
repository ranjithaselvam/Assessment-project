package com.atmecs.project.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.atmecs.project.testbase.Browsers;




	/**
	 * Clear the text from the text area.
	 * @author ranjitha.selvam
	 *
	 */
	public class ToClear extends Browsers {
		public static void text(String xpath)
		{
		WebElement toClear = driver.findElement(By.xpath(xpath));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);

	}
	}


