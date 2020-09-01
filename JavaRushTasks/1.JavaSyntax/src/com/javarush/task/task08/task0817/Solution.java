package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        //напишите тут ваш код
        Map<String, String> credential = new HashMap<String, String>();
        credential.put("Sokolovskyi", "Yurii");
        credential.put("Holod", "Oleg");
        credential.put("Dropa", "Oleg");
        credential.put("Dropa2", "Yuri2");
        credential.put("Sokolovsky", "Stepan");
        credential.put("Holod3", "Yurii4");
        credential.put("Sokolovskyi3", "Vasil");
        credential.put("Dropa4", "Yurii");
        credential.put("Holod8", "Yurii");
        credential.put("Sokolovskyi5", "Stepan");
        return credential;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<String ,String> iter : map.entrySet()){
            for (Map.Entry<String ,String> iter2 : map.entrySet()){
                if(iter.getValue().equals(iter2.getValue()) && !iter.getKey().equals(iter2.getKey())){
                    names.add(iter.getValue());
                }
            }

        }
        for (int i =0 ; i<names.size(); i++){
            removeItemFromMapByValue(map, names.get(i));
        }
//        for (String i : names){
//            System.out.println(i);
//        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        removeTheFirstNameDuplicates(createMap());
    }
}
