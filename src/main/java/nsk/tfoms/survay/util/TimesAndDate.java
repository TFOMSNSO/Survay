package nsk.tfoms.survay.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimesAndDate
{
	public static Date parseDate(String cunvertCurrentDate,String format) throws ParseException
	 {
		  Date date = new Date();
		  DateFormat df = new SimpleDateFormat(format);
		  date = df.parse(cunvertCurrentDate);
		  return date;
	 }
	
	
	/*
	 * Парсим дату из гггг-мм-дд в дд.мм.yyyy
	 */
	public static String parseDate(String date) throws ParseException
	 {
		date = date.substring(8,10)+"."+date.substring(5,7)+"."+date.substring(0,4);
		  return date;
	 }
}
