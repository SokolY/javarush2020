package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");
        for (int i = strings.size(); i>0; i--){
            strings.add(i, "именно");
        }
        for (String st: strings
             ) {
            System.out.println(st);
        }
    }
}
