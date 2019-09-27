package com.atmecs.project.validation;

import org.testng.Assert;


	/**
	 * Determine the the state of the application whether it is the same what we are expecting or not.
	 * @author ranjitha.selvam
	 *
	 */
	public class WebSiteValidation {
		public static void pageValidation(String actualDetails,String expectedDetails )
		{
			try
		{
			
		
			Assert.assertEquals(actualDetails, expectedDetails);
			System.out.println(" Passed : " + " Expected : " + expectedDetails + " Actual : " + actualDetails);
		}catch(AssertionError assertionError)
		{
			System.out.println(" Failed : " + " Expected : " + expectedDetails + " Actual : " + actualDetails);
		}
			
		}
		
	

}
