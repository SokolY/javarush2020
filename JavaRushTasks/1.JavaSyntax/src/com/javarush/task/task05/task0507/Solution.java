package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        float sum =0;
        int counter = 0;
        boolean isContinue = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(isContinue){
            float num = Float.parseFloat(reader.readLine());
            if (num == -1) {
                isContinue = false;
                break;
            }
            sum += num;
            counter++;
        }
//        float avereage = sum/counter;
//        System.out.println(sum);
//        System.out.println(counter);

        System.out.println(sum/counter);
    }
}

