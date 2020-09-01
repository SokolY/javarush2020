package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <5; i++){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String s  = in.readLine();
            if(i!=2) {
                strings.add(s);
            }
        }
        for (int j = strings.size()-1; j>=0; j--){
            System.out.println(strings.get(j));
        }
    }
}
