package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        boolean isTrue = true;
//        while (isTrue){
//            int num = Integer.parseInt(reader.readLine());
//            if(num == -1){
//                isTrue = false;
//            }
//            sum += num;
//        }
        while (true){
            int num = Integer.parseInt(reader.readLine());
            if(num == -1){
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
