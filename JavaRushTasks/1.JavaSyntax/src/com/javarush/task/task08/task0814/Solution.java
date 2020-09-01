package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> intSet = new HashSet<Integer>();
        for(int i = 0; i<20; i++){
            intSet.add(i);
        }
        return intSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
//         напишите тут ваш кодS
//        Set<Integer> filteredSet = new HashSet<>();
//        for (Integer j : createSet()){
//            if(j<10){
//                filteredSet.add(j);
//            }
//        }
//        return filteredSet;
//        for (int j = 0; j<createSet().size()-1; j++){
//
//        }

    Iterator<Integer> integerIterator = set.iterator();
    while (integerIterator.hasNext()){
        Integer x = integerIterator.next();
        if (x>10){
          integerIterator.remove();
        }
    }
    return set;
    }

    public static void main(String[] args) {
//        for (Integer k : removeAllNumbersGreaterThan10(createSet())){
//            System.out.println(k);
//        }
//        removeAllNumbersGreaterThan10(createSet());
//        for (Integer h :  removeAllNumbersGreaterThan10(createSet())){
//            System.out.println(h);
//        }
    }
}
