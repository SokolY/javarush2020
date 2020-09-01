package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] els = Thread.currentThread().getStackTrace();
//        System.out.println("met1 " + els[2].getLineNumber());
        return  els[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] els = Thread.currentThread().getStackTrace();
//        System.out.println("met2 " + els[2].getLineNumber());
        return  els[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] els = Thread.currentThread().getStackTrace();
//        System.out.println("met3 " + els[2].getLineNumber());
        return  els[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] els = Thread.currentThread().getStackTrace();
//        System.out.println("met4 " + els[2].getLineNumber());
        return  els[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] els = Thread.currentThread().getStackTrace();
//        for (StackTraceElement item : els){
//            System.out.println("met5: " + item.getLineNumber());
//        }
        return  els[2].getLineNumber();
    }
}
