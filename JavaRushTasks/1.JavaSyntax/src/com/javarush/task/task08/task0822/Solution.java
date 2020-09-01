package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
//        Collections.sort(array);
//       Integer min = array.get(0);
//       return min;
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> intList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(reader.readLine());
        int i = 0;
        while (i<amount){
            intList.add(Integer.parseInt(reader.readLine()));
            i++;
        }
        // Создать и заполнить список тут
        return intList;
    }
}
