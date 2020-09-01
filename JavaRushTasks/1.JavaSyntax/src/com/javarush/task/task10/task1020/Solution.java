package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам Ӏ Java Syntax: 10 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
//        for (int x : array){
//            System.out.println(x);
//        }

        System.out.println(array[1]);
        System.out.println(array[3]);
    }

    public static void sort(int[] array) {
//        Arrays.sort(array);
        //напишите тут ваш код
        int temp;
        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
