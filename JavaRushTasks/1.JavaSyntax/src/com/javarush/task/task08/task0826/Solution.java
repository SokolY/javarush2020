package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
//        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
//        int reserv;
//        for(int i=0; i<array.length-1; i++){
//            for(int j = i+1; j<array.length-1; j++){
//                if(array[j]>array[i]){
//                   reserv = array[i];
//                   array[i] = array[j];
//                   array[j] = reserv;
//                }
//            }
//        }

//        Arrays.sort(array);
        int[] arrey2 = new int[array.length];
        for(int j = 0; j < arrey2.length; j++){
            arrey2[j] = array[j];
        }
        Arrays.sort(arrey2);
        int k = arrey2.length-1;
        for (int i = 0; i<array.length; i++){
            array[i] = arrey2[k];
            k--;
        }

    }
}
