package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String st = reader.readLine();
            if (st.equals("exit")){
                break;
            }
            try {
                if (st.contains(".")){
                        double dnum = Double.parseDouble(st);
                        print(dnum);
                        continue;
                    }
                int inum = Integer.parseInt(st);
                if (inum>0 && inum<128){
                    short snum = (short)inum;
                    print(snum);
                }
                else {
                    print(inum);
                }
            }
            catch (NumberFormatException ex){
//                if (st.contains(".")){
//                    try {
//                        double dnum = Double.parseDouble(st);
//                        print(dnum);
//                    }
//                    catch (NumberFormatException ex1){
//                        print(st);
//                    }
//                }
                print(st);
            }


        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
