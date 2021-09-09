package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String inFile;
        String outFile;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inFile =reader.readLine();
            outFile = reader.readLine();
        }
        ArrayList<String> inArray = new ArrayList<>();
        try (BufferedReader rf = new BufferedReader(new FileReader(inFile))){
            while (rf.ready()){
                inArray.add(rf.readLine());
            }
        }
        try (BufferedWriter wf = new BufferedWriter(new FileWriter(outFile))){
            for(String st : inArray){
                wf.write(st.replaceAll("[^\\w\\s]",""));
            }

        }
    }
}
