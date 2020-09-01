package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
//        System.out.println(array[2]);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] intarrey = new int[4];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<intarrey.length; i++){
            intarrey[i] = Integer.parseInt(reader.readLine());
        }
        return intarrey;
    }

    public static int max(int[] array) {
        int mx = array[0];
        for (int j = 1; j<array.length; j++){
            if (array[j]>mx) {
                mx = array[j];
            }
        }
        // найди максимальное значение
        return mx;
    }
}
