package com.atmecs.project.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * This class used to move web element from one place to another place
 * 
 * @author ranjitha.selvam
 *
 */
public class DragAndDrop {

	static WebDriver driver;

	public static void DragnDrop(String fromXpath, String toXpath) {

		WebElement From = driver.findElement(By.xpath(fromXpath));
		WebElement to = driver.findElement(By.xpath(toXpath));

		Actions action = new Actions(driver);
		action.clickAndHold(From).moveToElement(to).build().perform();

	}
}
