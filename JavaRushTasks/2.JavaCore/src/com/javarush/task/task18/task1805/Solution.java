package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        byte[] arr = new byte[256];
        ArrayList<Byte> arr = new ArrayList<>();
        FileInputStream infile = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        while (infile.available()>0){
            arr.add((byte)infile.read());
        }
        infile.close();
//        TreeSet<Byte> treeSet = new TreeSet<>(arr);
//        for (byte b : treeSet){
//            System.out.print(b + " ");
//        }
                Collections.sort(arr);
        for (int i=0; i<arr.size()-1; i++){
            if (arr.get(i)!=arr.get(i+1)){
                System.out.print(arr.get(i) + " ");
            }
        }
    }

}
