package com.atmecs.project.constants;

import org.openqa.selenium.By;

import com.atmecs.project.testbase.Browsers;




	/**
	 * Purpose:Retrieving the specified elements Text(Get Text).
	 * @author ranjitha.selvam
	 *
	 */
	public class PageGetText extends Browsers {
		public static String text(String properties,String message)
		{
			String data = driver.findElement(By.xpath(properties)).getText();
			System.out.println(message +":"+ data);
			return data;
			
		}


}
