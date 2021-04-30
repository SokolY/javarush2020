package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        FileInputStream inpfile = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        FileOutputStream outFile1 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        FileOutputStream outFile2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileInputStream inpfile = new FileInputStream("d://t.txt");
        FileOutputStream outFile1 = new FileOutputStream("d://out1.txt");
        FileOutputStream outFile2 = new FileOutputStream("d://out2.txt");

//        ArrayList<Integer> byt = new ArrayList<>();
////        while (inpfile.available() > 0) {
////            byt.add(inpfile.read());
////        }
////        if (byt.size() % 2 != 0) {
////            for (int i = 0; i < (byt.size() / 2)+1; i++) {
////                outFile1.write(byt.get(i));
////            }
////            for (int j = byt.size()/2+1; j < byt.size(); j++) {
////                outFile2.write(byt.get(j));
////            }
//////            int i = 0;
//////            while (i!=byt.size()/2+1){
//////                outFile1.write(byt.get(i));
//////                i++;
//////            }
////
////        }
////        else{
////            for (int i = 0; i < byt.size() / 2; i++) {
////                outFile1.write(byt.get(i));
////            }
////            for (int j = byt.size()/2; j < byt.size(); j++) {
////                outFile2.write(byt.get(j));
////            }
////        }


        int a = inpfile.available();
        byte[] buffer = new byte[(a+1)/2];
        int count = inpfile.read(buffer);
        outFile1.write(buffer, 0, count);

        buffer = new byte[a/2];
        count = inpfile.read(buffer);
        outFile2.write(buffer, 0, count);

        inpfile.close();
        outFile1.close();
        outFile2.close();
    }
}
