package com.edureka.util.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yy: hh:mm:ss EEEE zzzz a");
		Date date  = new Date();
		System.out.println(date);
		System.out.println(dateFormat.format(date));
		
		Calendar calender = Calendar.getInstance();
		//System.out.println(calender.(Calendar.DAY_OF_YEAR));
	}

}
