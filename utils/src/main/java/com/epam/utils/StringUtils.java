package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int result = Integer.parseInt(str);
        return result > 0;
         //here magic will happen
    }
}
