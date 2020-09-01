package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String , Integer> map = new HashMap<>();
        map.put("Yurii", 4000);
        map.put("Katya", 3000);
        map.put("Olya2", 1200);
        map.put("Olya3", 150);
        map.put("Katya4", 200);
        map.put("Katya5", 200);
        map.put("Yurii6", 800);
        map.put("Yurii7", 200);
        map.put("Sasha", 600);
        map.put("Sasha2", 200);
        return map;
    }

//    public static void removeItemFromMap(Map<String, Integer> map) {
//        Map<String, Integer> copy = new HashMap<>(map);
//        for (Map.Entry<String, Integer> iter : copy.entrySet()){
//            int sallery = iter.getValue();
//            if (sallery<500){
//                map.remove(iter.getKey());
//            }
//        }
//    }
public static Map<String, Integer> removeItemFromMap(Map<String, Integer> map) {
    Map<String, Integer> copy = new HashMap<>(map);
    for (Map.Entry<String, Integer> iter : copy.entrySet()){
        int sallery = iter.getValue();
        if (sallery<500){
            map.remove(iter.getKey());
        }
    }
    return map;
}

    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Yurii", 4000);
//        map.put("Katya", 3000);
//
//        Map<String, Integer> copy = new HashMap<>(map);
//        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
//            if (pair.getValue() < 3500) {
//                map.remove(pair.getKey());
//            }
//        }
        //напишите тут ваш код
//        Map<String , Integer> map = new HashMap<>();
//        map.put("Yurii", 4000);
//        map.put("Katya", 3000);
//        map.put("Olya2", 1200);
//        map.put("Olya3", 150);
//        map.put("Katya4", 200);
//        map.put("Katya5", 200);
//        map.put("Yurii6", 800);
//        map.put("Yurii7", 200);
//        map.put("Sasha", 600);
//        map.put("Sasha2", 200);
//        removeItemFromMap(map);
//        removeItemFromMap(createMap());
        Map<String, Integer> mp = removeItemFromMap(createMap());
        for (Map.Entry<String, Integer> item : mp.entrySet()) {
            String key = item.getKey();
            int value = item.getValue();
            System.out.println(key + " - " + value);
        }
    }
}