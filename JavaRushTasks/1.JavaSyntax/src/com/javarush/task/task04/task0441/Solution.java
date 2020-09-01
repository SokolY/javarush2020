package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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
        System.out.println(aver(num1, num2, num3));

    }
    public static int aver(int a, int b, int c){
        if(((a>=b) && (a<=c))||(((a<=b) && (a>=c))))
            return a;
        else if(((b>a)&&(b<c))||((b<a)&&(b>c)))
            return b;
        else
            return c;
    }
}
