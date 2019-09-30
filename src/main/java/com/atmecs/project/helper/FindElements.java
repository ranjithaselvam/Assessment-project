package com.atmecs.project.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.project.report.LoggerReportInfo;

public class FindElements {
	public static void elements(WebDriver driver,String xpath,String expectedValues) 
	{
		
		List<WebElement> dropdownvalues = driver.findElements(By.xpath(xpath));
		for(WebElement value:dropdownvalues)
		{ 
		 String  values=value.getText();
		  System.out.println("value names :" + values);
		  if(values.contains(expectedValues))
		  {
			  LoggerReportInfo.logReporter("context menu is true");
		  }
		  else
		  {
			  LoggerReportInfo.logReporter("context menu is false");
		  }
		}
		
	}
}