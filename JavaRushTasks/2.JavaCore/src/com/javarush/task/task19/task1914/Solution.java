package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultStream = System.out;
        ByteArrayOutputStream outputArray = new ByteArrayOutputStream();
        PrintStream updatedStream = new PrintStream(outputArray);
        System.setOut(updatedStream);
        testString.printSomething();
        String result = outputArray.toString();
        String[] splitedString = result.split(" ");
        int a = Integer.parseInt(splitedString[0]);
        int b = Integer.parseInt(splitedString[2]);
        int intResult = 0;
        if (splitedString[1].equals("+")){
            intResult = a + b;
        }
        else if (splitedString[1].equals("-")){
            intResult = a - b;
        }
        else if (splitedString[1].equals("*")){
            intResult = a * b;
        }
        System.setOut(defaultStream);
        System.out.println(result);
        System.out.println(intResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

