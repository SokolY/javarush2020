package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.FileNotFoundException;
import java.util.MissingFormatArgumentException;

public class Solution {
    public static void main(String[] args) {
//        MyException m = new MyException();

    }

    static class MyException extends FileNotFoundException {
        public static void methode1(){
            System.out.println("Me1");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    static class MyException2 extends  FileNotFoundException{

    }

    static class MyException3 extends ArithmeticException  {
        public static void methode3(){
            System.out.println("M3");
            throw new RuntimeException();
        }
    }

    static class MyException4 extends ArithmeticException {
    }
}

