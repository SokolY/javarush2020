package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
       Map<String, String> credential = new HashMap<String, String>();
       credential.put("Sokolovskyi", "Yurii");
       credential.put("Holod", "Oleg");
       credential.put("Dropa", "Roman");
        credential.put("Dropa2", "Yuri2");
        credential.put("Sokolovsky", "Yurii2");
        credential.put("Holod3","Yurii4" );
        credential.put("Sokolovskyi3","Yurii5");
        credential.put("Dropa4","Yurii");
        credential.put("Holod8", "Yurii7");
        credential.put("Sokolovskyi5", "Yurii8");
       return credential;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
       int nameMatch = 0;
//
        for(Map.Entry<String, String> entry : map.entrySet()){
            if(entry.getValue().equals(name)){
                nameMatch++;
            }
        }
        return nameMatch;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int lastNameMatches =0;
        for(Map.Entry<String, String> entry : map.entrySet()){
            if(entry.getKey().equals(lastName)){
                lastNameMatches++;
            }
        }
        return lastNameMatches;

    }

    public static void main(String[] args) {
//        System.out.println(getCountTheSameFirstName(createMap(), "Yurii"));
//        System.out.println(getCountTheSameLastName(createMap(), "Holod"));
    }
}
