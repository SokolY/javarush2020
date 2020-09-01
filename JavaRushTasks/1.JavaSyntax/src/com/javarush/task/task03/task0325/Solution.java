package com.javarush.task.task03.task0325;

/* 
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream stream = System.in;
        Reader inputStreamreader = new InputStreamReader(stream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamreader);
        String salary = bufferedReader.readLine();
        System.out.println("Я буду зарабатывать $" + salary + " в час");

    }
}
