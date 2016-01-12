package com.shows.as.domain.utils;

import java.util.Random;

public class Utils {

    private final static Random generator = new Random();

    public static String random() {
        return Long.toString(generator.nextLong());
    }

}
