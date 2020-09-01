package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in = reader.readLine();
        char[] chars = in.toCharArray();
        char spase = ' ';
        ArrayList<Character> golosni = new ArrayList<>();
        ArrayList<Character> prigolosni = new ArrayList<>();
        for(char x : chars){
           if(isVowel(x)){
               golosni.add(x);
           }
           else {
               if(!(x== ' ')){
                   prigolosni.add(x);
               }

           }

        }
        for (char g : golosni){
            System.out.print(g + " ");
        }
        System.out.println();
        for (char p : prigolosni){
            System.out.print(p + " ");
        }
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}