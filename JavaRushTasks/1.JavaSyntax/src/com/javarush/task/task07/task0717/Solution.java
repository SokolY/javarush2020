package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i<10; i++){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            list.add(in.readLine());
        }
        ArrayList<String> result = doubleValues(list);
        for (String s: result
             ) {
            System.out.println(s);
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> doubleList = new ArrayList<>();
        for (String st: list
             ) {
            doubleList.add(st);
            doubleList.add(st);
        }
        //напишите тут ваш код
        return doubleList;
    }
}
