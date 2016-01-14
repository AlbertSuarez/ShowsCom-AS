package com.shows.as.domain.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Utils {

    private final static Random generator = new Random();

    public static String random() {
        return Long.toString(generator.nextLong());
    }

    public static int randomInt(){return generator.nextInt();}

    public static Boolean sameDay(Date d1, Date d2) {
        int day, month, year;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d1);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        calendar.setTime(d2);
        return (day == calendar.get(Calendar.DAY_OF_MONTH) &&
                month == calendar.get(Calendar.MONTH) &&
                year == calendar.get(Calendar.YEAR));
    }

}
