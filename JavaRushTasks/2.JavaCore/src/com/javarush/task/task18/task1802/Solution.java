package com.javarush.task.task18.task1802;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
////        FileInputStream inpfile = null;
//////        ArrayList list = new ArrayList();
//////        while (inpfile.available()>0){
//////            list.add(inpfile.read());
//////        }
//////        Comparable min = Collections.min(list);
//////        System.out.println(min);
//////        inpfile.close();
////        try {
////            inpfile = new FileInputStream(reader.readLine());
////            int min = inpfile.read();
////            while (inpfile.available()>0){
////                if(inpfile.read()<min){
////                    min = inpfile.read();
////                }
////            }
////            System.out.println(min);
////        }
////        catch (FileNotFoundException ex){
////            ex.printStackTrace();
////        }
////        finally {
////            inpfile.close();
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        long[] arrBytes = new long[256];
        long startTime = System.currentTimeMillis();

        while (inputStream.available() > 0) arrBytes[inputStream.read()]++;

        inputStream.close();
        // Выводим отсортированный по байт-коду в обратном порядке
        for (long i = 255; i >= 0 ; i--)
            if (arrBytes[(int) i] > 0) System.out.print(i + " ");

        long finishTime = System.currentTimeMillis();
        System.out.println("\nвремя работы=" + (finishTime-startTime) + "ms.");
        }
    }

