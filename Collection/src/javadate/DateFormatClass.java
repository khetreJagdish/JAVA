package javadate;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatClass {
	
	public static void main(String[] args) {
		
	/**
	 * 
	 * DateFormat and Calendar are Abstract classes hence we can not instantiate these class
	 * 
	 * **/
		
		Date date = new Date(1_000_000_000_000L);
		DateFormat[] dateFormats = new DateFormat[6];
		
		dateFormats[0] = DateFormat.getInstance();
		dateFormats[1] = DateFormat.getDateInstance();
		dateFormats[2]=DateFormat.getDateInstance(DateFormat.SHORT);
		dateFormats[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
		dateFormats[4]=DateFormat.getDateInstance(DateFormat.LONG);
		dateFormats[5]=DateFormat.getDateInstance(DateFormat.FULL);
		
		for (DateFormat dateFormat : dateFormats) {
			
			System.out.println(dateFormat.format(date));
		}
		
	}
}
