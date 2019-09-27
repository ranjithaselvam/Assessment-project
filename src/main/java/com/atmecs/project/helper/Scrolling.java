package com.atmecs.project.helper;

import org.openqa.selenium.JavascriptExecutor;

import com.atmecs.project.testbase.Browsers;

/**
 * Move around screen in horizontal or vertical direction.
 * To move the window up and down.
 * @author ranjitha.selvam
 *
 */
public class Scrolling extends Browsers {
	public static void scrollingUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,0)", "");

	}

	public static void scrollingDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)", "");
	}

}
