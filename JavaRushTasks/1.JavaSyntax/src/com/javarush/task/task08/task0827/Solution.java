package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("MAY 1 2013"));
//        System.out.println(isDateOdd("August 23 2014"));
    }


//    public static boolean isDateOdd(String date) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM");
//
//        return true;
//    }
    public static boolean isDateOdd(String date) throws ParseException {
        Date date1 = new SimpleDateFormat("MMMM dd yyyy").parse(date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        int numberOfDay = cal.get(Calendar.DAY_OF_YEAR);
        boolean b = numberOfDay % 2 == 0 ? false : true;
        return b;
    }
}
