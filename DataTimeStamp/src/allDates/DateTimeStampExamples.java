package allDates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeStampExamples {

	// Objective : a method to return today's date and time in given format  (MMddYYYY, MMYY, MMddYYYY_hhmmss
	// Example : getTodayDate(MMddYYYY) will return today's date as 02212000
	// Author : Prabin Kunwar
	// CreatedDate : 02/21/2022
	
	public static void main(String[] args) {
		
		DateTimeStampExamples dateTime = new DateTimeStampExamples();
		System.out.println(dateTime.getTodayDate("MMdd"));
		System.out.println(dateTime.getTodayDate());
		System.out.println(dateTime.getTodayDateTime());
	
	}
	
	public String getTodayDate(String dateFormat) {
		LocalDate dateObj = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
		String date = dateObj.format(formatter);
		return date;
	}
	
	public String getTodayDate() {
		LocalDate dateObj = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
		String date = dateObj.format(formatter);
		return date;
	}
	
	public String getTodayDateTime() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddyyyy_hhmmss");
		String date = simpleDateFormat.format(new Date());
		return date;
	}
	

}
