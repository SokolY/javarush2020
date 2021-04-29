package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inpfile = null;
        try {
            inpfile = new FileInputStream(reader.readLine());
//            byte[] buffer = new byte[inpfile.available()];
//            inpfile.read(buffer, 0, inpfile.available());
//            byte max = buffer[0];
//            for (int i  = 0; i<buffer.length; i++){
////                if (buffer[i]<max) max = buffer[i];
//            }
            int max = inpfile.read();
            while (inpfile.available()>0){
                int current = inpfile.read();
                        if(current>max)
                        {
                            max = current;
                        }
            }
            System.out.println(max);
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        finally {
            inpfile.close();
        }

    }
}
