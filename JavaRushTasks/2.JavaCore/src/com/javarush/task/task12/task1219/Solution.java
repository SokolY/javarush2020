package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun,  CanSwim{


        public void run(){

        }
        public void swim(){

        }
    }

    public class Duck implements CanSwim, CanRun, CanFly{
        public void swim(){};
        @Override
        public void run(){};
        @Override
        public void fly(){

        };
    }

    public class Penguin implements CanSwim, CanRun{
        public void swim(){};

        @Override
        public void run(){};


    }

    public class Airplane implements CanRun, CanFly{
        public void run(){};
        @Override
        public void fly(){};
    }
}
