package com.epam.demo;

import com.epam.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        List<String> listOfNumbers = new ArrayList<>();
        for (String element : args){
            if (StringUtils.isPositiveNumber(element)){
                listOfNumbers.add(element);
            }
        }
        return listOfNumbers.size() == args.size();
        //magic happens here
    }

    public static void main(String[] args) {
        List<String> testList = List.of ("92", "12", "14", "123");
        boolean result = isAllPositiveNumbers(testList);
    }
}
