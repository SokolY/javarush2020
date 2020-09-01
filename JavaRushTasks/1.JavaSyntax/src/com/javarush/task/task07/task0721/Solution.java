package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] intArrey = new int[20];

        int maximum;
        int minimum;
        int i = 0;
        do{
//            intLst.add(Integer.parseInt(reader.readLine()));
//
            intArrey[i] = Integer.parseInt(reader.readLine());
            i++;
        }while (i<4);

        List<Integer> intList = new ArrayList<Integer>();
        for (int k : intArrey)
        {
            intList.add(k);
        }
        System.out.println("ArreyList list:");
        for (int h : intList){
            System.out.println(h);
        }
//        maximum = intLst.get(0);
//        minimum = intLst.get(0);
//        maximum = intArrey[0];
//        minimum = intArrey[0];
//        for (int j =1; j<intArrey.length; j++) {
//            if (intArrey[j]<minimum){
//                minimum = intArrey[j];
//            }
//            if (intArrey[j]>maximum){
//                maximum = intArrey[j];
//            }
//
//        }

        //напишите тут ваш код

//        System.out.print(maximum + " " + minimum);
    }
}
