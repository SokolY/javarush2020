package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("cxcfd");
        ls.add("asas");
        ls.add("qwerty");
        ls.add("dvvds");
        ls.add("bbc");
        System.out.println(ls.size());
        for(int bar=0; bar<ls.size(); bar++){
            System.out.println(ls.get(bar));
        }
    }
}
