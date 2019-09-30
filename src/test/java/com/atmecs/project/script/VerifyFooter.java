package com.atmecs.project.script;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.atmecs.project.constants.Constants;
import com.atmecs.project.helper.FindElements;
import com.atmecs.project.helper.MouseOver;
import com.atmecs.project.helper.Wait;
import com.atmecs.project.pages.HomePage;
import com.atmecs.project.report.LoggerReportInfo;
import com.atmecs.project.testbase.Browsers;
import com.atmecs.project.utils.ExcelReader;
import com.atmecs.project.utils.propertyReader;




/**
 * Validate context menu and footer
 * @author ranjitha.selvam
 *
 */
public class VerifyFooter extends Browsers {

	@Test(priority=1)
	public void verifyFooter() throws IOException {

		Wait.implicitWait(driver);
		LoggerReportInfo.logReporter("verifying footer.....");
		
		
		MouseOver.click(driver, propertyReader.properties(Constants.footerLoc_file, "loc_home_xpath_link"));
		LoggerReportInfo.logReporter("Home page footer...");
		String home = HomePage.pageFooter();

		MouseOver.click(driver, propertyReader.properties(Constants.footerLoc_file, "loc_aboutus_xpath_link"));
		LoggerReportInfo.logReporter("AboutUs page footer...");
		String aboutUs =HomePage.pageFooter();

		MouseOver.click(driver, propertyReader.properties(Constants.footerLoc_file, "loc_service_xpath_link"));
		LoggerReportInfo.logReporter("Service Page footer...");
		String service = HomePage.pageFooter();

		MouseOver.click(driver, propertyReader.properties(Constants.footerLoc_file, "loc_partner_xpath_link"));
		LoggerReportInfo.logReporter("Partner page footer...");
		String partner = HomePage.pageFooter();

		MouseOver.click(driver, propertyReader.properties(Constants.footerLoc_file, "loc_insight_xpath_link"));
		LoggerReportInfo.logReporter("Insight page footer...");
		String insight = HomePage.pageFooter();

		MouseOver.click(driver, propertyReader.properties(Constants.footerLoc_file, "loc_carrers_xpath_link"));
		LoggerReportInfo.logReporter("Carrers page footer...");
		String carrers = HomePage.pageFooter();

		MouseOver.click(driver, propertyReader.properties(Constants.footerLoc_file, "loc_contactus_xpath_link"));
		LoggerReportInfo.logReporter("Contactus page footer....");
		String contactUs = HomePage.pageFooter();

		
		
		
		if (aboutUs.equals(home) && insight.equals(home) && service.equals(home) && carrers.equals(home)
				&& partner.equals(home) && contactUs.equals(home)) {
			LoggerReportInfo.logReporter("Verified that all the pages are having the footer");

		} else {
			LoggerReportInfo.logReporter("All the pages are not having the footer");
		}

		
		
	}
	@DataProvider
	  public Object[][] menu() throws Exception {
	  Object data[][] = ExcelReader.getExcel(Constants.contextMenuData_file, "Sheet1");
	  return data;
		}


    @Test(dataProvider = "menu",priority=2)
	
	 
	public void contextMenu(String digitalLife,String infrastructure) throws IOException
	{
		
		MouseOver.move(driver, propertyReader.properties(Constants.contextMenuLoc_file, "loc_service_xpath_link"));
		MouseOver.move(driver, propertyReader.properties(Constants.contextMenuLoc_file, "loc_digitallife_xpath_slt"));
	
		FindElements.elements(driver,propertyReader.properties(Constants.contextMenuLoc_file, "loc_digitallifemenu_xpath_txt"),digitalLife);
		MouseOver.move(driver, propertyReader.properties(Constants.contextMenuLoc_file, "loc_infrastructure_xpath_slt"));
		FindElements.elements(driver,propertyReader.properties(Constants.contextMenuLoc_file, "loc_infrastructuremenu_xapth_txt"),infrastructure);

	}
 
  }
 

