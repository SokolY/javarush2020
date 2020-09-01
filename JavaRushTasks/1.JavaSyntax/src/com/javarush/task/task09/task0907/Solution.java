package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            int a = 42 / 0;
        }
        catch (ArithmeticException mass){
//            System.out.println("Divided by 0 is prohibited");
            System.out.println(mass);
        }


        //напишите тут ваш код
    }
}
