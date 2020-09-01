package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {

        multiplication(10);

    }
    public static void multiplication (int i){
        int rezult =1;
        for (int j = 1; j<=i; j++){
            rezult *= j;
        }
        System.out.println(rezult);
    }
}
