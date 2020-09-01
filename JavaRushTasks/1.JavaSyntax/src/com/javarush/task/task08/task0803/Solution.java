package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
        System.out.println();
;
        }




    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> mapcats= new HashMap<String, Cat>();
        for (int i = 0 ; i<cats.length; i++){
           mapcats.put(cats[i], new Cat(cats[i]));
//           if (i%2 == 0){
//               mapcats.put(cats[i], new Cat("рижий"));
//           }
//           else {
//               mapcats.put(cats[i], new Cat("чорний"));
//           }

        }
        return mapcats;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
