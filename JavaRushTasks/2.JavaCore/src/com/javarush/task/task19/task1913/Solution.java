package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream defaultStream = System.out;
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        PrintStream toArray = new PrintStream("d://to.txt");
        System.setOut(toArray);
        testString.printSomething();
        String output = byteArray.toString().replaceAll("\\D", "");
        System.setOut(defaultStream);
        System.out.println(output);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
