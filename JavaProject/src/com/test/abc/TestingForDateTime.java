package com.test.abc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestingForDateTime {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println("Before set");
		System.out.println(d);
		System.out.println(d.getTimezoneOffset());

		d.setMonth(12);
		System.out.println(d);
		System.out.println(d.getTimezoneOffset());

		SimpleDateFormat dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
		String dateTimeStr = dateTime.format(d);
		System.out.println(dateTimeStr);

	}

}


