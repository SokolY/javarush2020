package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        String str = "Hahaha";
//        System.out.println(str.length());
        String[] strmas = new String[10];
        int[] intmas = new int[10];
        for(int i = 0; i<strmas.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            strmas[i] = reader.readLine();
            intmas[i] = strmas[i].length();
        }
        for(int j = 0; j<intmas.length; j++){
            System.out.println(intmas[j]);
        }
    }
}
