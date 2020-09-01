package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num == 0){
            System.out.println("ноль");
        }
        else {
            System.out.println(isNegative(num) + " " + isOdd(num));
        }

//        System.out.println(isNegative(num));
    }

    public static String isNegative(int x) {
        if (x < 0) {
            return ("отрицательное");
        }
//        else if (x == 0) {
//            return ("ноль");
//        }
        else
            return ("положительное");
    }

    public static String isOdd(int y) {

            return y % 2 == 0 ? "четное число" : "нечетное число";

    }
//public static String isOdd(int x) {
////    if(x==0) {
////        return ("ноль");
////    }
//        if (x % 2 == 0) {
//            return ("четное число");
//        } else {
//            return ("нечетное число");
//        }
////    }
//}

    }

