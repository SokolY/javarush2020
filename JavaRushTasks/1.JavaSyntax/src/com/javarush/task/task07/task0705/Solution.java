package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArr = new int[20];
        int[] smalArr1= new int[10];
        int[] smalArr2= new int[10];
        for(int a = 0; a<bigArr.length; a++){
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            bigArr[a] = Integer.parseInt(input.readLine());
        }
        for(int i = 0; i<bigArr.length/2; i++){
                smalArr1[i] = bigArr[i];
                smalArr2[i] = bigArr[(bigArr.length/2)+i];
        }
        for(int j = 0; j<smalArr2.length; j++){
            System.out.println(smalArr2[j]);
        }
    }
}
