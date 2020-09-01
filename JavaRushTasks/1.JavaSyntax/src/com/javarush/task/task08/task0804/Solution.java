package com.javarush.task.task08.task0804;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Вывести на экран список ключей
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //        for(Map.Entry<String,String> itter : map.entrySet()){
//            System.out.println(itter.getKey());
//        }
        Iterator itte = map.entrySet().iterator();
        while (itte.hasNext()){
            Map.Entry pair = (Map.Entry)itte.next();
            System.out.println(pair.getKey());
        }
        //напишите тут ваш код
    }
}
