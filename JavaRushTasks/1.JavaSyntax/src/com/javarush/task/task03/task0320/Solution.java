package com.javarush.task.task03.task0320;

/* 
Скромность украшает программиста
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputSteamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputSteamReader);
        String name = bufferedReader.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
