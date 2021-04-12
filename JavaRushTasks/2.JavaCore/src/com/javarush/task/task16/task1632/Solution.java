package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
//        Thread1 thread1 = new Thread1();
//        threads.add(thread1);
//        Thread2 thread2 = new Thread2();
//        threads.add(thread2);
//        Thread3 thread3 = new Thread3();
//        threads.add(thread3);
//        Thread4 thread4 = new Thread4();
//        threads.add(thread4);
//        Thread5 thread5 = new Thread5();
//        threads.add(thread5);
        threads.add(new Thread(new Thread1()));
        threads.add(new Thread(new Thread2()));
        threads.add(new Thread(new Thread3()));
        threads.add(new Thread4());
        threads.add(new Thread(new Thread5()));
    }

    public static void main(String[] args) {
//        threads.add(new Thread1());
//        threads.add(new Thread2());
//        threads.add(new Thread3());
//        threads.add(new Thread4());
//        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException es) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException es) {
                    es.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
    boolean alive = true;


        public void run() {
            while (!isInterrupted()){
//               this.interrupt();
//                interrupt();
            }

        }
        @Override
        public void showWarning() {
           this.interrupt();
//            this.interrupt();
//            alive = false;
        }
    }

    public static class Thread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        public void run() {

//            try {
//                String s;
//                int sum =0;
//                s= reader.readLine();
//                while (!s.equals("N")){
////                    try(Integer.parseInt(s)){//
////                    }
//                    sum = sum + Integer.parseInt(s);
//                }
//                System.out.println(sum);
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }

            while (true) {
                try {
                    String a = reader.readLine();
                    if (!a.equals("N")) {
                        sum += Integer.parseInt(a);
                    } else {
                        System.out.println(sum);
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка в символах!");
                }
            }


        }
    }
}