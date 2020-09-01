package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i < 10; i++) {
//            set.add(reader.readLine());
//        }
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for (String s : set){
            System.out.println(s);
        }
    }
}
