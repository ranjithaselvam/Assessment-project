package com.atmecs.project.pages;

import java.io.IOException;



import com.atmecs.project.constants.Constants;
import com.atmecs.project.constants.PageGetText;

import com.atmecs.project.helper.Scrolling;
import com.atmecs.project.testbase.Browsers;
import com.atmecs.project.utils.propertyReader;

public class HomePage extends Browsers {

	 
	  public static String pageFooter() throws IOException
	  {
		  Scrolling.scrollingDown();
		  String text = PageGetText.text(propertyReader.properties(Constants.footerLoc_file, "loc_footer_xpath_link"),"Homepage Footer");
		  return text;		
	  
	}
	  
	 
}
