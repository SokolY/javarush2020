package com.javarush.task.task09.task0912;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

import java.text.ParseException;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException ex){
            System.out.println(ex);
        }
        //напишите тут ваш код
    }
}
