package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> fruits = new HashMap<String, String>();
        fruits.put("арбуз", "ягода");
        fruits.put("банан", "трава");
        fruits.put("вишня","ягода");
        fruits.put("груша","фрукт");
        fruits.put("дыня","овощ");
        fruits.put("ежевика","куст");
        fruits.put("жень-шень","корень");
        fruits.put("земляника","ягода");
        fruits.put("ирис","цветок");
        fruits.put("картофель","клубень");
        Iterator it = fruits.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry pair = (Map.Entry)it.next();
//            System.out.println(pair.getKey() + " = " + pair.getValue());
//        }
//        for(Map.Entry<String, String> item : fruits.entrySet()){
//            String key = item.getKey();
//            String value = item.getValue();
//            System.out.println(key + " - " + value);
//        }
    }
}
