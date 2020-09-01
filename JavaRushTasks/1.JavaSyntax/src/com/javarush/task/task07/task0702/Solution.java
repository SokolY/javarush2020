package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] strArrey = new String[10];
        for(int itter = 0; itter<((strArrey.length)-2);itter++){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            strArrey[itter] = in.readLine();
        }
        for (int k = ((strArrey.length)-1); k>=0; k--){
            System.out.println(strArrey[k]);
        }
    }
}