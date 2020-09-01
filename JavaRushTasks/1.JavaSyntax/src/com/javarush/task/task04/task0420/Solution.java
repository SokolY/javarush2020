package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int min;
        if (num1 <= num2 && num1 <= num3)  {
            min = num1;
        }
        else if(num2<=num1 && num2 <= num3){
            min = num2;
        }
        else
            min = num3;
        int aver;
        if ((num1>= num2 && num1<=num3)||(num1>=num3 && num1<= num2)){
            aver = num1;
        }
        else if ((num2>=num1 && num2<=num3)||(num2<=num1 && num2 >= num3))
            aver = num2;
        else
            aver = num3;
        int max;
        if(num1>=num2 && num1 >= num3){
            max = num1;
        }
        else if(num2>= num1 && num2 >= num3){
            max = num2;
        }
        else {
            max = num3;
        }
//        System.out.println(min + ' ' + aver + " " + max);
        System.out.println(max + " " +aver+ " " + min);
    }

}
