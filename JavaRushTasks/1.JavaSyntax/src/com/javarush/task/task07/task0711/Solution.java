package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        for(int i = 0; i<5; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            strings.add(reader.readLine());
        }
        for (int j = 0; j<13; j++){
            String st = strings.get(strings.size()-1);
            strings.add(0,st);
            strings.remove(strings.size() -1);
        }
        for (int k = 0; k<strings.size(); k++){
            System.out.println(strings.get(k));
        }
    }
}
