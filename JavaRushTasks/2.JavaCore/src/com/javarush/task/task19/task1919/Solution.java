package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        ArrayList<String> list = new ArrayList<>();
        Map  <String, Double> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()){
            list.add(reader.readLine());
        }
        reader.close();
        String[] person = new String[2];
        double salary;
        for(String s : list){
            person = s.split( " ");
            salary = Double.parseDouble(person[1]);
            map.merge(person[0], salary, ((aDouble, aDouble2) -> aDouble + aDouble2));
        }
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
