package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        InputStream inputStream = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1;
        String filename = null;
        ArrayList<Integer> intList = new ArrayList<>();
        try {
            filename = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputStream = new FileInputStream(filename);
            reader1 = new BufferedReader(new FileReader(filename));
//            reader1 = new BufferedReader(new FileReader(filename));
            String text = null;
            while ((text = reader1.readLine()) != null){
                if(Integer.parseInt(text)%2 == 0) {
                    intList.add(Integer.parseInt(text));
                }
            }
            for (int i = 0; i<intList.size()-1; i++){
                int temp;
                for(int j = i+1; j<intList.size(); j++){
                    if (intList.get(j) < intList.get(i)) {
                        temp = intList.get(i);
                        intList.set(i, intList.get(j));
                        intList.set(j, temp);
                    }
                }
            }
            for (int x : intList){
                System.out.println(x);
            }

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            inputStream.close();
        }


    }
}
