package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> myList = new ArrayList<Integer>();
//        Array<Integer> myList = new Array<Integer>[5];
//        int arey[] = new int[5];
//        for(int i = 0; i<5; i++) {
//            int num = Integer.parseInt(reader.readLine());
//            arey[i] = num;
//        }
        for(int i = 0; i<5; i++) {
            int num = Integer.parseInt(reader.readLine());
            myList.add(num);
        }
        Collections.sort(myList);
//        myList.sort();
//        Arrays.sort(arey);
//        for (int i: arey
//             ) {
//            System.out.println(i);
//
//        }
        for (int i: myList
        ) {
            System.out.println(i);

        }
        //напишите тут ваш код
    }
}
