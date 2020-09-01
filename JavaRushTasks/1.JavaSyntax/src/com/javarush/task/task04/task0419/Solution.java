package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
//        int maximum = max(num1, num2) >= max(num3, num4)?max(num1, num2):max(num3, num4);
        int maximum = max(max(num1,num2), max(num3, num4));
        System.out.println(maximum);

    }

    public static int max(int a, int b){
        return a>=b? a:b;
    }
}
