package com.atmecs.project.helper;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;



public class GetDate {
	
	 public static void differenceBetweenTwoDates()
	 {
		  LocalDate dateOfBirth = LocalDate.of(2019, Month.MARCH, 15);
		  DateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
		  Date date = new Date();
		  String date1= dateFormat.format(date);
		  System.out.println("Current Date : "+date1);
	      LocalDate currentDate = LocalDate.now();
	      long days = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
	      long months = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
	      long years = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
	      System.out.println("Day :"+days );
	      System.out.println("Months :"+months);
	      System.out.println("Years :"+years);
	 }
	 
	}

	
	
		
				
			

				
				


