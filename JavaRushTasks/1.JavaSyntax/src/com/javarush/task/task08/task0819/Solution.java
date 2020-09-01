package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/
public class Solution {
    public static class Cat{
//        public String st = "kity";
    }
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3


//        Map<String, String> copy = new HashMap<>(map);

        printCats(cats);
//        Set<Cat> copy = new HashSet<>(cats);
//        Iterator ct = copy.iterator();
//        cats.remove(!ct.hasNext());
//
//        for (Cat ct : cats){
//            cats.remove(ct);
//            break;
//        }
        cats.remove(1);
        System.out.println(cats.size());
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> stCats = new HashSet<>();
        Cat vaska = new Cat();
        Cat boris = new Cat();
        Cat murzik = new Cat();
        stCats.add(vaska);
        stCats.add(boris);
        stCats.add(murzik);
        return stCats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat item: cats){
            System.out.println(item);
        }
    }

    // step 1 - пункт 1
}
