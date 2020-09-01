package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Map.Entry.comparingByKey;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
//        Map<Character, Integer> lettersCountMap = new TreeMap<>();
        Map<Character, Integer> lettersCountMap = new LinkedHashMap<>();
        int counter;
        char[] chars;
        for (char al : alphabet) {
            counter = 0;
            for (String string : list) {
                chars = string.toCharArray();
                for (char i : chars) {
                    if (i == al) {
                        counter++;
                    }
                }
            }
            lettersCountMap.put(al, counter);
        }
//        System.out.println("counter is: " + counter);
//        System.out.println(lettersCountMap);
        for (Map.Entry<Character, Integer> pairs : lettersCountMap.entrySet()) {
            System.out.println(pairs.getKey() + " " + pairs.getValue());

        }


//        for (char a : alphabet){
//            for (Map.Entry<Character, Integer> pairs : lettersCountMap.entrySet()){
//            if(a == pairs.getKey()){
//                System.out.println(a + " " + pairs.getValue());
//            }
//    }}


    }
}
