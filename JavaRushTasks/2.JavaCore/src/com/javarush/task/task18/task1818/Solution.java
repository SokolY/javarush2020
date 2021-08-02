package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//                FileInputStream fileInputStream = new FileInputStream("D:\\from.txt");
//        FileInputStream fileInputStream2 = new FileInputStream("D:\\from2.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream("D:\\to.txt", true);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String inFile= reader.readLine();
//        String inFile2 = reader.readLine();
//        String outFile = reader.readLine();
//        reader.close();
//
//        FileInputStream fileInputStream = new FileInputStream(inFile);
//        FileInputStream fileInputStream2 = new FileInputStream(inFile2);
//        FileOutputStream fileOutputStream = new FileOutputStream(outFile, false);
//        int i;
//
//        while((i = fileInputStream2.read())!= -1){
//            fileOutputStream.write(i);
//        }
//        while((i = fileInputStream2.read())!= -1){
//            fileOutputStream.write(i);
//        }
//        fileOutputStream.close();
//        fileInputStream.close();
//        fileInputStream2.close();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (
                FileOutputStream fos = new FileOutputStream(reader.readLine());
                FileInputStream fis2 = new FileInputStream(reader.readLine());
                FileInputStream fis3 = new FileInputStream(reader.readLine())) {
            byte[] buffer = new byte[fis2.available()];  // создали массив размером с файл.
            int count = fis2.read(buffer);
            fos.write(buffer, 0, count);


            buffer = new byte[fis3.available()];  // создали массив размером с файл.
            int count2 = fis3.read(buffer);
            fos.write(buffer, 0, count2);


        }
    }
}
