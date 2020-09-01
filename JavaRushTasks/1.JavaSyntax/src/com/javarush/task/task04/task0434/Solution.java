package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int first =1;
        while (first<11){
            int second=1;
            while (second<11) {
                System.out.print(first * second + " ");
                second++;
            }
            System.out.println();
            first++;
        }
    }
}
