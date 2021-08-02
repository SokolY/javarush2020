package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        int counter = 0;
        int spaceCoumter = 0;
        while (fileReader.ready()){
            int rd = fileReader.read();
                counter++;
            if ((char)rd == ' '){
                spaceCoumter++;
            }

        }
        double value = 1.0*spaceCoumter/counter*100;
//        System.out.println(counter);
//        System.out.println(spaceCoumter);
//        System.out.println();
//        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
//        String result = decimalFormat.format(value);
        System.out.printf("%.2f", (float)value);
        fileReader.close();
    }
}
