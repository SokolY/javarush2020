package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Edible, Eat{
        @Override
        public void move(){
            System.out.println("Tom runs");
        }

        @Override
        public void beEaten(){
            System.out.println("Tom was eaten");
        }

        @Override
        public void eat(){
            System.out.println("Tom eats");
        }

    }
    public class Dog implements Movable, Eat {
        @Override
        public void move(){
            System.out.println("Snoopy moves");
        }

        @Override
        public void eat(){
            System.out.println("Snoopy Eats");
        }
    }
    public class Mouse implements Edible, Movable{
        @Override
        public void beEaten(){
            System.out.println("Mouse was eaten");
        }

        @Override
        public void move(){
            System.out.println("Mouse runs");
        }

    }
}