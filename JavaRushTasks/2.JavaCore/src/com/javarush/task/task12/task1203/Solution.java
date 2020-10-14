package com.javarush.task.task12.task1203;

/* 
Кесарю — кесарево
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            System.out.println("Created new Pet");
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        public Cat getChild(){
//            System.out.println("Created new cat");
            return  new Cat();
        }
    }

    public static class Dog extends Pet {
        public Dog getChild(){
//            System.out.println("Created new dog");
            return new Dog();
        }
    }
}
