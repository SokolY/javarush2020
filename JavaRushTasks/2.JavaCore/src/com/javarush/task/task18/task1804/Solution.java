package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Byte, Integer> Dat = new HashMap<>();
        ArrayList<Byte> list = new ArrayList<>();

        FileInputStream filinp = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
                while (filinp.available()>0){
            list.add((byte)filinp.read());
        }
        filinp.close();
        int count;
                for (int i = 0; i<list.size(); i++){
                    count = Collections.frequency(list, list.get(i));
                    Dat.put(list.get(i), count);
                }
        int min = Collections.min(Dat.values());
                for(Map.Entry<Byte, Integer> pair: Dat.entrySet()){
                    if (pair.getValue() == min){
                        System.out.print(pair.getKey() + " ");
                    }
                }


//        long[] arr = new long[256];
//        while (filinp.available()>0){
//            arr[filinp.read()]++;
//        }
//        Arrays.sort(arr);
//       long mimimum = arr[0];
////        System.out.println("Last element:" + mimimum);
//        for (int i =0; i<arr.length; i++){
//            if (arr[i]==mimimum){
//                System.out.print(arr[i] + " ");
//            }
//        }


//        ArrayList<Integer> impbyte = new ArrayList<Integer>();
//        while (filinp.available()>0){
//            impbyte.add(filinp.read());
//        }
//        Collections.sort(impbyte);
//        int min = impbyte.get(0);
//        for (int i = 0; i<impbyte.size(); i++){
//            if (impbyte.get(i)== min){
//                System.out.print(impbyte.get(i) + " ");
//            }
//        }

//        for (int i :impbyte){
//            System.out.println(i);
//        }

    }
}
