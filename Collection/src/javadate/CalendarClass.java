package javadate;

import java.util.Calendar;
import java.util.Locale;

public class CalendarClass {
		
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		Locale[] locale = calendar.getAvailableLocales();
		
		for (Locale locale2 : locale) {
			
			System.out.println("Country : "+locale2.getDisplayCountry() +" Language : "+  locale2.getDisplayLanguage() );
		}
	}
}
