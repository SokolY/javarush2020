package com.javarush.task.task04.task0404;

/* 
Учет котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        Cat.catsCount++;

    }

    public static void main(String[] args) {
        Cat borya = new Cat();
        Cat.addNewCat();
//        Cat cat2 = new Cat();
        Cat.addNewCat();
        System.out.println(Cat.catsCount);

    }
}
