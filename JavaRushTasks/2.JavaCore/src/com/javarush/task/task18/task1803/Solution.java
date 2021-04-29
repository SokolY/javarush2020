package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long[] arrBytes = new long[256];
        while (fis.available()>0){
            arrBytes[fis.read()]++;
        }


        long maxRepeat = 0;
        for (int i = 0; i<arrBytes.length; i++){
            if (arrBytes[i]>maxRepeat) maxRepeat = arrBytes[i];
        }
        for (int j = 0; j<arrBytes.length; j++){
            if (arrBytes[j] == maxRepeat)
                System.out.print(j + " ");
        }


//        for (int i = 0; i < arrBytes.length-1; i++){
//            for(int j= i+1; j<arrBytes.length; j++){
//                long min;
//                if (arrBytes[i]<arrBytes[j]){
//                    min = arrBytes[i];
//                    arrBytes[i] = arrBytes[j];
//                    arrBytes[j] = min;
//                }
//            }
//        }
//        long maxreapit = arrBytes[0];
//        for (int k = 0; k<arrBytes.length;k++){
//            if(arrBytes[k] >= maxreapit){
//                System.out.print(arrBytes[k]+ " ");
//            }
//        }
//        System.out.println(arrBytes[0]);
        fis.close();

    }
}
