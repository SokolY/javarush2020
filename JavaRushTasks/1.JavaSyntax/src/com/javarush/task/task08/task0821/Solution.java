package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> credential = new HashMap<>();
        credential.put("Sokolovskyi", "Yurii");
        credential.put("Holod", "Oleg");
        credential.put("Dropa", "Oleg");
        credential.put("Dropa", "Yuri2");
        credential.put("Sokolovsky", "Stepan");
        credential.put("Holod3", "Yurii4");
        credential.put("Sokolovskyi3", "Vasil");
        credential.put("Dropa4", "Yurii");
        credential.put("Holod8", "Yurii");
        credential.put("Sokolovskyi5", "Stepan");
        return credential;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
