package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date date = new Date();
//        date.getTime();
//        date.getMonth();
        int year = date.getYear() + 1900;
        int month = date.getMonth()+1;
//        System.out.println(date.getDate());
        System.out.println(date.getDate() + " " + month + " " + year);
    }
}
