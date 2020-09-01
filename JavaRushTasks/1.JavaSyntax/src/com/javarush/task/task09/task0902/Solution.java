package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        ArrayList<String> callMethods1 = new ArrayList<>();
        for(StackTraceElement info : stack){
             callMethods1.add(info.getMethodName());
            System.out.println(info.getMethodName());
        }
        System.out.println("Methode1: " + callMethods1);
        return callMethods1.get(2);
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        ArrayList<String> callMethods2= new ArrayList<>();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement info : traceElements){
            callMethods2.add(info.getMethodName());
            System.out.println(info.getMethodName());
        }
        System.out.println("Methode2: " + callMethods2);
        return callMethods2.get(2);
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        ArrayList<String> callMethode3 = new ArrayList<>();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for(StackTraceElement el : elements){
            callMethode3.add(el.getMethodName());
            System.out.println(el.getMethodName());
        }
        System.out.println("Methode3: " + callMethode3);
        return callMethode3.get(2);

    }

    public static String method4() {
        method5();
        ArrayList<String> callMethode4 = new ArrayList<>();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement el : traceElements){
            callMethode4.add(el.getMethodName());
            System.out.println(el.getMethodName());
        }
        System.out.println("Methode4: " + callMethode4);
        return callMethode4.get(2);
        //напишите тут ваш код
    }

    public static String method5() {
        //напишите тут ваш код
        ArrayList<String> callMethode5 = new ArrayList<>();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement el: elements){
            callMethode5.add(el.getMethodName());
            System.out.println(el.getMethodName());
        }
        System.out.println("Methode5: " + callMethode5);
        return callMethode5.get(2);
    }
}
