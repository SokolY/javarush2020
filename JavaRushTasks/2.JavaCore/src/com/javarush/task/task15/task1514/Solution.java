package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
//        labels.put(1d, "first");
//        labels.put(2d, "second");
//        labels.put(3d, "third");
//        labels.put(4d, "fourth");
//        labels.put(5d, "fifth");
        for (int i = 0; i<5; i++){
            String str = "some string";
            labels.put((double)i, str);
        }
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
