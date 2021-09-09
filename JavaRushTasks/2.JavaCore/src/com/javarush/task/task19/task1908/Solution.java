package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        FileReader fr = new FileReader(reader.readLine());
////        FileWriter fw = new FileWriter(reader.readLine());
//        String outputFile = reader.readLine();
//        reader.close();
//        BufferedReader reader1 = new BufferedReader(fr);
//        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile));
//        while (reader1.ready()){
//            for(String s : reader1.readLine().split(" ")){
//                try {
//                    int i = Integer.parseInt(s);
//                    fileWriter.write(i +  " ");
//                }
//                catch (NumberFormatException ex){
//                    ex.printStackTrace();
//                }
//            }
//        }
//        reader1.close();
//        fr.close();
//        fileWriter.close();
//    }

        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileToRead = fileNameReader.readLine();
        String fileRoWrite = fileNameReader.readLine();
        fileNameReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileToRead));
        Pattern worldPattern = Pattern.compile("(\\b\\d+\\b)");
        Matcher worldMatcher;

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileRoWrite));

        while (fileReader.ready()) {
            worldMatcher = worldPattern.matcher(fileReader.readLine());
            while (worldMatcher.find()) {
                fileWriter.write(worldMatcher.group() + " ");
            }
        }
        fileWriter.close();
        fileReader.close();

    }
}