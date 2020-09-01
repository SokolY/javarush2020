package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int total = Integer.parseInt(reader.readLine());
        if(total<=0){

        }
        else {
            maximum = Integer.parseInt(reader.readLine());
            for(int i = 2; i<= total; i++){
                int num = Integer.parseInt(reader.readLine());
                if(num>maximum)
                    maximum =num;
            }
            System.out.println(maximum);
        }

        //напишите тут ваш код


    }
}
