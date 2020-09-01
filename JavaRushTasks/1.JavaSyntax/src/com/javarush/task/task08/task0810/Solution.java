package com.javarush.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вызовов get
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date beforeDate = new Date();
        long before = beforeDate.getTime();
        get10000(list);
        Date afterDate = new Date();
        long after = afterDate.getTime();
        return after - before;

        // напишите тут ваш код

    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;
//        int x = list.size()-1;

        for (int i = 0; i < 100000; i++) {
            list.get(x);
        }
    }
}
