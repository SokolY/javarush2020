package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for(int i = 0; i<n; i++){
            strings.add(reader.readLine());
        }
        for(int j = 0; j<=m-1; j++){
            strings.add(strings.size(), strings.get(j));

        }
        for(int j = 1; j<=m; j++){
            strings.remove(0);
        }
//        strings.remove(0);
//        strings.remove(0);
        //напишите тут ваш код
        for (String st : strings){
            System.out.println(st);
        }
    }
}
