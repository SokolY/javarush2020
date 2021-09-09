package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        FileWriter fw = new FileWriter(reader.readLine());
        ArrayList<Integer> buffer = new ArrayList<>();
        while (fr.ready()){
            int data1 = fr.read();
            fw.write(fr.read());
        }
//        while (fr.ready()){
//            int data = fr.read();
//            buffer.add(data);
//        }
//        for (int i = 1; i < buffer.size(); i++){
//            if(i%2 == 0){
//                fw.write(buffer.get(i));
//            }
//
//        }
        reader.close();
        fr.close();
        fw.close();
    }
}
