package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int num1 = Integer.parseInt(in.readLine());
//        int num2 = Integer.parseInt(in.readLine());
//        int num3 = Integer.parseInt(in.readLine());
       int pos = 0;
       int neg = 0;
//       if(num1>0){
//           pos +=1;
//       }
//       else if (num1 <0){
//           neg +=1;
//       }
//       if (num2>0){
//           pos +=1;
//       }
//       else if(num2<0){
//           neg+=1;
//       }
//       if(num3>0){
//           pos +=1;
//       }
//       else if(num3<0){
//           neg+=1;
//       }
        for(int i = 0; i<3; i++){
            int nb = Integer.parseInt(in.readLine());
            if (nb>0){
                pos++;
            }
            if ( nb<0){
                neg++;
            }
        }
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);
    }
}
