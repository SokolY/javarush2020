package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Map<String, Integer> months = new HashMap<String, Integer>();
        months.put("January" , 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String expMonth = in.readLine();
        int monthNum = 0;
//        Map<String, Integer> iter = months.entrySet();
        Iterator<Map.Entry<String, Integer>> it = months.entrySet().iterator();
//        Iterator it = months.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            if (pair.getKey().equals(expMonth)){
                monthNum = (int)pair.getValue();
                break;
            }
        }


        for (Map.Entry<String, Integer> pait : months.entrySet()){
            if (pait.getKey().equals(expMonth)){
                monthNum = pait.getValue();
                break;
            }
        }
        System.out.println(expMonth + " is the " + monthNum + " month");
    }
}
