package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        readData();
    }

    public static void readData(){
        ArrayList<Integer> intArrey = new ArrayList<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
        while(true){
            try {
                num = Integer.parseInt(in.readLine());
                intArrey.add(num);
            } catch (NumberFormatException  | IOException e) {
//                System.out.println("wrong format");
                e.printStackTrace();
                break;
            }
            }
            for (int i : intArrey){
                System.out.println(i);
            }
        }
        //напишите тут ваш код
    }
