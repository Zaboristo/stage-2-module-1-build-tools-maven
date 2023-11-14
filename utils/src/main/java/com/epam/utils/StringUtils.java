package com.epam.utils;


public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(str == null) return false;
        return Integer.parseInt(str) > 0;

    }
}
