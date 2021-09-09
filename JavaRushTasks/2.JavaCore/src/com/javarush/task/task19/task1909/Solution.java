package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inFile = reader.readLine();
        String outFile = reader.readLine();
        reader.close();
        BufferedReader rf = new BufferedReader(new FileReader(inFile));
        BufferedWriter wf = new BufferedWriter(new FileWriter(outFile));
        while (rf.ready()){
           String s= rf.readLine();
           String replaceString = s.replace(".", "!");
           wf.write(replaceString);
        }
        rf.close();
        wf.close();
    }
}
