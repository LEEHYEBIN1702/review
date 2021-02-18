package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	/**
	 * String -> Date
	 * SimpleDateFormat.parse
	 */
	public static Date toDate(String date) {
		Date result = null;
		// to do
		return result;
	}

	/**
	 * Date -> String
	 * SimpleDateFormat.format
	 */
	public static String toStr(Date date) {
		String result = null;
		// to do
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
		result = dateFormat.format(date);
		return result;
	}
	
	/**
	 * Date를 주어진 포맷대로 스트링으로 변환
	 * Date -> String
	 * SimpleDateFormat.format
	 */
	public static String toStr(Date date, String format) {
		String result = null;
		// to do
		SimpleDateFormat dateFormat = new SimpleDateFormat("D");
		result = dateFormat.format(date);
		return result;
	}
	
	public static Date addDay(Date today, int s) {
		Date result = null;
		// to do
		return result;
	}


}
