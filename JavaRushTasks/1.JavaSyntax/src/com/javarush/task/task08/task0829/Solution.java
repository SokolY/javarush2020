package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        List<String> list = new ArrayList<>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) {
//                break;
//            }
//
//            list.add(family);
//        }
//     int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
        Map<String, String> map = new HashMap<>();
        while (true){
            String city = reader.readLine();
            if (city.isEmpty()){
                break;
            }
            String surName = reader.readLine();
            map.put(city, surName);

        }

        String cityName = reader.readLine();
        for(Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getKey().equals(cityName)){
                System.out.println(pair.getValue());
            }
        }
        // Read the house number

    }
}
