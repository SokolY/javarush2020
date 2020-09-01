package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        if((num<10&&num>=1) && num%2 == 0)
            System.out.println("четное однозначное число");
        else if((num<10 && num>=1) && num%2!=0){
            System.out.println("нечетное однозначное число");
        }
       else if ((num>=10 && num<100)&&num%2 ==0){
            System.out.println("четное двузначное число");
        }
        else if ((num>=10&&num<100)&&num%2!=0){
            System.out.println("нечетное двузначное число");
        }
        else if((num>=100&&num<1000)&&num%2==0){
            System.out.println("четное трехзначное число");
        }
        else if((num>=100&&num<1000)&&num%2!=0){
            System.out.println("нечетное трехзначное число");
        }
    }
}
