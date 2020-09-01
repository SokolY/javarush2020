package com.javarush.task.task04.task0407;

/* 
Кошки во Вселенной
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //напишите тут ваш код
//        cat1.creatCat();
        Cat cat2 = new Cat();
        //напишите тут ваш код
        cat2.creatCat();
        System.out.println("The cat count is " + Cat.count);
        cat2.jump();
        cat1.mew();
    }

    public static class Cat {
        public static int count = 0;
        public void creatCat(){
            count++;
        }
        public void jump(){
            System.out.println("Приг-приг");
        }
        public void mew() {
            System.out.println("Мяу");
        }
    }
}