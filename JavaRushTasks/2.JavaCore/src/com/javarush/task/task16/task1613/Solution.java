package com.javarush.task.task16.task1613;

/* 
Big Ben clock
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 55);
        Thread.sleep(14000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            //add your code here - добавь код тут
//            do{

                Thread.sleep(1000);
                if (hours == 0 && minutes == 0 && seconds == 0) {
                    System.out.println(String.format("В г. %s сейчас полночь!", cityName));
                } else {
                    System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
                }
//                if(seconds == 59 && minutes == 59 && hours == 23){
//                    seconds = -1;
//                    minutes = -1;
//                    hours = -1;
//                    hours++;
//                    minutes++;
//                    seconds++;
////                    continue;
//                }

                if(seconds == 59) {
                    if(minutes == 59){
                        seconds = -2;
                        minutes = -1;
                        if(hours == 23){
                            hours = -1;
                        }
                        hours++;
//                        minutes++;
//                    seconds++;
//                    continue;
                    }
                    minutes++;
                    seconds = -1;
                }
             this.seconds++;
//            }while (this.seconds< 60 && this.seconds>=0);

        }
    }
}
