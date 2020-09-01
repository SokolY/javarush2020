package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] charArr = s.toCharArray();
        for ( int i = 0; i<40; i++) {
            char[] array2 = Arrays.copyOfRange(charArr, i, charArr.length);
            for (Object x : array2) {
                System.out.print(x);

            }

            System.out.println();
        }
//        for (int i = 0; i<40; i ++){
//            System.out.println(s.substring(i, s.length()));
//    }
        //напишите тут ваш код
    }

}

