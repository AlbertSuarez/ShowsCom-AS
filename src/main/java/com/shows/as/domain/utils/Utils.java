package com.shows.as.domain.utils;

import java.util.Calendar;
import java.sql.Date;
import java.util.Random;

/*
Implementacio de la classe Utils. Aquesta classe conté diferents mètodes necessàris per l'execució.
 */
//Classe que incorpora funcions utils per al funcionament del sistema
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

    public static Date createDate(int day, int month, int year) {
        Calendar cDate = Calendar.getInstance();
        cDate.set(Calendar.DATE, day);
        cDate.set(Calendar.MONTH, month);
        cDate.set(Calendar.YEAR, year);
        return new Date(cDate.getTimeInMillis());
    }

}
