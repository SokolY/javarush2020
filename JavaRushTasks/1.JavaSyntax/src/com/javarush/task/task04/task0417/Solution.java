package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if(num1 == num2 || num1 == num3){

            if (num2 == num3){
                System.out.println(num1 + " " + num1 + " " + num1);
            }
            else
                System.out.println(num1 + " " + num1);
        }
        if(num2 == num3 && num2!=num1){
            System.out.println(num2 + " " + num2);
        }
    }
}