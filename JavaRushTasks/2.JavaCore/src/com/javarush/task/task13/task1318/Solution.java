package com.javarush.task.task13.task1318;

        import java.io.*;
        import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        String filePath;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            filePath = reader.readLine();
            inputStream = new FileInputStream(filePath);
            buffer = new BufferedInputStream(inputStream);
            while (buffer.available()>0){
                System.out.println(buffer.read());
            }
        } catch (Exception  e) {
            e.printStackTrace();
        }
        finally {
            System.out.println();
            System.out.println("Final Execution");
            inputStream.close();
            buffer.close();
            reader.close();
        }

    }
}