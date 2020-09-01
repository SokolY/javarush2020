package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш
        ArrayList<String> originalList = new ArrayList<String>();
        for(int i=0; i<5; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            originalList.add(reader.readLine());
        }
        int minSize= originalList.get(0).length();
        int minindex = 0;
        for(int foo = 1; foo<originalList.size(); foo++){
//            System.out.println(ls.get(foo).length());
            if(originalList.get(foo).length()<minSize){
                minSize = originalList.get(foo).length();
//                minindex = foo;
            }
        }
//        ArrayList<String> minLengthList = new ArrayList<String>();
//        minLengthList.add(originalList.get(minindex));
//        for (int k = 0; k<originalList.size();k++){
//            if(originalList.get(k).length() == minSize && minindex != k){
//                minLengthList.add(originalList.get(k));
//            }
//        }
//
////        System.out.println(minSize);
//        for (int j = 0; j<minLengthList.size();j++){
//            System.out.println(minLengthList.get(j));
//        }
        for(int j = 0;j<originalList.size();j++){
            if(originalList.get(j).length() == minSize){
                System.out.println(originalList.get(j));
            }
        }
    }
}

