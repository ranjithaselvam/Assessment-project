package com.atmecs.project.pages;

import java.io.IOException;



import com.atmecs.project.constants.Constants;
import com.atmecs.project.constants.PageGetText;
import com.atmecs.project.helper.MouseOver;
import com.atmecs.project.helper.Scrolling;
import com.atmecs.project.testbase.Browsers;
import com.atmecs.project.utils.propertyReader;

public class HomePage extends Browsers {

	 
	  public static String pageFooter() throws IOException
	  {
		  Scrolling.scrollingDown();
		  String text = PageGetText.text(propertyReader.properties(Constants.footer_file, "loc_footer_xpath_link"),"Homepage Footer");
		  return text;		
	  
	}
	  
	  public static void contextMenu() throws IOException
	  {
		  MouseOver.click(driver, propertyReader.properties(Constants.contextMenu_file,"loc_service_xpath_link"));
		  MouseOver.move(driver,propertyReader.properties(Constants.contextMenu_file,"loc_digitallife_xpath_slt" ));
	  }
}
