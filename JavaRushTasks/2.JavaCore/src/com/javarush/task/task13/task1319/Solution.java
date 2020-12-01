package com.javarush.task.task13.task1319;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
//        BufferedWriter writer = null;
        String st = null;
//            while (true) {
//                st = reader.readLine();
//                list.add(st);
//                if (st.equals("exit")) {
//                    break;
//                }
//            }
        while (true) {
            st = reader.readLine();
            bufferedWriter.write(st);
            bufferedWriter.newLine();
            if (st.equals("exit")) {
                break;
            }
        }


        reader.close();
        bufferedWriter.close();

    }
}
