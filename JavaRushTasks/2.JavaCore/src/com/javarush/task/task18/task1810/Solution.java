package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        while (true) {
            FileInputStream inpfile = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
            byte[] bytes = new byte[inpfile.available()];
            if (bytes.length < 1000) {
                inpfile.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
