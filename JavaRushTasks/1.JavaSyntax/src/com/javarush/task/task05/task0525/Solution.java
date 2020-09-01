package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

import java.util.concurrent.Callable;

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Cat vaska = new Cat();
        Cat murzik = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(vaska);
        System.out.println(murzik);
        System.out.println(dog1);
        System.out.println(dog2);
        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }
    public static class Cat{
        public String toString(){
            return "Cat";
        }
    }
    public static class Dog{
        public String toString(){
            return "Dog";
        }
    }

    //напишите тут ваш код
}
