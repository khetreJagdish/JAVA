package javadate;

import java.util.Calendar;
import java.util.Date;

public class Dates2 {
	
	public static void main(String[] args) {
		
		Date date1 = new Date(1_000_000_000_000L);
		System.out.println("First Date : " + date1.toString());
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date1);
		
		if (Calendar.SUNDAY == calendar.getFirstDayOfWeek() ) {
			
			System.out.println("Sunday is the first day of week");
			System.out.println("trillion milli day of week " + calendar.get(Calendar.DAY_OF_WEEK));
			//calendar.add(Calendar.MONTH, 2);
			calendar.add(Calendar.DAY_OF_YEAR, 5);
			Date date2 = calendar.getTime();
			System.out.println("New Date : " + date2);
			calendar.roll(Calendar.MONTH, 9);
			Date date4 = calendar.getTime();
			System.out.println("New Date4 : " + date4);
		}
	}
}
