package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
//        StackTraceElement[] element = Thread.currentThread().getStackTrace();
//        System.out.println(element);
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
        System.out.println("method1");
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        System.out.println("method2");
        StackTraceElement[] el = Thread.currentThread().getStackTrace();
//        StackTraceElement [] el = Thread.currentThread().getStackTrace();
        return el;
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        System.out.println("method3");
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        System.out.println("method4");
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        System.out.println("method5");
        StackTraceElement[] el = Thread.currentThread().getStackTrace();
        for (StackTraceElement e : el){
            System.out.println(e);
        }
        return el;

    }
}
