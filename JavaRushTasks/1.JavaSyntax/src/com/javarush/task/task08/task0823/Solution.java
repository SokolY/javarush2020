package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

//        ArrayList<String> stArrey = new ArrayList<>();
        String word;
        String[] parts = string.split("\\s+");
        List<String> stArrey = Arrays.asList(parts);
        ArrayList<String> updatedArrey = new ArrayList<>();
        for(int i = 0; i<stArrey.size(); i++){
            String s = stArrey.get(i);
            String s1, s2 , s3;
            s1 = s.substring(0,1);
            s2 = s.substring(1);
            s3 = s1.toUpperCase() + s2;
            updatedArrey.add(s3);

        }
        String updateString = "";
        for (String b : updatedArrey){
            updateString += b;
            updateString += " ";
        }
        System.out.println(updateString);
        for (String s : updatedArrey){
            System.out.println(s);
        }

////        String line = "организация объединённых наций";
//        char[] chars = string.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (i == 0 || chars[i-1] == ' '){
//                chars[i] = Character.toUpperCase(chars[i]);
//            }
//        }
////        String line = "организация объединённых наций";
////        char[] chars = string.toCharArray();
////        for (int i = 0; i < chars.length; i++) {
////            if (i == 0 || chars[i - 1] == ' ') {
////                chars[i] = Character.toUpperCase(chars[i]);
////            }
////        }
//        System.out.println(new String(chars));
            }
        }
//        напишите тут ваш код


