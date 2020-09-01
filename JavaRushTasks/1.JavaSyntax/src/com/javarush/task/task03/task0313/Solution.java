package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String array[] = new String[3];
        array[0] = "Мама";
        array[1] = "Мыла";
        array[2] = "Раму";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
//                    if (i != j & i != k & j != k) // Условие убирающие повторы
                        System.out.println(array[i] + array[j] + array[k]);
                }
            }
        }
    }
}