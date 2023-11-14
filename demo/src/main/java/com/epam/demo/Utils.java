package com.epam.demo;

import java.util.List;
import com.epam.*;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for(String str: args){
            if(str == null) return false;
            if(Integer.parseInt(str) <= 0) return false;
        }
        return true;
    }
}