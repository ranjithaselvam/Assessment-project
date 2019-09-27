package com.atmecs.project.script;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.atmecs.project.constants.Constants;
import com.atmecs.project.constants.PageGetText;
import com.atmecs.project.helper.GetDate;
import com.atmecs.project.helper.MouseOver;
import com.atmecs.project.helper.Wait;
import com.atmecs.project.report.LoggerReportInfo;
import com.atmecs.project.testbase.Browsers;
import com.atmecs.project.utils.ExcelReader;
import com.atmecs.project.utils.propertyReader;
import com.atmecs.project.validation.WebSiteValidation;




public class SearchBlogs extends Browsers {
	
	
	@DataProvider
	public Object[][] inputValue() throws Exception {
		Object data[][] = ExcelReader.getExcel(Constants.input_file, "Sheet1");
		
		return data;
		}
	
	@Test(dataProvider = "inputValue")
	public static void searchLog(String date, String title) throws IOException, InterruptedException {
		  Wait.implicitWait(driver);
		  
		  MouseOver.click(driver, propertyReader.properties(Constants.blogs_file, "loc_insight_xpath_link"));

		  MouseOver.click(driver,propertyReader.properties(Constants.blogs_file, "loc_blogs_xpath_clk"));
		  
		  String actTitle = PageGetText.text(propertyReader.properties(Constants.blogs_file, "loc_acttitle_xpath_txt"), "Selected blogs title");
		  
          WebSiteValidation.pageValidation(actTitle, title);
          
		  LoggerReportInfo.logReporter("Actual date");
		
		  String selectedDate = PageGetText.text(propertyReader.properties(Constants.blogs_file, "loc_actdate_xpath_slt"),"Three months before blogs");
		  WebSiteValidation.pageValidation(selectedDate, date);
				
		  GetDate.differenceBetweenTwoDates();
		  
		  MouseOver.click(driver,propertyReader.properties(Constants.blogs_file, "loc_readmore_xpath_slt"));
		 
		  
		  
		  
		  
		  
		 
		  
		  
		
		  
		 
		 // PageGetText.text(propertyReader.properties(Constants.blogs_file, "loc_content_xpath_txt"),"Page Content");
			 
		 

	}

}
