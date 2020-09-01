package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for(int i=1; i<array.length;i++){
            for(int j=0; j<i; j++){
                int min;
                if (array[j]>array[i]){
                    min = array[i];
                }
                else{
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;

                }
            }
        }
        //напишите тут ваш код
    }
}
