package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String year = reader.readLine();
        String month = reader.readLine();
        String day = reader.readLine();
        System.out.println("Меня зовут " + name +".");
        System.out.println("Я родился " + day + "." + month + "."+year);
    }
}
