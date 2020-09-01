package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strs = new ArrayList<>();
        for (int i = 0; i <10; i++){
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            strs.add(input.readLine());
        }
        for (int foo = 0; foo<strs.size()-1; foo++){
            if (strs.get(foo).length() > strs.get(foo+1).length()){
                System.out.println(foo+1);
                break;
            }
        }
    }
}

