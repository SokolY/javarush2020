package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Date newdate;
        Reader in = new BufferedReader(new InputStreamReader(System.in));
        String inDate = ((BufferedReader) in).readLine();
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        Date date = parser.parse(inDate);
        SimpleDateFormat formated = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(formated.format(date).toUpperCase());
        //напишите тут ваш код
    }
}
