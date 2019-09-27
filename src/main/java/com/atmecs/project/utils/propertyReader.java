package com.atmecs.project.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyReader {
	/**
	 * purpose:Property file Reader(read the data from property file)
	 * @author ranjitha.selvam
	 * @throws IOException 
	 *
	 */
	
		public static String properties(String path,String elements) throws IOException 

		{

			Properties property = new Properties();
			FileInputStream stream;
				stream = new FileInputStream(path);
				property.load(stream);
			String data = property.getProperty(elements);
			return data;
			

		}
	}



