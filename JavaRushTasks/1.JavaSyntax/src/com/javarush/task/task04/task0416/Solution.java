package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int minute = Integer.parseInt(reader.readLine());
        Float minute = Float.parseFloat(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        minute = (float)(Math.floor(t)%5);
        if(minute>=0.0f && minute%5<3.0f){
            System.out.println("зеленый");
        }
        else if (minute%5>=3.0f && minute%5 <4.0f){
            System.out.println("жёлтый");
        }
        else
            System.out.println("красный");
    }
}