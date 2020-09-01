package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        for(int s = 10; s>0; s--){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            strings.add(0, in.readLine());
        }
    for(int j = 0; j<strings.size(); j++){
        System.out.println(strings.get(j));
    }
//        System.out.println(strings.get(2));

    }
}
