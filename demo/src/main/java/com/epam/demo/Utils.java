package com.epam.demo;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        List<String> listOfNumbers = new ArrayList<>();
        for (String element : args){
            if (Integer.parseInt(element) > 0){
                listOfNumbers.add(element);
            }
        }
        return listOfNumbers.size() == args.size();
        //magic happens here
    }
}