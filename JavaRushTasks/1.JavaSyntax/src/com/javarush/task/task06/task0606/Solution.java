package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;
//    int j = 0;
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        while (number!=0){
            int digit = number%10;
            if(digit%2 == 0){
                even++;}
            else odd++;
            number = ((number - digit))/10;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
