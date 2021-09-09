package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileName = reader.readLine();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        PrintStream defaultStream = System.out;
        ByteArrayOutputStream outputArray = new ByteArrayOutputStream();
        PrintStream modifiedStream = new PrintStream(outputArray);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        System.setOut(modifiedStream);
        testString.printSomething();
        fileOutputStream.write(outputArray.toByteArray());
        String output = outputArray.toString();
        System.setOut(defaultStream);
        System.out.println(output);
        fileOutputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

