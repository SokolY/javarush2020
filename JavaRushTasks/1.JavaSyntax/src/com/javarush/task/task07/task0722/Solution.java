package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<>();
        boolean statemant = true;
        while (statemant == true){
            String in= reader.readLine();
            if (in.equals("end")){
//                statemant = false;
                break;
            }
            str.add(in);
        }
        for(String s : str){
            System.out.println(s);
        }


        //напишите тут ваш код
    }
}