package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int firstDigit = number/100;
        int secondDigit = (number-firstDigit*100)/10;
        int thirdDigit = number-firstDigit*100-secondDigit*10;
        return firstDigit + secondDigit + thirdDigit;
    }
}