package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(100, 1.08));
        System.out.println(convertEurToUsd(500, 1.09));

    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur * course;
        //напишите тут ваш код
        return usd;

    }
}
