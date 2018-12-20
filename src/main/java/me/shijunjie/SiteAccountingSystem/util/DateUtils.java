package me.shijunjie.SiteAccountingSystem.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static String data2Str(Date date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}
}
