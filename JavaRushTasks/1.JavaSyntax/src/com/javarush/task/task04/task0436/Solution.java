package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int width = Integer.parseInt(reader.readLine());
        int lng = Integer.parseInt(reader.readLine());
        for(int i =1; i <=width; i++){
            for(int j=1; j<=lng; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
