package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        PrintStream toArray = new PrintStream(byteArray);
        System.setOut(toArray);
        testString.printSomething();
        String result = byteArray.toString().replace("te", "??");
        System.setOut(out);
//        StringBuilder stringBuilder = new StringBuilder(result.replaceAll("te", "??"));
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
