package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream infile = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int comaCount = 0;
        while (infile.available()>0){
//            System.out.println((char)infile.read());
            Character ch = (char)infile.read();
            if (ch.equals(',')) comaCount++;
        }
        System.out.println(comaCount);
        infile.close();
    }
}
