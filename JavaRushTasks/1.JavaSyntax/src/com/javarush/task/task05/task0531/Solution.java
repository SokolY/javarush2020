package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);
        int gmin = min(a,b,c,d,e);

//        System.out.println("Minimum = " + minimum);
        System.out.println("Minimum = " + gmin);
    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d, int e){
        int minimum = min(a, b);
        int min2 = min(min(c, d), e);
        int generalMin = min(minimum, min2);
        return generalMin;
    }
}
