package ch12.sec08;

import java.text.*;
import java.util.*;

public class DateExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
//		System.out.println((now.getYear()  + 1900) + "-" + now.getMonth() + "-" + now.getDay() );

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}