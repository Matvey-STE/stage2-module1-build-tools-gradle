package com.epam.utils;

public class StringUtils {
    private StringUtils() {
    }
    public static boolean isPositiveNumber(String str) {
        try {
            int number = Integer.parseInt(str);
            return number > 0;
        } catch (NumberFormatException e) {
            return false; // If parsing fails, it's not a positive number
        }
    }
}
