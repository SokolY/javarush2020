package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        for(int i = 0; i<5; i++){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            strings.add(in.readLine());
        }
        int maxStingLength = strings.get(0).length();
        for(int r = 0; r<strings.size(); r++){
            if(strings.get(r).length()>maxStingLength){
                maxStingLength = strings.get(r).length();
            }
        }
        for (int k = 0; k<strings.size(); k++){
            if(strings.get(k).length() == maxStingLength){
                System.out.println(strings.get(k));
            }
        }
        //напишите тут ваш код
    }
}
