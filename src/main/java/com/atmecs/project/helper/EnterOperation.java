package com.atmecs.project.helper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Clicks at the current mouse location(Mouse action).
 * @author ranjitha.selvam
 *
 */
public class EnterOperation {
	static WebDriver driver;
	

	public static void pressEnter() {
		Actions action;
		action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
}
