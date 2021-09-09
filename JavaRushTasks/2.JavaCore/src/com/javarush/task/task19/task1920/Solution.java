package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
//        String fileName = "d://from.txt";
        ArrayList<String> fileData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()){
            fileData.add(reader.readLine());
        }
        reader.close();
        String name;
        Double salary;
        String[] splitedString = new String[2];
        Map<String, Double> map = new TreeMap<>();
        for (String s : fileData){
            splitedString = s.split(" ");
            name = splitedString[0];
            salary = Double.parseDouble(splitedString[1]);
            map.merge(name, salary, ((aDouble, aDouble2) -> aDouble + aDouble2));
        }
//        System.out.println();
        Double maxVal = Collections.max(map.values()); //находим макс.значение
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if(entry.getValue().equals(maxVal)){
                System.out.println(entry.getKey());
            }
        }
    }
}
