package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mark1 = Integer.parseInt(reader.readLine());
        int mark2 = Integer.parseInt(reader.readLine());
        int mark3 = Integer.parseInt(reader.readLine());
        int total = 0;
        if(mark1 > 0){
            total +=1;
        }
        if (mark2 >0){
            total +=1;
        }
        if (mark3 > 0){
            total +=1;
        }
        System.out.println(total);
    }
}
