package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int id = Integer.parseInt(reader.readLine());
//        String name = reader.readLine();

        HashMap<String, Integer> mymap = new HashMap<>();
        while (true){
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                mymap.put(name, id);
            }
           catch (IOException  | NumberFormatException ex){
//               System.out.println("loop break");
                break;
           }
        }
        for (Map.Entry<String, Integer> pairs: mymap.entrySet()){
            System.out.println(pairs.getValue() + " " + pairs.getKey());
        }
//        System.out.println("Id=" + id + " Name=" + name);
    }
}
