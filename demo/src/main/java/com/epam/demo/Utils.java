package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    private Utils() {
        throw new AssertionError();
    }
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            if (!StringUtils.isPositiveNumber(str)) {
                return false;
            }
        }
        return true; // All strings are positive numbers
    }
}