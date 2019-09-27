package com.atmecs.project.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Different locator for identify the element.
 * @author ranjitha.selvam
 *
 */
public class Locators {

	static WebDriver driver;

	public static void select(String locator) {
		switch ("locator") {
		case "ClassName":

			driver.findElement(By.className(locator));

			break;
		case "CssSelector":

			driver.findElement(By.cssSelector(locator));
			break;
		case "Id":

			driver.findElement(By.id(locator));
			break;
		case "LinkText":

			driver.findElement(By.linkText(locator));
			break;
		case "Name":

			driver.findElement(By.name(locator));
			break;
		case "PARTIALLINKTEXT":

			driver.findElement(By.partialLinkText(locator));
			break;
		case "TAGNAME":

			driver.findElement(By.tagName(locator));
			break;
		case "XPath":

			driver.findElement(By.xpath(locator));
			break;
		}
	}
}
