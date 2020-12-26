package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2;
//        try {

            num1 = Integer.parseInt(reader.readLine());
            num2 = Integer.parseInt(reader.readLine());
            if(num1<=0 || num2 <=0) throw new Exception();
            int min = Math.min(num1, num2);
            int nod = 0;
            for(int i = 1; i<=min; i++){
                if(num1%i == 0 && num2%i==0){
                    nod = i;
                }
            }
            System.out.println(nod);




//        }
//        catch (NumberFormatException ex){
//            ex.printStackTrace();
////            System.out.println("Line is not a number");
//        }


    }
}
