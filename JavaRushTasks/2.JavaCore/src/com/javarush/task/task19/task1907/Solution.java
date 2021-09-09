package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        FileReader fr = new FileReader(name);
       BufferedReader reader1 = new BufferedReader(fr);
        int count = 0;
       while (reader1.ready()){
           for (String s : reader1.readLine().split("\\W")){
               if (s.equals("world")){
                   count++;
               }
           }
       }
       bf.close();
       fr.close();
        System.out.println(count);

    }
}
