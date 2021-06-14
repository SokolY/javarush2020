package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    static String str = "C.tup.result.txt";
    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);
//        String[] substr;
//        String separator = ".";
//        substr = str.split(separator);
//        if (!substr[substr.length-1].equals("txt")){
//            super.close();
//            throw new UnsupportedFileNameException();
//
//        }
        if (!fileName.endsWith(".txt")){
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
        String[] substr;
        String separator = "\\.";
        substr = str.split(separator);
        System.out.println(substr.length);
        for(int i = 0; i < substr.length; i++) {
            System.out.println(substr[i]);
        }
    }
}

