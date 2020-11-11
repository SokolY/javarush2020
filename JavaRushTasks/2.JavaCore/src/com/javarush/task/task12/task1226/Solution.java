package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        duck1.fly();
    }
    public interface CanFly{
        void fly();
    }
    public interface CanClimb{
        void climb();
    }

    public interface CanRun{
        void run();
    }
    public  class Cat implements CanClimb, CanRun{
        @Override
        public void climb(){
            System.out.println("Cats climbing");
        }

        @Override
        public void run(){
            System.out.println("Cat runs");
        }
    }

    public class Dog implements CanRun{
        public void run(){
        };
    }

    public class Tiger extends Cat{
    }

    public static class Duck implements CanFly, CanRun{
        public void fly(){
            System.out.println("Duck flying");
        }
        @Override
        public void run(){

        }
    }
}
