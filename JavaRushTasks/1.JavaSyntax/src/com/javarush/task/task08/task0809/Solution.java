package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date dateBefore = new Date();
        long before = dateBefore.getTime();
        insert10000(list);
        Date dateAfter = new Date();
        long after = dateAfter.getTime();
        // напишите тут ваш код
        return after - before;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, new Object());
        }
    }
}
