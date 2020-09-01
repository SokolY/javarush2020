package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] intArr = new int[15];
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i<intArr.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            intArr[i] = Integer.parseInt(reader.readLine());
        }
        for (int foo = 0; foo<intArr.length; foo++){
            if(foo == 0 || foo%2 == 0){
                evenSum += intArr[foo];
            }
            else {
                oddSum += intArr[foo];
            }
        }
       if(evenSum>oddSum){
           System.out.println("В домах с четными номерами проживает больше жителей.");
       }
       else
           System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
