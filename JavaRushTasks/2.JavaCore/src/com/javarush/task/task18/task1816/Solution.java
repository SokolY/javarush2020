package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

            FileReader fileReader = new FileReader(args[0]);
            int rd;
            int counter =0;
//            while ((i=fileReader.read())!=-1){
            while (fileReader.ready()){
                rd = fileReader.read();
                    if ((rd > 64 && rd < 91 || rd>96 &&rd<123)){
                        counter++;
                    }
            }

        System.out.println(counter);
        fileReader.close();

    }
}
