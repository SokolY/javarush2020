package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {
//        Dog barsic = new Dog();
        Duck duck1 = new Duck();
        duck1.eat();
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat{
        public void move(){
            System.out.println("Dog runs");
        }

        public void eat(){
            System.out.println("Dog eats");
        }
    }

    public static class Duck implements CanMove, CanFly, CanEat{
        @Override
        public void move(){
            System.out.println("Duck moves");
        }

        @Override
        public void fly(){
            System.out.println("Duck moves");
        }

        @Override
        public void eat(){
            System.out.println("Duck eats");
        }
    }

    public class Car implements CanMove{
        public void move(){
            System.out.println("Cars move");
        }
    }
//Because
    public class Airplane implements CanFly, CanMove{
        @Override
        public void fly(){
            System.out.println(" Airplane flies");
        }

        public void move(){
            System.out.println("Airplane moves");
        }
    }
}
