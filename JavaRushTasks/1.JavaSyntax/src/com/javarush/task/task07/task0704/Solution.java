package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] intarrey = new int[10];
        for(int u = 0; u<intarrey.length; u++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            intarrey[u] = Integer.parseInt(reader.readLine());
        }
        for(int r = intarrey.length-1; r>=0; r--){
            System.out.println(intarrey[r]);
        }
    }
}

